package org.quickfixj.codegenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * Golden-file regression test for the code generator.
 *
 * <p>The test runs {@link MessageCodeGenerator} against the real FIX42 and FIX44 dictionaries
 * and compares every generated {@code .java} file byte-for-byte against the committed golden
 * files stored in {@code src/test/resources/golden/fix42} and
 * {@code src/test/resources/golden/fix44}.
 *
 * <p>FIX42 is used because it contains repeating groups (38 of them), while still being
 * smaller than FIX44. FIX44 is used because it contains 233 groups, including nested ones
 * (relevant to issue #1084).
 *
 * <p>If the generator output must intentionally change, regenerate the golden files by running
 * the {@code GenerateGoldenFiles} utility in the {@code src/test/java} tree and committing the
 * updated golden files together with the generator changes.
 */
public class GoldenFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File schemaDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");
    private File goldenBase = new File("./src/test/resources/golden");

    private File fix42DictFile = new File(
            "../quickfixj-messages/quickfixj-messages-fix42/src/main/resources/FIX42.xml");
    private File fix44DictFile = new File(
            "../quickfixj-messages/quickfixj-messages-fix44/src/main/resources/FIX44.xml");

    private MessageCodeGenerator generator;

    @Before
    public void setup() {
        generator = new MessageCodeGenerator();
    }

    // -------------------------------------------------------------------------
    // FIX42 – has fields, messages, and repeating groups (no components)
    // -------------------------------------------------------------------------

    @Test
    public void testFix42GenerationMatchesGolden() throws Exception {
        File outputDir = tempFolder.newFolder("fix42");
        generateCode(fix42DictFile, "FIX42", "quickfix.fix42", outputDir);
        assertMatchesGolden(new File(goldenBase, "fix42"), outputDir, "FIX42");
    }

    // -------------------------------------------------------------------------
    // FIX44 – has fields, messages, components, and 233 groups (incl. nested)
    // -------------------------------------------------------------------------

    @Test
    public void testFix44GenerationMatchesGolden() throws Exception {
        File outputDir = tempFolder.newFolder("fix44");
        generateCode(fix44DictFile, "FIX44", "quickfix.fix44", outputDir);
        assertMatchesGolden(new File(goldenBase, "fix44"), outputDir, "FIX44");
    }

    // -------------------------------------------------------------------------
    // Helpers
    // -------------------------------------------------------------------------

    private void generateCode(File dictFile, String name, String messagePackage, File outputDir)
            throws Exception {
        MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
        task.setName(name);
        task.setSpecification(dictFile);
        task.setTransformDirectory(schemaDirectory);
        task.setMessagePackage(messagePackage);
        task.setOutputBaseDirectory(outputDir);
        task.setFieldPackage("quickfix.field");
        task.setOverwrite(true);
        task.setOrderedFields(true);
        task.setDecimalGenerated(true);
        generator.generate(task);
    }

    /**
     * Recursively walks the golden directory and verifies that each {@code .java} file has an
     * identical counterpart in the generated output directory.  Also checks that no extra files
     * were generated that are absent from the golden directory.
     */
    private void assertMatchesGolden(File goldenDir, File generatedDir, String label)
            throws IOException {
        List<String> errors = new ArrayList<>();

        // Collect relative paths of all .java files in the golden directory
        List<String> goldenRelPaths = collectJavaPaths(goldenDir.toPath());

        // Collect relative paths of all .java files in the generated output directory
        List<String> generatedRelPaths = collectJavaPaths(generatedDir.toPath());

        // Files present in golden but missing from generated output
        List<String> missingFromGenerated = new ArrayList<>(goldenRelPaths);
        missingFromGenerated.removeAll(generatedRelPaths);
        for (String missing : missingFromGenerated) {
            errors.add("[" + label + "] Missing generated file: " + missing);
        }

        // Extra files in generated output that are not in golden
        List<String> extraInGenerated = new ArrayList<>(generatedRelPaths);
        extraInGenerated.removeAll(goldenRelPaths);
        for (String extra : extraInGenerated) {
            errors.add("[" + label + "] Unexpected generated file (not in golden): " + extra);
        }

        // Compare content of files present in both
        for (String relPath : goldenRelPaths) {
            if (!generatedRelPaths.contains(relPath)) {
                continue; // already reported as missing above
            }
            File goldenFile = new File(goldenDir, relPath);
            File generatedFile = new File(generatedDir, relPath);
            compareFileContent(goldenFile, generatedFile, relPath, label, errors);
        }

        if (!errors.isEmpty()) {
            fail(errors.size() + " golden file assertion(s) failed:\n"
                    + String.join("\n", errors));
        }
    }

    private List<String> collectJavaPaths(Path root) throws IOException {
        if (!root.toFile().exists()) {
            return new ArrayList<>();
        }
        try (Stream<Path> stream = Files.walk(root)) {
            return stream
                    .filter(p -> p.toString().endsWith(".java"))
                    .map(p -> root.relativize(p).toString())
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    private void compareFileContent(File goldenFile, File generatedFile, String relPath,
            String label, List<String> errors) throws IOException {
        List<String> goldenLines = Files.readAllLines(goldenFile.toPath());
        List<String> generatedLines = Files.readAllLines(generatedFile.toPath());

        int maxLines = Math.max(goldenLines.size(), generatedLines.size());
        for (int i = 0; i < maxLines; i++) {
            String goldenLine = i < goldenLines.size() ? goldenLines.get(i) : "<EOF>";
            String generatedLine = i < generatedLines.size() ? generatedLines.get(i) : "<EOF>";
            if (!goldenLine.equals(generatedLine)) {
                errors.add(String.format(
                        "[%s] %s line %d differs:%n  golden:    %s%n  generated: %s",
                        label, relPath, i + 1, goldenLine, generatedLine));
                // Report only the first differing line per file to keep output manageable
                break;
            }
        }
        if (goldenLines.size() != generatedLines.size() && errors.isEmpty()) {
            // Line counts differ but all shared lines matched – report the length mismatch
            errors.add(String.format(
                    "[%s] %s line count differs: golden=%d, generated=%d",
                    label, relPath, goldenLines.size(), generatedLines.size()));
        }
    }
}
