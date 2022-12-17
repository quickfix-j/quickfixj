package org.quickfixj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CodeGeneratorMojoTest {
	
	private static final String FIELD = "field";
	private static final String QUICKFIX = "quickfix";
	private File testTextFile;
	private File testOrchestration;
	private File notPreviouslyExistantOutputDirectory;
	private String buildDirectoryName;
	
	@Before 
	public void before() throws IOException{
        this.buildDirectoryName = System.getProperty("buildDirectory");
        // generated-sources
        String testFileName = this.buildDirectoryName + "/aTestFile.txt";
        String testOrchestrationName = this.buildDirectoryName + "/test-classes/project-to-test/resources/trade-latest.xml";
        this.testTextFile = new File(testFileName);
        this.testOrchestration = new File(testOrchestrationName);
        this.testTextFile.createNewFile();
        this.testOrchestration.createNewFile();
        this.notPreviouslyExistantOutputDirectory = new File(buildDirectoryName + "/generated-sources");
	}
	
	@After 
	public void after() throws IOException{
		if (this.testTextFile.exists()) {
			this.testTextFile.delete();
		}
		if (this.notPreviouslyExistantOutputDirectory.exists()) {
			this.notPreviouslyExistantOutputDirectory.delete();
		}
	}
	
	@Rule
	public MojoRule rule = new MojoRule() {
		@Override
		protected void before() throws Throwable {
		}

		@Override
		protected void after() {
		}
	};

	@WithoutMojo
	@Test (expected = MojoExecutionException.class)
	public void orchestrationFileDoesNotExist() throws MojoExecutionException {
		CodeGeneratorMojo codeGeneratorMojo = new CodeGeneratorMojo();
		codeGeneratorMojo.orchestration = new File("notlikely/nope");
		codeGeneratorMojo.execute();
	}

	@WithoutMojo
	@Test (expected = MojoExecutionException.class)
	public void outputDirIsNotDirectory() throws MojoExecutionException, IOException {
		CodeGeneratorMojo codeGeneratorMojo = new CodeGeneratorMojo();
		codeGeneratorMojo.orchestration = this.testOrchestration;
		codeGeneratorMojo.outputDirectory = this.testTextFile;
		codeGeneratorMojo.execute();
	}
	
	@WithoutMojo
	@Test
	public void outputDirDoesNotExistSoGetsCreated() throws MojoExecutionException {
		CodeGeneratorMojo codeGeneratorMojo = new CodeGeneratorMojo();
		codeGeneratorMojo.orchestration = this.testOrchestration;
		codeGeneratorMojo.outputDirectory = this.notPreviouslyExistantOutputDirectory;
		codeGeneratorMojo.execute();
		assertTrue(this.notPreviouslyExistantOutputDirectory.exists());
	}

	@Test
	public void testCodeGen() throws Exception {
        File pom = new File( "target/test-classes/project-to-test/" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        CodeGeneratorMojo generatorMojo = ( CodeGeneratorMojo ) rule.lookupConfiguredMojo( pom, "codeGeneration" );
        assertNotNull( generatorMojo );

        generatorMojo.execute();        

        File orchestration = ( File ) rule.getVariableValueFromObject( generatorMojo, "orchestration" );
        assertNotNull( orchestration );
        assertTrue( orchestration.exists() );
        generatorMojo.getLog().info("outputDirectory : " + orchestration.getAbsolutePath() );

        File outputDirectory = ( File ) rule.getVariableValueFromObject( generatorMojo, "outputDirectory" );
        assertNotNull( outputDirectory );
        assertTrue( outputDirectory.exists() );
        generatorMojo.getLog().info("outputDirectory : " + outputDirectory.getAbsolutePath() );
        
        //simple checks to ensure the code generation has run
        String outputDirName = this.buildDirectoryName + "/test-classes/project-to-test/target/generated-sources";
        File outputDir = new File(outputDirName);
        assertTrue(outputDir.exists());
		Set<String> names = new HashSet<String>(Arrays.asList(outputDir.list()));
		assertTrue(names.contains(QUICKFIX));
		File quickfix = new File(outputDirName+"/"+QUICKFIX);
		names = new HashSet<String>(Arrays.asList(quickfix.list()));
		assertTrue(names.contains(FIELD));
		assertTrue(names.contains("fixlatest"));
		File fields = new File(outputDirName+"/"+QUICKFIX+"/"+FIELD);
		assertEquals(4533, fields.list().length);
	}
}

