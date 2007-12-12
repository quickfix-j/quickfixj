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

import java.io.IOException;
import java.sql.Connection;
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
    private String sessionTableName = "sessions";
    private String messageTableName = "messages";
    private MemoryStore cache = new MemoryStore();
    private DataSource dataSource;
    private SessionID sessionID;

    private String SQL_UPDATE_SEQNUMS;
    private String SQL_INSERT_SESSION;
    private String SQL_GET_SEQNUMS;
    private String INSERT_UPDATE_MESSAGE;
    private String SQL_INSERT_MESSAGE;
    private String SQL_GET_MESSAGES;
    private String SQL_UPDATE_SESSION;
    private String SQL_DELETE_MESSAGES;
    private String ID_CLAUSE;
    
    public JdbcStore(SessionSettings settings, SessionID sessionID, DataSource dataSource) throws Exception {
        this.sessionID = sessionID;
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME)) {
            sessionTableName = settings.getString(sessionID,
                    JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME);
        }
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME)) {
            messageTableName = settings.getString(sessionID,
                    JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME);
        }
        setSqlStrings();

        this.dataSource = dataSource == null
                ? JdbcUtil.getDataSource(settings, sessionID)
                : dataSource;

        loadCache();
    }

    private void setSqlStrings() {
        ID_CLAUSE = "beginstring=? and sendercompid=? and sendersubid=? and senderlocid=? and "
                + "targetcompid=? and targetsubid=? and targetlocid=? and session_qualifier=? ";

        SQL_UPDATE_SEQNUMS = "UPDATE " + sessionTableName + " SET incoming_seqnum=?, "
                + "outgoing_seqnum=? WHERE " + ID_CLAUSE;

        SQL_INSERT_SESSION = "INSERT INTO " + sessionTableName + " (beginstring, sendercompid, "
                + "sendersubid, senderlocid, targetcompid, targetsubid, targetlocid,"
                + "session_qualifier, creation_time, "
                + "incoming_seqnum, outgoing_seqnum) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        SQL_GET_SEQNUMS = "SELECT creation_time, incoming_seqnum, outgoing_seqnum FROM "
                + sessionTableName + " WHERE " + ID_CLAUSE;

        INSERT_UPDATE_MESSAGE = "UPDATE " + messageTableName + " SET message=? " + "WHERE "
                + ID_CLAUSE + " and msgseqnum=?";

        SQL_INSERT_MESSAGE = "INSERT INTO " + messageTableName + " (beginstring, "
                + "sendercompid, sendersubid, senderlocid, targetcompid, targetsubid, targetlocid,"
                + "session_qualifier, msgseqnum,message) VALUES (?,?,?,?,?,?,?,?,?,?)";

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
            query.setString(2, sessionID.getSenderCompID());
            query.setString(3, sessionID.getSenderSubID());
            query.setString(4, sessionID.getSenderLocationID());
            query.setString(5, sessionID.getTargetCompID());
            query.setString(6, sessionID.getTargetSubID());
            query.setString(7, sessionID.getTargetLocationID());
            query.setString(8, sessionID.getSessionQualifier());
            rs = query.executeQuery();
            if (rs.next()) {
                cache.setCreationTime(SystemTime.getUtcCalendar(rs.getTimestamp(1)));
                cache.setNextTargetMsgSeqNum(rs.getInt(2));
                cache.setNextSenderMsgSeqNum(rs.getInt(3));
            } else {
                insert = connection.prepareStatement(SQL_INSERT_SESSION);
                insert.setString(1, sessionID.getBeginString());
                insert.setString(2, sessionID.getSenderCompID());
                insert.setString(3, sessionID.getSenderSubID());
                insert.setString(4, sessionID.getSenderLocationID());
                insert.setString(5, sessionID.getTargetCompID());
                insert.setString(6, sessionID.getTargetSubID());
                insert.setString(7, sessionID.getTargetLocationID());
                insert.setString(8, sessionID.getSessionQualifier());
                insert.setTimestamp(9, new Timestamp(cache.getCreationTime().getTime()));
                insert.setInt(10, cache.getNextTargetMsgSeqNum());
                insert.setInt(11, cache.getNextSenderMsgSeqNum());
                insert.execute();
            }
        } finally {
            JdbcUtil.close(sessionID, rs);
            JdbcUtil.close(sessionID, query);
            JdbcUtil.close(sessionID, insert);
            JdbcUtil.close(sessionID, connection);
        }
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
            deleteMessages.setString(2, sessionID.getSenderCompID());
            deleteMessages.setString(3, sessionID.getSenderSubID());
            deleteMessages.setString(4, sessionID.getSenderLocationID());
            deleteMessages.setString(5, sessionID.getTargetCompID());
            deleteMessages.setString(6, sessionID.getTargetSubID());
            deleteMessages.setString(7, sessionID.getTargetLocationID());
            deleteMessages.setString(8, sessionID.getSessionQualifier());
            deleteMessages.execute();

            updateTime = connection.prepareStatement(SQL_UPDATE_SESSION);
            updateTime.setTimestamp(1, new Timestamp(Calendar.getInstance(
                    TimeZone.getTimeZone("UTC")).getTimeInMillis()));
            updateTime.setInt(2, getNextTargetMsgSeqNum());
            updateTime.setInt(3, getNextSenderMsgSeqNum());
            updateTime.setString(4, sessionID.getBeginString());
            updateTime.setString(5, sessionID.getSenderCompID());
            updateTime.setString(6, sessionID.getSenderSubID());
            updateTime.setString(7, sessionID.getSenderLocationID());
            updateTime.setString(8, sessionID.getTargetCompID());
            updateTime.setString(9, sessionID.getTargetSubID());
            updateTime.setString(10, sessionID.getTargetLocationID());
            updateTime.setString(11, sessionID.getSessionQualifier());
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
            query.setString(2, sessionID.getSenderCompID());
            query.setString(3, sessionID.getSenderSubID());
            query.setString(4, sessionID.getSenderLocationID());
            query.setString(5, sessionID.getTargetCompID());
            query.setString(6, sessionID.getTargetSubID());
            query.setString(7, sessionID.getTargetLocationID());
            query.setString(8, sessionID.getSessionQualifier());
            query.setInt(9, startSequence);
            query.setInt(10, endSequence);
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
            insert.setString(2, sessionID.getSenderCompID());
            insert.setString(3, sessionID.getSenderSubID());
            insert.setString(4, sessionID.getSenderLocationID());
            insert.setString(5, sessionID.getTargetCompID());
            insert.setString(6, sessionID.getTargetSubID());
            insert.setString(7, sessionID.getTargetLocationID());
            insert.setString(8, sessionID.getSessionQualifier());
            insert.setInt(9, sequence);
            insert.setString(10, message);
            insert.execute();
        } catch (SQLException ex) {
            if (connection != null) {
                PreparedStatement update = null;
                try {
                    update = connection.prepareStatement(INSERT_UPDATE_MESSAGE);
                    update.setString(1, sessionID.getBeginString());
                    update.setString(2, sessionID.getSenderCompID());
                    update.setString(3, sessionID.getSenderSubID());
                    update.setString(4, sessionID.getSenderLocationID());
                    update.setString(5, sessionID.getTargetCompID());
                    update.setString(6, sessionID.getTargetSubID());
                    update.setString(7, sessionID.getTargetLocationID());
                    update.setString(8, sessionID.getSessionQualifier());
                    update.setInt(9, sequence);
                    update.setString(10, message);
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
            update.setString(4, sessionID.getSenderCompID());
            update.setString(5, sessionID.getSenderSubID());
            update.setString(6, sessionID.getSenderLocationID());
            update.setString(7, sessionID.getTargetCompID());
            update.setString(8, sessionID.getTargetSubID());
            update.setString(9, sessionID.getTargetLocationID());
            update.setString(10, sessionID.getSessionQualifier());
            update.execute();
        } catch (SQLException e) {
            throw (IOException) new IOException(e.getMessage()).initCause(e);
        } finally {
            JdbcUtil.close(sessionID, update);
            JdbcUtil.close(sessionID, connection);
        }
    }

    public void setSessionTableName(String sessionTableName) {
        this.sessionTableName = sessionTableName;
        setSqlStrings();
    }

    public void setMessageTableName(String messageTableName) {
        this.messageTableName = messageTableName;
        setSqlStrings();
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