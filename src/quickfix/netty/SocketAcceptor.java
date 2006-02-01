/****************************************************************************
 ** Copyright (c) quickfixengine.org  All rights reserved.
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

import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionFactory;
import quickfix.SessionSettings;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class SocketAcceptor extends AbstractSocketAcceptor {
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

    public SocketAcceptor(SessionFactory sessionFactory, SessionSettings settings) {
        super(sessionFactory, settings);
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
        
        for (int i = 0; i < 5 && isLoggedOn(); i++) {
            try {
                poll();
                Thread.sleep(1000);
            } catch (Exception e) {
                return;
            }
        }
    }

    protected void onStart() {
        // empty
    }

    protected boolean onPoll() {
        if (!isLoggedOn()) {
            return false;
        }

        // If there are still logged on sessions, but it's been more than
        // 5 seconds from the stop request, then return false.
        if (isStopRequested() && (System.currentTimeMillis() - getStopRequestTime()) > 5000L) {
            return false;
        }

        if (messageQueue.peek() != null) {
            ((MessageEvent) messageQueue.poll()).process();
        }

        return true;
    }

    protected void onStop() {
        // during stop, process events (like logout) in timer thread
        messageQueue = null;
    }

    protected void onMessage(Session nettySession, Message message) {
        if (messageQueue != null) {
            // TODO PERFORMANCE find a way to not create an object here
            messageQueue.add(new MessageEvent(nettySession, message));
        } else {
            processMessage(nettySession, message);
        }
    }

    protected void onTimerEvent(quickfix.Session quickfixSession) {
        processTimerEvent(quickfixSession);
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