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
            return new FileLog(settings.getString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH),
                    sessionID);
        } catch (Exception e) {
            throw new RuntimeError(e);
        }
    }
}