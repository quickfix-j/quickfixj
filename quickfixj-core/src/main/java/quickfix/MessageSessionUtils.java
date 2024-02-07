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

import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;

public class MessageSessionUtils {

    /**
     * NOTE: This method is intended for internal use.
     *
     * @param session the Session that will process the message
     * @param messageString
     * @return the parsed message
     * @throws InvalidMessage
     */
    public static Message parse(Session session, String messageString) throws InvalidMessage {
        final String beginString = MessageUtils.getStringField(messageString, BeginString.FIELD);
        final String msgType = MessageUtils.getMessageType(messageString);
        final boolean isLogon = MessageUtils.isLogonMsgType(msgType);
        final MessageFactory messageFactory = session.getMessageFactory();
        final DataDictionaryProvider ddProvider = session.getDataDictionaryProvider();
        final ApplVerID applVerID;
        final DataDictionary sessionDataDictionary = ddProvider == null ? null : ddProvider
                .getSessionDataDictionary(beginString);
        final quickfix.Message message;
        final DataDictionary payloadDictionary;

        if (!MessageUtils.isAdminMessage(msgType) || isLogon) {
            if (FixVersions.BEGINSTRING_FIXT11.equals(beginString)) {
                applVerID = getApplVerID(session, messageString, isLogon);
            } else {
                applVerID = MessageUtils.toApplVerID(beginString);
            }
            
            if (isLogon) {
                payloadDictionary = sessionDataDictionary;
            } else {    // we got an app message
                final DataDictionary applicationDataDictionary = ddProvider == null ? null : ddProvider
                        .getApplicationDataDictionary(applVerID);
                payloadDictionary = applicationDataDictionary;
            }
        } else {
            applVerID = null;
            payloadDictionary = sessionDataDictionary;
        }

        final boolean doValidation = payloadDictionary != null;
        final boolean validateChecksum = session.isValidateChecksum();

        message = messageFactory.create(beginString, applVerID, msgType);
        message.parse(messageString, sessionDataDictionary, payloadDictionary, doValidation,
                validateChecksum);

        return message;
    }

    private static ApplVerID getApplVerID(Session session, String messageString, boolean isLogon)
            throws InvalidMessage {
        ApplVerID applVerID = null;

        final String applVerIdString = MessageUtils.getStringField(messageString, ApplVerID.FIELD);
        if (applVerIdString != null) {
            applVerID = new ApplVerID(applVerIdString);
        }

        if (applVerID == null) {
            applVerID = session.getTargetDefaultApplicationVersionID();
        }

        if (applVerID == null && isLogon) {
            final String defaultApplVerIdString = MessageUtils.getStringField(messageString,
                    DefaultApplVerID.FIELD);
            if (defaultApplVerIdString != null) {
                applVerID = new ApplVerID(defaultApplVerIdString);
            }
        }

        if (applVerID == null) {
            throw MessageUtils.newInvalidMessageException("Can't determine ApplVerID from message " + messageString, MessageUtils.getMinimalMessage(messageString));
        }

        return applVerID;
    }
}
