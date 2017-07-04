package quickfix;

import org.junit.Test;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NextExpectedMsgSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.fix44.Logon;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The purpose of this test is to simulate the situation where a logon response is received before a logon request can
 * be successfully persisted to the MessageStore.
 *
 * @author Jon Freedman
 */
public class SessionDisconnectTest {
    private final int TIMEOUT_SECS = 1;
    private final String EXTERNAL_COMP_ID = "THEM";
    private final String INTERNAL_COMP_ID = "US";

    @Test
    public void reconnectReceivingLogonResponseBeforeLogonRequestPersisted() throws Exception {
        final CountDownLatch storeMessageLatch = new CountDownLatch(1);
        final CountDownLatch receiveLogonResponseLatch = new CountDownLatch(1);
        final CountDownLatch sentLogoutLatch = new CountDownLatch(1);

        final UnitTestApplication application = new UnitTestApplication() {
            @Override
            public void fromAdmin(final Message message, final SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                receiveLogonResponseLatch.countDown();
                super.fromAdmin(message, sessionId);
            }
        };
        final Session session = buildSession(application, storeMessageLatch, receiveLogonResponseLatch, sentLogoutLatch);

        final MessageStore messageStore = session.getStore();
        checkNextSeqNums(messageStore, 1, 1);

        session.logon();

        processOnSeparateThread(session::next);
        assertTrue(String.format("Message not stored within %s secs", TIMEOUT_SECS), storeMessageLatch.await(TIMEOUT_SECS, TimeUnit.SECONDS));
        assertEquals(1, application.lastToAdminMessage().getHeader().getField(new MsgSeqNum()).getValue());
        checkNextSeqNums(messageStore, 1, 1);

        processOnSeparateThread(() -> {
            storeMessageLatch.await(TIMEOUT_SECS, TimeUnit.SECONDS);
            session.next(createLogonResponse());
        });
        assertTrue(String.format("Logon response not received within %s secs", TIMEOUT_SECS), receiveLogonResponseLatch.await(TIMEOUT_SECS, TimeUnit.SECONDS));
        assertTrue(String.format("Logout/SequenceReset not sent %s secs", TIMEOUT_SECS * 2), sentLogoutLatch.await(TIMEOUT_SECS * 2, TimeUnit.SECONDS));
        checkNextSeqNums(messageStore, 2, 2);

        session.close();
    }

    private void checkNextSeqNums(final MessageStore messageStore, final int nextTarget, final int nextSender) throws IOException {
        assertEquals("NextTargetMsgSeqNum", nextTarget, messageStore.getNextTargetMsgSeqNum());
        assertEquals("NextSenderMsgSeqNum", nextSender, messageStore.getNextSenderMsgSeqNum());
    }

    private Session buildSession(final Application application, final CountDownLatch storeMessageLatch, final CountDownLatch receiveLogonResponseLatch, final CountDownLatch sentLogoutLatch) {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, INTERNAL_COMP_ID, EXTERNAL_COMP_ID);
        final Session session = new Session(application, new BlockingStoreFactory(storeMessageLatch, sentLogoutLatch), sessionID, null, null,
                new ScreenLogFactory(true, true, true), new ListeningMessageFactory(sentLogoutLatch), 60, false, 30,
                UtcTimestampPrecision.MILLIS, false, false, false, false, false,
                false, true, false, 1.5, null,
                true, new int[]{5}, false, false, false, true,
                false, true, false, null, true,
                0, true, false);
        session.setResponder(new Responder() {
            @Override
            public boolean send(final String data) {
                return true;
            }

            @Override
            public void disconnect() {
            }

            @Override
            public String getRemoteAddress() {
                return null;
            }
        });

        return session;
    }

    private Message createLogonResponse() throws FieldNotFound {
        final Logon logonResponse = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER), new HeartBtInt(60));
        logonResponse.setField(new NextExpectedMsgSeqNum(2));
        final Message.Header header = logonResponse.getHeader();
        header.setField(new SenderCompID(EXTERNAL_COMP_ID));
        header.setField(new TargetCompID(INTERNAL_COMP_ID));
        header.setField(new MsgSeqNum(1));
        header.setField(new SendingTime(SystemTime.getLocalDateTime()));
        return logonResponse;
    }

    private void processOnSeparateThread(final SessionAction action) {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            executor.execute(() -> {
                try {
                    action.run();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        } finally {
            executor.shutdown();
        }
    }

    @FunctionalInterface
    private interface SessionAction {
        void run() throws Exception;
    }

    private class BlockingStoreFactory implements MessageStoreFactory {
        private final MemoryStoreFactory factory = new MemoryStoreFactory();
        private final CountDownLatch storeMessageLatch;
        private final CountDownLatch sentLogoutLatch;

        BlockingStoreFactory(final CountDownLatch storeMessageLatch, final CountDownLatch sentLogoutLatch) {
            this.storeMessageLatch = storeMessageLatch;
            this.sentLogoutLatch = sentLogoutLatch;
        }

        @Override
        public MessageStore create(final SessionID sessionID) {
            return new MessageStore() {
                private final MessageStore messageStore = factory.create(sessionID);

                @Override
                public boolean set(final int sequence, final String message) throws IOException {
                    storeMessageLatch.countDown();
                    try {
                        // we are not verifying the return value of this call to #await as once the issue is fixed with locking this will return false
                        sentLogoutLatch.await(TIMEOUT_SECS, TimeUnit.SECONDS);
                    } catch (final InterruptedException e) {
                        throw new IOException(e);
                    }
                    return messageStore.set(sequence, message);
                }

                @Override
                public void get(final int startSequence, final int endSequence, final Collection<String> messages) throws IOException {
                    messageStore.get(startSequence, endSequence, messages);
                }

                @Override
                public int getNextSenderMsgSeqNum() throws IOException {
                    return messageStore.getNextSenderMsgSeqNum();
                }

                @Override
                public int getNextTargetMsgSeqNum() throws IOException {
                    return messageStore.getNextTargetMsgSeqNum();
                }

                @Override
                public void setNextSenderMsgSeqNum(final int next) throws IOException {
                    messageStore.setNextSenderMsgSeqNum(next);
                }

                @Override
                public void setNextTargetMsgSeqNum(final int next) throws IOException {
                    messageStore.setNextTargetMsgSeqNum(next);
                }

                @Override
                public void incrNextSenderMsgSeqNum() throws IOException {
                    messageStore.incrNextSenderMsgSeqNum();
                }

                @Override
                public void incrNextTargetMsgSeqNum() throws IOException {
                    messageStore.incrNextTargetMsgSeqNum();
                }

                @Override
                public Date getCreationTime() throws IOException {
                    return messageStore.getCreationTime();
                }

                @Override
                public void reset() throws IOException {
                    messageStore.reset();
                }

                @Override
                public void refresh() throws IOException {
                    messageStore.refresh();
                }
            };
        }
    }

    private class ListeningMessageFactory implements MessageFactory {
        private final MessageFactory factory = new DefaultMessageFactory();
        private final CountDownLatch sentLogoutLatch;

        public ListeningMessageFactory(final CountDownLatch sentLogoutLatch) {
            this.sentLogoutLatch = sentLogoutLatch;
        }

        @Override
        public Message create(final String beginString, final String msgType) {
            if (MsgType.LOGOUT.equals(msgType) || MsgType.SEQUENCE_RESET.equals(msgType)) {
                sentLogoutLatch.countDown();
            }
            return factory.create(beginString, msgType);
        }

        @Override
        public Group create(final String beginString, final String msgType, final int correspondingFieldID) {
            return factory.create(beginString, msgType, correspondingFieldID);
        }
    }

}
