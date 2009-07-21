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

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;

/**
 * Factory for creating sessions. Used by the communications code (acceptors,
 * initiators) for creating sessions.
 */
public class DefaultSessionFactory implements SessionFactory {
    private static final Map<String,DataDictionary> dictionaryCache = new Hashtable<String,DataDictionary>();
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

            DefaultApplVerID senderDefaultApplVerID = null;
            
            if (sessionID.isFIXT()) {
                if (!settings.isSetting(sessionID, Session.SETTING_DEFAULT_APPL_VER_ID)) {
                    throw new ConfigError(Session.SETTING_DEFAULT_APPL_VER_ID
                            + " is required for FIXT transport");
                }
                senderDefaultApplVerID = new DefaultApplVerID(toApplVerID(
                        settings.getString(sessionID, Session.SETTING_DEFAULT_APPL_VER_ID))
                        .getValue());
                
            }
                
            boolean useDataDictionary = true;
            if (settings.isSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY)) {
                useDataDictionary = settings
                        .getBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
            }

            DefaultDataDictionaryProvider dataDictionaryProvider = null;
            if (useDataDictionary) {
                dataDictionaryProvider = new DefaultDataDictionaryProvider();
                if (sessionID.isFIXT()) {
                    processFixtDataDictionaries(sessionID, settings, dataDictionaryProvider);
                } else {
                    processPreFixtDataDictionary(sessionID, settings, dataDictionaryProvider);
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
                    dataDictionaryProvider, new SessionSchedule(settings, sessionID), logFactory,
                    messageFactory, heartbeatInterval, checkLatency, maxLatency, millisInTimestamp,
                    resetOnLogon, resetOnLogout, resetOnDisconnect, refreshAtLogon,
                    checkCompID, redundantResentRequestAllowed, persistMessages,
                    useClosedIntervalForResend, testRequestDelayMultiplier, senderDefaultApplVerID);

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

    private void processPreFixtDataDictionary(SessionID sessionID, SessionSettings settings,
            DefaultDataDictionaryProvider dataDictionaryProvider) throws ConfigError,
            FieldConvertError {
        DataDictionary dataDictionary = createDataDictionary(sessionID, settings,
                Session.SETTING_DATA_DICTIONARY, sessionID.getBeginString());
        dataDictionaryProvider.addTransportDictionary(sessionID.getBeginString(), dataDictionary);
        dataDictionaryProvider.addApplicationDictionary(MessageUtils.toApplVerID(sessionID
                .getBeginString()), null, dataDictionary);
    }

    private DataDictionary createDataDictionary(SessionID sessionID, SessionSettings settings,
            String settingsKey, String beginString) throws ConfigError, FieldConvertError {
        String path = getDictionaryPath(sessionID, settings, settingsKey, beginString);
        DataDictionary dataDictionary = getDataDictionary(path);

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

        return dataDictionary;
    }

    private void processFixtDataDictionaries(SessionID sessionID, SessionSettings settings,
            DefaultDataDictionaryProvider dataDictionaryProvider) throws ConfigError,
            FieldConvertError {
        dataDictionaryProvider.addTransportDictionary(sessionID.getBeginString(),
                createDataDictionary(sessionID, settings, Session.SETTING_TRANSPORT_DATA_DICTIONARY,
                        sessionID.getBeginString()));

        Properties sessionProperties = settings.getSessionProperties(sessionID);
        Enumeration<?> keys = sessionProperties.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            if (key.startsWith(Session.SETTING_APP_DATA_DICTIONARY)) {
                if (key.equals(Session.SETTING_APP_DATA_DICTIONARY)) {
                    ApplVerID applVerID = toApplVerID(settings.getString(sessionID,
                            Session.SETTING_DEFAULT_APPL_VER_ID));
                    DataDictionary dd = createDataDictionary(sessionID, settings,
                            Session.SETTING_APP_DATA_DICTIONARY, sessionID.getBeginString());
                    dataDictionaryProvider.addApplicationDictionary(applVerID, null, dd);
                } else {
                    // Process qualified app data dictionary properties
                    int offset = key.indexOf('.');
                    if (offset == -1) {
                        throw new ConfigError("Malformed " + Session.SETTING_APP_DATA_DICTIONARY
                                + ": " + key);
                    }

                    String beginStringQualifier = key.substring(offset + 1);
                    DataDictionary dd = createDataDictionary(sessionID, settings, key,
                            beginStringQualifier);
                    dataDictionaryProvider.addApplicationDictionary(MessageUtils
                            .toApplVerID(beginStringQualifier), null, dd);

                }
            }
        }
    }

    private ApplVerID toApplVerID(String value) {
        if (isApplVerIdEnum(value)) {
            return new ApplVerID(value);
        } else {
            // value should be a beginString
            return MessageUtils.toApplVerID(value);
        }
    }

    private boolean isApplVerIdEnum(String value) {
        return value.matches("[0-9]+");
    }

    private String getDictionaryPath(SessionID sessionID, SessionSettings settings,
            String settingsKey, String beginString) throws ConfigError, FieldConvertError {
        String path;
        if (settings.isSetting(sessionID, settingsKey)) {
            path = settings.getString(sessionID, settingsKey);
        } else {
            path = toDictionaryPath(beginString);
        }
        return path;
    }

    private String toDictionaryPath(String beginString) {
        return beginString.replaceAll("\\.", "") + ".xml";
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
