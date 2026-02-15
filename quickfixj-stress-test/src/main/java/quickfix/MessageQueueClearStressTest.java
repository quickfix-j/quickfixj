package quickfix;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Arbiter;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.III_Result;

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
 * The test simulates a race condition where:
 * - One actor is trying to process queued messages (via nextQueued)
 * - Another actor is trying to clear messages from the queue (via dequeueMessagesUpTo)
 * - The test validates that either all messages are cleared before processing,
 *   or some are processed before clearing, but no message is both processed and cleared
 */
@SuppressWarnings("unused")
public class MessageQueueClearStressTest {

    /**
     * Tests the race between dequeuing messages and clearing them.
     * Acceptable outcomes:
     * - 0 processed, 0 in queue: All messages were cleared before dequeue attempt
     * - N processed, 0 in queue: Messages were processed then cleared
     * Unacceptable outcomes:
     * - Lost updates or inconsistent state between processing and clearing
     */
    @State
    @JCStressTest
    @Outcome(id = "0, 0, 0", expect = Expect.ACCEPTABLE, desc = "All messages cleared before processing")
    @Outcome(id = "1, 0, 0", expect = Expect.ACCEPTABLE, desc = "One message processed, rest cleared")
    @Outcome(id = "2, 0, 0", expect = Expect.ACCEPTABLE, desc = "Two messages processed, rest cleared")
    @Outcome(id = "3, 0, 0", expect = Expect.ACCEPTABLE, desc = "All messages processed before clear")
    @Outcome(expect = Expect.FORBIDDEN, desc = "Inconsistent state detected")
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
        public void captureResult(III_Result result) {
            result.r1 = wrapper.getProcessedCount();
            result.r2 = wrapper.getQueueSize();
            result.r3 = wrapper.getClearedCount();
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

        private final InMemoryMessageQueue queue;
        private int processedCount;
        private int clearedCount;

        public MessageQueueWrapper() {
            this.queue = new InMemoryMessageQueue();
            this.processedCount = 0;
            this.clearedCount = 0;
            
            // Pre-populate queue with messages (simulating out-of-sequence messages)
            // These messages have sequence numbers from 5 to 9
            for (int i = 5; i <= 9; i++) {
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
         */
        public synchronized void processNextQueued() {
            // Try to process messages starting from sequence 5
            for (int seqNum = 5; seqNum <= 9; seqNum++) {
                Message msg = queue.dequeue(seqNum);
                if (msg != null) {
                    processedCount++;
                }
            }
        }

        /**
         * Simulates SequenceReset gap fill behavior - clears all messages
         * with sequence numbers less than the specified value.
         */
        public synchronized void clearMessagesUpTo(int newSeqNum) {
            // Clear messages up to the new sequence number
            int sizeBefore = queue.getBackingMap().size();
            queue.dequeueMessagesUpTo(newSeqNum);
            int sizeAfter = queue.getBackingMap().size();
            clearedCount = sizeBefore - sizeAfter;
        }

        public int getProcessedCount() {
            return processedCount;
        }

        public int getQueueSize() {
            return queue.getBackingMap().size();
        }

        public int getClearedCount() {
            return clearedCount;
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
