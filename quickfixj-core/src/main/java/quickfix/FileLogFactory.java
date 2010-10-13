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
 * Factory for creating file-based loggers. See SessionSettings for
 * configuration.
 * 
 * @see quickfix.SessionSettings
 */
public class FileLogFactory implements LogFactory {
    /**
     * File path for writing the session log.
     */
    public static final String SETTING_FILE_LOG_PATH = "FileLogPath";

    /**
     * Specify whether to include milliseconds in log output time stamps. Off, by
     * default.
     */
    public static final String SETTING_INCLUDE_MILLIS_IN_TIMESTAMP = "FileIncludeMilliseconds";
    
    /**
     * Specify whether to include time stamps for message input and output. Off, by
     * default.
     */
    public static final String SETTING_INCLUDE_TIMESTAMP_FOR_MESSAGES = "FileIncludeTimeStampForMessages";

    /**
     * Specify whether to include time stamps for message input and output. Off, by
     * default.
     */
    public static final String SETTING_LOG_HEARTBEATS = "FileLogHeartbeats";

    private SessionSettings settings;

    /**
     * Create the factory with configuration in session settings.
     * 
     * @param settings
     */
    public FileLogFactory(SessionSettings settings) {
        this.settings = settings;
    }

    /**
     * Creates a file-based logger.
     * 
     * @param sessionID
     *            session ID for the logger
     */
    public Log create(SessionID sessionID) {
        try {
            boolean includeMillis = false;
            if (settings.isSetting(sessionID, SETTING_INCLUDE_MILLIS_IN_TIMESTAMP)) {
                includeMillis = settings.getBool(sessionID, SETTING_INCLUDE_MILLIS_IN_TIMESTAMP);
            }
            
            boolean includeTimestampInMessages = false;
            if (settings.isSetting(sessionID, SETTING_INCLUDE_TIMESTAMP_FOR_MESSAGES)) {
                includeTimestampInMessages = settings.getBool(sessionID, SETTING_INCLUDE_TIMESTAMP_FOR_MESSAGES);
            }
       
            boolean logHeartbeats = true;
            if (settings.isSetting(sessionID, SETTING_LOG_HEARTBEATS)) {
                logHeartbeats = settings.getBool(sessionID, SETTING_LOG_HEARTBEATS);
            }

            return new FileLog(settings.getString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH),
                    sessionID, includeMillis, includeTimestampInMessages, logHeartbeats);
        } catch (Exception e) {
            throw new RuntimeError(e);
        }
    }

    public Log create() {
        throw new UnsupportedOperationException();
    }
}