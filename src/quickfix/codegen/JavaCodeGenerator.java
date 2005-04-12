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
 * @author sbate
 *  
 */
public class JavaCodeGenerator {
    private Log log = LogFactory.getLog(getClass());
    private String outputBaseDir;
    private String specificationDir;

    public JavaCodeGenerator(String specificationDir, String outputBaseDir) {
        this.specificationDir = specificationDir;
        this.outputBaseDir = outputBaseDir;
    }

    private void generateMessageBaseClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("Message");
    }

    private void generateMessageFactoryClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("MessageFactory");
    }

    private void generateMessageCrackerClasses() throws TransformerConfigurationException,
            FileNotFoundException, ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCodeForVersions("MessageCracker");
    }

    private void generateClassCodeForVersions(String className)
            throws ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerConfigurationException,
            FileNotFoundException, TransformerException {
        for (int fixMinorVersion = 0; fixMinorVersion < 5; fixMinorVersion++) {
            log.debug("generating " + className + " for FIX 4." + fixMinorVersion);
            Document document = getSpecification(fixMinorVersion);
            generateCodeFile(document, specificationDir + "/" + className + ".xsl", null, null,
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
                        log.debug("field: " + fieldName);
                        generateCodeFile(document, specificationDir + "/Fields.xsl", "fieldName",
                                fieldName, outputFile);
                    }
                }
            } catch (Exception e) {
                // TODO
                e.printStackTrace();
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
                log.debug("message (FIX 4." + fixVersion + "): " + messageName);
                generateCodeFile(document, specificationDir + "/MessageSubclass.xsl",
                        "messageName", messageName, outputBaseDir + "/quickfix/fix4" + fixVersion
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

    private void generateCodeFile(Document document, String xsltFile, String paramName,
            String paramValue, String outputFile) throws TransformerFactoryConfigurationError,
            TransformerConfigurationException, FileNotFoundException, TransformerException {
        // Use a Transformer for output
        TransformerFactory tFactory = TransformerFactory.newInstance();
        StreamSource styleSource = new StreamSource(xsltFile);
        Transformer transformer = tFactory.newTransformer(styleSource);

        if (paramName != null) {
            transformer.setParameter(paramName, paramValue);
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
            if (args.length == 0) {
                String classname = JavaCodeGenerator.class.getName();
                System.err.println("usage: " + classname + " specDir outputBaseDir");
                return;
            }
            JavaCodeGenerator javaCodeGenerator = new JavaCodeGenerator(args[0], args[1]);
            javaCodeGenerator.generate();
        } catch (Exception e) {
            LogFactory.getLog(JavaCodeGenerator.class).error("error during code generation", e);
            System.exit(1);
        }
    }
}