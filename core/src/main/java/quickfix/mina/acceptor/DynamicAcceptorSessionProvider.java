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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.quickfixj.QFJException;

import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.acceptor.AcceptorSessionProvider;

/**
 * Dynamically defines sessions for an acceptor. This can be useful for
 * applications like simulators that want to accept any connection and
 * dynamically create an associated session. 
 */
public class DynamicAcceptorSessionProvider implements AcceptorSessionProvider {
    private final SessionSettings settings;
    private final SessionID templateID;
    private final SessionFactory sessionFactory;
    private final Map acceptorSessions = new HashMap();

    /**
     * 
     * @param settings session settings
     * @param templateID this is a session ID for a session definition in the session 
     * settings that will be used for default dynamic session values. The BeginString, 
     * SenderCompID, and TargetCompID settings will be replaced with those in the 
     * received logon message.
     * @param application application for the dynamic sessions
     * @param messageStoreFactory message store factory for the dynamic sessions
     * @param logFactory log factory for the dynamic sessions
     * @param messageFactory message factory for the dynamic sessions
     */
    public DynamicAcceptorSessionProvider(final SessionSettings settings,
            final SessionID templateID, quickfix.Application application,
            MessageStoreFactory messageStoreFactory, LogFactory logFactory,
            MessageFactory messageFactory) {
        this.settings = settings;
        this.templateID = templateID;
        sessionFactory = new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory);
    }

    public synchronized Session getSession(SessionID sessionID) {
        Session s = (Session) acceptorSessions.get(sessionID);
        if (s == null) {
            try {
                SessionSettings dynamicSettings = new SessionSettings();
                copySettings(dynamicSettings, settings.getDefaultProperties());
                copySettings(dynamicSettings, settings.getSessionProperties(templateID));
                dynamicSettings.setString("BeginString", sessionID.getBeginString());
                dynamicSettings.setString("SenderCompID", sessionID.getSenderCompID());
                dynamicSettings.setString("TargetCompID", sessionID.getTargetCompID());
                s = sessionFactory.create(sessionID, dynamicSettings);
            } catch (ConfigError e) {
                throw new QFJException(e);
            }
            acceptorSessions.put(sessionID, s);
        }
        return s;
    }

    private void copySettings(SessionSettings settings, Properties properties) {
        Iterator entries = properties.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry e = (Map.Entry) entries.next();
            settings.setString((String) e.getKey(), e.getValue().toString());
        }
    }
}
