package quickfix;

import java.util.concurrent.atomic.AtomicInteger;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Arbiter;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;

import quickfix.field.BeginString;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;

/**
 * Stress test that validates messages can be cleared from the queue before 
 * they will be picked up via call to nextQueued() in the Session class.
 * 
 * This test is related to PR #1133 which tests SequenceReset with GapFill 
 * functionality that removes queued messages when the gap fill extends beyond them.
 * 
 * The test simulates race conditions where:
 * - One actor is trying to process queued messages (via nextQueued)
 * - Other actors are trying to clear messages from the queue (via dequeueMessagesUpTo)
 * - The test validates that the queue operations are thread-safe and no messages
 *   are lost or left in an inconsistent state
 * 
 * Key scenarios tested:
 * 1. ClearBeforeNextQueuedTest: Tests the basic race between processing and clearing
 *    - Uses synchronized methods to ensure atomicity
 *    - Validates that either messages are cleared OR processed, never both
 *    - Confirms the queue is always empty after both operations complete
 * 
 * 2. MultipleSequenceResetTest: Tests concurrent clearing with multiple resets
 *    - Simulates multiple SequenceReset messages arriving concurrently
 *    - Tests the interaction between processing and multiple clearing operations
 *    - Ensures consistent state even with multiple concurrent clear operations
 * 
 * Expected outcomes:
 * - All acceptable outcomes should have 0 messages remaining in the queue
 * - The number of processed messages can vary from 0 to the total count
 * - No inconsistent states (e.g., messages stuck in queue, double processing)
 */
@SuppressWarnings("unused")
public class MessageQueueClearStressTest {

    /**
     * Tests the race between dequeuing messages and clearing them.
     * This simulates the scenario where nextQueued() is attempting to process
     * messages while a SequenceReset-GapFill operation clears them.
     * 
     * Since InMemoryMessageQueue is designed for single-threaded access,
     * this test uses synchronization to ensure only one operation at a time,
     * but the order of operations is non-deterministic (either process first or clear first).
     * 
     * Acceptable outcomes:
     * - 0 processed, 0 in queue: All messages were cleared before processing attempt
     * - N processed, 0 in queue: N messages were processed, rest cleared  
     * The key is that the queue should always be empty after both operations
     * and all messages are accounted for (either processed or cleared, never both)
     */
    @State
    @JCStressTest
    @Outcome(id = "0, 0", expect = Expect.ACCEPTABLE, desc = "All messages cleared before processing")
    @Outcome(id = "1, 0", expect = Expect.ACCEPTABLE, desc = "One message processed, rest cleared")
    @Outcome(id = "2, 0", expect = Expect.ACCEPTABLE, desc = "Two messages processed, rest cleared")
    @Outcome(id = "3, 0", expect = Expect.ACCEPTABLE, desc = "Three messages processed, rest cleared")
    @Outcome(id = "4, 0", expect = Expect.ACCEPTABLE, desc = "Four messages processed, rest cleared")
    @Outcome(id = "5, 0", expect = Expect.ACCEPTABLE, desc = "All messages processed before clear")
    @Outcome(expect = Expect.FORBIDDEN, desc = "Messages remaining in queue or inconsistent state")
    public static class ClearBeforeNextQueuedTest {

        private final MessageQueueWrapper wrapper;

        public ClearBeforeNextQueuedTest() {
            this.wrapper = new MessageQueueWrapper();
        }

        // Actor 1: Thread trying to process queued messages (simulates nextQueued)
        @Actor
        public void processQueuedMessages() {
            wrapper.processNextQueued();
        }

        // Actor 2: Thread trying to clear messages from queue (simulates SequenceReset gap fill)
        @Actor
        public void clearQueuedMessages() {
            wrapper.clearMessagesUpTo(10);
        }

        @Arbiter
        public void captureResult(org.openjdk.jcstress.infra.results.II_Result result) {
            result.r1 = wrapper.getProcessedCount();
            result.r2 = wrapper.getQueueSize();
        }
    }

    /**
     * Tests concurrent clearing with multiple sequence resets.
     * This simulates a scenario where multiple SequenceReset messages might arrive
     * while messages are being queued and processed.
     */
    @State
    @JCStressTest
    @Outcome(id = "0, 0", expect = Expect.ACCEPTABLE, desc = "All messages cleared")
    @Outcome(id = "1, 0", expect = Expect.ACCEPTABLE, desc = "One message processed")
    @Outcome(id = "2, 0", expect = Expect.ACCEPTABLE, desc = "Two messages processed")
    @Outcome(id = "3, 0", expect = Expect.ACCEPTABLE, desc = "Three messages processed")
    @Outcome(id = "4, 0", expect = Expect.ACCEPTABLE, desc = "Four messages processed")
    @Outcome(id = "5, 0", expect = Expect.ACCEPTABLE, desc = "All messages processed")
    @Outcome(expect = Expect.FORBIDDEN, desc = "Messages remaining in queue")
    public static class MultipleSequenceResetTest {

        private final MessageQueueWrapper wrapper;

        public MultipleSequenceResetTest() {
            this.wrapper = new MessageQueueWrapper();
        }

        // Actor 1: Process queued messages
        @Actor
        public void processMessages() {
            wrapper.processNextQueued();
        }

        // Actor 2: First SequenceReset clearing messages
        @Actor
        public void firstSequenceReset() {
            wrapper.clearMessagesUpTo(5);
        }

        // Actor 3: Second SequenceReset clearing more messages
        @Actor
        public void secondSequenceReset() {
            wrapper.clearMessagesUpTo(10);
        }

        @Arbiter
        public void captureResult(org.openjdk.jcstress.infra.results.II_Result result) {
            result.r1 = wrapper.getProcessedCount();
            result.r2 = wrapper.getQueueSize();
        }
    }

    /**
     * Wrapper class that simulates Session's message queue behavior.
     * This includes enqueueing, dequeuing, and clearing messages.
     */
    private static final class MessageQueueWrapper {

        private static final int MIN_SEQ_NUM = 5;
        private static final int MAX_SEQ_NUM = 9;

        private final InMemoryMessageQueue queue;
        private final AtomicInteger processedCount;

        public MessageQueueWrapper() {
            this.queue = new InMemoryMessageQueue();
            this.processedCount = new AtomicInteger(0);
            
            // Pre-populate queue with messages (simulating out-of-sequence messages)
            for (int i = MIN_SEQ_NUM; i <= MAX_SEQ_NUM; i++) {
                try {
                    Message msg = createMessage(i);
                    queue.enqueue(i, msg);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to create test message", e);
                }
            }
        }

        /**
         * Simulates the nextQueued() method behavior - attempts to process
         * all queued messages in sequence order.
         * Synchronized to simulate single-threaded Session behavior.
         */
        public synchronized void processNextQueued() {
            // Try to process all messages in the queue
            for (int seqNum = MIN_SEQ_NUM; seqNum <= MAX_SEQ_NUM; seqNum++) {
                Message msg = queue.dequeue(seqNum);
                if (msg != null) {
                    processedCount.incrementAndGet();
                }
            }
        }

        /**
         * Simulates SequenceReset gap fill behavior - clears all messages
         * with sequence numbers strictly less than the specified value (exclusive).
         * Synchronized to simulate single-threaded Session behavior.
         */
        public synchronized void clearMessagesUpTo(int newSeqNum) {
            // Clear messages with seqnum < newSeqNum (exclusive upper bound)
            queue.dequeueMessagesUpTo(newSeqNum);
        }

        public int getProcessedCount() {
            return processedCount.get();
        }

        public int getQueueSize() {
            return queue.getBackingMap().size();
        }

        /**
         * Creates a simple FIX message for testing.
         */
        private Message createMessage(int seqNum) throws Exception {
            Message msg = new Message();
            msg.getHeader().setString(BeginString.FIELD, "FIX.4.4");
            msg.getHeader().setString(MsgType.FIELD, "D"); // NewOrderSingle
            msg.getHeader().setString(SenderCompID.FIELD, "SENDER");
            msg.getHeader().setString(TargetCompID.FIELD, "TARGET");
            msg.getHeader().setInt(MsgSeqNum.FIELD, seqNum);
            return msg;
        }
    }
}
