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

import java.util.Map;

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentHashMap;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

/**
 * Processes messages in a session-specific thread.
 */
public class ThreadPerSessionEventHandlingStrategy implements EventHandlingStrategy {
    private final Map dispatchers = new ConcurrentHashMap();

    public void onMessage(Session quickfixSession, Message message) {
        MessageDispatchingThread dispatcher = (MessageDispatchingThread) dispatchers
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

    class MessageDispatchingThread extends Thread {
        private final Session quickfixSession;
        private final BlockingQueue messages = new LinkedBlockingQueue();

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
            while (true) {
                try {
                    Message message = getNextMessage(messages);
                    if (quickfixSession.hasResponder()) {
                        quickfixSession.next(message);
                    }
                } catch (InterruptedException e) {
                    return;
                } catch (Throwable e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Error during message processing", e);
                }
            }
        }
    }

    BlockingQueue getMessages(SessionID sessionID) {
        MessageDispatchingThread dispatcher = getDispatcher(sessionID);
        return dispatcher.messages;
    }

    MessageDispatchingThread getDispatcher(SessionID sessionID) {
        return (MessageDispatchingThread) dispatchers.get(sessionID);
    }

    Message getNextMessage(BlockingQueue messages) throws InterruptedException {
        return (Message) messages.take();
    }
    

}
