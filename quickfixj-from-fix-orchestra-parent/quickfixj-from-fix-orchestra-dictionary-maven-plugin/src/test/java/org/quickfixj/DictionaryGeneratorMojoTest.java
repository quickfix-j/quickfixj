package org.quickfixj;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class DictionaryGeneratorMojoTest {

	private static String GENERATED_FILE_NAME = "FIXLatest.xml";
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
        this.notPreviouslyExistantOutputDirectory = new File(buildDirectoryName + "/generated-resources");
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
		DictionaryGeneratorMojo generatorMojo = new DictionaryGeneratorMojo();
		generatorMojo.orchestration = new File("notlikely/nope");
		generatorMojo.execute();
	}

	@WithoutMojo
	@Test (expected = MojoExecutionException.class)
	public void outputDirIsNotDirectory() throws MojoExecutionException, IOException {
		DictionaryGeneratorMojo generatorMojo = new DictionaryGeneratorMojo();
		generatorMojo.orchestration = this.testOrchestration;
		generatorMojo.outputDirectory = this.testTextFile;
		generatorMojo.execute();
	}
	
	@WithoutMojo
	@Test
	public void outputDirDoesNotExistSoGetsCreated() throws MojoExecutionException {
		DictionaryGeneratorMojo generatorMojo = new DictionaryGeneratorMojo();
		generatorMojo.orchestration = this.testOrchestration;
		generatorMojo.outputDirectory = this.notPreviouslyExistantOutputDirectory;
		generatorMojo.execute();
		assertTrue(this.notPreviouslyExistantOutputDirectory.exists());
	}

	@Test
	public void testCodeGen() throws Exception {
        File pom = new File( "target/test-classes/project-to-test/" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        DictionaryGeneratorMojo generatorMojo = ( DictionaryGeneratorMojo ) rule.lookupConfiguredMojo( pom, "dictionaryGeneration" );
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
        String outputDirName = this.buildDirectoryName + "/test-classes/project-to-test/target/generated-resources";
        File generatedFileName = new File(outputDirName + "/" + GENERATED_FILE_NAME);
        assertTrue(generatedFileName.exists());
        assertTrue(generatedFileName.length() > 0);
	}


}

