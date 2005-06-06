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

package quickfix;

import java.util.HashMap;

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;

import org.apache.commons.logging.Log;

import quickfix.netty.AbstractSocketAcceptor;

import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class ThreadedSocketAcceptor extends AbstractSocketAcceptor {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private Object blockSync = new Object();

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
    
    protected synchronized void onMessage(Session nettySession, Message message) {
        Worker worker = (Worker)workers.get(nettySession);
        if (worker == null) {
            worker = new Worker(nettySession);
            workers.put(nettySession, worker);
            worker.start();
        }
        worker.enqueue(message);
    }

    private class Worker extends Thread {
        private final BlockingQueue messageQueue = new LinkedBlockingQueue();
        private final Session nettySession;

        public Worker(Session nettySession) {
            super("quickfix-session-"+nettySession.getSocketAddressString());
            this.nettySession = nettySession;
        }

        public void run() {
            while (true) {
                try {
                    Message message = (Message) messageQueue.take();
                    processMessage(nettySession, message);
                } catch (InterruptedException e) {
                    return;
                } catch (Throwable e) {
                    log.error("message processing error", e);
                }
            }
        }

        public void enqueue(Message message) {
            messageQueue.add(message);
        }
    }
}