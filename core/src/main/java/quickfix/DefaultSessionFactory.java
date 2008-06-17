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

package quickfix;

import java.util.Hashtable;
import java.util.Map;

/**
 * Factory for creating sessions. Used by the communications code (acceptors,
 * initiators) for creating sessions.
 */
public class DefaultSessionFactory implements SessionFactory {

    private static final Map<String,DataDictionary> dictionaryCache = new Hashtable<String,DataDictionary>(); // synchronized
    private final Application application;
    private final MessageStoreFactory messageStoreFactory;
    private final LogFactory logFactory;
    private final MessageFactory messageFactory;

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
            LogFactory logFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.logFactory = logFactory;
        this.messageFactory = new DefaultMessageFactory();
    }

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
            LogFactory logFactory, MessageFactory messageFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
    }

    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        try {
            String connectionType = null;

            if (settings.isSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE)) {
                connectionType = settings.getString(sessionID,
                        SessionFactory.SETTING_CONNECTION_TYPE);
            }

            if (connectionType == null) {
                throw new ConfigError("Missing ConnectionType");
            }

            if (!connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)
                    && !connectionType.equals(SessionFactory.INITIATOR_CONNECTION_TYPE)) {
                throw new ConfigError("Invalid ConnectionType");
            }

            if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)
                    && settings.isSetting(sessionID, SessionSettings.SESSION_QUALIFIER)) {
                throw new ConfigError("SessionQualifier cannot be used with acceptor.");
            }

            boolean useDataDictionary = true;
            if (settings.isSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY)) {
                useDataDictionary = settings
                        .getBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
            }

            DataDictionary dataDictionary = null;
            
            if (useDataDictionary) {
                String path;
                if (settings.isSetting(sessionID, Session.SETTING_DATA_DICTIONARY)) {
                    path = settings.getString(sessionID, Session.SETTING_DATA_DICTIONARY);
                } else {
                    path = settings.getString(sessionID, "BeginString").replaceAll("\\.", "")
                            + ".xml";
                }
                
                dataDictionary = getDataDictionary(path);

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER)) {
                    dataDictionary.setCheckFieldsOutOfOrder(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER));
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES)) {
                    dataDictionary.setCheckFieldsHaveValues(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES));
                }

                if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_USER_DEFINED_FIELDS)) {
                    dataDictionary.setCheckUserDefinedFields(settings.getBool(sessionID,
                            Session.SETTING_VALIDATE_USER_DEFINED_FIELDS));
                }
                
                if (settings.isSetting(sessionID, Session.SETTING_ALLOW_UNKNOWN_MSG_FIELDS)) {
                    dataDictionary.setAllowUnknownMessageFields(settings.getBool(sessionID,
                            Session.SETTING_ALLOW_UNKNOWN_MSG_FIELDS));
                }
            }

            int heartbeatInterval = 0;
            if (connectionType.equals(SessionFactory.INITIATOR_CONNECTION_TYPE)) {
                heartbeatInterval = (int) settings.getLong(sessionID, Session.SETTING_HEARTBTINT);
                if (heartbeatInterval <= 0) {
                    throw new ConfigError("Heartbeat must be greater than zero");
                }
            }

            boolean checkLatency = getSetting(settings, sessionID, Session.SETTING_CHECK_LATENCY,
                    true);
            int maxLatency = getSetting(settings, sessionID, Session.SETTING_MAX_LATENCY,
                    Session.DEFAULT_MAX_LATENCY);
            double testRequestDelayMultiplier = getSetting(settings, sessionID,
                    Session.SETTING_TEST_REQUEST_DELAY_MULTIPLIER,
                    Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER);

            boolean millisInTimestamp = getSetting(settings, sessionID,
                    Session.SETTING_MILLISECONDS_IN_TIMESTAMP, true);

            boolean resetOnLogout = getSetting(settings, sessionID,
                    Session.SETTING_RESET_ON_LOGOUT, false);

            boolean resetOnDisconnect = getSetting(settings, sessionID,
                    Session.SETTING_RESET_ON_DISCONNECT, false);

            boolean resetOnLogon = getSetting(settings, sessionID, Session.SETTING_RESET_ON_LOGON,
                    false);

            boolean refreshAtLogon = getSetting(settings, sessionID,
                    Session.SETTING_REFRESH_ON_LOGON, false);

            boolean checkCompID = getSetting(settings, sessionID, Session.SETTING_CHECK_COMP_ID,
                    true);

            boolean redundantResentRequestAllowed = getSetting(settings, sessionID,
                    Session.SETTING_SEND_REDUNDANT_RESEND_REQUEST, false);

            boolean persistMessages = getSetting(settings, sessionID,
                    Session.SETTING_PERSIST_MESSAGES, true);

            boolean useClosedIntervalForResend = getSetting(settings, sessionID,
                    Session.USE_CLOSED_RESEND_INTERVAL, false);

            int logonTimeout = getSetting(settings, sessionID, Session.SETTING_LOGON_TIMEOUT, 10);
            int logoutTimeout = getSetting(settings, sessionID, Session.SETTING_LOGOUT_TIMEOUT, 2);

            Session session = new Session(application, messageStoreFactory, sessionID,
                    dataDictionary, new SessionSchedule(settings, sessionID), logFactory,
                    messageFactory, heartbeatInterval, checkLatency, maxLatency, millisInTimestamp,
                    resetOnLogon, resetOnLogout, resetOnDisconnect, refreshAtLogon,
                    checkCompID, redundantResentRequestAllowed, persistMessages,
                    useClosedIntervalForResend, testRequestDelayMultiplier);

            session.setLogonTimeout(logonTimeout);
            session.setLogoutTimeout(logoutTimeout);

            //
            // Session registration and creation callback is done here instead of in
            // session constructor to eliminate the possibility of other threads
            // accessing the session before it's fully constructed.
            //

            application.onCreate(sessionID);

            return session;
        } catch (FieldConvertError e) {
            throw new ConfigError(e.getMessage());
        }
    }

    private DataDictionary getDataDictionary(String path) throws ConfigError {
        synchronized (dictionaryCache) {
            DataDictionary dataDictionary = dictionaryCache.get(path);
            if (dataDictionary == null) {
                dataDictionary = new DataDictionary(path);
                dictionaryCache.put(path, dataDictionary);
            }
            return dataDictionary;
        }
    }

    private boolean getSetting(SessionSettings settings, SessionID sessionID, String key,
            boolean defaultValue) throws ConfigError, FieldConvertError {
        return settings.isSetting(sessionID, key) ? settings.getBool(sessionID, key) : defaultValue;
    }

    private int getSetting(SessionSettings settings, SessionID sessionID, String key,
            int defaultValue) throws ConfigError, FieldConvertError {
        return settings.isSetting(sessionID, key)
                ? (int) settings.getLong(sessionID, key)
                : defaultValue;
    }

    private double getSetting(SessionSettings settings, SessionID sessionID, String key,
            double defaultValue) throws ConfigError, FieldConvertError {
        return settings.isSetting(sessionID, key)
                ? Double.parseDouble(settings.getString(sessionID, key))
                : defaultValue;
    }

}
