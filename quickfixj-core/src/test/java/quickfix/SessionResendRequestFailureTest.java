package quickfix;

import org.junit.Test;
import quickfix.field.*;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.Logon;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.*;

/**
 * Test for issue #1114 - ResendRequest never re-sent after re-logon 
 * when previous request failed due to responder == null
 */
public class SessionResendRequestFailureTest {

    /**
     * Test demonstrates the problem: 
     * 1. Session connects and logs on
     * 2. Receives message with high sequence number, triggering ResendRequest
     * 3. Session disconnects BEFORE the ResendRequest is actually sent (responder becomes null)
     * 4. ResendRange is still marked as "sent" even though sendRaw returned false
     * 5. On reconnection, ResendRequest is NOT re-sent because it's marked as already sent
     */
    @Test
    public void testResendRequestNotResentAfterDisconnectBeforeSend() throws Exception {
        // Setup
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final UnitTestApplication application = new UnitTestApplication();
        final FailingResponder responder = new FailingResponder();
        
        final SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        settings.setString(sessionID, "SenderCompID", "SENDER");
        settings.setString(sessionID, "TargetCompID", "TARGET");
        settings.setString(sessionID, "ConnectionType", "acceptor");
        settings.setString(sessionID, "StartTime", "00:00:00");
        settings.setString(sessionID, "EndTime", "00:00:00");
        settings.setString(sessionID, "HeartBtInt", "30");
        
        final DefaultSessionFactory factory = new DefaultSessionFactory(
                application,
                new MemoryStoreFactory(),
                new ScreenLogFactory(true, true, true));
        
        try (Session session = factory.create(sessionID, settings)) {
            session.setResponder(responder);
            
            // Step 1: Logon normally
            logonTo(session, 1);
            assertTrue("Session should be logged on", session.isLoggedOn());
            
            // Step 2: Receive a message with sequence number gap (e.g., expect 2, get 10)
            // This should trigger a ResendRequest
            final SessionState state = getSessionState(session);
            assertEquals("Expected target seq num should be 2", 2, state.getNextTargetMsgSeqNum());
            
            // Step 3: Configure responder to fail (simulating disconnect before send completes)
            responder.setShouldFail(true);
            
            // Receive heartbeat with seq num 10 (gap from 2 to 9)
            // This should trigger ResendRequest, but it will fail to send
            processMessage(session, createHeartbeatMessage(10));
            
            // Step 4: Verify that ResendRange is marked as sent even though sendRaw failed
            assertTrue("ResendRange should be marked as requested (BUG!)", state.isResendRequested());
            SessionState.ResendRange resendRange = state.getResendRange();
            assertEquals("ResendRange begin should be 2", 2, resendRange.getBeginSeqNo());
            assertEquals("ResendRange end should be 9", 9, resendRange.getEndSeqNo());
            
            // Step 5: Disconnect and reconnect
            session.disconnect("Simulating disconnect", false);
            assertFalse("Session should be disconnected", session.isLoggedOn());
            
            // Reconnect with a fresh responder
            final UnitTestResponder freshResponder = new UnitTestResponder();
            session.setResponder(freshResponder);
            logonTo(session, 11); // Logon with next sequence number
            
            // Step 6: Send another message that should trigger the ResendRequest again
            processMessage(session, createHeartbeatMessage(12));
            
            // Expected: ResendRequest should be sent again because the previous one failed
            // Actual (BUG): ResendRequest is NOT sent because ResendRange is still marked as "sent"
            
            // This assertion will FAIL with the current bug - demonstrating the problem
            assertFalse("EXPECTED: ResendRequest should have been re-sent and satisfied, " +
                       "but it was NOT due to the bug. ResendRange is still marked as requested.",
                       state.isResendRequested());
        }
    }

    /**
     * Responder that can be configured to fail (return false) on send operations
     * This simulates a scenario where responder becomes null or disconnects during send
     */
    private static class FailingResponder implements Responder {
        private boolean shouldFail = false;
        private String lastSentMessage = null;

        public void setShouldFail(boolean shouldFail) {
            this.shouldFail = shouldFail;
        }

        @Override
        public boolean send(String data) {
            if (shouldFail) {
                // Simulate failure - message not sent
                return false;
            }
            lastSentMessage = data;
            return true;
        }

        @Override
        public void disconnect() {
            // No-op for test
        }

        @Override
        public String getRemoteAddress() {
            return "127.0.0.1:1234";
        }

        public String getLastSentMessage() {
            return lastSentMessage;
        }
    }

    /**
     * Simple test responder that always succeeds
     */
    private static class UnitTestResponder implements Responder {
        private String lastSentMessage;

        @Override
        public boolean send(String data) {
            lastSentMessage = data;
            return true;
        }

        @Override
        public void disconnect() {
        }

        @Override
        public String getRemoteAddress() {
            return "127.0.0.1:1234";
        }

        public String getLastSentMessage() {
            return lastSentMessage;
        }
    }

    private void logonTo(Session session, int sequence) throws Exception {
        final Logon logon = new Logon();
        logon.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logon.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logon.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        logon.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        logon.setInt(HeartBtInt.FIELD, 30);
        logon.setInt(EncryptMethod.FIELD, 0);
        logon.toString(); // Calculate length and checksum
        processMessage(session, logon);
    }

    private Message createHeartbeatMessage(int sequence) {
        final Heartbeat heartbeat = new Heartbeat();
        heartbeat.getHeader().setString(SenderCompID.FIELD, "TARGET");
        heartbeat.getHeader().setString(TargetCompID.FIELD, "SENDER");
        heartbeat.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        heartbeat.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        heartbeat.toString(); // Calculate length and checksum
        return heartbeat;
    }

    private void processMessage(Session session, Message message) throws Exception {
        session.next(message);
    }

    private SessionState getSessionState(Session session) throws Exception {
        final java.lang.reflect.Field field = Session.class.getDeclaredField("state");
        field.setAccessible(true);
        return (SessionState) field.get(session);
    }

    /**
     * Simple test application
     */
    private static class UnitTestApplication extends ApplicationAdapter {
        private Message lastToAdminMessage;
        private Message lastToAppMessage;

        @Override
        public void toAdmin(Message message, SessionID sessionId) {
            lastToAdminMessage = message;
        }

        @Override
        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
            lastToAppMessage = message;
        }

        public Message lastToAdminMessage() {
            return lastToAdminMessage;
        }

        public Message lastToAppMessage() {
            return lastToAppMessage;
        }
    }
}
