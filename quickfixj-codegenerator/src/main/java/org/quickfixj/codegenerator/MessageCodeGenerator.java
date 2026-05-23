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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import javax.xml.XMLConstants;

/**
 * Generates Message and Field related code for the various FIX versions.
 */
public class MessageCodeGenerator {

    private static final String BIGDECIMAL_TYPE_OPTION = "generator.decimal";
    private static final String ORDERED_FIELDS_OPTION = "generator.orderedFields";
    private static final String OVERWRITE_OPTION = "generator.overwrite";
    private static final String UTC_TIMESTAMP_PRECISION_OPTION = "generator.utcTimestampPrecision";
    private static final String PARALLEL_TASK_EXECUTION_OPTION = "generator.parallelExecution";

    // An arbitrary serial UID which will have to be changed when messages and fields won't be compatible with next versions in terms
    // of java serialization.
    private static final long SERIAL_UID = 20050617;

    // The String representation of the UID
    private static final String SERIAL_UID_STR = Long.toString(SERIAL_UID);

    // The name of the param in the .xsl files to pass the serialVersionUID
    private static final String XSLPARAM_SERIAL_UID = "serialVersionUID";

    private static final Set<String> UTC_TIMESTAMP_PRECISION_ALLOWED_VALUES =
        Collections.unmodifiableSet(new HashSet<>(Arrays.asList("SECONDS", "MILLIS", "MICROS", "NANOS")));

    private final ThreadLocal<String> logPrefix = new ThreadLocal<>();
    private final ConcurrentMap<String, Object> outputFileLocks = new ConcurrentHashMap<>();

    protected String formatLogMessage(String msg) {
        String prefix = logPrefix.get();
        if (prefix == null) {
            return msg;
        }
        return "[" + prefix + "] " + msg;
    }

    protected void logInfo(String msg) {
        System.out.println(formatLogMessage(msg));
    }

    protected void logDebug(String msg) {
        // no-op by default; override (e.g. MavenMessageCodeGenerator) to enable debug output
    }

    protected void logError(String msg, Throwable e) {
        System.err.println(formatLogMessage(msg));
        e.printStackTrace();
    }

    private void generateMessageBaseClass(Task task) throws
            ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        logInfo("generating message base class");
        Map<String, String> parameters = new HashMap<>();
        parameters.put(XSLPARAM_SERIAL_UID, SERIAL_UID_STR);
        generateClassCode(task, "Message", parameters);
    }

    private void generateMessageFactoryClass(Task task) throws
            ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCode(task, "MessageFactory", null);
    }

    private void generateMessageCrackerClass(Task task) throws
            ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        generateClassCode(task, "MessageCracker", null);
    }

    private void generateClassCode(Task task, String className, Map<String, String> parameters)
            throws ParserConfigurationException, SAXException, IOException,
            TransformerFactoryConfigurationError,
            TransformerException {
        logDebug("generating " + className);
        if (parameters == null) {
            parameters = new HashMap<>();
        }
        parameters.put("messagePackage", task.getMessagePackage());
        parameters.put("fieldPackage", task.getFieldPackage());
        Document document = getSpecification(task);
        generateCodeFile(task, document, parameters, task.getOutputBaseDirectory() + "/"
                + task.getMessageDirectory() + "/" + className + ".java", createTransformer(task,
                className + ".xsl"));
    }

    private void generateFieldClasses(Task task) throws ParserConfigurationException, SAXException,
            IOException {
        String outputDirectory = task.getOutputBaseDirectory() + "/" + task.getFieldDirectory()
                + "/";
        logInfo("generating field classes in " + outputDirectory);
        writePackageDocumentation(outputDirectory, "FIX field definitions for " + task.getName());
        Document document = getSpecification(task);
        List<String> fieldNames = getNames(document.getDocumentElement(), "fields/field");
        try {
            Transformer transformer = createTransformer(task, "Fields.xsl");
            for (String fieldName : fieldNames) {
                String outputFile = outputDirectory + fieldName + ".java";
                if (!new File(outputFile).exists() || task.isOverwrite()) { // if overwrite is set, then transform and generate the file
                    logDebug("field: " + fieldName);
                    Map<String, String> parameters = new HashMap<>();
                    parameters.put("fieldName", fieldName);
                    parameters.put("fieldPackage", task.getFieldPackage());
                    String utcTimestampPrecision = task.getUtcTimestampPrecision();
                    if (utcTimestampPrecision != null) {
                        String utcTimestampPrecisionParameterName = "utcTimestampPrecision";
                        if (!UTC_TIMESTAMP_PRECISION_ALLOWED_VALUES.contains(utcTimestampPrecision)) {
                            throw new CodeGenerationException(new IllegalArgumentException(String.format(
                                "Allowed values for parameter %s are %s. Supplied value: \"%s\".",
                                utcTimestampPrecisionParameterName,
                                String.join(", ", UTC_TIMESTAMP_PRECISION_ALLOWED_VALUES),
                                utcTimestampPrecision
                            )));
                        }
                        parameters.put(utcTimestampPrecisionParameterName, utcTimestampPrecision);
                    }
                    if (task.isDecimalGenerated()) {
                        parameters.put("decimalType", "java.math.BigDecimal");
                        parameters.put("decimalConverter", "Decimal");
                    }
                    parameters.put(XSLPARAM_SERIAL_UID, SERIAL_UID_STR);
                    generateCodeFile(task, document, parameters, outputFile, transformer);
                }
            }
        } catch (Exception e) {
            logError("error while generating field classes", e);
        }
    }

    private void generateMessageSubclasses(Task task) throws ParserConfigurationException,
            SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        logInfo("generating message subclasses");
        String outputDirectory = task.getOutputBaseDirectory() + "/" + task.getMessageDirectory()
                + "/";
        writePackageDocumentation(outputDirectory, "Message classes");
        Document document = getSpecification(task);
        List<String> messageNames = getNames(document.getDocumentElement(), "messages/message");
        Transformer transformer = createTransformer(task, "MessageSubclass.xsl");
        for (String messageName : messageNames) {
            logDebug("generating message class: " + messageName);
            Map<String, String> parameters = new HashMap<>();
            parameters.put("itemName", messageName);
            parameters.put(XSLPARAM_SERIAL_UID, SERIAL_UID_STR);
            parameters.put("orderedFields", Boolean.toString(task.isOrderedFields()));
            parameters.put("fieldPackage", task.getFieldPackage());
            parameters.put("messagePackage", task.getMessagePackage());
            generateCodeFile(task, document, parameters, outputDirectory + messageName + ".java",
                    transformer);
        }
    }

    private void generateComponentClasses(Task task) throws ParserConfigurationException,
            SAXException, IOException,
            TransformerFactoryConfigurationError, TransformerException {
        logInfo("generating component classes");
        String outputDirectory = task.getOutputBaseDirectory() + "/" + task.getMessageDirectory()
                + "/component/";
        Document document = getSpecification(task);
        List<String> componentNames = getNames(document.getDocumentElement(),
                "components/component");
        if (componentNames.size() > 0) {
            writePackageDocumentation(outputDirectory, "Message component classes");
        }
        Transformer transformer = createTransformer(task, "MessageSubclass.xsl");
        for (String componentName : componentNames) {
            logDebug("generating component class: " + componentName);
            Map<String, String> parameters = new HashMap<>();
            parameters.put("itemName", componentName);
            parameters.put("baseClass", "quickfix.MessageComponent");
            parameters.put("subpackage", ".component");
            parameters.put("fieldPackage", task.getFieldPackage());
            parameters.put("messagePackage", task.getMessagePackage());
            parameters.put("orderedFields", Boolean.toString(task.isOrderedFields()));
            parameters.put(XSLPARAM_SERIAL_UID, SERIAL_UID_STR);
            generateCodeFile(task, document, parameters, outputDirectory + componentName + ".java",
                    transformer);
        }
    }

    private Transformer createTransformer(Task task, String xsltFile)
            throws TransformerFactoryConfigurationError, TransformerConfigurationException {
        StreamSource styleSource;
        File xslt = new File(task.getTransformDirectory() + "/" + xsltFile);
        if (xslt.exists()) {
            styleSource = new StreamSource(xslt);
        } else {
            logInfo("Loading predefined xslt file:" + xsltFile);
            styleSource = new StreamSource(this.getClass().getResourceAsStream(xsltFile));
        }
        TransformerFactory transformerFactory = new net.sf.saxon.TransformerFactoryImpl();
        return transformerFactory.newTransformer(styleSource);
    }

    private final Map<String, Document> specificationCache = new ConcurrentHashMap<>();

    private Document getSpecification(Task task) throws ParserConfigurationException, SAXException,
            IOException {
        Document document = specificationCache.get(task.getName());
        if (document == null) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(task.getSpecification());
            specificationCache.put(task.getName(), document);
        }
        return document;
    }

    private void writePackageDocumentation(String outputDirectory, String description)
            throws FileNotFoundException {
        File packageDescription = new File(outputDirectory + "package.html");
        File parentDirectory = packageDescription.getParentFile();
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        synchronized (lockForFile(packageDescription)) {
            try (PrintStream out = new PrintStream(new FileOutputStream(packageDescription))) {
                out.println("<html>");
                out.println("<head><title/></head>");
                out.println("<body>" + description + "</body>");
                out.println("</html>");
            }
        }
    }

    private List<String> getNames(Element element, String path) {
        return getNames(element, path, new ArrayList<>());
    }

    private List<String> getNames(Element element, String path, List<String> names) {
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

    private void generateCodeFile(Task task, Document document, Map<String, String> parameters,
            String outputFileName, Transformer transformer)
            throws TransformerFactoryConfigurationError,
            FileNotFoundException, TransformerException {
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                transformer.setParameter(entry.getKey(), entry.getValue());
            }
        }

        File outputFile = new File(outputFileName);
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }

        if (outputFile.exists()) {
            if (!task.isOverwrite()) {
                return;
            }
        }

        synchronized (lockForFile(outputFile)) {
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try {
                StreamResult result = new StreamResult(bos);
                transformer.transform(source, result);
            } finally {
                try {
                    bos.close();
                } catch (IOException ioe) {
                    logError("error closing " + outputFile, ioe);
                }
            }
        }
    }

    private Object lockForFile(File file) {
        return outputFileLocks.computeIfAbsent(file.getAbsolutePath(), path -> new Object());
    }

    /*
     * Generate the Message and Field related source code.
     */
    public void generate(Task task) {
        String previousLogPrefix = logPrefix.get();
        logPrefix.set(task.getName());
        try {
            generateFieldClasses(task);
            generateMessageBaseClass(task);
            generateMessageFactoryClass(task);
            generateMessageCrackerClass(task);
            generateComponentClasses(task);
            generateMessageSubclasses(task);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new CodeGenerationException(e);
        } finally {
            if (previousLogPrefix == null) {
                logPrefix.remove();
            } else {
                logPrefix.set(previousLogPrefix);
            }
        }
    }

    /*
     * Generate the Message and Field related source code for multiple tasks.
     */
    public void generate(List<Task> tasks) {
        if (tasks == null || tasks.isEmpty()) {
            return;
        }
        int totalTasks = tasks.size();
        if (!getOption(PARALLEL_TASK_EXECUTION_OPTION, true) || totalTasks == 1) {
            for (int i = 0; i < totalTasks; i++) {
                processTaskWithProgress(tasks.get(i), i + 1, totalTasks);
            }
            return;
        }
        int parallelism = Math.min(totalTasks, Math.max(2, Runtime.getRuntime().availableProcessors()));
        logInfo("parallel task execution enabled with " + parallelism + " worker(s) for "
                + totalTasks + " task(s)");
        ExecutorService executor = Executors.newFixedThreadPool(parallelism);
        try {
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < totalTasks; i++) {
                Task task = tasks.get(i);
                int taskIndex = i + 1;
                futures.add(executor.submit(() -> processTaskWithProgress(task, taskIndex, totalTasks)));
            }
            for (Future<?> future : futures) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new CodeGenerationException(e);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw (RuntimeException) cause;
                    }
                    throw new CodeGenerationException(cause);
                }
            }
        } finally {
            executor.shutdownNow();
        }
    }

    private void processTaskWithProgress(Task task, int taskIndex, int totalTasks) {
        String taskName = task.getName();
        if (taskName == null || taskName.isEmpty()) {
            taskName = "unnamed";
        }
        logInfo("Started task for " + taskName + " (" + taskIndex + " / " + totalTasks + ")");
        try {
            generate(task);
        } finally {
            logInfo("Finished task for " + taskName + " (" + taskIndex + " / " + totalTasks + ")");
        }
    }

    public static class Task {
        private String name;
        private File specification;
        private File outputBaseDirectory;
        private String messagePackage;
        private String fieldPackage;
        private String utcTimestampPrecision;
        private boolean overwrite = true;
        private File transformDirectory;
        private boolean orderedFields;
        private boolean useDecimal;
        private long specificationLastModified;

        public long getSpecificationLastModified() {
            return specificationLastModified;
        }

        public String getName() {
            return name;
        }

        public void setOrderedFields(boolean orderedFields) {
            this.orderedFields = orderedFields;
        }

        public boolean isOrderedFields() {
            return orderedFields;
        }

        public File getTransformDirectory() {
            return transformDirectory;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFieldPackage() {
            return fieldPackage;
        }

        public String getFieldDirectory() {
            return fieldPackage.replace('.', '/');
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

        public String getMessageDirectory() {
            return messagePackage.replace('.', '/');
        }

        public String getMessagePackage() {
            return messagePackage;
        }

        public void setMessagePackage(String messagePackage) {
            this.messagePackage = messagePackage;
        }

        public File getOutputBaseDirectory() {
            return outputBaseDirectory;
        }

        public void setOutputBaseDirectory(File outputDirectory) {
            this.outputBaseDirectory = outputDirectory;
        }

        public File getSpecification() {
            return specification;
        }

        public void setSpecification(File dictFile) {
            this.specification = dictFile;
            this.specificationLastModified = dictFile.lastModified();
        }

        public boolean isOverwrite() {
            return overwrite;
        }

        public void setOverwrite(boolean overwrite) {
            this.overwrite = overwrite;
        }

        public void setTransformDirectory(File schemaDirectory) {
            this.transformDirectory = schemaDirectory;
        }

        public void setDecimalGenerated(boolean useDecimal) {
            this.useDecimal = useDecimal;
        }

        public boolean isDecimalGenerated() {
            return useDecimal;
        }
    }

    public static void main(String[] args) {
        MessageCodeGenerator codeGenerator = new MessageCodeGenerator();
        try {
            if (args.length != 3) {
                String classname = MessageCodeGenerator.class.getName();
                System.err.println("usage: " + classname + " specDir xformDir outputBaseDir");
                return;
            }

            String utcTimestampPrecision = getOption(UTC_TIMESTAMP_PRECISION_OPTION, null);
            boolean overwrite = getOption(OVERWRITE_OPTION, true);
            boolean orderedFields = getOption(ORDERED_FIELDS_OPTION, false);
            boolean useDecimal = getOption(BIGDECIMAL_TYPE_OPTION, false);

            long start = System.currentTimeMillis();
            final String[] versions = { "FIXT 1.1", "FIX 5.0", "FIX 4.4", "FIX 4.3", "FIX 4.2",
                    "FIX 4.1", "FIX 4.0" };
            List<Task> tasks = new ArrayList<>();
            for (String ver : versions) {
                Task task = new Task();
                task.setName(ver);
                final String version = ver.replaceAll("[ .]", "");
                task.setSpecification(new File(args[0] + "/" + version + ".xml"));
                task.setTransformDirectory(new File(args[1]));
                task.setMessagePackage("quickfix." + version.toLowerCase());
                task.setOutputBaseDirectory(new File(args[2]));
                task.setFieldPackage("quickfix.field");
                task.setUtcTimestampPrecision(utcTimestampPrecision);
                task.setOverwrite(overwrite);
                task.setOrderedFields(orderedFields);
                task.setDecimalGenerated(useDecimal);
                tasks.add(task);
            }
            codeGenerator.generate(tasks);
            double duration = System.currentTimeMillis() - start;
            DecimalFormat durationFormat = new DecimalFormat("#.###");
            codeGenerator.logInfo("Time for generation: "
                    + durationFormat.format(duration / 1000L) + " seconds");
        } catch (Exception e) {
            codeGenerator.logError("error during code generation", e);
            System.exit(1);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private static String getOption(String key, String defaultValue) {
        return System.getProperties().getProperty(key, defaultValue);
    }

    private static boolean getOption(String key, boolean defaultValue) {
        return System.getProperties().containsKey(key) ? Boolean.getBoolean(key) : defaultValue;
    }
}
