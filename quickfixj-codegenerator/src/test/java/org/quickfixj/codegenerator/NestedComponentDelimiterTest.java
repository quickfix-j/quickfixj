package org.quickfixj.codegenerator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.maven.plugin.MojoExecutionException;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.io.FileUtils;

/**
 * Test for nested component delimiter generation (issue #1084).
 * Verifies that when a group's first element is a component whose first element 
 * is another component (nested > 1), the correct delimiter field number is used.
 */
public class NestedComponentDelimiterTest {

    private File outputDirectory = new File("./target/test-output/nested-components");
    private File dictDirectory = new File("./src/test/resources/org/quickfixj/codegenerator");
    private File schemaDirectory = new File("./src/main/resources/org/quickfixj/codegenerator");
    private String fieldPackage = "quickfix.field";
    private String utcTimestampPrecision = null;
    private boolean orderedFields = true;
    private boolean decimal = true;
    private MessageCodeGenerator generator;

    @Before
    public void setup() throws IOException {
        if (outputDirectory.exists()) {
            FileUtils.cleanDirectory(outputDirectory);
        } else {
            outputDirectory.mkdirs();
        }
        generator = new MessageCodeGenerator();
        System.out.println("Successfully created an instance of the QuickFIX source generator");
    }

    @Test
    public void testNestedComponentDelimiterGeneration() throws MojoExecutionException {
        MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
        System.out.println("Initialising code generator task for nested components test");

        String packaging = "quickfix.test";
        File dictFile = new File(dictDirectory, "NestedComponentsTest.xml");
        generate(generator, task, dictFile, packaging, true);

        // Check that NestedTwice component was generated
        String nestedTwiceFilePath = outputDirectory.getAbsolutePath() + 
            "/quickfix/test/component/NestedTwice.java";
        File nestedTwiceFile = new File(nestedTwiceFilePath);
        assertTrue("NestedTwice.java should be generated", nestedTwiceFile.exists());

        // Read the file and check for the correct delimiter
        String content = readFileContent(nestedTwiceFile);
        
        // The NoEntries group should have the correct delimiter (58 = Text field number)
        // Expected: super(20001, 58, ORDER);
        assertTrue("Generated code should contain 'super(20001, 58, ORDER);'",
            content.contains("super(20001, 58, ORDER);"));
        
        // Verify structural elements are present
        assertTrue("Generated code should contain NoEntries class",
            content.contains("public static class NoEntries extends Group"));
        
        assertTrue("Generated code should contain ORDER array",
            content.contains("private static final int[] ORDER"));
    }

    private void generate(MessageCodeGenerator generator, MessageCodeGenerator.Task task,
            File dictfile, String packaging, boolean overwrite) throws MojoExecutionException {
        if (dictfile != null && dictfile.exists()) {
            task.setSpecification(dictfile);
        } else {
            throw new MojoExecutionException("File could not be found or was NULL!");
        }

        System.out.println("Processing " + dictfile);

        task.setName(dictfile.getName());
        task.setTransformDirectory(schemaDirectory);
        task.setMessagePackage(packaging);
        task.setOutputBaseDirectory(outputDirectory);
        task.setFieldPackage(fieldPackage);
        task.setUtcTimestampPrecision(utcTimestampPrecision);
        task.setOverwrite(overwrite);
        task.setOrderedFields(orderedFields);
        task.setDecimalGenerated(decimal);
        generator.generate(task);
    }

    private String readFileContent(File file) {
        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail("Failed to read file: " + file.getAbsolutePath());
        }
        return content.toString();
    }
}
