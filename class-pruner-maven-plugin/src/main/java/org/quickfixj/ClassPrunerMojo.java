package org.quickfixj;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.shared.model.fileset.FileSet;
import org.apache.maven.shared.model.fileset.util.FileSetManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Goal that prunes specified classes 
 */
@Mojo( name = "prune", defaultPhase = LifecyclePhase.PROCESS_SOURCES )
public class ClassPrunerMojo extends AbstractMojo {
	
    /**
     * <code>fileSet</code> defining the QFJ Dictionary Locations.
     */
    @Parameter ( property = "fileset", required = true )
    private FileSet fileset;

    /**
     * Location of classes to delete
     */
    @Parameter( defaultValue = "classes", property = "classesDirectory", required = true )
    private File classesDirectory;

    /**
     * Location of the generated source to delete
     */
    @Parameter( defaultValue = "generated-sources", property = "generatedSourcesDirectory", required = true )
    private File generatedSourcesDirectory;

    
    public void execute()
        throws MojoExecutionException
    {
    	this.getLog().info("executing mojo.");
    	
    	if ( !classesDirectory.exists() && classesDirectory.isDirectory() )
        {
    		String errorMsg = new StringBuilder(classesDirectory.getAbsolutePath()).append(" must exist and be a directory.").toString();
    		this.getLog().error(errorMsg.toString());
    		throw new MojoExecutionException( errorMsg.toString() );
        } else {
        	this.getLog().info(new StringBuilder("Classes Directory : ").append(classesDirectory.getAbsolutePath()).toString());
        }
    	
    	if ( !generatedSourcesDirectory.exists() && generatedSourcesDirectory.isDirectory() )
        {
    		String errorMsg = new StringBuilder(generatedSourcesDirectory.getAbsolutePath()).append(" must exist and be a directory.").toString();
    		this.getLog().error(errorMsg.toString());
    		throw new MojoExecutionException( errorMsg.toString() );
        } else {
        	this.getLog().info(new StringBuilder("Generated Sources Directory : ").append(classesDirectory.getAbsolutePath()).toString());
        }
    	
    	if (null == fileset) {
    		String errorMsg = "filset must not be null.";
    		this.getLog().error(errorMsg);
    		throw new MojoExecutionException( errorMsg );
    	}

		Set<String> fieldNames = new HashSet<String>();

        collectFieldNames(fieldNames);
        
        try {
			pruneGeneratedSources(fieldNames);
	        pruneClasses(fieldNames);

        } catch (IOException e) {
			String errorMsg = "Exception pruning directories.";
    		this.getLog().error(errorMsg, e);
    		throw new MojoExecutionException( errorMsg, e);
		}
    }

	private void pruneClasses(Set<String> fieldNames) throws IOException {
		Set<String> classes = listFiles(this.classesDirectory);
		Set<String> namesOfFilesToKeep =  fieldNames.stream().map(file -> new StringBuilder(file).append(".class").toString()).collect(Collectors.toSet());
		classes.removeAll(namesOfFilesToKeep);
		List<String> classList = new ArrayList<String>(classes);
		Collections.sort(classList);
		this.getLog().info("Java Classes to delete : " + classList.size());
		for (String clazz : classList) {
			this.getLog().info("Deleting Class : " + clazz);
			File classFile = new File( classesDirectory, clazz );
			classFile.delete();
		}
	}

	private void pruneGeneratedSources(Set<String> fieldNames) throws IOException {
		Set<String> sources = listFiles(this.generatedSourcesDirectory);
		Set<String> namesOfFilesToKeep =  fieldNames.stream().map(file -> new StringBuilder(file).append(".java").toString()).collect(Collectors.toSet());
		sources.removeAll(namesOfFilesToKeep);
		List<String> sourceList = new ArrayList<String>(sources);
		Collections.sort(sourceList);
		this.getLog().info("Java Sources to delete : " + sourceList.size());
		for (String source  : sourceList) {
			this.getLog().info("Deleting Java Source : " + source);
			File sourceFile = new File( generatedSourcesDirectory, source );
			sourceFile.delete();
		}
	}
	
	private Set<String> listFiles(File directory) throws IOException {
		try (Stream<Path> stream = Files.list(directory.toPath())) {
	        return stream
	          .filter(file -> !Files.isDirectory(file))
	          .map(Path::getFileName)
	          .map(Path::toString)
	          .filter(fileName -> !fileName.matches(".*\\.xml"))
	          .collect(Collectors.toSet());
	    }
	}

	private void collectFieldNames(Set<String> fieldNames) throws MojoExecutionException {
		Set<String> fileNamesToParse = collectFileNameToParse();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    	DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			String msg = "ParserConfigurationException creating Document Builder";
			this.getLog().error(msg, e);
			throw new MojoExecutionException(msg, e);
		}
		
	    for (String fileName: fileNamesToParse) {
	    	Document document;
			try {
				document = db.parse(new File(fileName));
		    	// optional, but recommended
		        // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		    	document.getDocumentElement().normalize();
		    	addNames(document.getDocumentElement(), "fields/field", fieldNames);
			} catch (SAXException | IOException e) {
				String msg = "Exception parsing file " + fileName;
				this.getLog().error(msg, e);
				throw new MojoExecutionException(msg, e);
			}
	    }
	    
	    List<String> fieldList = new ArrayList<String>(fieldNames);
		Collections.sort(fieldList);
	    for (String fieldName : fieldList) {
	    	this.getLog().info("Found field : " + fieldName);
	    }
	    this.getLog().info("Found field total : " + fieldList.size());
	}

	private Set<String> collectFileNameToParse() {
		FileSetManager fileSetManager = new FileSetManager();
        this.getLog().info("fileset " + fileset.toString());
        
        String currentDir = System.getProperty("user.dir");
        this.getLog().info("Current working directory : " + currentDir);
        
        Set<String> includedFiles = new HashSet<String>(Arrays.asList(fileSetManager.getIncludedFiles( fileset )));
        Set<String> fileNamesToParse = new HashSet<String>();
        
        String baseDirectory = fileset.getDirectory();
		for (String includedFile: includedFiles) {
			this.getLog().info("will parse file : " + includedFile);
			String fileName = new StringBuilder(baseDirectory).append(File.separator).append(includedFile).toString();
			fileNamesToParse.add(fileName);
		}
		return fileNamesToParse;
	}
    
    private static void addNames(Element element, String path, Set<String> fieldNames) {
        int separatorOffset = path.indexOf("/");
        if (separatorOffset == -1) {
            NodeList fieldNodeList = element.getElementsByTagName(path);
            for (int i = 0; i < fieldNodeList.getLength(); i++) {
                fieldNames.add(((Element) fieldNodeList.item(i)).getAttribute("name"));
            }
        } else {
            String tag = path.substring(0, separatorOffset);
            NodeList subnodes = element.getElementsByTagName(tag);
            for (int i = 0; i < subnodes.getLength(); i++) {
            	addNames((Element) subnodes.item(i), path.substring(separatorOffset + 1), fieldNames);
            }
        }
    }
}
