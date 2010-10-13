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

import javax.sql.DataSource;

/**
 * Creates a generic JDBC message store.
 */
public class JdbcStoreFactory implements MessageStoreFactory {
    private final SessionSettings settings;
    private DataSource dataSource;
    
    /**
     * Create a factory using session settings.
     */
    public JdbcStoreFactory(SessionSettings settings) {
        this.settings = settings;
    }

    /**
     * Create a JDBC message store.
     * 
     * @param sessionID the sessionID for the message store.
     */
    public MessageStore create(SessionID sessionID) {
        try {
            return new JdbcStore(settings, sessionID, dataSource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
