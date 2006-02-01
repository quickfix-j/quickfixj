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
 * Creates a generic JDBC logger.
 */
public class JdbcLogFactory implements LogFactory {
    private SessionSettings settings;
    
    /**
     * Create a JDBC logger.
     * 
     * @param sessionID the sessionID for the message store.
     */
    public Log create(SessionID sessionID) {
        try {
            return new JdbcLog(settings, sessionID);
        } catch (Exception e) {
            throw new RuntimeError(e);
        }
    }

    /**
     * Create a factory using session settings.
     */
    public JdbcLogFactory(SessionSettings settings) {
        this.settings = settings;
    }
    
	/**
	 * Used to support the MySQL-specific class (JNI compatibility)
	 * 
	 * @return the session settings
	 * 
	 */
    protected SessionSettings getSettings() {
        return settings;
    }
}