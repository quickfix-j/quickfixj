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

import java.io.IOException;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.TransportType;

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
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;

/**
 * Abstract base class for socket acceptors.
 */
public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final SessionFactory sessionFactory;
    private Map sessionsForAcceptorAddress = new HashMap();
    private Map ioAcceptorForTransport = new HashMap();

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

    protected synchronized void startAcceptingConnections(
            EventHandlingStrategy eventHandlingStrategy) throws ConfigError {
        try {
            startSessionTimer();

            SessionSettings settings = getSettings();
            //
            Iterator addressItr = sessionsForAcceptorAddress.entrySet().iterator();
            while (addressItr.hasNext()) {
                Map.Entry entry = (Map.Entry) addressItr.next();
                SocketAddress acceptorSocketAddress = (SocketAddress) entry.getKey();
                IoAcceptor ioAcceptor = getIoAcceptor(acceptorSocketAddress);
                ioAcceptor.bind(acceptorSocketAddress, new AcceptorIoHandler(
                        getSessionsForAddress(acceptorSocketAddress), new NetworkingOptions(
                                settings.getDefaultProperties()), eventHandlingStrategy));
                log.info("Listening for connections at " + acceptorSocketAddress);
            }
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
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

    private SocketAddress getAcceptorSocketAddress(SessionSettings settings, SessionID sessionID)
            throws ConfigError, FieldConvertError {
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

        int acceptPort = (int) settings.getLong(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PORT);
        String acceptHost = null;
        if (settings.isSetting(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS)) {
            acceptHost = settings.getString(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS);
        }

        SocketAddress acceptorSocketAddress = ProtocolFactory.createSocketAddress(
                acceptTransportType, acceptHost, acceptPort);
        return acceptorSocketAddress;
    }

    private void createSessions(SessionSettings settings) throws ConfigError, FieldConvertError {
        HashMap allSessions = new HashMap();
        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
            SessionID sessionID = (SessionID) i.next();
            String connectionType = settings.getString(sessionID,
                    SessionFactory.SETTING_CONNECTION_TYPE);
            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)) {
                Map sessionsForAddress = getSessionsForAddress(getAcceptorSocketAddress(settings,
                        sessionID));
                Session session = sessionFactory.create(sessionID, settings);
                sessionsForAddress.put(sessionID, session);
                allSessions.put(sessionID, session);
            }
        }
        setSessions(allSessions);

        if (sessionsForAcceptorAddress.size() == 0) {
            throw new ConfigError("No acceptor sessions found in settings.");
        }
    }

    private Map getSessionsForAddress(SocketAddress address) {
        Map acceptorSessions = (Map) sessionsForAcceptorAddress.get(address);
        if (acceptorSessions == null) {
            acceptorSessions = new HashMap();
            sessionsForAcceptorAddress.put(address, acceptorSessions);
        }
        return acceptorSessions;
    }

    protected void stopAcceptingConnections() {
        Iterator addressItr = sessionsForAcceptorAddress.entrySet().iterator();
        while (addressItr.hasNext()) {
            Map.Entry entry = (Map.Entry) addressItr.next();
            SocketAddress acceptorSocketAddress = (SocketAddress) entry.getKey();
            log.info("No longer accepting connections on " + acceptorSocketAddress);
            IoAcceptor ioAcceptor = getIoAcceptor(acceptorSocketAddress);
            ioAcceptor.unbind(acceptorSocketAddress);
        }
        ioAcceptorForTransport.clear();
    }
}