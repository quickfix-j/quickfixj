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

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SystemTime;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

/**
 * Processes messages for all sessions in a single thread.
 */
public class SingleThreadedEventHandlingStrategy implements EventHandlingStrategy {
    private final BlockingQueue eventQueue = new LinkedBlockingQueue();
    private final SessionConnector sessionConnector;
    private boolean isStopped;
    private long stopTime = 0L;

    public SingleThreadedEventHandlingStrategy(SessionConnector connector) {
        sessionConnector = connector;
    }

    public void onMessage(Session quickfixSession, Message message) {
        try {
            eventQueue.put(new SessionMessageEvent(quickfixSession, message));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void block() {
        while (true) {
            synchronized (this) {
                if (isStopped) {
                    if (stopTime == 0) {
                        stopTime = SystemTime.currentTimeMillis();
                    }
                    if (!sessionConnector.isLoggedOn()
                            || SystemTime.currentTimeMillis() - stopTime > 5000L) {
                        sessionConnector.stopSessionTimer();
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
        return (SessionMessageEvent) eventQueue.poll(1000L, TimeUnit.MILLISECONDS);
    }

    public void blockInThread() {
        Thread messageProcessingThread = new Thread(new Runnable() {

            public void run() {
                block();
            }

        }, "QFJ Socket Acceptor " + Integer.toHexString(System.identityHashCode(this)));
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
                if (quickfixSession.hasResponder()) {
                    quickfixSession.next(message);
                }
            } catch (Throwable e) {
                LogUtil.logThrowable(quickfixSession.getSessionID(), e.getMessage(), e);
            }
        }
    }

    public synchronized void stopHandlingMessages() {
        isStopped = true;
    }

}
