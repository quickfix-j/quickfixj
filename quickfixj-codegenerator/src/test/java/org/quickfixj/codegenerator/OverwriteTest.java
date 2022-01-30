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

public class OverwriteTest  {

    private File outputDirectory = new File ("./target/test-output/");
    private File dictDirectory = new File ("./src/test/resources");
    private File schemaDirectory = new File ("./src/main/resources/org/quickfixj/codegenerator");
    private String fieldPackage = "quickfix.field";
    private String utcTimestampPrecision = null;
	private boolean orderedFields = true;
	private boolean decimal = true;
	private MessageCodeGenerator generator;

	@Before
	public void setup() throws IOException {
		if (outputDirectory.exists()){
			FileUtils.cleanDirectory(outputDirectory); 
		} else {
			outputDirectory.mkdirs();
		}
    	generator = new MessageCodeGenerator();
        System.out.println("Successfully created an instance of the QuickFIX source generator");
	}
	
    @Test
	public void testFieldOverwrittenWhenOverwriteTrue() {
            
		boolean overwrite = true;
        
		MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
    	System.out.println("Initialising code generator task");

        try {
            String packaging = "quickfix.fix41";
        	File fix41Dictfile = new File( dictDirectory, "FIX41.xml" );
           	generate(generator, task, fix41Dictfile, packaging, overwrite);
 
            packaging = "quickfix.fix42"; // this does not affect this test
        	File fix42Dictfile = new File( dictDirectory, "FIX42.xml" );
            generate(generator, task, fix42Dictfile, packaging, overwrite);
		} catch (MojoExecutionException e) {
			e.printStackTrace();
			fail();
		}
		
        String expectedFilePath = outputDirectory.getAbsolutePath() + "/quickfix/field/AllocShares.java";
        File file = new File(expectedFilePath);
		assertTrue(file.exists());
		
        boolean isAllocSharesDecimal = isAllocSharesDecimal(file);
        assertTrue(isAllocSharesDecimal);
    }

    @Test
	public void testFieldNotOverwrittenWhenOverwriteFalse() {            
    	
    	boolean overwrite = false;
        
    	MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
    	System.out.println("Initialising code generator task");

        try {
            String packaging = "quickfix.fix41";
        	File fix41Dictfile = new File( dictDirectory, "FIX41.xml" );
           	generate(generator, task, fix41Dictfile, packaging, overwrite);
 
            packaging = "quickfix.fix42"; // this does not affect this test
        	File fix42Dictfile = new File( dictDirectory, "FIX42.xml" );
            generate(generator, task, fix42Dictfile, packaging, overwrite);
		} catch (MojoExecutionException e) {
			e.printStackTrace();
			fail();
		}
		
        String expectedFilePath = outputDirectory.getAbsolutePath() + "/quickfix/field/AllocShares.java";
        File file = new File(expectedFilePath);
		assertTrue(file.exists());
        
        boolean isAllocSharesDecimal = isAllocSharesDecimal(file);
        assertFalse(isAllocSharesDecimal);
    }
    
	private void generate(MessageCodeGenerator generator, MessageCodeGenerator.Task task, File dictfile,
			String packaging, boolean overwrite) throws MojoExecutionException {
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

	private boolean isAllocSharesDecimal(File file) {
		boolean isAllocSharesDecimal = false;
		try (Scanner scanner = new Scanner(file)) {
            //now read the file line by line...
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains("AllocShares extends DecimalField")) { 
                	isAllocSharesDecimal = true;
                    break;
                }
            }
        } catch(FileNotFoundException e) { 
			e.printStackTrace();
			fail();
        }
		return isAllocSharesDecimal;
	}
	
}
