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
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;

public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final SessionFactory sessionFactory;
    private IoAcceptor ioAcceptor;
    private SocketAddress acceptorSocketAddress;

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

            TransportType acceptTransportType = TransportType.SOCKET;
            if (settings.isSetting(Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL)) {
                try {
                    acceptTransportType = 
                        TransportType.getInstance(settings.getString(Acceptor.SETTING_SOCKET_ACCEPT_PROTOCOL));
                } catch (IllegalArgumentException e) {
                    // Unknown transport type
                    throw new ConfigError(e);
                }
            }

            int acceptPort = getIntSetting(Acceptor.SETTING_SOCKET_ACCEPT_PORT);
            String acceptHost = null;
            if (settings.isSetting(SETTING_SOCKET_ACCEPT_ADDRESS)) {
                acceptHost = settings.getString(SETTING_SOCKET_ACCEPT_ADDRESS);
            }

            acceptorSocketAddress = ProtocolFactory.createSocketAddress(acceptTransportType, acceptHost,
                    acceptPort);

            ioAcceptor = ProtocolFactory.createIoAcceptor(acceptorSocketAddress);
            ioAcceptor.bind(acceptorSocketAddress, new AcceptorIoHandler(getSessionMap(),
                    new NetworkingOptions(settings.getDefaultProperties()), eventHandlingStrategy));

            log.info("listening for connections at " + acceptorSocketAddress);
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    private void createSessions(SessionSettings settings) throws ConfigError, FieldConvertError {
        Map acceptorSessions = new HashMap();
        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
            Object sectionKey = i.next();
            SessionID sessionID = (SessionID) sectionKey;
            String connectionType = settings.getString(sessionID,
                    SessionFactory.SETTING_CONNECTION_TYPE);
            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)) {
                acceptorSessions.put(sessionID, sessionFactory.create(sessionID, settings));
            }
        }
        setSessions(acceptorSessions);

        if (acceptorSessions.size() == 0) {
            throw new ConfigError("No acceptor sessions found in settings.");
        }
    }

    protected void stopAcceptingConnections() {
        log.info("No longer accepting connections on " + acceptorSocketAddress);
        ioAcceptor.unbind(acceptorSocketAddress);
        acceptorSocketAddress = null;
    }
}