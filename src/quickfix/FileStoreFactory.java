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
 * Creates a message store that stores messages in a file.
 */
public class FileStoreFactory implements MessageStoreFactory {
    /**
     * File path for writing the message store.
     */
    public static final String SETTING_FILE_STORE_PATH = "FileStorePath";

    private final SessionSettings settings;
        
    /**
     * Create the factory with configuration in session settings.
     * @param settings
     */
    public FileStoreFactory(SessionSettings settings) {
        this.settings = settings;
    }
    
    /**
     * Creates a file-based message store.
     * 
     * @param sessionID session ID for the message store.
     */
	public MessageStore create(SessionID sessionID) {
		try {
            return new FileStore(settings.getString(sessionID, FileStoreFactory.SETTING_FILE_STORE_PATH), sessionID);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}
}
