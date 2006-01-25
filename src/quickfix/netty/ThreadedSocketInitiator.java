/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix.netty;

import java.util.HashMap;

import net.gleamynode.netty2.Message;

import org.apache.commons.logging.Log;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionSettings;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class ThreadedSocketInitiator extends AbstractSocketInitiator {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private Object blockSync = new Object();

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
    }

    public ThreadedSocketInitiator(SessionFactory sessionFactory, SessionSettings settings) throws ConfigError {
        super(sessionFactory, settings);
    }

    protected void onBlock() {
        synchronized (blockSync) {
            try {
                blockSync.wait();
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    protected void onInitialize(boolean isBlocking) {
        // empty
    }

    protected void onStart() {
        // empty
    }

    protected boolean onPoll() {
        return false;
    }

    protected void onStop() {
        // empty
    }

    private HashMap workers = new HashMap();

    protected synchronized void onMessage(Message message) {
        FIXMessageData fixMessageData = (FIXMessageData) message;
        getSessionThread(fixMessageData.getSession()).enqueue(message);
    }

    protected void onTimerEvent(Session quickfixSession) {
        getSessionThread(quickfixSession).enqueue(quickfixSession);
    }

    private SessionThread getSessionThread(quickfix.Session quickfixSession) {
        SessionThread sessionThread = (SessionThread) workers.get(quickfixSession);
        if (sessionThread == null) {
            sessionThread = new SessionThread(quickfixSession);
            workers.put(quickfixSession, sessionThread);
            sessionThread.start();
        }
        return sessionThread;
    }

    private class SessionThread extends Thread {
        private final BlockingQueue eventQueue = new LinkedBlockingQueue();

        public SessionThread(quickfix.Session quickfixSession) {
            super("quickfix-session-" + quickfixSession.getSessionID());
        }

        public void run() {
            while (true) {
                try {
                    Object event = eventQueue.take();
                    if (event instanceof Message) {
                        processMessage((Message) event);
                    } else if (event instanceof Session) {
                        processTimerEvent((Session) event);
                    }
                } catch (InterruptedException e) {
                    return;
                } catch (Throwable e) {
                    log.error("message processing error", e);
                }
            }
        }

        public void enqueue(Object event) {
            eventQueue.add(event);
        }
    }

	protected boolean isHandlingMessageInCallingThread() {
		return false;
	}
}