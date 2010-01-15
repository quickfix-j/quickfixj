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

import static quickfix.JdbcSetting.*;
import static quickfix.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

class JdbcLog extends AbstractLog {
    private static final String DEFAULT_MESSAGES_LOG_TABLE = "messages_log";
    private static final String DEFAULT_EVENT_LOG_TABLE = "event_log";
    private final String outgoingMessagesTableName;
    private final String incomingMessagesTableName;
    private final String eventTableName;
    private final SessionID sessionID;
    private final DataSource dataSource;
    private final boolean logHeartbeats;
    private final boolean extendedSessionIdSupported;
    private final String defaultSessionIdPropertyValue;

    private Throwable recursiveException = null;

    private final Map<String, String> insertItemSqlCache = new HashMap<String, String>();
    private final Map<String, String> deleteItemsSqlCache = new HashMap<String, String>();

    public JdbcLog(SessionSettings settings, SessionID sessionID, DataSource ds)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        this.sessionID = sessionID;
        dataSource = ds == null
                ? JdbcUtil.getDataSource(settings, sessionID)
                : ds;

        if (settings.isSetting(SETTING_JDBC_LOG_HEARTBEATS)) {
            logHeartbeats = settings.getBool(SETTING_JDBC_LOG_HEARTBEATS);
        } else {
            logHeartbeats = true;
        }
        setLogHeartbeats(logHeartbeats);

        if (settings.isSetting(SETTING_LOG_OUTGOING_TABLE)) {
            outgoingMessagesTableName = settings.getString(sessionID, SETTING_LOG_OUTGOING_TABLE);
        } else {
            outgoingMessagesTableName = DEFAULT_MESSAGES_LOG_TABLE;
        }

        if (settings.isSetting(SETTING_LOG_INCOMING_TABLE)) {
            incomingMessagesTableName = settings.getString(sessionID, SETTING_LOG_INCOMING_TABLE);
        } else {
            incomingMessagesTableName = DEFAULT_MESSAGES_LOG_TABLE;
        }

        if (settings.isSetting(SETTING_LOG_EVENT_TABLE)) {
            eventTableName = settings.getString(sessionID, SETTING_LOG_EVENT_TABLE);
        } else {
            eventTableName = DEFAULT_EVENT_LOG_TABLE;
        }

        if (settings.isSetting(sessionID, SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE)) {
            defaultSessionIdPropertyValue = settings.getString(sessionID,
                    SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE);
        } else {
            defaultSessionIdPropertyValue = SessionID.NOT_SET;
        }

        // One table is sampled for the extended session ID columns. Be sure
        // that all tables are extended if you extend any of them.
        extendedSessionIdSupported = determineSessionIdSupport(dataSource,
                outgoingMessagesTableName);

        createCachedSql();
    }

    private void createCachedSql() {
        createInsertItemSql(outgoingMessagesTableName);
        createInsertItemSql(incomingMessagesTableName);
        createInsertItemSql(eventTableName);

        createDeleteItemsSql(outgoingMessagesTableName);
        createDeleteItemsSql(incomingMessagesTableName);
        createDeleteItemsSql(eventTableName);
    }

    private void createInsertItemSql(String tableName) {
        insertItemSqlCache.put(tableName, "INSERT INTO " + tableName + " (time, "
                + getIDColumns(extendedSessionIdSupported) + ", text) " + "VALUES (?,"
                + getIDPlaceholders(extendedSessionIdSupported) + ",?)");
    }

    private String getInsertItemSql(String tableName) {
        return insertItemSqlCache.get(tableName);
    }

    private void createDeleteItemsSql(String tableName) {
        deleteItemsSqlCache.put(tableName, "DELETE FROM " + tableName + " WHERE "
                + getIDWhereClause(extendedSessionIdSupported));
    }

    private String getDeleteItemsSql(String tableName) {
        return deleteItemsSqlCache.get(tableName);
    }

    public void onEvent(String value) {
        insert(eventTableName, value);
    }

    protected void logIncoming(String message) {
        insert(incomingMessagesTableName, message);
    }

    protected void logOutgoing(String message) {
        insert(outgoingMessagesTableName, message);
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
            insert = connection.prepareStatement(getInsertItemSql(tableName));
            insert.setTimestamp(1, new Timestamp(SystemTime.getUtcCalendar().getTimeInMillis()));
            int offset = setSessionIdParameters(insert, 2);
            insert.setString(offset, value);
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
        clearTable(eventTableName);
        clearTable(incomingMessagesTableName);
        if (!incomingMessagesTableName.equals(outgoingMessagesTableName)) {
            clearTable(outgoingMessagesTableName);
        }
    }

    private void clearTable(String tableName) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(getDeleteItemsSql(tableName));
            setSessionIdParameters(statement, 1);
            statement.execute();
        } catch (SQLException e) {
            LogUtil.logThrowable(sessionID, e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, statement);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public String getIncomingMessagesTableName() {
        return incomingMessagesTableName;
    }

    public String getOutgoingMessagesTableName() {
        return outgoingMessagesTableName;
    }

    public String getEventTableName() {
        return eventTableName;
    }
    
    private int setSessionIdParameters(PreparedStatement query, int offset) throws SQLException {
        return JdbcUtil.setSessionIdParameters(sessionID, query, offset,
                extendedSessionIdSupported, defaultSessionIdPropertyValue);
    }

    public void onErrorEvent(String text) {
        onEvent(text);
    }
}