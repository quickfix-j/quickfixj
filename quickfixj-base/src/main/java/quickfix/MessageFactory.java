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

/**
 * Used by a Session to create a Message.
 *
 * see quickfix.Session
 */
public interface MessageFactory {

    /**
     * Creates a message for a specified type and FIX version
     *
     * @param beginString the FIX version (for example, "FIX.4.2")
     * @param msgType the FIX message type (for example, "D" for an order)
     * @return a message instance
     */
    Message create(String beginString, String msgType);

    /**
     * Creates a message for a specified type, FIX version, and ApplVerID.
     *
     * @param beginString the FIX version (for example, "FIX.4.2")
     * @param applVerID the ApplVerID (for example "6" for FIX44)
     * @param msgType the FIX message type (for example, "D" for an order)
     * @return a message instance
     */
    default Message create(String beginString, ApplVerID applVerID, String msgType) {
        return create(beginString, msgType);
    }

    /**
     * Creates a group for the specified parent message type and
     * for the fields with the corresponding field ID
     *
     * Example: to create a {quickfix.fix42.MarketDataRequest.NoMDEntryTypes}
     * you need to call
     * create({quickfix.field.MsgType#MARKET_DATA_REQUEST}, {quickfix.field.NoMDEntryTypes#FIELD})
     *
     * Function returns null if the group cannot be created.
     *
     * @param beginString the FIX version (for example, "FIX.4.2")
     * @param msgType Message type of the enclosing message
     * @param correspondingFieldID the fieldID of the field in the group
     * @return group, or null if the group can't be created.
     */
    Group create(String beginString, String msgType, int correspondingFieldID);
}
