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

import java.io.IOException;
import java.sql.*;
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
    private final String defaultSessionIdPropertyValue;
    private final boolean persistMessages;

    private String SQL_UPDATE_INCOMING_SEQNUM;
    private String SQL_UPDATE_OUTGOING_SEQNUM;
    private String SQL_INSERT_SESSION;
    private String SQL_GET_SEQNUMS;
    private String SQL_UPDATE_MESSAGE;
    private String SQL_INSERT_MESSAGE;
    private String SQL_GET_MESSAGES;
    private String SQL_UPDATE_SESSION;
    private String SQL_DELETE_MESSAGES;

    public JdbcStore(SessionSettings settings, SessionID sessionID, DataSource ds) throws Exception {
        this.sessionID = sessionID;

        sessionTableName = getSessionTableName(settings, sessionID);
        messageTableName = getMessageTableName(settings, sessionID);

        if (settings.isSetting(sessionID, SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE)) {
            defaultSessionIdPropertyValue = settings.getString(sessionID,
                    SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE);
        } else {
            defaultSessionIdPropertyValue = SessionID.NOT_SET;
        }

        persistMessages = !settings.isSetting(sessionID, Session.SETTING_PERSIST_MESSAGES) ||
            settings.getBool(sessionID, Session.SETTING_PERSIST_MESSAGES);

        dataSource = ds == null ? JdbcUtil.getDataSource(settings, sessionID) : ds;

        // One table is sampled for the extended session ID columns. Be sure
        // that all tables are extended if you extend any of them.
        extendedSessionIdSupported = JdbcUtil.determineSessionIdSupport(dataSource,
                sessionTableName);

        setSqlStrings();

        loadCache();
    }

    public static String getSessionTableName(SessionSettings settings, SessionID sessionID) throws ConfigError {
        if (settings.isSetting(sessionID, SETTING_JDBC_STORE_SESSIONS_TABLE_NAME)) {
            return settings.getString(sessionID, SETTING_JDBC_STORE_SESSIONS_TABLE_NAME);
        } else {
            return DEFAULT_SESSION_TABLE_NAME;
        }
    }

    public static String getMessageTableName(SessionSettings settings, SessionID sessionID) throws ConfigError {
        if (settings.isSetting(sessionID, SETTING_JDBC_STORE_MESSAGES_TABLE_NAME)) {
            return settings.getString(sessionID, SETTING_JDBC_STORE_MESSAGES_TABLE_NAME);
        } else {
            return DEFAULT_MESSAGE_TABLE_NAME;
        }
    }

    public static String getUpdateIncomingSequenceNumberSql(String sessionTableName, String idWhereClause) {
        return "UPDATE " + sessionTableName + " SET incoming_seqnum=? WHERE " + idWhereClause;
    }

    public static String getUpdateOutgoingSequenceNumberSql(String sessionTableName, String idWhereClause) {
        return "UPDATE " + sessionTableName + " SET outgoing_seqnum=? WHERE " + idWhereClause;
    }

    public static String getInsertSessionSql(String sessionTableName, String idColumns, String idPlaceholders) {
        return "INSERT INTO " + sessionTableName + " (" + idColumns + ", creation_time,incoming_seqnum, outgoing_seqnum) VALUES (" + idPlaceholders + ",?,?,?)";
    }

    public static String getSequenceNumsSql(String sessionTableName, String idWhereClause) {
        return "SELECT creation_time, incoming_seqnum, outgoing_seqnum FROM " + sessionTableName + " WHERE " + idWhereClause;
    }

    public static String getUpdateMessageSql(String messageTableName, String idWhereClause) {
        return "UPDATE " + messageTableName + " SET message=? " + "WHERE " + idWhereClause + " and msgseqnum=?";
    }

    public static String getInsertMessageSql(String messageTableName, String idColumns, String idPlaceholders) {
        return "INSERT INTO " + messageTableName + " (" + idColumns + ", msgseqnum,message) VALUES (" + idPlaceholders + ",?,?)";
    }

    public static String getMessagesSql(String messageTableName, String idWhereClause) {
        return "SELECT message FROM " + messageTableName + " WHERE " + idWhereClause + " and msgseqnum>=? and msgseqnum<=? " + "ORDER BY msgseqnum";
    }

    public static String getUpdateSessionSql(String sessionTableName, String idWhereClause) {
        return "UPDATE " + sessionTableName + " SET creation_time=?, " + "incoming_seqnum=?, outgoing_seqnum=? " + "WHERE " + idWhereClause;
    }

    public static String getDeleteMessagesSql(String messageTableName, String idWhereClause) {
        return "DELETE FROM " + messageTableName + " WHERE " + idWhereClause;
    }

    private void setSqlStrings() {
        String idWhereClause = JdbcUtil.getIDWhereClause(extendedSessionIdSupported);
        String idColumns = JdbcUtil.getIDColumns(extendedSessionIdSupported);
        String idPlaceholders = JdbcUtil.getIDPlaceholders(extendedSessionIdSupported);

        SQL_UPDATE_INCOMING_SEQNUM = getUpdateIncomingSequenceNumberSql(sessionTableName, idWhereClause);
        SQL_UPDATE_OUTGOING_SEQNUM = getUpdateOutgoingSequenceNumberSql(sessionTableName, idWhereClause);
        SQL_INSERT_SESSION = getInsertSessionSql(sessionTableName, idColumns, idPlaceholders);
        SQL_GET_SEQNUMS = getSequenceNumsSql(sessionTableName, idWhereClause);
        SQL_UPDATE_MESSAGE = getUpdateMessageSql(messageTableName, idWhereClause);
        SQL_INSERT_MESSAGE = getInsertMessageSql(messageTableName, idColumns, idPlaceholders);
        SQL_GET_MESSAGES = getMessagesSql(messageTableName, idWhereClause);
        SQL_UPDATE_SESSION = getUpdateSessionSql(sessionTableName, idWhereClause);
        SQL_DELETE_MESSAGES = getDeleteMessagesSql(messageTableName, idWhereClause);
    }

    private void loadCache() throws SQLException, IOException {
        Connection connection = null;
        PreparedStatement query = null;
        PreparedStatement insert = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            query = connection.prepareStatement(SQL_GET_SEQNUMS);
            setSessionIdParameters(query, 1);
            rs = query.executeQuery();
            if (rs.next()) {
                cache.setCreationTime(SystemTime.getUtcCalendar(rs.getTimestamp(1)));
                cache.setNextTargetMsgSeqNum(rs.getInt(2));
                cache.setNextSenderMsgSeqNum(rs.getInt(3));
            } else {
                insert = connection.prepareStatement(SQL_INSERT_SESSION);
                int offset = setSessionIdParameters(insert, 1);
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
        return JdbcUtil.setSessionIdParameters(sessionID, query, offset,
                extendedSessionIdSupported, defaultSessionIdPropertyValue);
    }

    public Date getCreationTime() throws IOException {
        return cache.getCreationTime();
    }

    public Calendar getCreationTimeCalendar() throws IOException {
        return cache.getCreationTimeCalendar();
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
            if (persistMessages) {
                deleteMessages = connection.prepareStatement(SQL_DELETE_MESSAGES);
                setSessionIdParameters(deleteMessages, 1);
                deleteMessages.execute();
            }

            updateTime = connection.prepareStatement(SQL_UPDATE_SESSION);
            updateTime.setTimestamp(1, new Timestamp(Calendar.getInstance(
                    TimeZone.getTimeZone("UTC")).getTimeInMillis()));
            updateTime.setInt(2, getNextTargetMsgSeqNum());
            updateTime.setInt(3, getNextSenderMsgSeqNum());
            setSessionIdParameters(updateTime, 4);
            updateTime.execute();
        } catch (SQLException e) {
            throw new IOException(e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, deleteMessages);
            JdbcUtil.close(sessionID, updateTime);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public void get(int startSequence, int endSequence, Collection<String> messages)
            throws IOException {
        Connection connection = null;
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            query = connection.prepareStatement(SQL_GET_MESSAGES);
            int offset = setSessionIdParameters(query, 1);
            query.setInt(offset++, startSequence);
            query.setInt(offset, endSequence);
            rs = query.executeQuery();
            while (rs.next()) {
                String message = rs.getString(1);
                messages.add(message);
            }
        } catch (SQLException e) {
            throw new IOException(e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, rs);
            JdbcUtil.close(sessionID, query);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public boolean set(int sequence, String message) throws IOException {
        Connection connection = null;
        PreparedStatement insert = null;
        try {
            connection = dataSource.getConnection();
            insert = connection.prepareStatement(SQL_INSERT_MESSAGE);
            int offset = setSessionIdParameters(insert, 1);
            insert.setInt(offset++, sequence);
            insert.setString(offset, message);
            insert.execute();
        } catch (SQLException ex) {
            if (connection != null) {
                PreparedStatement update = null;
                try {
                    update = connection.prepareStatement(SQL_UPDATE_MESSAGE);
                    update.setString(1, message);
                    int offset = setSessionIdParameters(update, 2);
                    update.setInt(offset, sequence);
                    boolean status = update.execute();
                    return !status && update.getUpdateCount() > 0;
                } catch (SQLException e) {
                    throw new IOException(e.getMessage(), e);
                } finally {
                    JdbcUtil.close(sessionID, update);
                }
            }
        } finally {
            JdbcUtil.close(sessionID, insert);
            JdbcUtil.close(sessionID, connection);
        }
        return true;
    }

    public void setNextSenderMsgSeqNum(int next) throws IOException {
        cache.setNextSenderMsgSeqNum(next);
        storeSequenceNumber(SQL_UPDATE_OUTGOING_SEQNUM, cache.getNextSenderMsgSeqNum());
    }

    public void setNextTargetMsgSeqNum(int next) throws IOException {
        cache.setNextTargetMsgSeqNum(next);
        storeSequenceNumber(SQL_UPDATE_INCOMING_SEQNUM, cache.getNextTargetMsgSeqNum());
    }

    private void storeSequenceNumber(String sequenceUpdateSql, int sequence) throws IOException {
        Connection connection = null;
        PreparedStatement update = null;
        try {
            connection = dataSource.getConnection();
            update = connection.prepareStatement(sequenceUpdateSql);
            update.setInt(1, sequence);
            setSessionIdParameters(update, 2);
            update.execute();
        } catch (SQLException e) {
            throw new IOException(e.getMessage(), e);
        } finally {
            JdbcUtil.close(sessionID, update);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public void refresh() throws IOException {
        try {
            loadCache();
        } catch (SQLException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    DataSource getDataSource() {
        return dataSource;
    }
}
