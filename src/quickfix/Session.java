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

import quickfix.field.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Session {
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
     * Session setting for maximum message latency (in seconds).
     */
    public static final String SETTING_MAX_LATENCY = "MaxLatency";

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
     * Session validation setting for enabling whether field ordering is
     * validated. Values are "Y" or "N". Default is "Y".
     */
    public static final String SETTING_VALIDATE_FIELDS_OUT_OF_ORDER = "ValidateFieldsOutOfOrder";

    /**
     * Session validation setting for enabling whether field values are
     * validated. Empty fields values are not allowed. Values are "Y" or "N".
     * Default is "Y".
     */
    public static final String SETTING_VALIDATE_FIELDS_HAVE_VALUES = "ValidateFieldsHaveValues";

    /**
     * Session setting for logon timeout (in seconds).
     */
    public static final String SETTING_LOGON_TIMEOUT = "LogonTimeout";

    /**
     * Session setting for doing an automatic sequence number reset on logout.
     * Valid values are "Y" or "N". Default is "N".
     */
    public static final String SETTING_RESET_ON_LOGOUT = "ResetOnLogout";

    /**
     * Session setting for doing an automatic sequence number reset on
     * disconnect. Valid values are "Y" or "N". Default is "N".
     */
    public static final String SETTING_RESET_ON_DISCONNECT = "ResetOnDisconnect";

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
    public static final String SETTING_RESET_WHEN_INITIATING_LOGON = "SendResetSeqNumFlag";

    /**
     * Session description. Used by external tools.
     */
    public static final String SETTING_DESCRIPTION = "Description";

    /**
     * Requests that state and message data be refreshed from the message store at
     * logon, if possible. This supports simple failover behavior for acceptors
     */
    public static final String SETTING_REFRESH_STORE_AT_LOGON = "RefreshMessageStoreAtLogon";

    private Application application;
    private Responder responder;
    private SessionID sessionID;
    private DataDictionary dataDictionary;
    private SessionSchedule sessionSchedule;
    private MessageFactory messageFactory;
    private SessionState state = new SessionState();
    private static HashMap sessions = new HashMap();
    private boolean enabled;
    private boolean checkLatency;
    private int maxLatency;
    private boolean resetOnLogout;
    private boolean resetOnDisconnect;
    private boolean millisecondsInTimeStamp;
    private boolean resetWhenInitiatingLogon;
    private String logoutReason;
    
    Session(Application application, MessageStoreFactory messageStoreFactory, SessionID sessionID,
            DataDictionary dataDictionary, SessionSchedule sessionSchedule, LogFactory logFactory,
            MessageFactory messageFactory, int heartbeatInterval) {
        Log log = logFactory.create(sessionID);

        try {
            this.application = application;
            this.sessionID = sessionID;
            this.sessionSchedule = sessionSchedule;
            enabled = true;
            checkLatency = true;
            maxLatency = 120;
            resetOnLogout = false;
            resetOnDisconnect = false;
            resetWhenInitiatingLogon = false;
            millisecondsInTimeStamp = true;
            this.dataDictionary = dataDictionary;
            state.setHeartBeatInterval(heartbeatInterval);
            state.setInitiator(heartbeatInterval != 0);
            state.setMessageStore(messageStoreFactory.create(sessionID));
            this.messageFactory = messageFactory;
            if (logFactory != null) {
                state.setLog(log);
            }
            log.onEvent("Session " + this.sessionID + " schedule is " + sessionSchedule);
            if (!checkSessionTime()) {
                log.onEvent("Session " + this.sessionID + " is not configured to be active now.");
                reset();
            }
            sessions.put(sessionID, this);
            application.onCreate(sessionID);
            log.onEvent("Created session: " + sessionID);
        } catch (IOException e) {
            LogUtil.logThrowable(log, "error during session construction", e);
        }
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
        this.responder = responder;
    }

    /**
     * This should not be used by end users.
     *
     * @return the Session's connection responder
     */
    public synchronized Responder getResponder() {
        return responder;
    }

    private boolean checkSessionTime() throws IOException {
        return checkSessionTime(SystemTime.getDate());
    }

    //
    // The session time checks were causing performance problems
    // so we are caching the last session time check result and
    // only recalculating it if it's been at least 1 second since
    // the last check
    //
    private long lastSessionTimeCheck = 0;
    private boolean lastSessionTimeResult = false;

    private boolean refreshMessageStoreAtLogon;

    private boolean checkSessionTime(Date date) throws IOException {
        if (sessionSchedule == null) {
            return true;
        }
        if ((date.getTime() - lastSessionTimeCheck) > 1000L) {
            lastSessionTimeResult = sessionSchedule.isSameSession(SystemTime.getUtcCalendar(date),
                    SystemTime.getUtcCalendar(state.getCreationTime()));
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
            String senderCompID = message.getHeader().getString(SenderCompID.FIELD);
            String targetCompID = message.getHeader().getString(TargetCompID.FIELD);
            return sendToTarget(message, senderCompID, targetCompID, qualifier);
        } catch (SessionNotFound e) {
            throw e;
        } catch (FieldNotFound e) {
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
            return sendToTarget(message, new SessionID(message.getHeader().getString(
                    BeginString.FIELD), senderCompID, targetCompID, qualifier));
        } catch (SessionNotFound e) {
            throw e;
        } catch (Exception e) {
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
        message.setSessionID(sessionID);
        Session session = lookupSession(sessionID);
        if (session == null) {
            throw new SessionNotFound();
        }
        return session.send(message);
    }

    /**
     * Locates a session specified by the provided session ID.
     *
     * @param sessionID the session ID
     * @return the session, if found, or null otherwise
     */
    public static Session lookupSession(SessionID sessionID) {
        return (Session) sessions.get(sessionID);
    }

    /**
     * This method can be used to manually logon to a FIX session.
     */
    public void logon() {
        enabled = true;
    }

    private void initializeHeader(Message.Header header) {
        state.setLastSentTime(System.currentTimeMillis());
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        header.setInt(MsgSeqNum.FIELD, getExpectedSenderNum());
        insertSendingTime(header);
    }

    private void insertSendingTime(Message.Header header) {
        boolean includeMillis = sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0
                && millisecondsInTimeStamp;
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getDate(), includeMillis);
    }

    /**
     * This method can be used to manually logout of a FIX session.
     */
    public void logout() {
        enabled = false;
    }

    /**
     * This method can be used to manually logout of a FIX session.
     * @param reason this will be included in the logout message
     */
    public void logout(String reason) {
        logoutReason = reason;
    }
    
    /**
     * Used internally by initiator implementation.
     *
     * @return true if session is enabled, false otherwise.
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Predicate indicatign whether a logon message has been sent.
     *
     * @return true if logon message was sent, false otherwise.
     */
    public boolean sentLogon() {
        return state.isLogonSent();
    }

    /**
     * Predicate indicatign whether a logon message has been received.
     *
     * @return true if logon message was received, false otherwise.
     */
    public boolean receivedLogon() {
        return state.isLogonReceived();
    }

    /**
     * Predicate indicatign whether a logout message has been sent.
     *
     * @return true if logout message was sent, false otherwise.
     */
    public boolean sentLogout() {
        return state.isLogoutSent();
    }

    public boolean isLoggedOn() {
        return sentLogon() && receivedLogon();
    }

    private boolean isResetOnLogonRequested() {
        return sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX41) >= 0
                && (resetWhenInitiatingLogon || resetOnLogout || resetOnDisconnect)
                && getExpectedSenderNum() == 1 && getExpectedTargetNum() == 1;
    }

    /**
     * Disconnects session and resets session state.
     *
     * @throws IOException IO error
     * @see #disconnect()
     * @see SessionState#reset()
     */
    public void reset() throws IOException {
        disconnect();
        state.reset();
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
        } catch (IOException e) {
            state.getLog().onEvent("getNextSenderMsgSeqNum failed: " + e.getMessage());
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
        } catch (IOException e) {
            state.getLog().onEvent("getNextTargetMsgSeqNum failed: " + e.getMessage());
            return -1;
        }
    }

    public Log getLog() {
        return state.getLog();
    }

    public MessageStore getStore() {
        return state.getMessageStore();
    }

    public synchronized void next(Message message) throws FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        state.setConnected(true);

        if (!checkSessionTime()) {
            reset();
            return;
        }

        String msgType = message.getHeader().getString(MsgType.FIELD);
        
        try {
            if (isStateRefreshNeeded(msgType)) {
                if (getStore() instanceof RefreshableMessageStore) {
                    getLog().onEvent("Refreshing message/state store at logon");
                    ((RefreshableMessageStore) getStore()).refresh();
                } else {
                    getLog().onEvent(
                            "Refresh at logon requested, but message store not capable: "
                                    + getStore().getClass().getName());
                }
            }
            
            String beginString = message.getHeader().getString(BeginString.FIELD);

            if (!beginString.equals(sessionID.getBeginString())) {
                throw new UnsupportedVersion();
            }

            if (dataDictionary != null) {
                dataDictionary.validate(message);
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
        } catch (FieldException e) {
            generateReject(message, e.getSessionRejectReason(), e.getField());
        } catch (FieldNotFound e) {
            if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0
                    && message.isApp()) {
                generateBusinessReject(message,
                        BusinessRejectReason.CONDITIONALLY_REQUIRED_FIELD_MISSING);
            } else {
                generateReject(message, SessionRejectReason.REQUIRED_TAG_MISSING, e.field);
                if (msgType.equals(MsgType.LOGON)) {
                    state.logEvent("Required field missing from logon");
                    disconnect();
                }
            }
        } catch (IncorrectTagValue e) {
            // TODO QUESTION Why is incorrect tag value being rejected as incorrect tag number?
            generateReject(message, SessionRejectReason.VALUE_IS_INCORRECT, e.field);
        } catch (InvalidMessage e) {
            state.logEvent("Skipping invalid message: " + e.getMessage());
        } catch (RejectLogon e) {
            // TODO TEST need a test for RejectLogon exception
            String rejectMessage = e.getMessage() != null ? (": " + e.getMessage()) : "";
            state.getLog().onEvent("Logon rejected" + rejectMessage);
            generateLogout(e.getMessage());
            disconnect();
        } catch (UnsupportedMessageType e) {
            if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
                generateBusinessReject(message, BusinessRejectReason.UNSUPPORTED_MESSAGE_TYPE);
            } else {
                generateReject(message, "Unsupported message type");
            }
        } catch (UnsupportedVersion e) {
            if (msgType.equals(MsgType.LOGOUT)) {
                nextLogout(message);
            } else {
                generateLogout("Incorrect BeginString");
                state.incrNextTargetMsgSeqNum();
                // 1d_InvalidLogonWrongBeginString.def appears to require
                // a disconnect although the C++ didn't appear to be doing it.
                // ???
                disconnect();
            }
        } catch (IOException e) {
            LogUtil.logThrowable(sessionID, "error processing message", e);
        }

        nextQueued();
        if (isLoggedOn()) {
            next();
        }
    }

    private boolean isStateRefreshNeeded(String msgType) {
        return refreshMessageStoreAtLogon && !getState().isInitiator()
                && msgType.equals(MsgType.LOGON);
    }

    private void nextReject(Message reject) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        if (!verify(reject)) {
            return;
        }
        state.incrNextTargetMsgSeqNum();
        nextQueued();
    }

    private synchronized void nextResendRequest(Message resendRequest) throws IOException,
            RejectLogon, FieldNotFound, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType, InvalidMessage {
        if (!verify(resendRequest, false, false)) {
            return;
        }

        int beginSeqNo = resendRequest.getInt(BeginSeqNo.FIELD);
        int endSeqNo = resendRequest.getInt(EndSeqNo.FIELD);

        state.logEvent("Received ResendRequest FROM: " + beginSeqNo + " TO: " + endSeqNo);

        String beginString = sessionID.getBeginString();
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0 && endSeqNo == 0
                || beginString.compareTo(FixVersions.BEGINSTRING_FIX42) <= 0 && endSeqNo == 999999
                || endSeqNo >= getExpectedSenderNum()) {
            endSeqNo = getExpectedSenderNum() - 1;
        }

        ArrayList messages = new ArrayList();
        state.get(beginSeqNo, endSeqNo, messages);

        int msgSeqNum = 0;
        int begin = 0;
        int current = beginSeqNo;

        for (int i = 0; i < messages.size(); i++) {
            Message msg = new Message((String) messages.get(i), dataDictionary);
            msgSeqNum = msg.getHeader().getInt(MsgSeqNum.FIELD);
            String msgType = msg.getHeader().getString(MsgType.FIELD);

            if ((current != msgSeqNum) && begin == 0) {
                begin = current;
            }

            if (msgType.length() == 1 && "0A12345".indexOf(msgType) != -1) {
                if (begin == 0) {
                    begin = msgSeqNum;
                }
            } else {
                if (resend(msg)) {
                    if (begin != 0) {
                        generateSequenceReset(begin, msgSeqNum);
                    }
                    send(msg.toString());
                    state.logEvent("Resending Message: " + msgSeqNum);
                    begin = 0;
                } else {
                    if (begin == 0)
                        begin = msgSeqNum;
                }
            }
            current = msgSeqNum + 1;
        }
        if (begin != 0) {
            generateSequenceReset(begin, msgSeqNum + 1);
        }

        if (endSeqNo > msgSeqNum) {
            endSeqNo = endSeqNo + 1;
            int next = state.getNextSenderMsgSeqNum();
            if (endSeqNo > next)
                endSeqNo = next;
            generateSequenceReset(beginSeqNo, endSeqNo);
        }

        msgSeqNum = resendRequest.getHeader().getInt(MsgSeqNum.FIELD);
        if (!isTargetTooHigh(msgSeqNum) && !isTargetTooLow(msgSeqNum)) {
            state.incrNextTargetMsgSeqNum();
        }
    }

    private boolean isTargetTooLow(int msgSeqNum) throws IOException {
        return msgSeqNum < state.getNextTargetMsgSeqNum();
    }

    private void generateSequenceReset(int beginSeqNo, int endSeqNo) {
        Message sequenceReset = messageFactory.create(sessionID.getBeginString(),
                MsgType.SEQUENCE_RESET);
        int newSeqNo = endSeqNo;
        sequenceReset.getHeader().setBoolean(PossDupFlag.FIELD, true);
        sequenceReset.getHeader().setUtcTimeStamp(OrigSendingTime.FIELD, SystemTime.getDate());
        sequenceReset.setInt(NewSeqNo.FIELD, newSeqNo);
        initializeHeader(sequenceReset.getHeader());
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, beginSeqNo);
        sequenceReset.setBoolean(GapFillFlag.FIELD, true);
        sendRaw(sequenceReset, beginSeqNo);
        state.logEvent("Sent SequenceReset TO: " + newSeqNo);
    }

    private boolean resend(Message message) throws FieldNotFound {
        Message.Header header = message.getHeader();
        Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
        header.setUtcTimeStamp(OrigSendingTime.FIELD, sendingTime);
        header.setBoolean(PossDupFlag.FIELD, true);
        insertSendingTime(header);

        try {
            application.toApp(message, sessionID);
            return true;
        } catch (DoNotSend e) {
            return false;
        }
    }

    private void nextLogout(Message logout) throws IOException, RejectLogon, FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        if (!verify(logout, false, false)) {
            return;
        }
        if (!state.isLogoutSent()) {
            state.logEvent("Received logout request");
            generateLogout();
            state.logEvent("Sent logout response");
        } else {
            state.logEvent("Received logout response");
        }

        state.incrNextTargetMsgSeqNum();
        if (resetOnLogout) {
            state.reset();
        }

        disconnect();
    }

    private void generateLogout() {
        generateLogout(null);
    }

    private void generateLogout(String text) {
        Message logout = messageFactory.create(sessionID.getBeginString(), MsgType.LOGOUT);
        initializeHeader(logout.getHeader());
        if (text != null) {
            logout.setString(Text.FIELD, text);
        }
        sendRaw(logout, 0);
        state.setLogoutSent(true);
    }

    private void nextSequenceReset(Message sequenceReset) throws IOException, RejectLogon,
            FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        boolean isGapFill = false;
        if (sequenceReset.isSetField(GapFillFlag.FIELD)) {
            isGapFill = sequenceReset.getBoolean(GapFillFlag.FIELD);
        }

        if (!verify(sequenceReset, isGapFill, isGapFill)) {
            return;
        }

        if (sequenceReset.isSetField(NewSeqNo.FIELD)) {
            int newSequence = sequenceReset.getInt(NewSeqNo.FIELD);

            state.logEvent("Received SequenceReset FROM: " + getExpectedTargetNum() + " TO: "
                    + newSequence);

            if (newSequence > getExpectedTargetNum()) {
                state.setNextTargetMsgSeqNum(newSequence);
            } else if (newSequence < getExpectedTargetNum()) {
                generateReject(sequenceReset, 5, 0);
            }
        }
    }

    public void generateReject(Message message, String str) throws FieldNotFound, IOException {
        String beginString = sessionID.getBeginString();
        Message reject = messageFactory.create(beginString, MsgType.REJECT);
        reject.reverseRoute(message.getHeader());
        initializeHeader(reject.getHeader());

        String msgType = message.getHeader().getString(MsgType.FIELD);
        String msgSeqNum = message.getHeader().getString(MsgSeqNum.FIELD);
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            reject.setString(RefMsgType.FIELD, msgType);
        }
        reject.setString(RefSeqNum.FIELD, msgSeqNum);

        if (!msgType.equals(MsgType.LOGON) && !msgType.equals(MsgType.SEQUENCE_RESET)) {
            state.incrNextTargetMsgSeqNum();
        }

        reject.setString(Text.FIELD, str);
        sendRaw(reject, 0);
        state.getLog().onEvent("Message " + msgSeqNum + " Rejected: " + str);

    }

    private void generateReject(Message message, int err, int field) throws IOException,
            FieldNotFound {
        String reason = SessionRejectReasonText.getMessage(err);
        if (!state.isLogonReceived()) {
            String errorMessage = "Tried to send a reject while not logged on: " + reason
                    + " (field " + field + ")";
            // TODO TEST The C++ code doesn't throw an exception, but the AT
            // expects a disconnect (???)
            //    state.logEvent(errorMessage);
            //    return;
            throw new SessionException(errorMessage);

        }

        String beginString = sessionID.getBeginString();
        Message reject = messageFactory.create(beginString, MsgType.REJECT);
        reject.reverseRoute(message.getHeader());
        initializeHeader(reject.getHeader());

        String msgType = "";
        if (message.getHeader().isSetField(MsgType.FIELD)) {
            msgType = message.getHeader().getString(MsgType.FIELD);
        }

        int msgSeqNum = 0;
        if (message.getHeader().isSetField(MsgSeqNum.FIELD)) {
            msgSeqNum = message.getHeader().getInt(MsgSeqNum.FIELD);
            reject.setInt(RefSeqNum.FIELD, msgSeqNum);
        }

        boolean possDupFlag = false;
        if (message.getHeader().isSetField(PossDupFlag.FIELD)) {
            possDupFlag = message.getHeader().getBoolean(PossDupFlag.FIELD);
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
        if (!msgType.equals(MsgType.LOGON) && !msgType.equals(MsgType.SEQUENCE_RESET)
                && (msgSeqNum == getExpectedTargetNum() || !possDupFlag)) {
            state.incrNextTargetMsgSeqNum();
        }

        if (reason != null && (field > 0 || err == SessionRejectReason.INVALID_TAG_NUMBER)) {
            populateRejectReason(reject, field, reason);
            state.logEvent("Message " + msgSeqNum + " Rejected: " + reason + ":" + field);
        } else if (reason != null) {
            populateRejectReason(reject, reason);
            state.logEvent("Message " + msgSeqNum + " Rejected: " + reason);
        } else
            state.logEvent("Message " + msgSeqNum + " Rejected");

        sendRaw(reject, 0);
    }

    private void populateRejectReason(Message reject, String reason) {
        reject.setString(Text.FIELD, reason);
    }

    private void populateRejectReason(Message reject, int field, String reason) {
        if (sessionID.getBeginString().compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            reject.setInt(RefTagID.FIELD, field);
            reject.setString(Text.FIELD, reason);
        } else {
            reject.setString(Text.FIELD, reason + " (" + field + ")");
        }
    }

    private void generateBusinessReject(Message message, int err) throws FieldNotFound, IOException {
        Message reject = messageFactory.create(sessionID.getBeginString(),
                MsgType.BUSINESS_MESSAGE_REJECT);
        initializeHeader(reject.getHeader());
        String msgType = message.getHeader().getString(MsgType.FIELD);
        String msgSeqNum = message.getHeader().getString(MsgSeqNum.FIELD);
        reject.setString(RefMsgType.FIELD, msgType);
        reject.setString(RefSeqNum.FIELD, msgSeqNum);
        reject.setInt(BusinessRejectReason.FIELD, err);
        state.incrNextTargetMsgSeqNum();

        String reason = BusinessRejectReasonText.getMessage(err);
        populateRejectReason(reject, reason);
        sendRaw(reject, 0);
        state.getLog().onEvent("Message " + msgSeqNum + " Rejected: " + reason);
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
        Message heartbeat = messageFactory.create(sessionID.getBeginString(), MsgType.HEARTBEAT);
        initializeHeader(heartbeat.getHeader());
        if (testRequest.isSetField(TestReqID.FIELD)) {
            heartbeat.setString(TestReqID.FIELD, testRequest.getString(TestReqID.FIELD));
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
        String msgType;
        try {
            Message.Header header = msg.getHeader();
            String senderCompID = header.getString(SenderCompID.FIELD);
            String targetCompID = header.getString(TargetCompID.FIELD);
            Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);
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

            state.setLastReceivedTime(System.currentTimeMillis());
            state.clearTestRequestCounter();

            if (checkTooHigh && isTargetTooHigh(msgSeqNum)) {
                doTargetTooHigh(msg);
                return false;
            } else if (checkTooLow && isTargetTooLow(msgSeqNum)) {
                doTargetTooLow(msg);
                return false;
            }

            if ((checkTooHigh || checkTooLow) && state.isResendRequested()) {
                int[] range = state.getResendRange();

                if (msgSeqNum >= range[1]) {
                    state.logEvent("ResendRequest for messages FROM: " + range[0] +
                            " TO: " + range[1] + " has been satisfied.");
                    state.setResendRange(0, 0);
                }
            }
        } catch (FieldNotFound e) {
            throw e;
        } catch (Exception e) {
            state.logEvent(e.getClass().getName() + " " + e.getMessage());
            disconnect();
            return false;
        }

        fromCallback(msgType, msg, sessionID);
        return true;
    }

    private boolean doTargetTooLow(Message msg) throws FieldNotFound, IOException {
        Message.Header header = msg.getHeader();
        boolean possDupFlag = false;
        if (header.isSetField(PossDupFlag.FIELD)) {
            possDupFlag = header.getBoolean(PossDupFlag.FIELD);
        }
        int msgSeqNum = header.getInt(MsgSeqNum.FIELD);

        if (!possDupFlag) {
            String text = "MsgSeqNum too low, expecting " + getExpectedTargetNum()
                    + " but received " + msgSeqNum;
            generateLogout(text);
            throw new SessionException(text);
        }

        return doPossDup(msg);
    }

    private void doBadCompID(Message msg) throws IOException, FieldNotFound {
        generateReject(msg, 9, 0);
        generateLogout();
    }

    private void doBadTime(Message msg) throws IOException, FieldNotFound {
        generateReject(msg, 10, 0);
        generateLogout();
    }

    private boolean isGoodTime(Date sendingTime) {
        if (!checkLatency) {
            return true;
        }
        return Math.abs(System.currentTimeMillis() - sendingTime.getTime()) / 1000 <= maxLatency;
    }

    private void fromCallback(String msgType, Message msg, SessionID sessionID2)
            throws RejectLogon, FieldNotFound, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType {
        if (msgType.length() == 1 && "0A12345".indexOf(msgType) != -1) {
            application.fromAdmin(msg, sessionID);
        } else {
            application.fromApp(msg, sessionID);
        }
    }

    // This is public for AbstractSocketInitiator
    public boolean validLogonState(String msgType) {
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
        return false;
    }

    private boolean verify(Message message) throws RejectLogon, FieldNotFound, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException {
        return verify(message, true, true);
    }

    /**
     * Called from the timer-related code in the acceptor/initiator
     * implementations. This is not typically called from application code.
     *
     * @throws IOException IO error
     */
    public synchronized void next() throws IOException {
        if (!enabled) {
            if (isLoggedOn()) {
                if (!state.isLogoutSent()) {
                    state.logEvent("Initiated logout request");
                    generateLogout(logoutReason);
                    // TODO QF 1.11 Does logout reason ever get cleared?
                }
            } else {
                return;
            }
        }

        if (!checkSessionTime()) {
            reset();
            return;
        }

        if (!state.isLogonReceived()) {
            if (state.isLogonSendNeeded()) {
                if (generateLogon()) {
                    state.logEvent("Initiated logon request");
                } else {
                    state.logEvent("Error during logon request initiation");
                }
            } else if (state.isLogonAlreadySent() && state.isLogonTimedOut()) {
                state.logEvent("Timed out waiting for logon response");
                disconnect();
            }
            return;
        }

        if (state.getHeartBeatInterval() == 0) {
            return;
        }

        if (state.isLogoutTimedOut()) {
            state.logEvent("Timed out waiting for logout response");
            disconnect();
        }

        if (state.isWithinHeartBeat()) {
            return;
        }

        if (state.isTimedOut()) {
            state.logEvent("Timed out waiting for heartbeat");
            disconnect();
        } else {
            if (state.isTestRequestNeeded()) {
                generateTestRequest("TEST");
                state.incrementTestRequestCounter();
                state.logEvent("Sent test request TEST");
            } else if (state.isHeartBeatNeeded()) {
                generateHeartbeat();
            }
        }
    }

    private void generateHeartbeat() {
        Message heartbeat = messageFactory.create(sessionID.getBeginString(), MsgType.HEARTBEAT);
        initializeHeader(heartbeat.getHeader());
        sendRaw(heartbeat, 0);
    }

    private void generateTestRequest(String id) {
        Message testRequest = messageFactory.create(sessionID.getBeginString(),
                MsgType.TEST_REQUEST);
        initializeHeader(testRequest.getHeader());
        testRequest.setString(TestReqID.FIELD, id);
        sendRaw(testRequest, 0);
    }

    private boolean generateLogon() {
        Message logon = messageFactory.create(sessionID.getBeginString(), MsgType.LOGON);
        logon.setInt(EncryptMethod.FIELD, 0);
        logon.setInt(HeartBtInt.FIELD, state.getHeartBeatInterval());
        if (isResetOnLogonRequested()) {
            logon.setBoolean(ResetSeqNumFlag.FIELD, true);
        }
        initializeHeader(logon.getHeader());
        state.setLastReceivedTime(System.currentTimeMillis());
        state.clearTestRequestCounter();
        state.setLogonSent(true);
        return sendRaw(logon, 0);
    }

    /**
     * Logs out from session and closes the network connection.
     *
     * @throws IOException IO error
     */
    public synchronized void disconnect() throws IOException {
        if (responder != null) {
            state.logEvent("Disconnecting");
            responder.disconnect();
            responder = null;
        }

        if (state.isLogonReceived() || state.isLogonSent()) {
            state.setLogonReceived(false);
            state.setLogonSent(false);
            application.onLogout(sessionID);
        }

        state.setLogoutSent(false);
        state.setResetReceived(false);
        state.setResetSent(false);

        state.clearQueue();
        if (resetOnDisconnect) {
            state.reset();
        }

        state.setResendRange(0, 0);
    }

    private void nextLogon(Message logon) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        String senderCompID = logon.getHeader().getString(SenderCompID.FIELD);
        String targetCompID = logon.getHeader().getString(TargetCompID.FIELD);

        if (logon.isSetField(ResetSeqNumFlag.FIELD)) {
            state.setResetReceived(logon.getBoolean(ResetSeqNumFlag.FIELD));
        }

        if (state.isResetReceived()) {
            state.logEvent("Logon contains ResetSeqNumFlag=Y, resetting sequence numbers to 1");
            if (!state.isResetSent()) {
                state.reset();
            }
        }

        if (state.isLogonSendNeeded() && !state.isResetReceived()) {
            state.logEvent("Received logon response before sending request");
            disconnect();
            return;
        }

        if (!verify(logon, false, true)) {
            return;
        }

        state.setLogonReceived(true);

        if (isCorrectCompID(senderCompID, targetCompID)) {
            state.setLogonReceived(true);
        }

        if (!state.isInitiator() || (state.isResetSent() && !state.isResetReceived())) {
            state.logEvent("Received logon request");
            generateLogon(logon);
            state.logEvent("Responding to logon request");
        } else {
            state.logEvent("Received logon response");
        }

        state.setResetSent(false);
        state.setResetReceived(false);

        int sequence = logon.getHeader().getInt(MsgSeqNum.FIELD);
        if (isTargetTooHigh(sequence) && !resetWhenInitiatingLogon) {
            doTargetTooHigh(logon);
        } else {
            state.incrNextTargetMsgSeqNum();
            nextQueued();
        }

        if (isLoggedOn()) {
            application.onLogon(sessionID);
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
        Message msg = state.dequeue(num);

        if (msg != null) {
            state.logEvent("Processing QUEUED message: " + num);
            String msgType = msg.getHeader().getString(MsgType.FIELD);
            if (msgType.equals(MsgType.LOGON) || msgType.equals(MsgType.RESEND_REQUEST)) {
                state.incrNextTargetMsgSeqNum();
            } else {
                next(msg.toString());
            }
            return true;
        }
        return false;
    }

    private void next(String msg) throws InvalidMessage, FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException {
        try {
            // TODO CLEANUP move message type extraction to Message
            int typeStart = msg.indexOf("\00135=") + 4;
            int typeEnd;
            for (typeEnd = typeStart; typeEnd < msg.length(); typeEnd++) {
                if (msg.charAt(typeEnd) == '\001') {
                    break;
                }
            }
            Message message = messageFactory.create(dataDictionary.getVersion(), msg.substring(
                    typeStart, typeEnd));
            message.fromString(msg, dataDictionary, false);
            next(message);
        } catch (InvalidMessage e) {
            String message = e.getMessage();
            state.logEvent(message);
            if (message.indexOf("\00135=A\001") != -1) {
                state.logEvent("Logon message is not valid");
                disconnect();
            }
            throw e;
        }
    }

    private void doTargetTooHigh(Message msg) throws FieldNotFound {
        Message.Header header = msg.getHeader();
        String beginString = header.getString(BeginString.FIELD);
        int msgSeqNum = header.getInt(MsgSeqNum.FIELD);

        state.getLog().onEvent(
                "MsgSeqNum too high, expecting " + getExpectedTargetNum() + " but received "
                        + msgSeqNum);
        state.enqueue(msgSeqNum, msg);

        if (state.isResendRequested()) {
            int[] range = state.getResendRange();

            if (msgSeqNum >= range[0]) {
                state.logEvent("Already sent ResendRequest FROM: " + range[0] + " TO: " + range[1]
                        + ".  Not sending another.");
                return;
            }
        }

        generateResendRequest(beginString, msgSeqNum);
    }

    private void generateResendRequest(String beginString, int msgSeqNum) {
        Message resendRequest = messageFactory.create(beginString, MsgType.RESEND_REQUEST);
        int beginSeqNo = getExpectedTargetNum();
        int endSeqNo = msgSeqNum - 1; // Why initialized when it will be
        // overwritten
        if (beginString.compareTo("FIX.4.2") >= 0) {
            endSeqNo = 0;
        } else if (beginString.compareTo("FIX.4.1") <= 0) {
            endSeqNo = 999999;
        }
        resendRequest.setInt(BeginSeqNo.FIELD, beginSeqNo);
        resendRequest.setInt(EndSeqNo.FIELD, endSeqNo);
        initializeHeader(resendRequest.getHeader());
        sendRaw(resendRequest, 0);
        state.getLog().onEvent("Sent ResendRequest FROM: " + beginSeqNo + " TO: " + endSeqNo);
        state.setResendRange(beginSeqNo, msgSeqNum - 1);
    }

    private boolean doPossDup(Message msg) throws FieldNotFound, IOException {
        Message.Header header = msg.getHeader();
        String msgType = header.getString(MsgType.FIELD);
        Date sendingTime = header.getUtcTimeStamp(SendingTime.FIELD);

        if (!msgType.equals(MsgType.SEQUENCE_RESET)) {
            if (!header.isSetField(OrigSendingTime.FIELD)) {
                generateReject(msg, SessionRejectReason.REQUIRED_TAG_MISSING, OrigSendingTime.FIELD);
                return false;
            }

            Date origSendingTime = header.getUtcTimeStamp(OrigSendingTime.FIELD);
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
        Message logon = messageFactory.create(sessionID.getBeginString(), MsgType.LOGON);
        logon.setInt(EncryptMethod.FIELD, 0);
        if (state.isResetReceived()) {
            logon.setBoolean(ResetSeqNumFlag.FIELD, true);
        }
        logon.setInt(HeartBtInt.FIELD, otherLogon.getInt(HeartBtInt.FIELD));
        initializeHeader(logon.getHeader());
        sendRaw(logon, 0);
        state.setLogonSent(true);
    }

    private synchronized boolean sendRaw(Message message, int num) {
        try {
            boolean result = false;
            Message.Header header = message.getHeader();
            String msgType = header.getString(MsgType.FIELD);

            initializeHeader(header);

            if (num > 0) {
                header.setInt(MsgSeqNum.FIELD, num);
            }

            String messageString = null;

            if (message.isAdmin()) {
                application.toAdmin(message, sessionID);

                if (msgType.equals(MsgType.LOGON) && !state.isResetReceived()) {
                    boolean resetSeqNumFlag = false;
                    if (message.isSetField(ResetSeqNumFlag.FIELD)) {
                        resetSeqNumFlag = message.getBoolean(ResetSeqNumFlag.FIELD);
                    }
                    if (resetSeqNumFlag) {
                        state.reset();
                        message.getHeader().setInt(MsgSeqNum.FIELD, getExpectedSenderNum());
                    }
                    state.setResetSent(resetSeqNumFlag);
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
                    messageString = message.toString();
                    if (isLoggedOn()) {
                        result = send(messageString);
                    }
                } catch (DoNotSend e) {
                    return false;
                }
            }

            if (num == 0) {
                int msgSeqNum = header.getInt(MsgSeqNum.FIELD);
                state.set(msgSeqNum, messageString);
                state.incrNextSenderMsgSeqNum();
            }
            return result;
        } catch (IOException e) {
            state.logEvent("Error Reading/Writing in MessageStore");
            return false;
        } catch (FieldNotFound e) {
            LogUtil.logThrowable(state.getLog(), "Error accessing message fields", e);
            return false;
        }
    }

    private boolean send(Message message) {
        message.getHeader().removeField(PossDupFlag.FIELD);
        message.getHeader().removeField(OrigSendingTime.FIELD);
        return sendRaw(message, 0);
    }

    private boolean send(String messageString) {
        if (responder == null) {
            state.logEvent("No responder, not sending message");
            return false;
        }
        state.logOutgoing(messageString);
        return responder.send(messageString);
    }

    private boolean isCorrectCompID(String senderCompID, String targetCompID) {
        return sessionID.getSenderCompID().equals(targetCompID)
                && sessionID.getTargetCompID().equals(senderCompID);
    }

    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    public void setResetOnLogout(boolean flag) {
        this.resetOnLogout = flag;
    }

    public void setResetOnDisconnect(boolean flag) {
        this.resetOnDisconnect = flag;
    }

    public SessionState getState() {
        return state;
    }

    public void setCheckLatency(boolean flag) {
        checkLatency = flag;
    }

    public void setMaxLatency(int latency) {
        maxLatency = latency;
    }

    public void setMillisecondsInTimestamp(boolean flag) {
        millisecondsInTimeStamp = flag;
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

    void setResetWhenInitiatingLogon(boolean flag) {
        resetWhenInitiatingLogon = flag;
    }

    /**
     * Returns the application instance for this session
     *
     * @return application instance
     */
    public Application getApplication() {
        return application;
    }
    
    /**
     * Requests that state and message data be refreshed from the message store at
     * logon, if possible. This supports simple failover behavior for acceptors.
     */
    public void setRefreshMessageStoreAtLogon(boolean refreshMessageStoreAtLogon) {
        this.refreshMessageStoreAtLogon = refreshMessageStoreAtLogon;
    }
    
    /**
     * Determine if a session exists with the given ID.
     * @param sessionID
     * @return true if session exists, false otherwise.
     */
    public static boolean doesSessionExist(SessionID sessionID) {
       return sessions.containsKey(sessionID);
    }
    
    /**
     * Return the session count.
     * @return the number of sessions
     */
    public static int numSessions() {
        return sessions.size();
    }
}