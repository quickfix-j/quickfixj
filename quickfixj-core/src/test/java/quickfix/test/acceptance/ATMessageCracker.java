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

package quickfix.test.acceptance;

import quickfix.FieldNotFound;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.UnsupportedMessageType;
import quickfix.field.ClOrdID;
import quickfix.field.PossResend;

import java.util.HashSet;

class ATMessageCracker extends quickfix.MessageCracker {

    private HashSet<Pair> orderIDs = new HashSet<>();

    public void reset() {
        orderIDs.clear();
    }

    public void process(Message message, SessionID sessionID) throws FieldNotFound {
        quickfix.Message echo = (quickfix.Message) message.clone();
        PossResend possResend = new PossResend(false);
        if (message.getHeader().isSetField(possResend))
            message.getHeader().getField(possResend);

        ClOrdID clOrdID = new ClOrdID();
        message.getField(clOrdID);

        Pair pair = new Pair(clOrdID, sessionID);

        if (possResend.getValue() && orderIDs.contains(pair))
            return;

        orderIDs.add(pair);
        try {
            Session.sendToTarget(echo, sessionID);
        } catch (SessionNotFound snf) {
        }
    }

    public void onMessage(quickfix.fix50.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    public void onMessage(quickfix.fix50.SecurityDefinition message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        try {
            Session.sendToTarget(message, sessionID);
        } catch (SessionNotFound snf) {
            snf.printStackTrace();
        }
    }

    public void onMessage(quickfix.fix44.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    public void onMessage(quickfix.fix44.SecurityDefinition message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        try {
            Session.sendToTarget(message, sessionID);
        } catch (SessionNotFound snf) {
            snf.printStackTrace();
        }
    }

    public void onMessage(quickfix.fix43.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    public void onMessage(quickfix.fix43.SecurityDefinition message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        try {
            Session.sendToTarget(message, sessionID);
        } catch (SessionNotFound snf) {
            snf.printStackTrace();
        }
    }

    public void onMessage(quickfix.fix42.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    public void onMessage(quickfix.fix42.SecurityDefinition message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        try {
            Session.sendToTarget(message, sessionID);
        } catch (SessionNotFound snf) {
            snf.printStackTrace();
        }
    }

    public void onMessage(quickfix.fix41.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    public void onMessage(quickfix.fix40.NewOrderSingle message, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        process(message, sessionID);
    }

    private static class Pair {

        private final ClOrdID clOrdID;
        private final SessionID sessionID;
        private int hashCode = 0;

        public Pair(ClOrdID clOrdID, SessionID sessionID) {
            this.clOrdID = clOrdID;
            this.sessionID = sessionID;
            hashCode = ("C:" + clOrdID.toString() + "S:" + sessionID.toString()).hashCode();
        }

        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (!(object instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) object;

            return clOrdID.equals(pair.clOrdID) && sessionID.equals(pair.sessionID);
        }

        public int hashCode() {
            return hashCode;
        }
    }

}
