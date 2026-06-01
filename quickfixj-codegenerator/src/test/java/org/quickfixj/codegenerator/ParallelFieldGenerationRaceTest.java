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
        MessageCodeGenerator generator = new MessageCodeGenerator();

        File goldenOutput = tempFolder.newFolder("golden");
        generator.generate(createTask("golden", dictionaryTwoEnums, transformDirectory, goldenOutput));
        Map<String, String> goldenFieldSources = collectFieldSources(goldenOutput);
        assertEquals(TOTAL_FIELDS, goldenFieldSources.size());

        File sharedOutput = tempFolder.newFolder("shared-output");
        List<MessageCodeGenerator.Task> tasks = new ArrayList<>();
        for (int i = 0; i < PARALLEL_TASKS; i++) {
            File dictionary = i % 2 == 0 ? dictionaryTwoEnums : dictionaryThreeEnums;
            tasks.add(createTask("race-" + i, dictionary, transformDirectory, sharedOutput));
        }

        System.setProperty(PARALLEL_OPTION, "true");
        System.setProperty(PARALLEL_THREADS_OPTION, Integer.toString(PARALLEL_TASKS));
        generator.generate(tasks);

        assertEquals(goldenFieldSources, collectFieldSources(sharedOutput));
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

    private File createDictionary(String name, boolean withExtraEnum) throws Exception {
        File dictionary = tempFolder.newFile("RaceCondition-" + name + ".xml");
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<fix major=\"4\" minor=\"4\">\n");
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
