/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package org.quickfixj.codegenerator;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;

/**
 * A mojo that uses the quickfix code generator to generate
 * Java source files from a QuickFIX Dictionary.
 *
 * @goal generate
 * @phase generate-sources
 * @description QuickFIX/J code generation plugin
 * @author Claudio Bantaloukas <rockdreamer@gmail.com>
 */
public class GenerateMojo extends AbstractMojo {

    /**
     * The dictionary file to use for mapping messages to java.
     *
     * @parameter expression="${basedir}/src/main/quickfixj/dictionary/FIX44.xml"
     */
    private File dictFile;

    /**
     * The source directory containing *.xsd files.
     *
     * @parameter expression="${basedir}/src/resources/quickfixj/codegenerator"
     */
    private File schemaDirectory;

    /**
     * The directory to output the generated sources to.
     *
     * @parameter expression="${project.build.directory}/generated-sources/"
     */
    private File outputDirectory;

    /**
     * Enable BigDecimal representation.
     *
     * @parameter default-value="false"
     */
    private boolean decimal;

    /**
     * Enable orderedFields.
     *
     * @parameter default-value="false"
     */
    private boolean orderedFields;

    /**
     * The package for the generated source.
     *
     * @parameter
     */
    private String packaging;

    /**
     * The base field class to use.
     *
     * @parameter default-value = "quickfix.field"
     */
    private String fieldPackage = "quickfix.field";

    /**
     * The default UtcTimestampPrecision to be used during field code generation.
     *
     * @parameter
     */
    private String utcTimestampPrecision;

    /**
     * Defines whether the code generator should overwrite existing files with the same name
     *
     * @parameter default-value = "true"
     */
    private boolean overwrite = true;
    
    /**
     * The Maven project to act upon.
     *
     * @parameter expression="${project}"
     * @required
     */
    private MavenProject project;

    /**
     * {@link MessageCodeGenerator} instance used for code generation.
     */
    private MavenMessageCodeGenerator generator;

    /**
     * {@inheritDoc}
     *
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute() throws MojoExecutionException {

        if (!outputDirectory.exists()) {
            FileUtils.mkdir(outputDirectory.getAbsolutePath());
        }

        try {
            generator = new MavenMessageCodeGenerator();
            if (getLog().isInfoEnabled()) {
                getLog().info("Successfully created an instance of the QuickFIX source generator");
            }
            generator.setLog(getLog());

            MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
            if (getLog().isInfoEnabled()) {
                getLog().info("Initialising code generator task");
            }

            if (dictFile != null && dictFile.exists()) {
                task.setSpecification(dictFile);
            } else {
                getLog().error("Cannot find file " + dictFile);
                throw new MojoExecutionException("File could not be found or was NULL!");
            }

            log("Processing " + dictFile);
            task.setName(dictFile.getName());
            task.setTransformDirectory(schemaDirectory);
            task.setMessagePackage(packaging);
            task.setOutputBaseDirectory(outputDirectory);
            task.setFieldPackage(fieldPackage);
            task.setUtcTimestampPrecision(utcTimestampPrecision);
            task.setOverwrite(overwrite);
            task.setOrderedFields(orderedFields);
            task.setDecimalGenerated(decimal);
            generator.generate(task);
        } catch (Throwable t) {
            throw new MojoExecutionException("QuickFIX code generator execution failed", t);
        }

        if (project != null) {
            project.addCompileSourceRoot(outputDirectory.getAbsolutePath());
        }
    }

    /**
     * Logs a message to the logger.
     *
     * @param msg The message ot be logged.
     */
    private void log(final String msg) {
        getLog().info(msg);
    }

    /**
     * Returns the destination directory to used during code generation.
     *
     * @return the destination directory to used during code generation.
     */
    public File getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the destination directory to used during code generation.
     *
     * @param outputDirectory the destination directory to used during code generation.
     */
    public void setOutputDirectory(final File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    /**
     * Returns the default package to be used during code generation.
     *
     * @return the default package to be used during code generation.
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * Sets the default package to be used during code generation.
     *
     * @param packaging the default package to be used during code generation.
     */
    public void setPackaging(final String packaging) {
        this.packaging = packaging;
    }

    /**
     * Returns the {@link MavenProject} instance for which code generation should be executed.
     *
     * @return the {@link MavenProject} instance for which code generation should be executed.
     */
    public MavenProject getProject() {
        return project;
    }

    /**
     * Sets the {@link MavenProject} instance for which code generation should be executed.
     *
     * @param project the {@link MavenProject} instance for which code generation should be executed.
     */
    public void setProject(MavenProject project) {
        this.project = project;
    }

    /**
     * Returns the dictionary file for which code generation should be executed.
     *
     * @return the dictionary file for which code generation should be executed.
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
     * Returns the directory containing schemas for code generation.
     *
     * @return the directory containing schemas for code generation.
     */
    public File getSchemaDirectory() {
        return schemaDirectory;
    }

    /**
     * Sets the directory containing schemas for code generation.
     *
     * @param schemaDirectory the directory containing schemas for code generation.
     */
    public void setSchemaDirectory(File schemaDirectory) {
        this.schemaDirectory = schemaDirectory;
    }

    /**
     * Returns if BigDecimal has been enabled.
     *
     * @return true if BigDecimal has been enabled; otherwise will use double.
     */
    public boolean isDecimal() {
        return decimal;
    }

    /**
     * Enables BigDecimal usage during code generation.
     *
     * @param decimal if true, then enables BigDecimal generation; otherwise uses double
     */
    public void setDecimal(boolean decimal) {
        this.decimal = decimal;
    }

    /**
     * Returns if ordered fields have been enabled.
     *
     * @return true if ordered fields have been enabled; false otherwise.
     */
    public boolean isOrderedFields() {
        return orderedFields;
    }

    /**
     * Sets the ordered fields flag.
     *
     * @param orderedFields if true, then ordered fields is enabled.
     */
    public void setOrderedFields(boolean orderedFields) {
        this.orderedFields = orderedFields;
    }

    /**
     * Returns the default package to be used during field code generation.
     *
     * @return the default package to be used during field code generation.
     */
    public String getFieldPackage() {
        return fieldPackage;
    }

    /**
     * Sets the default package to be used during field code generation.
     *
     * @param fieldPackage the default package to be used during field code generation.
     */
    public void setFieldPackage(String fieldPackage) {
        this.fieldPackage = fieldPackage;
    }

    /**
     * Returns the default UtcTimestampPrecision to be used during field code generation.
     *
     * @return the default UtcTimestampPrecision to be used during field code generation.
     */
    public String getUtcTimestampPrecision() {
        return utcTimestampPrecision;
    }
    
    /**
     * Sets the default UtcTimestampPrecision to be used during field code generation.
     *
     * @param utcTimestampPrecision the default UtcTimestampPrecision to be used during field code generation.
     */
    public void setUtcTimestampPrecision(String utcTimestampPrecision) {
        this.utcTimestampPrecision = utcTimestampPrecision;
    }

	/**
	 * @return whether the code generator should overwrite existing files with the same name
	 */
	public boolean isOverwrite() {
		return overwrite;
	}

	/**
	 * @param sets whether the code generator should overwrite existing files with the same name
	 */
	public void setOverwrite(boolean overwrite) {
		this.overwrite = overwrite;
	}
}
