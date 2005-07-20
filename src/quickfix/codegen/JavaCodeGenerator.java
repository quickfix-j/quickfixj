/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix.codegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Generates Message and Field related code for the various FIX versions.
 * 
 */
public class JavaCodeGenerator {
    private Log log = LogFactory.getLog(getClass());
    private String outputBaseDir;
    private String specificationDir;
    private String xformDir;
    
    //  An arbitrary serial UID which will have to be changed when messages and fields won't be compatible with next versions in terms
    // of java serialization.
    private static final long SERIAL_UID = 20050617;
    
    //  The String representation of the UID
    private static final String SERIAL_UID_STR = String.valueOf(SERIAL_UID);
    
    //  The name of the param in the .xsl files to pass the serialVersionUID
    private static final String XSLPARAM_SERIAL_UID = "serialVersionUID";     

    /**
     * Constructs a message code generator.
     * @param specificationDir where the specification are located.
     * @param xformDir where the XSLT transformations are located
     * @param outputBaseDir directory where the output should be generated
     */
    public JavaCodeGenerator(String specificationDir, String xformDir, String outputBaseDir) {
        this.specificationDir = specificationDir;
        this.xformDir = xformDir;
        this.outputBaseDir = outputBaseDir;
    }

    private void generateMessageBaseClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("Message", new String[] {XSLPARAM_SERIAL_UID}, new String[] {SERIAL_UID_STR});
    }

    private void generateMessageFactoryClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("MessageFactory", null, null);
    }

    private void generateMessageCrackerClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("MessageCracker", null, null);
    }

    private void generateClassCodeForVersions(String className, String[] paramNames, String paramValues[])
            throws ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerConfigurationException,
            FileNotFoundException, TransformerException {
        for (int fixMinorVersion = 0; fixMinorVersion < 5; fixMinorVersion++) {
            log.info("generating " + className + " for FIX 4." + fixMinorVersion);
            Document document = getSpecification(fixMinorVersion);
            generateCodeFile(document, xformDir + "/" + className + ".xsl", paramNames, paramValues,
                    outputBaseDir + "/quickfix/fix4" + fixMinorVersion + "/" + className + ".java");
        }
    }

    private Document getSpecification(int fixMinorVersion) throws ParserConfigurationException,
            SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        File f = new File(specificationDir + "/FIX4" + fixMinorVersion + ".xml");
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(f);
        return document;
    }

    private void generateFieldClasses() throws ParserConfigurationException, SAXException,
            IOException {
        for (int fixMinorVersion = 4; fixMinorVersion >= 0; fixMinorVersion--) {
            Document document = getSpecification(fixMinorVersion);
            List fieldNames = getNames(document.getDocumentElement(), "fields/field");
            try {
                for (int i = 0; i < fieldNames.size(); i++) {
                    String fieldName = (String) fieldNames.get(i);
                    String outputFile = outputBaseDir + "/quickfix/field/" + fieldName + ".java";
                    if (!new File(outputFile).exists()) {
                        log.info("field: " + fieldName);
                        generateCodeFile(document, xformDir + "/Fields.xsl", new String[] {"fieldName", XSLPARAM_SERIAL_UID},
                                new String[] {fieldName, SERIAL_UID_STR}, outputFile);
                    }
                }
            } catch (Exception e) {
                log.error("error while generating field classes", e);
            }
        }
    }

    private void generateMessageSubclasses() throws ParserConfigurationException, SAXException,
            IOException, TransformerConfigurationException, FileNotFoundException,
            TransformerFactoryConfigurationError, TransformerException {
        for (int fixVersion = 0; fixVersion < 5; fixVersion++) {
            Document document = getSpecification(fixVersion);
            List messageNames = getNames(document.getDocumentElement(), "messages/message");
            for (int i = 0; i < messageNames.size(); i++) {
                String messageName = (String) messageNames.get(i);
                //if (!messageName.equals("Advertisement")) continue;
                log.info("message (FIX 4." + fixVersion + "): " + messageName);
                generateCodeFile(document, xformDir + "/MessageSubclass.xsl",
                        new String[] {"messageName", XSLPARAM_SERIAL_UID}, new String[] {messageName, SERIAL_UID_STR}, outputBaseDir + "/quickfix/fix4" + fixVersion
                                + "/" + messageName + ".java");
            }
        }
    }

    private List getNames(Element element, String path) {
        return getNames(element, path, new ArrayList());
    }

    private List getNames(Element element, String path, List names) {
        int separatorOffset = path.indexOf("/");
        if (separatorOffset == -1) {
            NodeList fieldNodeList = element.getElementsByTagName(path);
            for (int i = 0; i < fieldNodeList.getLength(); i++) {
                names.add(((Element) fieldNodeList.item(i)).getAttribute("name"));
            }
        } else {
            String tag = path.substring(0, separatorOffset);
            NodeList subnodes = element.getElementsByTagName(tag);
            for (int i = 0; i < subnodes.getLength(); i++) {
                getNames((Element) subnodes.item(i), path.substring(separatorOffset + 1), names);
            }
        }
        return names;
    }

    private void generateCodeFile(Document document, String xsltFile, String[] paramNames,
            String[] paramValues, String outputFile) throws TransformerFactoryConfigurationError,
            TransformerConfigurationException, FileNotFoundException, TransformerException {
        // Use a Transformer for output
        TransformerFactory tFactory = TransformerFactory.newInstance();
        StreamSource styleSource = new StreamSource(xsltFile);
        Transformer transformer = tFactory.newTransformer(styleSource);

        if (paramNames != null) {
            for(int k=0; k < paramNames.length; k++) {
                transformer.setParameter(paramNames[k], paramValues[k]);
            }
        }
        
        File out = new File(outputFile);
        if (!out.getParentFile().exists()) {
            out.getParentFile().mkdirs();
        }
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new FileOutputStream(outputFile));
        transformer.transform(source, result);
    }

    /*
     * Generate the Message and Field related source code.
     */
    public void generate() {
        try {
            generateFieldClasses();
            generateMessageBaseClasses();
            generateMessageFactoryClasses();
            generateMessageCrackerClasses();
            generateMessageSubclasses();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new CodeGenerationException(e);
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                String classname = JavaCodeGenerator.class.getName();
                System.err.println("usage: " + classname + " specDir xformDir outputBaseDir");
                return;
            }
            JavaCodeGenerator javaCodeGenerator = new JavaCodeGenerator(args[0], args[1], args[2]);
            javaCodeGenerator.generate();
        } catch (Exception e) {
            LogFactory.getLog(JavaCodeGenerator.class).error("error during code generation", e);
            System.exit(1);
        }
    }
}