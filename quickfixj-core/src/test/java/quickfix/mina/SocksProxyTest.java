package quickfix.mina;

import org.apache.mina.util.AvailablePortFinder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.Acceptor;
import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;
import quickfix.ThreadedSocketInitiator;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Performs end to end tests against SOCKS proxy server.
 */
public class SocksProxyTest {

    // maximum time to wait for session logon
    private static final long TIMEOUT_SECONDS = 5;

    private SocksProxyServer proxyServer;

    @Before
    public void setUp() {
        int proxyPort = AvailablePortFinder.getNextAvailable();

        proxyServer = new SocksProxyServer(proxyPort);
        proxyServer.start();
    }

    @After
    public void tearDown() {
        proxyServer.stop();
    }

    @Test
    public void shouldLoginViaSocks4Proxy() throws ConfigError {
        shouldLoginSocksProxy("4");
    }

    @Test
    public void shouldLoginViaSocks4aProxy() throws ConfigError {
        shouldLoginSocksProxy("4a");
    }

    @Test
    public void shouldLoginViaSocks5Proxy() throws ConfigError {
        shouldLoginSocksProxy("5");
    }

    private void shouldLoginSocksProxy(String proxyVersion) throws ConfigError {
        int port = AvailablePortFinder.getNextAvailable();
        SessionConnector acceptor = createAcceptor(port);

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyVersion, proxyServer.getPort(), port);

            try {
                initiator.start();
                assertLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                assertLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    private void assertLoggedOn(SessionConnector connector, SessionID sessionID) {
        long startTimeNanos = System.nanoTime();

        while (TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTimeNanos) < TIMEOUT_SECONDS) {
            if (isLoggedOn(connector, sessionID)) {
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted", e);
            }
        }

        throw new AssertionError("Session " + sessionID + " is not logged on");
    }

    private boolean isLoggedOn(SessionConnector connector, SessionID sessionID) {
        Session session = connector.getSessionMap().get(sessionID);

        if (session == null) {
            return false;
        }

        return session.isLoggedOn();
    }

    private SessionConnector createAcceptor(int port) throws ConfigError {
        MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
        MessageFactory messageFactory = new DefaultMessageFactory();
        SessionSettings acceptorSettings = createAcceptorSettings("ALICE", "BOB", port);
        return new ThreadedSocketAcceptor(new ApplicationAdapter(), messageStoreFactory, acceptorSettings, messageFactory);
    }

    private SessionConnector createInitiator(String proxyVersion, int proxyPort, int port) throws ConfigError {
        MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
        MessageFactory messageFactory = new DefaultMessageFactory();
        SessionSettings initiatorSettings = createInitiatorSettings("BOB", "ALICE", proxyVersion, proxyPort, port);
        return new ThreadedSocketInitiator(new ApplicationAdapter(), messageStoreFactory, initiatorSettings, messageFactory);
    }

    private SessionSettings createAcceptorSettings(String senderId, String targetId, int port) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "acceptor");
        defaults.put(Acceptor.SETTING_SOCKET_ACCEPT_PORT, Integer.toString(port));
        defaults.put(Session.SETTING_START_TIME, "00:00:00");
        defaults.put(Session.SETTING_END_TIME, "00:00:00");
        defaults.put(Session.SETTING_HEARTBTINT, "30");

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, senderId, targetId);

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);
        sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
        sessionSettings.setString(sessionID, "SenderCompID", senderId);
        sessionSettings.setString(sessionID, "TargetCompID", targetId);

        return sessionSettings;
    }

    private SessionSettings createInitiatorSettings(String senderId, String targetId, String proxyVersion, int proxyPort, int port) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "initiator");
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PROTOCOL, ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_HOST, "localhost");
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PORT, Integer.toString(port));
        defaults.put(Initiator.SETTING_RECONNECT_INTERVAL, "2");
        defaults.put(Initiator.SETTING_PROXY_HOST, "localhost");
        defaults.put(Initiator.SETTING_PROXY_PORT, Integer.toString(proxyPort));
        defaults.put(Initiator.SETTING_PROXY_TYPE, "socks");
        defaults.put(Initiator.SETTING_PROXY_VERSION, proxyVersion);
        defaults.put(Initiator.SETTING_PROXY_USER, "proxy-user");
        defaults.put(Initiator.SETTING_PROXY_PASSWORD, "proxy-password");
        defaults.put(Session.SETTING_START_TIME, "00:00:00");
        defaults.put(Session.SETTING_END_TIME, "00:00:00");
        defaults.put(Session.SETTING_HEARTBTINT, "30");

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, senderId, targetId);

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);
        sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
        sessionSettings.setString(sessionID, "SenderCompID", senderId);
        sessionSettings.setString(sessionID, "TargetCompID", targetId);

        return sessionSettings;
    }

}
