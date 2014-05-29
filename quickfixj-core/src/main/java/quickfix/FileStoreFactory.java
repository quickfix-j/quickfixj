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
 * 
 * Compatibility note: The file formats are not compatible with QF C++/JNI. 
 * If you upgrading from the QuickFIX JNI, you must delete your old session 
 * state files.)
 */
public class FileStoreFactory implements MessageStoreFactory {
    /**
     * File path for writing the message store.
     */
    public static final String SETTING_FILE_STORE_PATH = "FileStorePath";

    /**
     * Boolean option for controlling whether the FileStore syncs to the hard
     * drive on every write. It's safer to sync, but it's also much slower (100x
     * or more slower in some cases).
     */
    public static final String SETTING_FILE_STORE_SYNC = "FileStoreSync";

    /**
     * Numeric option limiting the number of messages stored in the in-memory
     * message index. If, during recovery, one or more messages are requested 
     * whose offset/size is not cached in memory, the on-disk header file will 
     * be searched. Values can be from 0 to Integer.MAX_VALUE (default), inclusive.
     */
    public static final String SETTING_FILE_STORE_MAX_CACHED_MSGS = "FileStoreMaxCachedMsgs";

    protected final SessionSettings settings;
        
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
            boolean syncWrites = false;
            if (settings.isSetting(sessionID, SETTING_FILE_STORE_SYNC)) {
                syncWrites = settings.getBool(sessionID, SETTING_FILE_STORE_SYNC);
            }
            int maxCachedMsgs = Integer.MAX_VALUE;
            if (settings.isSetting(sessionID, SETTING_FILE_STORE_MAX_CACHED_MSGS)) {
                long maxCachedMsgsSetting = settings.getLong(sessionID, SETTING_FILE_STORE_MAX_CACHED_MSGS);
                if (maxCachedMsgsSetting >= 0 && maxCachedMsgsSetting <= (long) Integer.MAX_VALUE) {
                    maxCachedMsgs = (int) maxCachedMsgsSetting;
                }
            }
            return new FileStore(settings.getString(sessionID, FileStoreFactory.SETTING_FILE_STORE_PATH), sessionID, syncWrites, maxCachedMsgs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}
}
