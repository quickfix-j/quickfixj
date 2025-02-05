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
    private final Logger defaultLog = LoggerFactory.getLogger(getClass());
    private final Log[] logs;
    private boolean rethrowException;

    public CompositeLog(Log[] logs) {
        this.logs = logs;
    }

    public void clear() {
        for (Log log : logs) {
            try {
                log.clear();
            } catch (Exception e) {
                handleError(e);
            }
        }
    }

    private void handleError(Exception e) {
        if (rethrowException) {
            throw new RuntimeException(e);
        }
        defaultLog.error(e.getMessage() + ", continuing", e);
    }

    public void onIncoming(String message) {
        for (Log log : logs) {
            try {
                log.onIncoming(message);
            } catch (Exception e) {
                handleError(e);
            }
        }
    }

    public void onOutgoing(String message) {
        for (Log log : logs) {
            try {
                log.onOutgoing(message);
            } catch (Exception e) {
                defaultLog.error(e.getMessage() + ", continuing", e);
            }
        }
    }

    public void onEvent(String text) {
        for (Log log : logs) {
            try {
                log.onEvent(text);
            } catch (Exception e) {
                handleError(e);
            }
        }
    }

    public void onErrorEvent(String text) {
        for (Log log : logs) {
            try {
                log.onErrorEvent(text);
            } catch (Exception e) {
                handleError(e);
            }
        }
    }

    // Test Support
    void setRethrowExceptions(boolean flag) {
        rethrowException = flag;
    }

}
