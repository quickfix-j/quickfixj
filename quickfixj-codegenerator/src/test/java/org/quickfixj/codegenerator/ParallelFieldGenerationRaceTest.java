package org.quickfixj.codegenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @After
    public void clearParallelOptions() {
        System.clearProperty(PARALLEL_OPTION);
        System.clearProperty(PARALLEL_THREADS_OPTION);
    }

    @Test
    public void testParallelSharedOutputAgainstGoldenSource() throws Exception {
        File transformDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");
        File dictionaryTwoEnums = createDictionary("two-enums", false);
        File dictionaryThreeEnums = createDictionary("three-enums", true);

        // Use a plain generator for the single-task golden baseline so that the
        // barrier (which requires two parties) does not deadlock.
        File goldenOutput = tempFolder.newFolder("golden");
        new MessageCodeGenerator().generate(
                createTask("golden", dictionaryThreeEnums, transformDirectory, goldenOutput));
        Map<String, String> goldenFieldSources = collectFieldSources(goldenOutput);
        assertEquals(TOTAL_FIELDS, goldenFieldSources.size());

        // For every output file path, keep a CyclicBarrier(2) so that the first
        // two threads that open the same file must both reach their first write()
        // call before either is allowed to proceed.  This forces two writers to
        // be simultaneously mid-write on every field file, turning the
        // probabilistic race into a near-deterministic one.
        ConcurrentHashMap<String, CyclicBarrier> barriers = new ConcurrentHashMap<>();
        MessageCodeGenerator generator = new MessageCodeGenerator() {
            @Override
            protected OutputStream createOutputStream(File outputFile) throws FileNotFoundException {
                CyclicBarrier barrier = barriers.computeIfAbsent(
                        outputFile.getAbsolutePath(), k -> new CyclicBarrier(2));
                return new FilterOutputStream(super.createOutputStream(outputFile)) {
                    private boolean awaited = false;

                    @Override
                    public void write(byte[] b, int off, int len) throws IOException {
                        awaitBarrierOnce();
                        out.write(b, off, len);
                    }

                    @Override
                    public void write(int b) throws IOException {
                        awaitBarrierOnce();
                        out.write(b);
                    }

                    private void awaitBarrierOnce() throws IOException {
                        if (!awaited) {
                            awaited = true;
                            try {
                                barrier.await(10, TimeUnit.SECONDS);
                            } catch (BrokenBarrierException | TimeoutException e) {
                                // Proceed: either the barrier timed out because an odd
                                // number of threads wrote this file, or it was broken
                                // by a previous exception.
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                };
            }
        };

        File sharedOutput = tempFolder.newFolder("shared-output");
        List<MessageCodeGenerator.Task> tasks = new ArrayList<>();
        for (int i = 0; i < PARALLEL_TASKS; i++) {
            File dictionary = i % 2 == 0 ? dictionaryTwoEnums : dictionaryThreeEnums;
            tasks.add(createTask("race-" + i, dictionary, transformDirectory, sharedOutput));
        }

        System.setProperty(PARALLEL_OPTION, "true");
        System.setProperty(PARALLEL_THREADS_OPTION, Integer.toString(PARALLEL_TASKS));
        generator.generate(tasks);

        assertFirstDifferenceOnly(goldenFieldSources, collectFieldSources(sharedOutput));
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

    private Map<String, String> collectFieldSources(File outputDirectory) throws Exception {
        Map<String, String> sources = new TreeMap<>();
        Path fieldDir = outputDirectory.toPath().resolve("quickfix/field");
        try (Stream<Path> stream = Files.walk(fieldDir)) {
            stream.filter(path -> path.toString().endsWith(".java")).forEach(path -> {
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

    private void assertFirstDifferenceOnly(Map<String, String> expected, Map<String, String> actual) {
        for (Map.Entry<String, String> entry : expected.entrySet()) {
            String className = entry.getKey();
            if (!actual.containsKey(className)) {
                fail("First failing class: " + className + "\nDifference: class missing in generated output");
            }

            String expectedSource = entry.getValue();
            String actualSource = actual.get(className);
            if (!expectedSource.equals(actualSource)) {
                fail(buildFirstDifferenceMessage(className, expectedSource, actualSource));
            }
        }

        for (String className : actual.keySet()) {
            if (!expected.containsKey(className)) {
                fail("First failing class: " + className
                        + "\nDifference: unexpected class present in generated output");
            }
        }
    }

    private String buildFirstDifferenceMessage(String className, String expected, String actual) {
        String[] expectedLines = expected.split("\\R", -1);
        String[] actualLines = actual.split("\\R", -1);
        int lineCount = Math.min(expectedLines.length, actualLines.length);
        for (int i = 0; i < lineCount; i++) {
            if (!expectedLines[i].equals(actualLines[i])) {
                return "First failing class: " + className
                        + "\nDifference at line " + (i + 1)
                        + "\nExpected: " + expectedLines[i]
                        + "\nActual:   " + actualLines[i];
            }
        }

        return "First failing class: " + className
                + "\nDifference: source length mismatch"
                + "\nExpected lines: " + expectedLines.length
                + "\nActual lines:   " + actualLines.length;
    }

    private File createDictionary(String name, boolean withExtraEnum) throws Exception {
        File dictionary = tempFolder.newFile("RaceCondition-" + name + ".xml");
        StringBuilder xml = new StringBuilder();
        int minorVersion = withExtraEnum ? 4 : 2;
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<fix major=\"4\" minor=\"").append(minorVersion).append("\">\n");
        xml.append("  <header/>\n");
        xml.append("  <trailer/>\n");
        xml.append("  <messages/>\n");
        xml.append("  <fields>\n");
        for (int i = 1; i <= TOTAL_FIELDS; i++) {
            int tag = 10000 + i;
            xml.append("    <field number=\"").append(tag).append("\" name=\"RaceField")
                    .append(i).append("\" type=\"STRING\">\n");
            xml.append("      <value enum=\"A").append(i).append("\" description=\"VALUE_A\"/>\n");
            xml.append("      <value enum=\"B").append(i).append("\" description=\"VALUE_B\"/>\n");
            if (withExtraEnum) {
                xml.append("      <value enum=\"C").append(i)
                        .append("\" description=\"VALUE_C\"/>\n");
            }
            xml.append("    </field>\n");
        }
        xml.append("  </fields>\n");
        xml.append("</fix>\n");
        Files.write(dictionary.toPath(), xml.toString().getBytes(StandardCharsets.UTF_8));
        return dictionary;
    }
}
