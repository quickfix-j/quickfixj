package quickfix.mina;

import java.util.Map;

import junit.framework.TestCase;
import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.UnitTestApplication;
import edu.emory.mathcs.backport.java.util.Collections;

public class SessionConnectorTest extends TestCase {
    public void testConnector() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        SessionSettings settings = setUpSessionSettings(sessionID);
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new ScreenLogFactory(true, true, true));
        
        SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
        
        Session session = connector.createSession(sessionID);
        assertNotNull(session);
        
        Map sessions = Collections.singletonMap(session.getSessionID(), session);
        connector.setSessions(sessions);
        assertEquals(1, connector.getManagedSessions().size());
        assertEquals(session, connector.getManagedSessions().get(0));
        
        assertFalse(connector.isLoggedOn());
        
        session.getState().setLogonSent(true);
        session.getState().setLogonReceived(true);
        assertTrue(connector.isLoggedOn());
        
        assertTrue(session.isEnabled());
        connector.logoutAllSessions(true);
        assertFalse(session.isEnabled());
        
        assertEquals(9999, connector.getIntSetting(Acceptor.SETTING_SOCKET_ACCEPT_PORT));
        
        assertNotNull(connector.getScheduledExecutorService());
        assertEquals(settings, connector.getSettings());
    }
    
    private SessionSettings setUpSessionSettings(SessionID sessionID) {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        settings.setString(Acceptor.SETTING_SOCKET_ACCEPT_PORT, "9999");
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.ACCEPTOR_CONNECTION_TYPE);
        return settings;
    }
    
    private static class SessionConnectorUnderTest extends SessionConnector {

        public SessionConnectorUnderTest(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }
    }
}
