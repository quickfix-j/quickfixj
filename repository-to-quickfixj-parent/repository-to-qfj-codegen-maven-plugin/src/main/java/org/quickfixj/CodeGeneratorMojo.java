package org.quickfixj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import io.fixprotocol.orchestra.quickfix.CodeGeneratorJ;

@Mojo(name = "codeGeneration", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class CodeGeneratorMojo extends AbstractMojo {

	/**
	 * Location of orchestration file to parse
	 */
	@Parameter(property = "orchestration", required = true)
	protected File orchestration;

	/**
	 * Output Location for generated sources
	 */
	@Parameter(defaultValue = "${project.build.directory}/generated-sources", property = "outputDirectory", required = true)
	protected File outputDirectory;

	public void execute() throws MojoExecutionException {
        if ( orchestration.exists() && orchestration.isFile() ) {
            this.getLog().info(new StringBuilder("Orchestration : ").append(orchestration.getAbsolutePath()).toString());
		} else {
            String errorMsg = new StringBuilder(orchestration.getAbsolutePath()).append(" must exist and be a file.").toString();
            this.getLog().error(errorMsg.toString());
            throw new MojoExecutionException( errorMsg.toString() );
		}
		if ( outputDirectory.exists() && !outputDirectory.isDirectory() ) {
            String errorMsg = new StringBuilder(outputDirectory.getAbsolutePath()).append(" must be a directory.").toString();
            this.getLog().error(errorMsg.toString());
            throw new MojoExecutionException( errorMsg.toString() );
		} else if (!outputDirectory.exists()) {
			outputDirectory.mkdirs();
        }
		this.getLog().info(new StringBuilder("Output Directory : ").append(outputDirectory.getAbsolutePath()).toString());

		final CodeGeneratorJ generator = new CodeGeneratorJ();
	    try {
			generator.generate(new FileInputStream(orchestration), outputDirectory);
		} catch (FileNotFoundException e) {
			throw new MojoExecutionException(e.toString());
		}
	}
}
