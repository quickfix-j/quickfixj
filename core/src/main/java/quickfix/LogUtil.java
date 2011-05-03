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

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utilities for logging session-related events.
 *
 */
public class LogUtil {
    private final static Logger log = LoggerFactory.getLogger(LogUtil.class);

    /**
     * Logs a throwable as a session event, including the stack trace.
     * 
     * @param log a Session log
     * @param message error message
     * @param t the exception to log
     */
    public static void logThrowable(Log log, String message, Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(message);
        t.printStackTrace(printWriter);
        log.onErrorEvent(stringWriter.toString());
    }

    /**
     * Logs a throwable as a session event, including the stack trace.
     * 
     * @param sessionID the session ID
     * @param message the error message
     * @param t the exception to log
     */
    public static void logThrowable(SessionID sessionID, String message, Throwable t) {
        final Session session = Session.lookupSession(sessionID);
        if (session != null) {
            logThrowable(session.getLog(), message, t);
        } else {
            // QFJ-335
            // It's possible the session has been deregistered by the time
            // we log the message, so this is the fallback logging.
            log.error(message, t);
        }
    }
    
}
