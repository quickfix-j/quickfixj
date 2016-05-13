/*******************************************************************************
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

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SystemTime;

/**
 * Processes messages for all sessions in a single thread.
 */
public class SingleThreadedEventHandlingStrategy implements EventHandlingStrategy {
    public static final String MESSAGE_PROCESSOR_THREAD_NAME = "QFJ Message Processor";
    private final BlockingQueue<SessionMessageEvent> eventQueue;
    private final SessionConnector sessionConnector;
    private volatile Thread messageProcessingThread;
    private volatile boolean isStopped;
    private long stopTime = 0L;

    public SingleThreadedEventHandlingStrategy(SessionConnector connector, int queueCapacity) {
        sessionConnector = connector;
        eventQueue = new LinkedBlockingQueue<SessionMessageEvent>(queueCapacity);
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
                        final LinkedBlockingQueue<SessionMessageEvent> tempQueue = new LinkedBlockingQueue<SessionMessageEvent>();
                        eventQueue.drainTo(tempQueue);
                        for (SessionMessageEvent event : tempQueue) {
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
        messageProcessingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                sessionConnector.log.info("Started " + MESSAGE_PROCESSOR_THREAD_NAME);
                block();
                sessionConnector.log.info("Stopped " + MESSAGE_PROCESSOR_THREAD_NAME);
            }
        }, MESSAGE_PROCESSOR_THREAD_NAME);
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
    
}
