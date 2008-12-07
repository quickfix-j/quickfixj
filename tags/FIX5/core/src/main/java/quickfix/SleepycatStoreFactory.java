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
 * Message store using the Sleepycat Java Edition database for message and
 * sequence number storage.
 */
public class SleepycatStoreFactory implements MessageStoreFactory {
    /**
     * Directory path where Sleepycat files are stored. This directory must already
     * exist. Required.
     */
    public static final String SETTING_SLEEPYCAT_DATABASE_DIR = "SleepycatDatabaseDir";
    /**
     * Database name for the sequence number database. Optional.
     */
    public static final String SETTING_SLEEPYCAT_SEQUENCE_DB_NAME = "SleepycatSequenceDbName";
    /**
     * Database name for the message database. Optional.
     */
    public static final String SETTING_SLEEPYCAT_MESSAGE_DB_NAME = "SleepycatMessageDbName";
    
    private SessionSettings settings = new SessionSettings();

    public SleepycatStoreFactory(SessionSettings settings) {
        this.settings = settings;
    }

    public MessageStore create(SessionID sessionID) {
        try {
            String dbDir = settings.getString(sessionID, SETTING_SLEEPYCAT_DATABASE_DIR);
            String seqDbName = "seq";
            if (settings.isSetting(sessionID, SETTING_SLEEPYCAT_SEQUENCE_DB_NAME)) {
                seqDbName = settings.getString(sessionID, SETTING_SLEEPYCAT_SEQUENCE_DB_NAME);
            }
            String msgDbName = "msg";
            if (settings.isSetting(sessionID, SETTING_SLEEPYCAT_MESSAGE_DB_NAME)) {
                msgDbName = settings.getString(sessionID, SETTING_SLEEPYCAT_MESSAGE_DB_NAME);
            }
            return new SleepycatStore(sessionID, dbDir, seqDbName, msgDbName);
        } catch (Exception e) {
            throw new RuntimeError(e);
        }
    }
}