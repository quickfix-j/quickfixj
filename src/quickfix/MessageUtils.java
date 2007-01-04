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
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;
import quickfix.Message.Header;

public class MessageUtils {
	public static SessionID getSessionID(Message fixMessage) {
		Header header = fixMessage.getHeader();
		return new SessionID(
				getFieldOrDefault(header, BeginString.FIELD, null),
				getFieldOrDefault(header, SenderCompID.FIELD, null),
				getFieldOrDefault(header, TargetCompID.FIELD, null));
	}

    public static SessionID getSessionID(String messageString) {
        return new SessionID(
                getStringField(messageString, BeginString.FIELD),
                getStringField(messageString, SenderCompID.FIELD),
                getStringField(messageString, TargetCompID.FIELD));
    }

	public static SessionID getReverseSessionID(Message fixMessage) {
		Header header = fixMessage.getHeader();
		return new SessionID(
				getFieldOrDefault(header, BeginString.FIELD, null),
				getFieldOrDefault(header, TargetCompID.FIELD, null),
				getFieldOrDefault(header, SenderCompID.FIELD, null));
	}

    public static SessionID getReverseSessionID(String messageString) {
        return new SessionID(
                getStringField(messageString, BeginString.FIELD),
                getStringField(messageString, TargetCompID.FIELD),
                getStringField(messageString, SenderCompID.FIELD));
    }

	private static String getFieldOrDefault(FieldMap fields, int tag,
			String defaultValue) {
		if (fields.isSetField(tag)) {
			try {
				return fields.getString(tag);
			} catch (FieldNotFound e) {
				// ignore, should never happen
				return null;
			}
		} else {
			return defaultValue;
		}
	}

	public static Message parse(MessageFactory messageFactory,
			DataDictionary dataDictionary, String messageString)
			throws InvalidMessage {
		String beginString = messageString.substring(2, 9);
		String messageType = getMessageType(messageString);
		quickfix.Message message = messageFactory.create(beginString,
				messageType);
		message.fromString(messageString, dataDictionary,
				dataDictionary != null);
		return message;
	}

	public static String getStringField(String messageString, int tag) {
		String tagString = Integer.toString(tag);
		String value = null;
		int start = messageString.indexOf(tagString, 0);
		while (start != -1 && value == null) {
			if ((start == 0 || messageString.charAt(start - 1) == '\001')) {
				int end = start + tagString.length();
				if ((end + 1) < messageString.length() && messageString.charAt(end) == '=') {
					// found tag, get value
					start = end = (end + 1);
					for (; end < messageString.length() && messageString.charAt(end) != '\001'; end++);
					if (end == messageString.length()) {
						return null;
					} else {
						value = messageString.substring(start, end);
					}
				}
			}
			start = messageString.indexOf(tagString, start+1);
		}
		return value;
	}

	public static String getMessageType(String messageString)
			throws InvalidMessage {
		int messageTypeTagStart = messageString.indexOf("35=");
        if (messageTypeTagStart == -1) {
            throw new InvalidMessage("missing message type");
        }
        int messageTypeValueStart = messageTypeTagStart + 3;
		int messageTypeEnd = Math.min(messageString.length(), messageTypeValueStart);
		while (messageString.charAt(messageTypeEnd) != '\001') {
		    messageTypeEnd++;
		    if (messageTypeEnd >= messageString.length()) {
		        throw new InvalidMessage("couldn't extract message type");
		    }
		}
		return messageString.substring(messageTypeValueStart, messageTypeEnd);
	}
}
