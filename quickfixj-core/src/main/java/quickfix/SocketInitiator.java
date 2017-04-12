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
import quickfix.mina.initiator.AbstractSocketInitiator;

/**
 * Initiates connections and uses a single thread to process messages for all
 * sessions.
 */
public class SocketInitiator extends AbstractSocketInitiator {
    private volatile Boolean isStarted = Boolean.FALSE;
    private final SingleThreadedEventHandlingStrategy eventHandlingStrategy;

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory, int queueCapacity) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(this, queueCapacity);
    }

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,
            int queueCapacity)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(this, queueCapacity);
    }

    public SocketInitiator(SessionFactory sessionFactory, SessionSettings settings,
           int queueCapacity) throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(this, queueCapacity);
    }

    @Override
    public void block() throws ConfigError, RuntimeError {
        initialize(false);
    }

    @Override
    public void start() throws ConfigError, RuntimeError {
        initialize(true);
    }

    @Override
    public void stop() {
        stop(false);
    }

    @Override
    public void stop(boolean forceDisconnect) {
        if (isStarted.equals(Boolean.TRUE)) {
            try {
                logoutAllSessions(forceDisconnect);
                stopInitiators();
            } finally {
                Session.unregisterSessions(getSessions());
                eventHandlingStrategy.stopHandlingMessages();
                isStarted = Boolean.FALSE;
            }
        }
    }

    private void initialize(boolean blockInThread) throws ConfigError {
        if (isStarted.equals(Boolean.FALSE)) {
            eventHandlingStrategy.setExecutor(longLivedExecutor);
            createSessionInitiators();
            for (Session session : getSessionMap().values()) {
                Session.registerSession(session);
            }
            startInitiators();
            isStarted = Boolean.TRUE;
            if (blockInThread) {
                eventHandlingStrategy.blockInThread();
            } else {
                eventHandlingStrategy.block();
            }
        } else {
            log.warn("Ignored attempt to start already running SocketInitiator.");
        }
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }

}
