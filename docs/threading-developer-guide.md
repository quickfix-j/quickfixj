# QuickFIX/J Threading Model — Developer Guide

QuickFIX/J provides two threading strategies for processing FIX messages. The choice of strategy
affects how your application handles concurrent sessions and what thread-safety guarantees you must
provide.

## Threading Strategies

### Single-Threaded Strategy

**Classes:** `SocketAcceptor` / `SocketInitiator`

All sessions share a single message-processing thread (named `QFJ Message Processor`). Incoming
messages from all sessions are placed in a shared queue and dispatched one at a time by this thread.

This means your `Application` callbacks (`fromApp`, `fromAdmin`, etc.) are always invoked from the
same thread, so you do not need to make your application code thread-safe with respect to concurrent
session callbacks. However, a slow callback will delay message processing for all other sessions.

**Use when:**
- You have a small number of sessions.
- Simplicity and predictable, sequential message processing are more important than throughput.
- You want to avoid the complexity of thread-safe application code.

### Thread-Per-Session Strategy

**Classes:** `ThreadedSocketAcceptor` / `ThreadedSocketInitiator`

Each session gets its own dedicated message-dispatching thread. Incoming messages for a session are
queued and processed by that session's thread independently of other sessions.

Because your `Application` callbacks can be invoked concurrently from multiple session threads, your
application code **must be thread-safe**.

**Use when:**
- You have multiple sessions and need them to process messages independently.
- A slow or blocking callback for one session must not impact other sessions.
- You can ensure your application implementation is thread-safe.

## Queue Capacity and Back-pressure

Both strategies support configuring the internal message queue capacity to control back-pressure:

```java
// Fixed-capacity queue (blocks producers when full)
Acceptor acceptor = new ThreadedSocketAcceptor(
    application, storeFactory, settings, logFactory, messageFactory,
    queueCapacity);

// Watermark-based flow control
Acceptor acceptor = ThreadedSocketAcceptor.newBuilder()
    .withApplication(application)
    .withMessageStoreFactory(storeFactory)
    .withSettings(settings)
    .withLogFactory(logFactory)
    .withMessageFactory(messageFactory)
    .withQueueLowerWatermark(lowerWatermark)
    .withQueueUpperWatermark(upperWatermark)
    .build();
```

The same constructors and builder options are available on `SocketAcceptor`, `SocketInitiator`, and
`ThreadedSocketInitiator`.

## Choosing a Strategy

| | `SocketAcceptor` / `SocketInitiator` | `ThreadedSocketAcceptor` / `ThreadedSocketInitiator` |
|---|---|---|
| Message processing | Single shared thread | One thread per session |
| Application thread-safety required | No | Yes |
| Session isolation | No | Yes |
| Typical use case | Few sessions, simple apps | Many sessions, independent processing |

## Example: Starting an Acceptor

```java
import quickfix.*;
import java.io.FileInputStream;

public class MyApp {

    public static void main(String[] args) throws Exception {
        Application application = new MyApplication();
        SessionSettings settings = new SessionSettings(new FileInputStream(args[0]));
        MessageStoreFactory storeFactory = new FileStoreFactory(settings);
        LogFactory logFactory = new FileLogFactory(settings);
        MessageFactory messageFactory = new DefaultMessageFactory();

        // Single-threaded: all sessions share one message-processing thread
        Acceptor acceptor = new SocketAcceptor(
            application, storeFactory, settings, logFactory, messageFactory);

        // OR thread-per-session: each session has its own message-processing thread
        // (application must be thread-safe)
        // Acceptor acceptor = new ThreadedSocketAcceptor(
        //     application, storeFactory, settings, logFactory, messageFactory);

        acceptor.start();
        // ... run your application ...
        acceptor.stop();
    }
}
```

## Thread Safety Guidance

Regardless of which strategy you choose, note that `Session.sendToTarget()` is thread-safe and may
be called from any thread to send outgoing messages.

When using `ThreadedSocketAcceptor` or `ThreadedSocketInitiator`, ensure that any shared state
accessed in your `Application` implementation (e.g., order books, maps, counters) is properly
synchronized or uses thread-safe data structures.

---

*For a deep technical reference on the threading internals, see [`threading-model.md`](./threading-model.md).*