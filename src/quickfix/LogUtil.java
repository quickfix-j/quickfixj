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

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author sbate
 *
 */
public class LogUtil {
    /*
     * Logs a throwable as a session event, including the stack trace.
     * 
     * @param log a Session log
     * @param message error message
     * @param t the exception to log
     */
    public static void logThrowable(Log log, String message, Throwable t) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(message);
        t.printStackTrace(printWriter);
        log.onEvent(stringWriter.toString());
    }
    
    public static void logThrowable(SessionID sessionID, String message, Throwable t) {
        Session session = Session.lookupSession(sessionID);
        logThrowable(session.getLog(), message, t);
    }
}
