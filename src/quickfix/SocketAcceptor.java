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

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;

import org.apache.commons.logging.Log;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionSettings;
import quickfix.netty.AbstractSocketAcceptor;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class SocketAcceptor extends AbstractSocketAcceptor {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private BlockingQueue messageQueue;

    public SocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public SocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
    }

    protected void onInitialize(boolean handleMessageInCaller) {
        if (handleMessageInCaller) {
            messageQueue = new LinkedBlockingQueue();
        }
    }

    protected void onBlock() {
        while (!isStopRequested()) {
            try {
                ((MessageEvent) messageQueue.take()).process();
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    protected void onStart() {
        // empty
    }

    protected boolean onPoll() {
        if (isStopRequested()) {
            // TODO wait for logout
            return false;
        }

        if (messageQueue.peek() != null) {
            ((MessageEvent) messageQueue.poll()).process();
        }

        return true;
    }

    protected void onStop() {
        // empty
    }

    protected void onMessage(Session nettySession, Message message) {
        if (messageQueue != null) {
            // TODO PERFORMANCE find a way to not create an object here
            messageQueue.add(new MessageEvent(nettySession, message));
        } else {
            processMessage(nettySession, message);
        }
    }

    /**
     * This class is used to defer message processing to the thread calling
     * block or poll.
     */
    private class MessageEvent {
        private Session session;
        private Message message;

        public MessageEvent(Session session, Message message) {
            this.session = session;
            this.message = message;
        }

        public void process() {
            processMessage(session, message);
        }
    }
}