/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixj.org
 * license as defined by quickfixj.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixj.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Message.Header;
import quickfix.SessionState.ResendRange;
import quickfix.field.ApplVerID;
import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.BusinessRejectReason;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.EndSeqNo;
import quickfix.field.GapFillFlag;
import quickfix.field.HeartBtInt;
import quickfix.field.LastMsgSeqNumProcessed;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NewSeqNo;
import quickfix.field.NextExpectedMsgSeqNum;
import quickfix.field.OrigSendingTime;
import quickfix.field.PossDupFlag;
import quickfix.field.RefMsgType;
import quickfix.field.RefSeqNum;
import quickfix.field.RefTagID;
import quickfix.field.ResetSeqNumFlag;
import quickfix.field.SenderCompID;
import quickfix.field.SenderLocationID;
import quickfix.field.SenderSubID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.SessionStatus;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;
import quickfix.field.TestReqID;
import quickfix.field.Text;
import quickfix.mina.EventHandlingStrategy;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static quickfix.LogUtil.logThrowable;

/**
 * The Session is the primary FIX abstraction for message communication.
 * <p>
 * It performs sequencing and error recovery and represents a communication
 * channel to a counter-party. Sessions are independent of specific
 * communication layer connections. The Session could span many sequential
 * connections (but cannot operate on multiple connection simultaneously).
 * <p>
 * A logical session is defined as starting with message sequence number 1
 * and ending when the session is reset. However, the Session object
 * instance is registered when first created (per SessionID), and remains
 * registered for the lifetime of the application (until the Connector is
 * stopped), even across resets (which reset its internal state, such as
 * the sequence number).
 */
public class Session implements Closeable {

    /**
     * Session setting for heartbeat interval (in seconds).
     */
    public static final String SETTING_HEARTBTINT = "HeartBtInt";

    /**
     * Session setting for enabling message latency checks. Values are "Y" or
     * "N".
     */
    public static final String SETTING_CHECK_LATENCY = "CheckLatency";

    /**
     * If set to Y, messages must be received from the counterparty with the
     * correct SenderCompID and TargetCompID. Some systems will send you
     * different CompIDs by design, so you must set this to N.
     */
    public static final String SETTING_CHECK_COMP_ID = "CheckCompID";

    /**
     * Session setting for maximum message latency (in seconds).
     */
    public static final String SETTING_MAX_LATENCY = "MaxLatency";

    /**
     * Session setting for the test delay multiplier (as fraction of heartbeat interval).
     */
    public static final String SETTING_TEST_REQUEST_DELAY_MULTIPLIER = "TestRequestDelayMultiplier";

    /**
     * Session setting for the heartbeat timeout multiplier (as fraction of heartbeat interval).
     */
    public static final String SETTING_HEARTBEAT_TIMEOUT_MULTIPLIER = "HeartBeatTimeoutMultiplier";

    /**
     * Session scheduling setting to specify that session never reset
     */
    public static final String SETTING_NON_STOP_SESSION = "NonStopSession";

    /**
     * Session scheduling setting to specify first day of trading week.
     */
    public static final String SETTING_START_DAY = "StartDay";

    /**
     * Session scheduling setting to specify last day of trading week.
     */
    public static final String SETTING_END_DAY = "EndDay";

    /**
     * Session scheduling setting to specify time zone for the session.
     */
    public static final String SETTING_TIMEZONE = "TimeZone";

    /**
     * Session scheduling setting to specify starting time of the trading day.
     */
    public static final String SETTING_START_TIME = "StartTime";

    /**
     * Session scheduling setting to specify end time of the trading day.
     */
    public static final String SETTING_END_TIME = "EndTime";

    /**
     * Session scheduling setting to specify active days of the week.
     */
    public static final String SETTING_WEEKDAYS = "Weekdays";

    /**
     * Session setting to indicate whether a data dictionary should be used. If
     * a data dictionary is not used then message validation is not possible.
     */
    public static final String SETTING_USE_DATA_DICTIONARY = "UseDataDictionary";

    /**
     * Session setting specifying the path to the data dictionary to use for
     * this session. This setting supports the possibility of a custom data
     * dictionary for each session. Normally, the default data dictionary for a
     * specific FIX version will be specified.
     */
    public static final String SETTING_DATA_DICTIONARY = "DataDictionary";

    /**
     * Session setting specifying the path to the transport data dictionary.
     * This setting supports the possibility of a custom transport data
     * dictionary for each session. This setting would only be used with FIXT 1.1 and
     * new transport protocols.
     */
    public static final String SETTING_TRANSPORT_DATA_DICTIONARY = "TransportDataDictionary";

    /**
     * Session setting specifying the path to the application data dictionary to use for
     * this session. This setting supports the possibility of a custom application data
     * dictionary for each session. This setting would only be used with FIXT 1.1 and
     * new transport protocols. This setting can be used as a prefix to specify multiple
     * application dictionaries for the FIXT transport. For example:
     * <pre><code>
     * DefaultApplVerID=FIX.4.2
     * AppDataDictionary=FIX42.xml
     * AppDataDictionary.FIX.4.4=FIX44.xml
     * </code></pre>
     * This would use FIX42.xml for the default application version ID and FIX44.xml for
     * any FIX 4.4 messages.
     */
    public static final String SETTING_APP_DATA_DICTIONARY = "AppDataDictionary";

    /**
     * Default is "Y".
     * If set to N, fields that are out of order (i.e. body fields in the header, or header fields in the body) will not be rejected.
     */
    public static final String SETTING_VALIDATE_FIELDS_OUT_OF_ORDER = "ValidateFieldsOutOfOrder";

    /**
     * Session validation setting for enabling whether field ordering is
     * validated. Values are "Y" or "N". Default is "Y".
     */
    public static final String SETTING_VALIDATE_UNORDERED_GROUP_FIELDS = "ValidateUnorderedGroupFields";

    /**
     * Session validation setting for enabling whether field values are
     * validated. Empty fields values are not allowed. Values are "Y" or "N".
     * Default is "Y".
     */
    public static final String SETTING_VALIDATE_FIELDS_HAVE_VALUES = "ValidateFieldsHaveValues";

    /**
     * Allow to bypass the message validation. Default is "Y".
     */
    public static final String SETTING_VALIDATE_INCOMING_MESSAGE = "ValidateIncomingMessage";

    /**
     * Session setting for logon timeout (in seconds).
     */
    public static final String SETTING_LOGON_TIMEOUT = "LogonTimeout";

    /**
     * Session setting for logout timeout (in seconds).
     */
    public static final String SETTING_LOGOUT_TIMEOUT = "LogoutTimeout";

    /**
     * Session setting for custom logon tags. Single entry or consecutive list of
     * tag=value pairs, e.g. LogonTag=553=user and LogonTag1=554=password.
     */
    public static final String SETTING_LOGON_TAG = "LogonTag";

    /**
     * Session setting for doing an automatic sequence number reset on logout.
     * Valid values are "Y" or "N". Default is "N".
     */
    public static final String SETTING_RESET_ON_LOGOUT = "ResetOnLogout";

    /**
     * Check the next expected target SeqNum against the received SeqNum. Default is "Y".
     * If a mismatch is detected, apply the following logic:
     * <ul>
     * <li>if lower than expected SeqNum , logout</li>
     * <li>if higher, send a resend request</li>
     * </ul>
     */
    public static final String SETTING_VALIDATE_SEQUENCE_NUMBERS = "ValidateSequenceNumbers";

    /**
     * Session setting for doing an automatic sequence number reset on
     * disconnect. Valid values are "Y" or "N". Default is "N".
     */
    public static final String SETTING_RESET_ON_DISCONNECT = "ResetOnDisconnect";

    /**
     * Session setting for doing an automatic reset when an error occurs. Valid values are "Y" or "N". Default is "N". A
     * reset means disconnect, sequence numbers reset, store cleaned and reconnect, as for a daily reset.
     */
    public static final String SETTING_RESET_ON_ERROR = "ResetOnError";

    /**
     * Session setting for doing an automatic disconnect when an error occurs. Valid values are "Y" or "N". Default is
     * "N".
     */
    public static final String SETTING_DISCONNECT_ON_ERROR = "DisconnectOnError";

    /**
     * Session setting to control precision in message timestamps.
     * Valid values are "SECONDS", "MILLIS", "MICROS", "NANOS". Default is "MILLIS".
     * Only valid for FIX version >= 4.2.
     */
    public static final String SETTING_TIMESTAMP_PRECISION = "TimeStampPrecision";

    /**
     * Controls validation of user-defined fields.
     */
    public static final String SETTING_VALIDATE_USER_DEFINED_FIELDS = "ValidateUserDefinedFields";

    /**
     * Session setting that causes the session to reset sequence numbers when initiating
     * a logon (>= FIX 4.2).
     */
    public static final String SETTING_RESET_ON_LOGON = "ResetOnLogon";

    /**
     * Session description. Used by external tools.
     */
    public static final String SETTING_DESCRIPTION = "Description";

    /**
     * Requests that state and message data be refreshed from the message store at
     * logon, if possible. This supports simple failover behavior for acceptors.
     */
    public static final String SETTING_REFRESH_ON_LOGON = "RefreshOnLogon";

    /**
     * Configures the session to send redundant resend requests (off, by default).
     */
    public static final String SETTING_SEND_REDUNDANT_RESEND_REQUEST = "SendRedundantResendRequests";

    /**
     * Persist messages setting (true, by default). If set to false this will cause the Session to
     * not persist any messages and all resend requests will be answered with a gap fill.
     */
    public static final String SETTING_PERSIST_MESSAGES = "PersistMessages";

    /**
     * Use actual end of sequence gap for resend requests rather than using "infinity"
     * as the end sequence of the gap. Not recommended by the FIX specification, but
     * needed for some counterparties.
     */
    public static final String SETTING_USE_CLOSED_RESEND_INTERVAL = "ClosedResendInterval";

    /**
     * Allow unknown fields in messages. This is intended for unknown fields with tags < 5000
     * (not user defined fields)
     */
    public static final String SETTING_ALLOW_UNKNOWN_MSG_FIELDS = "AllowUnknownMsgFields";

    public static final String SETTING_DEFAULT_APPL_VER_ID = "DefaultApplVerID";

    /**
     * Allow to disable heart beat failure detection
     */
    public static final String SETTING_DISABLE_HEART_BEAT_CHECK = "DisableHeartBeatCheck";

    /**
     * Return the last msg seq number processed (optional tag 369). Valid values are "Y" or "N".
     * Default is "N".
     */
    public static final String SETTING_ENABLE_LAST_MSG_SEQ_NUM_PROCESSED = "EnableLastMsgSeqNumProcessed";

    /**
     * Return the next expected message sequence number (optional tag 789 on Logon) on sent Logon message
     * and use value of tag 789 on received Logon message to synchronize session.
     * Valid values are "Y" or "N".
     * Default is "N".
     * This should not be enabled for FIX versions lower than 4.4
     */
    public static final String SETTING_ENABLE_NEXT_EXPECTED_MSG_SEQ_NUM = "EnableNextExpectedMsgSeqNum";

    /**
     * Reject garbled messages instead of ignoring them.
     * This is only working for messages that pass the FIX decoder and reach the engine.
     * Messages that cannot be considered a real FIX message (i.e. not starting with
     * 8=FIX or not ending with 10=xxx) will be ignored in any case.
     * Default is "N".
     */
    public static final String SETTING_REJECT_GARBLED_MESSAGE = "RejectGarbledMessage";

    public static final String SETTING_REJECT_INVALID_MESSAGE = "RejectInvalidMessage";

    public static final String SETTING_REJECT_MESSAGE_ON_UNHANDLED_EXCEPTION = "RejectMessageOnUnhandledException";

    public static final String SETTING_REQUIRES_ORIG_SENDING_TIME = "RequiresOrigSendingTime";

    public static final String SETTING_FORCE_RESEND_WHEN_CORRUPTED_STORE = "ForceResendWhenCorruptedStore";

    public static final String SETTING_ALLOWED_REMOTE_ADDRESSES = "AllowedRemoteAddresses";

    /**
     * Setting to limit the size of a resend request in case of missing messages.
     * This is useful when the remote FIX engine does not allow to ask for more than n message for a ResendRequest
     */
    public static final String SETTING_RESEND_REQUEST_CHUNK_SIZE = "ResendRequestChunkSize";

    public static final String SETTING_MAX_SCHEDULED_WRITE_REQUESTS = "MaxScheduledWriteRequests";

    public static final String SETTING_VALIDATE_CHECKSUM = "ValidateChecksum";

    private static final ConcurrentMap<SessionID, Session> sessions = new ConcurrentHashMap<>();

    private final Application application;
    private final SessionID sessionID;
    private final SessionSchedule sessionSchedule;
    private final MessageFactory messageFactory;

    // @GuardedBy(this)
    private final SessionState state;

    /*
     * Controls whether it is possible to log on to this Session (if Acceptor)
     * or if Logon is sent out respectively (if Initiator).
     */
    private volatile boolean enabled;

    private final Object responderLock = new Object(); // unique instance
    // @GuardedBy(responderLock)
    private Responder responder;

    // The session time checks were causing performance problems
    // so we are checking only once per second.
    private long lastSessionTimeCheck = 0;
    private int logonAttempts = 0;
    private long lastSessionLogon = 0;

    private final DataDictionaryProvider dataDictionaryProvider;
    private final boolean checkLatency;
    private final int maxLatency;
    private int resendRequestChunkSize = 0;
    private final boolean resetOnLogon;
    private final boolean resetOnLogout;
    private final boolean resetOnDisconnect;
    private final boolean resetOnError;
    private final boolean disconnectOnError;
    private final UtcTimestampPrecision timestampPrecision;
    private final boolean refreshOnLogon;
    private final boolean redundantResentRequestsAllowed;
    private final boolean persistMessages;
    private final boolean checkCompID;
    private final boolean useClosedRangeForResend;
    private boolean disableHeartBeatCheck = false;
    private boolean rejectGarbledMessage = false;
    private boolean rejectInvalidMessage = false;
    private boolean rejectMessageOnUnhandledException = false;
    private boolean requiresOrigSendingTime = false;
    private boolean forceResendWhenCorruptedStore = false;
    private boolean enableNextExpectedMsgSeqNum = false;
    private boolean enableLastMsgSeqNumProcessed = false;
    private boolean validateChecksum = true;

    private int maxScheduledWriteRequests = 0;

    private final AtomicBoolean isResetting = new AtomicBoolean();
    private final AtomicBoolean isResettingState = new AtomicBoolean();

    private final ListenerSupport stateListeners = new ListenerSupport(SessionStateListener.class);
    private final SessionStateListener stateListener = (SessionStateListener) stateListeners
            .getMulticaster();

    private final AtomicReference<ApplVerID> targetDefaultApplVerID = new AtomicReference<>();
    private final DefaultApplVerID senderDefaultApplVerID;
    private final boolean validateSequenceNumbers;
    private final boolean validateIncomingMessage;
    private final int[] logonIntervals;
    private final Set<InetAddress> allowedRemoteAddresses;

    public static final int DEFAULT_MAX_LATENCY = 120;
    public static final int DEFAULT_RESEND_RANGE_CHUNK_SIZE = 0; // no resend range
    public static final double DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER = 0.5;
    public static final double DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER = 1.4;
    private static final String ENCOUNTERED_END_OF_STREAM = "Encountered END_OF_STREAM";


    private static final int BAD_COMPID_REJ_REASON = SessionRejectReason.COMPID_PROBLEM;
    private static final String BAD_COMPID_TEXT = new FieldException(BAD_COMPID_REJ_REASON).getMessage();
    private static final int BAD_TIME_REJ_REASON = SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM;
    private static final String BAD_ORIG_TIME_TEXT = new FieldException(BAD_TIME_REJ_REASON, OrigSendingTime.FIELD).getMessage();
    private static final String BAD_TIME_TEXT = new FieldException(BAD_TIME_REJ_REASON, SendingTime.FIELD).getMessage();

    private final List<StringField> logonTags;

    protected static final Logger LOG = LoggerFactory.getLogger(Session.class);

    Session(Application application, MessageStoreFactory messageStoreFactory, SessionID sessionID,
            DataDictionaryProvider dataDictionaryProvider, SessionSchedule sessionSchedule, LogFactory logFactory,
            MessageFactory messageFactory, int heartbeatInterval) {
        this(application, messageStoreFactory, sessionID, dataDictionaryProvider, sessionSchedule, logFactory,
                messageFactory, heartbeatInterval, true, DEFAULT_MAX_LATENCY, UtcTimestampPrecision.MILLIS, false, false,
                false, false, true, false, true, false, DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, null, true, new int[]{5},
                false, false, false, false, true, false, true, false, null, true, DEFAULT_RESEND_RANGE_CHUNK_SIZE, false,
                false, false, new ArrayList<StringField>(), DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);
    }

    Session(Application application, MessageStoreFactory messageStoreFactory, SessionID sessionID,
            DataDictionaryProvider dataDictionaryProvider, SessionSchedule sessionSchedule,
            LogFactory logFactory, MessageFactory messageFactory, int heartbeatInterval,
            boolean checkLatency, int maxLatency, UtcTimestampPrecision timestampPrecision,
            boolean resetOnLogon, boolean resetOnLogout, boolean resetOnDisconnect,
            boolean refreshOnLogon, boolean checkCompID,
            boolean redundantResentRequestsAllowed, boolean persistMessages,
            boolean useClosedRangeForResend, double testRequestDelayMultiplier,
            DefaultApplVerID senderDefaultApplVerID, boolean validateSequenceNumbers,
            int[] logonIntervals, boolean resetOnError, boolean disconnectOnError,
            boolean disableHeartBeatCheck, boolean rejectGarbledMessage, boolean rejectInvalidMessage,
            boolean rejectMessageOnUnhandledException, boolean requiresOrigSendingTime,
            boolean forceResendWhenCorruptedStore, Set<InetAddress> allowedRemoteAddresses,
            boolean validateIncomingMessage, int resendRequestChunkSize,
            boolean enableNextExpectedMsgSeqNum, boolean enableLastMsgSeqNumProcessed,
            boolean validateChecksum, List<StringField> logonTags, double heartBeatTimeoutMultiplier) {
        this.application = application;
        this.sessionID = sessionID;
        this.sessionSchedule = sessionSchedule;
        this.checkLatency = checkLatency;
        this.maxLatency = maxLatency;
        this.resetOnLogon = resetOnLogon;
        this.resetOnLogout = resetOnLogout;
        this.resetOnDisconnect = resetOnDisconnect;
        this.timestampPrecision = timestampPrecision;
        this.refreshOnLogon = refreshOnLogon;
        this.dataDictionaryProvider = dataDictionaryProvider;
        this.messageFactory = messageFactory;
        this.checkCompID = checkCompID;
        this.redundantResentRequestsAllowed = redundantResentRequestsAllowed;
        this.persistMessages = persistMessages;
        this.useClosedRangeForResend = useClosedRangeForResend;
        this.senderDefaultApplVerID = senderDefaultApplVerID;
        this.logonIntervals = logonIntervals;
        this.resetOnError = resetOnError;
        this.disconnectOnError = disconnectOnError;
        this.disableHeartBeatCheck = disableHeartBeatCheck;
        this.rejectGarbledMessage = rejectGarbledMessage;
        this.rejectInvalidMessage = rejectInvalidMessage;
        this.rejectMessageOnUnhandledException = rejectMessageOnUnhandledException;
        this.requiresOrigSendingTime = requiresOrigSendingTime;
        this.forceResendWhenCorruptedStore = forceResendWhenCorruptedStore;
        this.allowedRemoteAddresses = allowedRemoteAddresses;
        this.validateIncomingMessage = validateIncomingMessage;
        this.validateSequenceNumbers = validateSequenceNumbers;
        this.resendRequestChunkSize = resendRequestChunkSize;
        this.enableNextExpectedMsgSeqNum = enableNextExpectedMsgSeqNum;
        this.enableLastMsgSeqNumProcessed = enableLastMsgSeqNumProcessed;
        this.validateChecksum = validateChecksum;
        this.logonTags = logonTags;

        final Log engineLog = (logFactory != null) ? logFactory.create(sessionID) : null;
        if (engineLog instanceof SessionStateListener) {
            addStateListener((SessionStateListener) engineLog);
        }

        final MessageStore messageStore = messageStoreFactory.create(sessionID);
        if (messageStore instanceof SessionStateListener) {
            addStateListener((SessionStateListener) messageStore);
        }

        state = new SessionState(this, engineLog, heartbeatInterval, heartbeatInterval != 0,
                messageStore, testRequestDelayMultiplier, heartBeatTimeoutMultiplier);

        registerSession(this);

        getLog().onEvent("Session " + sessionID + " schedule is " + sessionSchedule);
        try {
            resetIfSessionNotCurrent(sessionID, SystemTime.currentTimeMillis());
        } catch (final IOException e) {
            LogUtil.logThrowable(getLog(), "error during session construction", e);
        }

        // QFJ-721: for non-FIXT sessions we do not need to set targetDefaultApplVerID from Logon
        if (!sessionID.isFIXT()) {
            targetDefaultApplVerID.set(MessageUtils.toApplVerID(sessionID.getBeginString()));
        }

        setEnabled(true);

        getLog().onEvent("Created session: " + sessionID);
    }

    public MessageFactory getMessageFactory() {
        return messageFactory;
    }

    /**
     * Registers a responder with the session. This is used by the acceptor and
     * initiator implementations.
     *
     * @param responder a responder implementation
     */
    public void setResponder(Responder responder) {
        synchronized (responderLock) {
            this.responder = responder;
            if (responder != null) {
                stateListener.onConnect();
            } else {
                stateListener.onDisconnect();
            }
        }
    }

    public Responder getResponder() {
        synchronized (responderLock) {
            return responder;
        }
    }

    /**
     * This should not be used by end users.
     *
     * @return the Session's connection responder
     */
    public boolean hasResponder() {
        return getResponder() != null;
    }

    /**
     * Provides remote address of the session connection, if any.
     *
     * @return remote address (host:port) if connected, null if not.
     */
    public String getRemoteAddress() {
        Responder responder = getResponder();
        if (responder != null) {
            return responder.getRemoteAddress();
        }
        return null;
    }

    private boolean isCurrentSession(final long time)
            throws IOException {
        return sessionSchedule == null || sessionSchedule.isSameSession(
                SystemTime.getUtcCalendar(time), SystemTime.getUtcCalendar(state.getCreationTime()));
    }

    /**
     * Send a message to the session specified in the message's target
     * identifiers.
     *
     * @param message a FIX message
     * @return true is send was successful, false otherwise
     * @throws SessionNotFound if session could not be located
     */
    public static boolean sendToTarget(Message message) throws SessionNotFound {
        return sendToTarget(message, "");
    }

    /**
     * Send a message to the session specified in the message's target
     * identifiers. The session qualifier is used to distinguish sessions with
     * the same target identifiers.
     *
     * @param message   a FIX message
     * @param qualifier a session qualifier
     * @return true is send was successful, false otherwise
     * @throws SessionNotFound if session could not be located
     */
    public static boolean sendToTarget(Message message, String qualifier) throws SessionNotFound {
        try {
            final String senderCompID = getSenderCompIDFromMessage(message);
            final String targetCompID = getTargetCompIDFromMessage(message);
            return sendToTarget(message, senderCompID, targetCompID, qualifier);
        } catch (final FieldNotFound e) {
            throw new SessionNotFound("missing sender or target company ID");
        }
    }

    private static String getTargetCompIDFromMessage(final Message message) throws FieldNotFound {
        return message.getHeader().getString(TargetCompID.FIELD);
    }

    private static String getSenderCompIDFromMessage(final Message message) throws FieldNotFound {
        return message.getHeader().getString(SenderCompID.FIELD);
    }

    /**
     * Send a message to the session specified by the provided target company
     * ID. The sender company ID is provided as an argument rather than from the
     * message.
     *
     * @param message      a FIX message
     * @param senderCompID the sender's company ID
     * @param targetCompID the target's company ID
     * @return true is send was successful, false otherwise
     * @throws SessionNotFound if session could not be located
     */
    public static boolean sendToTarget(Message message, String senderCompID, String targetCompID)
            throws SessionNotFound {
        return sendToTarget(message, senderCompID, targetCompID, "");
    }

    /**
     * Send a message to the session specified by the provided target company
     * ID. The sender company ID is provided as an argument rather than from the
     * message. The session qualifier is used to distinguish sessions with the
     * same target identifiers.
     *
     * @param message      a FIX message
     * @param senderCompID the sender's company ID
     * @param targetCompID the target's company ID
     * @param qualifier    a session qualifier
     * @return true is send was successful, false otherwise
     * @throws SessionNotFound if session could not be located
     */
    public static boolean sendToTarget(Message message, String senderCompID, String targetCompID,
                                       String qualifier) throws SessionNotFound {
        try {
            return sendToTarget(message,
                    new SessionID(message.getHeader().getString(BeginString.FIELD), senderCompID,
                            targetCompID, qualifier));
        } catch (final SessionNotFound e) {
            throw e;
        } catch (final Exception e) {
            throw new SessionException(e);
        }
    }

    /**
     * Send a message to the session specified by the provided session ID.
     *
     * @param message   a FIX message
     * @param sessionID the target SessionID
     * @return true is send was successful, false otherwise
     * @throws SessionNotFound if session could not be located
     */
    public static boolean sendToTarget(Message message, SessionID sessionID) throws SessionNotFound {
        final Session session = lookupSession(sessionID);
        if (session == null) {
            throw new SessionNotFound();
        }
        message.setSessionID(sessionID);
        return session.send(message);
    }

    static void registerSession(Session session) {
        sessions.put(session.getSessionID(), session);
    }

    static void unregisterSessions(List<SessionID> sessionIds, boolean doClose) {
        for (final SessionID sessionId : sessionIds) {
            unregisterSession(sessionId, doClose);
        }
    }

    static void unregisterSession(SessionID sessionId, boolean doClose) {
        final Session session = sessions.get(sessionId);
        if (session != null) {
            try {
                if (doClose) {
                    session.close();
                }
            } catch (final IOException e) {
                LOG.error("Failed to close session resources", e);
            } finally {
                sessions.remove(sessionId);
            }
        }
    }

    /**
     * Locates a session specified by the provided session ID.
     *
     * @param sessionID the session ID
     * @return the session, if found, or null otherwise
     */
    public static Session lookupSession(SessionID sessionID) {
        return sessions.get(sessionID);
    }

    /**
     * This method can be used to manually logon to a FIX session.
     */
    public void logon() {
        state.clearLogoutReason();
        setEnabled(true);
    }

    private void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private void initializeHeader(Message.Header header) {
        state.setLastSentTime(SystemTime.currentTimeMillis());
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        optionallySetID(header, SenderSubID.FIELD, sessionID.getSenderSubID());
        optionallySetID(header, SenderLocationID.FIELD, sessionID.getSenderLocationID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        optionallySetID(header, TargetSubID.FIELD, sessionID.getTargetSubID());
        optionallySetID(header, TargetLocationID.FIELD, sessionID.getTargetLocationID());
        header.setInt(MsgSeqNum.FIELD, getExpectedSenderNum());
        insertSendingTime(header);
    }

    private void optionallySetID(Header header, int field, String value) {
        if (!value.equals(SessionID.NOT_SET)) {
            header.setString(field, value);
        }
    }

    private void insertSendingTime(Message.Header header) {
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getLocalDateTime(), getTimestampPrecision());
    }

    private UtcTimestampPrecision getTimestampPrecision() {
        if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            return timestampPrecision;
        } else {
            return UtcTimestampPrecision.SECONDS;
        }
    }

    /**
     * This method can be used to manually logout of a FIX session.
     */
    public void logout() {
        setEnabled(false);
    }

    /**
     * This method can be used to manually logout of a FIX session.
     *
     * @param reason this will be included in the logout message
     */
    public void logout(String reason) {
        state.setLogoutReason(reason);
        logout();
    }

    /**
     * Used internally
     *
     * @return true if session is enabled, false otherwise.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Predicate indicating whether a logon message has been sent.
     * <p>
     * (QF Compatibility)
     *
     * @return true if logon message was sent, false otherwise.
     */
    public boolean sentLogon() {
        return state.isLogonSent();
    }

    /**
     * Predicate indicating whether a logon message has been received.
     * <p>
     * (QF Compatibility)
     *
     * @return true if logon message was received, false otherwise.
     */
    public boolean receivedLogon() {
        return state.isLogonReceived();
    }

    /**
     * Predicate indicating whether a logout message has been sent.
     * <p>
     * (QF Compatibility)
     *
     * @return true if logout message was sent, false otherwise.
     */
    public boolean sentLogout() {
        return state.isLogoutSent();
    }

    /**
     * Predicate indicating whether a logout message has been received. This can
     * be used to determine if a session ended with an unexpected disconnect.
     *
     * @return true if logout message has been received, false otherwise.
     */
    public boolean receivedLogout() {
        return state.isLogoutReceived();
    }

    /**
     * Is the session logged on.
     *
     * @return true if logged on, false otherwise.
     */
    public boolean isLoggedOn() {
        return sentLogon() && receivedLogon();
    }

    private boolean isResetNeeded() {
        return sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX41) >= 0
                && (resetOnLogon || resetOnLogout || resetOnDisconnect)
                && getExpectedSenderNum() == 1 && getExpectedTargetNum() == 1;
    }

    /**
     * Logs out and disconnects session (if logged on) and then resets session state.
     *
     * @throws IOException IO error
     * @see SessionState#reset()
     */
    public void reset() throws IOException {
        if (!isResetting.compareAndSet(false, true)) {
            return;
        }
        try {
            if (hasResponder() && isLoggedOn()) {
                if (application instanceof ApplicationExtended) {
                    ((ApplicationExtended) application).onBeforeSessionReset(sessionID);
                }
                generateLogout();
                disconnect("Session reset", false);
            }
            resetState();
        } finally {
            isResetting.set(false);
        }
    }

    /**
     * Set the next outgoing message sequence number. This method is not
     * synchronized.
     *
     * @param num next outgoing sequence number
     * @throws IOException IO error
     */
    public void setNextSenderMsgSeqNum(int num) throws IOException {
        state.getMessageStore().setNextSenderMsgSeqNum(num);
    }

    /**
     * Set the next expected target message sequence number. This method is not
     * synchronized.
     *
     * @param num next expected target sequence number
     * @throws IOException IO error
     */
    public void setNextTargetMsgSeqNum(int num) throws IOException {
        state.getMessageStore().setNextTargetMsgSeqNum(num);
    }

    /**
     * Retrieves the expected sender sequence number. This method is not
     * synchronized.
     *
     * @return next expected sender sequence number
     */
    public int getExpectedSenderNum() {
        try {
            return state.getMessageStore().getNextSenderMsgSeqNum();
        } catch (final IOException e) {
            getLog().onErrorEvent("getNextSenderMsgSeqNum failed: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Retrieves the expected target sequence number. This method is not
     * synchronized.
     *
     * @return next expected target sequence number
     */
    public int getExpectedTargetNum() {
        try {
            return state.getMessageStore().getNextTargetMsgSeqNum();
        } catch (final IOException e) {
            getLog().onErrorEvent("getNextTargetMsgSeqNum failed: " + e.getMessage());
            return -1;
        }
    }

    public Log getLog() {
        return state.getLog();
    }

    /**
     * Get the message store. (QF Compatibility)
     *
     * @return the message store
     */
    public MessageStore getStore() {
        return state.getMessageStore();
    }

    private void next(Message message, boolean isProcessingQueuedMessages) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {

        if (message == EventHandlingStrategy.END_OF_STREAM) {
            disconnect(ENCOUNTERED_END_OF_STREAM, false);
            return;
        }

        final Header header = message.getHeader();
        final String msgType = header.getString(MsgType.FIELD);

        // QFJ-650
        if (!header.isSetField(MsgSeqNum.FIELD)) {
            generateLogout("Received message without MsgSeqNum");
            disconnect("Received message without MsgSeqNum: " + getMessageToLog(message), true);
            return;
        }

        final String sessionBeginString = sessionID.getBeginString();
        try {
            final String beginString = header.getString(BeginString.FIELD);
            if (!beginString.equals(sessionBeginString)) {
                throw new UnsupportedVersion("Message version '" + beginString
                        + "' does not match the session version '" + sessionBeginString + "'");
            }

            if (MsgType.LOGON.equals(msgType)) {
                if (sessionID.isFIXT()) {
                    targetDefaultApplVerID.set(new ApplVerID(message
                            .getString(DefaultApplVerID.FIELD)));
                }

                // QFJ-648
                if (message.isSetField(HeartBtInt.FIELD)) {
                    if (message.getInt(HeartBtInt.FIELD) < 0) {
                        throw new RejectLogon("HeartBtInt must not be negative");
                    }
                }
            }

            if (validateIncomingMessage && dataDictionaryProvider != null) {
                final DataDictionary sessionDataDictionary = dataDictionaryProvider
                        .getSessionDataDictionary(beginString);

                final ApplVerID applVerID = header.isSetField(ApplVerID.FIELD) ? new ApplVerID(
                        header.getString(ApplVerID.FIELD)) : targetDefaultApplVerID.get();

                final DataDictionary applicationDataDictionary = MessageUtils
                        .isAdminMessage(msgType) ? dataDictionaryProvider
                        .getSessionDataDictionary(beginString) : dataDictionaryProvider
                        .getApplicationDataDictionary(applVerID);

                // related to QFJ-367 : just warn invalid incoming field/tags
                try {
                    DataDictionary.validate(message, sessionDataDictionary,
                            applicationDataDictionary);
                } catch (final IncorrectTagValue e) {
                    if (rejectInvalidMessage) {
                        throw e;
                    } else {
                        getLog().onErrorEvent("Warn: incoming message with " + e + ": " + getMessageToLog(message));
                    }
                } catch (final FieldException e) {
                    if (message.isSetField(e.getField())) {
                        if (rejectInvalidMessage) {
                            throw e;
                        } else {
                            getLog().onErrorEvent(
                                    "Warn: incoming message with incorrect field: "
                                            + message.getField(e.getField()) + ": " + getMessageToLog(message));
                        }
                    } else {
                        if (rejectInvalidMessage) {
                            throw e;
                        } else {
                            getLog().onErrorEvent(
                                    "Warn: incoming message with missing field: " + e.getField()
                                            + ": " + e.getMessage() + ": " + getMessageToLog(message));
                        }
                    }
                } catch (final FieldNotFound e) {
                    if (rejectInvalidMessage) {
                        throw e;
                    } else {
                        getLog().onErrorEvent("Warn: incoming " + e + ": " + getMessageToLog(message));
                    }
                }
            }

            switch (msgType) {
                case MsgType.LOGON:
                    nextLogon(message);
                    break;
                case MsgType.HEARTBEAT:
                    nextHeartBeat(message);
                    break;
                case MsgType.TEST_REQUEST:
                    nextTestRequest(message);
                    break;
                case MsgType.SEQUENCE_RESET:
                    nextSequenceReset(message);
                    break;
                case MsgType.LOGOUT:
                    nextLogout(message);
                    break;
                case MsgType.RESEND_REQUEST:
                    nextResendRequest(message);
                    break;
                case MsgType.REJECT:
                    nextReject(message);
                    break;
                default:
                    if (!verify(message)) {
                        return;
                    }
                    state.incrNextTargetMsgSeqNum();
                    break;
            }
        } catch (final FieldException | IncorrectDataFormat | IncorrectTagValue e) {
            if (logErrorAndDisconnectIfRequired(e, message)) {
                return;
            }
            handleExceptionAndRejectMessage(msgType, message, e);
        } catch (final FieldNotFound e) {
            if (logErrorAndDisconnectIfRequired(e, message)) {
                return;
            }
            if (sessionBeginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0
                    && message.isApp()) {
                generateBusinessReject(message,
                        BusinessRejectReason.CONDITIONALLY_REQUIRED_FIELD_MISSING, e.field);
            } else {
                if (MsgType.LOGON.equals(msgType)) {
                    getLog().onErrorEvent("Required field missing from logon");
                    disconnect("Required field missing from logon", true);
                } else {
                    generateReject(message, SessionRejectReason.REQUIRED_TAG_MISSING, e.field);
                }
            }
        } catch (final InvalidMessage e) {
            /* InvalidMessage means a low-level error (e.g. checksum problem) and we should
               ignore the message and let the problem correct itself (optimistic approach).
               Target sequence number is not incremented, so it will trigger a ResendRequest
               on the next message that is received.
               If the message should get rejected and the seqnum get incremented,
               then setting RejectGarbledMessage=Y needs to be used. */
            if (rejectGarbledMessage) {
                getLog().onErrorEvent("Processing garbled message: " + e.getMessage());
                generateReject(message, "Message failed basic validity check");
            } else {
                getLog().onErrorEvent("Skipping invalid message: " + e + ": " + getMessageToLog(message));
                if (resetOrDisconnectIfRequired(message)) {
                    return;
                }
            }
        } catch (final RejectLogon e) {
            final String rejectMessage = e.getMessage() != null ? (": " + e) : "";
            getLog().onErrorEvent("Logon rejected" + rejectMessage);
            if (e.isLogoutBeforeDisconnect()) {
                if (e.getSessionStatus() > -1) {
                    generateLogout(e.getMessage(), new SessionStatus(e.getSessionStatus()));
                } else {
                    generateLogout(e.getMessage());
                }
            }
            // Only increment seqnum if we are at the expected seqnum
            if (getExpectedTargetNum() == header.getInt(MsgSeqNum.FIELD)) {
                state.incrNextTargetMsgSeqNum();
            }
            disconnect("Logon rejected: " + e, true);
        } catch (final UnsupportedMessageType e) {
            if (logErrorAndDisconnectIfRequired(e, message)) {
                return;
            }
            if (sessionBeginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
                generateBusinessReject(message, BusinessRejectReason.UNSUPPORTED_MESSAGE_TYPE, 0);
            } else {
                generateReject(message, "Unsupported message type");
            }
        } catch (final UnsupportedVersion e) {
            if (logErrorAndDisconnectIfRequired(e, message)) {
                return;
            }
            if (MsgType.LOGOUT.equals(msgType)) {
                nextLogout(message);
            } else {
                generateLogout("Incorrect BeginString: " + e.getMessage());
                state.incrNextTargetMsgSeqNum();
                // 1d_InvalidLogonWrongBeginString.def appears to require
                // a disconnect although the C++ didn't appear to be doing it.
                // ???
                disconnect("Incorrect BeginString: " + e, true);
            }
        } catch (final IOException e) {
            LogUtil.logThrowable(sessionID, "Error processing message: " + getMessageToLog(message), e);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
        } catch (Throwable t) { // QFJ-572
            // If there are any other Throwables we might catch them here if desired.
            // They were most probably thrown out of fromCallback().
            if (rejectMessageOnUnhandledException) {
                getLog().onErrorEvent("Rejecting message: " + t + ": " + getMessageToLog(message));
                if (resetOrDisconnectIfRequired(message)) {
                    return;
                }
                if (!(MessageUtils.isAdminMessage(msgType))
                        && (sessionBeginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0)) {
                    generateBusinessReject(message, BusinessRejectReason.APPLICATION_NOT_AVAILABLE,
                            0);
                } else {
                    if (MsgType.LOGON.equals(msgType)) {
                        disconnect("Problem processing Logon message", true);
                    } else {
                        generateReject(message, SessionRejectReason.OTHER, 0);
                    }
                }
            } else {
                // Re-throw as quickfix.RuntimeError to keep close to the former behaviour
                // and to have a clear notion of what is thrown out of this method.
                // Throwing RuntimeError here means that the target seqnum is not incremented
                // and a resend will be triggered by the next incoming message.
                throw new RuntimeError(t);
            }
        }

        // QFJ-788: prevent StackOverflow on large queue
        if (!isProcessingQueuedMessages) {
            nextQueued();
            if (isLoggedOn()) {
                next();
            }
        }
    }

    private void handleExceptionAndRejectMessage(final String msgType, final Message message, final HasFieldAndReason e) throws FieldNotFound, IOException {
        if (MsgType.LOGON.equals(msgType)) {
            logoutWithErrorMessage(e.getMessage());
        } else {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + getMessageToLog(message));
            generateReject(message, e.getMessage(), e.getSessionRejectReason(), e.getField());
        }
    }

    private void logoutWithErrorMessage(final String reason) throws IOException {
        final String errorMessage = "Invalid Logon message: " + (reason != null ? reason : "unspecific reason");
        generateLogout(errorMessage);
        state.incrNextTargetMsgSeqNum();
        disconnect(errorMessage, true);
    }

    private boolean logErrorAndDisconnectIfRequired(final Exception e, Message message) {
        final boolean resetOrDisconnectIfRequired = resetOrDisconnectIfRequired(message);
        if (resetOrDisconnectIfRequired) {
            getLog().onErrorEvent("Encountered invalid message: " + e + ": " + getMessageToLog(message));
        }
        return resetOrDisconnectIfRequired;
    }

    /**
     * (Internal use only)
     */
    public void next(Message message) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {

        if (rejectGarbledMessage && message.isGarbled()) {
            generateReject(message, "Message failed basic validity check");
            return;
        }
        next(message, false);
    }

    private boolean resetOrDisconnectIfRequired(Message msg) {
        if (!resetOnError && !disconnectOnError) {
            return false;
        }
        if (!isLoggedOn()) {
            return false;
        }
        // do not interfere in admin and logon/logout messages etc.
        if (msg != null && msg.isAdmin()) {
            return false;
        }
        if (resetOnError) {
            try {
                getLog().onErrorEvent("Auto reset");
                reset();
            } catch (final IOException e) {
                LOG.error("Failed resetting: {}", e);
            }
            return true;
        }
        if (disconnectOnError) {
            try {
                disconnect("Auto disconnect", false);
            } catch (final IOException e) {
                LOG.error("Failed disconnecting: {}", e);
            }
            return true;
        }
        return false;
    }

    private void nextReject(Message reject) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        if (!verify(reject, false, validateSequenceNumbers)) {
            return;
        }
        if (getExpectedTargetNum() == reject.getHeader().getInt(MsgSeqNum.FIELD)) {
            state.incrNextTargetMsgSeqNum();
        }
        nextQueued();
    }

    private void nextResendRequest(Message resendRequest) throws IOException, RejectLogon,
            FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType,
            InvalidMessage {
        // QFJ-653: Check if seqnums are too low.
        // QFJ-673: Do not check if seqnums are too high in verify() since in case of a seqnum mismatch this will
        // enqueue the ResendRequest for later processing. This might lead to a deadlock situation in
        // which the counterparty waits for our messages to be resent and we are also waiting for our
        // ResendRequest to be satisfied in order to process the queued ResendRequest of the counterparty.
        // Instead, send out the requested messages and afterwards enqueue the ResendRequest in order to
        // later increase the target seqnum in method nextQueued(int).
        if (!verify(resendRequest, false, validateSequenceNumbers)) {
            return;
        }
        final int msgSeqNum = resendRequest.getHeader().getInt(MsgSeqNum.FIELD);
        if (validateSequenceNumbers && isTargetTooHigh(msgSeqNum)) {
            enqueueMessage(resendRequest, msgSeqNum);
        }

        final int beginSeqNo = resendRequest.getInt(BeginSeqNo.FIELD);
        final int endSeqNo = resendRequest.getInt(EndSeqNo.FIELD);
        getLog().onEvent(
                "Received ResendRequest FROM: " + beginSeqNo + " TO: " + formatEndSeqNum(endSeqNo));
        manageGapFill(resendRequest, beginSeqNo, endSeqNo);
    }

    /**
     * A Gap has been request to be filled by either a resend request or on a logon message
     *
     * @param messageOutSync the message that caused the gap to be filled
     * @param beginSeqNo     the seqNum of the first missing message
     * @param endSeqNo       the seqNum of the last missing message
     * @throws FieldNotFound
     * @throws IOException
     * @throws InvalidMessage
     */
    private void manageGapFill(Message messageOutSync, int beginSeqNo, int endSeqNo)
            throws FieldNotFound, IOException, InvalidMessage {

        // Adjust the ending sequence number for older versions of FIX
        final String beginString = sessionID.getBeginString();
        final int expectedSenderNum = getExpectedSenderNum();
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0 && endSeqNo == 0
                || beginString.compareTo(FixVersions.BEGINSTRING_FIX42) <= 0 && endSeqNo == 999999
                || endSeqNo >= expectedSenderNum) {
            endSeqNo = expectedSenderNum - 1;
        }

        // Just do a gap fill when messages aren't persisted
        if (!persistMessages) {
            endSeqNo += 1;
            final int next = state.getNextSenderMsgSeqNum();
            if (endSeqNo > next) {
                endSeqNo = next;
            }
            generateSequenceReset(messageOutSync, beginSeqNo, endSeqNo);
        } else {
            resendMessages(messageOutSync, beginSeqNo, endSeqNo);
        }
        final int resendRequestMsgSeqNum = messageOutSync.getHeader().getInt(MsgSeqNum.FIELD);
        if (getExpectedTargetNum() == resendRequestMsgSeqNum) {
            state.incrNextTargetMsgSeqNum();
        }
    }

    private String formatEndSeqNum(int seqNo) {
        return (seqNo == 0 ? "infinity" : Integer.toString(seqNo));
    }

    private Message parseMessage(String messageData) throws InvalidMessage {
        return MessageUtils.parse(this, messageData);
    }

    private boolean isTargetTooLow(int msgSeqNum) throws IOException {
        return msgSeqNum < state.getNextTargetMsgSeqNum();
    }

    /**
     * @param receivedMessage if not null, it is the message received and upon which the resend request is generated
     * @param beginSeqNo
     * @param endSeqNo
     * @throws FieldNotFound
     */
    private void generateSequenceReset(Message receivedMessage, int beginSeqNo, int endSeqNo)
            throws FieldNotFound {
        final Message sequenceReset = messageFactory.create(sessionID.getBeginString(),
                MsgType.SEQUENCE_RESET);
        final Header header = sequenceReset.getHeader();
        header.setBoolean(PossDupFlag.FIELD, true);
        initializeHeader(header);
        header.setUtcTimeStamp(OrigSendingTime.FIELD, header.getUtcTimeStamp(SendingTime.FIELD),
                getTimestampPrecision());
        header.setInt(MsgSeqNum.FIELD, beginSeqNo);
        sequenceReset.setInt(NewSeqNo.FIELD, endSeqNo);
        sequenceReset.setBoolean(GapFillFlag.FIELD, true);
        if (receivedMessage != null && enableLastMsgSeqNumProcessed) {
            try {
                sequenceReset.getHeader().setInt(LastMsgSeqNumProcessed.FIELD,
                        receivedMessage.getHeader().getInt(MsgSeqNum.FIELD));
            } catch (final FieldNotFound e) {
                // should not happen as MsgSeqNum must be present
                getLog().onErrorEvent("Received message without MsgSeqNum " + getMessageToLog(receivedMessage));
            }
        }
        sendRaw(sequenceReset, beginSeqNo);
        getLog().onEvent("Sent SequenceReset TO: " + endSeqNo);
    }

    private boolean resendApproved(Message message) throws FieldNotFound {
        try {
            application.toApp(message, sessionID);
        } catch (final DoNotSend e) {
            return false;
        } catch (final Throwable t) {
            // Any exception other than DoNotSend will not stop the message from being resent
            logApplicationException("toApp() during resend", t);
        }

        return true;
    }

    private void initializeResendFields(Message message) throws FieldNotFound {
        final Message.Header header = message.getHeader();
        final LocalDateTime sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
        header.setUtcTimeStamp(OrigSendingTime.FIELD, sendingTime, getTimestampPrecision());
        header.setBoolean(PossDupFlag.FIELD, true);
        insertSendingTime(header);
    }

    private void logApplicationException(String location, Throwable t) {
        logThrowable(getLog(), "Application exception in " + location, t);
    }

    private void nextLogout(Message logout) throws IOException, RejectLogon, FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        if (!verify(logout, false, false)) {
            return;
        }

        state.setLogoutReceived(true);

        String msg;
        if (!state.isLogoutSent()) {
            msg = "Received logout request";
            if (logout.isSetField(Text.FIELD)) {
                msg += ": " + logout.getString(Text.FIELD);
            }
            getLog().onEvent(msg);
            generateLogout(logout);
            getLog().onEvent("Sent logout response");
        } else {
            msg = "Received logout response";
            getLog().onEvent(msg);
        }

        // QFJ-750
        if (getExpectedTargetNum() == logout.getHeader().getInt(MsgSeqNum.FIELD)) {
            state.incrNextTargetMsgSeqNum();
        }
        if (resetOnLogout) {
            resetState();
        }

        disconnect(msg, false);
    }

    public void generateLogout() {
        generateLogout(null, null, null);
    }

    private void generateLogout(Message otherLogout) {
        generateLogout(otherLogout, null, null);
    }

    private void generateLogout(String reason) {
        generateLogout(null, reason, null);
    }

    private void generateLogout(String reason, SessionStatus sessionStatus) {
        generateLogout(null, reason, sessionStatus);
    }

    /**
     * To generate a logout message
     *
     * @param otherLogout if not null, the logout message that is causing a logout to be sent
     * @param text
     */
    private void generateLogout(Message otherLogout, String text, SessionStatus sessionStatus) {
        final Message logout = messageFactory.create(sessionID.getBeginString(), MsgType.LOGOUT);
        initializeHeader(logout.getHeader());
        if (text != null && !"".equals(text)) {
            logout.setString(Text.FIELD, text);
        }
        if (sessionStatus != null) {
            logout.setInt(SessionStatus.FIELD, sessionStatus.getValue());
        }
        if (otherLogout != null && enableLastMsgSeqNumProcessed) {
            try {
                logout.getHeader().setInt(LastMsgSeqNumProcessed.FIELD,
                        otherLogout.getHeader().getInt(MsgSeqNum.FIELD));
            } catch (final FieldNotFound e) {
                // should not happen as MsgSeqNum must be present
                getLog().onErrorEvent("Received logout without MsgSeqNum");
            }
        }
        sendRaw(logout, 0);
        state.setLogoutSent(true);
    }

    private void nextSequenceReset(Message sequenceReset) throws IOException, RejectLogon,
            FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        boolean isGapFill = false;
        if (sequenceReset.isSetField(GapFillFlag.FIELD)) {
            isGapFill = sequenceReset.getBoolean(GapFillFlag.FIELD) && validateSequenceNumbers;
        }

        if (!verify(sequenceReset, isGapFill, isGapFill)) {
            return;
        }

        if (validateSequenceNumbers && sequenceReset.isSetField(NewSeqNo.FIELD)) {
            final int newSequence = sequenceReset.getInt(NewSeqNo.FIELD);
            stateListener.onSequenceResetReceived(newSequence, isGapFill);
            getLog().onEvent(
                    "Received SequenceReset FROM: " + getExpectedTargetNum() + " TO: "
                            + newSequence);
            if (newSequence > getExpectedTargetNum()) {
                state.setNextTargetMsgSeqNum(newSequence);
                final ResendRange range = state.getResendRange();
                if (range.isChunkedResendRequest()) {
                    if (newSequence >= range.getCurrentEndSeqNo()
                            && newSequence < range.getEndSeqNo()) {
                        // If new seq no is beyond the range of the current chunk
                        // and if we are not done with all resend chunks,
                        // we send out a ResendRequest at once.
                        // Alternatively, we could also wait for the next incoming message
                        // which would trigger another resend.
                        final String beginString = sequenceReset.getHeader().getString(
                                BeginString.FIELD);
                        // New sequence is the sequence number of the next message that
                        // should be received, so it must be included in requested range
                        sendResendRequest(beginString, range.getEndSeqNo() + 1, newSequence,
                                range.getEndSeqNo());
                    }
                }
                // QFJ-728: newSequence will be the seqnum of the next message so we
                // delete all older messages from the queue since they are effectively skipped.
                state.dequeueMessagesUpTo(newSequence);
            } else if (newSequence < getExpectedTargetNum()) {

                getLog().onErrorEvent(
                        "Invalid SequenceReset: newSequence=" + newSequence + " < expected="
                                + getExpectedTargetNum());
                if (resetOrDisconnectIfRequired(sequenceReset)) {
                    return;
                }
                generateReject(sequenceReset, SessionRejectReason.VALUE_IS_INCORRECT,
                        NewSeqNo.FIELD);
            }
        }
    }

    private void generateReject(Message message, String str) throws FieldNotFound, IOException {
        final String beginString = sessionID.getBeginString();
        final Message reject = messageFactory.create(beginString, MsgType.REJECT);
        final Header header = message.getHeader();

        reject.reverseRoute(header);
        initializeHeader(reject.getHeader());

        final String msgType = (header.isSetField(MsgType.FIELD) ? header.getString(MsgType.FIELD) : null);
        final String msgSeqNum = (header.isSetField(MsgSeqNum.FIELD) ? header.getString(MsgSeqNum.FIELD) : NumbersCache.get(0));
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0 && msgType != null) {
            reject.setString(RefMsgType.FIELD, msgType);
        }
        reject.setString(RefSeqNum.FIELD, msgSeqNum);

        // QFJ-557: Only advance the sequence number if we are at the expected number.
        if (!MsgType.LOGON.equals(msgType) && !MsgType.SEQUENCE_RESET.equals(msgType)
                && Integer.parseInt(msgSeqNum) == getExpectedTargetNum()) {
            state.incrNextTargetMsgSeqNum();
        }

        reject.setString(Text.FIELD, str);
        sendRaw(reject, 0);
        getLog().onErrorEvent("Reject sent for message " + msgSeqNum + ": " + str);
    }

    private boolean isPossibleDuplicate(Message message) throws FieldNotFound {
        final Header header = message.getHeader();
        return header.isSetField(PossDupFlag.FIELD) && header.getBoolean(PossDupFlag.FIELD);
    }

    private void generateReject(Message message, int err, int field) throws IOException,
            FieldNotFound {
        generateReject(message, null, err, field);
    }

    private void generateReject(Message message, String text, int err, int field) throws IOException,
            FieldNotFound {
        final String reason;
        if (text != null) {
            reason = text;
        } else {
            reason = SessionRejectReasonText.getMessage(err);
        }
        if (!state.isLogonReceived()) {
            final String errorMessage = "Tried to send a reject while not logged on: " + reason
                    + (reason.endsWith("" + field) ? "" : " (field " + field + ")");
            throw new SessionException(errorMessage);
        }

        final String beginString = sessionID.getBeginString();
        final Message reject = messageFactory.create(beginString, MsgType.REJECT);
        final Header header = message.getHeader();

        reject.reverseRoute(header);
        initializeHeader(reject.getHeader());

        String msgType = "";
        if (header.isSetField(MsgType.FIELD)) {
            msgType = header.getString(MsgType.FIELD);
        }

        int msgSeqNum = 0;
        if (header.isSetField(MsgSeqNum.FIELD)) {
            msgSeqNum = header.getInt(MsgSeqNum.FIELD);
            reject.setInt(RefSeqNum.FIELD, msgSeqNum);
        }

        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            if (!"".equals(msgType)) {
                reject.setString(RefMsgType.FIELD, msgType);
            }
            if (beginString.compareTo(FixVersions.BEGINSTRING_FIX44) > 0) {
                reject.setInt(SessionRejectReason.FIELD, err);
            } else if (beginString.compareTo(FixVersions.BEGINSTRING_FIX44) == 0) {
                if (err == SessionRejectReason.OTHER
                        || err <= SessionRejectReason.NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER) {
                    reject.setInt(SessionRejectReason.FIELD, err);
                }
            } else if (beginString.compareTo(FixVersions.BEGINSTRING_FIX43) == 0) {
                if (err <= SessionRejectReason.NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER) {
                    reject.setInt(SessionRejectReason.FIELD, err);
                }
            } else if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) == 0) {
                if (err <= SessionRejectReason.INVALID_MSGTYPE) {
                    reject.setInt(SessionRejectReason.FIELD, err);
                }
            }
        }

        // This is a set and increment of target msg sequence number, the sequence
        // number must be locked to guard against race conditions.

        state.lockTargetMsgSeqNum();
        try {
            // QFJ-557: Only advance the sequence number if we are at the expected number.
            if (!MsgType.LOGON.equals(msgType) && !MsgType.SEQUENCE_RESET.equals(msgType)
                    && msgSeqNum == getExpectedTargetNum()) {
                state.incrNextTargetMsgSeqNum();
            }
        } finally {
            state.unlockTargetMsgSeqNum();
        }
        final String logMessage = "Reject sent for message " + msgSeqNum;
        if (reason != null && (field > 0 || err == SessionRejectReason.INVALID_TAG_NUMBER)) {
            setRejectReason(reject, field, reason, true);
            getLog().onErrorEvent(logMessage + ": " + reason + (reason.endsWith("" + field) ? "" : ":" + field));
        } else if (reason != null) {
            setRejectReason(reject, reason);
            getLog().onErrorEvent(logMessage + ": " + reason);
        } else {
            getLog().onErrorEvent(logMessage);
        }

        if (enableLastMsgSeqNumProcessed) {
            reject.getHeader().setInt(LastMsgSeqNumProcessed.FIELD,
                    message.getHeader().getInt(MsgSeqNum.FIELD));
        }

        sendRaw(reject, 0);
    }

    private void setRejectReason(Message reject, String reason) {
        reject.setString(Text.FIELD, reason);
    }

    private void setRejectReason(Message reject, int field, String reason,
                                 boolean includeFieldInReason) {
        boolean isRejectMessage;
        try {
            isRejectMessage = MsgType.REJECT.equals(reject.getHeader().getString(MsgType.FIELD));
        } catch (final FieldNotFound e) {
            isRejectMessage = false;
        }
        if (isRejectMessage
                && sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            reject.setInt(RefTagID.FIELD, field);
            reject.setString(Text.FIELD, reason);
        } else {
            String rejectReason = reason;
            if (includeFieldInReason && !rejectReason.endsWith("" + field)) {
                rejectReason = rejectReason + ", field=" + field;
            }
            reject.setString(Text.FIELD, rejectReason);
        }
    }

    private void generateBusinessReject(Message message, int err, int field) throws FieldNotFound,
            IOException {
        final Message reject = messageFactory.create(sessionID.getBeginString(),
                MsgType.BUSINESS_MESSAGE_REJECT);
        final Header header = message.getHeader();
        reject.reverseRoute(header);
        initializeHeader(reject.getHeader());

        final String msgType = header.getString(MsgType.FIELD);
        final String msgSeqNum = header.getString(MsgSeqNum.FIELD);
        reject.setString(RefMsgType.FIELD, msgType);
        reject.setString(RefSeqNum.FIELD, msgSeqNum);
        reject.setInt(BusinessRejectReason.FIELD, err);
        state.incrNextTargetMsgSeqNum();

        final String reason = BusinessRejectReasonText.getMessage(err);
        setRejectReason(reject, field, reason, field != 0);
        getLog().onErrorEvent(
                "Reject sent for message " + msgSeqNum + (reason != null ? (": " + reason) : "")
                        + (field != 0 ? (": tag=" + field) : ""));

        sendRaw(reject, 0);
    }

    private void nextTestRequest(Message testRequest) throws FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        if (!verify(testRequest)) {
            return;
        }
        generateHeartbeat(testRequest);
        state.incrNextTargetMsgSeqNum();
        nextQueued();
    }

    private void generateHeartbeat(Message testRequest) throws FieldNotFound {
        final Message heartbeat = messageFactory.create(sessionID.getBeginString(),
                MsgType.HEARTBEAT);
        initializeHeader(heartbeat.getHeader());
        if (testRequest.isSetField(TestReqID.FIELD)) {
            heartbeat.setString(TestReqID.FIELD, testRequest.getString(TestReqID.FIELD));
        }
        if (enableLastMsgSeqNumProcessed) {
            heartbeat.getHeader().setInt(LastMsgSeqNumProcessed.FIELD,
                    testRequest.getHeader().getInt(MsgSeqNum.FIELD));
        }

        sendRaw(heartbeat, 0);
    }

    private void nextHeartBeat(Message heartBeat) throws FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        if (!verify(heartBeat)) {
            return;
        }
        state.incrNextTargetMsgSeqNum();
        nextQueued();
    }

    private boolean verify(Message msg, boolean checkTooHigh, boolean checkTooLow)
            throws RejectLogon, FieldNotFound, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType, IOException {

        state.setLastReceivedTime(SystemTime.currentTimeMillis());
        state.clearTestRequestCounter();

        String msgType;
        try {
            final Message.Header header = msg.getHeader();
            msgType = header.getString(MsgType.FIELD);
            int msgSeqNum = 0;
            if (checkTooHigh || checkTooLow) {
                msgSeqNum = header.getInt(MsgSeqNum.FIELD);
            }

            if (!validLogonState(msgType)) {
                throw new SessionException("Logon state is not valid for message (MsgType="
                        + msgType + ")");
            }

            if (!isGoodTime(msg)) {
                doBadTime(msg);
                return false;
            }

            if (!isCorrectCompID(msg)) {
                doBadCompID(msg);
                return false;
            }

            if (checkTooHigh && isTargetTooHigh(msgSeqNum)) {
                doTargetTooHigh(msg);
                return false;
            } else if (checkTooLow && isTargetTooLow(msgSeqNum)) {
                doTargetTooLow(msg);
                return false;
            }

            // Handle poss dup where msgSeq is as expected
            // FIX 4.4 Vol 2, test case 2f&g
            if (isPossibleDuplicate(msg) && !validatePossDup(msg)) {
                return false;
            }

            if (checkTooHigh && state.isResendRequested()) {
                final ResendRange range;
                synchronized (state.getLock()) {
                    range = state.getResendRange();
                    if (msgSeqNum >= range.getEndSeqNo()) {
                        getLog().onEvent(
                                "ResendRequest for messages FROM " + range.getBeginSeqNo() + " TO " + range.getEndSeqNo()
                                        + " has been satisfied.");
                        stateListener.onResendRequestSatisfied(range.getBeginSeqNo(), range.getEndSeqNo());
                        state.setResendRange(0, 0, 0);
                    }
                }
                if (msgSeqNum < range.getEndSeqNo() && range.isChunkedResendRequest() && msgSeqNum >= range.getCurrentEndSeqNo()) {
                    final String beginString = header.getString(BeginString.FIELD);
                    sendResendRequest(beginString, range.getEndSeqNo() + 1, msgSeqNum + 1, range.getEndSeqNo());
                }
            }
        } catch (final FieldNotFound e) {
            throw e;
        } catch (final Exception e) {
            getLog().onErrorEvent(e.getClass().getName() + " " + e.getMessage());
            disconnect("Verifying message failed: " + e, true);
            return false;
        }

        fromCallback(msgType, msg, sessionID);
        return true;
    }

    private boolean doTargetTooLow(Message msg) throws FieldNotFound, IOException {
        if (!isPossibleDuplicate(msg)) {
            final int msgSeqNum = msg.getHeader().getInt(MsgSeqNum.FIELD);
            final String text = "MsgSeqNum too low, expecting " + getExpectedTargetNum()
                    + " but received " + msgSeqNum;
            generateLogout(text);
            throw new SessionException(text);
        }
        return validatePossDup(msg);
    }

    private void doBadCompID(Message msg) throws IOException, FieldNotFound {
        if (!MsgType.LOGON.equals(msg.getHeader().getString(MsgType.FIELD))) {
            generateReject(msg, BAD_COMPID_REJ_REASON, 0);
            generateLogout(BAD_COMPID_TEXT);
        } else {
            logoutWithErrorMessage(BAD_COMPID_TEXT);
        }
    }

    private void doBadTime(Message msg) throws IOException, FieldNotFound {
        try {
            if (!MsgType.LOGON.equals(msg.getHeader().getString(MsgType.FIELD))) {
                generateReject(msg, BAD_TIME_REJ_REASON, SendingTime.FIELD);
                generateLogout(BAD_TIME_TEXT);
            } else {
                logoutWithErrorMessage(BAD_TIME_TEXT);
            }
        } catch (final SessionException ex) {
            generateLogout(ex.getMessage());
            throw ex;
        }
    }

    private boolean isGoodTime(Message message) throws FieldNotFound {
        if (!checkLatency) {
            return true;
        }
        final LocalDateTime sendingTime = message.getHeader().getUtcTimeStamp(SendingTime.FIELD);
        return Math.abs(SystemTime.currentTimeMillis() - sendingTime.toInstant(ZoneOffset.UTC).toEpochMilli()) / 1000 <= maxLatency;
    }

    private void fromCallback(String msgType, Message msg, SessionID sessionID2)
            throws RejectLogon, FieldNotFound, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType {
        // Application exceptions will prevent the incoming sequence number from being incremented
        // and may result in resend requests and the next startup. This way, a buggy application
        // can be fixed and then reprocess previously sent messages.
        // QFJ-572: Behaviour depends on the setting of flag rejectMessageOnUnhandledException.
        if (MessageUtils.isAdminMessage(msgType)) {
            application.fromAdmin(msg, sessionID);
        } else {
            application.fromApp(msg, sessionID);
        }
    }

    private synchronized boolean validLogonState(String msgType) {
        return MsgType.LOGON.equals(msgType) && state.isResetSent() || state.isResetReceived() ||
                MsgType.LOGON.equals(msgType) && !state.isLogonReceived() ||
                !MsgType.LOGON.equals(msgType) && state.isLogonReceived() ||
                MsgType.LOGOUT.equals(msgType) && state.isLogonSent() ||
                !MsgType.LOGOUT.equals(msgType) && state.isLogoutSent() ||
                MsgType.SEQUENCE_RESET.equals(msgType) || MsgType.REJECT.equals(msgType);
    }

    private boolean verify(Message message) throws RejectLogon, FieldNotFound, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException {
        return verify(message, validateSequenceNumbers, validateSequenceNumbers);
    }

    /**
     * Called from the timer-related code in the acceptor/initiator
     * implementations. This is not typically called from application code.
     *
     * @throws IOException IO error
     */
    public void next() throws IOException {

        if (!isEnabled()) {
            if (isLoggedOn()) {
                if (!state.isLogoutSent()) {
                    getLog().onEvent("Initiated logout request");
                    generateLogout(state.getLogoutReason());
                }
            } else {
                return;
            }
        }

        if (sessionSchedule != null && !sessionSchedule.isNonStopSession()) {
            // Only check the session time once per second at most. It isn't
            // necessary to do for every message received.
            final long now = SystemTime.currentTimeMillis();
            if ((now - lastSessionTimeCheck) >= 1000L) {
                lastSessionTimeCheck = now;
                if (!isSessionTime()) {
                    if (state.isResetNeeded()) {
                        reset(); // only reset if seq nums are != 1
                    }
                    return; // since we are outside of session time window
                } else {
                    // reset when session becomes active
                    resetIfSessionNotCurrent(sessionID, now);
                }
            }
        }

        // Return if we are not connected
        if (!hasResponder()) {
            return;
        }

        if (!state.isLogonReceived()) {
            if (state.isLogonSendNeeded()) {
                if (isTimeToGenerateLogon()) {
                    // ApplicationExtended can prevent the automatic login
                    if (application instanceof ApplicationExtended) {
                        if (!((ApplicationExtended) application).canLogon(sessionID)) {
                            return;
                        }
                    }
                    // QFJ-926 - reset session before initiating Logon
                    resetIfSessionNotCurrent(sessionID, SystemTime.currentTimeMillis());
                    if (generateLogon()) {
                        getLog().onEvent("Initiated logon request");
                    } else {
                        getLog().onErrorEvent("Error during logon request initiation");
                    }
                }
            } else if (state.isLogonAlreadySent() && state.isLogonTimedOut()) {
                disconnect("Timed out waiting for logon response", true);
            }
            return;
        }

        if (state.getHeartBeatInterval() == 0) {
            return;
        }

        if (state.isLogoutTimedOut()) {
            disconnect("Timed out waiting for logout response", true);
        }

        if (state.isTimedOut()) {
            if (!disableHeartBeatCheck) {
                disconnect("Timed out waiting for heartbeat", true);
                stateListener.onHeartBeatTimeout();
            } else {
                LOG.warn("Heartbeat failure detected but deactivated");
            }
        } else {
            if (state.isTestRequestNeeded()) {
                generateTestRequest("TEST");
                getLog().onEvent("Sent test request TEST");
                stateListener.onMissedHeartBeat();
            } else if (state.isHeartBeatNeeded()) {
                generateHeartbeat();
            }
        }
    }

    private long computeNextLogonDelayMillis() {
        int index = logonAttempts - 1;
        if (index < 0) {
            index = 0;
        }
        long secs;
        if (index >= logonIntervals.length) {
            secs = logonIntervals[logonIntervals.length - 1];
        } else {
            secs = logonIntervals[index];
        }
        return secs * 1000L;
    }

    private boolean isTimeToGenerateLogon() {
        return SystemTime.currentTimeMillis() - lastSessionLogon >= computeNextLogonDelayMillis();
    }

    public void generateHeartbeat() {
        final Message heartbeat = messageFactory.create(sessionID.getBeginString(),
                MsgType.HEARTBEAT);
        initializeHeader(heartbeat.getHeader());
        sendRaw(heartbeat, 0);
    }

    public void generateTestRequest(String id) {
        state.incrementTestRequestCounter();
        final Message testRequest = messageFactory.create(sessionID.getBeginString(),
                MsgType.TEST_REQUEST);
        initializeHeader(testRequest.getHeader());
        testRequest.setString(TestReqID.FIELD, id);
        sendRaw(testRequest, 0);
    }

    private boolean generateLogon() throws IOException {
        final Message logon = messageFactory.create(sessionID.getBeginString(), MsgType.LOGON);
        logon.setInt(EncryptMethod.FIELD, 0);
        logon.setInt(HeartBtInt.FIELD, state.getHeartBeatInterval());
        if (sessionID.isFIXT()) {
            logon.setField(DefaultApplVerID.FIELD, senderDefaultApplVerID);
        }
        if (refreshOnLogon) {
            refreshState();
        }
        if (resetOnLogon) {
            resetState();
        }
        if (isResetNeeded()) {
            logon.setBoolean(ResetSeqNumFlag.FIELD, true);
        }
        state.setLastReceivedTime(SystemTime.currentTimeMillis());
        state.clearTestRequestCounter();
        state.setLogonSent(true);
        logonAttempts++;

        if (enableNextExpectedMsgSeqNum) {
            final int nextExpectedMsgNum = getExpectedTargetNum();
            logon.setInt(NextExpectedMsgSeqNum.FIELD, nextExpectedMsgNum);
            state.setLastExpectedLogonNextSeqNum(nextExpectedMsgNum);
        }

        setLogonTags(logon);
        return sendRaw(logon, 0);
    }

    /**
     * Logs out from session and closes the network connection.
     * <p>
     * This method should not be called from user-code since it is likely
     * to deadlock when called from a different thread than the Session thread
     * and messages are sent/received concurrently.
     * Instead the logout() method should be used where possible.
     *
     * @param reason   the reason why the session is disconnected
     * @param logError set to true if this disconnection is an error
     * @throws IOException IO error
     */
    public void disconnect(String reason, boolean logError) throws IOException {
        try {
            final boolean logonReceived = state.isLogonReceived();
            final boolean logonSent = state.isLogonSent();

            synchronized (responderLock) {
                if (!hasResponder()) {
                    if (!ENCOUNTERED_END_OF_STREAM.equals(reason)) {
                        getLog().onEvent("Already disconnected: " + reason);
                    }
                    return;
                }
                final String msg = "Disconnecting: " + reason;
                if (logError) {
                    getLog().onErrorEvent(msg);
                } else {
                    getLog().onEvent(msg);
                }
                responder.disconnect();
                setResponder(null);
            }

            if (logonReceived || logonSent) {
                try {
                    application.onLogout(sessionID);
                } catch (final Throwable t) {
                    logApplicationException("onLogout()", t);
                }

                stateListener.onLogout();
            }
        } finally {
            // QFJ-457 now enabled again if acceptor
            if (!state.isInitiator()) {
                setEnabled(true);
            }

            state.setLogonReceived(false);
            state.setLogonSent(false);
            state.setLogoutSent(false);
            state.setLogoutReceived(false);
            state.setResetReceived(false);
            state.setResetSent(false);
            state.clearQueue();
            state.clearLogoutReason();
            state.setResendRange(0, 0);

            if (resetOnDisconnect) {
                resetState();
            }
        }
    }

    private void nextLogon(Message logon) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {

        // QFJ-357
        // If this check is not done here, the Logon would be accepted and
        // immediately followed by a Logout (due to check in Session.next()).
        if (!isSessionTime()) {
            throw new RejectLogon("Logon attempt not within session time");
        }

        // QFJ-926 - reset session before accepting Logon
        resetIfSessionNotCurrent(sessionID, SystemTime.currentTimeMillis());

        if (refreshOnLogon) {
            refreshState();
        }

        if (logon.isSetField(ResetSeqNumFlag.FIELD)) {
            state.setResetReceived(logon.getBoolean(ResetSeqNumFlag.FIELD));
        } else if (state.isResetSent() && logon.getHeader().getInt(MsgSeqNum.FIELD) == 1) { // QFJ-383
            getLog().onEvent(
                    "Inferring ResetSeqNumFlag as sequence number is 1 in response to reset request");
            state.setResetReceived(true);
        }

        if (state.isResetReceived()) {
            getLog().onEvent("Logon contains ResetSeqNumFlag=Y, resetting sequence numbers to 1");
            if (!state.isResetSent()) {
                resetState();
            }
        }

        if (state.isLogonSendNeeded() && !state.isResetReceived()) {
            disconnect("Received logon response before sending request", true);
            return;
        }

        if (!state.isInitiator() && resetOnLogon) {
            resetState();
        }

        if (!verify(logon, false, validateSequenceNumbers)) {
            return;
        }

        // reset logout messages
        state.setLogoutReceived(false);
        state.setLogoutSent(false);
        state.setLogonReceived(true);

        // remember the expected sender sequence number of any logon response for future use
        final int nextSenderMsgNumAtLogonReceived = state.getMessageStore().getNextSenderMsgSeqNum();
        final int sequence = logon.getHeader().getInt(MsgSeqNum.FIELD);

        /*
         * We test here that it's not too high (which would result in a resend) and that we are not
         * resetting on logon 34=1
         */
        final boolean isLogonInNormalSequence = !(isTargetTooHigh(sequence) && !resetOnLogon);
        // if we have a tag 789 sent to us...
        if (logon.isSetField(NextExpectedMsgSeqNum.FIELD) && enableNextExpectedMsgSeqNum) {

            final int targetWantsNextSeqNumToBe = logon.getInt(NextExpectedMsgSeqNum.FIELD);
            state.lockSenderMsgSeqNum();
            final int actualNextNum;
            try {
                actualNextNum = state.getNextSenderMsgSeqNum();
            } finally {
                state.unlockSenderMsgSeqNum();
            }
            // Is the 789 we received too high ??
            if (targetWantsNextSeqNumToBe > actualNextNum) {
                // barf! we can't resend what we never sent! something unrecoverable has happened.
                final String err = "Tag " + NextExpectedMsgSeqNum.FIELD
                        + " (NextExpectedMsgSeqNum) is higher than expected. Expected "
                        + actualNextNum + ", Received " + targetWantsNextSeqNumToBe;
                generateLogout(err);
                disconnect(err, true);
                return;
            }
        }
        getLog().onEvent("Received logon");
        if (!state.isInitiator()) {
            /*
             * If we got one too high they need messages resent use the first message they missed (as we gap fill with that).
             * If we reset on logon, the current value will be 1 and we always send 2 (we haven't inc'd for current message yet +1)
             * If happy path (we haven't inc'd for current message yet so its current +1)
             */
            int nextExpectedTargetNum = state.getMessageStore().getNextTargetMsgSeqNum();
            // we increment for the logon later (after Logon response sent) in this method if and only if in sequence
            if (isLogonInNormalSequence) {
                // logon was fine take account of it in 789
                nextExpectedTargetNum++;
            }
            generateLogon(logon, nextExpectedTargetNum);
        }

        // Check for proper sequence reset response
        if (state.isResetSent() && !state.isResetReceived()) {
            disconnect("Received logon response before sending request", true);
        }

        state.setResetSent(false);
        state.setResetReceived(false);

        // Looking at the sequence number of the incoming Logon, is it too high indicating possible missed messages ? ..
        if (!isLogonInNormalSequence) {
            // if 789 was sent then we effectively have already sent a resend request
            if (state.isExpectedLogonNextSeqNumSent()) {
                // Mark state as if we have already sent a resend request from the logon's 789 (we sent) to infinity.
                // This will supress the resend request in doTargetTooHigh ...
                state.setResetRangeFromLastExpectedLogonNextSeqNumLogon();
                getLog().onEvent("Required resend will be suppressed as we are setting tag 789");
            }
            if (validateSequenceNumbers) {
                doTargetTooHigh(logon);
            }
        } else {
            state.incrNextTargetMsgSeqNum();
            nextQueued();
        }

        // Do we have a 789
        if (logon.isSetField(NextExpectedMsgSeqNum.FIELD) && enableNextExpectedMsgSeqNum) {
            final int targetWantsNextSeqNumToBe = logon.getInt(NextExpectedMsgSeqNum.FIELD);

            // is the 789 lower (we checked for higher previously) than our next message after receiving the logon
            if (targetWantsNextSeqNumToBe != nextSenderMsgNumAtLogonReceived) {
                int endSeqNo = nextSenderMsgNumAtLogonReceived;

                // Just do a gap fill when messages aren't persisted
                if (!persistMessages) {
                    endSeqNo += 1;
                    final int next = state.getNextSenderMsgSeqNum();
                    if (endSeqNo > next) {
                        endSeqNo = next;
                    }
                    getLog().onEvent(
                            "Received implicit ResendRequest via Logon FROM: "
                                    + targetWantsNextSeqNumToBe + " TO: " + nextSenderMsgNumAtLogonReceived
                                    + " will be reset");
                    generateSequenceReset(logon, targetWantsNextSeqNumToBe, // 34=
                            endSeqNo); // (NewSeqNo 36=)
                } else {
                    // resend missed messages
                    getLog().onEvent(
                            "Received implicit ResendRequest via Logon FROM: "
                                    + targetWantsNextSeqNumToBe + " TO: " + nextSenderMsgNumAtLogonReceived
                                    + " will be resent");
                    resendMessages(logon, targetWantsNextSeqNumToBe, endSeqNo);
                }
            }
        }
        if (isLoggedOn()) {
            try {
                application.onLogon(sessionID);
            } catch (final Throwable t) {
                logApplicationException("onLogon()", t);
            }
            stateListener.onLogon();
            lastSessionLogon = SystemTime.currentTimeMillis();
            logonAttempts = 0;
        }
    }

    private void resendMessages(Message receivedMessage, int beginSeqNo, int endSeqNo)
            throws IOException, InvalidMessage, FieldNotFound {

        final ArrayList<String> messages = new ArrayList<>();
        try {
            state.get(beginSeqNo, endSeqNo, messages);
        } catch (final IOException e) {
            if (forceResendWhenCorruptedStore) {
                LOG.error("Cannot read messages from stores, resend HeartBeats", e);
                for (int i = beginSeqNo; i < endSeqNo; i++) {
                    final Message heartbeat = messageFactory.create(sessionID.getBeginString(),
                            MsgType.HEARTBEAT);
                    initializeHeader(heartbeat.getHeader());
                    heartbeat.getHeader().setInt(MsgSeqNum.FIELD, i);
                    messages.add(heartbeat.toString());
                }
            } else {
                throw e;
            }
        }

        int msgSeqNum = 0;
        int begin = 0;
        int current = beginSeqNo;
        boolean appMessageJustSent = false;

        for (final String message : messages) {
            appMessageJustSent = false;
            final Message msg;
            try {
                // QFJ-626
                msg = parseMessage(message);
                msgSeqNum = msg.getHeader().getInt(MsgSeqNum.FIELD);
            } catch (final Exception e) {
                getLog().onErrorEvent(
                        "Error handling ResendRequest: failed to parse message (" + e.getMessage()
                                + "): " + message);
                // Note: a SequenceReset message will be generated to fill the gap
                continue;
            }

            if ((current != msgSeqNum) && begin == 0) {
                begin = current;
            }

            final String msgType = msg.getHeader().getString(MsgType.FIELD);

            if (MessageUtils.isAdminMessage(msgType) && !forceResendWhenCorruptedStore) {
                if (begin == 0) {
                    begin = msgSeqNum;
                }
            } else {
                initializeResendFields(msg);
                if (resendApproved(msg)) {
                    if (begin != 0) {
                        generateSequenceReset(receivedMessage, begin, msgSeqNum);
                    }
                    getLog().onEvent("Resending message: " + msgSeqNum);
                    send(msg.toString());
                    begin = 0;
                    appMessageJustSent = true;
                } else {
                    if (begin == 0) {
                        begin = msgSeqNum;
                    }
                }
            }
            current = msgSeqNum + 1;
        }

        int newBegin = beginSeqNo;
        if (appMessageJustSent) {
            newBegin = msgSeqNum + 1;
        }
        if (enableNextExpectedMsgSeqNum) {
            if (begin != 0) {
                generateSequenceReset(receivedMessage, begin, msgSeqNum + 1);
            } else {
                /*
                 * I've added an else here as I managed to fail this without it in a unit test, however the unit test data
                 * may not have been realistic to production on the other hand.
                 * Apart from the else
                 */
                generateSequenceResetIfNeeded(receivedMessage, newBegin, endSeqNo, msgSeqNum);
            }
        } else {
            if (begin != 0) {
                generateSequenceReset(receivedMessage, begin, msgSeqNum + 1);
            }
            generateSequenceResetIfNeeded(receivedMessage, newBegin, endSeqNo, msgSeqNum);
        }
    }

    private void generateSequenceResetIfNeeded(Message receivedMessage, int beginSeqNo, int endSeqNo, int msgSeqNum)
            throws IOException, FieldNotFound {
        if (endSeqNo > msgSeqNum) {
            endSeqNo = endSeqNo + 1;
            final int next = state.getNextSenderMsgSeqNum();
            if (endSeqNo > next) {
                endSeqNo = next;
            }
            generateSequenceReset(receivedMessage, beginSeqNo, endSeqNo);
        }
    }

    private void nextQueued() throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        while (nextQueued(getExpectedTargetNum())) {
            // continue
        }
    }

    private boolean nextQueued(int num) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        final Message msg = state.dequeue(num);
        if (msg != null) {
            getLog().onEvent("Processing queued message: " + num);

            final String msgType = msg.getHeader().getString(MsgType.FIELD);
            if (MsgType.LOGON.equals(msgType) || MsgType.RESEND_REQUEST.equals(msgType)) {
                // Logon and ResendRequest processing has already been done, so we just need to increment the target seqnum.
                state.incrNextTargetMsgSeqNum();
            } else {
                nextQueued(msg, msgType);
            }
            return true;
        }
        return false;
    }

    private void nextQueued(Message msg, String msgType) throws InvalidMessage, FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException {
        try {
            next(msg, true);
        } catch (final InvalidMessage e) {
            final String message = "Invalid message: " + e;
            if (MsgType.LOGON.equals(msgType)) {
                disconnect(message, true);
            } else {
                getLog().onErrorEvent(message);
                if (resetOrDisconnectIfRequired(null)) {
                    return;
                }
            }
            throw e;
        }
    }

    private void doTargetTooHigh(Message msg) throws FieldNotFound, IOException, InvalidMessage {
        final Message.Header header = msg.getHeader();
        final String beginString = header.getString(BeginString.FIELD);
        final int msgSeqNum = header.getInt(MsgSeqNum.FIELD);
        getLog().onEvent(
                "MsgSeqNum too high, expecting " + getExpectedTargetNum() + " but received "
                        + msgSeqNum + ": " + msg);
        enqueueMessage(msg, msgSeqNum);

        if (state.isResendRequested()) {
            final ResendRange range = state.getResendRange();

            if (!redundantResentRequestsAllowed && msgSeqNum >= range.getBeginSeqNo()) {
                int endSeqNo = range.getEndSeqNo();
                String end = endSeqNo == 0 ? "infinity" : Integer.toString(endSeqNo);
                getLog().onEvent(
                        "Already sent ResendRequest FROM: " + range.getBeginSeqNo() + " TO: " + end
                                + ".  Not sending another.");
                return;
            }
        }

        generateResendRequest(beginString, msgSeqNum);
    }

    /**
     * Generate a resend request between the current expected sequence number up to the given msgSeqNum.
     */
    private void generateResendRequest(String beginString, int msgSeqNum) {
        final int beginSeqNo = getExpectedTargetNum();
        final int endSeqNo = msgSeqNum - 1;
        sendResendRequest(beginString, msgSeqNum, beginSeqNo, endSeqNo);
    }

    /**
     * Sends a resend request
     *
     * @param beginString The begin string of the session.
     *                    FIX 4.1 and earlier get sent 999999 as the upper bound for unbounded requests.
     *                    FIX 4.2 and later get sent 0
     * @param msgSeqNum   The sequence number up to which to request
     * @param beginSeqNo  The sequence number to first request
     * @param endSeqNo    The highest sequence number to at most request
     */
    private void sendResendRequest(String beginString, int msgSeqNum, int beginSeqNo, int endSeqNo) {

        int lastEndSeqNoSent = resendRequestChunkSize == 0 ? endSeqNo : beginSeqNo
                + resendRequestChunkSize - 1;
        if (lastEndSeqNoSent > endSeqNo) {
            lastEndSeqNoSent = endSeqNo;
        }
        if (lastEndSeqNoSent == endSeqNo && !useClosedRangeForResend) {
            if (beginString.compareTo("FIX.4.2") >= 0) {
                endSeqNo = 0;
            } else if (beginString.compareTo("FIX.4.1") <= 0) {
                endSeqNo = 999999;
            }
        } else {
            endSeqNo = lastEndSeqNoSent;
        }

        final Message resendRequest = messageFactory.create(beginString, MsgType.RESEND_REQUEST);
        resendRequest.setInt(BeginSeqNo.FIELD, beginSeqNo);
        resendRequest.setInt(EndSeqNo.FIELD, endSeqNo);
        initializeHeader(resendRequest.getHeader());
        sendRaw(resendRequest, 0);
        getLog().onEvent("Sent ResendRequest FROM: " + beginSeqNo + " TO: " + (endSeqNo == 0 ? "infinity" : endSeqNo));
        int resendRangeEndSeqNum = msgSeqNum - 1;
        int resendRangeCurrentSeqNum = resendRequestChunkSize == 0 ? 0 : lastEndSeqNoSent;
        state.setResendRange(beginSeqNo, resendRangeEndSeqNum, resendRangeCurrentSeqNum);
        stateListener.onResendRequestSent(beginSeqNo, resendRangeEndSeqNum, resendRangeCurrentSeqNum);
    }

    private boolean validatePossDup(Message msg) throws FieldNotFound, IOException {
        final Message.Header header = msg.getHeader();
        final String msgType = header.getString(MsgType.FIELD);

        if (!MsgType.SEQUENCE_RESET.equals(msgType)) {
            if (header.isSetField(OrigSendingTime.FIELD)) {
                final LocalDateTime origSendingTime = header.getUtcTimeStamp(OrigSendingTime.FIELD);
                final LocalDateTime sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
                if (origSendingTime.compareTo(sendingTime) > 0) {
                    generateReject(msg, BAD_TIME_REJ_REASON, OrigSendingTime.FIELD);
                    generateLogout(BAD_ORIG_TIME_TEXT);
                    return false;
                }
            } else {
                // QFJ-703
                if (requiresOrigSendingTime) {
                    generateReject(msg, SessionRejectReason.REQUIRED_TAG_MISSING,
                            OrigSendingTime.FIELD);
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isTargetTooHigh(int sequence) throws IOException {
        return sequence > state.getNextTargetMsgSeqNum();
    }

    /**
     * Outgoing Logon in response to Logon received
     *
     * @param otherLogon        the one we are responding to with a Logon (response)
     * @param expectedTargetNum value for 789 tag (used only if enabled in properties)
     * @throws FieldNotFound expected message field of Logon not present.
     */
    private void generateLogon(Message otherLogon, int expectedTargetNum) throws FieldNotFound {
        final Message logon = messageFactory.create(sessionID.getBeginString(), MsgType.LOGON);
        logon.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
        if (state.isResetReceived()) {
            logon.setBoolean(ResetSeqNumFlag.FIELD, true);
        }
        logon.setInt(HeartBtInt.FIELD, otherLogon.getInt(HeartBtInt.FIELD));
        if (sessionID.isFIXT()) {
            logon.setField(senderDefaultApplVerID);
        }
        if (enableLastMsgSeqNumProcessed) {
            logon.getHeader().setInt(LastMsgSeqNumProcessed.FIELD,
                    otherLogon.getHeader().getInt(MsgSeqNum.FIELD));
        }
        initializeHeader(logon.getHeader());

        if (enableNextExpectedMsgSeqNum) {
            getLog().onEvent("Responding to Logon request with tag 789=" + expectedTargetNum);
            logon.setInt(NextExpectedMsgSeqNum.FIELD, expectedTargetNum);
            state.setLastExpectedLogonNextSeqNum(expectedTargetNum);
        } else {
            getLog().onEvent("Responding to Logon request");
        }

        setLogonTags(logon);
        sendRaw(logon, 0);
        state.setLogonSent(true);
    }

    private void persist(Header header, String messageString, int num) throws IOException, FieldNotFound {
        if (num == 0) {
            if (persistMessages) {
                final int msgSeqNum = header.getInt(MsgSeqNum.FIELD);
                state.set(msgSeqNum, messageString);
            }
            state.incrNextSenderMsgSeqNum();
        }
    }

    /**
     * Send the message
     *
     * @param message is the message to send
     * @param num     is the seq num of the message to send, if 0, the next expected sender seqnum is used.
     * @return
     */
    private boolean sendRaw(Message message, int num) {
        // sequence number must be locked until application
        // callback returns since it may be effectively rolled
        // back if the callback fails.
        state.lockSenderMsgSeqNum();
        try {
            boolean result = false;
            final Message.Header header = message.getHeader();
            final String msgType = header.getString(MsgType.FIELD);

            initializeHeader(header);

            if (num > 0) {
                header.setInt(MsgSeqNum.FIELD, num);
            }

            if (enableLastMsgSeqNumProcessed) {
                if (!header.isSetField(LastMsgSeqNumProcessed.FIELD)) {
                    header.setInt(LastMsgSeqNumProcessed.FIELD, getExpectedTargetNum() - 1);
                }
            }

            String messageString;

            if (message.isAdmin()) {
                try {
                    application.toAdmin(message, sessionID);
                } catch (final Throwable t) {
                    logApplicationException("toAdmin()", t);
                }

                if (MsgType.LOGON.equals(msgType)) {
                    if (!state.isResetReceived()) {
                        boolean resetSeqNumFlag = false;
                        if (message.isSetField(ResetSeqNumFlag.FIELD)) {
                            resetSeqNumFlag = message.getBoolean(ResetSeqNumFlag.FIELD);
                        }
                        if (resetSeqNumFlag) {
                            resetState();
                            message.getHeader().setInt(MsgSeqNum.FIELD, getExpectedSenderNum());
                        }
                        state.setResetSent(resetSeqNumFlag);
                    }
                }

                messageString = message.toString();
                persist(message.getHeader(), messageString, num);
                if (MsgType.LOGON.equals(msgType) || MsgType.LOGOUT.equals(msgType)
                        || MsgType.RESEND_REQUEST.equals(msgType)
                        || MsgType.SEQUENCE_RESET.equals(msgType) || isLoggedOn()) {
                    result = send(messageString);
                }
            } else {
                try {
                    application.toApp(message, sessionID);
                } catch (final DoNotSend e) {
                    return false;
                } catch (final Throwable t) {
                    logApplicationException("toApp()", t);
                }
                messageString = message.toString();
                persist(message.getHeader(), messageString, num);
                if (isLoggedOn()) {
                    result = send(messageString);
                }
            }

            return result;
        } catch (final IOException e) {
            logThrowable(getLog(), "Error reading/writing in MessageStore", e);
            return false;
        } catch (final FieldNotFound e) {
            logThrowable(state.getLog(), "Error accessing message fields", e);
            return false;
        } finally {
            state.unlockSenderMsgSeqNum();
        }
    }

    private void enqueueMessage(final Message msg, final int msgSeqNum) {
        state.enqueue(msgSeqNum, msg);
        getLog().onEvent("Enqueued at pos " + msgSeqNum + ": " + msg);
    }

    private void resetState() {
        if (!isResettingState.compareAndSet(false, true)) {
            return;
        }
        try {
            state.reset();
            stateListener.onReset();
        } finally {
            isResettingState.set(false);
        }
    }

    /**
     * Send a message to a counterparty. Sequence numbers and information about the sender
     * and target identification will be added automatically (or overwritten if that
     * information already is present).
     * <p>
     * The returned status flag is included for
     * compatibility with the JNI API but it's usefulness is questionable.
     * In QuickFIX/J, the message is transmitted using asynchronous network I/O so the boolean
     * only indicates the message was successfully queued for transmission. An error could still
     * occur before the message data is actually sent.
     *
     * @param message the message to send
     * @return a status flag indicating whether the write to the network layer was successful.
     */
    public boolean send(Message message) {
        message.getHeader().removeField(PossDupFlag.FIELD);
        message.getHeader().removeField(OrigSendingTime.FIELD);
        return sendRaw(message, 0);
    }

    private boolean send(String messageString) {
        getLog().onOutgoing(messageString);
        Responder responder;
        synchronized (responderLock) {
            responder = this.responder;
        }
        if (responder == null) {
            getLog().onEvent("No responder, not sending message: " + messageString);
            return false;
        }
        return responder.send(messageString);
    }

    private boolean isCorrectCompID(Message message) throws FieldNotFound {
        if (!checkCompID) {
            return true;
        }
        final String senderCompID = getSenderCompIDFromMessage(message);
        final String targetCompID = getTargetCompIDFromMessage(message);
        return sessionID.getSenderCompID().equals(targetCompID)
                && sessionID.getTargetCompID().equals(senderCompID);
    }

    public DataDictionary getDataDictionary() {
        if (!sessionID.isFIXT()) {
            // For pre-FIXT sessions, the session data dictionary is the same as the application
            // data dictionary.
            return dataDictionaryProvider.getSessionDataDictionary(sessionID.getBeginString());
        } else {
            throw new SessionException("No default data dictionary for FIXT 1.1 and newer");
        }
    }

    public DataDictionaryProvider getDataDictionaryProvider() {
        return dataDictionaryProvider;
    }

    public SessionID getSessionID() {
        return sessionID;
    }

    /**
     * Predicate for determining if the session should be active at the current
     * time.
     *
     * @return true if session should be active, false otherwise.
     */
    public boolean isSessionTime() {
        return sessionSchedule == null || sessionSchedule.isSessionTime();
    }

    /**
     * Determine if a session exists with the given ID.
     *
     * @param sessionID
     * @return true if session exists, false otherwise.
     */
    public static boolean doesSessionExist(SessionID sessionID) {
        return sessions.containsKey(sessionID);
    }

    /**
     * Return the session count.
     *
     * @return the number of sessions
     */
    public static int numSessions() {
        return sessions.size();
    }

    /**
     * Sets the timeout for waiting for a logon response.
     *
     * @param seconds the timeout in seconds
     */
    public void setLogonTimeout(int seconds) {
        state.setLogonTimeout(seconds);
    }

    /**
     * Sets the timeout for waiting for a logout response.
     *
     * @param seconds the timeout in seconds
     */
    public void setLogoutTimeout(int seconds) {
        state.setLogoutTimeout(seconds);
    }

    /**
     * Internal use by acceptor code.
     *
     * @param heartbeatInterval
     */
    public void setHeartBeatInterval(int heartbeatInterval) {
        state.setHeartBeatInterval(heartbeatInterval);
    }

    public boolean getCheckCompID() {
        return checkCompID;
    }

    public int getLogonTimeout() {
        return state.getLogonTimeout();
    }

    public int getLogoutTimeout() {
        return state.getLogoutTimeout();
    }

    public boolean getRedundantResentRequestsAllowed() {
        return redundantResentRequestsAllowed;
    }

    public boolean getRefreshOnLogon() {
        return refreshOnLogon;
    }

    public boolean getResetOnDisconnect() {
        return resetOnDisconnect;
    }

    public boolean getResetOnLogout() {
        return resetOnLogout;
    }

    public boolean isLogonAlreadySent() {
        return state.isLogonAlreadySent();
    }

    public boolean isLogonReceived() {
        return state.isLogonReceived();
    }

    public boolean isLogonSendNeeded() {
        return state.isLogonSendNeeded();
    }

    public boolean isLogonSent() {
        return state.isLogonSent();
    }

    public boolean isLogonTimedOut() {
        return state.isLogonTimedOut();
    }

    public boolean isLogoutReceived() {
        return state.isLogoutReceived();
    }

    public boolean isLogoutSent() {
        return state.isLogoutSent();
    }

    public boolean isLogoutTimedOut() {
        return state.isLogoutTimedOut();
    }

    public boolean isValidateChecksum() {
        return validateChecksum;
    }

    public boolean isRejectGarbledMessage() {
        return rejectGarbledMessage;
    }

    public boolean isUsingDataDictionary() {
        return dataDictionaryProvider != null;
    }

    public Date getStartTime() throws IOException {
        return state.getCreationTime();
    }

    public double getTestRequestDelayMultiplier() {
        return state.getTestRequestDelayMultiplier();
    }

    @Override
    public String toString() {
        String s = sessionID.toString();
        try {
            s += "[in:" + state.getNextTargetMsgSeqNum() + ",out:" + state.getNextSenderMsgSeqNum()
                    + "]";
        } catch (final IOException e) {
            LogUtil.logThrowable(sessionID, e.getMessage(), e);
        }
        return s;
    }

    public void addStateListener(SessionStateListener listener) {
        stateListeners.addListener(listener);
    }

    public void removeStateListener(SessionStateListener listener) {
        stateListeners.removeListener(listener);
    }

    /**
     * @return the default application version ID for messages sent from this session
     */
    public ApplVerID getSenderDefaultApplicationVersionID() {
        return new ApplVerID(senderDefaultApplVerID.getValue());
    }

    /**
     * @return the default application version ID for messages received by this session
     */
    public ApplVerID getTargetDefaultApplicationVersionID() {
        return targetDefaultApplVerID.get();
    }

    /**
     * Sets the default application version ID for messages received by this session.
     * This is called by the AcceptorIoHandler upon reception of a Logon message and
     * should not be called by user code.
     *
     * @param applVerID
     */
    public void setTargetDefaultApplicationVersionID(ApplVerID applVerID) {
        targetDefaultApplVerID.set(applVerID);
    }

    private static String extractNumber(String txt, int from) {
        final StringBuilder ret = new StringBuilder(txt.length() - from);
        for (int i = from; i != txt.length(); ++i) {
            final char c = txt.charAt(i);
            if (c >= '0' && c <= '9') {
                ret.append(c);
            } else {
                if (ret.length() != 0) {
                    break;
                }
            }
        }
        return ret.toString();
    }

    protected static Integer extractExpectedSequenceNumber(String txt) {
        if (txt == null) {
            return null;
        }
        String keyword = "expecting";
        int pos = txt.indexOf(keyword);
        if (pos < 0) {
            keyword = "expected";
            pos = txt.indexOf("expected");
        }
        if (pos < 0) {
            return null;
        }
        final int from = pos + keyword.length();
        final String val = extractNumber(txt, from);
        if (val.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(val);
        } catch (final NumberFormatException e) {
            return null;
        }
    }

    public int getMaxScheduledWriteRequests() {
        return maxScheduledWriteRequests;
    }

    public void setMaxScheduledWriteRequests(int maxScheduledWriteRequests) {
        this.maxScheduledWriteRequests = maxScheduledWriteRequests;
    }

    public void setIgnoreHeartBeatFailure(boolean ignoreHeartBeatFailure) {
        disableHeartBeatCheck = ignoreHeartBeatFailure;
    }

    public void setRejectGarbledMessage(boolean rejectGarbledMessage) {
        this.rejectGarbledMessage = rejectGarbledMessage;
    }

    public void setValidateChecksum(
            final boolean validateChecksum) {
        this.validateChecksum = validateChecksum;
    }

    public void setRejectInvalidMessage(boolean rejectInvalidMessage) {
        this.rejectInvalidMessage = rejectInvalidMessage;
    }

    public void setRejectMessageOnUnhandledException(boolean rejectMessageOnUnhandledException) {
        this.rejectMessageOnUnhandledException = rejectMessageOnUnhandledException;
    }

    public void setRequiresOrigSendingTime(boolean requiresOrigSendingTime) {
        this.requiresOrigSendingTime = requiresOrigSendingTime;
    }

    public void setForceResendWhenCorruptedStore(boolean forceResendWhenCorruptedStore) {
        this.forceResendWhenCorruptedStore = forceResendWhenCorruptedStore;
    }

    public boolean isAllowedForSession(InetAddress remoteInetAddress) {
        return allowedRemoteAddresses == null || allowedRemoteAddresses.isEmpty()
                || allowedRemoteAddresses.contains(remoteInetAddress);
    }

    /**
     * Closes session resources and unregisters session. This is for internal
     * use and should typically not be called by an user application.
     */
    @Override
    public void close() throws IOException {
        closeIfCloseable(getLog());
        closeIfCloseable(getStore());
        // clean up session just in case close() was not called from Session.unregisterSession()
        unregisterSession(this.sessionID, false);
    }

    private void closeIfCloseable(Object resource) throws IOException {
        if (resource instanceof Closeable) {
            ((Closeable) resource).close();
        }
    }

    private void resetIfSessionNotCurrent(SessionID sessionID, long time) throws IOException {
        if (!isCurrentSession(time)) {
            getLog().onEvent("Session state is not current; resetting " + sessionID);
            reset();
        }
    }

    private String getMessageToLog(final Message message) {
        return (message.toRawString() != null ? message.toRawString() : message.toString());
    }

    private void setLogonTags(final Message logon) {
        for (StringField field : logonTags) {
            if (dataDictionaryProvider != null
                    && dataDictionaryProvider.getSessionDataDictionary(sessionID.getBeginString()).isHeaderField(field.getTag())) {
                logon.getHeader().setField(field);
                continue;
            }
            logon.setField(field);
        }
    }

    private void refreshState() throws IOException {
        getLog().onEvent("Refreshing message/state store on Logon");
        getStore().refresh();
        stateListener.onRefresh();
    }

}
