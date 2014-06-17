package org.quickfixj.dictgenerator;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Repository {

    private final File repository;
    private final Document components, enums, fields, msgContents, msgType;
    private final Map<String, MsgType> sessionMsgTypes = new TreeMap<String, MsgType>(), applicationMsgTypes = new TreeMap<String, MsgType>();
    private final Map<String, Field> allFields = new TreeMap<String, Field>();
    private final Map<String, Component> allComponents = new TreeMap<String, Component>();

    public Repository(File repositoryFile) throws Exception {
        this.repository = repositoryFile;
        Set<String> requiredFiles = new HashSet<String>();
        requiredFiles.add("Components.xml");
        requiredFiles.add("Enums.xml");
        requiredFiles.add("Fields.xml");
        requiredFiles.add("MsgContents.xml");
        requiredFiles.add("MsgType.xml");
        for (File file : repository.listFiles()) {
            if (requiredFiles.contains(file.getName())) {
                requiredFiles.remove(file.getName());
            }
        }
        if (!requiredFiles.isEmpty()) {
            throw new Exception("Invalid repository: Missing required files: " + requiredFiles);
        }

        SAXReader reader = new SAXReader();
        components = reader.read(new File(repository, "Components.xml"));
        enums = reader.read(new File(repository, "Enums.xml"));
        fields = reader.read(new File(repository, "Fields.xml"));
        msgContents = reader.read(new File(repository, "MsgContents.xml"));
        msgType = reader.read(new File(repository, "MsgType.xml"));

        initFields();
        initComponents();
        initMsgTypes(sessionMsgTypes, "1");
        initMsgTypes(applicationMsgTypes, "0");
    }

    public final Map<String, MsgType> getSessionMsgTypes() {
        return sessionMsgTypes;
    }

    public final Component getStandardHeader(MsgType msgType) {
        for (Object o : msgType.getMsgContent()) {
            if (o instanceof Component && ((Component) o).isStandardHeader()) {
                return (Component) o;
            }
        }
        return null;
    }

    public final Component getStandardTrailer(MsgType msgType) {
        for (Object o : msgType.getMsgContent()) {
            if (o instanceof Component && ((Component) o).isStandardTrailer()) {
                return (Component) o;
            }
        }
        return null;
    }

    public final Map<String, MsgType> getApplicationMsgTypes() {
        return applicationMsgTypes;
    }

    public final Map<String, Field> getFields() {
        return allFields;
    }

    public final Map<String, Component> getComponents() {
        return allComponents;
    }

    private void initMsgTypes(Map<String, MsgType> msgTypeMap, String notReqXML) {
        System.out.println(getClass().getSimpleName() + ": Init MsgTypes (" + notReqXML + ")...");
        List<?> msgTypeNodes = msgType.selectNodes("//dataroot/MsgType[NotReqXML=" + notReqXML + "]");
        for (Object o : msgTypeNodes) {
            Node node = (Node) o;
            String msgID = node.selectSingleNode("MsgID").getText();
            String messageName = node.selectSingleNode("MessageName").getText();
            String componentType = node.selectSingleNode("ComponentType").getText();
            String category = node.selectSingleNode("Category").getText();
            String msgType = node.selectSingleNode("MsgType").getText();
            msgTypeMap.put(msgType, new MsgType(msgID, messageName, componentType, category, notReqXML, msgType));
        }

        System.out.println(getClass().getSimpleName() + ": " + msgTypeMap.size() + " MsgTypes found");

        // Add msgContents
        for (MsgType msgType : msgTypeMap.values()) {
            List<?> msgContentsNodes = getMsgContents(msgType.getMsgID());
            System.out.println("\t " + msgType.getName());
            for (Object o : msgContentsNodes) {
                Node node = (Node) o;
                String tagText = node.selectSingleNode("TagText").getText();
                String reqd = node.selectSingleNode("Reqd").getText();
                //if (allFields.containsKey(tagText) && notReqXML.equals(allFields.get(tagText).getNotReqXML())) {
                if (allFields.containsKey(tagText)) {
                    MsgTypeField msgTypeField = new MsgTypeField(allFields.get(tagText), reqd);
                    msgType.addMsgContent(msgTypeField);
                    System.out.println("\t\t " + allFields.get(tagText).getFieldName());
                //} else if (allComponents.containsKey(tagText) && notReqXML.equals(allComponents.get(tagText).getNotReqXML())) {
                } else if (allComponents.containsKey(tagText)) {
                    MsgTypeComponent msgTypeComponent = new MsgTypeComponent(allComponents.get(tagText), reqd);
                    msgType.addMsgContent(msgTypeComponent);
                    System.out.println("\t\t " + allComponents.get(tagText).getName());
                } else {
                    System.err.println("Could not find tagText: " + tagText);
                }
            }
        }
    }

    private void initFields() {
        System.out.println(getClass().getSimpleName() + ": Init Fields...");
        List<?> fieldNodes = fields.selectNodes("//dataroot/Fields");
        for (Object o : fieldNodes) {
            Node node = (Node) o;
            String tag = node.selectSingleNode("Tag").getText();
            String fieldName = node.selectSingleNode("FieldName").getText();
            System.out.println("\t " + fieldName + "(" + tag + ")");
            String type = node.selectSingleNode("Type").getText();
            String desc = node.selectSingleNode("Desc").getText();
            String notReqXML = node.selectSingleNode("NotReqXML").getText();
            Field field = new Field(tag, fieldName, type, desc, notReqXML);
            allFields.put(field.getTag(), field);
            // Find enums
            List<?> enumNodes = enums.selectNodes("//dataroot/Enums[Tag=" + tag + "]");
            Collections.sort(enumNodes, new EnumNodeComparator());
            if (!enumNodes.isEmpty()) {
                for (Object enumO : enumNodes) {
                    Node enumNode = (Node) enumO;
                    String enumName = enumNode.selectSingleNode("Enum").getText();
                    System.out.println("\t\t " + enumName);
                    String enumDesc = enumNode.selectSingleNode("Description").getText();
                    field.addEnum(new Enum(enumName, enumDesc));
                }
            }
        }
        System.out.println(getClass().getSimpleName() + ": " + allFields.size() + " Fields found");
    }

    private void initComponents() {
        System.out.println(getClass().getSimpleName() + ": Init Components...");
        List<?> componentNodes = components.selectNodes("//dataroot/Components");
        for (Object o : componentNodes) {
            Node node = (Node) o;
            String msgID = node.selectSingleNode("MsgID").getText();
            String componentName = node.selectSingleNode("ComponentName").getText();
            String componentType = node.selectSingleNode("ComponentType").getText();
            String category = node.selectSingleNode("Category").getText();
            String notReqXML = node.selectSingleNode("NotReqXML").getText();
            allComponents.put(componentName, new Component(msgID, componentName, componentType, category, notReqXML));
        }

        System.out.println(getClass().getSimpleName() + ": " + allComponents.size() + " Components found");

        // Add msgContents
        for (Component component : allComponents.values()) {
            addComponentMsgContent(component, "\t");
        }
    }

    private void addComponentMsgContent(Component component, String prefix) {
        List<?> msgContentsNodes = getMsgContents(component.getMsgID());
        System.out.println(prefix + " " + component.getName());
        if (!component.getMsgContent().isEmpty()) {
            System.out.println(prefix + "\talready handled, return");
            return;
        }
        for (Object o : msgContentsNodes) {
            Node node = (Node) o;
            String tagText = node.selectSingleNode("TagText").getText();
            String reqd = node.selectSingleNode("Reqd").getText();
            if (allFields.containsKey(tagText)) {
                ComponentField componentField = new ComponentField(allFields.get(tagText), reqd);
                component.addMsgContent(componentField);
                System.out.println(prefix + "\t " + allFields.get(tagText).getFieldName());
            } else if (allComponents.containsKey(tagText)) {
                // Handle msgContents for the component in question first!
                addComponentMsgContent(allComponents.get(tagText), prefix + "\t");
                ComponentComponent componentComponent = new ComponentComponent(allComponents.get(tagText), reqd);
                component.addMsgContent(componentComponent);
                System.out.println(prefix + "\t " + allComponents.get(tagText).getName());
            } else {
                System.err.println("Could not find tagText: " + tagText);
            }
        }
    }

    private List<?> getMsgContents(String msgID) {
        List<?> nodes = msgContents.selectNodes("//dataroot/MsgContents[MsgID=" + msgID + "]");
        Collections.sort(nodes, new MsgContentNodeComparator());
        return nodes;
    }

    class MsgContentNodeComparator implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            try {
                Double pos1 = Double.parseDouble(((Node) o1).selectSingleNode("Position").getText());
                Double pos2 = Double.parseDouble(((Node) o2).selectSingleNode("Position").getText());
                return pos1.compareTo(pos2);
            } catch (Exception e) {
                return 0;
            }
        }
    }

    class EnumNodeComparator implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            try {
                Double pos1 = Double.parseDouble(((Node) o1).selectSingleNode("Sort").getText());
                Double pos2 = Double.parseDouble(((Node) o2).selectSingleNode("Sort").getText());
                return pos1.compareTo(pos2);
            } catch (Exception e) {
                return 0;
            }
        }
    }

}
