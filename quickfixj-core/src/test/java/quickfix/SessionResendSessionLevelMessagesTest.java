package quickfix;

import org.junit.Test;
import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.EndSeqNo;
import quickfix.field.EncryptMethod;
import quickfix.field.GapFillFlag;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NewSeqNo;
import quickfix.field.RefSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.Reject;
import quickfix.fix44.ResendRequest;
import quickfix.fix44.SequenceReset;
import quickfix.fix44.TestRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test to verify that when ForceResendWhenCorruptedStore is enabled, session-level messages
 * (except Reject) are not resent but are replaced with SequenceReset messages.
 */
public class SessionResendSessionLevelMessagesTest {

    @Test
    public void testSessionLevelMessagesNotResentWhenForceResendWhenCorruptedStoreEnabled() throws Exception {
        // Create a session with ForceResendWhenCorruptedStore enabled
        UnitTestApplication application = new UnitTestApplication();
        Session session = setUpSession(application, true);
        session.setForceResendWhenCorruptedStore(true);
        
        SessionState state = getSessionState(session);
        
        // Store some session-level messages in the message store
        int logonSeqNum = 1;
        int heartbeatSeqNum = 2;
        int testReqSeqNum = 3;
        int logoutSeqNum = 4;
        int rejectSeqNum = 5;
        
        // Create and store session-level messages
        Logon logon = createLogon(logonSeqNum);
        storeMessage(session, logon, logonSeqNum);
        
        Heartbeat heartbeat = createHeartbeat(heartbeatSeqNum);
        storeMessage(session, heartbeat, heartbeatSeqNum);
        
        TestRequest testReq = createTestRequest(testReqSeqNum);
        storeMessage(session, testReq, testReqSeqNum);
        
        Logout logout = createLogout(logoutSeqNum);
        storeMessage(session, logout, logoutSeqNum);
        
        // Create and store a Reject message (which should be resent according to FIX spec)
        Reject reject = createReject(rejectSeqNum);
        storeMessage(session, reject, rejectSeqNum);
        
        // Set next sender sequence number
        state.setNextSenderMsgSeqNum(6);
        
        // Create a ResendRequest for all stored messages
        ResendRequest resendRequest = new ResendRequest();
        resendRequest.set(new BeginSeqNo(1));
        resendRequest.set(new EndSeqNo(5));
        
        Message.Header header = resendRequest.getHeader();
        header.setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        header.setString(SenderCompID.FIELD, "TARGET");
        header.setString(TargetCompID.FIELD, "SENDER");
        header.setInt(MsgSeqNum.FIELD, 1);
        header.setUtcTimeStamp(SendingTime.FIELD, new Date());
        
        UnitTestResponder responder = (UnitTestResponder) session.getResponder();
        
        // Process the ResendRequest
        session.next(resendRequest);
        
        // Verify that only the Reject message was resent and other session-level messages
        // were replaced with SequenceReset-GapFill messages
        
        // We expect:
        // 1. A SequenceReset-GapFill message covering sequences 1-4 (Logon, Heartbeat, TestRequest, Logout)
        // 2. The Reject message (sequence 5)
        
        // Check that we got exactly 2 messages
        assertEquals(2, responder.sentMessages.size());
        
        // First message should be a SequenceReset-GapFill
        Message firstMessage = MessageUtils.parse(session, responder.sentMessages.get(0));
        assertEquals(MsgType.SEQUENCE_RESET, firstMessage.getHeader().getString(MsgType.FIELD));
        assertTrue(firstMessage.getBoolean(GapFillFlag.FIELD));
        assertEquals(1, firstMessage.getHeader().getInt(MsgSeqNum.FIELD));
        assertEquals(5, firstMessage.getInt(NewSeqNo.FIELD)); // Should skip to sequence 5
        
        // Second message should be the Reject
        Message secondMessage = MessageUtils.parse(session, responder.sentMessages.get(1));
        assertEquals(MsgType.REJECT, secondMessage.getHeader().getString(MsgType.FIELD));
        assertEquals(5, secondMessage.getHeader().getInt(MsgSeqNum.FIELD));
    }
    
    private Session setUpSession(Application application, boolean isInitiator) throws ConfigError {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, "StartTime", "00:00:00");
        settings.setString(sessionID, "EndTime", "00:00:00");
        settings.setString(sessionID, "ConnectionType", isInitiator ? "initiator" : "acceptor");
        
        UnitTestResponder responder = new UnitTestResponder();
        return new Session(application, new MemoryStoreFactory(), sessionID, null, null,
                null, settings, new DefaultMessageFactory(), 30, false, 30, true, true, false,
                false, false, false, false, true, false, false, false, false, 
                false, false, true, false, null, true, 0, false, false, false, false, null);
    }
    
    private void storeMessage(Session session, Message message, int msgSeqNum) throws IOException {
        session.getStore().set(msgSeqNum, message.toString());
    }
    
    private Logon createLogon(int sequence) {
        Logon logon = new Logon();
        logon.set(new HeartBtInt(30));
        setUpHeader(logon.getHeader(), sequence);
        return logon;
    }
    
    private Heartbeat createHeartbeat(int sequence) {
        Heartbeat heartbeat = new Heartbeat();
        setUpHeader(heartbeat.getHeader(), sequence);
        return heartbeat;
    }
    
    private TestRequest createTestRequest(int sequence) {
        TestRequest testRequest = new TestRequest();
        testRequest.set(new TestReqID("TEST"));
        setUpHeader(testRequest.getHeader(), sequence);
        return testRequest;
    }
    
    private Logout createLogout(int sequence) {
        Logout logout = new Logout();
        setUpHeader(logout.getHeader(), sequence);
        return logout;
    }
    
    private Reject createReject(int sequence) {
        Reject reject = new Reject();
        reject.set(new quickfix.field.RefSeqNum(100)); // Some reference sequence number
        setUpHeader(reject.getHeader(), sequence);
        return reject;
    }
    
    private void setUpHeader(Message.Header header, int sequence) {
        header.setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        header.setString(SenderCompID.FIELD, "SENDER");
        header.setString(TargetCompID.FIELD, "TARGET");
        header.setInt(MsgSeqNum.FIELD, sequence);
        header.setUtcTimeStamp(SendingTime.FIELD, new Date());
    }
    
    private SessionState getSessionState(Session session) {
        try {
            return (SessionState) session.getClass().getDeclaredField("state").get(session);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private class UnitTestApplication extends ApplicationAdapter {
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat,
                IncorrectTagValue, RejectLogon {
        }
    }
    
    private class UnitTestResponder implements Responder {
        public java.util.ArrayList<String> sentMessages = new java.util.ArrayList<>();
        
        public boolean send(String data) {
            sentMessages.add(data);
            return true;
        }
        
        public String getRemoteAddress() {
            return null;
        }
        
        public void disconnect() {
        }
    }
}