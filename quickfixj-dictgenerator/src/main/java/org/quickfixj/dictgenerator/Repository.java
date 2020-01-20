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

package org.quickfixj.dictgenerator;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Repository {

    private final File repository;
    private final Document components, enums, fields, msgContents, msgType;
    private final Map<String, MsgType> sessionMsgTypes = new TreeMap<>(), applicationMsgTypes = new TreeMap<>();
    private final Map<String, Field> allFields = new TreeMap<>();
    private final Map<String, Component> allComponents = new TreeMap<>();

    public Repository(File repositoryFile) throws Exception {
        this.repository = repositoryFile;
        Set<String> requiredFiles = new HashSet<>();
        requiredFiles.add("Components.xml");
        requiredFiles.add("Enums.xml");
        requiredFiles.add("Fields.xml");
        requiredFiles.add("MsgContents.xml");
        requiredFiles.add("MsgType.xml");
        for (File file : repository.listFiles()) {
            requiredFiles.remove(file.getName());
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
            String msgID = getSingleNodeTextSafe(node, "MsgID");
            String messageName = getSingleNodeTextSafe(node, "MessageName");
            String componentType = getSingleNodeTextSafe(node, "ComponentType");
            String category = getSingleNodeTextSafe(node, "Category");
            String msgType = getSingleNodeTextSafe(node, "MsgType");
            msgTypeMap.put(msgType, new MsgType(msgID, messageName, componentType, category, notReqXML, msgType));
        }

        System.out.println(getClass().getSimpleName() + ": " + msgTypeMap.size() + " MsgTypes found");

        // Add msgContents
        for (MsgType msgType : msgTypeMap.values()) {
            List<?> msgContentsNodes = getMsgContents(msgType.getMsgID());
            System.out.println("\t " + msgType.getName());
            for (Object o : msgContentsNodes) {
                Node node = (Node) o;
                String tagText = getSingleNodeTextSafe(node, "TagText");
                String reqd = getSingleNodeTextSafe(node, "Reqd");
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
            String tag = getSingleNodeTextSafe(node, "Tag");
            String fieldName = getSingleNodeTextSafe(node, "FieldName");
            System.out.println("\t " + fieldName + "(" + tag + ")");
            String type = getSingleNodeTextSafe(node, "Type");
            String desc = getSingleNodeTextSafe(node, "Desc");
            String notReqXML = getSingleNodeTextSafe(node, "NotReqXML");
            Field field = new Field(tag, fieldName, type, desc, notReqXML);
            allFields.put(field.getTag(), field);
            // Find enums
            List<?> enumNodes = enums.selectNodes("//dataroot/Enums[Tag=" + tag + "]");
            enumNodes.sort(new EnumNodeComparator());
            if (!enumNodes.isEmpty()) {
                for (Object enumO : enumNodes) {
                    Node enumNode = (Node) enumO;
                    String enumName = getSingleNodeTextSafe(enumNode, "Enum");
                    System.out.println("\t\t " + enumName);
                    String enumDesc = getSingleNodeTextSafe(enumNode, "Description");
                    field.addEnum(new Enum(enumName, enumDesc));
                }
            }
        }
        System.out.println(getClass().getSimpleName() + ": " + allFields.size() + " Fields found");
    }

    private String getSingleNodeTextSafe(Node node, String tag) {
        Node nodeWithTag = node.selectSingleNode(tag);
        if(nodeWithTag != null)
            return nodeWithTag.getText();
        else
            throw new RuntimeException("Node with tag "+tag+" not found in "+node.getPath());
    }

    private void initComponents() {
        System.out.println(getClass().getSimpleName() + ": Init Components...");
        List<?> componentNodes = components.selectNodes("//dataroot/Components");
        for (Object o : componentNodes) {
            Node node = (Node) o;
            String msgID = getSingleNodeTextSafe(node, "MsgID");
            String componentName = getSingleNodeTextSafe(node, "ComponentName");
            String componentType = getSingleNodeTextSafe(node, "ComponentType");
            String category = getSingleNodeTextSafe(node, "Category");
            String notReqXML = getSingleNodeTextSafe(node, "NotReqXML");
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
            String tagText = getSingleNodeTextSafe(node, "TagText");
            String reqd = getSingleNodeTextSafe(node, "Reqd");
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
        nodes.sort(new MsgContentNodeComparator());
        return nodes;
    }

    class MsgContentNodeComparator implements Comparator<Object> {
	@Override
        public int compare(Object o1, Object o2) {
            try {
                double pos1 = Double.parseDouble(getSingleNodeTextSafe((Node) o1, "Position"));
                double pos2 = Double.parseDouble(getSingleNodeTextSafe((Node) o2, "Position"));
                return Double.compare(pos1, pos2);
            } catch (Exception e) {
                return 0;
            }
        }
    }

    class EnumNodeComparator implements Comparator<Object> {
	@Override
        public int compare(Object o1, Object o2) {
            try {
                double pos1 = Double.parseDouble(getSingleNodeTextSafe((Node) o1, "Sort"));
                double pos2 = Double.parseDouble(getSingleNodeTextSafe((Node) o2, "Sort"));
                return Double.compare(pos1, pos2);
            } catch (Exception e) {
                return 0;
            }
        }
    }

}
