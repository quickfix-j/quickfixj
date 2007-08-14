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

// TODO write a unit test for this provider

/**
 * Dynamically defines sessions for an acceptor. This can be useful for
 * applications like simulators that want to accept any connection and
 * dynamically create an associated session.
 * 
 * For more complex situations, you can use this class as a starting
 * point for implementing your own AcceptorSessionProvider.
 */
public class DynamicAcceptorSessionProvider implements AcceptorSessionProvider {
    private static final String WILDCARD = "*";
    private static final SessionID ANY_SESSION = new SessionID(WILDCARD, WILDCARD, WILDCARD);
    
    private final Map<SessionID, SessionID> templateIdMap;
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;

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
        this(settings, createSingletonTemplateIdMap(templateID), application, messageStoreFactory,
                logFactory, messageFactory);
    }

    private static Map<SessionID, SessionID> createSingletonTemplateIdMap(SessionID templateID) {
        Map<SessionID, SessionID> map = new HashMap<SessionID, SessionID>();
        map.put(ANY_SESSION, templateID);
        return map;
    }

    /**
     * @param settings session settings
     * @param templateIdMap this is a map of session ID patterns to session IDs in
     * the settings file that represent a template for that session ID pattern. Use
     * a "*" to represent a wildcard for a pattern element. For example, 
     * new SessionID("FIX.4.2", "*", "*") would match for any FIX 4.2 session ID.
     * This allows separate template session configurations for FIX versions (or
     * CompIDs) being accepted dynamically on a single TCP port.
     * @param application application for the dynamic sessions
     * @param messageStoreFactory message store factory for the dynamic sessions
     * @param logFactory log factory for the dynamic sessions
     * @param messageFactory message factory for the dynamic sessions
     */
    public DynamicAcceptorSessionProvider(final SessionSettings settings,
            Map<SessionID, SessionID> templateIdMap, quickfix.Application application,
            MessageStoreFactory messageStoreFactory, LogFactory logFactory,
            MessageFactory messageFactory) {
        this.settings = settings;
        this.templateIdMap = templateIdMap;
        sessionFactory = new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory);
    }

    public synchronized Session getSession(SessionID sessionID) {
        Session s = Session.lookupSession(sessionID);
        if (s == null) {
            try {
                SessionID templateID = lookupTemplateID(sessionID);
                if (templateID == null) {
                    throw new ConfigError("Unable to find a session template for "+sessionID);
                }
                SessionSettings dynamicSettings = new SessionSettings();
                copySettings(dynamicSettings, settings.getDefaultProperties());
                copySettings(dynamicSettings, settings.getSessionProperties(templateID));
                dynamicSettings.setString("BeginString", sessionID.getBeginString());
                dynamicSettings
                        .setString(SessionSettings.SENDERCOMPID, sessionID.getSenderCompID());
                dynamicSettings
                        .setString(SessionSettings.TARGETCOMPID, sessionID.getTargetCompID());
                s = sessionFactory.create(sessionID, dynamicSettings);
            } catch (ConfigError e) {
                throw new QFJException(e);
            }
        }
        return s;
    }

    private SessionID lookupTemplateID(SessionID sessionID) {
        for (Map.Entry<SessionID, SessionID> entry : templateIdMap.entrySet()) {
            if (isMatching(entry.getKey(), sessionID)) {
                return entry.getValue();
            }
        }
        return null;
    }

    private boolean isMatching(SessionID pattern, SessionID sessionID) {
        return isMatching(pattern.getBeginString(), sessionID.getBeginString())
                && isMatching(pattern.getSenderCompID(), sessionID.getSenderCompID())
                && isMatching(pattern.getTargetCompID(), sessionID.getTargetCompID());
    }

    private boolean isMatching(String pattern, String value) {
        return WILDCARD.equals(pattern) || (pattern != null && pattern.equals(value));
    }

    private void copySettings(SessionSettings settings, Properties properties) {
        Iterator<Map.Entry<Object, Object>> entries = properties.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Object, Object> e = entries.next();
            settings.setString((String) e.getKey(), e.getValue().toString());
        }
    }
}
