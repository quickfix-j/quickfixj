package org.quickfixj;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.plugin.testing.MojoRule;
import org.apache.maven.plugin.testing.WithoutMojo;
import org.apache.maven.shared.model.fileset.FileSet;
import org.junit.Rule;
import org.junit.Test;

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
    public void testPrune()
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

        File generatedSourcesDirectory = ( File ) rule.getVariableValueFromObject( myMojo, "generatedSourcesDirectory" );
        assertNotNull( generatedSourcesDirectory );
        assertTrue( generatedSourcesDirectory.exists() );
        myMojo.getLog().info("generatedSourcesDirectory : " + generatedSourcesDirectory.getAbsolutePath() );
        
        Object variableValueFromObject = rule.getVariableValueFromObject( myMojo, "fileset" );
        FileSet dictionaryFileSet = ( FileSet ) variableValueFromObject;
        assertNotNull( dictionaryFileSet );

        // The following are based on static test files in the project to test
        List<String> someFieldNamesThatShouldStillExist = new ArrayList<>(Arrays.asList("WaveNo", "ValidUntilTime", "Account"));
        List<String> someFieldNamesThatShouldNoLongerExist = 
                new ArrayList<>(Arrays.asList("ValuationBusinessCenter",
                                              "ValuationDate",
                                              "ValuationMethod",
                                              "ValuationReferenceModel",
                                              "ValuationSource",
                                              "ValuationTime",
                                              "ValueCheckAction",
                                              "ValueCheckType",
                                              "ValueOfFutures",
                                              "VegaMultiplier",
                                              "VenueType",
                                              "VerificationMethod",
                                              "VersusPurchaseDate",
                                              "VersusPurchasePrice",
                                              "Volatility",
                                              "VoluntaryRegulatoryReport",
                                              "WarningText",
                                              "WireReference",
                                              "WorkingIndicator",
                                              "WtAverageLiquidity",
                                              "Yield",
                                              "YieldCalcDate",
                                              "YieldRedemptionDate",
                                              "YieldRedemptionPrice",
                                              "YieldRedemptionPriceType",
                                              "YieldType"));
        List<String> xmlFileNamesThatShouldStillExist = new ArrayList<>(Arrays.asList("FIX40.xml", "FIX41.xml", "FIX50SP2.modified.xml", "FIXT11.xml"));
        
        for (String fieldName : someFieldNamesThatShouldStillExist) {
            File source = new File( generatedSourcesDirectory, fieldName.concat(".java") );
            assertTrue( source.exists() );
            File clazz = new File( classesDirectory, fieldName.concat(".class") );
            assertTrue( clazz.exists() );
        }
        
        for (String fileName : xmlFileNamesThatShouldStillExist) {
            File file = new File( classesDirectory, fileName );
            assertTrue( file.exists() );
        }
        
        for (String fieldName : someFieldNamesThatShouldNoLongerExist) {
            File source = new File( generatedSourcesDirectory, fieldName.concat(".java") );
            assertFalse( source.exists() );
            File clazz = new File( classesDirectory, fieldName.concat(".class") );
            assertFalse( clazz.exists() );
        }
        
        int numberOfFieldsFromTheCombinedDictionaries = 209;
        assertEquals(classesDirectory.list().length, numberOfFieldsFromTheCombinedDictionaries + 4); // plus 4 for the dictionary files that are not deleted
        assertEquals(generatedSourcesDirectory.list().length, numberOfFieldsFromTheCombinedDictionaries);
    }

    /* Do not need the MojoRule.
    @WithoutMojo
    @Test
    public void testSomethingWhichDoesNotNeedTheMojoAndProbablyShouldBeExtractedIntoANewClassOfItsOwn()
    {
        assertTrue( true );
    }  */

}

