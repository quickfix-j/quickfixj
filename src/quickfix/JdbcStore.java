/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

class JdbcStore implements MessageStore {
    private String sessionTableName = "sessions";
    private String messageTableName = "messages";
    private MemoryStore cache = new MemoryStore();
    private Connection connection;
    private SessionID sessionID;
    private HashMap statementCache = new HashMap();

    private final String SQL_UPDATE_SEQNUMS = "UPDATE " + sessionTableName
            + " SET incoming_seqnum=?, "
            + "outgoing_seqnum=? WHERE beginstring=? and sendercompid=? "
            + "and targetcompid=? and session_qualifier=?";
    private final String SQL_INSERT_SESSION = "INSERT INTO " + sessionTableName
            + " (beginstring, sendercompid, " + "targetcompid, session_qualifier, creation_time, "
            + "incoming_seqnum, outgoing_seqnum) VALUES(?,?,?,?,?,?,?)";
    private final String SQL_GET_SEQNUMS = "SELECT creation_time, incoming_seqnum, "
            + "outgoing_seqnum FROM " + sessionTableName + " WHERE beginstring=? and  "
            + "sendercompid=? and targetcompid=? and session_qualifier=?";
    private final String INSERT_UPDATE_MESSAGE = "UPDATE " + messageTableName + " SET message=? "
            + "WHERE beginstring=? and sendercompid=? "
            + "and targetcompid=? and session_qualifier=? and msgseqnum=?";
    private final String SQL_INSERT_MESSAGE = "INSERT INTO " + messageTableName + " (beginstring, "
            + "sendercompid, targetcompid, session_qualifier, msgseqnum, "
            + "message) VALUES (?,?,?,?,?,?)";
    private final String SQL_GET_MESSAGES = "SELECT message FROM " + messageTableName + " WHERE  "
            + "beginstring=? and sendercompid=? and targetcompid=? and "
            + "session_qualifier=? and msgseqnum>=? and msgseqnum<=? " + "ORDER BY msgseqnum";
    private final String SQL_UPDATE_SESSION = "UPDATE " + sessionTableName
            + " SET creation_time=?, " + "incoming_seqnum=?, outgoing_seqnum=? "
            + "WHERE beginstring=? and sendercompid=? and "
            + "targetcompid=? and session_qualifier=?";
    private final String SQL_DELETE_MESSAGES = "DELETE FROM " + messageTableName + " WHERE "
            + "beginstring=? and sendercompid=? " + "and targetcompid=? and session_qualifier=?";

    public JdbcStore(SessionSettings settings, SessionID sessionID) throws Exception {
        this.sessionID = sessionID;
        connection = connect(settings, sessionID);
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME)) {
            sessionTableName = settings.getString(sessionID,
                    JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME);
        }
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME)) {
            sessionTableName = settings.getString(sessionID,
                    JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME);
        }
        loadCache();
    }

    protected Connection connect(SessionSettings settings, SessionID sessionID)
            throws ClassNotFoundException, ConfigError, FieldConvertError, SQLException {
        return JdbcUtil.openConnection(settings, sessionID);
    }

    private void loadCache() throws SQLException, IOException {
        PreparedStatement query = getPreparedStatement(SQL_GET_SEQNUMS);
        query.setString(1, sessionID.getBeginString());
        query.setString(2, sessionID.getSenderCompID());
        query.setString(3, sessionID.getTargetCompID());
        query.setString(4, sessionID.getSessionQualifier());
        ResultSet rs = null;
        try {
            rs = query.executeQuery();
            if (rs.next()) {
                cache.setCreationTime(SystemTime.getUtcCalendar(rs.getDate(1)));
                cache.setNextTargetMsgSeqNum(rs.getInt(2));
                cache.setNextSenderMsgSeqNum(rs.getInt(3));
            } else {
                PreparedStatement insert = getPreparedStatement(SQL_INSERT_SESSION);
                insert.setString(1, sessionID.getBeginString());
                insert.setString(2, sessionID.getSenderCompID());
                insert.setString(3, sessionID.getTargetCompID());
                insert.setString(4, sessionID.getSessionQualifier());
                insert.setTimestamp(5, new Timestamp(cache.getCreationTime().getTime()));
                insert.setInt(6, cache.getNextTargetMsgSeqNum());
                insert.setInt(7, cache.getNextSenderMsgSeqNum());
                insert.execute();
            }
        } finally {
            rs.close();
        }
    }

    private PreparedStatement getPreparedStatement(String sql) throws SQLException {
        PreparedStatement ps = (PreparedStatement) statementCache.get(sql);
        if (ps == null) {
            ps = connection.prepareStatement(sql);
        }
        ps.clearParameters();
        return ps;
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
        try {
            PreparedStatement deleteMessages = getPreparedStatement(SQL_DELETE_MESSAGES);
            deleteMessages.setString(1, sessionID.getBeginString());
            deleteMessages.setString(2, sessionID.getSenderCompID());
            deleteMessages.setString(3, sessionID.getTargetCompID());
            deleteMessages.setString(4, sessionID.getSessionQualifier());
            deleteMessages.execute();

            PreparedStatement updateTime = getPreparedStatement(SQL_UPDATE_SESSION);
            updateTime.setTimestamp(1, new Timestamp(Calendar.getInstance(
                    TimeZone.getTimeZone("UTC")).getTimeInMillis()));
            updateTime.setInt(2, getNextTargetMsgSeqNum());
            updateTime.setInt(3, getNextSenderMsgSeqNum());
            updateTime.setString(4, sessionID.getBeginString());
            updateTime.setString(5, sessionID.getSenderCompID());
            updateTime.setString(6, sessionID.getTargetCompID());
            updateTime.setString(7, sessionID.getSessionQualifier());
            updateTime.execute();
        } catch (SQLException e) {
            throw new IOException(e.getMessage());
        } catch (IOException e) {
            throw e;
        }
    }

    public void get(int startSequence, int endSequence, Collection messages) throws IOException {
        ResultSet rs = null;
        try {
            PreparedStatement query = getPreparedStatement(SQL_GET_MESSAGES);
            query.setString(1, sessionID.getBeginString());
            query.setString(2, sessionID.getSenderCompID());
            query.setString(3, sessionID.getTargetCompID());
            query.setString(4, sessionID.getSessionQualifier());
            query.setInt(5, startSequence);
            query.setInt(6, endSequence);
            rs = query.executeQuery();
            while (rs.next()) {
                Blob messageBlob = rs.getBlob(1);
                messages.add(new String(messageBlob.getBytes(1, (int) messageBlob.length())));
            }
        } catch (SQLException e) {
            throw new IOException(e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e1) {
                    throw new IOException(e1.getMessage());
                }
            }
        }
    }

    public boolean set(int sequence, String message) throws IOException {
        try {
            PreparedStatement insert = getPreparedStatement(SQL_INSERT_MESSAGE);
            insert.setString(1, sessionID.getBeginString());
            insert.setString(2, sessionID.getSenderCompID());
            insert.setString(3, sessionID.getTargetCompID());
            insert.setString(4, sessionID.getSessionQualifier());
            insert.setInt(5, sequence);
            insert.setString(6, message);
            insert.execute();
        } catch (SQLException ex) {
            try {
                PreparedStatement update = getPreparedStatement(INSERT_UPDATE_MESSAGE);
                update.setString(1, sessionID.getBeginString());
                update.setString(2, sessionID.getSenderCompID());
                update.setString(3, sessionID.getTargetCompID());
                update.setString(4, sessionID.getSessionQualifier());
                update.setInt(5, sequence);
                update.setString(6, message);
                update.execute();
                // TODO QUESTION determine why the update is here
                return false;
            } catch (SQLException e) {
                throw new IOException(e.getMessage());
            }
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
        try {
            PreparedStatement update = getPreparedStatement(SQL_UPDATE_SEQNUMS);
            update.setInt(1, cache.getNextTargetMsgSeqNum());
            update.setInt(2, cache.getNextSenderMsgSeqNum());
            update.setString(3, sessionID.getBeginString());
            update.setString(4, sessionID.getSenderCompID());
            update.setString(5, sessionID.getTargetCompID());
            update.setString(6, sessionID.getSessionQualifier());
            update.execute();
        } catch (SQLException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void setSessionTableName(String sessionTableName) {
        this.sessionTableName = sessionTableName;
    }
    
    public void setMessageTableName(String messageTableName) {
        this.messageTableName = messageTableName;
    }
}