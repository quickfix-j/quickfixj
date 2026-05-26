package org.quickfixj.codegenerator;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ParallelFieldGenerationRaceTest {

    private static final String PARALLEL_OPTION = "generator.parallelExecution";
    private static final int TOTAL_FIELDS = 1000;
    private static final int PARALLEL_TASKS = 16;
    private static final int PARALLEL_ROUNDS = 8;

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @After
    public void clearParallelOption() {
        System.clearProperty(PARALLEL_OPTION);
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
        for (int round = 0; round < PARALLEL_ROUNDS; round++) {
            File parallelOutput = tempFolder.newFolder("parallel-" + round);
            generator.generate(createParallelTasks(dictionary, transformDirectory, parallelOutput));
            assertEquals("Mismatch in round " + round, goldenFieldSources,
                    collectFieldSources(parallelOutput));
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
            File outputDirectory) {
        List<MessageCodeGenerator.Task> tasks = new ArrayList<>();
        for (int i = 0; i < PARALLEL_TASKS; i++) {
            tasks.add(createTask("race-" + i, dictionary, transformDirectory, outputDirectory));
        }
        return tasks;
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
}
