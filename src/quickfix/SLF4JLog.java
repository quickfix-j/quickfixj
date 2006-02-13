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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLog implements quickfix.Log {
    public static final String DEFAULT_EVENT_CATEGORY = "quickfixj.event";
    public static final String DEFAULT_INCOMING_MSG_CATEGORY = "quickfixj.msg.incoming";
    public static final String DEFAULT_OUTGOING_MSG_CATEGORY = "quickfixj.msg.outgoing";

    private final SessionID sessionID;
    private final Logger eventLog;
    private final Logger incomingMsgLog;
    private final Logger outgoingMsgLog;

    public SLF4JLog(SessionID sessionID, String eventCategory, String incomingMsgCategory,
            String outgoingMsgCategory) {
        this.sessionID = sessionID;
        eventLog = LoggerFactory
                .getLogger(eventCategory != null ? eventCategory : DEFAULT_EVENT_CATEGORY);
        incomingMsgLog = LoggerFactory.getLogger(incomingMsgCategory != null ? incomingMsgCategory
                : DEFAULT_INCOMING_MSG_CATEGORY);
        outgoingMsgLog = LoggerFactory.getLogger(outgoingMsgCategory != null ? outgoingMsgCategory
                : DEFAULT_OUTGOING_MSG_CATEGORY);
    }

    public void onEvent(String text) {
        log(eventLog, text);
    }

    public void onIncoming(String message) {
        log(incomingMsgLog, message);
    }

    public void onOutgoing(String message) {
        log(outgoingMsgLog, message);
    }

    private void log(Logger log, String text) {
        log.info(sessionID+": "+text);
    }

    public void clear() {
        onEvent("Log clear operation is not supported: " + getClass().getName());
    }

}
