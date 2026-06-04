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
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.LifecyclePhase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * A mojo that uses the quickfix code generator to generate
 * Java source files from a QuickFIX Dictionary.
 *
 * @description QuickFIX/J code generation plugin
 * @author <a href="mailto:rockdreamer@gmail.com">Claudio Bantaloukas</a>
 */
@Mojo( name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES )
public class GenerateMojo extends AbstractMojo {

    /**
     * The dictionary file to use for mapping messages to java.
     */
    @Parameter(defaultValue="${basedir}/src/main/quickfixj/dictionary/FIX44.xml")
    private File dictFile;

    /**
     * Optional list of dictionaries/tasks to generate in a single execution.
     */
    @Parameter
    private List<GeneratorTask> tasks;

    /**
     * The source directory containing *.xsd files.
     */
    @Parameter(defaultValue="${basedir}/src/resources/quickfixj/codegenerator")
    private File schemaDirectory;

    /**
     * The directory to output the generated sources to.
     */
    @Parameter(defaultValue="${project.build.directory}/generated-sources/")
    private File outputDirectory;

    /**
     * Enable BigDecimal representation.
     */
    @Parameter(defaultValue="false")
    private boolean decimal;

    /**
     * Enable orderedFields.
     */
    @Parameter(defaultValue="false")
    private boolean orderedFields;

    /**
     * The package for the generated source.
     */
    @Parameter
    private String packaging;

    /**
     * The base field class to use.
     */
    @Parameter(defaultValue = "quickfix.field")
    private String fieldPackage = "quickfix.field";

    /**
     * The default UtcTimestampPrecision to be used during field code generation.
     */
    @Parameter(required = false)
    private String utcTimestampPrecision;

    /**
     * Defines whether the code generator should overwrite existing files with the same name
     */
    @Parameter(defaultValue = "true")
    private boolean overwrite = true;

    /**
     * The Maven project to act upon.
     */
    @Parameter(defaultValue = "${project}", required = true)
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
                getLog().info("Successfully created an instance of the QuickFIX/J source generator");
            }
            generator.setLog(getLog());

            List<MessageCodeGenerator.Task> generationTasks = createGenerationTasks();
            generator.generate(generationTasks);
        } catch (Throwable t) {
            throw new MojoExecutionException("QuickFIX/J code generator execution failed", t);
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

    private List<MessageCodeGenerator.Task> createGenerationTasks() throws MojoExecutionException {
        List<GeneratorTask> configuredTasks;
        if (tasks == null || tasks.isEmpty()) {
            configuredTasks = new ArrayList<>();
            GeneratorTask singleTask = new GeneratorTask();
            singleTask.setDictFile(dictFile);
            singleTask.setPackaging(packaging);
            singleTask.setFieldPackage(fieldPackage);
            singleTask.setUtcTimestampPrecision(utcTimestampPrecision);
            singleTask.setOverwrite(overwrite);
            singleTask.setOrderedFields(orderedFields);
            singleTask.setDecimal(decimal);
            configuredTasks.add(singleTask);
        } else {
            configuredTasks = tasks;
        }

        List<MessageCodeGenerator.Task> generationTasks = new ArrayList<>(configuredTasks.size());
        for (GeneratorTask configuredTask : configuredTasks) {
            MessageCodeGenerator.Task task = new MessageCodeGenerator.Task();
            if (getLog().isInfoEnabled()) {
                getLog().info("Initialising code generator task");
            }

            if (configuredTask.getDictFile() != null && configuredTask.getDictFile().exists()) {
                task.setSpecification(configuredTask.getDictFile());
            } else {
                getLog().error("Cannot find file " + configuredTask.getDictFile());
                throw new MojoExecutionException("File could not be found or was NULL!");
            }
            if (configuredTask.getPackaging() == null || configuredTask.getPackaging().isEmpty()) {
                throw new MojoExecutionException("Packaging could not be found or was NULL!");
            }

            log("Processing " + configuredTask.getDictFile());
            task.setName(configuredTask.getDictFile().getName());
            task.setTransformDirectory(schemaDirectory);
            task.setMessagePackage(configuredTask.getPackaging());
            task.setOutputBaseDirectory(outputDirectory);
            task.setFieldPackage(configuredTask.getFieldPackage() != null ? configuredTask.getFieldPackage() : fieldPackage);
            task.setUtcTimestampPrecision(configuredTask.getUtcTimestampPrecision() != null
                    ? configuredTask.getUtcTimestampPrecision() : utcTimestampPrecision);
            task.setOverwrite(configuredTask.getOverwrite() != null ? configuredTask.getOverwrite() : overwrite);
            task.setOrderedFields(configuredTask.getOrderedFields() != null ? configuredTask.getOrderedFields() : orderedFields);
            task.setDecimalGenerated(configuredTask.getDecimal() != null ? configuredTask.getDecimal() : decimal);
            generationTasks.add(task);
        }
        return generationTasks;
    }

    public static class GeneratorTask {
        @Parameter(required = true)
        private File dictFile;

        @Parameter(required = true)
        private String packaging;

        @Parameter
        private String fieldPackage;

        @Parameter
        private String utcTimestampPrecision;

        @Parameter
        private Boolean overwrite;

        @Parameter
        private Boolean orderedFields;

        @Parameter
        private Boolean decimal;

        public File getDictFile() {
            return dictFile;
        }

        public void setDictFile(File dictFile) {
            this.dictFile = dictFile;
        }

        public String getPackaging() {
            return packaging;
        }

        public void setPackaging(String packaging) {
            this.packaging = packaging;
        }

        public String getFieldPackage() {
            return fieldPackage;
        }

        public void setFieldPackage(String fieldPackage) {
            this.fieldPackage = fieldPackage;
        }

        public String getUtcTimestampPrecision() {
            return utcTimestampPrecision;
        }

        public void setUtcTimestampPrecision(String utcTimestampPrecision) {
            this.utcTimestampPrecision = utcTimestampPrecision;
        }

        public Boolean getOverwrite() {
            return overwrite;
        }

        public void setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
        }

        public Boolean getOrderedFields() {
            return orderedFields;
        }

        public void setOrderedFields(Boolean orderedFields) {
            this.orderedFields = orderedFields;
        }

        public Boolean getDecimal() {
            return decimal;
        }

        public void setDecimal(Boolean decimal) {
            this.decimal = decimal;
        }
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
     * @param overwrite sets whether the code generator should overwrite existing files with the same name
     */
    public void setOverwrite(boolean overwrite) {
        this.overwrite = overwrite;
    }
}
