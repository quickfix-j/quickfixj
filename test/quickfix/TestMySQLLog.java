package quickfix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;

public class TestMySQLLog extends TestCase {
    public TestMySQLLog(String name) {
        super(name);
    }

    public void testLog() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis(), "X");

        SessionSettings settings = new SessionSettings("tests.cfg");
        MySQLLogFactory factory = new MySQLLogFactory(settings);
        Log log = factory.create(sessionID);
        assertEquals(MySQLLog.class, log.getClass());

        String inmsg = "IN"+System.currentTimeMillis();
        String outmsg = "OUT"+System.currentTimeMillis();
        String eventmsg = "EVENT"+System.currentTimeMillis();
        
        log.onIncoming(inmsg);
        log.onOutgoing(outmsg);
        log.onEvent(eventmsg);

        Connection connection = null;
        try {
            connection = JdbcUtil.openMySQLConnection(settings, sessionID);
            assertLoggedMessage(connection, sessionID, "incoming", systemTime, inmsg);
            assertLoggedMessage(connection, sessionID, "outgoing", systemTime, outmsg);
            assertLoggedMessage(connection, sessionID, "event", systemTime, eventmsg);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    private void assertLoggedMessage(Connection connection, SessionID sessionID, String tablePrefix,
            long systemTime, String msg) throws SQLException {
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
            assertTrue("log item not found: "+msg, rs.next());
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
}