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

import org.apache.commons.logging.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class JavaCodeGenerator {
    private Log log = LogFactory.getLog(getClass());
    private String outputBaseDir;
    private String specificationDir;

    public JavaCodeGenerator(String specificationDir, String outputBaseDir) {
        this.specificationDir = specificationDir;
        this.outputBaseDir = outputBaseDir;
    }

    public void generateMessageBaseClasses() throws Exception {
        generateClassCodeForVersions("Message");
    }

    public void generateMessageFactoryClasses() throws Exception {
        generateClassCodeForVersions("MessageFactory");
    }

    public void generateMessageCrackerClasses() throws Exception {
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

    public void generateFieldClasses() throws ParserConfigurationException, SAXException,
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

    public void generateMessageSubclasses() throws Exception {
        for (int fixVersion = 0; fixVersion < 5; fixVersion++) {
            Document document = getSpecification(fixVersion);
            List messageNames = getNames(document.getDocumentElement(), "messages/message");
            try {
                for (int i = 0; i < messageNames.size(); i++) {
                    String messageName = (String) messageNames.get(i);
                    //if (!messageName.equals("Advertisement")) continue;
                    log.debug("message (FIX 4." + fixVersion + "): " + messageName);
                    generateCodeFile(document, specificationDir + "/MessageSubclass.xsl",
                            "messageName", messageName, outputBaseDir + "/quickfix/fix4"
                                    + fixVersion + "/" + messageName + ".java");
                }
            } catch (Exception e) {
                // TODO
                e.printStackTrace();
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

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                String classname = JavaCodeGenerator.class.getName();
                System.err.println("usage: " + classname + " specDir outputBaseDir");
                return;
            }
            JavaCodeGenerator javaCodeGenerator = new JavaCodeGenerator(args[0], args[1]);
            javaCodeGenerator.generateFieldClasses();
            javaCodeGenerator.generateMessageBaseClasses();
            javaCodeGenerator.generateMessageFactoryClasses();
            javaCodeGenerator.generateMessageCrackerClasses();
            javaCodeGenerator.generateMessageSubclasses();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}