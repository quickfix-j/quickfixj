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
import quickfix.mina.ThreadPerSessionEventHandlingStrategy;
import quickfix.mina.acceptor.AbstractSocketAcceptor;

/**
 * Accepts connections and uses a separate thread per session to process messages.
 */
public class ThreadedSocketAcceptor extends AbstractSocketAcceptor {
    private final ThreadPerSessionEventHandlingStrategy eventHandlingStrategy;

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
                                  SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,
                                  int queueCapacity )
                                  throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
                                  SessionSettings settings, MessageFactory messageFactory,
                                  int queueCapacity ) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public ThreadedSocketAcceptor(SessionFactory sessionFactory, SessionSettings settings, int queueCapacity)
            throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketAcceptor(SessionFactory sessionFactory, SessionSettings settings)
            throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public void start() throws ConfigError, RuntimeError {
    	eventHandlingStrategy.setExecutor(longLivedExecutor);
        startAcceptingConnections();
    }

    public void stop() {
        stop(false);
    }

    public void stop(boolean forceDisconnect) {
        try {
            logoutAllSessions(forceDisconnect);
            stopAcceptingConnections();
        } catch (ConfigError e) {
            log.error("Error when stopping acceptor.", e);
        }
        stopSessionTimer();
        eventHandlingStrategy.stopDispatcherThreads();
        Session.unregisterSessions(getSessions());
    }

    public void block() throws ConfigError, RuntimeError {
        throw new UnsupportedOperationException("Blocking not supported: " + getClass());
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }

}
