package org.quickfixj.codegenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.After;
import org.junit.Test;

public class ParallelExecutionOptionTest {

    private static final String PARALLEL_OPTION = "generator.parallelExecution";

    @After
    public void clearParallelOption() {
        System.clearProperty(PARALLEL_OPTION);
    }

    @Test
    public void testSequentialExecutionWhenParallelOptionIsDisabled() {
        System.setProperty(PARALLEL_OPTION, "false");

        TrackingMessageCodeGenerator generator = new TrackingMessageCodeGenerator();
        generator.generate(createTasks(4));

        assertEquals(1, generator.getMaxConcurrentTasks());
        assertTrue(generator.containsInfoLog("Started task for task-0 (1 / 4)"));
        assertTrue(generator.containsInfoLog("Finished task for task-3 (4 / 4)"));
    }

    @Test
    public void testParallelExecutionWhenParallelOptionIsEnabled() {
        System.setProperty(PARALLEL_OPTION, "true");

        TrackingMessageCodeGenerator generator = new TrackingMessageCodeGenerator();
        generator.generate(createTasks(4));

        assertTrue(generator.getMaxConcurrentTasks() > 1);
        assertTrue(generator.containsInfoLog("parallel task execution enabled with"));
        assertTrue(generator.containsInfoLog("for 4 task(s)"));
        assertTrue(generator.containsInfoLog("Started task for task-0 (1 / 4)"));
        assertTrue(generator.containsInfoLog("Finished task for task-3 (4 / 4)"));
    }

    @Test
    public void testParallelExecutionIsEnabledByDefault() {
        System.clearProperty(PARALLEL_OPTION);

        TrackingMessageCodeGenerator generator = new TrackingMessageCodeGenerator();
        generator.generate(createTasks(4));

        assertTrue(generator.getMaxConcurrentTasks() > 1);
        assertTrue(generator.containsInfoLog("parallel task execution enabled with"));
        assertTrue(generator.containsInfoLog("for 4 task(s)"));
        assertTrue(generator.containsFinishLogForAllTasks(4));
    }

    private static List<MessageCodeGenerator.Task> createTasks(int count) {
        List<MessageCodeGenerator.Task> tasks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
            task.setName("task-" + i);
            tasks.add(task);
        }
        return tasks;
    }

    private static class TrackingMessageCodeGenerator extends MessageCodeGenerator {
        private final AtomicInteger currentConcurrentTasks = new AtomicInteger();
        private final AtomicInteger maxConcurrentTasks = new AtomicInteger();
        private final List<String> infoMessages = new ArrayList<>();

        @Override
        public void generate(Task task) {
            int concurrentTaskCount = currentConcurrentTasks.incrementAndGet();
            maxConcurrentTasks.accumulateAndGet(concurrentTaskCount, Math::max);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                currentConcurrentTasks.decrementAndGet();
            }
        }

        int getMaxConcurrentTasks() {
            return maxConcurrentTasks.get();
        }

        @Override
        protected void logInfo(String msg) {
            infoMessages.add(msg);
        }

        boolean containsInfoLog(String token) {
            for (String infoMessage : infoMessages) {
                if (infoMessage.contains(token)) {
                    return true;
                }
            }
            return false;
        }

        boolean containsFinishLogForAllTasks(int taskCount) {
            for (int i = 0; i < taskCount; i++) {
                if (!containsInfoLog("Finished task for task-" + i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
