/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.EndSeqNo;
import quickfix.field.GapFillFlag;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NewSeqNo;
import quickfix.field.OrigSendingTime;
import quickfix.field.PossDupFlag;
import quickfix.field.RefMsgType;
import quickfix.field.RefSeqNum;
import quickfix.field.RefTagID;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.field.Text;

public class Session {
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
            millisecondsInTimeStamp = true;
            this.dataDictionary = dataDictionary;
            state.setHeartBeatInterval(heartbeatInterval);
            state.setInitiator(heartbeatInterval != 0);
            state.setMessageStore(messageStoreFactory.create(sessionID));
            this.messageFactory = messageFactory;
            if (logFactory != null) {
                state.setLog(log);
            }
            if (!checkSessionTime(new Date())) {
                reset();
            }
            sessions.put(sessionID, this);
            application.onCreate(sessionID);
            state.logEvent("Created session");
        } catch (IOException e) {
            LogUtil.logThrowable(log, "error during session construction", e);
        }
    }

    public void setResponder(Responder responder) {
        this.responder = responder;
    }

    private boolean checkSessionTime(Date date) throws IOException {
        if (sessionSchedule == null) {
            return true;
        }
        return sessionSchedule.isSameSession(TimeUtil.getUtcCalendar(date), TimeUtil
                .getUtcCalendar(state.getCreationTime()));
    }

    public static boolean sendToTarget(Message message) throws SessionNotFoundException {
        return sendToTarget(message, "");
    }

    public static boolean sendToTarget(Message message, String qualifier) throws SessionNotFoundException {
        try {
            String senderCompID = message.getHeader().getString(SenderCompID.FIELD);
            String targetCompID = message.getHeader().getString(TargetCompID.FIELD);
            return sendToTarget(message, senderCompID, targetCompID, qualifier);
        } catch (SessionNotFoundException e) {
            throw e;
        } catch (FieldNotFound e) {
            throw new SessionNotFoundException("missing sender or target company ID");
        }
    }

    public static boolean sendToTarget(Message message, String senderCompID, String targetCompID)
            throws SessionNotFoundException {
        return sendToTarget(message, senderCompID, targetCompID, "");
    }

    public static boolean sendToTarget(Message message, String senderCompID, String targetCompID,
            String qualifier) throws SessionNotFoundException {
        return sendToTarget(message, new SessionID(FixVersions.BEGINSTRING_FIX42, senderCompID,
                targetCompID, qualifier));
    }

    public static boolean sendToTarget(Message message, SessionID sessionID) throws SessionNotFoundException {
        message.setSessionID(sessionID);
        Session session = lookupSession(sessionID);
        if (session == null) {
            throw new SessionNotFoundException();
        }
        return session.send(message);
    }

    public static Session lookupSession(SessionID sessionID) {
        return (Session) sessions.get(sessionID);
    }

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
        header.setUtcTimeStamp(SendingTime.FIELD, new Date(), millisecondsInTimeStamp);
    }

    public void logout() {
        enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean sentLogon() {
        return state.isLogonSent();
    }

    public boolean sentLogout() {
        return state.isLogoutSent();
    }

    public boolean receivedLogon() {
        return state.isLogonReceived();
    }

    public boolean isLoggedOn() {
        return sentLogon() && receivedLogon();
    }

    public void reset() throws IOException {
        disconnect();
        state.reset();
    }

    public void setNextSenderMsgSeqNum(int num) throws IOException {
        state.getMessageStore().setNextSenderMsgSeqNum(num);
    }

    public void setNextTargetMsgSeqNum(int num) throws IOException {
        state.getMessageStore().setNextTargetMsgSeqNum(num);
    }

    public int getExpectedSenderNum() {
        try {
            return state.getMessageStore().getNextSenderMsgSeqNum();
        } catch (IOException e) {
            state.getLog().onEvent("getNextSenderMsgSeqNum failed: " + e.getMessage());
            return -1;
        }
    }

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

    public void next(Message message) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        state.setConnected(true);

        Date now = new Date();
        if (!checkSessionTime(now)) {
            reset();
            if (!checkSessionTime(now)) {
                return;
            }
        }

        try {
            String msgType = message.getHeader().getString(MsgType.FIELD);
            String beginString = message.getHeader().getString(BeginString.FIELD);

            if (!beginString.equals(sessionID.getBeginString())) {
                throw new UnsupportedVersion();
            }

            dataDictionary.validate(message);

            if (msgType.equals(MsgType.LOGON)) {
                nextLogon(message);
            } else if (msgType.equals(MsgType.HEARTBEAT)) {
                nextHeartBeat(message);
            } else if (msgType.equals(MsgType.TEST_REQUEST)) {
                nextTestRequest(message);
            } else if (msgType.equals(MsgType.SEQUENCE_RESET)) {
                nextSequenceRequest(message);
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
            generateReject(message, SessionRejectReason.REQUIRED_TAG_MISSING, e.field);
        } catch (InvalidMessageType e) {
            generateReject(message, SessionRejectReason.INVALID_MSGTYPE, 0);
        } catch (InvalidMessage e) {
            state.logEvent("Skipping invalid message: " + e.getMessage());
        } catch (UnsupportedVersion e) {
            String msgType = message.getHeader().getString(MsgType.FIELD);
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
        next();
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

            if (Message.isAdminMsgType(msgType)) {
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
        sequenceReset.getHeader().setUtcTimeStamp(OrigSendingTime.FIELD, new Date());
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
            state.logEvent("Sending logout response");
        } else {
            state.logEvent("Received logout response");
        }

        state.incrNextTargetMsgSeqNum();
        if (resetOnLogout) {
            reset();
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

    private void nextSequenceRequest(Message sequenceReset) throws IOException, RejectLogon,
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

            if (newSequence > getExpectedTargetNum())
                state.setNextTargetMsgSeqNum(newSequence);
            else if (newSequence < getExpectedTargetNum())
                generateReject(sequenceReset, 5, 0);
        }

    }

    public void generateReject(Message message, int err, int field) throws IOException,
            FieldNotFound {
        if (!state.isLogonReceived()) {
            throw new SessionException("Tried to send a reject while not logged on");
        }

        String beginString = sessionID.getBeginString();

        Message reject = messageFactory.create(beginString, MsgType.REJECT);
        int msgSeqNum;
        String msgType;
        reject.reverseRoute(message.getHeader());
        initializeHeader(reject.getHeader());

        msgSeqNum = 0;
        msgType = null;
        boolean possDupFlag = false;

        msgType = message.getHeader().getString(MsgType.FIELD);
        if (message.getHeader().isSetField(MsgSeqNum.FIELD)) {
            msgSeqNum = message.getHeader().getInt(MsgSeqNum.FIELD);
        }
        if (message.getHeader().isSetField(PossDupFlag.FIELD)) {
            possDupFlag = message.getHeader().getBoolean(PossDupFlag.FIELD);
        }

        reject.setInt(RefSeqNum.FIELD, msgSeqNum);
        if (beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0) {
            reject.setString(RefMsgType.FIELD, msgType);
            if ((beginString.equals(FixVersions.BEGINSTRING_FIX42) && err <= SessionRejectReason.INVALID_MSGTYPE)
                    || beginString.compareTo(FixVersions.BEGINSTRING_FIX42) > 0) {
                reject.setInt(SessionRejectReason.FIELD, err);
            }
        }
        if (!msgType.equals(MsgType.LOGON) && !msgType.equals(MsgType.SEQUENCE_RESET)
                && (msgSeqNum == getExpectedTargetNum() || !possDupFlag)) {
            state.incrNextTargetMsgSeqNum();
        }

        String reason = SessionRejectReasonText.getMessage(err);
        if (reason != null && (field != 0 || err == SessionRejectReason.INVALID_TAG_NUMBER)) {
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
            reject.setString(Text.FIELD, "(" + field + ")");
        }
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
                throw new RuntimeException("Logon state is not valid for message");
            }

            if (!isGoodTime(sendingTime)) {
                doBadTime(msg);
                return false;
            }
            if (!isCorrectCompID(senderCompID, targetCompID)) {
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

            state.setLastReceivedTime(System.currentTimeMillis());
            state.clearTestRequestCounter();
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
            // Internal exception, causes disconnect
            // We may want to modify this to an app-specific exception (?)
            throw new RuntimeException(text);
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
        if (Message.isAdminMsgType(msgType)) {
            application.fromAdmin(msg, sessionID);
        } else {
            application.fromApp(msg, sessionID);
        }
    }

    private boolean validLogonState(String msgType) {
        if (msgType.equals(MsgType.LOGON) && !state.isLogonReceived()
                || !msgType.equals(MsgType.LOGON) && state.isLogonReceived()) {
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

    public void next() throws IOException {
        if (!enabled) {
            if (!isLoggedOn()) {
                if (!state.isLogonSent()) {
                    state.logEvent("Initiated logout request");
                    generateLogout();
                }
            } else
                return;
        }

        if (!checkSessionTime(new Date())) {
            reset();
            return;
        }

        if (!state.isLogonReceived()) {
            if (state.isLogonSendNeeded()) {
                generateLogon();
                state.logEvent("Initiated logon request");
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

    private void generateLogon() {
        Message logon = messageFactory.create(sessionID.getBeginString(), MsgType.LOGON);
        logon.setInt(EncryptMethod.FIELD, 0);
        logon.setInt(HeartBtInt.FIELD, state.getHeartBeatInterval());
        initializeHeader(logon.getHeader());
        state.setLastReceivedTime(System.currentTimeMillis());
        state.clearTestRequestCounter();
        state.setLogonSent(true);
        sendRaw(logon, 0);
    }

    synchronized void disconnect() throws IOException {
        if (responder != null) {
            if (!state.isLogoutSent()) {
                state.logEvent("Dropped Connection");
            } else {
                state.logEvent("Disconnecting");
            }

            if (responder != null) {
                responder.disconnect();
                responder = null;
            }
        }

        if (state.isLogonReceived() || state.isLogonSent()) {
            state.setLogonReceived(false);
            state.setLogonSent(false);
            application.onLogout(sessionID);
        }

        state.setLogoutSent(false);
        state.clearQueue();
        if (resetOnDisconnect && state.isConnected()) {
            state.setConnected(false);
            reset();
        }
    }

    private void nextLogon(Message logon) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        if (state.isLogonSendNeeded()) {
            state.logEvent("Received logon response before sending request");
            disconnect();
            return;
        }

        String senderCompID = logon.getHeader().getString(SenderCompID.FIELD);
        String targetCompID = logon.getHeader().getString(TargetCompID.FIELD);

        boolean verified = verify(logon, false, true);

        if (isCorrectCompID(senderCompID, targetCompID)) {
            state.setLogonReceived(true);
        }

        if (!verified) {
            return;
        }

        if (!state.isInitiator()) {
            //int interval = logon.getInt(HeartBtInt.FIELD);
            state.logEvent("Received logon request");
            generateLogon(logon);
            state.logEvent("Responding to logon request");
        } else {
            state.logEvent("Received logon response");
        }

        int sequence = logon.getHeader().getInt(MsgSeqNum.FIELD);
        if (isTargetTooHigh(sequence)) {
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
            next(new Message(msg, dataDictionary));
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

            if (Message.isAdminMsgType(msgType)) {
                application.toAdmin(message, sessionID);
                messageString = message.toString();
                if (msgType.equals("A") || msgType.equals("5") || msgType.equals("2")
                        || msgType.equals("4") || isLoggedOn()) {
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
            state.logEvent("Error accessing message fields");
            return false;
        }
    }

    private boolean send(Message message) {
        return sendRaw(message, 0);
    }

    private boolean send(String messageString) {
        if (responder == null)
            return false;
        state.logOutgoing(messageString);
        if (responder != null) {
            return responder.send(messageString);
        }
        return false;
    }

    private boolean isCorrectCompID(String senderCompID, String targetCompID) {
        return sessionID.getSenderCompID().equals(targetCompID)
                && sessionID.getTargetCompID().equals(senderCompID);
    }

    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    public void setResetOnLogout(boolean flag) {
        this.resetOnLogout = true;
    }

    public void setResetOnDisconnect(boolean flag) {
        this.resetOnDisconnect = flag;
    }

    // TODO - double check whether this accessor is needed
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
}