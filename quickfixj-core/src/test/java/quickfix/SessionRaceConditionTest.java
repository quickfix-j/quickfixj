package quickfix;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.ResetSeqNumFlag;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.*;

/**
 * Test to verify that Logon messages sent in response to a Logon with ResetSeqNumFlag=Y are always sent with sequence number 1,
 * even if other messages are being written to the Session concurrently during the reset process.
 * Please note that in the absence of the fix for QFJ-902, this test reliably fails (as expected) when run in IntelliJ IDE
 * on a multi-core machine, but on the same hardware does NOT fail when run in console in Ubuntu WSL with Mvn 3.9.13, Open JDK 21.0.2.
 * The test is not good enough to prevent regressions, but it does demonstrate the race condition.
 *
 * The test results below show the race condition in action.
 * <20260311-10:50:29, FIX.4.4:SENDER->TARGET, event> (Received logon)
 * Mar 11, 2026 10:50:29 AM quickfix.UnitTestApplication toAdmin
 * INFO: to admin [FIX.4.4:SENDER->TARGET] 8=FIX.4.49=5535=034=149=SENDER52=20260311-10:50:29.62856=TARGET10=094
 * <20260311-10:50:29, FIX.4.4:SENDER->TARGET, event> (Responding to Logon request)
 * Mar 11, 2026 10:50:29 AM quickfix.UnitTestApplication toAdmin
 * INFO: to admin [FIX.4.4:SENDER->TARGET] 8=FIX.4.49=7335=A34=249=SENDER52=20260311-10:50:29.62856=TARGET98=0108=30141=Y10=182
 * <20260311-10:50:29, FIX.4.4:SENDER->TARGET, outgoing> (8=FIX.4.49=7335=A34=249=SENDER52=20260311-10:50:29.62856=TARGET98=0108=30141=Y10=182)
 * Ref: QFJ-902
 */
public class SessionRaceConditionTest {
    private static Logger log = LoggerFactory.getLogger(SessionRaceConditionTest.class);

    @Test
    public void testLogonResetRaceCondition() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        // Use a custom MessageStore that delays during reset to allow race condition
        DelayingMessageStore store = new DelayingMessageStore(sessionID);
        MessageStoreFactory storeFactory = sessionID1 -> store;

        try (Session session = new SessionFactoryTestSupport.Builder()
                .setSessionId(sessionID)
                .setApplication(application)
                .setMessageStoreFactory(storeFactory)
                .setPersistMessages(true)
                .build()) {
            
            final RaceConditionResponder responder = new RaceConditionResponder();
            session.setResponder(responder);

            // Prepare a Logon with ResetSeqNumFlag=Y
            Message logon = new DefaultMessageFactory().create(sessionID.getBeginString(), MsgType.LOGON);
            logon.setField(new EncryptMethod(EncryptMethod.NONE_OTHER));
            logon.setField(new HeartBtInt(30));
            logon.setField(new ResetSeqNumFlag(true));
            logon.getHeader().setField(new MsgSeqNum(1));
            logon.getHeader().setField(new BeginString(sessionID.getBeginString()));
            logon.getHeader().setField(new SenderCompID(sessionID.getTargetCompID()));
            logon.getHeader().setField(new TargetCompID(sessionID.getSenderCompID()));
            logon.getHeader().setField(new SendingTime(SystemTime.getLocalDateTime()));

            // 2. Process the logon in a separate thread
            CountDownLatch logonStarted = new CountDownLatch(1);
            AtomicBoolean logonFinished = new AtomicBoolean(false);

            store.setDelayReset(true);

            // While logon is processing (and delayed in store.reset()), try to send other messages
            // We'll keep sending messages until the logon thread finishes.
            Thread sendThread = new Thread(() -> {
                try {
                    // Wait a bit to ensure logonThread has reached the delay in reset()
                    System.out.println("[DEBUG_LOG] Attempting to send heartbeats during logon reset delay");
                    while (!logonFinished.get()) {
                        Message heartbeat = new DefaultMessageFactory().create(sessionID.getBeginString(), MsgType.HEARTBEAT);
                        // session.send() calls sendRaw, which locks state.lockSenderMsgSeqNum()
                        // BUT Session.nextLogon does NOT hold any lock between resetState() and generateLogon()
                        session.send(heartbeat);
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (Exception e) {
                    log.error("Exception in sendThread", e);

                }
            }, "SendThread");
            sendThread.start();

            // While HB are being sent in sendThread, the logonThread will be delayed in store.reset()
            Thread logonThread = new Thread(() -> {
                try {
                    logonStarted.countDown();
                    // next() will call nextLogon, which will call resetState and then generateLogon
                    session.next(logon);
                } catch (Exception e) {
                    log.error("Exception in Login thread", e);
                } finally {
                    logonFinished.set(true);
                    log.debug("login thread finished");
                }
            }, "LogonThread");

            logonThread.start();
            logonStarted.await();

            logonThread.join(5000);
            sendThread.join(5000);

            // 5. Check the sent messages. 
            // The Logon response should be the FIRST message sent after reset, and its sequence number MUST be 1.
            List<Message> sentMessages = responder.getSentMessages();
            assertFalse("Should have sent at least one message", sentMessages.isEmpty());
            
            Message logonResponse = null;
            for (Message msg : sentMessages) {
                if (MsgType.LOGON.equals(msg.getHeader().getString(MsgType.FIELD))) {
                    logonResponse = msg;
                    break;
                }
            }
            
            assertNotNull("Should have sent a Logon response", logonResponse);
            int logonSeqNum = logonResponse.getHeader().getInt(MsgSeqNum.FIELD);
            
            assertEquals("Outbound Logon should have sequence number 1 when ResetSeqNumFlag=Y", 1, logonSeqNum);
        }
    }

    private static class RaceConditionResponder implements Responder {
        private final List<Message> sentMessages = Collections.synchronizedList(new ArrayList<>());

        public List<Message> getSentMessages() {
            return new ArrayList<>(sentMessages);
        }

        @Override
        public boolean send(String data) {
            try {
                Message msg = new Message();
                msg.fromString(data, null, null, false);
                sentMessages.add(msg);
            } catch (Exception e) {
                log.error("Exception in RaceConditionResponder send", e);
                return false;
            }
            return true;
        }

        @Override
        public String getRemoteAddress() { return null; }
        @Override
        public void disconnect() {}
    }

    private static class DelayingMessageStore implements MessageStore {
        private final MemoryStore delegate;
        private volatile boolean delayReset = false;

        public DelayingMessageStore(SessionID sessionID) throws IOException {
            this.delegate = new MemoryStore(sessionID);
        }

        public void setDelayReset(boolean delayReset) {
            this.delayReset = delayReset;
        }

        @Override
        public void reset() throws IOException {
            if (delayReset) {
                try {
                    log.debug("Delaying reset()");
                    // Delaying here simulates the race condition window
                    TimeUnit.MILLISECONDS.sleep(1000);
                    log.debug("Resuming reset()");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            delegate.reset();
        }

        @Override
        public void setNextSenderMsgSeqNum(int next) throws IOException {
            delegate.setNextSenderMsgSeqNum(next);
        }

        @Override public boolean set(int sequence, String message) throws IOException { return delegate.set(sequence, message); }
        @Override public void get(int startSequence, int endSequence, Collection<String> messages) throws IOException { delegate.get(startSequence, endSequence, messages); }
        @Override public int getNextSenderMsgSeqNum() throws IOException { return delegate.getNextSenderMsgSeqNum(); }
        @Override public int getNextTargetMsgSeqNum() throws IOException { return delegate.getNextTargetMsgSeqNum(); }
        @Override public void setNextTargetMsgSeqNum(int next) throws IOException { delegate.setNextTargetMsgSeqNum(next); }
        @Override public void incrNextSenderMsgSeqNum() throws IOException { delegate.incrNextSenderMsgSeqNum(); }
        @Override public void incrNextTargetMsgSeqNum() throws IOException { delegate.incrNextTargetMsgSeqNum(); }
        @Override public Date getCreationTime() throws IOException { return delegate.getCreationTime(); }
        @Override public Calendar getCreationTimeCalendar() throws IOException { return delegate.getCreationTimeCalendar(); }
        @Override public void refresh() throws IOException { delegate.refresh(); }
    }
}
