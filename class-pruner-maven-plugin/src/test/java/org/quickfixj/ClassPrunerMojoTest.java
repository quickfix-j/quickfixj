package org.quickfixj;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;
import org.apache.maven.shared.model.fileset.FileSet;
import org.junit.Rule;
import org.junit.Test;
import org.quickfixj.ClassPrunerMojo;

public class ClassPrunerMojoTest
{
	
    @Rule
    public MojoRule rule = new MojoRule()
    {
        @Override
        protected void before() throws Throwable 
        {
        }

        @Override
        protected void after()
        {
        }
    };

    /**
     * @throws Exception if any
     */
    @Test
    public void testSomething()
            throws Exception
    {
        File pom = new File( "target/test-classes/project-to-test/" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        ClassPrunerMojo myMojo = ( ClassPrunerMojo ) rule.lookupConfiguredMojo( pom, "prune" );
        assertNotNull( myMojo );

        myMojo.execute();        
        
        File classesDirectory = ( File ) rule.getVariableValueFromObject( myMojo, "classesDirectory" );
        assertNotNull( classesDirectory );
        assertTrue( classesDirectory.exists() );
        myMojo.getLog().info("classesDirectory : " + classesDirectory.getAbsolutePath() );

        Object variableValueFromObject = rule.getVariableValueFromObject( myMojo, "fileset" );
        FileSet dictionaryFileSet = ( FileSet ) variableValueFromObject;
        assertNotNull( dictionaryFileSet );

    }

    /** Do not need the MojoRule. */
    @WithoutMojo
    @Test
    public void testSomethingWhichDoesNotNeedTheMojoAndProbablyShouldBeExtractedIntoANewClassOfItsOwn()
    {
        assertTrue( true );
    }

}

