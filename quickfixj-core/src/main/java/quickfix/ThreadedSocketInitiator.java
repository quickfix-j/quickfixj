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
import quickfix.mina.initiator.AbstractSocketInitiator;

/**
 * Initiates connections and uses a separate thread per session to process messages.
 */
public class ThreadedSocketInitiator extends AbstractSocketInitiator {
    private final ThreadPerSessionEventHandlingStrategy eventHandlingStrategy;

    private ThreadedSocketInitiator(Builder builder) throws ConfigError {
        super(builder.application, builder.messageStoreFactory, builder.settings,
                builder.logFactory, builder.messageFactory, builder.numReconnectThreads);

        if (builder.queueCapacity >= 0) {
            eventHandlingStrategy
                    = new ThreadPerSessionEventHandlingStrategy(this, builder.queueCapacity);
        } else {
            eventHandlingStrategy
                    = new ThreadPerSessionEventHandlingStrategy(this, builder.queueLowerWatermark, builder.queueUpperWatermark);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends AbstractSessionConnectorBuilder<Builder, ThreadedSocketInitiator> {
        
        int numReconnectThreads = 3;
        
        private Builder() {
            super(Builder.class);
        }

        public Builder withReconnectThreads(int numReconnectThreads) throws ConfigError {
            this.numReconnectThreads = numReconnectThreads;
            return this;
        }

        @Override
        protected ThreadedSocketInitiator doBuild() throws ConfigError {
            return new ThreadedSocketInitiator(this);
        }
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory, int queueCapacity) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory, int queueCapacity) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    public ThreadedSocketInitiator(SessionFactory sessionFactory, SessionSettings settings, int queueCapacity)
            throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, queueCapacity);
    }

    public ThreadedSocketInitiator(SessionFactory sessionFactory, SessionSettings settings)
            throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new ThreadPerSessionEventHandlingStrategy(this, DEFAULT_QUEUE_CAPACITY);
    }

    @Override
    public void start() throws ConfigError, RuntimeError {
    	eventHandlingStrategy.setExecutor(longLivedExecutor);
        createSessionInitiators();
        startInitiators();
    }

    @Override
    public void stop(boolean forceDisconnect) {
        logoutAllSessions(forceDisconnect);
        stopInitiators();
        eventHandlingStrategy.stopDispatcherThreads();
        Session.unregisterSessions(getSessions(), true);
        clearConnectorSessions();
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }

}
