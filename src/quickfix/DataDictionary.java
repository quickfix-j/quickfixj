/*******************************************************************************
 * Copyright (c) 2001-2005 quickfixengine.org All rights reserved. 
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

package quickfix;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import quickfix.field.BeginString;
import quickfix.field.MsgType;
import quickfix.field.SessionRejectReason;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

/**
 * Contains the FIX message metadata for a specific FIX version. The data
 * dictionary can be customized by editing the input XML files.
 */
public class DataDictionary {
    private HashMap fieldSchemaByName = new HashMap();
    private HashMap fieldSchemaByTag = new HashMap();
    private HashMap componentSchemasByName = new HashMap();
    private AbstractMessageElementContainer headerFieldsByTag = new AbstractMessageElementContainer();
    private AbstractMessageElementContainer trailerFieldsByTag = new AbstractMessageElementContainer();
    private HashMap messages = new HashMap();
    private String version;
    private boolean doCheckFieldsOutofOrder = true;
    private boolean doCheckFieldsHaveValues = true;
    private boolean doCheckUserDefinedFields;
    private static final int USER_DEFINED_TAG_MIN = 5000;
    //private static final int USER_DEFINED_TAG_MAX = 9999;

    /**
     * Data dictionary-related exception.
     */
    public class Exception extends RuntimeException {

        public Exception(Throwable cause) {
            super(cause);
        }

        public Exception(String message) {
            super(message);
        }
    }

    /**
     * Construct a data dictionary from the XML located by the URL string.
     * 
     * @param url
     *            the URL string
     */
    public DataDictionary(String url) {
        try {
            load(new URL(url).openStream());
        } catch (RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new DataDictionary.Exception(e);
        }
    }

    /**
     * Construct a data dictionary from an input stream.
     * 
     * @param inputStream
     *            the input stream
     */
    public DataDictionary(InputStream inputStream) {
        load(inputStream);
    }

    /**
     * Construct a copy of a data dictionary. (Currently not implemented)
     * 
     * @param dataDictionary
     *            the source data dictionary
     */
    public DataDictionary(DataDictionary dataDictionary) {
        // TODO QUESTION check into usage of data dictionary copy
        throw new UnsupportedOperationException();
    }

    /**
     * Construct an empty data dictionary. (Currently not implemented)
     */
    public DataDictionary() {
        // TODO QUESTION check into usage of data dictionary default constructor
        throw new UnsupportedOperationException();
    }

    private FieldSchema getFieldSchema(String name) {
        return (FieldSchema) fieldSchemaByName.get(name);
    }

    private FieldSchema getFieldSchema(int tag) {
        return (FieldSchema) fieldSchemaByTag.get(new Integer(tag));
    }

    /**
     * Determines if a tag represents a valid field.
     * 
     * @param tag
     * @return true if tag is a field, false otherwise
     */
    public boolean isField(int tag) {
        return fieldSchemaByTag.containsKey(new Integer(tag));
    }

    /**
     * Retrieves the FIX version for this dictionary.
     * 
     * @return the FIX version ("FIX.4.2", for example)
     * @see quickfix.FixVersions
     */
    public String getVersion() {
        return version;
    }

    /**
     * Get the name of a field
     * 
     * @param field
     *            the integer tag for the field
     * @return the field's name or null if the field was not found
     */
    public String getFieldName(int field) {
        FieldSchema fieldSchema = getFieldSchema(field);
        return fieldSchema != null ? fieldSchema.getName() : null;
    }

    /**
     * Get the name of a field's enumerated value
     * 
     * @param field
     *            the integer tag for the field
     * @param value
     *            the field value
     * @return the human-friendly name for the field value
     */
    public String getValueName(int field, String value) {
        return getFieldSchema(field).getValueName(value);
    }

    /**
     * Predicate to determine if a message type code is valid.
     * 
     * @param msgType
     *            the message type code ("D" for order, for example)
     * @return true if message type code is valid, false otherwise
     */
    public boolean isMsgType(String msgType) {
        return messages.containsKey(msgType);
    }

    /**
     * Predicate to determine if field is valid for the specified message type
     * 
     * @param msgType
     *            the message type
     * @param field
     *            the integer tag for the field
     * @return true if the field is valid for the message type, false otherwise
     */
    public boolean isMsgField(String msgType, int field) {
        Message message = (Message) messages.get(msgType);
        return message != null ? message.isElementInContainer(Field.class, new Integer(field))
                : false;
    }

    private Message getMessage(String msgType) {
        Message message = (Message) messages.get(msgType);
        if (message == null) {
            throw new DataDictionary.Exception("unknown message type: " + msgType);
        }
        return message;
    }

    /**
     * Predicate to determine if a field is a header field
     * 
     * @param field
     *            integer tag for field
     * @return true if field is a header field, false otherwise
     */
    public boolean isHeaderField(int field) {
        return headerFieldsByTag.isElementInContainer(Field.class, new Integer(field));
    }

    /**
     * Predicate to determine if a field is a trailer field
     * 
     * @param field
     *            integer tag for field
     * @return true if field is a trailer field, false otherwise
     */
    public boolean isTrailerField(int field) {
        return trailerFieldsByTag.isElementInContainer(Field.class, new Integer(field));
    }

    /**
     * Predicate to determine if a field is required for a specified message
     * type.
     * 
     * @param msgType
     *            the message type
     * @param field
     *            the integer tag for the field
     * @return true if field is required for message type, false otherwise
     */
    public boolean isRequiredField(String msgType, int field) {
        return getMessage(msgType).isElementRequired(Field.class, new Integer(field));
    }

    /**
     * Predicate to determine if a field is an enumerated type (has values).
     * 
     * @param field
     *            the integer tag for the field
     * @return true if field has enumerated values, false otherwise.
     */
    public boolean hasFieldValue(int field) {
        return isField(field) && getFieldSchema(field).hasValues();
    }

    /**
     * Predicate to determine if a field value is valid.
     * 
     * @param field
     *            the integer tag for the field
     * @param value
     *            the enumerated value
     * @return true if field has the enumerated value, false otherwise.
     */
    public boolean isFieldValue(int field, String value) {
        return getFieldSchema(field).isValue(value);
    }

    /**
     * Predicate to determine if a field is in a field group.
     * 
     * @param msg
     *            the message type code
     * @param field
     *            the integer tag for the field
     * @return true if field is in a field group, false otherwise.
     */
    public boolean isGroup(String msg, int field) {
        return getMessage(msg).isElementInContainer(RepeatingGroup.class, new Integer(field));
    }

    RepeatingGroup getGroup(String msg, int field) {
        return (RepeatingGroup) getMessage(msg)
                .getElement(RepeatingGroup.class, new Integer(field));
    }

    FieldType getFieldTypeEnum(int field) {
        FieldSchema fieldSchema = getFieldSchema(field);
        return fieldSchema != null ? fieldSchema.getType() : null;
    }

    /**
     * Get the field type for a specified field.
     * 
     * @param field
     *            integer tag for field
     * @return the field type
     * 
     * <table class="doctable">
     * <tr>
     * <th>Value</th>
     * <th>Type</th>
     * </tr>
     * <tr>
     * <td>0</td>
     * <td>UNKNOWN</td>
     * </tr>
     * <tr>
     * <td>0</td>
     * <td>STRING</td>
     * </tr>
     * <tr>
     * <td>1</td>
     * <td>CHAR</td>
     * </tr>
     * <tr>
     * <td>2</td>
     * <td>PRICE</td>
     * </tr>
     * <tr>
     * <td>3</td>
     * <td>INT</td>
     * </tr>
     * <tr>
     * <td>4</td>
     * <td>AMT</td>
     * </tr>
     * <tr>
     * <td>5</td>
     * <td>QTY</td>
     * </tr>
     * <tr>
     * <td>6</td>
     * <td>CURRENCY</td>
     * </tr>
     * <tr>
     * <td>7</td>
     * <td>MULTIPLEVALUESTRING</td>
     * </tr>
     * <tr>
     * <td>8</td>
     * <td>EXCHANGE</td>
     * </tr>
     * <tr>
     * <td>9</td>
     * <td>UTCTIMESTAMP</td>
     * </tr>
     * <tr>
     * <td>10</td>
     * <td>BOOLEAN</td>
     * </tr>
     * <tr>
     * <td>11</td>
     * <td>LOCALMKTDATE</td>
     * </tr>
     * <tr>
     * <td>12</td>
     * <td>DATA</td>
     * </tr>
     * <tr>
     * <td>13</td>
     * <td>FLOAT</td>
     * </tr>
     * <tr>
     * <td>14</td>
     * <td>PRICEOFFSET</td>
     * </tr>
     * <tr>
     * <td>15</td>
     * <td>MONTHYEAR</td>
     * </tr>
     * <tr>
     * <td>16</td>
     * <td>DAYOFMONTH</td>
     * </tr>
     * <tr>
     * <td>17</td>
     * <td>UTCDATEONLY</td>
     * </tr>
     * <tr>
     * <td>18</td>
     * <td>UTCDATEONLY</td>
     * </tr>
     * <tr>
     * <td>19</td>
     * <td>UTCTIMEONLY</td>
     * </tr>
     * <tr>
     * <td>20</td>
     * <td>TIME</td>
     * </tr>
     * <tr>
     * <td>21</td>
     * <td>NUMINGROUP</td>
     * </tr>
     * <tr>
     * <td>22</td>
     * <td>PERCENTAGE</td>
     * </tr>
     * <tr>
     * <td>23</td>
     * <td>SEQNUM</td>
     * </tr>
     * <tr>
     * <td>24</td>
     * <td>LENGTH</td>
     * </tr>
     * <tr>
     * <td>25</td>
     * <td>COUNTRY</td>
     * </tr>
     * </table>
     */
    public int getFieldType(int field) {
        FieldType fieldTypeEnum = getFieldTypeEnum(field);
        return fieldTypeEnum != null ? fieldTypeEnum.getOrdinal() : 0;
    }

    void validate(quickfix.Message message) throws quickfix.FieldNotFound, InvalidMessage {
        String beginString = message.getHeader().getString(BeginString.FIELD);
        String msgType = message.getHeader().getString(MsgType.FIELD);

        if (version != null && !version.equals(beginString)) {
            throw new UnsupportedVersion();
        }

        // This is a little different than the C++ code
        if (doCheckFieldsOutofOrder && !message.hasValidStructure()) {
            throw new FieldException(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER,
                    message.getInvalidStructureTag());
        }

        if (version != null) {
            if (!isMsgType(msgType)) {
                throw new InvalidMessageType();
            }
            Message messageInfo = getMessage(message.getHeader().getString(MsgType.FIELD));
            checkRequiredFields(message.getHeader(), headerFieldsByTag.getRequiredElements());
            checkRequiredFields(message, messageInfo.getRequiredElements());
            checkRequiredFields(message.getTrailer(), trailerFieldsByTag.getRequiredElements());
        }

        checkFields(message.getHeader(), msgType);
        checkFields(message.getTrailer(), msgType);
        checkFields(message, msgType);
    }

    private void checkFields(FieldMap map, String msgType) throws InvalidMessage {
        Iterator i = map.iterator();
        int previousTag = -1;
        while (i.hasNext()) {
            StringField field = (StringField) i.next();
            int tag = field.getTag();
            if (previousTag >= 0 && tag == previousTag) {
                throw new FieldException(SessionRejectReason.TAG_APPEARS_MORE_THAN_ONCE, tag);
            }
            if (doCheckFieldsHaveValues
                    && (field.getValue() == null || field.getValue().length() == 0)) {
                throw new FieldException(SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE, tag);
            }

            if (version != null) {
                checkValidFormat(field);
                checkEnumValue(field);
            }

            if (shouldCheckTag(tag)) {
                if (!isField(tag)) {
                    throw new FieldException(SessionRejectReason.INVALID_TAG_NUMBER, tag);
                }

                if (!isHeaderField(tag) && !isTrailerField(tag)) {
                    if (!isMsgField(msgType, tag)) {
                        throw new FieldException(
                                SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE, tag);
                    }
                    if (isGroup(msgType, tag)) {
                        try {
                            if (map.getGroupCount(tag) != IntConverter.convert(field.getValue())) {
                                throw new FieldException(
                                        SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                                        tag);
                            }
                        } catch (FieldConvertError e) {
                            throw new InvalidMessage(e.getMessage());
                        }
                    }
                }
            }
            previousTag = tag;
        }
    }

    private void checkEnumValue(StringField field) {
        int tag = field.getTag();
        if (hasFieldValue(tag)) {
            if (!isFieldValue(tag, field.getValue())) {
                throw new FieldException(SessionRejectReason.VALUE_IS_INCORRECT, tag);
            }
        }
    }

    private void checkValidFormat(StringField field) {
        try {
            FieldType fieldType = getFieldTypeEnum(field.getTag());
            if (fieldType == FieldType.String) {
                // String
            } else if (fieldType == FieldType.Char) {
                if (version.compareTo(FixVersions.BEGINSTRING_FIX41) > 0) {
                    CharConverter.convert(field.getValue());
                } else {
                    // String, for older FIX versions
                }
            } else if (fieldType == FieldType.Price) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Int) {
                IntConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Amt) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Qty) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Qty) {
                // String
            } else if (fieldType == FieldType.MultipleValueString) {
                // String
            } else if (fieldType == FieldType.Exchange) {
                // String
            } else if (fieldType == FieldType.Boolean) {
                BooleanConverter.convert(field.getValue());
            } else if (fieldType == FieldType.LocalMktDate) {
                // String
            } else if (fieldType == FieldType.Data) {
                // String
            } else if (fieldType == FieldType.Float) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.PriceOffset) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.MonthYear) {
                // String
            } else if (fieldType == FieldType.DayOfMonth) {
                // String
            } else if (fieldType == FieldType.UtcDate) {
                UtcDateOnlyConverter.convert(field.getValue());
            } else if (fieldType == FieldType.UtcTimeOnly) {
                UtcTimeOnlyConverter.convert(field.getValue());
            } else if (fieldType == FieldType.UtcTimeStamp || fieldType == FieldType.Time) {
                UtcTimestampConverter.convert(field.getValue());
            } else if (fieldType == FieldType.NumInGroup) {
                IntConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Percentage) {
                DoubleConverter.convert(field.getValue());
            } else if (fieldType == FieldType.SeqNum) {
                IntConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Length) {
                IntConverter.convert(field.getValue());
            } else if (fieldType == FieldType.Country) {
                // String
            }
        } catch (FieldConvertError e) {
            throw new FieldException(SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE, e
                    .getMessage(), field.getTag());
        }
    }

    private void checkRequiredFields(FieldMap fieldMap, List requiredElements)
            throws quickfix.FieldNotFound {
        for (int i = 0; i < requiredElements.size(); i++) {
            Object element = requiredElements.get(i);
            if (element instanceof Field) {
                int tag = ((Integer) ((Field) element).getKey()).intValue();
                if (!fieldMap.isSetField(tag)) {
                    throw new RequiredTagMissing(tag);
                }
            } else if (element instanceof Component) {
                ComponentSchema schema = ((Component) element).getSchema();
                checkRequiredFields(fieldMap, schema.getRequiredElements());
            }
        }
    }

    private void load(InputStream inputStream) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            readVersion(document);
            readFieldSchemas(document);
            readComponentSchemas(document);
            readMessageElements(getElement(document, "header"), headerFieldsByTag);
            readMessageElements(getElement(document, "trailer"), trailerFieldsByTag);
            readMessages(document);
        } catch (ParserConfigurationException e) {
            System.out.println(e.toString());
        } catch (SAXException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    private Element getElement(Document document, String tagname) {
        NodeList elements = document.getElementsByTagName(tagname);
        if (elements.getLength() == 0) {
            return null;
        }
        return (Element) elements.item(0);
    }

    private void readMessages(Document document) {
        NodeList messages = getElement(document, "messages").getElementsByTagName("message");
        for (int i = 0; i < messages.getLength(); i++) {
            Element messageElement = (Element) messages.item(i);
            String name = getAttributeValue(messageElement, "name");
            String msgtype = getAttributeValue(messageElement, "msgtype");
            String msgcat = getAttributeValue(messageElement, "msgcat");
            Message message = new Message(name, msgtype, msgcat);
            this.messages.put(message.getType(), message);
            readMessageElements(messageElement, message);
        }
    }

    private void readMessageElements(Element element, AbstractMessageElementContainer container) {
        for (Node node = element.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node instanceof Element) {
                Element e = (Element) node;
                MessageElement messageElement = null;
                if (node.getNodeName().equals("field")) {
                    String fieldName = getAttributeValue(e, "name");
                    FieldSchema schema = getFieldSchema(fieldName);
                    boolean isRequired = getAttributeValue(e, "required").equals("Y");
                    messageElement = new Field(schema, isRequired);
                } else if (node.getNodeName().equals("group")) {
                    String name = getAttributeValue(e, "name");
                    FieldSchema schema = getFieldSchema(name);
                    boolean isRequired = getAttributeValue(e, "required").equals("Y");
                    Field countField = new Field(schema, isRequired);
                    container.addElement(countField);
                    messageElement = new RepeatingGroup(countField);
                    readMessageElements(e, (AbstractMessageElementContainer) messageElement);
                } else if (node.getNodeName().equals("component")) {
                    String name = getAttributeValue(e, "name");
                    ComponentSchema schema = getComponentSchema(name);
                    // TODO CLEANUP Handle data dictionary error
                    if (schema == null) {
                        throw new RuntimeException("no schema for component: " + name);
                    }
                    boolean isRequired = getAttributeValue(e, "required").equals("Y");
                    messageElement = new Component(name, schema, isRequired);
                }
                if (messageElement != null) {
                    container.addElement(messageElement);
                }
            }
        }
    }

    private ComponentSchema getComponentSchema(String name) {
        return (ComponentSchema) componentSchemasByName.get(name);
    }

    private void readFieldSchemas(Document document) {
        NodeList nodes = document.getElementsByTagName("field");
        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String parentNodeName = nodes.item(i).getParentNode().getNodeName();
                if (parentNodeName.equals("fields")) {
                    String name = getAttributeValue(nodes.item(i), "name");
                    int number = Integer.parseInt(getAttributeValue(nodes.item(i), "number"));
                    FieldType type = FieldType.fromName(version, getAttributeValue(nodes.item(i),
                            "type"));
                    FieldSchema schema = new FieldSchema(name, type, number);
                    fieldSchemaByName.put(schema.getName(), schema);
                    fieldSchemaByTag.put(new Integer(schema.getNumber()), schema);
                    //System.out.println("adding schema: " + schema);
                    Element fieldNode = (Element) nodes.item(i);
                    NodeList values = fieldNode.getElementsByTagName("value");
                    for (int j = 0; j < values.getLength(); j++) {
                        String enumValue = getAttributeValue(values.item(j), "enum");
                        String enumDescription = getAttributeValue(values.item(j), "description");
                        schema.addValue(enumValue, enumDescription);
                    }
                }
            }
        }
    }

    private void readComponentSchemas(Document document) {
        Element components = getElement(document, "components");
        if (components != null) {
            NodeList nodes = components.getElementsByTagName("component");
            /**
             * Some of the component schemas reference other forward-declared
             * component schemas. Therefore we must do two passes over the
             * component schema definitions.
             */
            for (int i = 0; i < nodes.getLength(); i++) {
                String name = getAttributeValue(nodes.item(i), "name");
                ComponentSchema schema = new ComponentSchema();
                componentSchemasByName.put(name, schema);
            }
            for (int i = 0; i < nodes.getLength(); i++) {
                String name = getAttributeValue(nodes.item(i), "name");
                ComponentSchema schema = getComponentSchema(name);
                readMessageElements((Element) nodes.item(i), schema);
            }
        }
    }

    private void readVersion(Document document) {
        String majorVersion = getAttributeValue(document.getDocumentElement(), "major");
        String minorVersion = getAttributeValue(document.getDocumentElement(), "minor");
        version = "FIX." + majorVersion + "." + minorVersion;
    }

    private String getAttributeValue(Node node, String name) {
        return node.getAttributes().getNamedItem(name).getNodeValue();
    }

    public boolean isDataField(int tag) {
        return getFieldTypeEnum(tag) == FieldType.Data;
    }

    /**
     * Controls whether empty fields are checked.
     * 
     * @param doCheckFieldsHaveValues
     *            if true, check the values.
     */
    public void setCheckFieldsHaveValues(boolean doCheckFieldsHaveValues) {
        this.doCheckFieldsHaveValues = doCheckFieldsHaveValues;
    }

    /**
     * Controls whether field order is checked. More specifically, this checks
     * if the fields are in the right header, body, trailer section of the
     * message.
     * 
     * @param doCheckFieldsOutofOrder
     *            if true, check the order.
     */
    public void setCheckFieldsOutofOrder(boolean doCheckFieldsOutofOrder) {
        this.doCheckFieldsOutofOrder = doCheckFieldsOutofOrder;
    }

    class Field implements MessageElement {
        private FieldSchema fieldSchema;
        private boolean isRequired;

        public Field(FieldSchema fieldSchema, boolean isRequired) {
            this.fieldSchema = fieldSchema;
            this.isRequired = isRequired;
        }

        public Object getKey() {
            return new Integer(fieldSchema.getNumber());
        }

        public boolean isRequired() {
            return isRequired;
        }

        public String toString() {
            return "field:" + fieldSchema.getName();
        }

        public String getName() {
            return fieldSchema.getName();
        }
    }

    private class FieldSchema {
        private String name;
        private int number;
        private FieldType type;
        private boolean isHeaderField;
        private boolean isTrailerField;
        private HashMap enumValueToDescription;

        public String toString() {
            return getClass().getName() + ":" + name;
        }

        public FieldSchema(String name, FieldType type, int number) {
            this.name = name;
            this.type = type;
            this.number = number;
        }

        public boolean isTrailerField() {
            return isTrailerField;
        }

        public boolean isHeaderField() {
            return isHeaderField;
        }

        public FieldSchema(String name) {
            this.name = name;
        }

        public FieldSchema(int number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHeaderField(boolean isHeaderField) {
            this.isHeaderField = isHeaderField;

        }

        public void setTrailerField(boolean isTrailerField) {
            this.isTrailerField = isTrailerField;
        }

        public String getName() {
            return name;
        }

        public boolean hasValues() {
            return enumValueToDescription != null;
        }

        public String getValueName(String value) {
            return (String) enumValueToDescription.get(value);
        }

        public boolean isValue(String value) {
            return enumValueToDescription.containsKey(value);
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public FieldType getType() {
            return type;
        }

        public void setType(FieldType type) {
            this.type = type;
        }

        public void addValue(String enumValue, String enumDescription) {
            if (enumValueToDescription == null) {
                enumValueToDescription = new HashMap();
            }
            enumValueToDescription.put(enumValue, enumDescription);
        }
    }

    private class Message extends AbstractMessageElementContainer {
        private String name;
        private String type;
        private String category;

        public Message(String name, String msgtype, String msgcat) {
            this.name = name;
            this.type = msgtype;
            this.category = msgcat;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String toString() {
            return "message:" + name + "(" + type + ")";
        }

        public boolean isField(int tag) {
            return isElementInContainer(Field.class, new Integer(tag));
        }
    }

    class RepeatingGroup extends AbstractMessageElementContainer implements MessageElement {
        private Field countField;

        public RepeatingGroup(Field count) {
            this.countField = count;
        }

        public Object getKey() {
            return countField.getKey();
        }

        public String toString() {
            return "group:" + countField.getName();
        }

        public boolean isRequired() {
            return countField.isRequired();
        }
    }

    private interface MessageElement {
        Object getKey();

        boolean isRequired();
    }

    private interface MessageElementContainer {
        public Field getFirstField();

        public boolean isElementInContainer(Class elementClass, Object key);

        public MessageElement getElement(Class elementClass, Object key);
    }

    private class AbstractMessageElementContainer implements MessageElementContainer {
        private HashMap elementMap = new HashMap();
        private List requiredElements = new ArrayList();
        private MessageElement firstElement = null;

        public void addElement(MessageElement element) {
            Map elementsOfClass = (Map) elementMap.get(element.getClass());
            if (elementsOfClass == null) {
                elementsOfClass = new HashMap();
                elementMap.put(element.getClass(), elementsOfClass);
            }
            elementsOfClass.put(element.getKey(), element);
            if (firstElement == null) {
                firstElement = element;
            }
            if (element.isRequired()) {
                requiredElements.add(element);
            }
        }

        public List getRequiredElements() {
            return requiredElements;
        }

        public boolean isElementInContainer(Class elementClass, Object key) {
            Map elementsOfClass = (Map) elementMap.get(elementClass);
            boolean foundElement = elementsOfClass != null && elementsOfClass.containsKey(key);
            for (Iterator iter = elementMap.keySet().iterator(); iter.hasNext() && !foundElement;) {
                Class containerClass = (Class) iter.next();
                if (MessageElementContainer.class.isAssignableFrom(containerClass)) {
                    elementsOfClass = (Map) elementMap.get(containerClass);
                    for (Iterator iter2 = elementsOfClass.values().iterator(); iter2.hasNext()
                            && !foundElement;) {
                        foundElement = ((MessageElementContainer) iter2.next())
                                .isElementInContainer(elementClass, key);
                    }
                }
            }
            return foundElement;
        }

        public MessageElement getElement(Class elementClass, Object key) {
            MessageElement element = null;
            Map elementsOfClass = (Map) elementMap.get(elementClass);
            if (elementsOfClass != null) {
                element = (MessageElement) elementsOfClass.get(key);
                if (element == null) {
                    elementsOfClass = (Map) elementMap.get(Component.class);
                    Iterator components = elementsOfClass.values().iterator();
                    while (components.hasNext()) {
                        Component c = (Component) components.next();
                        element = c.getElement(elementClass, key);
                        if (element != null) {
                            break;
                        }
                    }
                }
            }
            return element;
        }

        public boolean isElementRequired(Class elementClass, Object key) {
            return getElement(elementClass, key).isRequired();
        }

        public Field getFirstField() {
            return firstElement instanceof Field ? (Field) firstElement
                    : (firstElement instanceof MessageElementContainer ? ((MessageElementContainer) firstElement)
                            .getFirstField()
                            : null);
        }
    }

    private class Component implements MessageElement, MessageElementContainer {
        private boolean isRequired;
        private String name;
        private ComponentSchema schema;

        public Component(String name, ComponentSchema schema, boolean isRequired) {
            this.name = name;
            this.isRequired = isRequired;
            this.schema = schema;
        }

        public String getName() {
            return name;
        }

        public boolean isRequired() {
            return isRequired;
        }

        public Object getKey() {
            return name;
        }

        public String toString() {
            return "component:" + name;
        }

        public Field getFirstField() {
            return schema.getFirstField();
        }

        public boolean isElementInContainer(Class elementClass, Object key) {
            return schema.isElementInContainer(elementClass, key);
        }

        private ComponentSchema getSchema() {
            return schema;
        }

        public MessageElement getElement(Class elementClass, Object key) {
            return schema.getElement(elementClass, key);
        }
    }

    private class ComponentSchema extends AbstractMessageElementContainer {

    }

    void setCheckUserDefinedFields(boolean flag) {
        doCheckUserDefinedFields = flag;
    }
    
    private boolean shouldCheckTag( int tag )
    {
        return doCheckUserDefinedFields || tag < USER_DEFINED_TAG_MIN;
    }

}