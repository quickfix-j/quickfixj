package quickfix;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Arbiter;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.JJ_Result;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("unused")
public class MemoryStoreStressTest {

    @State
    @JCStressTest
    @Outcome(id = "2, 2", expect = Expect.ACCEPTABLE)
    @Outcome(id = "1, 2", expect = Expect.FORBIDDEN, desc = "Source sequence update lost")
    @Outcome(id = "2, 1", expect = Expect.FORBIDDEN, desc = "Target sequence update lost")
    public static class SingleSenderSequenceTest {

        private final MemoryStoreWrapper underTest;

        public SingleSenderSequenceTest() {
            this.underTest = new MemoryStoreWrapper();
        }

        // application thread
        @Actor
        public void incrementSender() {
            underTest.incrementSenderSequence();
        }

        // QFJ Message Processor
        @Actor
        public void incrementTarget() {
            underTest.incrementTargetSequence();
        }

        @Arbiter
        public void captureResult(JJ_Result result) {
            result.r1 = underTest.getSenderSequence();
            result.r2 = underTest.getTargetSequence();
        }
    }

    @State
    @JCStressTest
    @Outcome(id = "3, 2", expect = Expect.ACCEPTABLE)
    @Outcome(expect = Expect.FORBIDDEN)
    public static class TwoSendersSequenceTest {

        private final MemoryStoreWrapper underTest;

        public TwoSendersSequenceTest() {
            this.underTest = new MemoryStoreWrapper();
        }

        // application thread
        @Actor
        public void incrementSender1() {
            underTest.incrementSenderSequence();
        }

        // application thread
        @Actor
        public void incrementSender2() {
            underTest.incrementSenderSequence();
        }

        // QFJ Message Processor
        @Actor
        public void incrementTarget() {
            underTest.incrementTargetSequence();
        }

        @Arbiter
        public void captureResult(JJ_Result result) {
            result.r1 = underTest.getSenderSequence();
            result.r2 = underTest.getTargetSequence();
        }
    }

    private static final class MemoryStoreWrapper {

        private final MemoryStore store;
        private final Lock senderSequenceLock;
        private final Lock targetSequenceLock;

        public MemoryStoreWrapper() {
            try {
                this.store = new MemoryStore();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            this.senderSequenceLock = new ReentrantLock();
            this.targetSequenceLock = new ReentrantLock();
        }

        public void incrementSenderSequence() {
            senderSequenceLock.lock();

            try {
                store.incrNextSenderMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                senderSequenceLock.unlock();
            }
        }

        public void incrementTargetSequence() {
            targetSequenceLock.lock();

            try {
                store.incrNextTargetMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                targetSequenceLock.unlock();
            }
        }

        public int getSenderSequence() {
            try {
                return store.getNextSenderMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int getTargetSequence() {
            try {
                return store.getNextTargetMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
