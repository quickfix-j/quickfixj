package quickfix;

import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;

public class MessageParser {
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

        ApplVerID applVerID;

        if (FixVersions.BEGINSTRING_FIXT11.equals(beginString)) {
            applVerID = getApplVerID(session, messageString);
        } else {
            applVerID = MessageUtils.toApplVerID(beginString);
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

        final String applVerIdString = MessageUtils.getStringField(messageString, ApplVerID.FIELD);
        if (applVerIdString != null) {
            applVerID = new ApplVerID(applVerIdString);
        }

        if (applVerID == null) {
            applVerID = session.getTargetDefaultApplicationVersionID();
        }

        if (applVerID == null && MessageUtils.isLogon(messageString)) {
            final String defaultApplVerIdString = MessageUtils.getStringField(messageString,
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



}
