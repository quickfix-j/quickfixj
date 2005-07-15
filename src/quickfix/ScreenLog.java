/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import java.io.PrintStream;

import quickfix.field.converter.UtcTimestampConverter;

/**
 * Screen log implementation. THIS CLASS IS PUBLIC ONLY TO MAINTAIN
 * COMPATIBILITY WITH THE QUICKFIX JNI. IT SHOULD ONLY BE CREATED USING A
 * FACTORY.
 * 
 * @see quickfix.ScreenLogFactory
 */
public class ScreenLog implements Log {
    private static final String EVENT_CATEGORY = "event";
    private static final String OUTGOING_CATEGORY = "outgoing";
    private static final String INCOMING_CATEGORY = "incoming";
    private PrintStream out;
    private SessionID sessionID;
    private boolean incoming;
    private boolean outgoing;
    private boolean events;

    ScreenLog(boolean incoming, boolean outgoing, boolean events, SessionID sessionID,
            PrintStream out) {
        this.out = out;
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.events = events;
        this.sessionID = sessionID;
    }

    public void onIncoming(String message) {
        if (incoming) {
            log(message, INCOMING_CATEGORY);
        }

    }

    public void onOutgoing(String message) {
        if (outgoing) {
            log(message, OUTGOING_CATEGORY);
        }

    }

    public void onEvent(String message) {
        if (events) {
            log(message, EVENT_CATEGORY);
        }

    }

    private void log(String message, String type) {
        out.println("<" + UtcTimestampConverter.convert(SystemTime.getDate(), false) + ", " + sessionID
                + ", " + type + "> (" + message + ")");
    }

    // For Testing
    void setOut(PrintStream out) {
        this.out = out;
    }
}