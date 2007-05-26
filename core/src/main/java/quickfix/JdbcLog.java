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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.sql.DataSource;

class JdbcLog extends AbstractLog {
    public static final String MESSAGES_LOG_TABLE = "messages_log";
    public static final String EVENT_LOG_TABLE = "event_log";
    private final SessionID sessionID;
    private final DataSource dataSource;
    private final boolean logHeartbeats;
    private Throwable recursiveException = null;

    public JdbcLog(SessionSettings settings, SessionID sessionID, DataSource dataSource) throws SQLException,
            ClassNotFoundException, ConfigError, FieldConvertError {
        this.sessionID = sessionID;
        this.dataSource = dataSource == null ?
                JdbcUtil.getDataSource(settings, sessionID) : dataSource;
        
        if (settings.isSetting(JdbcSetting.SETTING_JDBC_LOG_HEARTBEATS)) {
            logHeartbeats = settings.getBool(JdbcSetting.SETTING_JDBC_LOG_HEARTBEATS);
        } else {
            logHeartbeats = true;
        }
        setLogHeartbeats(logHeartbeats);
    }

    public void onEvent(String value) {
        insert(EVENT_LOG_TABLE, value);
    }

    protected void logIncoming(String message) {
        insert(MESSAGES_LOG_TABLE, message);
    }

    protected void logOutgoing(String message) {
        insert(MESSAGES_LOG_TABLE, message);
    }

    /** Protect from the situation when you have recursive calls
     * into the logger b/c the previous one failed (in case of a failed DB connection, for example).
     * In case of going into a failure mode set a flag, ignore the recursive request and reset the flag.
     * @param tableName
     * @param value
     */
    private void insert(String tableName, String value) {
        Connection connection = null;
        PreparedStatement insert = null;
        if (recursiveException != null) {
            System.err.println("JdbcLog cannot log SQLException due to recursive log errors!");
            recursiveException.printStackTrace();
            recursiveException = null;
            return;
        }
        recursiveException = null;
        try {
            connection = dataSource.getConnection();
            insert = connection.prepareStatement("INSERT INTO " + tableName
                    + " (time, beginstring, sendercompid, targetcompid, session_qualifier, text) "
                    + "VALUES (?,?,?,?,?,?)");
            insert.setTimestamp(1, new Timestamp(SystemTime.getUtcCalendar().getTimeInMillis()));
            insert.setString(2, sessionID.getBeginString());
            insert.setString(3, sessionID.getSenderCompID());
            insert.setString(4, sessionID.getTargetCompID());
            insert.setString(5, sessionID.getSessionQualifier());
            insert.setString(6, value);
            insert.execute();
        } catch (SQLException e) {
            recursiveException = e;
            LogUtil.logThrowable(sessionID, e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, insert);
            JdbcUtil.close(sessionID, connection);
        }
    }

    /**
     * Deletes all rows from the log tables.
     */
    public void clear() {
        clearTable(EVENT_LOG_TABLE);
        clearTable(MESSAGES_LOG_TABLE);
    }

    private void clearTable(String tableName) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement("DELETE FROM " + tableName
                    + " WHERE beginString=? AND senderCompID=? "
                    + "AND targetCompID=? AND session_qualifier=?");
            statement.setString(1, sessionID.getBeginString());
            statement.setString(2, sessionID.getSenderCompID());
            statement.setString(3, sessionID.getTargetCompID());
            statement.setString(4, sessionID.getSessionQualifier());
            statement.execute();
        } catch (SQLException e) {
            LogUtil.logThrowable(sessionID, e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, statement);
            JdbcUtil.close(sessionID, connection);
        }
    }
}