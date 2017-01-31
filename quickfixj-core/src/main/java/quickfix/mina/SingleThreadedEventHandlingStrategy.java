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

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SystemTime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Processes messages for all sessions in a single thread.
 */
public class SingleThreadedEventHandlingStrategy implements EventHandlingStrategy {
    public static final String MESSAGE_PROCESSOR_THREAD_NAME = "QFJ Message Processor";
    private final BlockingQueue<SessionMessageEvent> eventQueue;
    private final SessionConnector sessionConnector;
    private volatile ThreadAdapter messageProcessingThread;
    private volatile boolean isStopped;
    private Executor executor;
    private long stopTime = 0L;

    public SingleThreadedEventHandlingStrategy(SessionConnector connector, int queueCapacity) {
        sessionConnector = connector;
        eventQueue = new LinkedBlockingQueue<>(queueCapacity);
    }

    public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	@Override
    public void onMessage(Session quickfixSession, Message message) {
        if (message == END_OF_STREAM && isStopped) {
            return;
        }
        try {
            eventQueue.put(new SessionMessageEvent(quickfixSession, message));
        } catch (InterruptedException e) {
            isStopped = true;
            throw new RuntimeException(e);
        }
    }

    @Override
    public SessionConnector getSessionConnector() {
        return sessionConnector;
    }

    public void block() {
        while (true) {
            synchronized (this) {
                if (isStopped) {
                    if (!eventQueue.isEmpty()) {
                        final List<SessionMessageEvent> tempList = new ArrayList<>();
                        eventQueue.drainTo(tempList);
                        for (SessionMessageEvent event : tempList) {
                            event.processMessage();
                        }
                    }
                    if (stopTime == 0) {
                        stopTime = SystemTime.currentTimeMillis();
                    }
                    if (!sessionConnector.isLoggedOn() || SystemTime.currentTimeMillis() - stopTime > 5000L) {
                        sessionConnector.stopSessionTimer();
                        // reset the stoptime
                        stopTime = 0;
                        return;
                    }
                }
            }
            try {
                SessionMessageEvent event = getMessage();
                if (event != null) {
                    event.processMessage();
                }
            } catch (InterruptedException e) {
                // ignore
            }
        }
    }

    private SessionMessageEvent getMessage() throws InterruptedException {
        return eventQueue.poll(THREAD_WAIT_FOR_MESSAGE_MS, TimeUnit.MILLISECONDS);
    }

    /**
     * Start handling of messages by message processor thread.
     * If thread is still alive, an attempt is made to stop it.
     * An IllegalStateException is thrown if stopping the old thread
     * was not successful.
     *
     * This method must not be called by several threads concurrently.
     */
    public void blockInThread() {
        if (messageProcessingThread != null && messageProcessingThread.isAlive()) {
            sessionConnector.log.warn("Trying to stop still running " + MESSAGE_PROCESSOR_THREAD_NAME);
            stopHandlingMessages(true);
            if (messageProcessingThread.isAlive()) {
                throw new IllegalStateException("Still running " + MESSAGE_PROCESSOR_THREAD_NAME + " could not be stopped!");
            }
        }

        startHandlingMessages();
        messageProcessingThread = new ThreadAdapter(() -> {
            sessionConnector.log.info("Started " + MESSAGE_PROCESSOR_THREAD_NAME);
            block();
            sessionConnector.log.info("Stopped " + MESSAGE_PROCESSOR_THREAD_NAME);
        }, MESSAGE_PROCESSOR_THREAD_NAME, executor);
        messageProcessingThread.setDaemon(true);
        messageProcessingThread.start();
    }

    private static class SessionMessageEvent {
        private final Session quickfixSession;
        private final Message message;

        public SessionMessageEvent(Session session, Message message) {
            this.message = message;
            quickfixSession = session;
        }

        public void processMessage() {
            try {
                quickfixSession.next(message);
            } catch (Throwable e) {
                LogUtil.logThrowable(quickfixSession.getSessionID(), e.getMessage(), e);
            }
        }
    }

    private synchronized void startHandlingMessages() {
        isStopped = false;
    }

    public synchronized void stopHandlingMessages() {
        for (Session session : sessionConnector.getSessionMap().values()) {
            onMessage(session, END_OF_STREAM);
        }
        isStopped = true;
    }

    public void stopHandlingMessages(boolean join) {
        stopHandlingMessages();

        if (join) {
            try {
                messageProcessingThread.join();
            } catch (InterruptedException e) {
                sessionConnector.log.error(MESSAGE_PROCESSOR_THREAD_NAME + " interrupted.");
            }
        }
    }

    @Override
    public int getQueueSize() {
        return eventQueue.size();
    }

    @Override
    public int getQueueSize(SessionID sessionID) {
        // we only have one queue for all sessions
        return getQueueSize();
    }

	/**
	 * A stand-in for the Thread class that delegates to an Executor.
	 * Implements all the API required by pre-existing QFJ code.
	 */
	static final class ThreadAdapter {

		private final Executor executor;
		private final RunnableWrapper wrapper;

		ThreadAdapter(Runnable command, String name, Executor executor) {
			wrapper = new RunnableWrapper(command, name);
			this.executor = executor != null ? executor : new DedicatedThreadExecutor(name);
		}

		public void join() throws InterruptedException {
			wrapper.join();
		}

		public void setDaemon(boolean b) {
			/* No-Op. Already set for DedicatedThreadExecutor. Not relevant for externally supplied Executors. */
		}

		public boolean isAlive() {
			return wrapper.isAlive();
		}

		public void start() {
			executor.execute(wrapper);
		}

		/**
		 * Provides the Thread::join and Thread::isAlive semantics on the nested Runnable.
		 */
		static final class RunnableWrapper implements Runnable {

			private final CountDownLatch latch = new CountDownLatch(1);
			private final Runnable command;
			private final String name;

			public RunnableWrapper(Runnable command, String name) {
				this.command = command;
				this.name = name;
			}

			@Override
			public void run() {
				Thread currentThread = Thread.currentThread();
				String threadName = currentThread.getName();
				try {
					if (!name.equals(threadName)) {
						currentThread.setName(name + " (" + threadName + ")");
					}
					command.run();
				} finally {
					latch.countDown();
					currentThread.setName(threadName);
				}
			}

			public void join() throws InterruptedException {
				latch.await();
			}

			public boolean isAlive() {
				return latch.getCount() > 0;
			}

		}

		/**
		 * An Executor that uses it's own dedicated Thread.
		 * Provides equivalent behavior to the prior non-Executor approach.
		 */
		static final class DedicatedThreadExecutor implements Executor {

			private final String name;
			
			DedicatedThreadExecutor(String name) {
				this.name = name;
			}

			@Override
			public void execute(Runnable command) {
				Thread thread = new Thread(command, name);
				thread.setDaemon(true);
				thread.start();
			}

		}

	}

}
