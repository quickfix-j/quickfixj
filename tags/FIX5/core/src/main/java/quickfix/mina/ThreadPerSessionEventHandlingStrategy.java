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
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;

/**
 * Processes messages in a session-specific thread.
 */
public class ThreadPerSessionEventHandlingStrategy implements EventHandlingStrategy {
    private final Map<SessionID, MessageDispatchingThread> dispatchers = new ConcurrentHashMap<SessionID, MessageDispatchingThread>();

    public void onMessage(Session quickfixSession, Message message) {
        MessageDispatchingThread dispatcher = dispatchers
                .get(quickfixSession.getSessionID());
        if (dispatcher == null) {
            dispatcher = new MessageDispatchingThread(quickfixSession);
            dispatchers.put(quickfixSession.getSessionID(), dispatcher);
            startDispatcherThread(dispatcher);
        }
        dispatcher.enqueue(message);
    }

    protected void startDispatcherThread(MessageDispatchingThread dispatcher) {
        dispatcher.start();
    }

    public void stopDispatcherThreads() {
        Collection<MessageDispatchingThread> dispatchersToShutdown = dispatchers.values();
        dispatchers.clear();
        for (MessageDispatchingThread dispatcher : dispatchersToShutdown) {
            dispatcher.stopDispatcher();
        }
    }
    
    class MessageDispatchingThread extends Thread {
        private final Session quickfixSession;
        private final BlockingQueue<Message> messages = new LinkedBlockingQueue<Message>();
        private volatile boolean stopped;
        
        public MessageDispatchingThread(Session session) {
            super("QF/J Session dispatcher: " + session.getSessionID());
            quickfixSession = session;
        }

        public void enqueue(Message message) {
            try {
                messages.put(message);
            } catch (InterruptedException e) {
                quickfixSession.getLog().onEvent(e.getMessage());
            }
        }

        public void run() {
            while (!stopped) {
                try {
                    Message message = getNextMessage(messages);
                    if (quickfixSession.hasResponder()) {
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
        }
        
        public void stopDispatcher() {
            stopped = true;
        }
    }

    BlockingQueue<Message> getMessages(SessionID sessionID) {
        MessageDispatchingThread dispatcher = getDispatcher(sessionID);
        return dispatcher.messages;
    }

    MessageDispatchingThread getDispatcher(SessionID sessionID) {
        return dispatchers.get(sessionID);
    }

    Message getNextMessage(BlockingQueue<Message> messages) throws InterruptedException {
        return messages.take();
    }
    

}
