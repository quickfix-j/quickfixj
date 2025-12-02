package org.quickfixj.codegenerator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * Verifies that the code generator sets the correct group delimiter when the
 * first element of a repeating group is a component that nests other components
 * before the first concrete field appears.
 *
 * This covers the regression fixed in PR #1089 where the XSL must recurse into
 * deeply nested components to locate the actual first field (delimiter).
 */
public class NestedGroupDelimiterTest {

    private final File outputDirectory = new File("./target/test-output/");
    private final File dictFile = new File("./src/test/resources/NESTED_FIX.xml");
    private final File schemaDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");

    @Before
    public void setup() throws IOException {
        if (outputDirectory.exists()) {
            FileUtils.cleanDirectory(outputDirectory);
        } else {
            outputDirectory.mkdirs();
        }
    }

    @Test
    public void generatesGroupWithDeeplyNestedDelimiter() throws Exception {
        MessageCodeGenerator generator = new MessageCodeGenerator();
        MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();

        task.setSpecification(dictFile);
        task.setName(dictFile.getName());
        task.setTransformDirectory(schemaDirectory);
        task.setMessagePackage("quickfix.fixZZ");
        task.setOutputBaseDirectory(outputDirectory);
        task.setFieldPackage("quickfix.field");
        task.setUtcTimestampPrecision(null);
        task.setOverwrite(true);
        task.setOrderedFields(true);
        task.setDecimalGenerated(true);

        try {
            generator.generate(task);
        } catch (CodeGenerationException e) {
            // Surface with context for easier debugging in CI
            throw new AssertionError("Code generation failed: " + e.getMessage(), e);
        }

        // Read the generated message class and assert the group constructor uses FieldA (1001) as delimiter
        File generated = new File(outputDirectory, "quickfix/fixZZ/NestedGroupTest.java");
        assertTrue("Expected generated message class not found: " + generated.getAbsolutePath(), generated.exists());

        String java = FileUtils.readFileToString(generated, StandardCharsets.UTF_8);

        // The group name is NoOuterGrp with counter tag 1000. The delimiter should be FieldA (1001),
        // which is the first field reachable by recursing into components (InnerComponent -> DeepComponent -> FieldA)
        // The generated constructor should therefore look like: super(1000, 1001, ORDER)
        assertTrue(
            "Group constructor should use 1001 as delimiter for NoOuterGrp (deeply nested first field)",
            java.contains("public static class NoOuterGrp") &&
            java.contains("super(1000, 1001, ORDER)")
        );
    }
}
