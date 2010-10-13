/*
 * Copyright 2005 The Codehaus.
 * Copyright 2010 Claudio Bantaloukas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.quickfixj.codegenerator;

import java.io.File;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;


/**
 * A mojo that uses the quickfix code generator to generate a collection of javabeans from a QuickFIX Dictionary.
 * 
 * @goal generate
 * @phase generate-sources
 * @description QuickFIX/J code generation plugin
 * @author Claudio Bantaloukas <rockdreamer@gmail.com>
 */
public class GenerateMojo
    extends AbstractMojo
{

    /**
     * The dictionary file to use for mapping messages to java.
     * 
     * @parameter expression="${basedir}/src/main/quickfixj/dictionary/FIX44.xml"
     */
    private File dictFile;

	/**
     * The source directory containing *.xsd files
     * 
     * @parameter expression="${basedir}/src/resources/quickfixj/codegenerator"
     */
    private File schemaDirectory;

	/**
     * The directory to output the generated sources to
     * 
     * @parameter expression="${project.build.directory}/generated-sources/"
     */
    private File outputDirectory;

    /**
     * Enable BigDecimal representation
     * 
     * @parameter default-value="false"
     */
    private boolean decimal = false;

    /**
     * Enable orderedFields
     * 
     * @parameter default-value="false"
     */
    private boolean orderedFields = false;

    /**
     * The package for the generated source
     * 
     * @parameter
     */
    private String packaging;

    /**
     * The base field class to use
     * 
     * @parameter default-value = "quickfix.field"
     */
    private String fieldPackage= "quickfix.field";

    
    /**
     * The Maven project to act upon.
     * 
     * @parameter expression="${project}"
     * @required
     */
    private MavenProject project;

    /**
     * {@link QuickFixSourceGenerator} instance used for code generation.
     * 
     */
    private MessageCodeGenerator sgen;

    /**
     * {@inheritDoc}
     * 
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute()
        throws MojoExecutionException
    {
        if ( !outputDirectory.exists() )
        {
            FileUtils.mkdir( outputDirectory.getAbsolutePath() );
        }

        try {
            sgen = new MessageCodeGenerator( );
            if ( getLog().isInfoEnabled() )
            {
                getLog().info( "Successfully created an instance of the QuickFIX source generator" );
            }
            sgen.setLog( getLog() );

            MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
            if ( getLog().isInfoEnabled() )
            {
                getLog().info( "Initialising code generator task" );
            }

            if ( dictFile != null && dictFile.exists() )
            {
            	task.setSpecification(dictFile);
            } else {
            	getLog().error( "Cannot find file " + dictFile );
            }
            log( "Processing " + dictFile );
            task.setName(dictFile.getName());
            task.setTransformDirectory(schemaDirectory);
            task.setMessagePackage(packaging);
            task.setOutputBaseDirectory(outputDirectory);
            task.setFieldPackage(fieldPackage);
            task.setOverwrite(true);
            task.setOrderedFields(orderedFields);
            task.setDecimalGenerated(decimal);
            sgen.generate(task);

            // exec task
        }
        catch ( Exception e )
        {
            throw new MojoExecutionException( "QuickFIX code generator execution failed", e );
        }
        catch ( Throwable t )
        {
            throw new MojoExecutionException( "QuickFIX code generator execution failed", t );
        }

        if ( project != null )
        {
            project.addCompileSourceRoot( outputDirectory.getAbsolutePath() );
        }

    }

    /**
     * Logs a message to the logger.
     * 
     * @param msg The message ot be logged.
     */
    private void log( final String msg )
    {
        getLog().info( msg );
    }

    /**
     * Returns the destination directory to used during code generation.
     * 
     * @return the destination directory to used during code generation.
     */
    public File getOutputDirectory()
    {
        return outputDirectory;
    }

    /**
     * Sets the destination directory to used during code generation.
     * 
     * @param dest the destination directory to used during code generation.
     */
    public void setOutputDirectory( final File outputDirectory )
    {
        this.outputDirectory = outputDirectory;
    }


    /**
     * Returns the default package to be used during code generation.
     * 
     * @return the default package to be used during code generation.
     */
    public String getPackaging()
    {
        return packaging;
    }

    /**
     * Sets the default package to be used during code generation.
     * 
     * @param packaging the default package to be used during code generation.
     */
    public void setPackaging( final String packaging )
    {
        this.packaging = packaging;
    }

     /**
     * Returns the {@link MavenProject} instance for which code generation should be executed.
     * 
     * @return the {@link MavenProject} instance for which code generation should be executed.
     */
    public MavenProject getProject()
    {
        return project;
    }

    /**
     * Sets the {@link MavenProject} instance for which code generation should be executed.
     * 
     * @param project the {@link MavenProject} instance for which code generation should be executed.
     */
    public void setProject( MavenProject project )
    {
        this.project = project;
    }
    
    /**
     * Returns the dictionary file for which code generation should be executed.
     * 
     * @return the dictionary file  for which code generation should be executed.
     */
    public File getDictFile() {
		return dictFile;
	}

    /**
     * Sets the dictionary file for which code generation should be executed.
     * 
     * @param dictFile the dictionary file for which code generation should be executed.
     */
	public void setDictFile(File dictFile) {
		this.dictFile = dictFile;
	}
	
    /**
     * Returns the directory containing schemas for code generation
     * 
     * @return the directory containing schemas for code generation
     */
   public File getSchemaDirectory() {
		return schemaDirectory;
	}

   /**
    * Sets the dictionary file for which code generation should be executed.
    * 
    * @param dictFile the dictionary file for which code generation should be executed.
    */
	public void setSchemaDirectory(File schemaDirectory) {
		this.schemaDirectory = schemaDirectory;
	}
}
