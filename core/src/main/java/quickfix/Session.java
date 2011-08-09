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

import static quickfix.LogUtil.logThrowable;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Message.Header;
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
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;
import quickfix.field.TestReqID;
import quickfix.field.Text;
import quickfix.fix41.Logon;

/**
 * The Session is the primary FIX abstraction for message communication. It
 * performs sequencing and error recovery and represents an communication channel
 * to a counterparty. Sessions are independent of specific communication layer
 * connections. A Session is defined as starting with message sequence number of 1
 * and ending when the session is reset. The Sesion could span many sequential
 * connections (it cannot operate on multiple connection simultaneously).
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
     * Session setting for the test delay multiplier (0-1, as fraction of Heartbeat interval)
     */
    public static final String SETTING_TEST_REQUEST_DELAY_MULTIPLIER = "TestRequestDelayMultiplier";

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
     * Session setting to indicate whether a data dictionary should be used. If
     * a data dictionary is not used then message validation is not possble.
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
     * Session setting to enable milliseconds in message timestamps. Valid
     * values are "Y" or "N". Default is "Y". Only valid for FIX version >= 4.2.
     */
    public static final String SETTING_MILLISECONDS_IN_TIMESTAMP = "MillisecondsInTimeStamp";

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
     * logon, if possible. This supports simple failover behavior for acceptors
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
    public static final String USE_CLOSED_RESEND_INTERVAL = "ClosedResendInterval";

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
     * Return the last msg seq number processed (optional tag 789). Valid values are "Y" or "N".
     * Default is "N".
     */
    public static final String SETTING_ENABLE_NEXT_EXPECTED_MSG_SEQ_NUM = "EnableNextExpectedMsgSeqNum";

    /**
     * Allow to ignore heart beat message
     */
    public static final String REJECT_INVALID_MESSAGE = "RejectInvalidMessage";

    public static final String SETTING_FORCE_RESEND_WHEN_CORRUPTED_STORE = "ForceResendWhenCorruptedStore";

    public static final String SETTING_ALLOWED_REMOTE_ADDRESSES = "AllowedRemoteAddresses";

    /**
     * Setting to limit the size of a resend request in case of missing messages.
     * This is useful when the remote FIX engine does not allow to ask for more than n message for a ResendRequest
     */
    public static final String SETTING_RESEND_REQUEST_CHUNK_SIZE = "ResendRequestChunkSize";

    // @GuardedBy(sessions)
    private static final Map<SessionID, Session> sessions = new HashMap<SessionID, Session>();

    private final Application application;
    private final SessionID sessionID;
    private final SessionSchedule sessionSchedule;
    private final MessageFactory messageFactory;

    // @GuardedBy(this)
    private final SessionState state;

    private boolean enabled;

    private final String responderSync = new String("SessionResponderSync");
    // @GuardedBy(responderSync)
    private Responder responder;

    //
    // The session time checks were causing performance problems
    // so we are caching the last session time check result and
    // only recalculating it if it's been at least 1 second since
    // the last check
    //
    // @GuardedBy(this)
    private long lastSessionTimeCheck = 0;
    private boolean lastSessionTimeResult = false;
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
    private final boolean millisecondsInTimeStamp;
    private final boolean refreshMessageStoreAtLogon;
    private final boolean redundantResentRequestsAllowed;
    private final boolean persistMessages;
    private final boolean checkCompID;
    private final boolean useClosedRangeForResend;
    private boolean disableHeartBeatCheck = false;
    private boolean rejectInvalidMessage = false;
    private boolean forceResendWhenCorruptedStore = false;
    private boolean enableNextExpectedMsgSeqNum = false;
    private boolean enableLastMsgSeqNumProcessed = false;

    private final ListenerSupport stateListeners = new ListenerSupport(SessionStateListener.class);
    private final SessionStateListener stateListener = (SessionStateListener) stateListeners
            .getMulticaster();

    private final AtomicReference<ApplVerID> targetDefaultApplVerID = new AtomicReference<ApplVerID>();
    private final DefaultApplVerID senderDefaultApplVerID;
    private boolean validateSequenceNumbers  = true;
    private boolean validateIncomingMessage  = true;
    private final int[] logonIntervals;
    private final Set<InetAddress> allowedRemoteAddresses;

    public static final int DEFAULT_MAX_LATENCY = 120;
    public static final int DEFAULT_RESEND_RANGE_CHUNK_SIZE = 0; //no resend range
    public static final double DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER = 0.5;

    private final AtomicBoolean resetting = new AtomicBoolean(false);

    protected final static Logger log = LoggerFactory.getLogger(Session.class);

    Session(Application application, MessageStoreFactory messageStoreFactory, SessionID sessionID,
            DataDictionaryProvider dataDictionaryProvider, SessionSchedule sessionSchedule,
            LogFactory logFactory, MessageFactory messageFactory, int heartbeatInterval) {
        this(application, messageStoreFactory, sessionID, dataDictionaryProvider, sessionSchedule,
                logFactory, messageFactory, heartbeatInterval, true, DEFAULT_MAX_LATENCY, true,
                false, false, false, false, true, false, true, false,
                DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, null, true, new int[] { 5 }, false, false,
                false, true, false, null, true, DEFAULT_RESEND_RANGE_CHUNK_SIZE, false, false);
    }

    Session(Application application, MessageStoreFactory messageStoreFactory, SessionID sessionID,
            DataDictionaryProvider dataDictionaryProvider, SessionSchedule sessionSchedule,
            LogFactory logFactory, MessageFactory messageFactory, int heartbeatInterval,
            boolean checkLatency, int maxLatency, boolean millisecondsInTimeStamp,
            boolean resetOnLogon, boolean resetOnLogout, boolean resetOnDisconnect,
            boolean refreshMessageStoreAtLogon, boolean checkCompID,
            boolean redundantResentRequestsAllowed, boolean persistMessages,
            boolean useClosedRangeForResend, double testRequestDelayMultiplier,
            DefaultApplVerID senderDefaultApplVerID, boolean validateSequenceNumbers, int[] logonIntervals,
            boolean resetOnError, boolean disconnectOnError, boolean ignoreHeartBeatFailure,
            boolean rejectInvalidMessage, 
            boolean forceResendWhenCorruptedStore, Set<InetAddress> allowedRemoteAddresses, boolean validateIncomingMessage, int resendRequestChunkSize,
            boolean enableNextExpectedMsgSeqNum, boolean enableLastMsgSeqNumProcessed) {
        this.application = application;
        this.sessionID = sessionID;
        this.sessionSchedule = sessionSchedule;
        this.checkLatency = checkLatency;
        this.maxLatency = maxLatency;
        this.resetOnLogon = resetOnLogon;
        this.resetOnLogout = resetOnLogout;
        this.resetOnDisconnect = resetOnDisconnect;
        this.millisecondsInTimeStamp = millisecondsInTimeStamp;
        this.refreshMessageStoreAtLogon = refreshMessageStoreAtLogon;
        this.dataDictionaryProvider = dataDictionaryProvider;
        this.messageFactory = messageFactory;
        this.checkCompID = checkCompID;
        this.redundantResentRequestsAllowed = redundantResentRequestsAllowed;
        this.persistMessages = persistMessages;
        this.useClosedRangeForResend = useClosedRangeForResend;
        this.senderDefaultApplVerID = senderDefaultApplVerID;
        this.validateSequenceNumbers = validateSequenceNumbers;
        this.logonIntervals = logonIntervals;
        this.resetOnError = resetOnError;
        this.disconnectOnError = disconnectOnError;
        disableHeartBeatCheck = ignoreHeartBeatFailure;
        this.rejectInvalidMessage = rejectInvalidMessage;
        this.forceResendWhenCorruptedStore = forceResendWhenCorruptedStore;
        this.allowedRemoteAddresses = allowedRemoteAddresses;
        this.validateIncomingMessage = validateIncomingMessage;
        this.validateSequenceNumbers = validateSequenceNumbers;
        this.resendRequestChunkSize = resendRequestChunkSize;
        this.enableNextExpectedMsgSeqNum = enableNextExpectedMsgSeqNum;
        this.enableLastMsgSeqNumProcessed = enableLastMsgSeqNumProcessed;
        
        final Log engineLog = logFactory.create(sessionID);
        if (engineLog instanceof SessionStateListener) {
            addStateListener((SessionStateListener) engineLog);
        }

        final MessageStore messageStore = messageStoreFactory.create(sessionID);
        if (messageStore instanceof SessionStateListener) {
            addStateListener((SessionStateListener) messageStore);
        }

        state = new SessionState(this, logFactory != null ? engineLog : null, heartbeatInterval,
                heartbeatInterval != 0, messageStore, testRequestDelayMultiplier);

        registerSession(this);

        getLog().onEvent("Session " + sessionID + " schedule is " + sessionSchedule);
        try {
            if (!checkSessionTime()) {
                getLog().onEvent("Session state is not current; resetting " + sessionID);
                reset();
            }
        } catch (final IOException e) {
            LogUtil.logThrowable(getLog(), "error during session construction", e);
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
        synchronized (responderSync) {
            this.responder = responder;
            if (responder != null) {
                stateListener.onConnect();
            } else {
                stateListener.onDisconnect();
            }
        }
    }

    public Responder getResponder() {
        synchronized (responderSync) {
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

    private synchronized boolean checkSessionTime() throws IOException {
        if (sessionSchedule == null) {
            return true;
        }

        //
        // Only check the session time once per second at most. It isn't
        // necessary to do for every message received.
        //
        final Date date = SystemTime.getDate();
        if ((date.getTime() - lastSessionTimeCheck) >= 1000L) {
            final Date getSessionCreationTime = state.getCreationTime();
            lastSessionTimeResult = sessionSchedule.isSameSession(SystemTime.getUtcCalendar(date),
                    SystemTime.getUtcCalendar(getSessionCreationTime));
            lastSessionTimeCheck = date.getTime();
            return lastSessionTimeResult;
        } else {
            return lastSessionTimeResult;
        }
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
            final String senderCompID = message.getHeader().getString(SenderCompID.FIELD);
            final String targetCompID = message.getHeader().getString(TargetCompID.FIELD);
            return sendToTarget(message, senderCompID, targetCompID, qualifier);
        } catch (final FieldNotFound e) {
            throw new SessionNotFound("missing sender or target company ID");
        }
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
        synchronized (sessions) {
            sessions.put(session.getSessionID(), session);
        }
    }

    static void unregisterSessions(List<SessionID> sessionIds) {
        synchronized (sessions) {
            for (final SessionID sessionId : sessionIds) {
                Session session = sessions.remove(sessionId);
                if (session != null) {
                    try {
                        session.close();
                    } catch (IOException e) {
                        log.error("Failed to close session resources", e);
                    }
                }                
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
        synchronized (sessions) {
            return sessions.get(sessionID);
        }
    }

    /**
     * This method can be used to manually logon to a FIX session.
     */
    public void logon() {
        state.clearLogoutReason();
        setEnabled(true);
    }

    private synchronized void setEnabled(boolean enabled) {
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
        final boolean includeMillis = sessionID.getBeginString().compareTo(
                FixVersions.BEGINSTRING_FIX42) >= 0
                && millisecondsInTimeStamp;
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getDate(), includeMillis);
    }

    /**
     * This method can be used to manually logout of a FIX session.
     */
    public void logout() {
        setEnabled(false);
    }

    /**
     * This method can be used to manually logout of a FIX session.
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
    public synchronized boolean isEnabled() {
        return enabled;
    }

    /**
     * Predicate indicating whether a logon message has been sent.
     *
     * (QF Compatibility)
     *
     * @return true if logon message was sent, false otherwise.
     */
    public boolean sentLogon() {
        return state.isLogonSent();
    }

    /**
     * Predicate indicating whether a logon message has been received.
     *
     * (QF Compatibility)
     *
     * @return true if logon message was received, false otherwise.
     */
    public boolean receivedLogon() {
        return state.isLogonReceived();
    }

    /**
     * Predicate indicating whether a logout message has been sent.
     *
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
     * Logouts and disconnects session and then resets session state.
     *
     * @throws IOException IO error
     * @see SessionState#reset()
     */
    public synchronized void reset() throws IOException {
        if (resetting.get()) {
            return;
        }
        try {
            resetting.set(true);
            if (hasResponder()) {
                if (application != null && application instanceof ApplicationExtended) {
                    ((ApplicationExtended) application).onBeforeSessionReset(sessionID);
                }
                generateLogout();
                disconnect("Session reset", false);
            }
            resetState();
        } finally {
            resetting.set(false);
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
     * @return the message store
     */
    public MessageStore getStore() {
        return state.getMessageStore();
    }

    /**
     * (Internal use only)
     */
    public void next(Message message) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {

        if (!checkSessionTime()) {
            reset();
            return;
        }

        final Header header = message.getHeader();
        final String msgType = header.getString(MsgType.FIELD);

        try {

            final String beginString = header.getString(BeginString.FIELD);

            if (!beginString.equals(sessionID.getBeginString())) {
                throw new UnsupportedVersion();
            }

            if (msgType.equals(MsgType.LOGON)) {
                if (sessionID.isFIXT()) {
                    targetDefaultApplVerID.set(new ApplVerID(message
                            .getString(DefaultApplVerID.FIELD)));

                } else {
                    targetDefaultApplVerID.set(MessageUtils.toApplVerID(beginString));
                }
            }

            if (validateIncomingMessage && dataDictionaryProvider != null) {
                final DataDictionary sessionDataDictionary = dataDictionaryProvider
                        .getSessionDataDictionary(beginString);

                final ApplVerID applVerID = header.isSetField(ApplVerID.FIELD) ? new ApplVerID(
                        header.getString(ApplVerID.FIELD)) : targetDefaultApplVerID.get();

                final DataDictionary applicationDataDictionary = MessageUtils.isAdminMessage(msgType)
                        ? dataDictionaryProvider.getSessionDataDictionary(beginString)
                        : dataDictionaryProvider.getApplicationDataDictionary(applVerID);

                // related to QFJ-367 : just warn invalid incoming field/tags
                try {
                    DataDictionary.validate(message, sessionDataDictionary,
                            applicationDataDictionary);
                } catch (final IncorrectTagValue e) {
                    if (rejectInvalidMessage) {
                        throw e;
                    } else {
                        getLog().onErrorEvent("Warn: incoming message with " + e + ": " + message);
                    }
                } catch (final FieldException e) {
                    if (message.isSetField(e.getField())) {
                        if (rejectInvalidMessage) {
                            throw e;
                        } else {
                            getLog().onErrorEvent(
                                    "Warn: incoming message with incorrect field: "
                                            + message.getField(e.getField()) + ": " + message);
                        }
                    } else {
                        if (rejectInvalidMessage) {
                            throw e;
                        } else {
                            getLog().onErrorEvent(
                                    "Warn: incoming message with missing field: " + e.getField()
                                            + ": " + e.getMessage() + ": " + message);
                        }
                    }
                } catch (final FieldNotFound e) {
                    if (rejectInvalidMessage) {
                        throw e;
                    } else {
                        getLog().onErrorEvent("Warn: incoming " + e + ": " + message);
                    }
                }

            }

            if (msgType.equals(MsgType.LOGON)) {
                nextLogon(message);
            } else if (msgType.equals(MsgType.HEARTBEAT)) {
                nextHeartBeat(message);
            } else if (msgType.equals(MsgType.TEST_REQUEST)) {
                nextTestRequest(message);
            } else if (msgType.equals(MsgType.SEQUENCE_RESET)) {
                nextSequenceReset(message);
            } else if (msgType.equals(MsgType.LOGOUT)) {
                nextLogout(message);
            } else if (msgType.equals(MsgType.RESEND_REQUEST)) {
                nextResendRequest(message);
            } else if (msgType.equals(MsgType.REJECT)) {
                nextReject(message);
            } else {
                if (!verify(message)) {
                    return;
                }
                state.incrNextTargetMsgSeqNum();
            }
        } catch (final FieldException e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
            generateReject(message, e.getSessionRejectReason(), e.getField());
        } catch (final FieldNotFound e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
            if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0
                    && message.isApp()) {
                generateBusinessReject(message,
                        BusinessRejectReason.CONDITIONALLY_REQUIRED_FIELD_MISSING, e.field);
            } else {
                if (msgType.equals(MsgType.LOGON)) {
                    getLog().onErrorEvent("Required field missing from logon");
                    disconnect("Required field missing from logon", true);
                } else {
                    generateReject(message, SessionRejectReason.REQUIRED_TAG_MISSING, e.field);
                }
            }
        } catch (final IncorrectDataFormat e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
            generateReject(message, SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE, e.field);
        } catch (final IncorrectTagValue e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            generateReject(message, SessionRejectReason.VALUE_IS_INCORRECT, e.field);
        } catch (final InvalidMessage e) {
            getLog().onErrorEvent("Skipping invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
        } catch (final RejectLogon e) {
            final String rejectMessage = e.getMessage() != null ? (": " + e) : "";
            getLog().onErrorEvent("Logon rejected" + rejectMessage);
            if (e.isLogoutBeforeDisconnect()) {
                generateLogout(e.getMessage());
            }
            state.incrNextTargetMsgSeqNum();
            disconnect("Logon rejected: " + e, true);
        } catch (final UnsupportedMessageType e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
            if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
                generateBusinessReject(message, BusinessRejectReason.UNSUPPORTED_MESSAGE_TYPE, 0);
            } else {
                generateReject(message, "Unsupported message type");
            }
        } catch (final UnsupportedVersion e) {
            getLog().onErrorEvent("Rejecting invalid message: " + e + ": " + message);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
            if (msgType.equals(MsgType.LOGOUT)) {
                nextLogout(message);
            } else {
                generateLogout("Incorrect BeginString");
                state.incrNextTargetMsgSeqNum();
                // 1d_InvalidLogonWrongBeginString.def appears to require
                // a disconnect although the C++ didn't appear to be doing it.
                // ???
                disconnect("Incorrect BeginString: " + e, true);
            }
        } catch (final IOException e) {
            LogUtil.logThrowable(sessionID, "Error processing message: " + message, e);
            if (resetOrDisconnectIfRequired(message)) {
                return;
            }
        }

        nextQueued();
        if (isLoggedOn()) {
            next();
        }
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
                log.error("Failed reseting: " + e);
            }
            return true;
        }
        if (disconnectOnError) {
            try {
                disconnect("Auto disconnect", false);
            } catch (final IOException e) {
                log.error("Failed disconnecting: " + e);
            }
            return true;
        }
        return false;
    }

    private boolean isStateRefreshNeeded(String msgType) {
        return refreshMessageStoreAtLogon && !state.isInitiator() && msgType.equals(MsgType.LOGON);
    }

    private void nextReject(Message reject) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        if (!verify(reject, false, validateSequenceNumbers)) {
            return;
        }
        state.incrNextTargetMsgSeqNum();
        nextQueued();
    }

    private void nextResendRequest(Message resendRequest) throws IOException, RejectLogon,
            FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType,
            InvalidMessage {
        if (!verify(resendRequest, false, false)) {
            return;
        }

        int beginSeqNo = resendRequest.getInt(BeginSeqNo.FIELD);
        int endSeqNo = resendRequest.getInt(EndSeqNo.FIELD);
        getLog().onEvent(
                "Received ResendRequest FROM: " + beginSeqNo + " TO: "
                        + formatEndSeqNum(endSeqNo));
        manageGapFill(resendRequest,  beginSeqNo,endSeqNo);
    }

    /**
     * A Gap has been request to be filled by either a resend request or on a logon message
     * @param messageOutSync the message that caused the gap to be filled
     * @param beginSeqNo the seqNum of the first missing message
     * @param endSeqNo the seqNum of the last missing message
     * @throws FieldNotFound
     * @throws IOException
     * @throws InvalidMessage
     */
    private void manageGapFill(Message messageOutSync, int beginSeqNo,  int endSeqNo) throws FieldNotFound, IOException,
            InvalidMessage {
      
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

            final ArrayList<String> messages = new ArrayList<String>();
    
            try {
                state.get(beginSeqNo, endSeqNo, messages);
            } catch (final IOException e) {
                if (forceResendWhenCorruptedStore) {
                    log.error("Cannot read messages from stores, resend HeartBeats", e);
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
    
            for (final String message : messages) {
                final Message msg = parseMessage(message);
                msgSeqNum = msg.getHeader().getInt(MsgSeqNum.FIELD);
    
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
                            generateSequenceReset(messageOutSync, begin, msgSeqNum);
                        }
                        getLog().onEvent("Resending Message: " + msgSeqNum);
                        send(msg.toString());
                        begin = 0;
                    } else {
                        if (begin == 0) {
                            begin = msgSeqNum;
                        }
                    }
                }
                current = msgSeqNum + 1;
            }
    
            if (begin != 0) {
                generateSequenceReset(messageOutSync, begin, msgSeqNum + 1);
            }
    
            if (endSeqNo > msgSeqNum) {
                endSeqNo = endSeqNo + 1;
                final int next = state.getNextSenderMsgSeqNum();
                if (endSeqNo > next) {
                    endSeqNo = next;
                }
                generateSequenceReset(messageOutSync, beginSeqNo, endSeqNo);
            }
        }
        int resendRequestMsgSeqNum = messageOutSync.getHeader().getInt(MsgSeqNum.FIELD);
        if (!isTargetTooHigh(resendRequestMsgSeqNum) && !isTargetTooLow(resendRequestMsgSeqNum)) {
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
     * 
     * @param receivedMessage if not null, it is the message received and upon which the resend request is generated 
     * @param beginSeqNo
     * @param endSeqNo
     * @throws FieldNotFound
     */
    private void generateSequenceReset(Message receivedMessage, int beginSeqNo, int endSeqNo) throws FieldNotFound {
        final Message sequenceReset = messageFactory.create(sessionID.getBeginString(),
                MsgType.SEQUENCE_RESET);
        final int newSeqNo = endSeqNo;
        final Header header = sequenceReset.getHeader();
        header.setBoolean(PossDupFlag.FIELD, true);
        initializeHeader(header);
        header.setUtcTimeStamp(OrigSendingTime.FIELD, header.getUtcTimeStamp(SendingTime.FIELD));
        header.setInt(MsgSeqNum.FIELD, beginSeqNo);
        sequenceReset.setInt(NewSeqNo.FIELD, newSeqNo);
        sequenceReset.setBoolean(GapFillFlag.FIELD, true);
        if (receivedMessage != null && enableLastMsgSeqNumProcessed) {
            try {
                sequenceReset.getHeader().setInt(LastMsgSeqNumProcessed.FIELD, receivedMessage.getHeader().getInt(MsgSeqNum.FIELD));
            } catch (FieldNotFound e) {
                //should not happen as MsgSeqNum must be present
                getLog().onErrorEvent("Received message without MsgSeqNum "+receivedMessage);
            }
        }
        sendRaw(sequenceReset, beginSeqNo);
        getLog().onEvent("Sent SequenceReset TO: " + newSeqNo);
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
        final Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
        header.setUtcTimeStamp(OrigSendingTime.FIELD, sendingTime);
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

        String msg;
        if (!state.isLogoutSent()) {
            msg = "Received logout request";
            getLog().onEvent(msg);
            generateLogout(logout);
            getLog().onEvent("Sent logout response");
        } else {
            msg = "Received logout response";
            getLog().onEvent(msg);
        }

        state.setLogoutReceived(true);

        state.incrNextTargetMsgSeqNum();
        if (resetOnLogout) {
            resetState();
        }

        disconnect(msg, false);
    }

    public void generateLogout() {
        generateLogout(null, null);
    }

    private void generateLogout(Message otherLogout) {
        generateLogout(otherLogout, null);
    }
    
    private void generateLogout(String reason) {
        generateLogout(null, reason);
    }
    
    /**
     * To generate a logout message
     * @param otherLogout if not null, the logout message that is causing a logout to be sent
     * @param text
     */
    private void generateLogout(Message otherLogout, String text) {
        final Message logout = messageFactory.create(sessionID.getBeginString(), MsgType.LOGOUT);
        initializeHeader(logout.getHeader());
        if (text != null && !"".equals(text)) {
            logout.setString(Text.FIELD, text);
        }
        if (otherLogout != null && enableLastMsgSeqNumProcessed) {
            try {
                logout.getHeader().setInt(LastMsgSeqNumProcessed.FIELD, otherLogout.getHeader().getInt(MsgSeqNum.FIELD));
            } catch (FieldNotFound e) {
                //should not happen as MsgSeqNum must be present
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

            getLog().onEvent(
                    "Received SequenceReset FROM: " + getExpectedTargetNum() + " TO: "
                            + newSequence);
            if (newSequence > getExpectedTargetNum()) {
                int[] range = state.getResendRange();
                if (newSequence >= range[1]) {
                    state.setNextTargetMsgSeqNum(newSequence);
                } else if (range[2] > 0 && newSequence >= range[2]) {
                    state.setNextTargetMsgSeqNum(newSequence + 1);
                    String beginString = sequenceReset.getHeader().getString(BeginString.FIELD);
                    sendResendRequest(beginString, range[1] + 1, newSequence+1, range[1]);
                }
            } else if (newSequence < getExpectedTargetNum()) {
                
                    getLog().onErrorEvent(
                            "Invalid SequenceReset: newSequence=" + newSequence + " < expected="
                                    + getExpectedTargetNum());
                    if (resetOrDisconnectIfRequired(sequenceReset)) {
                        return;
                    }
                    generateReject(sequenceReset, SessionRejectReason.VALUE_IS_INCORRECT, 0);
            }
        }
    }

    private void generateReject(Message message, String str) throws FieldNotFound, IOException {
        final String beginString = sessionID.getBeginString();
        final Message reject = messageFactory.create(beginString, MsgType.REJECT);
        final Header header = message.getHeader();

        reject.reverseRoute(header);
        initializeHeader(reject.getHeader());

        final String msgType = header.getString(MsgType.FIELD);
        final String msgSeqNum = header.getString(MsgSeqNum.FIELD);
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            reject.setString(RefMsgType.FIELD, msgType);
        }
        reject.setString(RefSeqNum.FIELD, msgSeqNum);

        if (!msgType.equals(MsgType.LOGON) && !msgType.equals(MsgType.SEQUENCE_RESET)
                && !isPossibleDuplicate(message)) {
            state.incrNextTargetMsgSeqNum();
        }

        reject.setString(Text.FIELD, str);
        sendRaw(reject, 0);
        getLog().onErrorEvent("Reject sent for Message " + msgSeqNum + ": " + str);

    }

    private boolean isPossibleDuplicate(Message message) throws FieldNotFound {
        final Header header = message.getHeader();
        return header.isSetField(PossDupFlag.FIELD) && header.getBoolean(PossDupFlag.FIELD);
    }

    private void generateReject(Message message, int err, int field) throws IOException,
            FieldNotFound {
        final String reason = SessionRejectReasonText.getMessage(err);
        if (!state.isLogonReceived()) {
            final String errorMessage = "Tried to send a reject while not logged on: " + reason
                    + " (field " + field + ")";
            throw new SessionException(errorMessage);
        }

        final String beginString = sessionID.getBeginString();
        final Message reject = messageFactory.create(beginString, MsgType.REJECT);
        final Header header = message.getHeader();

        reject.reverseRoute(header);
        initializeHeader(reject.getHeader());
        reject.setField(new Text(reason));

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
            if (!msgType.equals("")) {
                reject.setString(RefMsgType.FIELD, msgType);
            }
            if ((beginString.equals(FixVersions.BEGINSTRING_FIX42) && err <= SessionRejectReason.INVALID_MSGTYPE)
                    || beginString.compareTo(FixVersions.BEGINSTRING_FIX42) > 0) {
                reject.setInt(SessionRejectReason.FIELD, err);
            }
        }

        // This is a set and increment of target msg sequence number, the sequence
        // number must be locked to guard against race conditions.

        state.lockTargetMsgSeqNum();
        try {
            if (!msgType.equals(MsgType.LOGON) && !msgType.equals(MsgType.SEQUENCE_RESET)
                    && (msgSeqNum == getExpectedTargetNum() || !isPossibleDuplicate(message))) {
                state.incrNextTargetMsgSeqNum();
            }
        } finally {
            state.unlockTargetMsgSeqNum();
        }

        if (reason != null && (field > 0 || err == SessionRejectReason.INVALID_TAG_NUMBER)) {
            setRejectReason(reject, field, reason, true);
            getLog().onErrorEvent(
                    "Reject sent for Message " + msgSeqNum + ": " + reason + ":" + field);
        } else if (reason != null) {
            setRejectReason(reject, reason);
            getLog().onErrorEvent("Reject sent for Message " + msgSeqNum + ": " + reason);
        } else {
            getLog().onErrorEvent("Reject sent for Message " + msgSeqNum);
        }

        if (enableLastMsgSeqNumProcessed) {
            reject.getHeader().setInt(LastMsgSeqNumProcessed.FIELD, message.getHeader().getInt(MsgSeqNum.FIELD));
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
            reject.setString(Text.FIELD, reason + (includeFieldInReason ? " (" + field + ")" : ""));
        }
    }

    private void generateBusinessReject(Message message, int err, int field) throws FieldNotFound,
            IOException {
        final Message reject = messageFactory.create(sessionID.getBeginString(),
                MsgType.BUSINESS_MESSAGE_REJECT);
        initializeHeader(reject.getHeader());
        final String msgType = message.getHeader().getString(MsgType.FIELD);
        final String msgSeqNum = message.getHeader().getString(MsgSeqNum.FIELD);
        reject.setString(RefMsgType.FIELD, msgType);
        reject.setString(RefSeqNum.FIELD, msgSeqNum);
        reject.setInt(BusinessRejectReason.FIELD, err);
        state.incrNextTargetMsgSeqNum();

        final String reason = BusinessRejectReasonText.getMessage(err);
        setRejectReason(reject, field, reason, field != 0);
        getLog().onErrorEvent(
                "Reject sent for Message " + msgSeqNum + (reason != null ? (": " + reason) : "")
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
            heartbeat.getHeader().setInt(LastMsgSeqNumProcessed.FIELD, testRequest.getHeader().getInt(MsgSeqNum.FIELD));
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
            final String senderCompID = header.getString(SenderCompID.FIELD);
            final String targetCompID = header.getString(TargetCompID.FIELD);
            final Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
            msgType = header.getString(MsgType.FIELD);
            int msgSeqNum = 0;
            if (checkTooHigh || checkTooLow) {
                msgSeqNum = header.getInt(MsgSeqNum.FIELD);
            }

            if (!validLogonState(msgType)) {
                throw new SessionException("Logon state is not valid for message (MsgType="
                        + msgType + ")");
            }

            if (!isGoodTime(sendingTime)) {
                doBadTime(msg);
                return false;
            }

            if (!isCorrectCompID(senderCompID, targetCompID)) {
                doBadCompID(msg);
                return false;
            }

            if (checkTooHigh && isTargetTooHigh(msgSeqNum) ) {
                doTargetTooHigh(msg);
                return false;
            } else if (checkTooLow && isTargetTooLow(msgSeqNum) ) {
                doTargetTooLow(msg);
                return false;
            } 
            if (Logon.MSGTYPE.equals(msgType) && checkTooLow && isOtherSideTooHigh(msg) ) {
                doOtherSideTooHigh(msg);
                return false;
            }
            
            // Handle poss dup where msgSeq is as expected
            // FIX 4.4 Vol 2, test case 2f&g
            if (isPossibleDuplicate(msg) && !validatePossDup(msg)) {
                return false;
            }

            if ((checkTooHigh || checkTooLow) && state.isResendRequested()) {
                final int[] range;
                synchronized (state.getLock()) {
                    range = state.getResendRange();
                    if (msgSeqNum >= range[1]) {
                        getLog().onEvent(
                                "ResendRequest for messages FROM " + range[0] + " TO " + range[1]
                                        + " has been satisfied.");
                        state.setResendRange(0, 0, 0);
                    } 
                }
                if (msgSeqNum < range[1] && range[2] > 0 && msgSeqNum >= range[2]) {
                    String beginString = header.getString(BeginString.FIELD);
                    sendResendRequest(beginString, range[1] + 1, msgSeqNum + 1, range[1]);
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

    private boolean isOtherSideTooHigh(Message msg) throws FieldNotFound, IOException {
        if (msg.isSetField(NextExpectedMsgSeqNum.FIELD)) {
            int sequence =  msg.getInt(NextExpectedMsgSeqNum.FIELD);
            return sequence > state.getNextSenderMsgSeqNum();
        }
        return false;
    }

    private boolean doTargetTooLow(Message msg) throws FieldNotFound, IOException {
        if (!isPossibleDuplicate(msg)) {
            final int msgSeqNum = msg.getHeader().getInt(MsgSeqNum.FIELD);

            final String text ="MsgSeqNum too low, expecting " + getExpectedTargetNum() + " but received "
                            + msgSeqNum;
            generateLogout(text);
            throw new SessionException(text);
        }
        return validatePossDup(msg);
    }
   
    private boolean doOtherSideTooHigh(Message msg) throws FieldNotFound, IOException {
        if (!isPossibleDuplicate(msg)) {
            
            final String text = "Tag 789 (NextExpectedMsgSeqNum) is higher than expected. Expected "
                        + getExpectedTargetNum() + ", Received " + msg.getInt(NextExpectedMsgSeqNum.FIELD);
            generateLogout(text);
            throw new SessionException(text);
        }
        return validatePossDup(msg);
    }

    private void doBadCompID(Message msg) throws IOException, FieldNotFound {
        generateReject(msg, SessionRejectReason.COMPID_PROBLEM, 0);
        generateLogout();
    }

    private void doBadTime(Message msg) throws IOException, FieldNotFound {
        try {
            generateReject(msg, SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM, 0);
            generateLogout();
        } catch (final SessionException ex) {
            generateLogout(ex.getMessage());
            throw ex;
        }
    }

    private boolean isGoodTime(Date sendingTime) {
        if (!checkLatency) {
            return true;
        }
        return Math.abs(SystemTime.currentTimeMillis() - sendingTime.getTime()) / 1000 <= maxLatency;
    }

    private void fromCallback(String msgType, Message msg, SessionID sessionID2)
            throws RejectLogon, FieldNotFound, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType {
        // Application exceptions will prevent the incoming sequence number from being incremented
        // and may result in resend requests and the next startup. This way, a buggy application
        // can be fixed and then reprocess previously sent messages.
        if (MessageUtils.isAdminMessage(msgType)) {
            application.fromAdmin(msg, sessionID);
        } else {
            application.fromApp(msg, sessionID);
        }
    }

    private synchronized boolean validLogonState(String msgType) {
        if (msgType.equals(MsgType.LOGON) && state.isResetSent() || state.isResetReceived()) {
            return true;
        }
        if (msgType.equals(MsgType.LOGON) && !state.isLogonReceived()
                || !msgType.equals(MsgType.LOGON) && state.isLogonReceived()) {
            return true;
        }
        if (msgType.equals(MsgType.LOGOUT) && state.isLogonSent()) {
            return true;
        }
        if (!msgType.equals(MsgType.LOGOUT) && state.isLogoutSent()) {
            return true;
        }
        if (msgType.equals(MsgType.SEQUENCE_RESET)) {
            return true;
        }
        if (msgType.equals(MsgType.REJECT)) {
            return true;
        }
        return false;
    }

    private boolean verify(Message message) throws RejectLogon, FieldNotFound, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException {
        return verify(message,  validateSequenceNumbers,  validateSequenceNumbers);
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

        if (!checkSessionTime()) {
            reset();
            return;
        }

        // Return if we are not connected
        if (!hasResponder()) {
            return;
        }

        if (!state.isLogonReceived()) {
            if (state.isLogonSendNeeded()) {
                if (isTimeToGenerateLogon()) {
                    // ApplicationExtended can prevent the automatic login
                    if (application != null && application instanceof ApplicationExtended) {
                        if (!((ApplicationExtended) application).canLogon(sessionID)) {
                            getLog().onEvent(
                                    "Do not initiate logon, Application can not logon on "
                                            + sessionID);
                            return;
                        }
                    }
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
            disconnect("Timed out waiting for heartbeat", true);
        }

        if (state.isWithinHeartBeat()) {
            return;
        }

        if (state.isTimedOut()) {
            if (!disableHeartBeatCheck) {
                disconnect("Timed out waiting for heartbeat", true);
                stateListener.onHeartBeatTimeout();
            } else {
                log.warn("Heartbeat failure detected but deactivated");
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
        return System.currentTimeMillis() - lastSessionLogon >= computeNextLogonDelayMillis();
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
        if (isStateRefreshNeeded(MsgType.LOGON)) {
            getLog().onEvent("Refreshing message/state store at logon");
            getStore().refresh();
            stateListener.onRefresh();
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
        //field 789
        if (enableNextExpectedMsgSeqNum) {
            logon.setInt(NextExpectedMsgSeqNum.FIELD, getExpectedTargetNum() );
        }
        return sendRaw(logon, 0);
    }

    /**
     * Use disconnect(reason, logError) instead.
     * 
     * @deprecated 
     */
    public void disconnect() throws IOException {
        disconnect("Other reason", true);
    }

    /**
     * Logs out from session and closes the network connection.
     *
     * @param reason
     *            the reason why the session is disconnected
     * @param logError
     *            set to true if this disconnection is an error
     * @throws IOException
     *             IO error
     */
    public void disconnect(String reason, boolean logError) throws IOException {
        synchronized (responderSync) {
            if (!hasResponder()) {
                getLog().onEvent("Already disconnected: " + reason);
                return;
            }
            final String msg = "Disconnecting: " + reason;
            if (logError) {
                getLog().onErrorEvent(msg);
            } else {
                log.info("[" + getSessionID() + "] " + msg);
            }
            responder.disconnect();
            setResponder(null);
        }

        final boolean logonReceived = state.isLogonReceived();
        final boolean logonSent = state.isLogonSent();
        if (logonReceived || logonSent) {
            state.setLogonReceived(false);
            state.setLogonSent(false);

            try {
                application.onLogout(sessionID);
            } catch (final Throwable t) {
                logApplicationException("onLogout()", t);
            }

            stateListener.onLogout();
        }

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
        // QFJ-457 now enabled again if acceptor
        if (!state.isInitiator()) setEnabled(true);
    }

    private void nextLogon(Message logon) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {

        if (isStateRefreshNeeded(MsgType.LOGON)) {
            getLog().onEvent("Refreshing message/state store at logon");
            getStore().refresh();
            stateListener.onRefresh();
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

        //reset logout messages
        state.setLogoutReceived(false);
        state.setLogoutSent(false);
        state.setLogonReceived(true);
        lastSessionLogon = 0;
        logonAttempts = 0;

        final int sequence = logon.getHeader().getInt(MsgSeqNum.FIELD);

        getLog().onEvent("Received logon");
        if (!state.isInitiator()) {
            generateLogon(logon);
            getLog().onEvent("Responding to logon request");
        }

        // Check for proper sequence reset response
        if (state.isResetSent() && !state.isResetReceived()) {
            disconnect("Received logon response before sending request", true);
        }

        state.setResetSent(false);
        state.setResetReceived(false);

        if (validateSequenceNumbers && isTargetTooHigh(sequence) && !resetOnLogon) {
            doTargetTooHigh(logon);
        } else {
            // either in sync or no seqnum validation or store reset above
            state.incrNextTargetMsgSeqNum();
            nextQueued();
        }

        if (logon.isSetField(NextExpectedMsgSeqNum.FIELD)) {
            int beginSeqNo = logon.getInt(NextExpectedMsgSeqNum.FIELD) ;
            int endSeqNo = getExpectedSenderNum() - 1;
            if(endSeqNo > beginSeqNo){
                try {
                    getLog().onEvent(
                            "missing messages FROM: " + beginSeqNo + " TO: " + formatEndSeqNum(endSeqNo));
                    manageGapFill(logon, beginSeqNo, endSeqNo);
                } catch (Exception e) {
                    getLog().onErrorEvent("Synchronization on logon message is failed");
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
            if (msgType.equals(MsgType.LOGON) || msgType.equals(MsgType.RESEND_REQUEST)) {
                state.incrNextTargetMsgSeqNum();
            } else {
                // TODO SESSION Is it really necessary to convert the queued message to a string?
                next(msg.toString());
            }
            return true;
        }
        return false;
    }

    private void next(String msg) throws InvalidMessage, FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException {
        try {
            next(parseMessage(msg));
        } catch (final InvalidMessage e) {
            final String message = "Invalid message: " + e;
            if (MsgType.LOGON.equals(MessageUtils.getMessageType(msg))) {
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
        getLog().onErrorEvent(
                "MsgSeqNum too high, expecting " + getExpectedTargetNum() + " but received "
                        + msgSeqNum + ": " + msg);
        // automatically reset or disconnect the session if we have a problem when the connector is running
        if (resetOrDisconnectIfRequired(msg)) {
            return;
        }
        state.enqueue(msgSeqNum, msg);
        getLog().onEvent("Enqueued at pos " + msgSeqNum + ": " + msg);

        if (state.isResendRequested()) {
            final int[] range = state.getResendRange();

            if (!redundantResentRequestsAllowed && msgSeqNum >= range[0]) {
                getLog().onEvent(
                        "Already sent ResendRequest FROM: " + range[0] + " TO: " + range[1]
                                + ".  Not sending another.");
                return;
            }
        }

        generateResendRequest(beginString, msgSeqNum);
    }

    private void generateResendRequest(String beginString, int msgSeqNum) {

        int beginSeqNo = getExpectedTargetNum();
        int endSeqNo = msgSeqNum - 1;
        sendResendRequest(beginString, msgSeqNum, beginSeqNo, endSeqNo);

    }

    private void sendResendRequest(String beginString, int msgSeqNum, int beginSeqNo,
            int endSeqNo) {
        
        int lastEndSeqNoSent = resendRequestChunkSize ==0 ? endSeqNo : beginSeqNo + resendRequestChunkSize - 1;
        if (lastEndSeqNoSent > endSeqNo) {
            lastEndSeqNoSent = endSeqNo;
        } 
        if (lastEndSeqNoSent ==  endSeqNo && !useClosedRangeForResend) {
            if (beginString.compareTo("FIX.4.2") >= 0) {
                endSeqNo = 0;
            } else if (beginString.compareTo("FIX.4.1") <= 0) {
                endSeqNo = 999999;
            }
        } else {
            endSeqNo = lastEndSeqNoSent;
        }
        
        Message resendRequest = messageFactory.create(beginString, MsgType.RESEND_REQUEST);
        resendRequest.setInt(BeginSeqNo.FIELD, beginSeqNo);
        resendRequest.setInt(EndSeqNo.FIELD, endSeqNo);
        initializeHeader(resendRequest.getHeader());
        sendRaw(resendRequest, 0);
        getLog().onEvent("Sent ResendRequest FROM: " + beginSeqNo + " TO: " + lastEndSeqNoSent);
        state.setResendRange(beginSeqNo, msgSeqNum - 1, resendRequestChunkSize == 0 ? 0 : lastEndSeqNoSent);
        
    }

    private boolean validatePossDup(Message msg) throws FieldNotFound, IOException {
        final Message.Header header = msg.getHeader();
        final String msgType = header.getString(MsgType.FIELD);
        final Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);

        if (!msgType.equals(MsgType.SEQUENCE_RESET)) {
            if (!header.isSetField(OrigSendingTime.FIELD)) {
                generateReject(msg, SessionRejectReason.REQUIRED_TAG_MISSING, OrigSendingTime.FIELD);
                return false;
            }

            final Date origSendingTime = header.getUtcTimeStamp(OrigSendingTime.FIELD);
            if (origSendingTime.compareTo(sendingTime) > 0) {
                generateReject(msg, SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM, 0);
                generateLogout();
                return false;
            }
        }

        return true;
    }

    private boolean isTargetTooHigh(int sequence) throws IOException {
        return sequence > state.getNextTargetMsgSeqNum();
    }

    private void generateLogon(Message otherLogon) throws FieldNotFound {
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
            logon.getHeader().setInt(LastMsgSeqNumProcessed.FIELD, otherLogon.getHeader().getInt(MsgSeqNum.FIELD));
        }
        initializeHeader(logon.getHeader());
        //field 789
        if (enableNextExpectedMsgSeqNum) {
            //the expected target num will be incremented one the other logon has been processed
            logon.setInt(NextExpectedMsgSeqNum.FIELD, getExpectedTargetNum() + 1);
        }
        sendRaw(logon, 0);
        state.setLogonSent(true);
    }

    /**
     * Send the message
     * @param message is the message to send
     * @param num is the seq num of the message to send, if 0, 
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
                if (!header.isSetField(LastMsgSeqNumProcessed.FIELD)) header.setInt(LastMsgSeqNumProcessed.FIELD, getExpectedTargetNum() - 1);
            }

            String messageString = null;

            if (message.isAdmin()) {
                try {
                    application.toAdmin(message, sessionID);
                } catch (final Throwable t) {
                    logApplicationException("toAdmin()", t);
                }

                if (msgType.equals(MsgType.LOGON)) {
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
                if (msgType.equals(MsgType.LOGON) || msgType.equals(MsgType.LOGOUT)
                        || msgType.equals(MsgType.RESEND_REQUEST)
                        || msgType.equals(MsgType.SEQUENCE_RESET) || isLoggedOn()) {
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
                if (isLoggedOn()) {
                    result = send(messageString);
                }
            }

            if (num == 0) {
                final int msgSeqNum = header.getInt(MsgSeqNum.FIELD);
                if (persistMessages) {
                    state.set(msgSeqNum, messageString);
                }
                state.incrNextSenderMsgSeqNum();
            }

            return result;
        } catch (final IOException e) {
            logThrowable(getLog(), "Error Reading/Writing in MessageStore", e);
            return false;
        } catch (final FieldNotFound e) {
            logThrowable(state.getLog(), "Error accessing message fields", e);
            return false;
        } finally {
            state.unlockSenderMsgSeqNum();
        }
    }

    private void resetState() {
        state.reset();
        stateListener.onReset();
    }

    /**
     * Send a message to a counterparty. Sequence numbers and information about the sender
     * and target identification will be added automatically (or overwritten if that
     * information already is present).
     *
     * The returned status flag is included for
     * compatibility with the JNI API but it's usefulness is questionable.
     * In QuickFIX/J, the message is transmitted using asynchronous network I/O so the boolean
     * only indicates the message was successfully queued for transmission. An error could still
     * occur before the message data is actually sent.
     *
     * @param message the message to send
     * @return a status flag indicating whether the write to the network layer was successful.
     *
     */
    public boolean send(Message message) {
        message.getHeader().removeField(PossDupFlag.FIELD);
        message.getHeader().removeField(OrigSendingTime.FIELD);
        return sendRaw(message, 0);
    }

    private boolean send(String messageString) {
        getLog().onOutgoing(messageString);
        synchronized (responderSync) {
            if (!hasResponder()) {
                getLog().onEvent("No responder, not sending message: " + messageString);
                return false;
            }
            return getResponder().send(messageString);
        }
    }

    private boolean isCorrectCompID(String senderCompID, String targetCompID) {
        if (!checkCompID) {
            return true;
        }
        return sessionID.getSenderCompID().equals(targetCompID)
                && sessionID.getTargetCompID().equals(senderCompID);
    }

    /**
     * Set the data dictionary. (QF Compatibility)
     *
     * @deprecated
     * @param dataDictionary
     */
    public void setDataDictionary(DataDictionary dataDictionary) {
        throw new UnsupportedOperationException(
                "Modification of session dictionary is not supported in QFJ");
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
        return sessionSchedule.isSessionTime();
    }

    /**
     * Determine if a session exists with the given ID.
     * @param sessionID
     * @return true if session exists, false otherwise.
     */
    public static boolean doesSessionExist(SessionID sessionID) {
        synchronized (sessions) {
            return sessions.containsKey(sessionID);
        }
    }

    /**
     * Return the session count.
     * @return the number of sessions
     */
    public static int numSessions() {
        synchronized (sessions) {
            return sessions.size();
        }
    }

    /**
     * Sets the timeout for waiting for a logon response.
     * @param seconds the timeout in seconds
     */
    public void setLogonTimeout(int seconds) {
        state.setLogonTimeout(seconds);
    }

    /**
     * Sets the timeout for waiting for a logout response.
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
        return refreshMessageStoreAtLogon;
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

    public boolean isUsingDataDictionary() {
        return dataDictionaryProvider != null;
    }

    public Date getStartTime() throws IOException {
        return state.getCreationTime();
    }

    public double getTestRequestDelayMultiplier() {
        return state.getTestRequestDelayMultiplier();
    }

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

    private static String extractNumber(String txt, int from) {
        String ret = "";
        for (int i = from; i != txt.length(); ++i) {
            final char c = txt.charAt(i);
            if (c >= '0' && c <= '9') {
                ret += c;
            } else {
                if (ret.length() != 0) {
                    break;
                }
            }
        }
        return ret.trim();
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

    public void setIgnoreHeartBeatFailure(boolean ignoreHeartBeatFailure) {
        disableHeartBeatCheck = ignoreHeartBeatFailure;
    }

    public void setRejectInvalidMessage(boolean RejectInvalidMessage) {
        rejectInvalidMessage = RejectInvalidMessage;
    }

    public void setForceResendWhenCorruptedStore(boolean forceResendWhenCorruptedStore) {
        this.forceResendWhenCorruptedStore = forceResendWhenCorruptedStore;
    }

    public boolean isAllowedForSession(InetAddress remoteInetAddress) {
        if (allowedRemoteAddresses == null || allowedRemoteAddresses.isEmpty()) {
            return true;
        }
        return allowedRemoteAddresses.contains(remoteInetAddress);
    }

    /**
     * Closes session resources. This is for internal use and should typically 
     * not be called by an user application.
     */
    public void close() throws IOException {
        closeIfCloseable(getLog());
        closeIfCloseable(getStore());
    }

    private void closeIfCloseable(Object resource) throws IOException {
        if (resource instanceof Closeable) {
            ((Closeable)resource).close();
        }
    }
}
