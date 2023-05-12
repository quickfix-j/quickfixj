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

package quickfix.mina.acceptor;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.buffer.SimpleBufferAllocator;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.FieldConvertError;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.CompositeIoFilterChainBuilder;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;
import quickfix.mina.message.FIXProtocolCodecFactory;
import quickfix.mina.ssl.SSLConfig;
import quickfix.mina.ssl.SSLContextFactory;
import quickfix.mina.ssl.SSLFilter;
import quickfix.mina.ssl.SSLSupport;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Abstract base class for socket acceptors.
 */
public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final Map<SocketAddress, AcceptorSessionProvider> sessionProviders = new HashMap<>();
    private final SessionFactory sessionFactory;
    private final Map<SocketAddress, AcceptorSocketDescriptor> socketDescriptorForAddress = new HashMap<>();
    private final ConcurrentMap<AcceptorSocketDescriptor, IoAcceptor> ioAcceptors = new ConcurrentHashMap<>();

    protected AbstractSocketAcceptor(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        super(settings, sessionFactory);
        IoBuffer.setAllocator(new SimpleBufferAllocator());
        IoBuffer.setUseDirectBuffer(false);
        this.sessionFactory = sessionFactory;
    }

    protected AbstractSocketAcceptor(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    protected AbstractSocketAcceptor(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        this(settings, new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory));
    }

    // TODO SYNC Does this method really need synchronization?
    protected synchronized void startAcceptingConnections() throws ConfigError {

        boolean continueInitOnError = isContinueInitOnError();
        createSessions(getSettings(), continueInitOnError);
        startSessionTimer();

        SocketAddress address = null;
        for (AcceptorSocketDescriptor socketDescriptor : socketDescriptorForAddress.values()) {
            try {
                address = socketDescriptor.getAddress();
                IoAcceptor ioAcceptor = getIoAcceptor(socketDescriptor);
                CompositeIoFilterChainBuilder ioFilterChainBuilder = new CompositeIoFilterChainBuilder(getIoFilterChainBuilder());

                if (socketDescriptor.isUseSSL()) {
                    installSSL(socketDescriptor, ioFilterChainBuilder);
                }

                ioFilterChainBuilder.addLast(FIXProtocolCodecFactory.FILTER_NAME,
                        new ProtocolCodecFilter(new FIXProtocolCodecFactory()));

                ioAcceptor.setFilterChainBuilder(ioFilterChainBuilder);
                ioAcceptor.setCloseOnDeactivation(false);
                ioAcceptor.bind(socketDescriptor.getAddress());
                log.info("Listening for connections at {} for session(s) {}", address, socketDescriptor.getAcceptedSessions().keySet());
            } catch (IOException | GeneralSecurityException | ConfigError e) {
                if (continueInitOnError) {
                    log.warn("error during session initialization for session(s) {}, continuing...", socketDescriptor.getAcceptedSessions().keySet(), e);
                } else {
                    log.error("Cannot start acceptor session for {}, error: {}", address, e);
                    throw new RuntimeError(e);
                }
            }
        }
    }

    private void installSSL(AcceptorSocketDescriptor descriptor,
            CompositeIoFilterChainBuilder ioFilterChainBuilder) throws GeneralSecurityException {
        log.info("Installing SSL filter for {}", descriptor.getAddress());
        SSLConfig sslConfig = descriptor.getSslConfig();
        SSLContext sslContext = SSLContextFactory.getInstance(sslConfig);
        SSLFilter sslFilter = new SSLFilter(sslContext);
        sslFilter.setNeedClientAuth(sslConfig.isNeedClientAuth());
        sslFilter.setEnabledCipherSuites(sslConfig.getEnabledCipherSuites() != null ? sslConfig.getEnabledCipherSuites()
                : SSLSupport.getDefaultCipherSuites(sslContext));
        sslFilter.setEnabledProtocols(sslConfig.getEnabledProtocols() != null ? sslConfig.getEnabledProtocols()
                : SSLSupport.getSupportedProtocols(sslContext));
        ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
    }

    private IoAcceptor getIoAcceptor(AcceptorSocketDescriptor socketDescriptor) throws ConfigError {
        int transportType = ProtocolFactory.getAddressTransportType(socketDescriptor.getAddress());
        AcceptorSessionProvider sessionProvider = sessionProviders.
                computeIfAbsent(socketDescriptor.getAddress(),
                        k -> new DefaultAcceptorSessionProvider(socketDescriptor.getAcceptedSessions()));

        IoAcceptor ioAcceptor = ioAcceptors.get(socketDescriptor);
        if (ioAcceptor == null) {
            ioAcceptor = ProtocolFactory.createIoAcceptor(transportType);
            try {
                SessionSettings settings = getSettings();
                NetworkingOptions networkingOptions = new NetworkingOptions(settings.getDefaultProperties());
                networkingOptions.apply(ioAcceptor);
                ioAcceptor.setHandler(new AcceptorIoHandler(sessionProvider, settings, networkingOptions, getEventHandlingStrategy()));
            } catch (FieldConvertError e) {
                throw new ConfigError(e);
            }
            ioAcceptors.put(socketDescriptor, ioAcceptor);
        }
        return ioAcceptor;
    }

    private void setupSession(SessionSettings settings, SessionID sessionID, boolean isTemplate, Map<SessionID, Session> allSessions)
            throws ConfigError, FieldConvertError {
        int acceptTransportType = ProtocolFactory.SOCKET;
        if (settings.isSetting(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL)) {
            try {
                acceptTransportType = ProtocolFactory.getTransportType(settings.getString(
                        sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL));
            } catch (IllegalArgumentException e) {
                // Unknown transport type
                throw new ConfigError(e);
            }
        }

        boolean useSSL = false;
        SSLConfig sslConfig = null;
        if (getSettings().isSetting(sessionID, SSLSupport.SETTING_USE_SSL)
                && getSettings().getBool(sessionID, SSLSupport.SETTING_USE_SSL)) {
            if (acceptTransportType == ProtocolFactory.SOCKET) {
                useSSL = true;
                sslConfig = SSLSupport.getSslConfig(getSettings(), sessionID);
            } else {
                log.warn("SSL will not be enabled for transport type={}, session={}", acceptTransportType, sessionID);
            }
        }

        int acceptPort = (int) settings.getLong(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PORT);

        String acceptHost = null;
        if (settings.isSetting(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS)) {
            acceptHost = settings.getString(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS);
        }

        SocketAddress acceptorAddress = ProtocolFactory.createSocketAddress(acceptTransportType,
                acceptHost, acceptPort);

        // Check for cached descriptor
        AcceptorSocketDescriptor descriptor = socketDescriptorForAddress.get(acceptorAddress);
        if (descriptor != null) {
            if (descriptor.isUseSSL() != useSSL || !equals(sslConfig, descriptor.getSslConfig())) {
                throw new ConfigError("Conflicting configurations of acceptor socket: " + acceptorAddress);
            }
        } else {
            descriptor = new AcceptorSocketDescriptor(acceptorAddress, useSSL, sslConfig);
            socketDescriptorForAddress.put(acceptorAddress, descriptor);
        }

        if (!isTemplate) {
            Session session = sessionFactory.create(sessionID, settings);
            descriptor.acceptSession(session);
            allSessions.put(sessionID, session);
        }
    }

    private boolean equals(Object object1, Object object2) {
        return object1 == null ? object2 == null : object1.equals(object2);
    }

    private void createSessions(SessionSettings settings, boolean continueInitOnError) throws ConfigError {
        Map<SessionID, Session> allSessions = new HashMap<>();
        for (Iterator<SessionID> i = settings.sectionIterator(); i.hasNext();) {
            SessionID sessionID = i.next();
            try {
                String connectionType = null;
                if (settings.isSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE)) {
                    connectionType = settings.getString(sessionID,
                            SessionFactory.SETTING_CONNECTION_TYPE);
                }

                if (SessionFactory.ACCEPTOR_CONNECTION_TYPE.equals(connectionType)) {
                    boolean isTemplate = false;
                    if (settings.isSetting(sessionID, Acceptor.SETTING_ACCEPTOR_TEMPLATE)) {
                        try {
                            isTemplate = settings.getBool(sessionID, Acceptor.SETTING_ACCEPTOR_TEMPLATE);
                        } catch (FieldConvertError | ConfigError ex) {
                            // ignore and use default
                        }
                    }

                    setupSession(settings, sessionID, isTemplate, allSessions);
                }
            } catch (Throwable t) {
                if (continueInitOnError) {
                    log.warn("error during session initialization for {}, continuing...", sessionID, t);
                } else {
                    throw t instanceof ConfigError ? (ConfigError) t : new ConfigError(
                            "error during session initialization", t);
                }
            }
        }
        setSessions(allSessions);

        if (socketDescriptorForAddress.isEmpty()) {
            throw new ConfigError("No acceptor sessions found in settings.");
        }
    }

    protected void stopAcceptingConnections() {
        Iterator<IoAcceptor> ioIt = getEndpoints().iterator();
        while (ioIt.hasNext()) {
            IoAcceptor ioAcceptor = ioIt.next();
            SocketAddress localAddress = ioAcceptor.getLocalAddress();
            ioAcceptor.unbind();
            closeManagedSessionsAndDispose(ioAcceptor, true, log);
            log.info("No longer accepting connections on {}", localAddress);
            ioIt.remove();
        }
    }

    private static class AcceptorSocketDescriptor {
        private final SocketAddress address;
        private final boolean useSSL;
        private final SSLConfig sslConfig;
        private final Map<SessionID, Session> acceptedSessions = new HashMap<>();

        public AcceptorSocketDescriptor(SocketAddress address, boolean useSSL, SSLConfig sslConfig) {
            this.address = address;
            this.useSSL = useSSL;
            this.sslConfig = sslConfig;
        }

        public void acceptSession(Session session) {
            acceptedSessions.put(session.getSessionID(), session);
        }

        public Map<SessionID, Session> getAcceptedSessions() {
            return Collections.unmodifiableMap(acceptedSessions);
        }

        public SocketAddress getAddress() {
            return address;
        }

        public boolean isUseSSL() {
            return useSSL;
        }

        public SSLConfig getSslConfig() {
            return sslConfig;
        }
    }

    public Collection<IoAcceptor> getEndpoints() {
        return ioAcceptors.values();
    }

    public Map<SessionID, SocketAddress> getAcceptorAddresses() {
        Map<SessionID, SocketAddress> sessionIdToAddressMap = new HashMap<>();
        for (AcceptorSocketDescriptor descriptor : socketDescriptorForAddress.values()) {
            for (SessionID sessionID : descriptor.getAcceptedSessions().keySet()) {
                sessionIdToAddressMap.put(sessionID, descriptor.getAddress());
            }
        }
        return sessionIdToAddressMap;
    }

    public void setSessionProvider(SocketAddress address, AcceptorSessionProvider provider) {
        sessionProviders.put(address, provider);
    }

    static class StaticAcceptorSessionProvider implements AcceptorSessionProvider {
        private final Map<SessionID, Session> acceptorSessions;

        public StaticAcceptorSessionProvider(final Map<SessionID, Session> acceptorSessions) {
            this.acceptorSessions = acceptorSessions;
        }

        public Session getSession(SessionID sessionID, SessionConnector connector) {
            return acceptorSessions.get(sessionID);
        }
    }

    public int getQueueSize() {
        final EventHandlingStrategy ehs = getEventHandlingStrategy();
        return ehs == null ? 0 : ehs.getQueueSize();
    }

    protected abstract EventHandlingStrategy getEventHandlingStrategy() ;

    private class DefaultAcceptorSessionProvider implements AcceptorSessionProvider {

        private final Map<SessionID, Session> acceptorSessions;

        public DefaultAcceptorSessionProvider(Map<SessionID, Session> acceptorSessions) {
            this.acceptorSessions = acceptorSessions;
        }

        public Session getSession(SessionID sessionID, SessionConnector ignored) {
            Session session = acceptorSessions.get(sessionID);
            if (session == null) {
                SessionID reduced = reduceSessionID(sessionID);
                session = acceptorSessions.get(reduced);
            }
            return session;
        }

        /**
         * Remove the extra fields added to the session ID in QF-272.
         */
        private SessionID reduceSessionID(SessionID sessionID) {
            // Acceptors don't use qualifiers.
            return new SessionID(sessionID.getBeginString(), sessionID.getSenderCompID(),
                    sessionID.getTargetCompID());
        }
    }

}
