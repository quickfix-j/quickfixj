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

import static quickfix.FixVersions.*;
import quickfix.field.*;

/**
 * Helper class for delegating message types for various FIX versions to
 * type-safe onMessage methods.
 */
public class MessageCracker extends quickfix.fixt11.MessageCracker {

    /**
     * Process ("crack") a FIX message and call the type-safe onMessage method for
     * that message type and FIX version.
     */
    public void crack(quickfix.Message message, SessionID sessionID) throws UnsupportedMessageType,
            FieldNotFound, IncorrectTagValue {
        crack(message, sessionID, message.getHeader().getString(BeginString.FIELD));
    }

    private void crack(quickfix.Message message, SessionID sessionID, String beginString)
            throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
        if (beginString.equals(BEGINSTRING_FIX40)) {
            crack40((quickfix.fix40.Message) message, sessionID);
        } else if (beginString.equals(BEGINSTRING_FIX41)) {
            crack41((quickfix.fix41.Message) message, sessionID);
        } else if (beginString.equals(BEGINSTRING_FIX42)) {
            crack42((quickfix.fix42.Message) message, sessionID);
        } else if (beginString.equals(BEGINSTRING_FIX43)) {
            crack43((quickfix.fix43.Message) message, sessionID);
        } else if (beginString.equals(BEGINSTRING_FIX44)) {
            crack44((quickfix.fix44.Message) message, sessionID);
        } else if (beginString.equals(FIX50)) {
            crack50((quickfix.fix50.Message) message, sessionID);
        } else if (beginString.equals(BEGINSTRING_FIXT11)) {
            if (MessageUtils.isAdminMessage(message.getHeader().getString(MsgType.FIELD))) {
                crack11((quickfix.fixt11.Message) message, sessionID);
            } else {
                ApplVerID applVerID = message.getHeader().isSetField(ApplVerID.FIELD) ? new ApplVerID(message
                        .getHeader().getString(ApplVerID.FIELD)) : null;
                if (applVerID == null) {
                    Session session = lookupSession(sessionID);
                    applVerID = session.getTargetDefaultApplicationVersionID();
                }
                crack(message, sessionID, MessageUtils.toBeginString(applVerID));
            }
        } else {
            onMessage(message, sessionID);
        }
    }

    // Test hook
    Session lookupSession(SessionID sessionID) {
        return Session.lookupSession(sessionID);
    }

}
