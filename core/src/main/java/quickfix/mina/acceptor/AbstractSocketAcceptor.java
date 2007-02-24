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

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.IoServiceConfig;
import org.apache.mina.common.ThreadModel;
import org.apache.mina.common.TransportType;
import org.apache.mina.filter.SSLFilter;
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
import quickfix.mina.ssl.AcceptorSSLContextFactory;
import quickfix.mina.ssl.SSLSupport;

/**
 * Abstract base class for socket acceptors.
 */
public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final SessionFactory sessionFactory;
    private final Map socketDescriptorForAddress = new HashMap();
    private final Map ioAcceptorForTransport = new HashMap();

    protected AbstractSocketAcceptor(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        super(settings, sessionFactory);
        this.sessionFactory = sessionFactory;
        try {
            createSessions(settings);
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
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
    protected synchronized void startAcceptingConnections(
            EventHandlingStrategy eventHandlingStrategy) throws ConfigError {
        try {
            startSessionTimer();
            SessionSettings settings = getSettings();

            Iterator descriptors = socketDescriptorForAddress.values().iterator();
            while (descriptors.hasNext()) {
                AcceptorSocketDescriptor socketDescriptor = (AcceptorSocketDescriptor) descriptors
                        .next();
                IoAcceptor ioAcceptor = getIoAcceptor(socketDescriptor.getAddress());
                IoServiceConfig serviceConfig = ioAcceptor.getDefaultConfig();
                CompositeIoFilterChainBuilder ioFilterChainBuilder = new CompositeIoFilterChainBuilder(
                        getIoFilterChainBuilder());

                if (socketDescriptor.isUseSSL()) {
                    installSSL(socketDescriptor, ioFilterChainBuilder);
                }

                ioFilterChainBuilder.addLast(FIXProtocolCodecFactory.FILTER_NAME,
                        new ProtocolCodecFilter(new FIXProtocolCodecFactory()));

                serviceConfig.setFilterChainBuilder(ioFilterChainBuilder);
                serviceConfig.setThreadModel(ThreadModel.MANUAL);
                ioAcceptor.bind(socketDescriptor.getAddress(), new AcceptorIoHandler(
                        socketDescriptor.getAcceptedSessions(), new NetworkingOptions(settings
                                .getDefaultProperties()), eventHandlingStrategy));
                log.info("Listening for connections at " + socketDescriptor.getAddress());
            }
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        } catch (Exception e) {
            throw new RuntimeError(e);
        }
    }

    private void installSSL(AcceptorSocketDescriptor descriptor,
            CompositeIoFilterChainBuilder ioFilterChainBuilder) throws GeneralSecurityException {
        log.info("Installing SSL filter for " + descriptor.getAddress());
        SSLContext sslContext = AcceptorSSLContextFactory.getInstance(descriptor.getKeyStoreName(),
                descriptor.getKeyStorePassword().toCharArray());
        SSLFilter sslFilter = new SSLFilter(sslContext);
        sslFilter.setUseClientMode(false);
        ioFilterChainBuilder.addLast(SSLSupport.FILTER_NAME, sslFilter);
    }

    private IoAcceptor getIoAcceptor(SocketAddress address) {
        TransportType transportType = ProtocolFactory.getAddressTransportType(address);
        IoAcceptor ioAcceptor = (IoAcceptor) ioAcceptorForTransport.get(transportType);
        if (ioAcceptor == null) {
            ioAcceptor = ProtocolFactory.createIoAcceptor(transportType);
            ioAcceptorForTransport.put(transportType, ioAcceptor);
        }
        return ioAcceptor;
    }

    private AcceptorSocketDescriptor getAcceptorSocketDescriptor(SessionSettings settings,
            SessionID sessionID) throws ConfigError, FieldConvertError {
        TransportType acceptTransportType = TransportType.SOCKET;
        if (settings.isSetting(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL)) {
            try {
                acceptTransportType = TransportType.getInstance(settings.getString(sessionID,
                        Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL));
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
            if (acceptTransportType == TransportType.SOCKET) {
                useSSL = true;

                if (getSettings().isSetting(sessionID, SSLSupport.SETTING_KEY_STORE_NAME)) {
                    keyStoreName = getSettings().getString(sessionID,
                            SSLSupport.SETTING_KEY_STORE_NAME);
                } else {
                    keyStoreName = "quickfixj.cert";
                }

                if (getSettings().isSetting(sessionID, SSLSupport.SETTING_KEY_STORE_PWD)) {
                    keyStorePassword = getSettings().getString(sessionID,
                            SSLSupport.SETTING_KEY_STORE_PWD);
                } else {
                    keyStorePassword = "quickfixjpw";
                }
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
        AcceptorSocketDescriptor descriptor = (AcceptorSocketDescriptor) socketDescriptorForAddress
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
        HashMap allSessions = new HashMap();
        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
            SessionID sessionID = (SessionID) i.next();
            String connectionType = settings.getString(sessionID,
                    SessionFactory.SETTING_CONNECTION_TYPE);
            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)) {
                Session session = sessionFactory.create(sessionID, settings);
                getAcceptorSocketDescriptor(settings, sessionID).acceptSession(session);
                allSessions.put(sessionID, session);
            }
        }
        setSessions(allSessions);

        if (socketDescriptorForAddress.size() == 0) {
            throw new ConfigError("No acceptor sessions found in settings.");
        }
    }

    protected void stopAcceptingConnections() {
        Iterator descriptors = socketDescriptorForAddress.values().iterator();
        while (descriptors.hasNext()) {
            AcceptorSocketDescriptor socketDescriptor = (AcceptorSocketDescriptor) descriptors
                    .next();
            SocketAddress acceptorSocketAddress = socketDescriptor.getAddress();
            log.info("No longer accepting connections on " + acceptorSocketAddress);
            IoAcceptor ioAcceptor = getIoAcceptor(acceptorSocketAddress);
            ioAcceptor.unbind(acceptorSocketAddress);
        }
        ioAcceptorForTransport.clear();
    }

    private static class AcceptorSocketDescriptor {
        private final SocketAddress address;
        private final boolean useSSL;
        private final String keyStoreName;
        private final String keyStorePassword;
        private final Map acceptedSessions = new HashMap();

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

        public Map getAcceptedSessions() {
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

    public Collection getEndpoints() {
        return ioAcceptorForTransport.values();
    }

    public Map getAcceptorAddresses() {
        Map sessionIdToAddressMap = new HashMap();
        Iterator descriptors = socketDescriptorForAddress.values().iterator();
        while (descriptors.hasNext()) {
            AcceptorSocketDescriptor descriptor = (AcceptorSocketDescriptor) descriptors.next();
            Iterator sessionIDs = descriptor.getAcceptedSessions().keySet().iterator();
            while (sessionIDs.hasNext()) {
                sessionIdToAddressMap.put(sessionIDs.next(), descriptor.getAddress());
            }
        }
        return sessionIdToAddressMap;
    }
}