package quickfix;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
import org.quickfixj.orchestra.CodeGeneratorJ;

/**
 * Golden-file regression test for the orchestra-based code generator.
 *
 * <p>The test runs {@link CodeGeneratorJ} against the committed minimised
 * {@code OrchestraFIXLatest.min.xml} test fixture and compares every generated
 * {@code .java} file byte-for-byte against the committed golden files stored in
 * {@code src/test/resources/golden/fixlatest}.
 *
 * <p>The test fixture is the minimised orchestra file produced by applying
 * {@code quickfixj-messages-all/src/main/xsl/minimiseOrchestra.xsl} to the
 * {@code OrchestraFIXLatest.xml} from the {@code io.fixprotocol.orchestrations:fix-standard}
 * artifact at the version declared in the parent POM.
 *
 * <p>If the generator output must intentionally change, regenerate the golden files by
 * running the orchestra code generator directly against the same XML fixture and committing
 * the updated golden files together with the generator changes. See
 * {@code quickfixj-codegenerator/src/test/resources/golden/README.md} for the general
 * golden-file workflow; the same approach applies here.
 */
public class OrchestraGoldenFileTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File goldenDir;

    @Before
    public void setup() throws Exception {
        goldenDir = new File(
                OrchestraGoldenFileTest.class.getResource("/golden/fixlatest").toURI());
    }

    @Test
    public void testFIXLatestGenerationMatchesGolden() throws Exception {
        File outputDir = tempFolder.newFolder("fixlatest");

        try (InputStream orchestraXml = OrchestraGoldenFileTest.class
                .getResourceAsStream("/OrchestraFIXLatest.min.xml")) {
            if (orchestraXml == null) {
                fail("Test resource OrchestraFIXLatest.min.xml not found on classpath");
            }
            CodeGeneratorJ generator = new CodeGeneratorJ();
            generator.setGenerateFixt11Package(false);
            generator.setExcludeSession(true);
            generator.generate(orchestraXml, outputDir);
        }

        assertMatchesGolden(goldenDir, outputDir, "FIXLatest");
    }

    // -------------------------------------------------------------------------
    // Helpers (mirrors GoldenFileTest in quickfixj-codegenerator)
    // -------------------------------------------------------------------------

    private void assertMatchesGolden(File golden, File generated, String label)
            throws IOException {
        List<String> errors = new ArrayList<>();

        List<String> goldenPaths    = collectJavaPaths(golden.toPath());
        List<String> generatedPaths = collectJavaPaths(generated.toPath());

        List<String> missing = new ArrayList<>(goldenPaths);
        missing.removeAll(generatedPaths);
        for (String p : missing) {
            errors.add("[" + label + "] Missing generated file: " + p);
        }

        List<String> extra = new ArrayList<>(generatedPaths);
        extra.removeAll(goldenPaths);
        for (String p : extra) {
            errors.add("[" + label + "] Unexpected generated file (not in golden): " + p);
        }

        for (String relPath : goldenPaths) {
            if (!generatedPaths.contains(relPath)) {
                continue;
            }
            compareFileContent(
                    new File(golden,    relPath),
                    new File(generated, relPath),
                    relPath, label, errors);
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
        List<String> goldenLines    = Files.readAllLines(goldenFile.toPath());
        List<String> generatedLines = Files.readAllLines(generatedFile.toPath());

        int maxLines = Math.max(goldenLines.size(), generatedLines.size());
        for (int i = 0; i < maxLines; i++) {
            String gLine = i < goldenLines.size()    ? goldenLines.get(i)    : "<EOF>";
            String aLine = i < generatedLines.size() ? generatedLines.get(i) : "<EOF>";
            if (!gLine.equals(aLine)) {
                errors.add(String.format(
                        "[%s] %s line %d differs:%n  golden:    %s%n  generated: %s",
                        label, relPath, i + 1, gLine, aLine));
                break; // report only first differing line per file
            }
        }
        if (goldenLines.size() != generatedLines.size() && errors.isEmpty()) {
            errors.add(String.format(
                    "[%s] %s line count differs: golden=%d, generated=%d",
                    label, relPath, goldenLines.size(), generatedLines.size()));
        }
    }
}
