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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.TestCase;

public class JdbcLogTest extends TestCase {
    protected void tearDown() throws Exception {
        JdbcTestSupport.assertNoActiveConnections();
        super.tearDown();
    }

    public void testLog() throws Exception {
        Connection connection = JdbcTestSupport.getConnection();
        SessionSettings settings = new SessionSettings();
        JdbcTestSupport.setHypersonicSettings(settings);
        initializeTableDefinitions(connection);
        JdbcLogFactory logFactory = new JdbcLogFactory(settings);
        long now = System.currentTimeMillis();
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER-" + now, "TARGET-" + now);
        settings.setString(sessionID, "ConnectionType", "acceptor");
        JdbcLog log = (JdbcLog) logFactory.create(sessionID);

        assertEquals(0, getRowCount(connection, "messages_log"));
        log.onIncoming("INCOMING");
        assertEquals(1, getRowCount(connection, "messages_log"));
        assertLogData(connection, 0, sessionID, "INCOMING", "messages_log");

        log.onOutgoing("OUTGOING");
        assertEquals(2, getRowCount(connection, "messages_log"));
        assertLogData(connection, 0, sessionID, "INCOMING", "messages_log");
        assertLogData(connection, 1, sessionID, "OUTGOING", "messages_log");

        assertEquals(0, getRowCount(connection, "event_log"));
        log.onEvent("EVENT");
        assertEquals(1, getRowCount(connection, "event_log"));
        assertLogData(connection, 0, sessionID, "EVENT", "event_log");
        
        log.clear();
        assertEquals(0, getRowCount(connection, "messages_log"));
        assertEquals(0, getRowCount(connection, "event_log"));
    }

    private void assertLogData(Connection connection, int rowOffset, SessionID sessionID,
            String text, String tableName) throws SQLException {
        Statement s = connection.createStatement();
        ResultSet rs = s
                .executeQuery("select time,beginstring,sendercompid,targetcompid,session_qualifier,text from "
                        + tableName);
        int n = 0;
        while (rs.next() && n < rowOffset)
            n++;
        assertNotNull(sessionID.getBeginString(), rs.getDate("time"));
        assertEquals(sessionID.getBeginString(), rs.getString("beginstring"));
        assertEquals(sessionID.getSenderCompID(), rs.getString("sendercompid"));
        assertEquals(sessionID.getTargetCompID(), rs.getString("targetcompid"));
        assertEquals(sessionID.getSessionQualifier(), rs.getString("session_qualifier"));
        assertEquals(text, rs.getString("text"));
        rs.close();
        s.close();
    }

    private int getRowCount(Connection connection, String tableName) throws SQLException {
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery("select count(*) from " + tableName);
        if (rs.next()) {
            return rs.getInt(1);
        }
        rs.close();
        s.close();
        return 0;
    }

    private void initializeTableDefinitions(Connection connection) throws ConfigError {
        try {
            JdbcTestSupport.loadSQL(connection, "core/src/main/config/sql/mysql/messages_log_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(null));
            JdbcTestSupport.loadSQL(connection, "core/src/main/config/sql/mysql/event_log_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(null));
        } catch (Exception e) {
            throw new ConfigError(e);
        }
    }

}
