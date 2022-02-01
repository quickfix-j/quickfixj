/*
 * Copyright 2017-2021 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package io.fixprotocol.orchestra.quickfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import io.fixprotocol._2020.orchestra.repository.CodeSetType;
import io.fixprotocol._2020.orchestra.repository.CodeType;
import io.fixprotocol._2020.orchestra.repository.ComponentRefType;
import io.fixprotocol._2020.orchestra.repository.ComponentType;
import io.fixprotocol._2020.orchestra.repository.FieldRefType;
import io.fixprotocol._2020.orchestra.repository.FieldType;
import io.fixprotocol._2020.orchestra.repository.GroupRefType;
import io.fixprotocol._2020.orchestra.repository.GroupType;
import io.fixprotocol._2020.orchestra.repository.MessageType;
import io.fixprotocol._2020.orchestra.repository.PresenceT;
import io.fixprotocol._2020.orchestra.repository.Repository;

/**
 * Generates a QuickFIX data dictionary from a FIX Orchestra file
 * <p>
 * This format is consumable by the C++, Java and .NET versions of QuickFIX.
 *
 * @author Don Mendelson
 *
 */
public class DataDictionaryGenerator {

  private static class KeyValue<T> {
    final String key;
    final T value;

    public KeyValue(String key, T value) {
      this.key = key;
      this.value = value;
    }
  }

  private static final int SPACES_PER_LEVEL = 2;

  /**
   * Runs a DataDictionaryGenerator with command line arguments
   * <p>
   * The data dictionary format is consumable by QuickFIX, QuickFIX/J and QuickFIX/n.
   *
   * @param args command line arguments. The first argument is the name of a FIX Orchestra file. An
   *        optional second argument is the target directory for generated files. It defaults to
   *        directory "spec".
   */
  public static void main(String[] args) {
    final DataDictionaryGenerator generator = new DataDictionaryGenerator();
    if (args.length >= 1) {
      final File inputFile = new File(args[0]);
      File outputDir;
      if (args.length >= 2) {
        outputDir = new File(args[1]);
      } else {
        outputDir = new File("spec");
      }
      try (FileInputStream inputStream = new FileInputStream(inputFile)) {
        generator.generate(inputStream, outputDir);
      } catch (Exception e) {
        e.printStackTrace(System.err);
      }
    } else {
      generator.usage();
    }
  }

  private final Map<String, CodeSetType> codeSets = new HashMap<>();
  private final Map<Integer, ComponentType> components = new HashMap<>();
  private final Map<Integer, GroupType> groups = new HashMap<>();
  private final Map<Integer, FieldType> fields = new HashMap<>();
  private Document xmlDocument;
  private static final String FIX_LATEST = "FIX.Latest";

  public void generate(InputStream inputFile, File outputDir) throws JAXBException, IOException,
      ParserConfigurationException, SAXException, XPathExpressionException {
    final Repository repository = unmarshal(inputFile);
    generate(repository, outputDir);
  }

  public void generate(Repository repository, File outputDir)
      throws IOException, XPathExpressionException {

    Set<Integer> requiredGroupIds = getRequiredGroups();

    final List<CodeSetType> codeSetList = repository.getCodeSets().getCodeSet();
    for (final CodeSetType codeSet : codeSetList) {
      codeSets.put(codeSet.getName(), codeSet);
    }

    final List<ComponentType> componentList = repository.getComponents().getComponent();
    for (final ComponentType component : componentList) {
      components.put(component.getId().intValue(), component);
    }

    final List<GroupType> groupList = repository.getGroups().getGroup();
    for (final GroupType group : groupList) {
      groups.put(group.getId().intValue(), group);
    }

    final List<FieldType> fieldList = repository.getFields().getField();
    for (final FieldType fieldType : fieldList) {
      fields.put(fieldType.getId().intValue(), fieldType);
    }

    String version = repository.getVersion();
    String major = "Latest"; // will be over-written if version is not FIX.Latest
    String minor = "0";
    String fileName = splitOffVersion(version);
    String extensionPack = extractExtensionPack(version);
    String servicePack = extractServicePack(version);
    
    if (FIX_LATEST.equals(fileName)) {
        writeFile(repository, outputDir, requiredGroupIds, componentList, groupList, fieldList, major, minor, fileName,
                extensionPack, servicePack);
    } else {
        final String regex = "(FIX\\.)(?<major>\\d+)(\\.)(?<minor>\\d+)(.*)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(version);
    
        if (matcher.find()) {
          major = matcher.group("major");
          minor = matcher.group("minor");
          writeFile(repository, outputDir, requiredGroupIds, componentList, groupList, fieldList, major, minor, fileName,
                  extensionPack, servicePack);
        } else {
            System.err.format("Failed to parse FIX major and minor version in %s%n", version);
        }
    }
  }

  private void writeFile(Repository repository, File outputDir, Set<Integer> requiredGroupIds,
        final List<ComponentType> componentList, final List<GroupType> groupList, final List<FieldType> fieldList,
        String major, String minor, String fileName, String extensionPack, String servicePack) throws IOException {
      final String versionPath = fileName.replaceAll("[\\.]", "");
      final File file = getSpecFilePath(outputDir, versionPath, ".xml");
      outputDir.mkdirs();
      try (FileWriter writer = new FileWriter(file)) {
        writeElement(writer, "fix", 0, false, new KeyValue<>("major", major),
            new KeyValue<>("minor", minor), new KeyValue<>("servicepack", servicePack),
            new KeyValue<>("extensionpack", extensionPack));
        writeElement(writer, "header", 1, true);
        writeElement(writer, "trailer", 1, true);
        writeElement(writer, "messages", 1, false);
        final List<MessageType> messageList = repository.getMessages().getMessage();
        for (final MessageType messageType : messageList) {
          writeMessage(writer, messageType);
        }
        writeElementEnd(writer, "messages", 1);
        writeElement(writer, "components", 1, false);

        for (final ComponentType componentType : componentList) {
          writeComponent(writer, componentType);
        }

        for (final GroupType groupType : groupList) {
          boolean isRequired = requiredGroupIds.contains(groupType.getId().intValue());
          writeGroup(writer, groupType, isRequired);
        }

        writeElementEnd(writer, "components", 1);
        writeElement(writer, "fields", 1, false);
        for (final FieldType fieldType : fieldList) {
          writeField(writer, fieldType);
        }
        writeElementEnd(writer, "fields", 1);
        writeElementEnd(writer, "fix", 0);
      }
  }

  String splitOffVersion(String version) {
    // Split off EP portion of version in the form "FIX.5.0SP2_EP216"
    String[] parts = version.split("_");
    if (parts.length > 0) {
      version = parts[0];
    }
    return version;
  }

  String extractExtensionPack(String version) {
    // Split off EP portion of version in the form "FIX.5.0SP2_EP216"
    String extensionPack = "0";
    String[] parts = version.split("_EP");
    if (parts.length > 1) {
      extensionPack = parts[1];
    }
    return extensionPack;
  }

  String extractServicePack(String version) {
    // Split off SP portion of version in the form "FIX.5.0SP2"
    String servicePack = "0";
    String[] parts = version.split("SP");
    if (parts.length > 1) {
      servicePack = parts[1];
    }
    // strip trailing EP as in "SP2_EP123" if it exists
    parts = servicePack.split("_");
    if (parts.length > 1) {
      servicePack = parts[0];
    }
    return servicePack;
  }

  private File getSpecFilePath(File outputDir, String versionPath, String extension) {
    final StringBuilder sb = new StringBuilder();
    sb.append(versionPath);
    sb.append(extension);
    return new File(outputDir, sb.toString());
  }

  private Set<Integer> getRequiredGroups() throws XPathExpressionException {
    Set<Integer> groupIds = new HashSet<>();
    XPath xPath = XPathFactory.newInstance().newXPath();
    xPath.setNamespaceContext(new NamespaceContext() {

      @Override
      public String getNamespaceURI(String prefix) {
        switch (prefix) {
          case "fixr":
            return "http://fixprotocol.io/2020/orchestra/repository";
          default:
            return null;
        }
      }

      @Override
      public String getPrefix(String namespaceURI) {
        return null;
      }

      @Override
      public Iterator<String> getPrefixes(String namespaceURI) {
        return null;
      }

    });
    String expression = "//fixr:groupRef[@presence='required']";
    NodeList nodeList = (NodeList) xPath.compile(expression)
        .evaluate(xmlDocument.getDocumentElement(), XPathConstants.NODESET);
    for (int i = 0; i < nodeList.getLength(); i++) {
      if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) nodeList.item(i);
        String id = element.getAttribute("id");
        groupIds.add(Integer.parseInt(id));
      }
    }
    return groupIds;
  }

  private String indent(int level) {
    final char[] chars = new char[level * SPACES_PER_LEVEL];
    Arrays.fill(chars, ' ');
    return new String(chars);
  }

  private boolean isAdmin(String category) {
    return category != null && category.equals("Session");
  }

  private String toConstantName(String symbolicName) {
    final StringBuilder sb = new StringBuilder(symbolicName);
    for (int i = symbolicName.length() - 1; i > 0; i--) {
      if (Character.isUpperCase(sb.charAt(i)) && !Character.isUpperCase(sb.charAt(i - 1))) {
        sb.insert(i, '_');
      }
    }
    return sb.toString().toUpperCase();
  }

  private Repository unmarshal(InputStream inputFile)
      throws JAXBException, ParserConfigurationException, SAXException, IOException {
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    builderFactory.setNamespaceAware(true);
    DocumentBuilder builder = builderFactory.newDocumentBuilder();
    xmlDocument = builder.parse(inputFile);
    final JAXBContext jaxbContext = JAXBContext.newInstance(Repository.class);
    final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    return (Repository) jaxbUnmarshaller.unmarshal(xmlDocument);
  }

  private void usage() {
    System.out.format("Usage: java %s <input-file> <output-dir>", this.getClass().getName());
  }

  private Writer writeCode(Writer writer, CodeType code) throws IOException {
    writeElement(writer, "value", 3, true, new KeyValue<>("enum", code.getValue()),
        new KeyValue<>("description", toConstantName(code.getName())));
    return writer;
  }

  private Writer writeComponent(Writer writer, ComponentRefType componentRefType)
      throws IOException {
    final ComponentType component = components.get(componentRefType.getId().intValue());
    writeElement(writer, "component", 3, true, new KeyValue<>("name", component.getName()),
        new KeyValue<>("required",
            componentRefType.getPresence().equals(PresenceT.REQUIRED) ? "Y" : "N"));
    return writer;
  }

  private Writer writeComponent(Writer writer, ComponentType componentType) throws IOException {
    writeElement(writer, "component", 2, false, new KeyValue<>("name", componentType.getName()));
    final List<Object> members = componentType.getComponentRefOrGroupRefOrFieldRef();
    for (final Object member : members) {
      if (member instanceof FieldRefType) {
        final FieldRefType fieldRefType = (FieldRefType) member;
        writeField(writer, fieldRefType);
      } else if (member instanceof GroupRefType) {
        final GroupRefType groupRefType = (GroupRefType) member;
        writeGroup(writer, groupRefType);
      } else if (member instanceof ComponentRefType) {
        final ComponentRefType componentRefType = (ComponentRefType) member;
        writeComponent(writer, componentRefType);
      }
    }
    writeElementEnd(writer, "component", 2);
    return writer;
  }

  private Writer writeElement(Writer writer, String name, int level, boolean isEmpty)
      throws IOException {
    writer.write(String.format("%s<%s", indent(level), name));
    if (isEmpty) {
      writer.write("/>\n");
    } else {
      writer.write(">\n");
    }
    return writer;
  }

  private Writer writeElement(Writer writer, String name, int level, boolean isEmpty,
      KeyValue<?>... attributes) throws IOException {
    writer.write(String.format("%s<%s", indent(level), name));
    for (KeyValue<?> attribute : attributes) {
      writer.write(String.format(" %s=\"%s\"", attribute.key, attribute.value.toString()));
    }
    if (isEmpty) {
      writer.write("/>\n");
    } else {
      writer.write(">\n");
    }
    return writer;
  }

  private Writer writeElementEnd(Writer writer, String name, int level) throws IOException {
    writer.write(String.format("%s</%s>%n", indent(level), name));
    return writer;
  }

  private Writer writeField(Writer writer, FieldRefType fieldRefType) throws IOException {
    final FieldType field = fields.get(fieldRefType.getId().intValue());
    writeElement(writer, "field", 3, true, new KeyValue<>("name", field.getName()), new KeyValue<>(
        "required", fieldRefType.getPresence().equals(PresenceT.REQUIRED) ? "Y" : "N"));
    return writer;
  }

  private Writer writeField(Writer writer, FieldType fieldType) throws IOException {
    final String type = fieldType.getType();
    final CodeSetType codeSet = codeSets.get(type);
    final String fixType = codeSet == null ? type : codeSet.getType();
    writeElement(writer, "field", 2, codeSet == null,
        new KeyValue<>("number", fieldType.getId().intValue()),
        new KeyValue<>("name", fieldType.getName()), new KeyValue<>("type", fixType.toUpperCase()));
    if (codeSet != null) {
      for (final CodeType code : codeSet.getCode()) {
        writeCode(writer, code);
      }
      writeElementEnd(writer, "field", 2);
    }
    return writer;
  }

  private Writer writeGroup(Writer writer, GroupRefType groupRefType) throws IOException {
    final GroupType group = groups.get(groupRefType.getId().intValue());
    writeElement(writer, "component", 3, true, new KeyValue<>("name", group.getName()),
        new KeyValue<>("required",
            groupRefType.getPresence().equals(PresenceT.REQUIRED) ? "Y" : "N"));
    return writer;
  }

  private Writer writeGroup(Writer writer, GroupType groupType, boolean isRequired)
      throws IOException {
    writeElement(writer, "component", 2, false, new KeyValue<>("name", groupType.getName()));
    final FieldType numInGroupField = fields.get(groupType.getNumInGroup().getId().intValue());
    writeElement(writer, "group", 3, false, new KeyValue<>("name", numInGroupField.getName()),
        new KeyValue<>("required", isRequired ? "Y" : "N"));
    final List<Object> members = groupType.getComponentRefOrGroupRefOrFieldRef();
    for (final Object member : members) {
      if (member instanceof FieldRefType) {
        final FieldRefType fieldRefType = (FieldRefType) member;
        writeField(writer, fieldRefType);
      } else if (member instanceof GroupRefType) {
        final GroupRefType groupRefType = (GroupRefType) member;
        writeGroup(writer, groupRefType);
      } else if (member instanceof ComponentRefType) {
        final ComponentRefType componentRefType = (ComponentRefType) member;
        writeComponent(writer, componentRefType);
      }
    }
    writeElementEnd(writer, "group", 3);
    writeElementEnd(writer, "component", 2);
    return writer;
  }

  private Writer writeMessage(Writer writer, MessageType messageType) throws IOException {
    final boolean isAdminMessage = isAdmin(messageType.getCategory());
    final String msgcat = isAdminMessage ? "admin" : "app";
    writeElement(writer, "message", 2, false, new KeyValue<>("name", messageType.getName()),
        new KeyValue<>("msgtype", messageType.getMsgType()), new KeyValue<>("msgcat", msgcat));

    final List<Object> members = messageType.getStructure().getComponentRefOrGroupRefOrFieldRef();
    for (final Object member : members) {
      if (member instanceof FieldRefType) {
        final FieldRefType fieldRefType = (FieldRefType) member;
        writeField(writer, fieldRefType);
      } else if (member instanceof GroupRefType) {
        final GroupRefType groupRefType = (GroupRefType) member;
        writeGroup(writer, groupRefType);
      } else if (member instanceof ComponentRefType) {
        final ComponentRefType componentRefType = (ComponentRefType) member;
        final ComponentType componentType =
            components.get(((ComponentRefType) member).getId().intValue());
        if (!isAdminMessage && !isAdmin(componentType.getCategory())) {
          writeComponent(writer, componentRefType);
        }
      }
    }
    writeElementEnd(writer, "message", 2);
    return writer;
  }

}
