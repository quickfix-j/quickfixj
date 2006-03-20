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

package quickfix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
 * Provide the message metadata for various versions of FIX.
 * 
 */
public class DataDictionary {
    private static final int USER_DEFINED_TAG_MIN = 5000;

    private static final String NO = "N";

    private boolean hasVersion = false;

    private boolean checkFieldsOutOfOrder = true;

    private boolean checkFieldsHaveValues = true;

    private boolean checkUserDefinedFields = true;

    private String beginString;

    private Map messageFields = new HashMap();

    private Map requiredFields = new HashMap();

    private Set messages = new HashSet();

    private Set fields = new HashSet();

    private List orderedFields = new ArrayList();

    private int[] orderedFieldsArray;

    private Map headerFields = new HashMap();

    private Map trailerFields = new HashMap();

    private Map fieldTypes = new HashMap();

    private Map fieldValues = new HashMap();

    private Map fieldNames = new HashMap();

    private Map names = new HashMap();

    private Map valueNames = new HashMap();

    private Map groups = new HashMap();

    private Map components = new HashMap();

    private DataDictionary() {
    }

    /**
     * Initialize a data dictionary from a URL or a file path.
     * 
     * @param location
     *            a URL or file system path
     * @throws ConfigError
     */
    public DataDictionary(String location) throws ConfigError {
        this();
        readFromURL(location);
    }

    /**
     * Initialize a data dictionary from an input stream.
     * 
     * @param in
     *            the input stream
     * @throws ConfigError
     */
    public DataDictionary(InputStream in) throws ConfigError {
        load(in);
    }

    /**
     * Copy a data dictionary.
     * 
     * @param source
     *            the source dictionary that will be copied into this dictionary
     */
    public DataDictionary(DataDictionary source) {
        copyFrom(source);
    }

    private void setVersion(String beginString) {
        this.beginString = beginString;
        hasVersion = true;
    }

    /**
     * Get the FIX version associated with this dictionary.
     * 
     * @return the FIX version
     */
    public String getVersion() {
        return beginString;
    }

    private void addField(int field) {
        fields.add(new Integer(field));
    }

    private void addFieldName(int field, String name) throws ConfigError {
        if (names.put(name, new Integer(field)) != null) {
            throw new ConfigError("Field named " + name + " defined multiple times");
        }
        fieldNames.put(new Integer(field), name);
    }

    /**
     * Get the field name for a specified tag.
     * 
     * @param field
     *            the tag
     * @return the field name
     */
    public String getFieldName(int field) {
        return (String) fieldNames.get(new Integer(field));
    }

    private void addValueName(int field, String value, String name) {
        valueNames.put(new IntStringPair(field, value), name);
    }

    /**
     * Get the value name, if any, for an enumerated field value.
     * 
     * @param field
     *            the tag
     * @param value
     *            the value
     * @return the value's name
     */
    public String getValueName(int field, String value) {
        return (String) valueNames.get(new IntStringPair(field, value));
    }

    /**
     * Predicate for determining if a tag is a defined field.
     * 
     * @param field
     *            the tag
     * @return true if the field is defined, false otherwise
     */
    public boolean isField(int field) {
        return fields.contains(new Integer(field));
    }

    /**
     * Return the field type for a field.
     * 
     * @param field
     *            the tag
     * @return the field type
     */
    public FieldType getFieldTypeEnum(int field) {
        return (FieldType) fieldTypes.get(new Integer(field));
    }

    private void addMsgType(String msgType) {
        messages.add(msgType);
    }

    /**
     * Predicate for determining if message type is valid for a specified FIX
     * version.
     * 
     * @param msgType
     *            the message type value
     * @return true if the message type if defined, false otherwise
     */
    public boolean isMsgType(String msgType) {
        return messages.contains(msgType);
    }

    private void addMsgField(String msgType, int field) {
        Set fields = (Set) messageFields.get(msgType);
        if (fields == null) {
            fields = new HashSet();
            messageFields.put(msgType, fields);
        }
        fields.add(new Integer(field));
    }

    /**
     * Predicate for determining if a field is valid for a given message type.
     * 
     * @param msgType
     *            the message type
     * @param field
     *            the tag
     * @return true if field is defined for message, false otherwise.
     */
    public boolean isMsgField(String msgType, int field) {
        Set fields = (Set) messageFields.get(msgType);
        return fields != null & fields.contains(new Integer(field));
    }

    private void addHeaderField(int field, boolean required) {
        headerFields.put(new Integer(field), required ? Boolean.TRUE : Boolean.FALSE);
    }

    /**
     * Predicate for determining if field is a header field.
     * 
     * @param field
     *            the tag
     * @return true if field is a header field, false otherwise.
     */
    public boolean isHeaderField(int field) {
        return headerFields.containsKey(new Integer(field));
    }

    private void addTrailerField(int field, boolean required) {
        trailerFields.put(new Integer(field), required ? Boolean.TRUE : Boolean.FALSE);

    }

    /**
     * Predicate for determining if field is a trailer field.
     * 
     * @param field
     *            the tag
     * @return true if field is a trailer field, false otherwise.
     */
    public boolean isTrailerField(int field) {
        return trailerFields.containsKey(new Integer(field));
    }

    private void addFieldType(int field, FieldType fieldType) {
        fieldTypes.put(new Integer(field), fieldType);
    }

    /**
     * Get the field type for a field.
     * 
     * @param field
     *            a tag
     * @return the field type
     * @see #getFieldTypeEnum
     */
    public int getFieldType(int field) {
        return getFieldTypeEnum(field).getOrdinal();
    }

    /**
     * Get the field tag given a field name.
     * 
     * @param name
     *            the field name
     * @return the tag
     */
    public int getFieldTag(String name) {
        Integer tag = (Integer) names.get(name);
        return tag != null ? tag.intValue() : -1;
    }

    private void addRequiredField(String msgType, int field) {
        Set fields = (Set) requiredFields.get(msgType);
        if (fields == null) {
            fields = new HashSet();
            requiredFields.put(msgType, fields);
        }
        fields.add(new Integer(field));
    }

    /**
     * Predicate for determining if a field is required for a message type
     * 
     * @param msgType
     *            the message type
     * @param field
     *            the tag
     * @return true if field is required, false otherwise
     */
    public boolean isRequiredField(String msgType, int field) {
        Set fields = (Set) requiredFields.get(msgType);
        return fields != null && fields.contains(new Integer(field));
    }

    private void addFieldValue(int field, String value) {
        Integer key = new Integer(field);
        Set values = (Set) fieldValues.get(key);
        if (values == null) {
            values = new HashSet();
            fieldValues.put(key, values);
        }
        values.add(value);
    }

    /**
     * Predicate for determining if a field has enumerated values.
     * 
     * @param field
     *            the tag
     * @return true if field is enumerated, false otherwise
     */
    public boolean hasFieldValue(int field) {
        Set values = (Set) fieldValues.get(new Integer(field));
        return values != null && values.size() > 0;
    }

    /**
     * Predicate for determining if a field value is valid
     * 
     * @param field
     *            the tag
     * @param value
     *            a possible field value
     * @return true if field value is valid, false otherwise
     */
    public boolean isFieldValue(int field, String value) {
        Set validValues = (Set) fieldValues.get(new Integer(field));
        if (validValues == null || validValues.size() == 0) {
            return false;
        }

        if (!isMultipleValueStringField(field)) {
            return validValues.contains(value);
        }

        // MultipleValueString
        String[] values = value.split(" ");
        for (int i = 0; i < values.length; i++) {
            if (!validValues.contains(values[i])) {
                return false;
            }
        }

        return true;
    }

    private void addGroup(String msg, int field, int delim, DataDictionary dataDictionary) {
        groups.put(new IntStringPair(field, msg), new GroupInfo(delim, dataDictionary));
    }

    /**
     * Predicate for determining if a field is a group delimeter for a message
     * type.
     * 
     * @param msg
     *            the message type
     * @param field
     *            the tag
     * @return true if field starts a repeating group, false otherwise
     */
    public boolean isGroup(String msg, int field) {
        return groups.containsKey(new IntStringPair(field, msg));
    }

    /**
     * Get repeating group metadata.
     * 
     * @param msg
     *            the message type
     * @param field
     *            the tag
     * @return an object containing group-related metadata
     */
    public GroupInfo getGroup(String msg, int field) {
        return (GroupInfo) groups.get(new IntStringPair(field, msg));
    }

    /**
     * Predicate for determining if a field is a FIX raw data field.
     * 
     * @param field
     *            the tag
     * @return true if field is a raw data field, false otherwise
     */
    public boolean isDataField(int field) {
        return fieldTypes.get(new Integer(field)) == FieldType.Data;
    }

    private boolean isMultipleValueStringField(int field) {
        return fieldTypes.get(new Integer(field)) == FieldType.MultipleValueString;
    }

    /**
     * Controls whether out of order fields are checked.
     * 
     * @param flag
     *            true = checked, false = not checked
     */
    public void setCheckFieldsOutOfOrder(boolean flag) {
        checkFieldsOutOfOrder = flag;
    }

    /**
     * Controls whether empty field values are checked.
     * 
     * @param flag
     *            true = checked, false = not checked
     */
    public void setCheckFieldsHaveValues(boolean flag) {
        checkFieldsHaveValues = flag;
    }

    /**
     * Controls whether user defined fields are checked.
     * 
     * @param flag
     *            true = checked, false = not checked
     */
    public void setCheckUserDefinedFields(boolean flag) {
        checkUserDefinedFields = flag;
    }

    private void copyFrom(DataDictionary rhs) {
        hasVersion = rhs.hasVersion;
        beginString = rhs.beginString;
        checkFieldsOutOfOrder = rhs.checkFieldsOutOfOrder;
        checkFieldsHaveValues = rhs.checkFieldsHaveValues;
        checkUserDefinedFields = rhs.checkUserDefinedFields;

        copyMap(messageFields, rhs.messageFields);
        copyMap(requiredFields, rhs.requiredFields);
        copyCollection(messages, rhs.messages);
        copyCollection(fields, rhs.fields);
        copyCollection(orderedFields, rhs.orderedFields);
        if (rhs.orderedFieldsArray != null) {
            orderedFieldsArray = new int[rhs.orderedFieldsArray.length];
            for (int i = 0; i < rhs.orderedFieldsArray.length; i++) {
                orderedFieldsArray[i] = rhs.orderedFieldsArray[i];
            }
        }
        copyMap(headerFields, rhs.headerFields);
        copyMap(trailerFields, rhs.trailerFields);
        copyMap(fieldTypes, rhs.fieldTypes);
        copyMap(fieldValues, rhs.fieldValues);
        copyMap(fieldNames, rhs.fieldNames);
        copyMap(names, rhs.names);
        copyMap(valueNames, rhs.valueNames);
        copyMap(groups, rhs.groups);
        copyMap(components, rhs.components);
    }

    private void copyMap(Map lhs, Map rhs) {
        lhs.clear();
        Iterator entries = rhs.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Object value = entry.getValue();
            if (value instanceof Collection) {
                Collection copy;
                try {
                    copy = (Collection) value.getClass().newInstance();
                } catch (RuntimeException e) {
                    throw e;
                } catch (java.lang.Exception e) {
                    throw new RuntimeException(e);
                }
                copyCollection(copy, (Collection) value);
                value = copy;
            }
            lhs.put(entry.getKey(), value);
        }
    }

    private void copyCollection(Collection lhs, Collection rhs) {
        lhs.clear();
        lhs.addAll(rhs);
    }

    /**
     * Validate a mesasge.
     * 
     * @param message
     *            the message
     * @throws IncorrectTagValue
     *             if a field value is not valid
     * @throws FieldNotFound
     *             if a field cannot be found
     */
    public void validate(Message message) throws IncorrectTagValue, FieldNotFound {
        if (hasVersion && !getVersion().equals(message.getHeader().getString(BeginString.FIELD))) {
            throw new UnsupportedVersion();
        }

        if (checkFieldsOutOfOrder && !message.hasValidStructure()) {
            throw new FieldException(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER,
                    message.getInvalidStructureTag());
        }

        String msgType = message.getHeader().getString(MsgType.FIELD);
        if (hasVersion) {
            checkMsgType(msgType);
            checkHasRequired(message.getHeader(), message, message.getTrailer(), msgType);
        }

        iterate(message.getHeader(), msgType);
        iterate(message, msgType);
        iterate(message.getTrailer(), msgType);
    }

    private void iterate(FieldMap map, String msgType) throws IncorrectTagValue {
        Field previousField = null;
        Iterator iterator = map.iterator();
        while (iterator.hasNext()) {
            StringField field = (StringField) iterator.next();
            if (previousField != null && field.getTag() == previousField.getTag()) {
                throw new FieldException(SessionRejectReason.TAG_APPEARS_MORE_THAN_ONCE,
                        previousField.getTag());
            }
            checkHasValue(field);

            if (hasVersion) {
                checkValidFormat(field);
                checkValue(field);
            }

            if (beginString != null && shouldCheckTag(field)) {
                checkValidTagNumber(field);
                if (!Message.isHeaderField(field, this) && !Message.isTrailerField(field, this)) {
                    checkIsInMessage(field, msgType);
                    checkGroupCount(field, map, msgType);
                }
            }
            previousField = field;
        }
    }

    // / Check if message type is defined in spec.
    private void checkMsgType(String msgType) {
        if (!isMsgType(msgType)) {
            throw new FieldException(SessionRejectReason.INVALID_MSGTYPE);
        }
    }

    // / If we need to check for the tag in the dictionary
    private boolean shouldCheckTag(Field field) {
        if (!checkUserDefinedFields && field.getField() >= USER_DEFINED_TAG_MIN) {
            return false;
        } else {
            return true;
        }
    }

    // / Check if field tag number is defined in spec.
    void checkValidTagNumber(Field field) {
        if (!fields.contains(new Integer(field.getTag()))) {
            throw new FieldException(SessionRejectReason.INVALID_TAG_NUMBER, field.getField());
        }
    }

    private void checkValidFormat(StringField field) {
        try {
            FieldType fieldType = getFieldTypeEnum(field.getTag());
            if (fieldType == FieldType.String) {
                // String
            } else if (fieldType == FieldType.Char) {
                if (beginString.compareTo(FixVersions.BEGINSTRING_FIX41) > 0) {
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

    private void checkValue(StringField field) throws IncorrectTagValue {
        if (!hasFieldValue(field.getField()))
            return;

        String value = field.getValue();
        if (!isFieldValue(field.getField(), value)) {
            throw new IncorrectTagValue(field.getField());
        }
    }

    // / Check if a field has a value.
    private void checkHasValue(StringField field) {
        if (checkFieldsHaveValues && field.getValue().length() == 0) {
            throw new FieldException(SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE, field
                    .getField());
        }
    }

    // / Check if a field is in this message type.
    private void checkIsInMessage(Field field, String msgType) {
        if (!isMsgField(msgType, field.getField())) {
            throw new FieldException(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE,
                    field.getField());
        }
    }

    // / Check if group count matches number of groups in
    private void checkGroupCount(StringField field, FieldMap fieldMap, String msgType) {
        int fieldNum = field.getField();
        if (isGroup(msgType, fieldNum)) {
            if (fieldMap.getGroupCount(fieldNum) != Integer.parseInt(field.getValue()))
                throw new FieldException(
                        SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                        fieldNum);
        }
    }

    // / Check if a message has all required fields.
    void checkHasRequired(FieldMap header, FieldMap body, FieldMap trailer, String msgType) {
        Iterator headerItr = headerFields.entrySet().iterator();
        while (headerItr.hasNext()) {
            Map.Entry entry = (Map.Entry) headerItr.next();
            int field = ((Integer) entry.getKey()).intValue();
            if (entry.getValue() == Boolean.TRUE && !header.isSetField(field)) {
                throw new FieldException(SessionRejectReason.REQUIRED_TAG_MISSING, field);
            }
        }

        Iterator trailerItr = trailerFields.entrySet().iterator();
        while (trailerItr.hasNext()) {
            Map.Entry entry = (Map.Entry) trailerItr.next();
            int field = ((Integer) entry.getKey()).intValue();
            if (entry.getValue() == Boolean.TRUE && !trailer.isSetField(field)) {
                throw new FieldException(SessionRejectReason.REQUIRED_TAG_MISSING, field);
            }
        }

        Set requiredFieldsForMessage = (Set) requiredFields.get(msgType);
        if (requiredFieldsForMessage == null || requiredFieldsForMessage.size() == 0) {
            return;
        }

        Iterator fieldItr = requiredFieldsForMessage.iterator();
        while (fieldItr.hasNext()) {
            int field = ((Integer) fieldItr.next()).intValue();
            if (!body.isSetField(field)) {
                throw new FieldException(SessionRejectReason.REQUIRED_TAG_MISSING, field);
            }
        }

        Map groups = body.getGroups();
        if (groups.size() > 0) {
            Iterator groupIter = groups.entrySet().iterator();
            while (groupIter.hasNext()) {
                Map.Entry entry = (Map.Entry) groupIter.next();
                GroupInfo p = getGroup(msgType, ((Integer) entry.getKey()).intValue());
                List groupInstances = ((List) entry.getValue());
                for (int i = 0; i < groupInstances.size(); i++) {
                    FieldMap groupFields = (FieldMap) groupInstances.get(i);
                    p.getDataDictionary().checkHasRequired(groupFields, groupFields, groupFields,
                            msgType);
                }
            }
        }
    }

    private void readFromURL(String url) throws ConfigError {
        InputStream inputStream;
        try {
            inputStream = new URL(url).openStream();
        } catch (MalformedURLException e) {
            try {
                inputStream = new FileInputStream(url);
            } catch (FileNotFoundException fe) {
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                if (classLoader == null) {
                    classLoader = getClass().getClassLoader();
                }
                inputStream = classLoader.getResourceAsStream(url);
                if (inputStream == null) {
                    throw new DataDictionary.Exception("Could not find data dictionary: " + url);
                }
            }
        } catch (IOException e) {
            throw new DataDictionary.Exception(e);
        }

        try {
            load(inputStream);
        } catch (java.lang.Exception e) {
            ConfigError ce = new ConfigError(url + ": " + e.getMessage());
            ce.setStackTrace(e.getStackTrace());
            throw ce;
        }
    }

    private void load(InputStream inputStream) throws ConfigError {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(inputStream);
        } catch (Throwable e) {
            throw new ConfigError("Could not parse data dictionary file", e);
        }

        Element documentElement = document.getDocumentElement();
        if (!documentElement.getNodeName().equals("fix")) {
            throw new ConfigError(
                    "Could not parse data dictionary file, or no <fix> node found at root");
        }

        if (!documentElement.hasAttribute("major")) {
            throw new ConfigError("major attribute not found on <fix>");
        }

        if (!documentElement.hasAttribute("minor")) {
            throw new ConfigError("minor attribute not found on <fix>");
        }

        setVersion("FIX." + documentElement.getAttribute("major") + "."
                + documentElement.getAttribute("minor"));

        // Index Components
        NodeList componentsNode = documentElement.getElementsByTagName("components");
        if (componentsNode.getLength() > 0) {
            NodeList componentNodes = componentsNode.item(0).getChildNodes();
            for (int i = 0; i < componentNodes.getLength(); i++) {
                Node componentNode = componentNodes.item(i);
                if (componentNode.getNodeName().equals("component")) {
                    String name = getAttribute(componentNode, "name");
                    if (name == null) {
                        throw new ConfigError("<component> does not have a name attribute");
                    }
                    components.put(name, componentNode);
                }
            }
        }

        // FIELDS
        NodeList fieldsNode = documentElement.getElementsByTagName("fields");
        if (fieldsNode.getLength() == 0) {
            throw new ConfigError("<fields> section not found in data dictionary");
        }

        NodeList fieldNodes = fieldsNode.item(0).getChildNodes();
        if (fieldNodes.getLength() == 0) {
            throw new ConfigError("No fields defined");
        }

        for (int i = 0; i < fieldNodes.getLength(); i++) {
            Node fieldNode = fieldNodes.item(i);
            if (fieldNode.getNodeName().equals("field")) {
                String name = getAttribute(fieldNode, "name");
                if (name == null) {
                    throw new ConfigError("<field> does not have a name attribute");
                }

                String number = getAttribute(fieldNode, "number");
                if (number == null) {
                    throw new ConfigError("<field> " + name + " does not have a number attribute");
                }

                int num = Integer.parseInt(number);

                String type = getAttribute(fieldNode, "type");
                if (type == null) {
                    throw new ConfigError("<field> " + name + " does not have a type attribute");
                }

                addField(num);
                addFieldType(num, FieldType.fromName(getVersion(), type));
                addFieldName(num, name);

                NodeList valueNodes = fieldNode.getChildNodes();
                for (int j = 0; j < valueNodes.getLength(); j++) {
                    Node valueNode = valueNodes.item(j);
                    if (valueNode.getNodeName().equals("value")) {
                        String enumeration = getAttribute(valueNode, "enum");
                        if (enumeration == null) {
                            throw new ConfigError("<value> does not have enum attribute in field "
                                    + name);
                        }
                        addFieldValue(num, enumeration);
                        String description = getAttribute(valueNode, "description");
                        if (description != null) {
                            addValueName(num, enumeration, description);
                        }
                    }
                }

            }
        }

        // HEADER
        NodeList headerNode = documentElement.getElementsByTagName("header");
        if (headerNode.getLength() == 0) {
            throw new ConfigError("<header> section not found in data dictionary");
        }

        NodeList headerFieldNodes = headerNode.item(0).getChildNodes();
        if (headerFieldNodes.getLength() == 0) {
            throw new ConfigError("No header fields defined");
        }

        for (int i = 0; i < headerFieldNodes.getLength(); i++) {
            Node headerFieldNode = headerFieldNodes.item(i);

            String nodeName = headerFieldNode.getNodeName();
            if (nodeName.equals("field") || nodeName.equals("group")) {
                String name = getAttribute(headerFieldNode, "name");
                if (name == null) {
                    throw new ConfigError("<" + nodeName + "> does not have a name attribute");
                }
                String required = "false";
                addHeaderField(lookupXMLFieldNumber(document, name), required.equals("true"));
            }

        }

        NodeList trailerNode = documentElement.getElementsByTagName("trailer");
        if (trailerNode.getLength() == 0) {
            throw new ConfigError("<trailer> section not found in data dictionary");
        }

        NodeList trailerFieldNodes = trailerNode.item(0).getChildNodes();
        for (int i = 0; i < trailerFieldNodes.getLength(); i++) {
            Node trailerFieldNode = trailerFieldNodes.item(i);

            String nodeName = trailerFieldNode.getNodeName();
            if (nodeName.equals("field") || nodeName.equals("group")) {
                String name = getAttribute(trailerFieldNode, "name");
                if (name == null) {
                    throw new ConfigError("<" + nodeName + "> does not have a name attribute");
                }
                String required = "false";
                addTrailerField(lookupXMLFieldNumber(document, name), required.equals("true"));
            }

        }

        // MSGTYPE
        NodeList messagesNode = documentElement.getElementsByTagName("messages");
        if (messagesNode.getLength() == 0) {
            throw new ConfigError("<messages> section not found in data dictionary");
        }

        NodeList messageNodes = messagesNode.item(0).getChildNodes();
        if (messageNodes.getLength() == 0) {
            throw new ConfigError("No messages defined");
        }

        for (int i = 0; i < messageNodes.getLength(); i++) {
            Node messageNode = messageNodes.item(i);
            if (messageNode.getNodeName().equals("message")) {
                String msgtype = getAttribute(messageNode, "msgtype");
                if (msgtype == null) {
                    throw new ConfigError("<message> does not have a msgtype attribute");
                }
                addMsgType(msgtype);

                String name = getAttribute(messageNode, "name");
                if (name != null) {
                    addValueName(MsgType.FIELD, msgtype, name);
                }

                NodeList messageFieldNodes = messageNode.getChildNodes();
                if (messageFieldNodes.getLength() == 0) {
                    throw new ConfigError("<message> contains no fields");
                }

                for (int j = 0; j < messageFieldNodes.getLength(); j++) {
                    Node messageFieldNode = messageFieldNodes.item(j);

                    if (messageFieldNode.getNodeName().equals("field")
                            || messageFieldNode.getNodeName().equals("group")) {
                        name = getAttribute(messageFieldNode, "name");
                        if (name == null) {
                            throw new ConfigError("<field> does not have a name attribute");
                        }

                        int num = lookupXMLFieldNumber(document, name);
                        addMsgField(msgtype, num);

                        String required = getAttribute(messageFieldNode, "required", NO);
                        if (required == null) {
                            throw new ConfigError("<" + messageFieldNode.getNodeName()
                                    + "> does not have a 'required' attribute");
                        }
                        if (required.equalsIgnoreCase("Y")) {
                            addRequiredField(msgtype, num);
                        }

                    } else if (messageFieldNode.getNodeName().equals("component")) {

                        String required = getAttribute(messageFieldNode, "required");
                        if (required == null) {
                            throw new ConfigError(
                                    "<component> does not have a 'required' attribute");
                        }
                        addXMLComponentFields(document, messageFieldNode, msgtype, this, required
                                .equalsIgnoreCase("Y"));
                    }
                    if (messageFieldNode.getNodeName().equals("group")) {
                        String required = getAttribute(messageFieldNode, "required");
                        if (required == null) {
                            throw new ConfigError("<group> does not have a 'required' attribute");
                        }
                        addXMLGroup(document, messageFieldNode, msgtype, this, required
                                .equalsIgnoreCase("Y"));
                    }
                }
            }
        }
    }

    int[] getOrderedFields() {

        if (orderedFieldsArray != null) {
            return orderedFieldsArray;
        }
        orderedFieldsArray = new int[orderedFields.size()];

        for (int i = 0; i < orderedFields.size(); i++) {
            orderedFieldsArray[i] = ((Integer) orderedFields.get(i)).intValue();
        }
        return orderedFieldsArray;

    }

    private int lookupXMLFieldNumber(Document document, Node node) throws ConfigError {
        Element element = (Element) node;
        if (!element.hasAttribute("name")) {
            throw new ConfigError("No name given to field");
        }
        return lookupXMLFieldNumber(document, element.getAttribute("name"));
    }

    private int lookupXMLFieldNumber(Document document, String name) throws ConfigError {
        Integer fieldNumber = (Integer) names.get(name);
        if (fieldNumber == null) {
            throw new ConfigError("Field " + name + " not defined in fields section");
        }
        return fieldNumber.intValue();
    }

    private int addXMLComponentFields(Document document, Node node, String msgtype,
            DataDictionary dd, boolean componentRequired) throws ConfigError {
        int firstField = 0;

        String name = getAttribute(node, "name");
        if (name == null) {
            throw new ConfigError("No name given to component");
        }

        Node componentNode = (Node) components.get(name);
        if (componentNode == null) {
            throw new ConfigError("Component not found");
        }

        NodeList componentFieldNodes = componentNode.getChildNodes();
        for (int i = 0; i < componentFieldNodes.getLength(); i++) {
            Node componentFieldNode = componentFieldNodes.item(i);

            if (componentFieldNode.getNodeName().equals("field")
                    || componentFieldNode.getNodeName().equals("group")) {
                name = getAttribute(componentFieldNode, "name");
                if (name == null) {
                    throw new ConfigError("No name given to field");
                }

                int field = lookupXMLFieldNumber(document, name);
                if (firstField == 0) {
                    firstField = field;
                }

                String required = getAttribute(componentFieldNode, "required");
                if (required.equalsIgnoreCase("Y") && componentRequired) {
                    addRequiredField(msgtype, field);
                }

                dd.addField(field);
                dd.addMsgField(msgtype, field);
            }
            if (componentFieldNode.getNodeName().equals("group")) {
                String required = getAttribute(componentFieldNode, "required");
                boolean isRequired = required.equalsIgnoreCase("Y");
                addXMLGroup(document, componentFieldNode, msgtype, dd, isRequired);
            }
        }
        return firstField;

    }

    private void addXMLGroup(Document document, Node node, String msgtype, DataDictionary dd,
            boolean groupRequired) throws ConfigError {
        String name = getAttribute(node, "name");
        if (name == null) {
            throw new ConfigError("No name given to group");
        }
        int group = lookupXMLFieldNumber(document, name);
        int delim = 0;
        int field = 0;
        DataDictionary groupDD = new DataDictionary();
        NodeList fieldNodeList = node.getChildNodes();
        for (int i = 0; i < fieldNodeList.getLength(); i++) {
            Node fieldNode = fieldNodeList.item(i);
            if (fieldNode.getNodeName().equals("field")) {
                field = lookupXMLFieldNumber(document, fieldNode);
                groupDD.addField(field);
                String required = getAttribute(fieldNode, "required");
                if (required != null && required.equalsIgnoreCase("Y") && groupRequired) {
                    groupDD.addRequiredField(msgtype, field);
                }
            } else if (fieldNode.getNodeName().equals("component")) {
                field = addXMLComponentFields(document, fieldNode, msgtype, groupDD, false);
            } else if (fieldNode.getNodeName().equals("group")) {
                field = lookupXMLFieldNumber(document, fieldNode);
                groupDD.addField(field);
                String required = getAttribute(fieldNode, "required");
                if (required != null && required.equalsIgnoreCase("Y") && groupRequired) {
                    groupDD.addRequiredField(msgtype, field);
                }
                boolean isRequired = required == null ? false : required.equalsIgnoreCase("Y");
                addXMLGroup(document, fieldNode, msgtype, groupDD, isRequired);
            }
            if (delim == 0) {
                delim = field;
            }
        }

        if (delim != 0) {
            dd.addGroup(msgtype, group, delim, groupDD);
        }
    }

    private String getAttribute(Node node, String name) {
        return getAttribute(node, name, null);
    }

    private String getAttribute(Node node, String name, String defaultValue) {
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            Node namedItem = attributes.getNamedItem(name);
            return namedItem != null ? namedItem.getNodeValue() : null;
        }
        return defaultValue;
    }

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

    private static final class IntStringPair {
        private final int intValue;

        private final String stringValue;

        public IntStringPair(int value, String value2) {
            intValue = value;
            stringValue = value2;
        }

        public int getIntValue() {
            return intValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntStringPair)) {
                return false;
            }
            return intValue == ((IntStringPair) other).intValue
                    && stringValue.equals(((IntStringPair) other).stringValue);
        }

        public int hashCode() {
            return stringValue.hashCode() + intValue;
        }
    }

    /**
     * Contains meta-data for FIX repeating groups
     */
    public static final class GroupInfo {
        private final int delimeterField;

        private final DataDictionary dataDictionary;

        private GroupInfo(int field, DataDictionary dictionary) {
            delimeterField = field;
            dataDictionary = dictionary;
        }

        public DataDictionary getDataDictionary() {
            return dataDictionary;
        }

        /**
         * Returns the delimeter field used to start a repeating group instance.
         * 
         * @return delimeter field
         */
        public int getDelimeterField() {
            return delimeterField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupInfo)) {
                return false;
            }
            return delimeterField == ((GroupInfo) other).delimeterField
                    && dataDictionary.equals(((GroupInfo) other).dataDictionary);
        }

        public int hashCode() {
            return delimeterField;
        }
    }
}
