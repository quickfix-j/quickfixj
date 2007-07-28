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


/**
 * Allows multiple log factories to be used with QuickFIX/J. For example,
 * you could log events to the console and also log all events and messages to
 * a file.
 */
public class CompositeLogFactory implements LogFactory {
    private final LogFactory[] logFactories;

    /**
     * Defines a composite log factory based on a set of existing
     * LogFactory implementations.
     * @param logFactories the factories to be used in the composite
     * @see LogFactory
     */
    public CompositeLogFactory(LogFactory[] logFactories) {
        this.logFactories = logFactories;
    }

    /**
     * Create the composite Log. This is typically used by the SessionFactory.
     * @param sessionID the session associated with the log
     * @return the composite log
     * @see SessionFactory
     */
    public Log create(SessionID sessionID) {
        Log[] logs = new Log[logFactories.length];
        for (int i = 0; i < logFactories.length; i++) {
            if (logFactories[i] instanceof LocationAwareLogFactory) {
                logs[i] = ((LocationAwareLogFactory) logFactories[i]).create(sessionID,
                        CompositeLog.class.getName());
            } else {
                logs[i] = logFactories[i].create(sessionID);
            }
        }
        return new CompositeLog(logs);
    }

    public Log create() {
        throw new UnsupportedOperationException();
    }

}
