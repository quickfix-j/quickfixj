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

package quickfix.mina.initiator;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.SimpleByteBufferAllocator;
import org.apache.mina.common.TransportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.FieldConvertError;
import quickfix.Initiator;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.field.converter.BooleanConverter;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;
import quickfix.mina.ssl.SSLSupport;

/**
 * Abstract base class for socket initiators.
 */
public abstract class AbstractSocketInitiator extends SessionConnector implements Initiator {

    protected final Logger log = LoggerFactory.getLogger(getClass());
    private final Set<IoSessionInitiator> initiators = new HashSet<IoSessionInitiator>();

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        this(settings, new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory));
    }

    protected AbstractSocketInitiator(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        super(settings, sessionFactory);
            ByteBuffer.setAllocator(new SimpleByteBufferAllocator());
            ByteBuffer.setUseDirectBuffers(false);
    }

    protected void createSessionInitiators()
            throws ConfigError {
        try {
            createSessions();
            SessionSettings settings = getSettings();
            for (final Session session : getSessionMap().values()) {
                final SessionID sessionID = session.getSessionID();
                final int[] reconnectingIntervals = getReconnectIntervalInSeconds(sessionID);

                final SocketAddress[] socketAddresses = getSocketAddresses(sessionID);
                if (socketAddresses.length == 0) {
                    throw new ConfigError("Must specify at least one socket address");
                }
                
                SocketAddress localAddress = getLocalAddress(settings, sessionID);

                final NetworkingOptions networkingOptions = new NetworkingOptions(getSettings()
                        .getSessionProperties(sessionID, true));

                boolean sslEnabled = false;
                if (getSettings().isSetting(sessionID, SSLSupport.SETTING_USE_SSL)) {
                    sslEnabled = BooleanConverter.convert(getSettings().getString(sessionID,
                            SSLSupport.SETTING_USE_SSL));
                }
                final String keyStoreName = SSLSupport.getKeystoreName(getSettings(), sessionID);
                final String keyStorePassword = SSLSupport.getKeystorePasswd(getSettings(),
                        sessionID);
                final String strEnableProtocole = SSLSupport.getEnableProtocole(getSettings(),
                        sessionID);
                final String[] enableProtocole = strEnableProtocole != null ? strEnableProtocole
                        .split(",") : null;
                final String strCipherSuites = SSLSupport.getCipherSuite(getSettings(), sessionID);
                final String[] cipherSuites = strCipherSuites != null
                        ? strCipherSuites.split(",")
                        : null;

                final IoSessionInitiator ioSessionInitiator = new IoSessionInitiator(session,
                        socketAddresses, localAddress, reconnectingIntervals, getScheduledExecutorService(),
                        networkingOptions, getEventHandlingStrategy(), getIoFilterChainBuilder(),
                        sslEnabled, keyStoreName, keyStorePassword, enableProtocole, cipherSuites);

                initiators.add(ioSessionInitiator);
            }
        } catch (final FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    //QFJ-482
    private SocketAddress getLocalAddress(SessionSettings settings, final SessionID sessionID)
            throws ConfigError, FieldConvertError {
        // Check if use of socket local/bind address
        SocketAddress localAddress = null;
        if (settings.isSetting(sessionID, Initiator.SETTING_SOCKET_LOCAL_HOST)) {
            String host = settings.getString(sessionID, Initiator.SETTING_SOCKET_LOCAL_HOST);
            if ("localhost".equals(host)) {
                throw new ConfigError(Initiator.SETTING_SOCKET_LOCAL_HOST + " cannot be \"localhost\"!");
            }
            int port = 0;
            if (settings.isSetting(sessionID, Initiator.SETTING_SOCKET_LOCAL_PORT)) {
                port = (int) settings.getLong(sessionID, Initiator.SETTING_SOCKET_LOCAL_PORT);
            }
            localAddress = ProtocolFactory.createSocketAddress(TransportType.SOCKET, host, port);
            if (log.isInfoEnabled()) {
                log.info("Using initiator local host: " + localAddress);
            }
        }
        return localAddress;
    }

    private void createSessions() throws ConfigError, FieldConvertError {
        final SessionSettings settings = getSettings();
        boolean continueInitOnError = false;
        if (settings.isSetting(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR)) {
            continueInitOnError = settings.getBool(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR);
        }

        final Map<SessionID, Session> initiatorSessions = new HashMap<SessionID, Session>();
        for (final Iterator<SessionID> i = settings.sectionIterator(); i.hasNext();) {
            final SessionID sessionID = i.next();
            if (isInitiatorSession(sessionID)) {
                try {
                    final Session quickfixSession = createSession(sessionID);
                    initiatorSessions.put(sessionID, quickfixSession);
                } catch (final Throwable e) {
                    if (continueInitOnError) {
                        log.error("error during session initialization, continuing...", e);
                    } else {
                        throw e instanceof ConfigError ? (ConfigError) e : new ConfigError(
                                "error during session initialization", e);
                    }
                }
            }
        }
        if (initiatorSessions.isEmpty()) {
            throw new ConfigError("no initiators in settings");
        }
        setSessions(initiatorSessions);
    }

    private int[] getReconnectIntervalInSeconds(SessionID sessionID) throws ConfigError {
        final SessionSettings settings = getSettings();
        if (settings.isSetting(sessionID, Initiator.SETTING_RECONNECT_INTERVAL)) {
            try {
                final String raw = settings.getString(sessionID,
                        Initiator.SETTING_RECONNECT_INTERVAL);
                final int[] ret = SessionSettings.parseSettingReconnectInterval(raw);
                if (ret != null) {
                    return ret;
                }
            } catch (final Throwable e) {
                throw new ConfigError(e);
            }
        }
        return new int[] { 30 };
    }

    private SocketAddress[] getSocketAddresses(SessionID sessionID) throws ConfigError {
        final SessionSettings settings = getSettings();
        final ArrayList<SocketAddress> addresses = new ArrayList<SocketAddress>();
        for (int index = 0;; index++) {
            try {
                final String protocolKey = Initiator.SETTING_SOCKET_CONNECT_PROTOCOL
                        + (index == 0 ? "" : Integer.toString(index));
                final String hostKey = Initiator.SETTING_SOCKET_CONNECT_HOST
                        + (index == 0 ? "" : Integer.toString(index));
                final String portKey = Initiator.SETTING_SOCKET_CONNECT_PORT
                        + (index == 0 ? "" : Integer.toString(index));
                TransportType transportType = TransportType.SOCKET;
                if (settings.isSetting(sessionID, protocolKey)) {
                    try {
                        transportType = TransportType.getInstance(settings.getString(sessionID,
                                protocolKey));
                    } catch (final IllegalArgumentException e) {
                        // Unknown transport type
                        throw new ConfigError(e);
                    }
                }
                if (settings.isSetting(sessionID, portKey)) {
                    String host;
                    if (!isHostRequired(transportType)) {
                        host = "localhost";
                    } else {
                        host = settings.getString(sessionID, hostKey);
                    }
                    final int port = (int) settings.getLong(sessionID, portKey);
                    addresses.add(ProtocolFactory.createSocketAddress(transportType, host, port));
                } else {
                    break;
                }
            } catch (final FieldConvertError e) {
                throw (ConfigError) new ConfigError(e.getMessage()).initCause(e);
            }
        }

        return addresses.toArray(new SocketAddress[addresses.size()]);
    }

    private boolean isHostRequired(TransportType transportType) {
        return transportType != TransportType.VM_PIPE;
    }

    private boolean isInitiatorSession(Object sectionKey) throws ConfigError, FieldConvertError {
        final SessionSettings settings = getSettings();
        return !settings.isSetting((SessionID) sectionKey, SessionFactory.SETTING_CONNECTION_TYPE)
                || settings.getString((SessionID) sectionKey,
                        SessionFactory.SETTING_CONNECTION_TYPE).equals("initiator");
    }

    protected void startInitiators() {
        startSessionTimer();
        for (final IoSessionInitiator initiator : initiators) {
            initiator.start();
        }
    }

    protected void stopInitiators() {
        for (final IoSessionInitiator initiator : initiators) {
            initiator.stop();
        }
        super.stopSessionTimer();
    }

    public Set<IoSessionInitiator> getInitiators() {
        return Collections.unmodifiableSet(initiators);
    }

    public int getQueueSize() {
        final EventHandlingStrategy ehs = getEventHandlingStrategy();
        return ehs == null ? 0 : ehs.getQueueSize();
    }

    protected abstract EventHandlingStrategy getEventHandlingStrategy() ;
}
