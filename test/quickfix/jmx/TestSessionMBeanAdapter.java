package quickfix.jmx;

import junit.framework.TestCase;
import quickfix.DefaultSessionFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.MockResponder;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.UnitTestApplication;

public class TestSessionMBeanAdapter extends TestCase {
    public void testAdapter() throws Exception {
        SessionSettings settings = new SessionSettings();
        SessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new ScreenLogFactory(settings));
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER", "TARGET");
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setString(sessionID, Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(sessionID, Session.SETTING_START_TIME, "00:00:00");
        settings.setString(sessionID, Session.SETTING_END_TIME, "00:00:00");
        settings.setString(sessionID, Session.SETTING_HEARTBTINT, "10");
        settings.setString(sessionID, Session.SETTING_DESCRIPTION, "DESCRIPTION");
        Session session = sessionFactory.create(sessionID, settings);

        SessionMBeanAdapter mbean = new SessionMBeanAdapter(session, settings);

        assertEquals("FIX.4.2:SENDER->TARGET", mbean.getID());
        assertEquals("FIX.4.2", mbean.getBeginString());
        assertEquals("SENDER", mbean.getSenderCompID());
        assertEquals("TARGET", mbean.getTargetCompID());
        assertEquals(SessionFactory.INITIATOR_CONNECTION_TYPE, mbean.getRole());
        assertEquals(false, mbean.isLoggedOn());
        assertEquals("DESCRIPTION", mbean.getDescription());
        assertEquals(0, mbean.getIncomingMessageCount());
        assertEquals(0, mbean.getOutgoingMessageCount());
        // No connection, returns empty string
        assertEquals("", mbean.getRemoteIPAddress());

        session.getStore().setNextSenderMsgSeqNum(10);
        session.getStore().setNextTargetMsgSeqNum(11);
        assertEquals(10, mbean.getNextSenderMsgSeqNum());
        assertEquals(11, mbean.getNextTargetMsgSeqNum());

        mbean.reset();
        assertEquals(1, mbean.getNextSenderMsgSeqNum());
        assertEquals(1, mbean.getNextTargetMsgSeqNum());

        mbean.setNextSenderMsgSeqNum(111);
        mbean.setNextTargetMsgSeqNum(222);
        assertEquals(111, session.getExpectedSenderNum());
        assertEquals(222, session.getExpectedTargetNum());

        session.getStore().set(1, "MSG1");
        session.getStore().set(2, "MSG2");
        String[] messages = mbean.getMessages(1, 10);
        assertEquals("MSG1", messages[0]);
        assertEquals("MSG2", messages[1]);

        MockResponder mockResponder = new MockResponder();
        session.setResponder(mockResponder);

        mbean.disconnect();
        assertEquals("disconnect not called", true, mockResponder.disconnectCalled);

        mbean.logon();
        assertEquals(true, mbean.isReconnectEnabled());

        mbean.logoff();
        assertEquals(false, mbean.isReconnectEnabled());

        // weak test
        assertEquals(java.net.InetAddress.getLocalHost().getHostName(), mbean.getHost());

        // Must pass in Java process PID from command line (using launch script,
        // for example).
        System.setProperty("java.pid", "1234");
        assertEquals("wrong pid", "1234", mbean.getProcessID());

        session.setResponder(mockResponder);
        assertEquals("1.2.3.4", mbean.getRemoteIPAddress());
    }
}
