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

import java.util.HashMap;
import java.util.Map;

import org.quickfixj.QFJException;

import quickfix.Message.Header;
import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SenderLocationID;
import quickfix.field.SenderSubID;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;

public class MessageUtils {

    private static final char FIELD_SEPARATOR = '\001';

    public static SessionID getSessionID(Message fixMessage) {
        final Header header = fixMessage.getHeader();
        return new SessionID(getFieldOrDefault(header, BeginString.FIELD, null), getFieldOrDefault(
                header, SenderCompID.FIELD, null), getFieldOrDefault(header, SenderSubID.FIELD,
                null), getFieldOrDefault(header, SenderLocationID.FIELD, null), getFieldOrDefault(
                header, TargetCompID.FIELD, null), getFieldOrDefault(header, TargetSubID.FIELD,
                null), getFieldOrDefault(header, TargetLocationID.FIELD, null), null);
    }

    public static SessionID getSessionID(String messageString) {
        return new SessionID(getStringField(messageString, BeginString.FIELD), getStringField(
                messageString, SenderCompID.FIELD),
                getStringField(messageString, SenderSubID.FIELD), getStringField(messageString,
                        SenderLocationID.FIELD), getStringField(messageString, TargetCompID.FIELD),
                getStringField(messageString, TargetSubID.FIELD), getStringField(messageString,
                        TargetLocationID.FIELD), null);
    }

    public static SessionID getReverseSessionID(Message fixMessage) {
        final Header header = fixMessage.getHeader();
        return new SessionID(getFieldOrDefault(header, BeginString.FIELD, null), getFieldOrDefault(
                header, TargetCompID.FIELD, null), getFieldOrDefault(header, TargetSubID.FIELD,
                null), getFieldOrDefault(header, TargetLocationID.FIELD, null), getFieldOrDefault(
                header, SenderCompID.FIELD, null), getFieldOrDefault(header, SenderSubID.FIELD,
                null), getFieldOrDefault(header, SenderLocationID.FIELD, null), null);
    }

    public static SessionID getReverseSessionID(String messageString) {
        return new SessionID(getStringField(messageString, BeginString.FIELD), getStringField(
                messageString, TargetCompID.FIELD),
                getStringField(messageString, TargetSubID.FIELD), getStringField(messageString,
                        TargetLocationID.FIELD), getStringField(messageString, SenderCompID.FIELD),
                getStringField(messageString, SenderSubID.FIELD), getStringField(messageString,
                        SenderLocationID.FIELD), null);
    }

    private static String getFieldOrDefault(FieldMap fields, int tag, String defaultValue) {
        if (fields.isSetField(tag)) {
            try {
                return fields.getString(tag);
            } catch (final FieldNotFound e) {
                // ignore, should never happen
                return null;
            }
        } else {
            return defaultValue;
        }
    }

    /**
     * Utility method for parsing a mesasge. This should only be used for parsing messages from
     * FIX versions 4.4 or earlier.
     * 
     * @param messageFactory
     * @param dataDictionary
     * @param messageString
     * @return the parsed message
     * @throws InvalidMessage
     */
    public static Message parse(MessageFactory messageFactory, DataDictionary dataDictionary,
            String messageString) throws InvalidMessage {
        final int index = messageString.indexOf(FIELD_SEPARATOR);
        if (index < 0) {
            throw new InvalidMessage("Message does not contain any field separator");
        }
        final String beginString = messageString.substring(2, index);
        final String messageType = getMessageType(messageString);
        final quickfix.Message message = messageFactory.create(beginString, messageType);
        message.fromString(messageString, dataDictionary, dataDictionary != null);
        return message;
    }

    /**
     * NOTE: This method is intended for internal use.
     * 
     * @param session - the Session that will process the message
     * @param messageString
     * @return the parsed message
     * @throws InvalidMessage
     */
    public static Message parse(Session session, String messageString) throws InvalidMessage {
        final String beginString = getStringField(messageString, BeginString.FIELD);
        final String msgType = getMessageType(messageString);

        ApplVerID applVerID = null;

        if (FixVersions.BEGINSTRING_FIXT11.equals(beginString)) {
            applVerID = getApplVerID(session, messageString);
        } else {
            applVerID = toApplVerID(beginString);
        }

        final MessageFactory messageFactory = session.getMessageFactory();

        final DataDictionaryProvider ddProvider = session.getDataDictionaryProvider();
        final DataDictionary sessionDataDictionary = ddProvider == null ? null : ddProvider
                .getSessionDataDictionary(beginString);
        final DataDictionary applicationDataDictionary = ddProvider == null ? null : ddProvider
                .getApplicationDataDictionary(applVerID);

        final quickfix.Message message = messageFactory.create(beginString, msgType);
        final DataDictionary payloadDictionary = MessageUtils.isAdminMessage(msgType)
                ? sessionDataDictionary
                : applicationDataDictionary;

        message.parse(messageString, sessionDataDictionary, payloadDictionary,
                payloadDictionary != null);

        return message;
    }

    private static ApplVerID getApplVerID(Session session, String messageString)
            throws InvalidMessage {
        ApplVerID applVerID = null;

        final String applVerIdString = getStringField(messageString, ApplVerID.FIELD);
        if (applVerIdString != null) {
            applVerID = new ApplVerID(applVerIdString);
        }

        if (applVerID == null) {
            applVerID = session.getTargetDefaultApplicationVersionID();
        }

        if (applVerID == null && isLogon(messageString)) {
            final String defaultApplVerIdString = getStringField(messageString,
                    DefaultApplVerID.FIELD);
            if (defaultApplVerIdString != null) {
                applVerID = new ApplVerID(defaultApplVerIdString);
            }
        }

        if (applVerID == null) {
            throw new InvalidMessage("Can't determine ApplVerID for message");
        }

        return applVerID;
    }

    public static boolean isAdminMessage(String msgType) {
        return msgType.length() == 1 && "0A12345".indexOf(msgType) != -1;
    }

    public static boolean isHeartbeat(String message) {
        return isMessageType(message, MsgType.HEARTBEAT);
    }

    public static boolean isLogon(String message) {
        return isMessageType(message, MsgType.LOGON);
    }

    private static boolean isMessageType(String message, String msgType) {
        try {
            return msgType.equals(getMessageType(message));
        } catch (final InvalidMessage e) {
            return false;
        }
    }

    public static String getMessageType(String messageString) throws InvalidMessage {
        final String value = getStringField(messageString, 35);
        if (value == null) {
            throw new InvalidMessage("Missing or garbled message type in " + messageString);
        }
        return value;
    }

    public static String getStringField(String messageString, int tag) {
        String value = null;
        final String tagString = Integer.toString(tag);
        int start = messageString.indexOf(tagString, 0);
        while (start != -1 && value == null) {
            if ((start == 0 || messageString.charAt(start - 1) == FIELD_SEPARATOR)) {
                int end = start + tagString.length();
                if ((end + 1) < messageString.length() && messageString.charAt(end) == '=') {
                    // found tag, get value
                    start = end = (end + 1);
                    for (; end < messageString.length()
                            && messageString.charAt(end) != FIELD_SEPARATOR; end++) {
                        ;
                    }
                    if (end == messageString.length()) {
                        return null;
                    } else {
                        value = messageString.substring(start, end);
                    }
                }
            }
            start = messageString.indexOf(tagString, start + 1);
        }
        return value;
    }

    private static Map<String, String> applVerIDtoBeginString = new HashMap<String, String>() {
        {
            // No support for earlier versions of FIX
            put(ApplVerID.FIX40, FixVersions.BEGINSTRING_FIX40);
            put(ApplVerID.FIX41, FixVersions.BEGINSTRING_FIX41);
            put(ApplVerID.FIX42, FixVersions.BEGINSTRING_FIX42);
            put(ApplVerID.FIX43, FixVersions.BEGINSTRING_FIX43);
            put(ApplVerID.FIX44, FixVersions.BEGINSTRING_FIX44);
            put(ApplVerID.FIX50, FixVersions.FIX50);
        }
    };

    /**
     * Convert an ApplVerID to a "begin string"
     * @param applVerID
     * @return the begin string for the specified ApplVerID.
     * @throws QFJException if conversion fails.
     * @see ApplVerID
     */
    public static String toBeginString(ApplVerID applVerID) throws QFJException {
        final String beginString = applVerIDtoBeginString.get(applVerID.getValue());
        if (beginString == null) {
            throw new QFJException("Unknown or unsupported ApplVerID: " + applVerID.getValue());
        }
        return beginString;
    }

    private static Map<String, ApplVerID> beginStringToApplVerID = new HashMap<String, ApplVerID>() {
        {
            // No support for earlier versions of FIX
            put(FixVersions.BEGINSTRING_FIX40, new ApplVerID(ApplVerID.FIX40));
            put(FixVersions.BEGINSTRING_FIX41, new ApplVerID(ApplVerID.FIX41));
            put(FixVersions.BEGINSTRING_FIX42, new ApplVerID(ApplVerID.FIX42));
            put(FixVersions.BEGINSTRING_FIX43, new ApplVerID(ApplVerID.FIX43));
            put(FixVersions.BEGINSTRING_FIX44, new ApplVerID(ApplVerID.FIX44));
            put(FixVersions.FIX50, new ApplVerID(ApplVerID.FIX50));
        }
    };

    /**
     * Convert a begin string to an ApplVerID
     * @param beginString
     * @return the ApplVerID for the specified begin string.
     * @throws QFJException if conversion fails.
     * @see FixVersions
     */
    public static ApplVerID toApplVerID(String beginString) throws QFJException {
        final ApplVerID applVerID = beginStringToApplVerID.get(beginString);
        if (applVerID == null) {
            throw new QFJException("Can't convert to ApplVerID: " + beginString);
        }
        return applVerID;
    }
}
