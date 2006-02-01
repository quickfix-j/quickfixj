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
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.mina.io.socket.SocketAcceptor;
import org.apache.mina.protocol.io.IoProtocolAcceptor;

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
import quickfix.mina.SessionConnector;

public abstract class AbstractSocketAcceptor extends SessionConnector implements Acceptor {
    private final SessionFactory sessionFactory;
    private IoProtocolAcceptor protocolAcceptor;
    private InetSocketAddress acceptorSocketAddress;

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
            int acceptPort = getIntSetting(Acceptor.SETTING_SOCKET_ACCEPT_PORT);
            if (settings.isSetting(SETTING_SOCKET_ACCEPT_ADDRESS)) {
                String acceptorHost = settings.getString(SETTING_SOCKET_ACCEPT_ADDRESS);
                acceptorSocketAddress = new InetSocketAddress(acceptorHost, acceptPort);
            } else {
                acceptorSocketAddress = new InetSocketAddress(acceptPort);
            }

            protocolAcceptor = new IoProtocolAcceptor(new SocketAcceptor());
            protocolAcceptor.bind(acceptorSocketAddress, new AcceptorProtocolProvider(
                    getSessionMap(), new NetworkingOptions(settings.getDefaultProperties()),
                    eventHandlingStrategy));

            log.info("listening for connections on port " + acceptorSocketAddress);
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
        protocolAcceptor.unbind(acceptorSocketAddress);
        acceptorSocketAddress = null;
    }
}