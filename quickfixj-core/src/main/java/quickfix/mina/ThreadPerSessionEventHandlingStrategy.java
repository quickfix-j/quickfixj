/*
 ******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina;

import quickfix.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import static quickfix.mina.QueueTrackers.newDefaultQueueTracker;
import static quickfix.mina.QueueTrackers.newSingleSessionWatermarkTracker;

/**
 * Processes messages in a session-specific thread.
 */
public class ThreadPerSessionEventHandlingStrategy implements EventHandlingStrategy {
    private final ConcurrentMap<SessionID, MessageDispatchingThread> dispatchers = new ConcurrentHashMap<>();
    private final SessionConnector sessionConnector;
    private final int queueCapacity;
    private final int queueLowerWatermark;
    private final int queueUpperWatermark;
    private volatile Executor executor;

    public ThreadPerSessionEventHandlingStrategy(SessionConnector connector, int queueCapacity) {
        sessionConnector = connector;
        this.queueCapacity = queueCapacity;
        this.queueLowerWatermark = -1;
        this.queueUpperWatermark = -1;
    }

    public ThreadPerSessionEventHandlingStrategy(SessionConnector connector, int queueLowerWatermark, int queueUpperWatermark) {
        sessionConnector = connector;
        this.queueCapacity = -1;
        this.queueLowerWatermark = queueLowerWatermark;
        this.queueUpperWatermark = queueUpperWatermark;
    }

    public void setExecutor(Executor executor) {
		this.executor = executor;
	}

    MessageDispatchingThread createDispatcherThread(Session quickfixSession) {
        return new MessageDispatchingThread(quickfixSession, executor);
    }

    @Override
    public void onMessage(Session quickfixSession, Message message) {
        MessageDispatchingThread dispatcher = dispatchers.get(quickfixSession.getSessionID());
        if (dispatcher == null) {
            dispatcher = dispatchers.computeIfAbsent(quickfixSession.getSessionID(), sessionID -> {
                final MessageDispatchingThread newDispatcher = createDispatcherThread(quickfixSession);
                startDispatcherThread(newDispatcher);
                return newDispatcher;
            });
        }
        if (message != null) {
            dispatcher.enqueue(message);
        }
    }

    /**
     * The SessionConnector is not directly required for thread-per-session handler - we don't multiplex
     * between multiple sessions here.
     * However it is made available here for other callers (such as SessionProviders wishing to register dynamic sessions).
     * @return the SessionConnector
     */
    @Override
    public SessionConnector getSessionConnector() {
        return sessionConnector;
    }

    protected void startDispatcherThread(MessageDispatchingThread dispatcher) {
        dispatcher.start();
    }

    public void stopDispatcherThreads() {
        // dispatchersToShutdown is backed by the map itself so changes in one are reflected in the other
        final Collection<MessageDispatchingThread> dispatchersToShutdown = dispatchers.values();
        for (final MessageDispatchingThread dispatcher : dispatchersToShutdown) {
            dispatcher.stopDispatcher();
        }

        // wait for threads to stop
        while (!dispatchersToShutdown.isEmpty()) {
            try {
                Thread.sleep(100);
            } catch (final InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            dispatchersToShutdown.removeIf(MessageDispatchingThread::isStopped);
        }
    }

    /**
     * A stand-in for the Thread class that delegates to an Executor.
     * Implements all the API required by pre-existing QFJ code.
     */
    protected static abstract class ThreadAdapter implements Runnable {

        private final Executor executor;
        private final String name;

        public ThreadAdapter(String name, Executor executor) {
            this.name = name;
            this.executor = executor != null ? executor : new DedicatedThreadExecutor(name);
        }

        public void start() {
            executor.execute(this);
        }

        @Override
        public final void run() {
            Thread currentThread = Thread.currentThread();
            String threadName = currentThread.getName();
            try {
                if (!name.equals(threadName)) {
                    currentThread.setName(name + " (" + threadName + ")");
                }
                doRun();
            } finally {
                currentThread.setName(threadName);
            }
        }

        abstract void doRun();

        /**
         * An Executor that uses its own dedicated Thread. Provides equivalent
         * behavior to the prior non-Executor approach.
         */
        static final class DedicatedThreadExecutor implements Executor {

            private final String name;

            DedicatedThreadExecutor(String name) {
                this.name = name;
            }

            @Override
            public void execute(Runnable command) {
                new Thread(command, name).start();
            }

        }
	}

	protected class MessageDispatchingThread extends ThreadAdapter {
        private final Session quickfixSession;
        private final BlockingQueue<Message> messages;
        private final QueueTracker<Message> queueTracker;
        private volatile boolean stopped;
        private volatile boolean stopping;

        private MessageDispatchingThread(Session session, Executor executor) {
            super("QF/J Session dispatcher: " + session.getSessionID(), executor);
            quickfixSession = session;
            if (queueCapacity >= 0) {
                messages = new LinkedBlockingQueue<>(queueCapacity);
                queueTracker = newDefaultQueueTracker(messages);
            } else {
                messages = new LinkedBlockingQueue<>();
                if (queueLowerWatermark > 0 && queueUpperWatermark > 0) {
                    queueTracker = newSingleSessionWatermarkTracker(messages, queueLowerWatermark, queueUpperWatermark,
                            quickfixSession);
                } else {
                    queueTracker = newDefaultQueueTracker(messages);
                }
            }
        }

        public void enqueue(Message message) {
            if (message == END_OF_STREAM && stopping) {
                return;
            }
            try {
                queueTracker.put(message);
            } catch (final InterruptedException e) {
                quickfixSession.getLog().onErrorEvent(e.toString());
            }
        }

        public int getQueueSize() {
            return messages.size();
        }

        @Override
        void doRun() {
            while (!stopping) {
                try {
                    final Message message = getNextMessage(queueTracker);
                    if (message == null) {
                        // no message available in polling interval
                        continue;
                    }
                    quickfixSession.next(message);
                    if (message == END_OF_STREAM) {
                        stopping = true;
                    }
                } catch (final InterruptedException e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Message dispatcher interrupted", e);
                    stopping = true;
                } catch (final Throwable e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Error during message processing", e);
                }
            }
            if (!messages.isEmpty()) {
                final List<Message> tempList = new ArrayList<>(messages.size());
                queueTracker.drainTo(tempList);
                for (Message message : tempList) {
                    try {
                        quickfixSession.next(message);
                    } catch (final Throwable e) {
                        LogUtil.logThrowable(quickfixSession.getSessionID(),
                                "Error during message processing", e);
                    }
                }
            }

            dispatchers.remove(quickfixSession.getSessionID());
            stopped = true;
        }

        public void stopDispatcher() {
            enqueue(END_OF_STREAM);
            stopping = true;
            stopped = true;
        }

        public boolean isStopped() {
            return stopped;
        }
    }

    protected MessageDispatchingThread getDispatcher(SessionID sessionID) {
        return dispatchers.get(sessionID);
    }

    /**
     * Get the next message from the messages {@link java.util.concurrent.BlockingQueue}.
     * <p>
     * We do not block indefinitely as that would prevent this thread from ever stopping
     *
     * @see #THREAD_WAIT_FOR_MESSAGE_MS
     * @param queueTracker
     * @return next message or null if nothing arrived within the timeout period
     * @throws InterruptedException
     */
    protected Message getNextMessage(QueueTracker<Message> queueTracker) throws InterruptedException {
        return queueTracker.poll(THREAD_WAIT_FOR_MESSAGE_MS, TimeUnit.MILLISECONDS);
    }

    @Override
    public int getQueueSize() {
        int ret = 0;
        for (final MessageDispatchingThread mdt : dispatchers.values()) {
            ret += mdt.getQueueSize();
        }
        return ret;
    }

    @Override
    public int getQueueSize(SessionID sessionID) {
        MessageDispatchingThread dispatchingThread = dispatchers.get(sessionID);
        if (dispatchingThread != null) {
            return dispatchingThread.getQueueSize();
        }
        return 0;
    }

}
