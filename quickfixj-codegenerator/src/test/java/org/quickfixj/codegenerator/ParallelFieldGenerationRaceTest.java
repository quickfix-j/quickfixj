package org.quickfixj.codegenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ParallelFieldGenerationRaceTest {

    private static final String PARALLEL_OPTION = "generator.parallelExecution";
    private static final String PARALLEL_THREADS_OPTION = "generator.parallelThreads";
    private static final int TOTAL_FIELDS = 1000;
    private static final int PARALLEL_TASKS = 16;
    private static final int PARALLEL_ROUNDS = 8;
    private static final String TARGET_FIELD_NAME = "RaceSharedField";
    private static final String TARGET_FIELD_FILE = TARGET_FIELD_NAME + ".java";

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @After
    public void clearParallelOption() {
        System.clearProperty(PARALLEL_OPTION);
        System.clearProperty(PARALLEL_THREADS_OPTION);
    }

    @Test
    public void testDeterministicCorruptionWithTwoConcurrentWriters() throws Exception {
        File transformDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");
        File dictionaryA = createTwoWriterDictionary("9001", "ALPHA");
        File dictionaryB = createTwoWriterDictionary("9002", "OMEGA");

        MessageCodeGenerator sequential = new MessageCodeGenerator();
        String expectedA = generateAndReadTargetField(sequential, createTask("expected-a", dictionaryA,
                transformDirectory, tempFolder.newFolder("expected-a")));
        String expectedB = generateAndReadTargetField(sequential, createTask("expected-b", dictionaryB,
                transformDirectory, tempFolder.newFolder("expected-b")));
        int splitPosition = calculateSplitPosition(expectedA, expectedB);

        System.setProperty(PARALLEL_OPTION, "true");
        System.setProperty(PARALLEL_THREADS_OPTION, "2");

        File raceOutput = tempFolder.newFolder("deterministic-race");
        MessageCodeGenerator generator = new CoordinatedOutputMessageCodeGenerator(TARGET_FIELD_FILE,
                splitPosition);
        generator.generate(Arrays.asList(
                createTask("race-a", dictionaryA, transformDirectory, raceOutput),
                createTask("race-b", dictionaryB, transformDirectory, raceOutput)));

        String actual = readTargetField(raceOutput);
        assertFalse("Expected a mixed/corrupt output, but got variant A", expectedA.equals(actual));
        assertFalse("Expected a mixed/corrupt output, but got variant B", expectedB.equals(actual));
    }

    @Test
    public void testParallelFieldGenerationMatchesSingleThreadedGolden() throws Exception {
        File dictionary = createDictionaryWith1000Fields();
        File transformDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");

        File goldenOutput = tempFolder.newFolder("golden");
        MessageCodeGenerator generator = new MessageCodeGenerator();
        generator.generate(createTask("golden", dictionary, transformDirectory, goldenOutput));

        Map<String, String> goldenFieldSources = collectFieldSources(goldenOutput);
        assertEquals(TOTAL_FIELDS, goldenFieldSources.size());

        System.setProperty(PARALLEL_OPTION, "true");
        System.setProperty(PARALLEL_THREADS_OPTION, Integer.toString(PARALLEL_TASKS));
        for (int round = 0; round < PARALLEL_ROUNDS; round++) {
            File parallelRoot = tempFolder.newFolder("parallel-" + round);
            List<MessageCodeGenerator.Task> tasks = createParallelTasks(dictionary, transformDirectory,
                    parallelRoot);
            generator.generate(tasks);
            for (int i = 0; i < PARALLEL_TASKS; i++) {
                File taskOutput = new File(parallelRoot, "task-" + i);
                assertEquals("Mismatch in round " + round + ", task " + i, goldenFieldSources,
                        collectFieldSources(taskOutput));
            }
        }
    }

    private MessageCodeGenerator.Task createTask(String name, File dictionary, File transformDirectory,
            File outputDirectory) {
        MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
        task.setName(name);
        task.setSpecification(dictionary);
        task.setTransformDirectory(transformDirectory);
        task.setMessagePackage("quickfix.race");
        task.setOutputBaseDirectory(outputDirectory);
        task.setFieldPackage("quickfix.field");
        task.setOverwrite(true);
        task.setOrderedFields(true);
        task.setDecimalGenerated(true);
        return task;
    }

    private List<MessageCodeGenerator.Task> createParallelTasks(File dictionary, File transformDirectory,
            File parallelRoot) {
        List<MessageCodeGenerator.Task> tasks = new ArrayList<>();
        for (int i = 0; i < PARALLEL_TASKS; i++) {
            File taskOutput = new File(parallelRoot, "task-" + i);
            tasks.add(createTask("race-" + i, dictionary, transformDirectory, taskOutput));
        }
        return tasks;
    }

    private String generateAndReadTargetField(MessageCodeGenerator generator, MessageCodeGenerator.Task task)
            throws Exception {
        generator.generate(task);
        return readTargetField(task.getOutputBaseDirectory());
    }

    private String readTargetField(File outputDirectory) throws Exception {
        Path target = outputDirectory.toPath().resolve("quickfix/field").resolve(TARGET_FIELD_FILE);
        return new String(Files.readAllBytes(target), StandardCharsets.UTF_8);
    }

    private Map<String, String> collectFieldSources(File outputDirectory) throws Exception {
        Map<String, String> sources = new TreeMap<>();
        Path fieldDir = outputDirectory.toPath().resolve("quickfix/field");
        try (Stream<Path> stream = Files.walk(fieldDir)) {
            stream
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            String relative = fieldDir.relativize(path).toString();
                            String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
                            sources.put(relative, content);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
        return sources;
    }

    private File createDictionaryWith1000Fields() throws Exception {
        File dictionary = tempFolder.newFile("RaceCondition1000Fields.xml");
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<fix major=\"4\" minor=\"4\">\n");
        xml.append("  <header>\n");
        xml.append("    <field name=\"BeginString\" required=\"Y\"/>\n");
        xml.append("    <field name=\"BodyLength\" required=\"Y\"/>\n");
        xml.append("    <field name=\"MsgType\" required=\"Y\"/>\n");
        xml.append("    <field name=\"SenderCompID\" required=\"Y\"/>\n");
        xml.append("    <field name=\"TargetCompID\" required=\"Y\"/>\n");
        xml.append("    <field name=\"MsgSeqNum\" required=\"Y\"/>\n");
        xml.append("    <field name=\"SendingTime\" required=\"Y\"/>\n");
        xml.append("  </header>\n");
        xml.append("  <trailer>\n");
        xml.append("    <field name=\"CheckSum\" required=\"Y\"/>\n");
        xml.append("  </trailer>\n");
        xml.append("  <messages>\n");
        xml.append("  </messages>\n");
        xml.append("  <fields>\n");
        xml.append("    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"9\" name=\"BodyLength\" type=\"LENGTH\"/>\n");
        xml.append("    <field number=\"35\" name=\"MsgType\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"49\" name=\"SenderCompID\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"56\" name=\"TargetCompID\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"34\" name=\"MsgSeqNum\" type=\"SEQNUM\"/>\n");
        xml.append("    <field number=\"52\" name=\"SendingTime\" type=\"UTCTIMESTAMP\"/>\n");
        xml.append("    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>\n");
        for (int i = 1; i <= TOTAL_FIELDS - 8; i++) {
            xml.append("    <field number=\"").append(10000 + i).append("\" name=\"RaceField")
                    .append(i).append("\" type=\"STRING\"/>\n");
        }
        xml.append("  </fields>\n");
        xml.append("</fix>\n");
        Files.write(dictionary.toPath(), xml.toString().getBytes(StandardCharsets.UTF_8));
        return dictionary;
    }

    private File createTwoWriterDictionary(String raceFieldNumber, String raceEnumPrefix) throws Exception {
        File dictionary = tempFolder.newFile("RaceCondition-" + raceFieldNumber + ".xml");
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<fix major=\"4\" minor=\"4\">\n");
        xml.append("  <header>\n");
        xml.append("    <field name=\"BeginString\" required=\"Y\"/>\n");
        xml.append("    <field name=\"BodyLength\" required=\"Y\"/>\n");
        xml.append("    <field name=\"MsgType\" required=\"Y\"/>\n");
        xml.append("    <field name=\"SenderCompID\" required=\"Y\"/>\n");
        xml.append("    <field name=\"TargetCompID\" required=\"Y\"/>\n");
        xml.append("    <field name=\"MsgSeqNum\" required=\"Y\"/>\n");
        xml.append("    <field name=\"SendingTime\" required=\"Y\"/>\n");
        xml.append("  </header>\n");
        xml.append("  <trailer>\n");
        xml.append("    <field name=\"CheckSum\" required=\"Y\"/>\n");
        xml.append("  </trailer>\n");
        xml.append("  <messages/>\n");
        xml.append("  <fields>\n");
        xml.append("    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"9\" name=\"BodyLength\" type=\"LENGTH\"/>\n");
        xml.append("    <field number=\"35\" name=\"MsgType\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"49\" name=\"SenderCompID\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"56\" name=\"TargetCompID\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"34\" name=\"MsgSeqNum\" type=\"SEQNUM\"/>\n");
        xml.append("    <field number=\"52\" name=\"SendingTime\" type=\"UTCTIMESTAMP\"/>\n");
        xml.append("    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>\n");
        xml.append("    <field number=\"").append(raceFieldNumber).append("\" name=\"")
                .append(TARGET_FIELD_NAME).append("\" type=\"STRING\">\n");
        xml.append("      <value enum=\"").append(raceEnumPrefix)
                .append("_ONE\" description=\"first value\"/>\n");
        xml.append("      <value enum=\"").append(raceEnumPrefix)
                .append("_TWO\" description=\"second value\"/>\n");
        xml.append("      <value enum=\"").append(raceEnumPrefix)
                .append("_THREE\" description=\"third value\"/>\n");
        xml.append("    </field>\n");
        xml.append("  </fields>\n");
        xml.append("</fix>\n");
        Files.write(dictionary.toPath(), xml.toString().getBytes(StandardCharsets.UTF_8));
        return dictionary;
    }

    private int calculateSplitPosition(String expectedA, String expectedB) {
        byte[] a = expectedA.getBytes(StandardCharsets.UTF_8);
        byte[] b = expectedB.getBytes(StandardCharsets.UTF_8);
        int minLength = Math.min(a.length, b.length);
        int firstDiff = -1;
        int lastDiff = -1;
        for (int i = 0; i < minLength; i++) {
            if (a[i] != b[i]) {
                if (firstDiff == -1) {
                    firstDiff = i;
                }
                lastDiff = i;
            }
        }
        if (a.length != b.length) {
            if (firstDiff == -1) {
                firstDiff = minLength;
            }
            lastDiff = Math.max(a.length, b.length) - 1;
        }
        if (firstDiff < 0 || lastDiff <= firstDiff) {
            throw new IllegalStateException("Expected distinct variants with differences across the target file");
        }
        int split = (firstDiff + lastDiff) / 2;
        return Math.max(1, split);
    }

    private static final class CoordinatedOutputMessageCodeGenerator extends MessageCodeGenerator {
        private final String targetFileName;
        private final int splitPosition;
        private final AtomicInteger targetStreamCounter = new AtomicInteger();
        private final CountDownLatch openedBothStreams = new CountDownLatch(2);
        private final CountDownLatch firstHalfByWriterOne = new CountDownLatch(1);
        private final CountDownLatch firstHalfByWriterTwo = new CountDownLatch(1);
        private final CountDownLatch secondHalfByWriterTwo = new CountDownLatch(1);
        private final CountDownLatch writerOneFinished = new CountDownLatch(1);

        private CoordinatedOutputMessageCodeGenerator(String targetFileName, int splitPosition) {
            this.targetFileName = targetFileName;
            this.splitPosition = splitPosition;
        }

        @Override
        protected OutputStream createOutputStream(File outputFile) throws FileNotFoundException {
            FileOutputStream delegate = new FileOutputStream(outputFile);
            if (!outputFile.getName().equals(targetFileName)) {
                return delegate;
            }

            int writerId = targetStreamCounter.incrementAndGet();
            openedBothStreams.countDown();
            await(openedBothStreams, "opening both target streams");
            return new CoordinatedRaceOutputStream(delegate, writerId);
        }

        private final class CoordinatedRaceOutputStream extends OutputStream {
            private final OutputStream delegate;
            private final int writerId;
            private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

            private CoordinatedRaceOutputStream(OutputStream delegate, int writerId) {
                this.delegate = delegate;
                this.writerId = writerId;
            }

            @Override
            public void write(int b) {
                buffer.write(b);
            }

            @Override
            public void write(byte[] b, int off, int len) {
                buffer.write(b, off, len);
            }

            @Override
            public void close() throws IOException {
                byte[] data = buffer.toByteArray();
                int split = Math.min(Math.max(1, splitPosition), Math.max(1, data.length - 1));
                try {
                    if (writerId == 1) {
                        delegate.write(data, 0, split);
                        firstHalfByWriterOne.countDown();
                        await(firstHalfByWriterTwo, "writer 2 first-half write");
                        await(secondHalfByWriterTwo, "writer 2 second-half write");
                        delegate.write(data, split, data.length - split);
                        writerOneFinished.countDown();
                    } else {
                        await(firstHalfByWriterOne, "writer 1 first-half write");
                        delegate.write(data, 0, split);
                        firstHalfByWriterTwo.countDown();
                        delegate.write(data, split, data.length - split);
                        secondHalfByWriterTwo.countDown();
                        await(writerOneFinished, "writer 1 completion");
                    }
                } finally {
                    delegate.close();
                }
            }
        }

        private void await(CountDownLatch latch, String action) {
            try {
                if (!latch.await(10, TimeUnit.SECONDS)) {
                    throw new IllegalStateException("Timed out while " + action);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while " + action, e);
            }
        }
    }
}
