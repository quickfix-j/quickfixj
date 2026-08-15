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

import quickfix.field.BeginString;
import quickfix.field.MsgType;
import quickfix.field.SessionRejectReason;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharArrayConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Validates messages against the metadata of a {@link DataDictionary},
 * applying the given {@link ValidationSettings}.
 */
public class DataDictionaryValidator {

    private final ValidationSettings settings;

    /**
     * @param settings the validation settings to apply; may be null, in which
     * case default settings are used
     */
    public DataDictionaryValidator(ValidationSettings settings) {
        this.settings = settings != null ? settings : new ValidationSettings();
    }

    /**
     * Validate a message, including the header and trailer fields.
     *
     * @param dataDictionary the dictionary to validate against
     * @param message the message
     * @throws IncorrectTagValue if a field value is not valid
     * @throws FieldNotFound if a field cannot be found
     * @throws IncorrectDataFormat if a field value has a wrong data type
     */
    public void validate(DataDictionary dataDictionary, Message message) throws IncorrectTagValue,
            FieldNotFound, IncorrectDataFormat {
        validate(dataDictionary, message, false);
    }

    /**
     * Validate the message body, with header and trailer fields being validated conditionally.
     *
     * @param dataDictionary the dictionary to validate against
     * @param message the message
     * @param bodyOnly whether to validate just the message body, or to validate the header and trailer sections as well.
     * @throws IncorrectTagValue if a field value is not valid
     * @throws FieldNotFound if a field cannot be found
     * @throws IncorrectDataFormat if a field value has a wrong data type
     */
    public void validate(DataDictionary dataDictionary, Message message, boolean bodyOnly)
            throws IncorrectTagValue, FieldNotFound, IncorrectDataFormat {
        validate(message, bodyOnly ? null : dataDictionary, dataDictionary);
    }

    /**
     * Validate the message header and trailer against the session data dictionary
     * and the body against the application data dictionary.
     *
     * @param message the message
     * @param sessionDataDictionary the dictionary for the header and trailer; if null, only the body is validated
     * @param applicationDataDictionary the dictionary for the message body
     * @throws IncorrectTagValue if a field value is not valid
     * @throws FieldNotFound if a field cannot be found
     * @throws IncorrectDataFormat if a field value has a wrong data type
     */
    public void validate(Message message, DataDictionary sessionDataDictionary,
            DataDictionary applicationDataDictionary) throws IncorrectTagValue, FieldNotFound,
            IncorrectDataFormat {
        final boolean bodyOnly = sessionDataDictionary == null;

        if (isVersionSpecified(sessionDataDictionary)
                && !sessionDataDictionary.getVersion().equals(
                        message.getHeader().getString(BeginString.FIELD))
                && !message.getHeader().getString(BeginString.FIELD).equals("FIXT.1.1")
                && !sessionDataDictionary.getVersion().equals("FIX.5.0")) {
            throw new UnsupportedVersion("Message version '" + message.getHeader().getString(BeginString.FIELD)
                    + "' does not match the data dictionary version '" + sessionDataDictionary.getVersion() + "'");
        }

        if (!message.hasValidStructure() && message.getException() != null) {
            throw message.getException();
        }

        final String msgType = message.getHeader().getString(MsgType.FIELD);
        if (isVersionSpecified(applicationDataDictionary)) {
            checkMsgType(applicationDataDictionary, msgType);
            checkHasRequired(applicationDataDictionary, message.getHeader(), message,
                    message.getTrailer(), msgType, bodyOnly);
        }

        if (!bodyOnly) {
            iterate(sessionDataDictionary, message.getHeader(), DataDictionary.HEADER_ID,
                    sessionDataDictionary);
            iterate(sessionDataDictionary, message.getTrailer(), DataDictionary.TRAILER_ID,
                    sessionDataDictionary);
        }

        iterate(applicationDataDictionary, message, msgType, applicationDataDictionary);
    }

    private static boolean isVersionSpecified(DataDictionary dd) {
        return dd != null && dd.hasVersion();
    }

    private void iterate(DataDictionary rootDictionary, FieldMap map, String msgType,
            DataDictionary dd) throws IncorrectTagValue, IncorrectDataFormat {
        for (final Field<?> f : map) {
            final StringField field = (StringField) f;

            checkHasValue(field);

            if (rootDictionary.hasVersion()) {
                checkValidFormat(rootDictionary, field);
                checkValue(rootDictionary, field);
            }

            if (rootDictionary.getVersion() != null) {
                checkField(dd, field, msgType, map instanceof Message);
                checkGroupCount(dd, field, map, msgType);
            }
        }

        for (final List<Group> groups : map.getGroups().values()) {
            for (final Group group : groups) {
                iterate(rootDictionary, group, msgType, dd.getGroup(msgType, group.getFieldTag())
                        .getDataDictionary());
            }
        }
    }

    /** Check if message type is defined in spec. **/
    private void checkMsgType(DataDictionary dd, String msgType) {
        if (!dd.isMsgType(msgType)) {
            throw new FieldException(SessionRejectReason.INVALID_MSGTYPE, MsgType.FIELD);
        }
    }

    /** Check if field tag is defined for message or group **/
    private void checkField(DataDictionary dd, Field<?> field, String msgType, boolean message) {
        // use different validation for groups and messages
        boolean messageField = message ? dd.isMsgField(msgType, field.getField()) : dd.isField(field.getField());
        boolean fail = dd.checkFieldFailure(settings, field.getField(), messageField);

        if (fail) {
            if (dd.isField(field.getField())) {
                throw new FieldException(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE, field.getField());
            } else {
                throw new FieldException(SessionRejectReason.INVALID_TAG_NUMBER, field.getField());
            }
        }
    }

    private void checkValidFormat(DataDictionary dd, StringField field) throws IncorrectDataFormat {
        FieldType fieldType = dd.getFieldType(field.getTag());
        if (fieldType == null) {
            return;
        }
        if (!settings.checkFieldsHaveValues && field.getValue().length() == 0) {
            return;
        }
        try {
            switch (fieldType) {
                case STRING:
                case MULTIPLEVALUESTRING:
                case MULTIPLESTRINGVALUE:
                case EXCHANGE:
                case LOCALMKTDATE:
                case DATA:
                case MONTHYEAR:
                case DAYOFMONTH:
                case COUNTRY:
                    // String
                    break;
                case MULTIPLECHARVALUE:
                    CharArrayConverter.convert(field.getValue());
                    break;
                case INT:
                case NUMINGROUP:
                case SEQNUM:
                case LENGTH:
                    IntConverter.convert(field.getValue());
                    break;
                case PRICE:
                case AMT:
                case QTY:
                case FLOAT:
                case PRICEOFFSET:
                case PERCENTAGE:
                    DoubleConverter.convert(field.getValue());
                    break;
                case BOOLEAN:
                    BooleanConverter.convert(field.getValue());
                    break;
                case UTCDATE:
                    UtcDateOnlyConverter.convert(field.getValue());
                    break;
                case UTCTIMEONLY:
                    UtcTimeOnlyConverter.convert(field.getValue());
                    break;
                case UTCTIMESTAMP:
                case TIME:
                    UtcTimestampConverter.convert(field.getValue());
                    break;
                case CHAR:
                    if (dd.getVersion().compareTo(FixVersions.BEGINSTRING_FIX41) > 0) {
                        CharConverter.convert(field.getValue());
                    } // otherwise it's a String, for older FIX versions
                    break;
            }
        } catch (final FieldConvertError e) {
            throw new IncorrectDataFormat(field.getTag(), field.getValue());
        }
    }

    private void checkValue(DataDictionary dd, StringField field) throws IncorrectTagValue {
        if (settings.allowUnknownEnumValues) {
            return;
        }
        int tag = field.getField();
        if (dd.hasFieldValue(tag) && !dd.isFieldValue(tag, field.getValue())) {
            throw new IncorrectTagValue(tag);
        }
    }

    /** Check if a field has a value. **/
    private void checkHasValue(StringField field) {
        if (settings.checkFieldsHaveValues && field.getValue().length() == 0) {
            throw new FieldException(SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE,
                    field.getField());
        }
    }

    /**
     * Check if group count matches number of groups in message. *
     */
    private void checkGroupCount(DataDictionary dd, StringField field, FieldMap fieldMap, String msgType) {
        final int fieldNum = field.getField();
        if (dd.isGroup(msgType, fieldNum)) {
            try {
                if (fieldMap.getGroupCount(fieldNum) != IntConverter.convert(field.getValue())) {
                    throwNewFieldException(fieldNum);
                }
            } catch (FieldConvertError ex) {
                throwNewFieldException(fieldNum);
            }
        }
    }

    private void throwNewFieldException(final int fieldNum) throws FieldException {
        throw new FieldException(
                SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                fieldNum);
    }

    /** Check if a message has all required fields. **/
    private void checkHasRequired(DataDictionary dd, FieldMap header, FieldMap body, FieldMap trailer,
            String msgType, boolean bodyOnly) {
        if (!bodyOnly) {
            checkHasRequired(dd, DataDictionary.HEADER_ID, header, bodyOnly);
            checkHasRequired(dd, DataDictionary.TRAILER_ID, trailer, bodyOnly);
        }

        checkHasRequired(dd, msgType, body, bodyOnly);
    }

    private void checkHasRequired(DataDictionary dd, String msgType, FieldMap fields, boolean bodyOnly) {
        final Set<Integer> requiredFieldsForMessage = dd.getRequiredFields(msgType);
        if (requiredFieldsForMessage == null || requiredFieldsForMessage.isEmpty()) {
            return;
        }

        for (int field : requiredFieldsForMessage) {
            if (!fields.isSetField(field)) {
                throw new FieldException(SessionRejectReason.REQUIRED_TAG_MISSING, field);
            }
        }

        final Map<Integer, List<Group>> groups = fields.getGroups();
        if (!groups.isEmpty()) {
            for (Map.Entry<Integer, List<Group>> entry : groups.entrySet()) {
                final DataDictionary.GroupInfo p = dd.getGroup(msgType, entry.getKey());
                if (p != null) {
                    for (Group groupInstance : entry.getValue()) {
                        checkHasRequired(p.getDataDictionary(), groupInstance, groupInstance,
                                groupInstance, msgType, bodyOnly);
                    }
                }
            }
        }
    }
}
