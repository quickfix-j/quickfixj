package quickfix;

import quickfix.field.MsgType;

/**
 * Message-related utilities
 */
public class MessageUtils {
    
    /**
     * Threadsafe message factory for parsing FIX message data. 
     */
    private static DefaultMessageFactory messageFactory = new DefaultMessageFactory();

    /**
     * Parse a FIX message string using the provided data dictionary.
     * @param rawMessage FIX message string
     * @param dataDictionary message metadata
     * @return the parsed message
     * @throws InvalidMessage
     */
    public static quickfix.Message parseRawMessage(String rawMessage, DataDictionary dataDictionary) throws InvalidMessage {
        String beginString = rawMessage.substring(2, 9);
        int messageTypeOffset = rawMessage.indexOf("35=") + 3;
        // TODO Must handle multicharacter message types
        String messageType = rawMessage.substring(messageTypeOffset, messageTypeOffset + 1);
        quickfix.Message fixMessage = messageFactory.create(beginString, messageType);
        fixMessage.fromString(rawMessage, dataDictionary, true);
        return fixMessage;
    }

    /**
     * Get the session ID from a FIX message string
     * @param messageData FIX message string
     * @param reverse reverse the sender and target (for replies)
     * @return the session ID
     */
    public static SessionID getSessionID(String messageData, boolean reverse) {
        String targetCompID = null;
        String senderCompID = null;
        // data is cached in message
        // skip known header bytes
        for (int i = 13; i < messageData.length() && targetCompID == null || senderCompID == null; i++) {
            if (startsWith(messageData, i, "56=")) {
                targetCompID = getValue(messageData, i + 3);
            } else if (startsWith(messageData, i, "49=")) {
                senderCompID = getValue(messageData, i + 3);
            }
        }
        return new SessionID(messageData.substring(2, 9), (reverse ? targetCompID : senderCompID),
                (reverse ? senderCompID : targetCompID));
    }

    private static boolean startsWith(String messageData, int offset, String prefix) {
        for (int i = 0; i < prefix.length(); i++) {
            int dataOffset = offset + i;
            if (dataOffset > messageData.length()) {
                return false;
            }
            if (messageData.charAt(dataOffset) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static  String getValue(String messageData, int offset) {
        int i = offset;
        while (i < messageData.length() && messageData.charAt(i) != '\001') {
            i++;
        }
        return messageData.substring(offset, i);
    }
    
    /**
     * Predicate for determining if message is a LOGON message
     * @param message
     * @return true is the message is a logon message, false otherwise
     * @throws FieldNotFound
     */
    public static boolean isLogonMessage(Message message) throws FieldNotFound {
        return message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON);
    }
}
