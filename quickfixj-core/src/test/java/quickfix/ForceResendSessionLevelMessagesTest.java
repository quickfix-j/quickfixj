package quickfix;

import org.junit.Test;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.Reject;
import quickfix.fix44.ResendRequest;
import quickfix.fix44.SequenceReset;
import quickfix.fix44.TestRequest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test to verify that when ForceResendWhenCorruptedStore is enabled, session-level messages
 * (except Reject) are not resent but are replaced with SequenceReset messages.
 */
public class ForceResendSessionLevelMessagesTest {

    private class UnitTestResponder implements Responder {
        public List<String> sentMessages = new ArrayList<>();
        
        @Override
        public boolean send(String data) {
            sentMessages.add(data);
            return true;
        }
        
        @Override
        public String getRemoteAddress() {
            return null;
        }
        
        @Override
        public void disconnect() {
        }
    }
    
    private class UnitTestApplication extends ApplicationAdapter {
    }
    
    @Test
    public void testSessionLevelMessagesNotResentWhenForceResendWhenCorruptedStoreEnabled() throws Exception {
        // Create a session with ForceResendWhenCorruptedStore enabled
        UnitTestApplication application = new UnitTestApplication();
        SessionID sessionID = new SessionID("FIX.4.4", "SENDER", "TARGET");
        
        // Create a session with ForceResendWhenCorruptedStore enabled
        Session session = SessionFactoryTestSupport.createSession(sessionID, application, true);
        session.setForceResendWhenCorruptedStore(true);
        
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        
        // Store some session-level messages in the message store
        MessageStore store = session.getStore();
        
        // Create and store session-level messages
        Logon logon = new Logon();
        setUpHeader(sessionID, logon, false, 1);
        store.set(1, logon.toString());
        
        Heartbeat heartbeat = new Heartbeat();
        setUpHeader(sessionID, heartbeat, false, 2);
        store.set(2, heartbeat.toString());
        
        TestRequest testReq = new TestRequest();
        setUpHeader(sessionID, testReq, false, 3);
        store.set(3, testReq.toString());
        
        Logout logout = new Logout();
        setUpHeader(sessionID, logout, false, 4);
        store.set(4, logout.toString());
        
        // Create and store a Reject message (which should be resent according to FIX spec)
        Reject reject = new Reject();
        setUpHeader(sessionID, reject, false, 5);
        store.set(5, reject.toString());
        
        // Set next sender sequence number
        session.setNextSenderMsgSeqNum(6);
        
        // Create a ResendRequest for all stored messages
        ResendRequest resendRequest = new ResendRequest();
        setUpHeader(sessionID, resendRequest, true, 1);
        resendRequest.set(new quickfix.field.BeginSeqNo(1));
        resendRequest.set(new quickfix.field.EndSeqNo(5));
        
        // Process the ResendRequest
        session.next(resendRequest);
        
        // Verify that only the Reject message was resent and other session-level messages
        // were replaced with SequenceReset-GapFill messages
        
        // We expect:
        // 1. A SequenceReset-GapFill message covering sequences 1-4 (Logon, Heartbeat, TestRequest, Logout)
        // 2. The Reject message (sequence 5)
        
        // Check that we got exactly 2 messages
        assertEquals("Should have sent exactly 2 messages", 2, responder.sentMessages.size());
        
        // First message should be a SequenceReset-GapFill
        String firstMessage = responder.sentMessages.get(0);
        assertTrue("First message should be a SequenceReset", 
                firstMessage.contains("35=4")); // MsgType=4 (SequenceReset)
        assertTrue("First message should have GapFill flag", 
                firstMessage.contains("123=Y")); // GapFillFlag=Y
        assertTrue("First message should have NewSeqNo=5", 
                firstMessage.contains("36=5")); // NewSeqNo=5
        
        // Second message should be the Reject
        String secondMessage = responder.sentMessages.get(1);
        assertTrue("Second message should be a Reject", 
                secondMessage.contains("35=3")); // MsgType=3 (Reject)
    }
    
    private void setUpHeader(SessionID sessionID, Message message, boolean reversed, int sequence) {
        message.getHeader().setString(quickfix.field.BeginString.FIELD, sessionID.getBeginString());
        
        if (!reversed) {
            message.getHeader().setString(quickfix.field.SenderCompID.FIELD, sessionID.getSenderCompID());
            message.getHeader().setString(quickfix.field.TargetCompID.FIELD, sessionID.getTargetCompID());
        } else {
            message.getHeader().setString(quickfix.field.SenderCompID.FIELD, sessionID.getTargetCompID());
            message.getHeader().setString(quickfix.field.TargetCompID.FIELD, sessionID.getSenderCompID());
        }
        
        message.getHeader().setInt(quickfix.field.MsgSeqNum.FIELD, sequence);
        message.getHeader().setUtcTimeStamp(quickfix.field.SendingTime.FIELD, new java.util.Date());
    }
}