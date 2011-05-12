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

import static quickfix.FileUtil.Location.CLASSLOADER_RESOURCE;
import static quickfix.FileUtil.Location.CONTEXT_RESOURCE;
import static quickfix.FileUtil.Location.FILESYSTEM;
import static quickfix.FileUtil.Location.URL;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
    private static final String FIXT_PREFIX = "FIXT";
    private static final String FIX_PREFIX = "FIX";
    public static final String ANY_VALUE = "__ANY__";
    public static final String HEADER_ID = "HEADER";
    public static final String TRAILER_ID = "TRAILER";
    private static final String MESSAGE_CATEGORY_ADMIN = "admin".intern();
    private static final String MESSAGE_CATEGORY_APP = "app".intern();

    private static final int USER_DEFINED_TAG_MIN = 5000;
    private static final String NO = "N";
    private boolean hasVersion = false;
    private boolean checkFieldsOutOfOrder = true;
    private boolean checkFieldsHaveValues = true;
    private boolean checkUserDefinedFields = true;
    private boolean checkUnorderedGroupFields = true;
    private boolean allowUnknownMessageFields = false;
    private String beginString;
    private final Map<String, Set<Integer>> messageFields = new HashMap<String, Set<Integer>>();
    private final Map<String, Set<Integer>> requiredFields = new HashMap<String, Set<Integer>>();
    private final Set<String> messages = new HashSet<String>();
    private final Map<String, String> messageCategory = new HashMap<String, String>();
    private final Map<String, String> messageTypeForName = new HashMap<String, String>();
    private final LinkedHashSet<Integer> fields = new LinkedHashSet<Integer>();
    private final Map<Integer, FieldType> fieldTypes = new HashMap<Integer, FieldType>();
    private final Map<Integer, Set<String>> fieldValues = new HashMap<Integer, Set<String>>();
    private final Map<Integer, String> fieldNames = new HashMap<Integer, String>();
    private final Map<String, Integer> names = new HashMap<String, Integer>();
    private final Map<IntStringPair, String> valueNames = new HashMap<IntStringPair, String>();
    private final Map<IntStringPair, GroupInfo> groups = new HashMap<IntStringPair, GroupInfo>();
    private final Map<String, Node> components = new HashMap<String, Node>();

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
        read(location);
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
        fields.add(field);
    }

    private void addFieldName(int field, String name) throws ConfigError {
        if (names.put(name, field) != null) {
            throw new ConfigError("Field named " + name + " defined multiple times");
        }
        fieldNames.put(field, name);
    }

    /**
     * Get the field name for a specified tag.
     *
     * @param field
     *            the tag
     * @return the field name
     */
    public String getFieldName(int field) {
        return fieldNames.get(field);
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
        return valueNames.get(new IntStringPair(field, value));
    }

    /**
     * Predicate for determining if a tag is a defined field.
     *
     * @param field
     *            the tag
     * @return true if the field is defined, false otherwise
     */
    public boolean isField(int field) {
        return fields.contains(field);
    }

    /**
     * Return the field type for a field.
     *
     * @param field
     *            the tag
     * @return the field type
     */
    public FieldType getFieldTypeEnum(int field) {
        return fieldTypes.get(field);
    }

    private void addMsgType(String msgType, String msgName) {
        messages.add(msgType);
        if (msgName != null) {
            messageTypeForName.put(msgName, msgType);
        }
    }

    /**
     * Return the message type for the specified name.
     * @param msgName The message name.
     * @return the message type
     */
    public String getMsgType(String msgName) {
        return messageTypeForName.get(msgName);
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

    /**
     * Predicate for determining if a message is in the admin category.
     * @param msgType the messageType
     * @return true, if the msgType is a AdminMessage
     *         false, if the msgType is a ApplicationMessage
     */
    public boolean isAdminMessage(String msgType) {
        // Categories are interned
        return messageCategory.get(msgType) == MESSAGE_CATEGORY_ADMIN;
    }

    /**
     * Predicate for determining if a message is in the app category.
     * @param msgType the messageType
     * @return true, if the msgType is a ApplicationMessage
     *         false, if the msgType is a AdminMessage
     */
    public boolean isAppMessage(String msgType) {
        // Categories are interned
        return messageCategory.get(msgType) == MESSAGE_CATEGORY_APP;
    }

    private void addMsgField(String msgType, int field) {
        Set<Integer> fields = messageFields.get(msgType);
        if (fields == null) {
            fields = new HashSet<Integer>();
            messageFields.put(msgType, fields);
        }
        fields.add(field);
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
        final Set<Integer> fields = messageFields.get(msgType);
        return fields != null && fields.contains(field);
    }

    /**
     * Predicate for determining if field is a header field.
     *
     * @param field
     *            the tag
     * @return true if field is a header field, false otherwise.
     */
    public boolean isHeaderField(int field) {
        if (messageFields.get(HEADER_ID) == null) {
            return false;
        }
        return messageFields.get(HEADER_ID).contains(field);
    }

    /**
     * Predicate for determining if field is a trailer field.
     *
     * @param field
     *            the tag
     * @return true if field is a trailer field, false otherwise.
     */
    public boolean isTrailerField(int field) {
        return messageFields.get(TRAILER_ID).contains(field);
    }

    private void addFieldType(int field, FieldType fieldType) {
        fieldTypes.put(field, fieldType);
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
        final Integer tag = names.get(name);
        return tag != null ? tag.intValue() : -1;
    }

    private void addRequiredField(String msgType, int field) {
        Set<Integer> fields = requiredFields.get(msgType);
        if (fields == null) {
            fields = new HashSet<Integer>();
            requiredFields.put(msgType, fields);
        }
        fields.add(field);
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
        final Set<Integer> fields = requiredFields.get(msgType);
        return fields != null && fields.contains(field);
    }

    /**
     * Predicate for determining if a header field is a required field
     * @param field the tag
     * @return true if field s required, false otherwise
     */
    public boolean isRequiredHeaderField(int field) {
        return isRequiredField(HEADER_ID, field);
    }

    /**
     * Predicate for determining if a trailer field is a required field
     * @param field the tag
     * @return true if field s required, false otherwise
     */
    public boolean isRequiredTrailerField(int field) {
        return isRequiredField(TRAILER_ID, field);
    }

    private void addFieldValue(int field, String value) {
        Set<String> values = fieldValues.get(field);
        if (values == null) {
            values = new HashSet<String>();
            fieldValues.put(field, values);
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
        final Set<String> values = fieldValues.get(field);
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
        final Set<String> validValues = fieldValues.get(field);

        if (validValues.contains(ANY_VALUE)) {
            return true;
        }

        if (validValues == null || validValues.size() == 0) {
            return false;
        }

        if (!isMultipleValueStringField(field)) {
            return validValues.contains(value);
        }

        // MultipleValueString
        final String[] values = value.split(" ");
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
     * Predicate for determining if a field is a group count field for a message
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
     * Predicate for determining if a field is a header group count field
     *
     * @param field
     *            the tag
     * @return true if field starts a repeating group, false otherwise
     */
    public boolean isHeaderGroup(int field) {
        return groups.containsKey(new IntStringPair(field, HEADER_ID));
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
        return groups.get(new IntStringPair(field, msg));
    }

    /**
     * Predicate for determining if a field is a FIX raw data field.
     *
     * @param field
     *            the tag
     * @return true if field is a raw data field, false otherwise
     */
    public boolean isDataField(int field) {
        return fieldTypes.get(field) == FieldType.Data;
    }

    private boolean isMultipleValueStringField(int field) {
        return fieldTypes.get(field) == FieldType.MultipleValueString;
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

    public boolean isCheckFieldsOutOfOrder() {
        return checkFieldsOutOfOrder;
    }

    public boolean isCheckUnorderedGroupFields() {
        return checkUnorderedGroupFields;
    }

    /**
     * Controls whether group fields are in the same order
     * @param flag   true = checked, false = not checked
     */
    public void setCheckUnorderedGroupFields(boolean flag) {
        checkUnorderedGroupFields = flag;
        for (GroupInfo gi : groups.values()) {
            gi.getDataDictionary().setCheckUnorderedGroupFields(flag);
        }
    }
    /**
     * Controls whether empty field values are checked.
     *
     * @param flag
     *            true = checked, false = not checked
     */
    public void setCheckFieldsHaveValues(boolean flag) {
        checkFieldsHaveValues = flag;
        for (GroupInfo gi : groups.values()) {
            gi.getDataDictionary().setCheckFieldsHaveValues(flag);
        }
    }

    /**
     * Controls whether user defined fields are checked.
     *
     * @param flag
     *            true = checked, false = not checked
     */
    public void setCheckUserDefinedFields(boolean flag) {
        checkUserDefinedFields = flag;
        for (GroupInfo gi : groups.values()) {
            gi.getDataDictionary().setCheckUserDefinedFields(flag);
        }
    }

    public void setAllowUnknownMessageFields(boolean allowUnknownFields) {
        allowUnknownMessageFields = allowUnknownFields;
        for (GroupInfo gi : groups.values()) {
            gi.getDataDictionary().setAllowUnknownMessageFields(allowUnknownFields);
        }
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
        copyMap(fieldTypes, rhs.fieldTypes);
        copyMap(fieldValues, rhs.fieldValues);
        copyMap(fieldNames, rhs.fieldNames);
        copyMap(names, rhs.names);
        copyMap(valueNames, rhs.valueNames);
        copyMap(groups, rhs.groups);
        copyMap(components, rhs.components);
    }

    @SuppressWarnings("unchecked")
    private <K,V> void copyMap(Map<K,V> lhs, Map<K,V> rhs) {
        lhs.clear();
        final Iterator<?> entries = rhs.entrySet().iterator();
        while (entries.hasNext()) {
            final Map.Entry<K,V> entry = (Map.Entry<K,V>) entries.next();
            Object value = entry.getValue();
            if (value instanceof Collection) {
                Collection<V> copy;
                try {
                    copy = (Collection<V>) value.getClass().newInstance();
                } catch (final RuntimeException e) {
                    throw e;
                } catch (final java.lang.Exception e) {
                    throw new RuntimeException(e);
                }
                copyCollection(copy, (Collection<V>) value);
                value = copy;
            }
            lhs.put(entry.getKey(), (V) value);
        }
    }

    private <V> void copyCollection(Collection<V> lhs, Collection<V> rhs) {
        lhs.clear();
        lhs.addAll(rhs);
    }

    /**
     * Validate a mesasge, including the header and trailer fields.
     *
     * @param message
     *            the message
     * @throws IncorrectTagValue
     *             if a field value is not valid
     * @throws FieldNotFound
     *             if a field cannot be found
     * @throws IncorrectDataFormat
     */
    public void validate(Message message) throws IncorrectTagValue, FieldNotFound,
            IncorrectDataFormat {
        validate(message, false);
    }

    /**
     * Validate the message body, with header and trailer fields being validated conditionally.
     *
     * @param message
     *            the message
     * @param bodyOnly
     *            whether to validate just the message body, or to validate the header and trailer sections as well.
     * @throws IncorrectTagValue
     *             if a field value is not valid
     * @throws FieldNotFound
     *             if a field cannot be found
     * @throws IncorrectDataFormat
     */
    public void validate(Message message, boolean bodyOnly) throws IncorrectTagValue,
            FieldNotFound, IncorrectDataFormat {
        validate(message, bodyOnly ? null : this, this);
    }

    static void validate(Message message, DataDictionary sessionDataDictionary,
            DataDictionary applicationDataDictionary) throws IncorrectTagValue, FieldNotFound,
            IncorrectDataFormat {
        final boolean bodyOnly = sessionDataDictionary == null;

        if (isVersionSpecified(sessionDataDictionary)
                && !sessionDataDictionary.getVersion().equals(
                        message.getHeader().getString(BeginString.FIELD))
                && !message.getHeader().getString(BeginString.FIELD).equals("FIXT.1.1")
                && !sessionDataDictionary.getVersion().equals("FIX.5.0")) {
            throw new UnsupportedVersion();
        }

        if (!message.hasValidStructure() && message.getException() != null) {
            throw message.getException();
        }

        final String msgType = message.getHeader().getString(MsgType.FIELD);
        if (isVersionSpecified(applicationDataDictionary)) {
            applicationDataDictionary.checkMsgType(msgType);
            applicationDataDictionary.checkHasRequired(message.getHeader(), message,
                    message.getTrailer(), msgType, bodyOnly);
        }

        if (!bodyOnly) {
            sessionDataDictionary.iterate(message.getHeader(), HEADER_ID, sessionDataDictionary);
            sessionDataDictionary.iterate(message.getTrailer(), TRAILER_ID, sessionDataDictionary);
        }

        applicationDataDictionary.iterate(message, msgType, applicationDataDictionary);
    }

    private static boolean isVersionSpecified(DataDictionary dd) {
        return dd != null && dd.hasVersion;
    }

    private void iterate(FieldMap map, String msgType, DataDictionary dd) throws IncorrectTagValue,
            IncorrectDataFormat {
        final Iterator<Field<?>> iterator = map.iterator();
        while (iterator.hasNext()) {
            final StringField field = (StringField) iterator.next();

            checkHasValue(field);

            if (hasVersion) {
                checkValidFormat(field);
                checkValue(field);
            }

            if (beginString != null && shouldCheckTag(field)) {
                dd.checkValidTagNumber(field);
                if (map instanceof Message) {
                    checkIsInMessage(field, msgType);
                }
                dd.checkGroupCount(field, map, msgType);
            }
        }

        for (final List<Group> groups : map.getGroups().values()) {
            for (final Group group : groups) {
                iterate(group, msgType, dd.getGroup(msgType, group.getFieldTag())
                        .getDataDictionary());
            }
        }
    }

    // / Check if message type is defined in spec.
    private void checkMsgType(String msgType) {
        if (!isMsgType(msgType)) {
            // It would be better to include the msgType in exception message
            // Doing that will break acceptance tests
            throw new FieldException(SessionRejectReason.INVALID_MSGTYPE);
        }
    }

    // / If we need to check for the tag in the dictionary
    private boolean shouldCheckTag(Field<?> field) {
        if (!checkUserDefinedFields && field.getField() >= USER_DEFINED_TAG_MIN) {
            return false;
        } else {
            return true;
        }
    }

    // / Check if field tag number is defined in spec.
    void checkValidTagNumber(Field<?> field) {
        if (!fields.contains(Integer.valueOf(field.getTag()))) {
            throw new FieldException(SessionRejectReason.INVALID_TAG_NUMBER, field.getField());
        }
    }

    private void checkValidFormat(StringField field) throws IncorrectDataFormat {
        try {
            final FieldType fieldType = getFieldTypeEnum(field.getTag());
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
        } catch (final FieldConvertError e) {
            throw new IncorrectDataFormat(field.getTag(), field.getValue());
        }
    }

    private void checkValue(StringField field) throws IncorrectTagValue {
        final int tag = field.getField();
        if (!hasFieldValue(tag)) {
            return;
        }

        final String value = field.getValue();
        if (!isFieldValue(tag, value)) {
            throw new IncorrectTagValue(tag);
        }
    }

    // / Check if a field has a value.
    private void checkHasValue(StringField field) {
        if (checkFieldsHaveValues && field.getValue().length() == 0) {
            throw new FieldException(SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE,
                    field.getField());
        }
    }

    // / Check if a field is in this message type.
    private void checkIsInMessage(Field<?> field, String msgType) {
        if (!isMsgField(msgType, field.getField()) && !allowUnknownMessageFields) {
            throw new FieldException(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE,
                    field.getField());
        }
    }

    // / Check if group count matches number of groups in
    private void checkGroupCount(StringField field, FieldMap fieldMap, String msgType) {
        final int fieldNum = field.getField();
        if (isGroup(msgType, fieldNum)) {
            if (fieldMap.getGroupCount(fieldNum) != Integer.parseInt(field.getValue())) {
                throw new FieldException(
                        SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                        fieldNum);
            }
        }
    }

    // / Check if a message has all required fields.
    void checkHasRequired(FieldMap header, FieldMap body, FieldMap trailer, String msgType,
            boolean bodyOnly) {
        if (!bodyOnly) {
            checkHasRequired(HEADER_ID, header, bodyOnly);
            checkHasRequired(TRAILER_ID, trailer, bodyOnly);
        }

        checkHasRequired(msgType, body, bodyOnly);
    }

    private void checkHasRequired(String msgType, FieldMap fields, boolean bodyOnly) {
        final Set<Integer> requiredFieldsForMessage = requiredFields.get(msgType);
        if (requiredFieldsForMessage == null || requiredFieldsForMessage.size() == 0) {
            return;
        }

        final Iterator<Integer> fieldItr = requiredFieldsForMessage.iterator();
        while (fieldItr.hasNext()) {
            final int field = (fieldItr.next()).intValue();
            if (!fields.isSetField(field)) {
                throw new FieldException(SessionRejectReason.REQUIRED_TAG_MISSING, field);
            }
        }

        final Map<Integer, List<Group>> groups = fields.getGroups();
        if (groups.size() > 0) {
            final Iterator<Map.Entry<Integer, List<Group>>> groupIter = groups.entrySet()
                    .iterator();
            while (groupIter.hasNext()) {
                final Map.Entry<Integer, List<Group>> entry = groupIter.next();
                final GroupInfo p = getGroup(msgType, (entry.getKey()).intValue());
                if (p != null) {
                    final List<Group> groupInstances = entry.getValue();
                    for (int i = 0; i < groupInstances.size(); i++) {
                        final FieldMap groupFields = groupInstances.get(i);
                        p.getDataDictionary().checkHasRequired(groupFields, groupFields,
                                groupFields, msgType, bodyOnly);
                    }
                }
            }
        }
    }

    private void read(String location) throws ConfigError {
        final InputStream inputStream = FileUtil.open(getClass(), location, URL, FILESYSTEM,
                CONTEXT_RESOURCE, CLASSLOADER_RESOURCE);
        if (inputStream == null) {
            throw new DataDictionary.Exception("Could not find data dictionary: " + location);
        }

        try {
            load(inputStream);
        } catch (final java.lang.Exception e) {
            throw new ConfigError(location + ": " + e.getMessage(), e);
        } finally {
            try {
                inputStream.close();
            } catch (final IOException e) {
                throw new ConfigError(e);
            }
        }
    }

    private void load(InputStream inputStream) throws ConfigError {
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document;
        try {
            final DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(inputStream);
        } catch (final Throwable e) {
            throw new ConfigError("Could not parse data dictionary file", e);
        }

        final Element documentElement = document.getDocumentElement();
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

        final String dictionaryType = documentElement.hasAttribute("type") ? documentElement
                .getAttribute("type") : FIX_PREFIX;

        setVersion(dictionaryType + "." + documentElement.getAttribute("major") + "."
                + documentElement.getAttribute("minor"));

        // Index Components
        final NodeList componentsNode = documentElement.getElementsByTagName("components");
        if (componentsNode.getLength() > 0) {
            final NodeList componentNodes = componentsNode.item(0).getChildNodes();
            for (int i = 0; i < componentNodes.getLength(); i++) {
                final Node componentNode = componentNodes.item(i);
                if (componentNode.getNodeName().equals("component")) {
                    final String name = getAttribute(componentNode, "name");
                    if (name == null) {
                        throw new ConfigError("<component> does not have a name attribute");
                    }
                    components.put(name, componentNode);
                }
            }
        }

        // FIELDS
        final NodeList fieldsNode = documentElement.getElementsByTagName("fields");
        if (fieldsNode.getLength() == 0) {
            throw new ConfigError("<fields> section not found in data dictionary");
        }

        final NodeList fieldNodes = fieldsNode.item(0).getChildNodes();
        if (fieldNodes.getLength() == 0) {
            throw new ConfigError("No fields defined");
        }

        for (int i = 0; i < fieldNodes.getLength(); i++) {
            final Node fieldNode = fieldNodes.item(i);
            if (fieldNode.getNodeName().equals("field")) {
                final String name = getAttribute(fieldNode, "name");
                if (name == null) {
                    throw new ConfigError("<field> does not have a name attribute");
                }

                final String number = getAttribute(fieldNode, "number");
                if (number == null) {
                    throw new ConfigError("<field> " + name + " does not have a number attribute");
                }

                final int num = Integer.parseInt(number);

                final String type = getAttribute(fieldNode, "type");
                if (type == null) {
                    throw new ConfigError("<field> " + name + " does not have a type attribute");
                }

                addField(num);
                addFieldType(num, FieldType.fromName(getVersion(), type));
                addFieldName(num, name);

                final NodeList valueNodes = fieldNode.getChildNodes();
                for (int j = 0; j < valueNodes.getLength(); j++) {
                    final Node valueNode = valueNodes.item(j);
                    if (valueNode.getNodeName().equals("value")) {
                        final String enumeration = getAttribute(valueNode, "enum");
                        if (enumeration == null) {
                            throw new ConfigError("<value> does not have enum attribute in field "
                                    + name);
                        }
                        addFieldValue(num, enumeration);
                        final String description = getAttribute(valueNode, "description");
                        if (description != null) {
                            addValueName(num, enumeration, description);
                        }
                    }
                }

                if (fieldValues.containsKey(num)) {
                    final String allowOtherValues = getAttribute(fieldNode, "allowOtherValues");
                    if (allowOtherValues != null && Boolean.parseBoolean(allowOtherValues)) {
                        addFieldValue(num, ANY_VALUE);
                    }
                }

            }
        }

        if (beginString.startsWith(FIXT_PREFIX) || beginString.compareTo(FixVersions.FIX50) < 0) {
            // HEADER
            final NodeList headerNode = documentElement.getElementsByTagName("header");
            if (headerNode.getLength() == 0) {
                throw new ConfigError("<header> section not found in data dictionary");
            }

            load(document, HEADER_ID, headerNode.item(0));

            // TRAILER
            final NodeList trailerNode = documentElement.getElementsByTagName("trailer");
            if (trailerNode.getLength() == 0) {
                throw new ConfigError("<trailer> section not found in data dictionary");
            }

            load(document, TRAILER_ID, trailerNode.item(0));
        }

        // MSGTYPE
        final NodeList messagesNode = documentElement.getElementsByTagName("messages");
        if (messagesNode.getLength() == 0) {
            throw new ConfigError("<messages> section not found in data dictionary");
        }

        final NodeList messageNodes = messagesNode.item(0).getChildNodes();
        if (messageNodes.getLength() == 0) {
            throw new ConfigError("No messages defined");
        }

        for (int i = 0; i < messageNodes.getLength(); i++) {
            final Node messageNode = messageNodes.item(i);
            if (messageNode.getNodeName().equals("message")) {
                final String msgtype = getAttribute(messageNode, "msgtype");
                if (msgtype == null) {
                    throw new ConfigError("<message> does not have a msgtype attribute");
                }

                final String msgcat = getAttribute(messageNode, "msgcat");
                if (msgcat != null) {
                    messageCategory.put(msgtype, msgcat.intern());
                }

                final String name = getAttribute(messageNode, "name");
                addMsgType(msgtype, name);

                if (name != null) {
                    addValueName(MsgType.FIELD, msgtype, name);
                }

                load(document, msgtype, messageNode);
            }
        }
    }

    private void load(Document document, String msgtype, Node node) throws ConfigError {
        String name;
        final NodeList fieldNodes = node.getChildNodes();
        if (fieldNodes.getLength() == 0) {
            throw new ConfigError("No fields found: msgType=" + msgtype);
        }

        for (int j = 0; j < fieldNodes.getLength(); j++) {
            final Node fieldNode = fieldNodes.item(j);

            if (fieldNode.getNodeName().equals("field") || fieldNode.getNodeName().equals("group")) {
                name = getAttribute(fieldNode, "name");
                if (name == null) {
                    throw new ConfigError("<field> does not have a name attribute");
                }

                final int num = lookupXMLFieldNumber(document, name);
                addMsgField(msgtype, num);

                final String required = getAttribute(fieldNode, "required", NO);
                if (required == null) {
                    throw new ConfigError("<" + fieldNode.getNodeName()
                            + "> does not have a 'required' attribute");
                }
                if (required.equalsIgnoreCase("Y")) {
                    addRequiredField(msgtype, num);
                }

            } else if (fieldNode.getNodeName().equals("component")) {

                final String required = getAttribute(fieldNode, "required");
                if (required == null) {
                    throw new ConfigError("<component> does not have a 'required' attribute");
                }
                addXMLComponentFields(document, fieldNode, msgtype, this,
                        required.equalsIgnoreCase("Y"));
            }
            if (fieldNode.getNodeName().equals("group")) {
                final String required = getAttribute(fieldNode, "required");
                if (required == null) {
                    throw new ConfigError("<group> does not have a 'required' attribute");
                }
                addXMLGroup(document, fieldNode, msgtype, this, required.equalsIgnoreCase("Y"));
            }
        }
    }

    private int[] orderedFieldsArray;

    public int[] getOrderedFields() {
        if (orderedFieldsArray == null) {
            orderedFieldsArray = new int[fields.size()];

            final Iterator<Integer> fieldItr = fields.iterator();
            int i = 0;
            while (fieldItr.hasNext()) {
                orderedFieldsArray[i++] = fieldItr.next();
            }
        }

        return orderedFieldsArray;
    }

    private int lookupXMLFieldNumber(Document document, Node node) throws ConfigError {
        final Element element = (Element) node;
        if (!element.hasAttribute("name")) {
            throw new ConfigError("No name given to field");
        }
        return lookupXMLFieldNumber(document, element.getAttribute("name"));
    }

    private int lookupXMLFieldNumber(Document document, String name) throws ConfigError {
        final Integer fieldNumber = names.get(name);
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

        final Node componentNode = components.get(name);
        if (componentNode == null) {
            throw new ConfigError("Component not found");
        }

        final NodeList componentFieldNodes = componentNode.getChildNodes();
        for (int i = 0; i < componentFieldNodes.getLength(); i++) {
            final Node componentFieldNode = componentFieldNodes.item(i);

            if (componentFieldNode.getNodeName().equals("field")
                    || componentFieldNode.getNodeName().equals("group")) {
                name = getAttribute(componentFieldNode, "name");
                if (name == null) {
                    throw new ConfigError("No name given to field");
                }

                final int field = lookupXMLFieldNumber(document, name);
                if (firstField == 0) {
                    firstField = field;
                }

                final String required = getAttribute(componentFieldNode, "required");
                if (required.equalsIgnoreCase("Y") && componentRequired) {
                    addRequiredField(msgtype, field);
                }

                dd.addField(field);
                dd.addMsgField(msgtype, field);
            }
            if (componentFieldNode.getNodeName().equals("group")) {
                final String required = getAttribute(componentFieldNode, "required");
                final boolean isRequired = required.equalsIgnoreCase("Y");
                addXMLGroup(document, componentFieldNode, msgtype, dd, isRequired);
            }

            if (componentFieldNode.getNodeName().equals("component")) {
                final String required = getAttribute(componentFieldNode, "required");
                final boolean isRequired = required.equalsIgnoreCase("Y");
                addXMLComponentFields(document, componentFieldNode, msgtype, dd, isRequired);
            }
        }
        return firstField;

    }

    private void addXMLGroup(Document document, Node node, String msgtype, DataDictionary dd,
            boolean groupRequired) throws ConfigError {
        final String name = getAttribute(node, "name");
        if (name == null) {
            throw new ConfigError("No name given to group");
        }
        final int group = lookupXMLFieldNumber(document, name);
        int delim = 0;
        int field = 0;
        final DataDictionary groupDD = new DataDictionary();
        groupDD.setVersion(dd.getVersion());
        final NodeList fieldNodeList = node.getChildNodes();
        for (int i = 0; i < fieldNodeList.getLength(); i++) {
            final Node fieldNode = fieldNodeList.item(i);
            if (fieldNode.getNodeName().equals("field")) {
                field = lookupXMLFieldNumber(document, fieldNode);
                groupDD.addField(field);
                final String required = getAttribute(fieldNode, "required");
                if (required != null && required.equalsIgnoreCase("Y") && groupRequired) {
                    groupDD.addRequiredField(msgtype, field);
                }
            } else if (fieldNode.getNodeName().equals("component")) {
                field = addXMLComponentFields(document, fieldNode, msgtype, groupDD, false);
            } else if (fieldNode.getNodeName().equals("group")) {
                field = lookupXMLFieldNumber(document, fieldNode);
                groupDD.addField(field);
                final String required = getAttribute(fieldNode, "required");
                if (required != null && required.equalsIgnoreCase("Y") && groupRequired) {
                    groupDD.addRequiredField(msgtype, field);
                }
                final boolean isRequired = required == null ? false : required
                        .equalsIgnoreCase("Y");
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
        final NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            final Node namedItem = attributes.getNamedItem(name);
            return namedItem != null ? namedItem.getNodeValue() : null;
        }
        return defaultValue;
    }

    /**
     * Data dictionary-related exception.
     */
    public static class Exception extends RuntimeException {

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

        //public int getIntValue() {
        //    return intValue;
        //}

        //public String getStringValue() {
        //    return stringValue;
        //}

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

        /**
         * For debugging
         */
        public String toString() {
            final StringBuffer b = new StringBuffer();
            b.append('(').append(intValue).append(',').append(stringValue).append(')');
            return b.toString();
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
