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

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.mina.protocol.ProtocolProvider;
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
import quickfix.RuntimeError;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;

public abstract class AbstractSocketInitiator extends SessionConnector implements Initiator {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        this(settings, new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory));
    }

    protected AbstractSocketInitiator(SessionSettings settings, SessionFactory sessionFactory)
            throws ConfigError {
        super(settings, sessionFactory);
        try {
            createSessions();
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    protected void initiateSessions(EventHandlingStrategy eventHandlingStrategy) throws ConfigError {
        try {
            Iterator sessionItr = getSessionMap().values().iterator();
            while (sessionItr.hasNext()) {
                Session quickfixSession = (Session) sessionItr.next();
                SessionID sessionID = quickfixSession.getSessionID();
                int reconnectingInterval = getReconnectIntervalInSeconds(sessionID);
                SocketAddress[] socketAddresses = getSocketAddresses(sessionID);
                NetworkingOptions networkingOptions = new NetworkingOptions(getSettings()
                        .getSessionProperties(sessionID));
                ProtocolProvider protocolProvider = new InitiatorProtocolProvider(quickfixSession,
                        networkingOptions, eventHandlingStrategy);
                ProtocolSessionInitiator protocolSessionInitiator = new ProtocolSessionInitiator(
                        quickfixSession, protocolProvider, socketAddresses, reconnectingInterval,
                        getScheduledExecutorService());
                protocolSessionInitiator.connect();
            }
            startSessionTimer();
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        }
    }

    private void createSessions() throws ConfigError, FieldConvertError {
        SessionSettings settings = getSettings();
        boolean continueInitOnError = false;
        if (settings.isSetting(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR)) {
            continueInitOnError = settings.getBool(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR);
        }

        Map initiatorSessions = new HashMap();
        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
            SessionID sessionID = (SessionID) i.next();
            if (isInitiatorSession(sessionID)) {
                try {
                    Session quickfixSession = createSession(sessionID);
                    initiatorSessions.put(sessionID, quickfixSession);
                } catch (Throwable e) {
                    if (continueInitOnError) {
                        log.error("error during session initialization, continuing...", e);
                    } else {
                        throw new RuntimeError("error during session initialization", e);
                    }
                }
            }
        }
        if (initiatorSessions.isEmpty()) {
            throw new ConfigError("no initiators in settings");
        }
        setSessions(initiatorSessions);
    }

    private int getReconnectIntervalInSeconds(SessionID sessionID) throws ConfigError {
        int reconnectInterval = 30;
        SessionSettings settings = getSettings();
        if (settings.isSetting(sessionID, Initiator.SETTING_RECONNECT_INTERVAL)) {
            try {
                reconnectInterval = (int) settings.getLong(sessionID,
                        Initiator.SETTING_RECONNECT_INTERVAL);
            } catch (FieldConvertError e) {
                throw new ConfigError(e);
            }
        }
        return reconnectInterval;
    }

    private SocketAddress[] getSocketAddresses(SessionID sessionID) throws ConfigError {
        SessionSettings settings = getSettings();
        ArrayList addresses = new ArrayList();
        for (int index = 0;; index++) {
            try {
                String hostKey = Initiator.SETTING_SOCKET_CONNECT_HOST
                        + (index == 0 ? "" : Integer.toString(index));
                String portKey = Initiator.SETTING_SOCKET_CONNECT_PORT
                        + (index == 0 ? "" : Integer.toString(index));
                if (settings.isSetting(sessionID, hostKey)
                        && settings.isSetting(sessionID, portKey)) {
                    String host = settings.getString(sessionID, hostKey);
                    int port = (int) settings.getLong(sessionID, portKey);
                    addresses.add(new InetSocketAddress(host, port));
                } else {
                    break;
                }
            } catch (FieldConvertError e) {
                throw (ConfigError) new ConfigError(e.getMessage()).initCause(e);
            }
        }

        return (SocketAddress[]) addresses.toArray(new SocketAddress[addresses.size()]);
    }

    private boolean isInitiatorSession(Object sectionKey) throws ConfigError, FieldConvertError {
        SessionSettings settings = getSettings();
        return !settings.isSetting((SessionID) sectionKey, SessionFactory.SETTING_CONNECTION_TYPE)
                || settings.getString((SessionID) sectionKey,
                        SessionFactory.SETTING_CONNECTION_TYPE).equals("initiator");
    }

    public boolean isLoggedOn(SessionID sessionID) {
        Session session = Session.lookupSession(sessionID);
        return session != null && session.isLoggedOn();
    }
}
