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

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;

/**
 * Processes messages in a session-specific thread.
 */
public class ThreadPerSessionEventHandlingStrategy implements EventHandlingStrategy {
    /**
     * Constant indicating how long we wait for an incoming message. After this thread has been asked
     * to stop, it can take up to this long to terminate.
     */
    private static final long THREAD_WAIT_FOR_MESSAGE_MS = 250;
    private final ConcurrentMap<SessionID, MessageDispatchingThread> dispatchers = new ConcurrentHashMap<SessionID, MessageDispatchingThread>();

    public void onMessage(Session quickfixSession, Message message) {
        MessageDispatchingThread dispatcher = dispatchers.get(quickfixSession.getSessionID());
        if (dispatcher == null) {
            MessageDispatchingThread temp = new MessageDispatchingThread(quickfixSession);
            dispatcher = dispatchers.putIfAbsent(quickfixSession.getSessionID(), temp);
            if (dispatcher == null) dispatcher = temp;
            startDispatcherThread(dispatcher);
        }
        dispatcher.enqueue(message);
    }

    /** There is no such thing as a SesionConnector for thread-per-session handler - we don't multiplex
     * between multiple sessions here so this is null
     */
    public SessionConnector getSessionConnector() {
        return null;
    }

    protected void startDispatcherThread(MessageDispatchingThread dispatcher) {
        dispatcher.start();
    }

    public void stopDispatcherThreads() {
        // dispatchersToShutdown is backed by the map itself so changes in one are reflected in the other
        Collection<MessageDispatchingThread> dispatchersToShutdown = dispatchers.values();
        for (MessageDispatchingThread dispatcher : dispatchersToShutdown) {
            dispatcher.stopDispatcher();
        }
        
        // wait for threads to stop
        while (dispatchersToShutdown.size() > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            for (Iterator<MessageDispatchingThread> iterator = dispatchersToShutdown.iterator(); iterator.hasNext();) {
                MessageDispatchingThread messageDispatchingThread = iterator.next();
                if (messageDispatchingThread.isStopped()) {
                    iterator.remove();
                }
            }
        }
    }
    
    class MessageDispatchingThread extends Thread {
        private final Session quickfixSession;
        private final BlockingQueue<Message> messages = new LinkedBlockingQueue<Message>();
        private volatile boolean stopped = false;
        private volatile boolean stopping = false;
        
        public MessageDispatchingThread(Session session) {
            super("QF/J Session dispatcher: " + session.getSessionID());
            quickfixSession = session;
        }

        public void enqueue(Message message) {
            try {
                messages.put(message);
            } catch (InterruptedException e) {
                quickfixSession.getLog().onErrorEvent(e.toString());
            }
        }
        
        public int getQueueSize() {
            return messages.size();
        }        

        public void run() {
            while (!stopping) {
                try {
                    Message message = getNextMessage(messages);
                    if (message != null && quickfixSession.hasResponder()) {
                        quickfixSession.next(message);
                    }
                } catch (InterruptedException e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Message dispatcher interrupted", e);
                    return;
                } catch (Throwable e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Error during message processing", e);
                }
            }
            stopped = true;
        }
        
        public void stopDispatcher() {
            stopping = true;
            stopped = true;
        }

        public boolean isStopped() {
            return stopped;
        }
    }

    BlockingQueue<Message> getMessages(SessionID sessionID) {
        MessageDispatchingThread dispatcher = getDispatcher(sessionID);
        return dispatcher.messages;
    }

    MessageDispatchingThread getDispatcher(SessionID sessionID) {
        return dispatchers.get(sessionID);
    }

    /**
     * Get the next message from the messages {@link java.util.concurrent.BlockingQueue}.
     * <p>We do not block indefinately as that would prevent this thread from ever stopping
     * @see #THREAD_WAIT_FOR_MESSAGE_MS
     * @param messages
     * @return next message or null if nothing arrived within the timeout period
     * @throws InterruptedException
    */
    Message getNextMessage(BlockingQueue<Message> messages) throws InterruptedException {
        return messages.poll(THREAD_WAIT_FOR_MESSAGE_MS, TimeUnit.MILLISECONDS);
    }
    
    public int getQueueSize() {
        int ret = 0;
        for(MessageDispatchingThread mdt : dispatchers.values()) {
            ret+=mdt.getQueueSize();
        }
        return ret;
    }

}
