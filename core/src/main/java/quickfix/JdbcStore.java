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

import static quickfix.JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME;
import static quickfix.JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

import javax.sql.DataSource;

class JdbcStore implements MessageStore {
    private final static String DEFAULT_SESSION_TABLE_NAME = "sessions";
    private final static String DEFAULT_MESSAGE_TABLE_NAME = "messages";
    
    private final MemoryStore cache = new MemoryStore();
    private final boolean extendedSessionIdSupported;
    private final DataSource dataSource;
    private final SessionID sessionID;
    private final String sessionTableName;
    private final String messageTableName;

    private String SQL_UPDATE_SEQNUMS;
    private String SQL_INSERT_SESSION;
    private String SQL_GET_SEQNUMS;
    private String INSERT_UPDATE_MESSAGE;
    private String SQL_INSERT_MESSAGE;
    private String SQL_GET_MESSAGES;
    private String SQL_UPDATE_SESSION;
    private String SQL_DELETE_MESSAGES;
    
    public JdbcStore(SessionSettings settings, SessionID sessionID, DataSource ds) throws Exception {
        this.sessionID = sessionID;
        if (settings.isSetting(sessionID, SETTING_JDBC_STORE_SESSIONS_TABLE_NAME)) {
            sessionTableName = settings.getString(sessionID,
                    SETTING_JDBC_STORE_SESSIONS_TABLE_NAME);
        } else {
            sessionTableName = DEFAULT_SESSION_TABLE_NAME;
        }
        
        if (settings.isSetting(sessionID, SETTING_JDBC_STORE_MESSAGES_TABLE_NAME)) {
            messageTableName = settings.getString(sessionID,
                    SETTING_JDBC_STORE_MESSAGES_TABLE_NAME);
        } else {
            messageTableName = DEFAULT_MESSAGE_TABLE_NAME;
        }

        dataSource = ds == null ? JdbcUtil.getDataSource(settings, sessionID) : ds;
        extendedSessionIdSupported = determineSessionIdSupport();
        
        setSqlStrings();

        loadCache();
    }

    private boolean determineSessionIdSupport() throws SQLException {
        Connection connection = dataSource.getConnection();
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            String tableName = sessionTableName;
            String columnName = "sendersubid";
            return isColumn(metaData, tableName.toUpperCase(), 
                    columnName.toUpperCase()) || 
                    isColumn(metaData, tableName, columnName);
        } finally {
            connection.close();
        }
    }

    private boolean isColumn(DatabaseMetaData metaData, String tableName, String columnName)
            throws SQLException {
        ResultSet columns = metaData.getColumns(null, null, tableName, columnName);
        try {
            return columns.next();
        } finally {
            columns.close();
        }
    }

    private void setSqlStrings() {
        String ID_CLAUSE;
        String ID_COLUMNS;
        String ID_PLACEHOLDERS;
        
        if (extendedSessionIdSupported) {
            ID_CLAUSE = "beginstring=? and sendercompid=? and sendersubid=? and senderlocid=? and "
                    + "targetcompid=? and targetsubid=? and targetlocid=? and session_qualifier=? ";

            ID_COLUMNS = "sendercompid,sendersubid,senderlocid,targetcompid,targetsubid,targetlocid,session_qualifier";

            ID_PLACEHOLDERS = "?,?,?,?,?,?,?";
        } else {
            ID_CLAUSE = "beginstring=? and sendercompid=? and targetcompid=? and session_qualifier=? ";

            ID_COLUMNS = "sendercompid,targetcompid,session_qualifier";

            ID_PLACEHOLDERS = "?,?,?";

        }
        
        SQL_UPDATE_SEQNUMS = "UPDATE " + sessionTableName + " SET incoming_seqnum=?, "
                + "outgoing_seqnum=? WHERE " + ID_CLAUSE;

        SQL_INSERT_SESSION = "INSERT INTO " + sessionTableName + " (beginstring, " + ID_COLUMNS
                + ", creation_time, " + "incoming_seqnum, outgoing_seqnum) VALUES (?,"
                + ID_PLACEHOLDERS + ",?,?,?)";

        SQL_GET_SEQNUMS = "SELECT creation_time, incoming_seqnum, outgoing_seqnum FROM "
                + sessionTableName + " WHERE " + ID_CLAUSE;

        INSERT_UPDATE_MESSAGE = "UPDATE " + messageTableName + " SET message=? " + "WHERE "
                + ID_CLAUSE + " and msgseqnum=?";

        SQL_INSERT_MESSAGE = "INSERT INTO " + messageTableName + " (beginstring, " + ID_COLUMNS
                + ", msgseqnum,message) VALUES (?," + ID_PLACEHOLDERS + ",?,?)";

        SQL_GET_MESSAGES = "SELECT message FROM " + messageTableName + " WHERE  " + ID_CLAUSE
                + " and msgseqnum>=? and msgseqnum<=? " + "ORDER BY msgseqnum";

        SQL_UPDATE_SESSION = "UPDATE " + sessionTableName + " SET creation_time=?, "
                + "incoming_seqnum=?, outgoing_seqnum=? " + "WHERE " + ID_CLAUSE;

        SQL_DELETE_MESSAGES = "DELETE FROM " + messageTableName + " WHERE " + ID_CLAUSE;
    }

    private void loadCache() throws SQLException, IOException {
        Connection connection = null;
        PreparedStatement query = null;
        PreparedStatement insert = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            query = connection.prepareStatement(SQL_GET_SEQNUMS);
            query.setString(1, sessionID.getBeginString());
            setSessionIdParameters(query, 2);
            rs = query.executeQuery();
            if (rs.next()) {
                cache.setCreationTime(SystemTime.getUtcCalendar(rs.getTimestamp(1)));
                cache.setNextTargetMsgSeqNum(rs.getInt(2));
                cache.setNextSenderMsgSeqNum(rs.getInt(3));
            } else {
                insert = connection.prepareStatement(SQL_INSERT_SESSION);
                insert.setString(1, sessionID.getBeginString());
                int offset = setSessionIdParameters(insert, 2);
                insert.setTimestamp(offset++, new Timestamp(cache.getCreationTime().getTime()));
                insert.setInt(offset++, cache.getNextTargetMsgSeqNum());
                insert.setInt(offset, cache.getNextSenderMsgSeqNum());
                insert.execute();
            }
        } finally {
            JdbcUtil.close(sessionID, rs);
            JdbcUtil.close(sessionID, query);
            JdbcUtil.close(sessionID, insert);
            JdbcUtil.close(sessionID, connection);
        }
    }

    private int setSessionIdParameters(PreparedStatement query, int offset) throws SQLException {
        if (extendedSessionIdSupported) {
            query.setString(offset++, sessionID.getSenderCompID());
            query.setString(offset++, sessionID.getSenderSubID());
            query.setString(offset++, sessionID.getSenderLocationID());
            query.setString(offset++, sessionID.getTargetCompID());
            query.setString(offset++, sessionID.getTargetSubID());
            query.setString(offset++, sessionID.getTargetLocationID());
            query.setString(offset++, sessionID.getSessionQualifier());
        } else {
            query.setString(offset++, sessionID.getSenderCompID());
            query.setString(offset++, sessionID.getTargetCompID());
            query.setString(offset++, sessionID.getSessionQualifier());
        }
        return offset;
    }

    public Date getCreationTime() throws IOException {
        return cache.getCreationTime();
    }

    public int getNextSenderMsgSeqNum() throws IOException {
        return cache.getNextSenderMsgSeqNum();
    }

    public int getNextTargetMsgSeqNum() throws IOException {
        return cache.getNextTargetMsgSeqNum();
    }

    public void incrNextSenderMsgSeqNum() throws IOException {
        cache.incrNextSenderMsgSeqNum();
        setNextSenderMsgSeqNum(cache.getNextSenderMsgSeqNum());
    }

    public void incrNextTargetMsgSeqNum() throws IOException {
        cache.incrNextTargetMsgSeqNum();
        setNextTargetMsgSeqNum(cache.getNextTargetMsgSeqNum());
    }

    public void reset() throws IOException {
        cache.reset();
        Connection connection = null;
        PreparedStatement deleteMessages = null;
        PreparedStatement updateTime = null;
        try {
            connection = dataSource.getConnection();
            deleteMessages = connection.prepareStatement(SQL_DELETE_MESSAGES);
            deleteMessages.setString(1, sessionID.getBeginString());
            setSessionIdParameters(deleteMessages, 2);
            deleteMessages.execute();

            updateTime = connection.prepareStatement(SQL_UPDATE_SESSION);
            updateTime.setTimestamp(1, new Timestamp(Calendar.getInstance(
                    TimeZone.getTimeZone("UTC")).getTimeInMillis()));
            updateTime.setInt(2, getNextTargetMsgSeqNum());
            updateTime.setInt(3, getNextSenderMsgSeqNum());
            updateTime.setString(4, sessionID.getBeginString());
            setSessionIdParameters(updateTime, 5);
            updateTime.execute();
        } catch (SQLException e) {
            throw (IOException) new IOException(e.getMessage()).initCause(e);
        } catch (IOException e) {
            throw e;
        } finally {
            JdbcUtil.close(sessionID, deleteMessages);
            JdbcUtil.close(sessionID, updateTime);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public void get(int startSequence, int endSequence, Collection<String> messages) throws IOException {
        Connection connection = null;
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            query = connection.prepareStatement(SQL_GET_MESSAGES);
            query.setString(1, sessionID.getBeginString());
            int offset = setSessionIdParameters(query, 2);
            query.setInt(offset++, startSequence);
            query.setInt(offset, endSequence);
            rs = query.executeQuery();
            while (rs.next()) {
                String message = rs.getString(1);
                messages.add(message);
            }
        } catch (SQLException e) {
            throw (IOException) new IOException(e.getMessage()).initCause(e);
        } finally {
            JdbcUtil.close(sessionID, rs);
            JdbcUtil.close(sessionID, query);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public boolean set(int sequence, String message) throws IOException {
        Connection connection = null;
        PreparedStatement insert = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            insert = connection.prepareStatement(SQL_INSERT_MESSAGE);
            insert.setString(1, sessionID.getBeginString());
            int offset = setSessionIdParameters(insert, 2);
            insert.setInt(offset++, sequence);
            insert.setString(offset, message);
            insert.execute();
        } catch (SQLException ex) {
            if (connection != null) {
                PreparedStatement update = null;
                try {
                    update = connection.prepareStatement(INSERT_UPDATE_MESSAGE);
                    update.setString(1, sessionID.getBeginString());
                    int offset = setSessionIdParameters(update, 2);
                    update.setInt(offset++, sequence);
                    update.setString(offset, message);
                    update.execute();
                    return false;
                } catch (SQLException e) {
                    throw (IOException) new IOException(e.getMessage()).initCause(e);
                } finally {
                    JdbcUtil.close(sessionID, update);
                }
            }
        } finally {
            JdbcUtil.close(sessionID, rs);
            JdbcUtil.close(sessionID, insert);
            JdbcUtil.close(sessionID, connection);
        }
        return true;
    }

    public void setNextSenderMsgSeqNum(int next) throws IOException {
        cache.setNextSenderMsgSeqNum(next);
        storeSequenceNumbers();
    }

    public void setNextTargetMsgSeqNum(int next) throws IOException {
        cache.setNextTargetMsgSeqNum(next);
        storeSequenceNumbers();
    }

    private void storeSequenceNumbers() throws IOException {
        Connection connection = null;
        PreparedStatement update = null;
        try {
            connection = dataSource.getConnection();
            update = connection.prepareStatement(SQL_UPDATE_SEQNUMS);
            update.setInt(1, cache.getNextTargetMsgSeqNum());
            update.setInt(2, cache.getNextSenderMsgSeqNum());
            update.setString(3, sessionID.getBeginString());
            setSessionIdParameters(update, 4);
            update.execute();
        } catch (SQLException e) {
            throw (IOException) new IOException(e.getMessage()).initCause(e);
        } finally {
            JdbcUtil.close(sessionID, update);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public void refresh() throws IOException {
        try {
            loadCache();
        } catch (SQLException e) {
            throw (IOException) new IOException(e.getMessage()).initCause(e);
        }
    }
    
    DataSource getDataSource() {
        return dataSource;
    }
}