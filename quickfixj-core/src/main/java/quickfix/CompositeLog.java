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

/**
 * This log factory can be used to log messages and events with more than
 * one logger. For example, you can log to both the screen and to a file
 * or database.
 */
class CompositeLog implements Log {
    private Logger defaultLog = LoggerFactory.getLogger(getClass());
    private final Log[] logs;
    private boolean rethrowException;

    public CompositeLog(Log[] logs) {
        this.logs = logs;
    }

    public void clear() {
        for (int i = 0; i < logs.length; i++) {
            try {
                logs[i].clear();
            } catch (Throwable e) {
                handleError(e);
            }
        }
    }

    private void handleError(Throwable e) {
        if (rethrowException) {
            throw new RuntimeException(e);
        }
        defaultLog.error(e.getMessage() + ", continuing", e);
    }

    public void onIncoming(String message) {
        for (int i = 0; i < logs.length; i++) {
            try {
                logs[i].onIncoming(message);
            } catch (Throwable e) {
                handleError(e);
            }
        }
    }

    public void onOutgoing(String message) {
        for (int i = 0; i < logs.length; i++) {
            try {
                logs[i].onOutgoing(message);
            } catch (Throwable e) {
                defaultLog.error(e.getMessage() + ", continuing", e);
            }
        }
    }

    public void onEvent(String text) {
        for (int i = 0; i < logs.length; i++) {
            try {
                logs[i].onEvent(text);
            } catch (Throwable e) {
                handleError(e);
            }
        }
    }

    public void onErrorEvent(String text) {
        for (int i = 0; i < logs.length; i++) {
            try {
                logs[i].onErrorEvent(text);
            } catch (Throwable e) {
                handleError(e);
            }
        }
    }

    // Test Support
    void setRethrowExceptions(boolean flag) {
        rethrowException = flag;
    }

}
