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
        String throwableString = constructThrowableString(message, t);
        log.onErrorEvent(throwableString);
    }

    private static String constructThrowableString(String message, Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(message);
        if (t != null) {
            t.printStackTrace(printWriter);
            if (t.getCause() != null) {
                printWriter.println("Cause: " + t.getCause().getMessage());
                t.getCause().printStackTrace(printWriter);
            }
        }
        return stringWriter.toString();
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
    
    /**
     * Logs a throwable including the stack trace as a session warning event.
     * If session cannot be found, the general log is used.
     * 
     * @param sessionID sessionID of Session to lookup
     * @param message the message to log
     * @param throwable throwable to log
     */
    public static void logWarning(SessionID sessionID, String message, Throwable throwable) {
        String throwableString = constructThrowableString(message, throwable);
        logWarning(sessionID, throwableString);
    }
    
    /**
     * Logs a warning as a session event if the session is registered, otherwise
     * the general log is used.
     * 
     * @param sessionID sessionID of Session to lookup
     * @param message the message to log
     */
    public static void logWarning(SessionID sessionID, String message) {
        final Session session = Session.lookupSession(sessionID);
        final String messageToLog;
        if (session != null) {
            messageToLog = message;
        } else {
            messageToLog = message + " sessionID=" + sessionID;
        }
        logWarning(session, messageToLog);
    }

    /**
     * Logs a warning as a session event if the session is not NULL, otherwise
     * the general log is used.
     * 
     * @param session the session to use
     * @param message the message to log
     */
    static void logWarning(final Session session, String message) {
        if (session != null) {
            session.getLog().onWarnEvent(message);
        } else {
            log.warn(message);
        }
    }

}
