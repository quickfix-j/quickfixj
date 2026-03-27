# QuickFIX/J Threading Model

## 1. Overview

QuickFIX/J uses [Apache MINA](http://mina.apache.org/) for non-blocking I/O. The threading model for message processing is controlled by the `EventHandlingStrategy` interface (`quickfix.mina.EventHandlingStrategy`), with two concrete implementations:

- **`SingleThreadedEventHandlingStrategy`** — one thread processes messages for all sessions (`SocketAcceptor`, `SocketInitiator`)
- **`ThreadPerSessionEventHandlingStrategy`** — one thread per session processes messages (`ThreadedSocketAcceptor`, `ThreadedSocketInitiator`)

Both strategies co-exist with the **timer thread**, which is always present and always calls `Session.next()` (no-arg) on a 1-second schedule, regardless of which event-handling strategy is in use.

---

## 2. Connector Classes and Their Strategy

| Connector class | Event handling strategy | Thread name(s) |
|---|---|---|
| `SocketAcceptor` | `SingleThreadedEventHandlingStrategy` | `QFJ Message Processor` |
| `SocketInitiator` | `SingleThreadedEventHandlingStrategy` | `QFJ Message Processor` |
| `ThreadedSocketAcceptor` | `ThreadPerSessionEventHandlingStrategy` | `QF/J Session dispatcher: <sessionID>` |
| `ThreadedSocketInitiator` | `ThreadPerSessionEventHandlingStrategy` | `QF/J Session dispatcher: <sessionID>` |

---

## 3. Single-Threaded Model (`SingleThreadedEventHandlingStrategy`)

**Class:** `quickfix.mina.SingleThreadedEventHandlingStrategy`  
**Source:** `quickfixj-core/src/main/java/quickfix/mina/SingleThreadedEventHandlingStrategy.java`

- A single `BlockingQueue<SessionMessageEvent>` holds events from **all** sessions.
- One background thread named **`QFJ Message Processor`** (a daemon thread) drains the queue and calls `session.next(message)` for each event via `SessionMessageEvent.processMessage()`.
- The thread is started via `blockInThread()`, which creates a `ThreadAdapter` wrapping the `block()` loop.
- `onMessage()` wraps incoming messages into a `SessionMessageEvent` and puts them on the shared queue.
- The `block()` loop polls the queue with a timeout (`THREAD_WAIT_FOR_MESSAGE_MS`) so it can periodically check the `isStopped` flag.
- On stop, remaining queued messages are drained and processed before the thread exits.
- The `getQueueSize(SessionID)` method returns the total queue size (single queue for all sessions — there is no per-session view).

**Key point for application developers:** Because all sessions share a single processing thread, a slow `fromApp()` callback will delay processing for **all** other sessions.

---

## 4. Thread-per-Session Model (`ThreadPerSessionEventHandlingStrategy`)

**Class:** `quickfix.mina.ThreadPerSessionEventHandlingStrategy`  
**Source:** `quickfixj-core/src/main/java/quickfix/mina/ThreadPerSessionEventHandlingStrategy.java`

- A `ConcurrentHashMap<SessionID, MessageDispatchingThread>` maps each session to its own dispatcher thread.
- On the first `onMessage()` call for a given session, a new `MessageDispatchingThread` is created and started via `startDispatcherThread()`.
- Each `MessageDispatchingThread` has its own `BlockingQueue<Message>` (or watermark-tracked queue) and loops calling `session.next(message)`.
- Thread name: **`QF/J Session dispatcher: <BeginString>:<SenderCompID>/<TargetCompID>`**
- The `Executor` can be customised via `setExecutor()`. The default is `DedicatedThreadExecutor`, which creates a plain `new Thread(command, name).start()`.
- On stop, `stopDispatcherThreads()` enqueues `END_OF_STREAM` to every dispatcher, sets `stopping=true`, and waits (polling every 100 ms) until all dispatchers report `isStopped`.
- After a dispatcher drains its remaining queue on shutdown, it removes itself from the `dispatchers` map.

**Key point for application developers:** Since each session has its own thread, a slow `fromApp()` for one session does **not** block others. However, your `Application` implementation **must be thread-safe** if it shares state across sessions.

---

## 5. The Timer Thread and `Session.next()`

This is a critical part of the threading model that is **orthogonal** to the message-processing strategies above.

**Class:** `quickfix.mina.SessionConnector`  
**Source:** `quickfixj-core/src/main/java/quickfix/mina/SessionConnector.java`

### 5.1 The `QFJ Timer` Thread

A single `ScheduledExecutorService` (a shared static instance using a `QFTimerThreadFactory`) runs a `SessionTimerTask` at a fixed rate of **every 1000 ms**.

```java
// SessionConnector.java
private static class QFTimerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "QFJ Timer");
        thread.setDaemon(true);
        return thread;
    }
}
```

The timer is started by `startSessionTimer()`:

```java
protected void startSessionTimer() {
    if (checkSessionTimerRunning()) {
        return;
    }
    Runnable timerTask = new SessionTimerTask();
    if (shortLivedExecutor != null) {
        timerTask = new DelegatingTask(timerTask, shortLivedExecutor);
    }
    sessionTimerFuture = SCHEDULED_EXECUTOR.scheduleAtFixedRate(timerTask, 0, 1000L,
            TimeUnit.MILLISECONDS);
}
```

Only one timer is ever started per connector. If `startSessionTimer()` is called again while the timer is still running (e.g. during `createDynamicSession()`), the existing timer is reused.

### 5.2 `SessionTimerTask` Iterates All Sessions and Calls `Session.next()`

```java
private class SessionTimerTask implements Runnable {
    @Override
    public void run() {
        try {
            for (Session session : sessions.values()) {
                try {
                    session.next();
                } catch (IOException e) {
                    LogUtil.logThrowable(session.getLog(), "Error in session timer processing", e);
                }
            }
        } catch (Throwable e) {
            log.error("Error during timer processing", e);
        }
    }
}
```

Even though each session may have its own dispatcher thread (in the thread-per-session model), the timer thread also calls `session.next()` directly on every session. This is independent of which `EventHandlingStrategy` is in use.

### 5.3 What Does `Session.next()` (No-arg) Do?

`Session.next()` is called from the timer, **not** from user code. Its Javadoc states:

> Called from the timer-related code in the acceptor/initiator implementations. This is not typically called from application code.

Its responsibilities (from `Session.java`):

1. **Checks if the session is enabled.** If disabled and still logged on, it initiates a Logout.
2. **Checks session schedule.** If outside the configured session time window, it may reset sequence numbers or disconnect. This check is throttled to once per second.
3. **Returns early if not connected** (`hasResponder()` is false).
4. **Handles logon state:** If logon has not been received, it may send a Logon (for initiators) or detect a logon timeout.
5. **Checks logout timeout** if a logout has been sent.
6. **Heartbeat management:**
   - If `HeartBtInt == 0`: returns (no heartbeat management).
   - If timed out waiting for a heartbeat: disconnects (unless `DisableHeartBeatCheck=Y`).
   - If a TestRequest is needed: sends a TestRequest (`generateTestRequest("TEST")`).
   - If a Heartbeat is needed: sends a Heartbeat (`generateHeartbeat()`).

The full flow:

```
QFJ Timer thread (every 1 second)
  └─► SessionTimerTask.run()
        └─► for each Session in sessions.values():
              └─► Session.next()
                    ├─ check enabled
                    ├─ check session schedule / reset
                    ├─ check hasResponder()
                    ├─ check logon state (send Logon if initiator)
                    ├─ check logout timeout
                    └─ heartbeat management
                         ├─ isTimedOut()          → disconnect
                         ├─ isTestRequestNeeded() → send TestRequest
                         └─ isHeartBeatNeeded()   → send Heartbeat
```

### 5.4 The Overloaded `Session.next(Message)` — Called by Dispatchers

The `Session.next(Message message)` overload is what `MessageDispatchingThread` and `SessionMessageEvent` call with an actual FIX message. This processes the received message (validates, dispatches to `fromAdmin` / `fromApp`, handles sequence numbers, etc.). This is **distinct** from the no-arg `Session.next()` used by the timer.

---

## 6. Thread Interaction Summary

```
┌─────────────────────────────────────────────────────────────────────────┐
│                         MINA I/O Threads                                │
│       (NIO selector threads, named "NioProcessor-N")                    │
│  Receive raw bytes → decode FIX message → call EventHandlingStrategy    │
└──────────────────────────────┬──────────────────────────────────────────┘
                               │ onMessage(session, message)
           ┌───────────────────┴────────────────────┐
           │                                        │
    SingleThreaded                          ThreadPerSession
    ──────────────                          ────────────────
  One shared queue                       Per-session queue
  One "QFJ Message Processor"            One "QF/J Session dispatcher:
  thread calls                           <sessionID>" thread per session
  session.next(msg)                      calls session.next(msg)

           Both strategies co-exist with the Timer Thread:

┌─────────────────────────────────────────────────────────────────────────┐
│                    QFJ Timer Thread (daemon)                            │
│  ScheduledExecutorService fires every 1000ms                            │
│  SessionTimerTask iterates ALL sessions → calls Session.next()          │
│  (handles heartbeats, logon, session schedule, timeouts)                │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## 7. Queue Capacity and Back-Pressure

Both strategies support configurable queue capacity:

- **Fixed capacity:** `new SingleThreadedEventHandlingStrategy(connector, queueCapacity)` — bounded `LinkedBlockingQueue`. Producers block when full (back-pressure).
- **Watermark-based:** `new SingleThreadedEventHandlingStrategy(connector, lowerWatermark, upperWatermark)` — uses `QueueTrackers.newMultiSessionWatermarkTracker(...)`. Flow control is applied per-session within the shared queue.
- Same two options exist for `ThreadPerSessionEventHandlingStrategy`, with `newSingleSessionWatermarkTracker` per session.

---

## 8. Custom `Executor` Injection

Both strategies accept a custom `java.util.concurrent.Executor` via `setExecutor(executor)`, called during `start()` from the connector. This allows integration with application-managed thread pools (e.g. virtual threads in Java 21+):

```java
// Example: use virtual threads for session dispatchers (Java 21+)
ThreadedSocketAcceptor acceptor = new ThreadedSocketAcceptor(...);
acceptor.start(); // internally calls eventHandlingStrategy.setExecutor(longLivedExecutor)
```

The `longLivedExecutor` is provided by `SessionConnector` and can be customised. If no executor is set, `DedicatedThreadExecutor` creates a plain `new Thread(...)` per session/strategy.

---

## 9. Thread Safety Implications for Application Developers

- **`SocketAcceptor` / `SocketInitiator` (single-threaded):** The `Application` callbacks (`fromApp`, `fromAdmin`, etc.) are called from the single `QFJ Message Processor` thread. No concurrent calls to the same session. However, `Session.next()` (timer) runs concurrently from the `QFJ Timer` thread — it does not call application callbacks but it does send messages on the wire.
- **`ThreadedSocketAcceptor` / `ThreadedSocketInitiator` (thread-per-session):** Each session has its own dispatcher thread. Callbacks for **different sessions** may execute concurrently. Your `Application` implementation **must be thread-safe** if it shares state across sessions.
- In both models, the `QFJ Timer` thread runs concurrently with message-processing threads and calls `Session.next()` (no-arg), which may send heartbeats or disconnect. `Session` internally synchronizes on `this` to protect shared state.

---

*See also: [`quickfixj-core/src/main/doc/usermanual/usage/threading.html`](../quickfixj-core/src/main/doc/usermanual/usage/threading.html) for the HTML version of this document.*
