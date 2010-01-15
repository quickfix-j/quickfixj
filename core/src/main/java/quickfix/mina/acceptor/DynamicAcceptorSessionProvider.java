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

import static quickfix.SessionSettings.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
import quickfix.mina.SessionConnector;

/**
 * Dynamically defines sessions for an acceptor. This can be useful for
 * applications like simulators that want to accept any connection and
 * dynamically create an associated session.
 * 
 * For more complex situations, you can use this class as a starting
 * point for implementing your own AcceptorSessionProvider.
 */
public class DynamicAcceptorSessionProvider implements AcceptorSessionProvider {
    public static final String WILDCARD = "*";
    private static final SessionID ANY_SESSION = new SessionID(WILDCARD, WILDCARD, WILDCARD,
            WILDCARD, WILDCARD, WILDCARD, WILDCARD, null);

    private final List<TemplateMapping> templateMappings;
    protected final SessionSettings settings;
    protected final SessionFactory sessionFactory;

    /**
     * Mapping from a sessionID pattern to a session template ID.
     */
    public static class TemplateMapping {
        private final SessionID pattern;
        private final SessionID templateID;

        public TemplateMapping(SessionID pattern, SessionID templateID) {
            super();
            this.pattern = pattern;
            this.templateID = templateID;
        }

        public SessionID getPattern() {
            return pattern;
        }

        public SessionID getTemplateID() {
            return templateID;
        }

        @Override
        public String toString() {
            return "<" + pattern + "," + templateID + ">";
        }

    }

    /**
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
        this(settings, Collections.singletonList(new TemplateMapping(ANY_SESSION, templateID)),
                application, messageStoreFactory, logFactory, messageFactory);
    }

    /**
     * @param settings session settings
     * @param templateMappings this is a list of session ID patterns mapped to session IDs in
     * the settings file. The session IDs represent the template for a specified session ID 
     * pattern. The template is used to dynamically create acceptor sessions.
     * Use "*" to represent a wildcard for a pattern element. For example, 
     * new SessionID("FIX.4.2", "*", "*") would match for any FIX 4.2 session ID.
     * This allows separate template session configurations for FIX versions (or
     * CompIDs) being accepted dynamically on a single TCP port.
     * @param application application for the dynamic sessions
     * @param messageStoreFactory message store factory for the dynamic sessions
     * @param logFactory log factory for the dynamic sessions
     * @param messageFactory message factory for the dynamic sessions
     * @see TemplateMapping
     */
    public DynamicAcceptorSessionProvider(final SessionSettings settings,
            List<TemplateMapping> templateMappings, quickfix.Application application,
            MessageStoreFactory messageStoreFactory, LogFactory logFactory,
            MessageFactory messageFactory) {
        this.settings = settings;
        this.templateMappings = templateMappings;
        sessionFactory = new DefaultSessionFactory(application, messageStoreFactory, logFactory,
                messageFactory);
    }

    public synchronized Session getSession(SessionID sessionID, SessionConnector sessionConnector) {
        Session s = Session.lookupSession(sessionID);
        if (s == null) {
            try {
                SessionID templateID = lookupTemplateID(sessionID);
                if (templateID == null) {
                    throw new ConfigError("Unable to find a session template for " + sessionID);
                }
                SessionSettings dynamicSettings = new SessionSettings();
                copySettings(dynamicSettings, settings.getDefaultProperties());
                copySettings(dynamicSettings, settings.getSessionProperties(templateID));
                dynamicSettings.setString(BEGINSTRING, sessionID.getBeginString());
                dynamicSettings.setString(SENDERCOMPID, sessionID.getSenderCompID());
                optionallySetValue(dynamicSettings, SENDERSUBID, sessionID.getSenderSubID());
                optionallySetValue(dynamicSettings, SENDERLOCID, sessionID.getSenderLocationID());
                dynamicSettings.setString(TARGETCOMPID, sessionID.getTargetCompID());
                optionallySetValue(dynamicSettings, TARGETSUBID, sessionID.getTargetSubID());
                optionallySetValue(dynamicSettings, TARGETLOCID, sessionID.getTargetLocationID());
                s = sessionFactory.create(sessionID, dynamicSettings);
                if(sessionConnector != null) {
                    sessionConnector.addDynamicSession(s);
                }
            } catch (ConfigError e) {
                throw new QFJException(e);
            }
        }
        return s;
    }

    protected void optionallySetValue(SessionSettings dynamicSettings, String key, String value) {
        dynamicSettings.setString(key, value);
    }

    protected SessionID lookupTemplateID(SessionID sessionID) {
        for (TemplateMapping mapping : templateMappings) {
            if (isMatching(mapping.getPattern(), sessionID)) {
                return mapping.getTemplateID();
            }
        }
        return null;
    }

    private boolean isMatching(SessionID pattern, SessionID sessionID) {
        return isMatching(pattern.getBeginString(), sessionID.getBeginString())
                && isMatching(pattern.getSenderCompID(), sessionID.getSenderCompID())
                && isMatching(pattern.getSenderSubID(), sessionID.getSenderSubID())
                && isMatching(pattern.getSenderLocationID(), sessionID.getSenderLocationID())
                && isMatching(pattern.getTargetCompID(), sessionID.getTargetCompID())
                && isMatching(pattern.getTargetSubID(), sessionID.getTargetSubID())
                && isMatching(pattern.getTargetLocationID(), sessionID.getTargetLocationID());
    }

    private boolean isMatching(String pattern, String value) {
        return WILDCARD.equals(pattern) || (pattern != null && pattern.equals(value));
    }

    protected void copySettings(SessionSettings settings, Properties properties) {
        Iterator<Map.Entry<Object, Object>> entries = properties.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Object, Object> e = entries.next();
            settings.setString((String) e.getKey(), e.getValue().toString());
        }
    }
}
