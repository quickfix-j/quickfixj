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

import org.quickfixj.QFJException;
import org.quickfixj.SimpleCache;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Factory for creating sessions. Used by the communications code (acceptors,
 * initiators) for creating sessions.
 */
public class DefaultSessionFactory implements SessionFactory {
    private static final SimpleCache<String, DataDictionary> dictionaryCache = new SimpleCache<>(path -> {
        try {
            return new DataDictionary(path);
        } catch (ConfigError e) {
            throw new QFJException(e);
        }
    });

    private final Application application;
    private final MessageStoreFactory messageStoreFactory;
    private final MessageQueueFactory messageQueueFactory;
    private final LogFactory logFactory;
    private final MessageFactory messageFactory;
    private final SessionScheduleFactory sessionScheduleFactory;

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
            LogFactory logFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.messageQueueFactory = new InMemoryMessageQueueFactory();
        this.logFactory = logFactory;
        this.messageFactory = new DefaultMessageFactory();
        this.sessionScheduleFactory = new DefaultSessionScheduleFactory();
    }

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
            LogFactory logFactory, MessageFactory messageFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.messageQueueFactory = new InMemoryMessageQueueFactory();
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
        this.sessionScheduleFactory = new DefaultSessionScheduleFactory();
    }

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
                                 LogFactory logFactory, MessageFactory messageFactory,
                                 SessionScheduleFactory sessionScheduleFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.messageQueueFactory = new InMemoryMessageQueueFactory();
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
        this.sessionScheduleFactory = sessionScheduleFactory;
    }

    public DefaultSessionFactory(Application application, MessageStoreFactory messageStoreFactory,
                                 MessageQueueFactory messageQueueFactory, LogFactory logFactory,
                                 MessageFactory messageFactory, SessionScheduleFactory sessionScheduleFactory) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.messageQueueFactory = messageQueueFactory;
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
        this.sessionScheduleFactory = sessionScheduleFactory;
    }

    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        try {
            String connectionType = null;

            final boolean rejectGarbledMessage = getSetting(settings, sessionID,
                    Session.SETTING_REJECT_GARBLED_MESSAGE, false);

            final boolean validateChecksum = getSetting(settings, sessionID,
                    Session.SETTING_VALIDATE_CHECKSUM, true);

            if (rejectGarbledMessage && !validateChecksum) {
                throw new ConfigError("Not possible to reject garbled message and process " +
                        "messages with invalid checksum at the same time.");
            }

            final boolean rejectInvalidMessage = getSetting(settings, sessionID,
                    Session.SETTING_REJECT_INVALID_MESSAGE, true);

            final boolean rejectMessageOnUnhandledException = getSetting(settings, sessionID,
                    Session.SETTING_REJECT_MESSAGE_ON_UNHANDLED_EXCEPTION, false);

            final boolean requiresOrigSendingTime = getSetting(settings, sessionID,
                    Session.SETTING_REQUIRES_ORIG_SENDING_TIME, true);

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

            if (connectionType.equals(SessionFactory.INITIATOR_CONNECTION_TYPE)
                    && settings.isSetting(sessionID, Session.SETTING_ALLOWED_REMOTE_ADDRESSES)) {
                throw new ConfigError("AllowedRemoteAddresses cannot be used with initiator");
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
                    throw new ConfigError("Heartbeat interval must be greater than zero");
                }
            }

            final boolean checkLatency = getSetting(settings, sessionID, Session.SETTING_CHECK_LATENCY,
                    true);
            final int maxLatency = getSetting(settings, sessionID, Session.SETTING_MAX_LATENCY,
                    Session.DEFAULT_MAX_LATENCY);
            final double testRequestDelayMultiplier = getSetting(settings, sessionID,
                    Session.SETTING_TEST_REQUEST_DELAY_MULTIPLIER,
                    Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER);
            final double heartBeatTimeoutMultiplier = getSetting(settings, sessionID,
                    Session.SETTING_HEARTBEAT_TIMEOUT_MULTIPLIER,
                    Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);

            final UtcTimestampPrecision timestampPrecision = getTimestampPrecision(settings, sessionID,
                    UtcTimestampPrecision.MILLIS);

            final boolean resetOnLogout = getSetting(settings, sessionID,
                    Session.SETTING_RESET_ON_LOGOUT, false);

            final boolean resetOnDisconnect = getSetting(settings, sessionID,
                    Session.SETTING_RESET_ON_DISCONNECT, false);

            final boolean resetOnLogon = getSetting(settings, sessionID, Session.SETTING_RESET_ON_LOGON,
                    false);

            final boolean refreshOnLogon = getSetting(settings, sessionID,
                    Session.SETTING_REFRESH_ON_LOGON, false);

            final boolean checkCompID = getSetting(settings, sessionID, Session.SETTING_CHECK_COMP_ID,
                    true);

            final boolean redundantResentRequestAllowed = getSetting(settings, sessionID,
                    Session.SETTING_SEND_REDUNDANT_RESEND_REQUEST, false);

            final boolean persistMessages = getSetting(settings, sessionID,
                    Session.SETTING_PERSIST_MESSAGES, true);

            final boolean useClosedIntervalForResend = getSetting(settings, sessionID,
                    Session.SETTING_USE_CLOSED_RESEND_INTERVAL, false);

            final int logonTimeout = getSetting(settings, sessionID, Session.SETTING_LOGON_TIMEOUT, 10);
            final int logoutTimeout = getSetting(settings, sessionID, Session.SETTING_LOGOUT_TIMEOUT, 2);

            final boolean validateSequenceNumbers = getSetting(settings, sessionID, Session.SETTING_VALIDATE_SEQUENCE_NUMBERS, true);
            final boolean validateIncomingMessage = getSetting(settings, sessionID, Session.SETTING_VALIDATE_INCOMING_MESSAGE, true);
            final boolean resetOnError = getSetting(settings, sessionID, Session.SETTING_RESET_ON_ERROR, false);
            final boolean disconnectOnError = getSetting(settings, sessionID, Session.SETTING_DISCONNECT_ON_ERROR, false);
            final boolean disableHeartBeatCheck = getSetting(settings, sessionID, Session.SETTING_DISABLE_HEART_BEAT_CHECK, false);
            final boolean forceResendWhenCorruptedStore = getSetting(settings, sessionID, Session.SETTING_FORCE_RESEND_WHEN_CORRUPTED_STORE, false);
            final boolean enableNextExpectedMsgSeqNum = getSetting(settings, sessionID, Session.SETTING_ENABLE_NEXT_EXPECTED_MSG_SEQ_NUM, false);
            final boolean enableLastMsgSeqNumProcessed = getSetting(settings, sessionID, Session.SETTING_ENABLE_LAST_MSG_SEQ_NUM_PROCESSED, false);
            final int resendRequestChunkSize = getSetting(settings, sessionID, Session.SETTING_RESEND_REQUEST_CHUNK_SIZE, Session.DEFAULT_RESEND_RANGE_CHUNK_SIZE);
            final boolean allowPossDup = getSetting(settings, sessionID, Session.SETTING_ALLOW_POS_DUP_MESSAGES, false);

            final int[] logonIntervals = getLogonIntervalsInSeconds(settings, sessionID);
            final Set<InetAddress> allowedRemoteAddresses = getInetAddresses(settings, sessionID);

            final SessionSchedule sessionSchedule = sessionScheduleFactory.create(sessionID, settings);

            final List<StringField> logonTags = getLogonTags(settings, sessionID);

            final Session session = new Session(application, messageStoreFactory, messageQueueFactory,
                    sessionID, dataDictionaryProvider, sessionSchedule, logFactory,
                    messageFactory, heartbeatInterval, checkLatency, maxLatency, timestampPrecision,
                    resetOnLogon, resetOnLogout, resetOnDisconnect, refreshOnLogon, checkCompID,
                    redundantResentRequestAllowed, persistMessages, useClosedIntervalForResend,
                    testRequestDelayMultiplier, senderDefaultApplVerID, validateSequenceNumbers,
                    logonIntervals, resetOnError, disconnectOnError, disableHeartBeatCheck, rejectGarbledMessage,
                    rejectInvalidMessage, rejectMessageOnUnhandledException, requiresOrigSendingTime,
                    forceResendWhenCorruptedStore, allowedRemoteAddresses, validateIncomingMessage,
                    resendRequestChunkSize, enableNextExpectedMsgSeqNum, enableLastMsgSeqNumProcessed,
                    validateChecksum, logonTags, heartBeatTimeoutMultiplier, allowPossDup);

            session.setLogonTimeout(logonTimeout);
            session.setLogoutTimeout(logoutTimeout);

            final int maxScheduledWriteRequests = getSetting(settings, sessionID, Session.SETTING_MAX_SCHEDULED_WRITE_REQUESTS, 0);
            session.setMaxScheduledWriteRequests(maxScheduledWriteRequests);

            //
            // Session registration and creation callback is done here instead of in
            // session constructor to eliminate the possibility of other threads
            // accessing the session before it's fully constructed.
            //

            application.onCreate(sessionID);

            return session;
        } catch (final FieldConvertError e) {
            throw new ConfigError(e.getMessage());
        }
    }

    private void processPreFixtDataDictionary(SessionID sessionID, SessionSettings settings,
            DefaultDataDictionaryProvider dataDictionaryProvider) throws ConfigError,
            FieldConvertError {
        final DataDictionary dataDictionary = createDataDictionary(sessionID, settings,
                Session.SETTING_DATA_DICTIONARY, sessionID.getBeginString());
        dataDictionaryProvider.addTransportDictionary(sessionID.getBeginString(), dataDictionary);
        dataDictionaryProvider.addApplicationDictionary(
                MessageUtils.toApplVerID(sessionID.getBeginString()), dataDictionary);
    }

    private DataDictionary createDataDictionary(SessionID sessionID, SessionSettings settings,
            String settingsKey, String beginString) throws ConfigError, FieldConvertError {
        final String path = getDictionaryPath(sessionID, settings, settingsKey, beginString);
        final DataDictionary dataDictionary = getDataDictionary(path);

        if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER)) {
            dataDictionary.setCheckFieldsOutOfOrder(settings.getBool(sessionID,
                    Session.SETTING_VALIDATE_FIELDS_OUT_OF_ORDER));
        }

        if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES)) {
            dataDictionary.setCheckFieldsHaveValues(settings.getBool(sessionID,
                    Session.SETTING_VALIDATE_FIELDS_HAVE_VALUES));
        }

        if (settings.isSetting(sessionID, Session.SETTING_VALIDATE_UNORDERED_GROUP_FIELDS)) {
            dataDictionary.setCheckUnorderedGroupFields(settings.getBool(sessionID,
                    Session.SETTING_VALIDATE_UNORDERED_GROUP_FIELDS));
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
        dataDictionaryProvider.addTransportDictionary(
                sessionID.getBeginString(),
                createDataDictionary(sessionID, settings, Session.SETTING_TRANSPORT_DATA_DICTIONARY,
                        sessionID.getBeginString()));

        final Properties sessionProperties = settings.getSessionProperties(sessionID);
        final Enumeration<?> keys = sessionProperties.propertyNames();
        while (keys.hasMoreElements()) {
            final String key = (String) keys.nextElement();
            if (key.startsWith(Session.SETTING_APP_DATA_DICTIONARY)) {
                if (key.equals(Session.SETTING_APP_DATA_DICTIONARY)) {
                    final ApplVerID applVerID = toApplVerID(settings.getString(sessionID,
                            Session.SETTING_DEFAULT_APPL_VER_ID));
                    final DataDictionary dd = createDataDictionary(sessionID, settings,
                            Session.SETTING_APP_DATA_DICTIONARY, sessionID.getBeginString());
                    dataDictionaryProvider.addApplicationDictionary(applVerID, dd);
                } else {
                    // Process qualified app data dictionary properties
                    final int offset = key.indexOf('.');
                    if (offset == -1) {
                        throw new ConfigError("Malformed " + Session.SETTING_APP_DATA_DICTIONARY
                                + ": " + key);
                    }

                    final String beginStringQualifier = key.substring(offset + 1);
                    final DataDictionary dd = createDataDictionary(sessionID, settings, key,
                            beginStringQualifier);
                    dataDictionaryProvider.addApplicationDictionary(
                            MessageUtils.toApplVerID(beginStringQualifier), dd);
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
        try {
            return dictionaryCache.computeIfAbsent(path);
        } catch (QFJException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof ConfigError) {
                throw (ConfigError) cause;
            }
            throw e;
        }
    }

    private int[] getLogonIntervalsInSeconds(SessionSettings settings, SessionID sessionID) throws ConfigError {
        if (settings.isSetting(sessionID, Initiator.SETTING_RECONNECT_INTERVAL)) {
            try {
                final String raw = settings.getString(sessionID, Initiator.SETTING_RECONNECT_INTERVAL);
                final int[] ret = SessionSettings.parseSettingReconnectInterval(raw);
                if (ret != null)
                    return ret;
            } catch (final Throwable e) {
                throw new ConfigError(e);
            }
        }
        return new int[] { 5 }; // default value
    }

    private Set<InetAddress> getInetAddresses(SessionSettings settings, SessionID sessionID)
            throws ConfigError {
        if (settings.isSetting(sessionID, Session.SETTING_ALLOWED_REMOTE_ADDRESSES)) {
            try {
                final String raw = settings.getString(sessionID,
                        Session.SETTING_ALLOWED_REMOTE_ADDRESSES);
                return SessionSettings.parseRemoteAddresses(raw);
            } catch (final Throwable e) {
                throw new ConfigError(e);
            }
        }
        return null; // default value
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

    private UtcTimestampPrecision getTimestampPrecision(SessionSettings settings, SessionID sessionID,
            UtcTimestampPrecision defaultValue) throws ConfigError, FieldConvertError {
        if (settings.isSetting(sessionID, Session.SETTING_TIMESTAMP_PRECISION)) {
            String string = settings.getString(sessionID, Session.SETTING_TIMESTAMP_PRECISION);
            try {
                return UtcTimestampPrecision.valueOf(string);
            } catch (IllegalArgumentException e) {
                throw new ConfigError(e.getMessage() + ". Valid values: " + Arrays.toString(UtcTimestampPrecision.values()));
            }
        } else {
            return defaultValue;
        }
    }

    private List<StringField> getLogonTags(SessionSettings settings, SessionID sessionID) throws ConfigError, FieldConvertError {
        List<StringField> logonTags = new ArrayList<>();
        for (int index = 0;; index++) {
            final String logonTagSetting = Session.SETTING_LOGON_TAG
                    + (index == 0 ? "" : NumbersCache.get(index));
            if (settings.isSetting(sessionID, logonTagSetting)) {
                String tag = settings.getString(sessionID, logonTagSetting);
                String[] split = tag.split("=", 2);
                StringField stringField = new StringField(Integer.valueOf(split[0]), split[1]);
                logonTags.add(stringField);
            } else {
                break;
            }
        }
        return logonTags;
    }

}
