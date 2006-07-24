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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;

public class MySQLLogTest extends TestCase {
    public MySQLLogTest(String name) {
        super(name);
    }

    public void testLog() throws Exception {
        if (!MySQLTestSupport.isMySQLAvailable(getConfigurationFileName())) {
            return;
        }
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis(), "X");

        SessionSettings settings = new SessionSettings("core/src/test/java/test.cfg");
        settings.setString(sessionID, "BeginString", sessionID.getBeginString());
        settings.setString(sessionID, "SenderCompID", sessionID.getSenderCompID());
        settings.setString(sessionID, "TargetCompID", sessionID.getTargetCompID());
        MySQLLogFactory factory = new MySQLLogFactory(settings);
        Log log = factory.create(sessionID);
        assertEquals(MySQLLog.class, log.getClass());

        String inmsg = "IN" + System.currentTimeMillis();
        String outmsg = "OUT" + System.currentTimeMillis();
        String eventmsg = "EVENT" + System.currentTimeMillis();

        log.onIncoming(inmsg);
        log.onOutgoing(outmsg);
        log.onEvent(eventmsg);

        Connection connection = null;
        try {
            connection = openMySQLStoreConnection(settings, sessionID);
            assertLoggedMessage(connection, sessionID, "messages", systemTime, inmsg);
            assertLoggedMessage(connection, sessionID, "messages", systemTime, outmsg);
            assertLoggedMessage(connection, sessionID, "event", systemTime, eventmsg);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    private Connection openMySQLStoreConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        JdbcUtil.convertMySQLStoreSettings(settings, sessionID);
        Class.forName(settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER));
        return DriverManager.getConnection(settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_CONNECTION_URL), settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_USER), settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_PASSWORD));
    }

    private void assertLoggedMessage(Connection connection, SessionID sessionID,
            String tablePrefix, long systemTime, String msg) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select id,time,beginstring,sendercompid,"
                    + "targetcompid,session_qualifier,text from " + tablePrefix + "_log where "
                    + "beginstring=? and sendercompid=? and targetcompid=? and "
                    + "session_qualifier=? and text=?");
            ps.setString(1, sessionID.getBeginString());
            ps.setString(2, sessionID.getSenderCompID());
            ps.setString(3, sessionID.getTargetCompID());
            ps.setString(4, sessionID.getSessionQualifier());
            ps.setString(5, msg);
            ResultSet rs = ps.executeQuery();
            assertTrue("log item not found: " + msg, rs.next());
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    protected String getConfigurationFileName() {
        return "core/src/test/java/test.cfg";
    }
}