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

import java.util.concurrent.atomic.AtomicBoolean;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.SingleThreadedEventHandlingStrategy;
import quickfix.mina.initiator.AbstractSocketInitiator;

/**
 * Initiates connections and uses a single thread to process messages for all
 * sessions.
 */
public class SocketInitiator extends AbstractSocketInitiator {
    private final AtomicBoolean isStarted = new AtomicBoolean(false);
    private final SingleThreadedEventHandlingStrategy eventHandlingStrategy;

    private SocketInitiator(Builder builder) throws ConfigError {
        super(builder.application, builder.messageStoreFactory, builder.settings,
                builder.logFactory, builder.messageFactory, builder.numReconnectThreads);

        if (builder.queueCapacity >= 0) {
            eventHandlingStrategy
                    = new SingleThreadedEventHandlingStrategy(this, builder.queueCapacity);
        } else {
            eventHandlingStrategy
                    = new SingleThreadedEventHandlingStrategy(this, builder.queueLowerWatermark, builder.queueUpperWatermark);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends AbstractSessionConnectorBuilder<Builder, SocketInitiator> {
        
        int numReconnectThreads = 3;

        private Builder() {
            super(Builder.class);
        }
        
        public Builder withReconnectThreads(int numReconnectThreads) throws ConfigError {
            this.numReconnectThreads = numReconnectThreads;
            return this;
        }

        @Override
        protected SocketInitiator doBuild() throws ConfigError {
            return new SocketInitiator(this);
        }
    }

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
    public void start() throws ConfigError, RuntimeError {
        initialize();
    }
    
    private void initialize() throws ConfigError {
        synchronized (isStarted) {
            if (isStarted.compareAndSet(false, true)) {
                eventHandlingStrategy.setExecutor(longLivedExecutor);
                createSessionInitiators();
                for (Session session : getSessionMap().values()) {
                    Session.registerSession(session);
                }
                startInitiators();
                eventHandlingStrategy.blockInThread();
            }
        }
    }

    @Override
    public void stop(boolean forceDisconnect) {
        synchronized (isStarted) {
            if (isStarted.compareAndSet(true, false)) {
                try {
                    logoutAllSessions(forceDisconnect);
                    stopInitiators();
                } finally {
                    try {
                        eventHandlingStrategy.stopHandlingMessages(true);
                    } finally {
                        Session.unregisterSessions(getSessions(), true);
                        clearConnectorSessions();
                    }
                }
            }
        }
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }

}
