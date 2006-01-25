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
import java.util.Map;

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;

import org.apache.commons.logging.Log;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionFactory;
import quickfix.SessionSettings;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentHashMap;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class ThreadedSocketAcceptor extends AbstractSocketAcceptor {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private Object blockSync = new Object();
    private Map workersByQuickfixSession = new ConcurrentHashMap();
    private HashMap workers = new HashMap();


    public ThreadedSocketAcceptor(Application application,
                                  MessageStoreFactory messageStoreFactory, SessionSettings settings,
                                  LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public ThreadedSocketAcceptor(Application application,
                                  MessageStoreFactory messageStoreFactory, SessionSettings settings,
                                  MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
    }

    public ThreadedSocketAcceptor(SessionFactory sessionFactory, SessionSettings settings) {
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

    protected synchronized void onMessage(Session nettySession, Message message) {
        Worker worker = (Worker) workers.get(nettySession);
        if (worker == null) {
            worker = new Worker(nettySession);
            workers.put(nettySession, worker);
            workersByQuickfixSession.put(getQuickFixSession(nettySession, message), worker);
            worker.start();
        }
        worker.enqueue(message);
    }

    protected void onTimerEvent(quickfix.Session quickfixSession) {
        log.debug("Processing timer event.");
        Worker worker = (Worker) workersByQuickfixSession.get(quickfixSession);
        if (worker != null) {
            worker.enqueue(quickfixSession);
        }
    }

    private class Worker extends Thread {
        private final BlockingQueue eventQueue = new LinkedBlockingQueue();
        private final Session nettySession;

        public Worker(Session nettySession) {
            super("quickfix-session-" + nettySession.getSocketAddressString());
            this.nettySession = nettySession;
        }

        public void run() {
            while (true) {
                try {
                    Object event = eventQueue.take();
                    if (event instanceof Message) {
                        processMessage(nettySession, (Message) event);
                    } else if (event instanceof quickfix.Session) {
                        processTimerEvent((quickfix.Session) event);
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
}