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

import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.buffer.SimpleBufferAllocator;
import org.apache.mina.filter.ssl.SslFilter;
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
import quickfix.mina.ssl.SSLContextFactory;
import quickfix.mina.ssl.SSLSupport;

/**
 * Abstract base class for socket acceptors.
 */
public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final Map<SocketAddress, AcceptorSessionProvider> sessionProviders = new HashMap<SocketAddress, AcceptorSessionProvider>();
    private final SessionFactory sessionFactory;
    private final Map<SocketAddress, AcceptorSocketDescriptor> socketDescriptorForAddress = new HashMap<SocketAddress, AcceptorSocketDescriptor>();
    private final Map<AcceptorSocketDescriptor, IoAcceptor> ioAcceptors = new HashMap<AcceptorSocketDescriptor, IoAcceptor>();

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

        SocketAddress address = null;
        try {
            createSessions(getSettings());
            startSessionTimer();

            for (AcceptorSocketDescriptor socketDescriptor : socketDescriptorForAddress.values()) {
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
                log.info("Listening for connections at " + address + " for session(s) "
                        + socketDescriptor.getAcceptedSessions().keySet());
            }
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        } catch (Exception e) {
            log.error("Cannot start acceptor session for " + address + ", error:" + e);
            throw new RuntimeError(e);
        }
    }

    private void installSSL(AcceptorSocketDescriptor descriptor,
            CompositeIoFilterChainBuilder ioFilterChainBuilder) throws GeneralSecurityException {
        log.info("Installing SSL filter for " + descriptor.getAddress());
        SSLContext sslContext = SSLContextFactory.getInstance(descriptor.getKeyStoreName(),
                descriptor.getKeyStorePassword().toCharArray());
        SslFilter sslFilter = new SslFilter(sslContext);
        sslFilter.setUseClientMode(false);
        ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
    }

    private IoAcceptor getIoAcceptor(AcceptorSocketDescriptor socketDescriptor, boolean init) throws ConfigError {
        int transportType = ProtocolFactory.getAddressTransportType(socketDescriptor.getAddress());
        AcceptorSessionProvider sessionProvider = sessionProviders.get(socketDescriptor.getAddress());
        if (sessionProvider == null) {
            sessionProvider = new DefaultAcceptorSessionProvider(socketDescriptor.getAcceptedSessions());
            sessionProviders.put(socketDescriptor.getAddress(), sessionProvider);
        }

        IoAcceptor ioAcceptor = ioAcceptors.get(socketDescriptor);
        if (ioAcceptor == null && init) {
            ioAcceptor = ProtocolFactory.createIoAcceptor(transportType);
            try {
                SessionSettings settings = getSettings();
                ioAcceptor.setHandler(new AcceptorIoHandler(sessionProvider, new NetworkingOptions(
                        settings.getDefaultProperties()), getEventHandlingStrategy()));
            } catch (FieldConvertError e) {
                throw new ConfigError(e);
            }
            ioAcceptors.put(socketDescriptor, ioAcceptor);
        }
        return ioAcceptor;
    }

    private IoAcceptor getIoAcceptor(AcceptorSocketDescriptor socketDescriptor) throws ConfigError {
        return getIoAcceptor(socketDescriptor, true);
    }

    private AcceptorSocketDescriptor getAcceptorSocketDescriptor(SessionSettings settings,
            SessionID sessionID) throws ConfigError, FieldConvertError {
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
        String keyStoreName = null;
        String keyStorePassword = null;
        if (getSettings().isSetting(sessionID, SSLSupport.SETTING_USE_SSL)
                && getSettings().getBool(sessionID, SSLSupport.SETTING_USE_SSL)) {
            if (acceptTransportType == ProtocolFactory.SOCKET) {
                useSSL = true;
                keyStoreName = SSLSupport.getKeystoreName(getSettings(), sessionID);
                keyStorePassword = SSLSupport.getKeystorePasswd(getSettings(), sessionID);
            } else {
                log.warn("SSL will not be enabled for transport type=" + acceptTransportType
                        + ", session=" + sessionID);
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
        AcceptorSocketDescriptor descriptor = socketDescriptorForAddress
                .get(acceptorAddress);
        if (descriptor != null) {
            if (descriptor.isUseSSL() && !useSSL
                    || !equals(descriptor.getKeyStoreName(), keyStoreName)
                    || !equals(descriptor.getKeyStorePassword(), keyStorePassword)) {
                throw new ConfigError("Conflicting configurations of acceptor socket: "
                        + acceptorAddress);
            }
        } else {
            descriptor = new AcceptorSocketDescriptor(acceptorAddress, useSSL, keyStoreName,
                    keyStorePassword);
            socketDescriptorForAddress.put(acceptorAddress, descriptor);
        }

        return descriptor;
    }

    private boolean equals(Object object1, Object object2) {
        return object1 == null ? object2 == null : object1.equals(object2);
    }

    private void createSessions(SessionSettings settings) throws ConfigError, FieldConvertError {
        HashMap<SessionID, Session> allSessions = new HashMap<SessionID, Session>();
        for (Iterator<SessionID> i = settings.sectionIterator(); i.hasNext();) {
            SessionID sessionID = i.next();
            String connectionType = settings.getString(sessionID,
                    SessionFactory.SETTING_CONNECTION_TYPE);

            boolean isTemplate = false;
            if (settings.isSetting(sessionID, Acceptor.SETTING_ACCEPTOR_TEMPLATE)) {
                isTemplate = settings.getBool(sessionID, Acceptor.SETTING_ACCEPTOR_TEMPLATE);
            }

            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)) {
                AcceptorSocketDescriptor descriptor = getAcceptorSocketDescriptor(settings, sessionID);
                if (!isTemplate) {
                    Session session = sessionFactory.create(sessionID, settings);
                    descriptor.acceptSession(session);
                    allSessions.put(sessionID, session);
                }
            }
        }
        setSessions(allSessions);

        if (socketDescriptorForAddress.size() == 0) {
            throw new ConfigError("No acceptor sessions found in settings.");
        }
    }

    // XXX does this need to by synchronized?
    protected void stopAcceptingConnections() throws ConfigError {
        Iterator<IoAcceptor> ioIt = ioAcceptors.values().iterator();
        while (ioIt.hasNext()) {
            IoAcceptor ioAcceptor = ioIt.next();
            SocketAddress localAddress = ioAcceptor.getLocalAddress();
            ioAcceptor.unbind();
            log.info("No longer accepting connections on " + localAddress);
            ioIt.remove();
        }
    }

    private static class AcceptorSocketDescriptor {
        private final SocketAddress address;
        private final boolean useSSL;
        private final String keyStoreName;
        private final String keyStorePassword;
        private final Map<SessionID, Session> acceptedSessions = new HashMap<SessionID, Session>();

        public AcceptorSocketDescriptor(SocketAddress address, boolean useSSL, String keyStoreName,
                String keyStorePassword) {
            this.address = address;
            this.useSSL = useSSL;
            this.keyStoreName = keyStoreName;
            this.keyStorePassword = keyStorePassword;
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

        public String getKeyStoreName() {
            return keyStoreName;
        }

        public String getKeyStorePassword() {
            return keyStorePassword;
        }

        public boolean isUseSSL() {
            return useSSL;
        }
    }

    public Collection<IoAcceptor> getEndpoints() {
        return ioAcceptors.values();
    }

    public Map<SessionID, SocketAddress> getAcceptorAddresses() {
        Map<SessionID, SocketAddress> sessionIdToAddressMap = new HashMap<SessionID, SocketAddress>();
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
