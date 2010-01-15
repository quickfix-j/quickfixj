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

import java.io.PrintStream;

import quickfix.field.converter.UtcTimestampConverter;

/**
 * Screen log implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN COMPATIBILITY WITH THE QUICKFIX JNI. IT SHOULD ONLY
 * BE CREATED USING A FACTORY.
 * 
 * @see quickfix.ScreenLogFactory
 */
public class ScreenLog extends AbstractLog {

    private static final String EVENT_CATEGORY = "event";
    
    private static final String ERROR_EVENT_CATEGORY = "error";

    private static final String OUTGOING_CATEGORY = "outgoing";

    private static final String INCOMING_CATEGORY = "incoming";

    private PrintStream out;

    private final SessionID sessionID;

    private final boolean incoming;

    private final boolean outgoing;

    private final boolean events;

    private final boolean includeMillis;

    ScreenLog(boolean incoming, boolean outgoing, boolean events, boolean logHeartbeats, boolean includeMillis,
            SessionID sessionID, PrintStream out) {
        setLogHeartbeats(logHeartbeats);
        this.out = out;
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.events = events;
        this.sessionID = sessionID;
        this.includeMillis = includeMillis;
    }

    protected void logIncoming(String message) {
        if (incoming) {
            logMessage(message, INCOMING_CATEGORY);
        }
    }

    protected void logOutgoing(String message) {
        if (outgoing) {
            logMessage(message, OUTGOING_CATEGORY);
        }
    }

    private void logMessage(String message, String type) {
        log(message, type);
    }

    public void onEvent(String message) {
        if (events) {
            log(message, EVENT_CATEGORY);
        }
    }

    public void onErrorEvent(String message) {
        log(message, ERROR_EVENT_CATEGORY);
    }

    private void log(String message, String type) {
        out.println("<" + UtcTimestampConverter.convert(SystemTime.getDate(), includeMillis) + ", " + sessionID + ", "
                + type + "> (" + message + ")");
    }

    // For Testing
    void setOut(PrintStream out) {
        this.out = out;
    }

    public void clear() {
        onEvent("Log clear operation is not supported: " + getClass().getName());
    }

}