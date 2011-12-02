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


package quickfix;

import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.SingleThreadedEventHandlingStrategy;
import quickfix.mina.acceptor.AbstractSocketAcceptor;

/**
 * Accepts connections and uses a single thread to process messages for all
 * sessions.
 */
public class SocketAcceptor extends AbstractSocketAcceptor {
    private Boolean isStarted = Boolean.FALSE;
    private final Object lock = new Object();

    public SocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
    }

    public SocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
    }

    public SocketAcceptor(SessionFactory sessionFactory, SessionSettings settings) throws ConfigError {
        super(settings, sessionFactory);
    }

    private SingleThreadedEventHandlingStrategy eventHandlingStrategy =
        new SingleThreadedEventHandlingStrategy(this);

    public void block() throws ConfigError, RuntimeError {
        initialize();
        eventHandlingStrategy.block();
    }

    public void start() throws ConfigError, RuntimeError {
        initialize();
        eventHandlingStrategy.blockInThread();
    }

    private void initialize() throws ConfigError {
        synchronized (lock) {
            if (isStarted.equals(Boolean.FALSE)) {
                startAcceptingConnections();
            }
            isStarted = Boolean.TRUE;
        }
    }

    public void stop() {
        stop(false);
    }

    public void stop(boolean forceDisconnect) {
        eventHandlingStrategy.stopHandlingMessages();
        stopAcceptingConnections();
        logoutAllSessions(forceDisconnect);
        stopSessionTimer();
        Session.unregisterSessions(getSessions());
        synchronized (lock) {
            isStarted = Boolean.FALSE;
        }
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }
}