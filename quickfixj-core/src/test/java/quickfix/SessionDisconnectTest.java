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

/**
 * @author Jon Freedman
 */
public class SessionDisconnectTest {
    private final String EXTERNAL_COMP_ID = "THEM";
    private final String INTERNAL_COMP_ID = "US";

    @Test
    public void reconnectReceivingLogonResponseBeforeLogonRequestPersisted() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, INTERNAL_COMP_ID, EXTERNAL_COMP_ID);
        final CountDownLatch notifyLatch = new CountDownLatch(1);
        final CountDownLatch waitLatch = new CountDownLatch(1);

        final Session session = new Session(application, new BlockingStoreFactory(notifyLatch, waitLatch), sessionID, null, null,
                new ScreenLogFactory(true, true, true), new ListeningMessageFactory(waitLatch), 60, false, 30,
                UtcTimestampPrecision.MILLIS, false, false, false, false, false,
                false, true, false, 1.5, null,
                true, new int[]{5}, false, false, false, true,
                false, true, false, null, true,
                0, true, false);

        final UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        final MessageStore messageStore = session.getStore();
        checkNextSeqNums(messageStore, 1, 1);

        session.logon();

        final ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            executor.execute(() -> {
                try {
                    session.next();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } finally {
            executor.shutdown();
        }

        notifyLatch.await(10, TimeUnit.SECONDS);
        assertEquals(1, application.lastToAdminMessage().getHeader().getField(new MsgSeqNum()).getValue());
        checkNextSeqNums(messageStore, 1, 1);

        session.next(createLogonResponse());
        checkNextSeqNums(messageStore, 2, 2);

        waitLatch.countDown();

        session.close();
    }

    private void checkNextSeqNums(final MessageStore messageStore, final int nextTarget, final int nextSender) throws IOException {
        assertEquals("NextTargetMsgSeqNum", nextTarget, messageStore.getNextTargetMsgSeqNum());
        assertEquals("NextSenderMsgSeqNum", nextSender, messageStore.getNextSenderMsgSeqNum());
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

    private class BlockingStoreFactory implements MessageStoreFactory {
        private final MemoryStoreFactory factory = new MemoryStoreFactory();
        private final CountDownLatch notifyLatch;
        private final CountDownLatch waitLatch;

        BlockingStoreFactory(final CountDownLatch notifyLatch, final CountDownLatch waitLatch) {
            this.notifyLatch = notifyLatch;
            this.waitLatch = waitLatch;
        }

        @Override
        public MessageStore create(final SessionID sessionID) {
            return new MessageStore() {
                private final MessageStore messageStore = factory.create(sessionID);

                @Override
                public boolean set(final int sequence, final String message) throws IOException {
                    notifyLatch.countDown();
                    try {
                        waitLatch.await(10, TimeUnit.SECONDS);
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
        private final CountDownLatch waitLatch;

        public ListeningMessageFactory(final CountDownLatch waitLatch) {
            this.waitLatch = waitLatch;
        }

        @Override
        public Message create(final String beginString, final String msgType) {
            if (MsgType.LOGOUT.equals(msgType)) {
                waitLatch.countDown();
            }
            return factory.create(beginString, msgType);
        }

        @Override
        public Group create(final String beginString, final String msgType, final int correspondingFieldID) {
            return factory.create(beginString, msgType, correspondingFieldID);
        }
    }

    private class UnitTestResponder implements Responder {
        String sentMessageData;

        public boolean send(String data) {
            sentMessageData = data;
            return true;
        }

        public String getRemoteAddress() {
            return null;
        }

        public void disconnect() {
        }
    }

}
