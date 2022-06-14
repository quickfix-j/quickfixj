package quickfix;

import org.junit.Test;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.fix44.TestRequest;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SessionResetTest {

    private static final int NUMBER_OF_ADMIN_MESSAGES = 50;

    @Test
    // QFJ-645, QFJ-716
    public void testSessionResetDeadlock() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = SessionFactoryTestSupport.createSession(sessionID,
                application, true, false)) {
            final UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            session.addStateListener(responder);
            session.logon();
            session.next();
            
            assertFalse(responder.onResetCalled);
            
            final Message logonRequest = new Message(responder.sentMessageData);
            final Message logonResponse = new DefaultMessageFactory().create(
                    sessionID.getBeginString(), MsgType.LOGON);
            logonResponse.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
            logonResponse.setInt(HeartBtInt.FIELD, logonRequest.getInt(HeartBtInt.FIELD));
            
            final Message.Header header = logonResponse.getHeader();
            header.setString(BeginString.FIELD, sessionID.getBeginString());
            header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
            header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
            header.setInt(MsgSeqNum.FIELD, 1);
            header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getLocalDateTime(), true);
            
            Thread resetThread = new Thread(session::reset, "SessionReset");
            resetThread.setDaemon(true);
            
            Thread messageSender = new Thread(() -> {
                for (int i = 2; i <= NUMBER_OF_ADMIN_MESSAGES; i++) {
                    session.send(createAdminMessage(i));
                }
            }, "SessionSend");
            messageSender.setDaemon(true);
            
            // submit threads to pausable executor and try to let them start at the same time
            PausableThreadPoolExecutor ptpe = new PausableThreadPoolExecutor();
            ptpe.pause();
            ptpe.submit(messageSender);
            ptpe.submit(resetThread);
            ptpe.resume();
            ptpe.awaitTermination(2, TimeUnit.SECONDS);
            
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            long[] threadIds = bean.findDeadlockedThreads();
            assertNull("no threads should be deadlocked", threadIds);
            assertTrue("session should have been reset", responder.onResetCalled);
            
            ptpe.shutdownNow();
        }
    }

    private Message createAdminMessage(int sequence) {
        final TestRequest msg = new TestRequest(new TestReqID("SessionResetTest"));
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        return msg;
    }

    private class UnitTestResponder implements Responder, SessionStateListener {
        public String sentMessageData;
        public boolean onResetCalled;

        public boolean send(String data) {
            sentMessageData = data;
            return true;
        }

        public String getRemoteAddress() {
            return null;
        }

        public void disconnect() {
        }

        public void onConnect(SessionID sessionID) {
        }

        public void onDisconnect(SessionID sessionID) {
        }

        public void onLogon(SessionID sessionID) {
        }

        public void onLogout(SessionID sessionID) {
        }

        public void onReset(SessionID sessionID) {
            onResetCalled = true;
        }

        public void onRefresh(SessionID sessionID) {
        }

        public void onMissedHeartBeat(SessionID sessionID) {
        }

        public void onHeartBeatTimeout(SessionID sessionID) {
        }

        public void onResendRequestSent(SessionID sessionID, int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
        }

        public void onSequenceResetReceived(SessionID sessionID, int newSeqNo, boolean gapFillFlag) {
        }

        public void onResendRequestSatisfied(SessionID sessionID, int beginSeqNo, int endSeqNo) {
        }
    }

}
