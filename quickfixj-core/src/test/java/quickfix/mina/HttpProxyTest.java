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
import quickfix.mina.ssl.SSLSupport;
import quickfix.test.util.SSLUtil;
import quickfix.test.util.SessionUtil;

import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Performs end-to-end tests against HTTP proxy server.
 */
public class HttpProxyTest {

    private static final String PROXY_USERNAME = "proxy-username";
    private static final String PROXY_PASSWORD = "proxy-password";

    private HttpProxyServer proxyServer;

    @Before
    public void setUp() {
        InetSocketAddress destination = new InetSocketAddress("127.0.0.1", AvailablePortFinder.getNextAvailable());
        proxyServer = new HttpProxyServer(AvailablePortFinder.getNextAvailable(), destination, PROXY_USERNAME, PROXY_PASSWORD);
    }

    @After
    public void tearDown() {
        if (proxyServer != null) {
            proxyServer.stop();
        }
    }

    @Test
    public void shouldLoginBasicAuth() throws ConfigError {
        int port = proxyServer.getDestination().getPort();
        SessionConnector acceptor = createAcceptor(port, false, null);

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyServer.getPort(), port, PROXY_USERNAME, PROXY_PASSWORD, false, null);

            try {
                initiator.start();
                SessionUtil.assertLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                SessionUtil.assertLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
                SSLUtil.assertNotAuthenticated(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"), false);
                SSLUtil.assertNotAuthenticated(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"), false);
                assertTrue(proxyServer.getRecordedExceptions().isEmpty());
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldLoginBasicAuthWithSsl() throws ConfigError {
        int port = proxyServer.getDestination().getPort();
        SessionConnector acceptor = createAcceptor(port, true, "single-session/server.keystore");

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyServer.getPort(), port, PROXY_USERNAME, PROXY_PASSWORD, true, "single-session/client.truststore");

            try {
                initiator.start();
                SessionUtil.assertLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                SessionUtil.assertLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
                SSLUtil.assertNotAuthenticated(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"), false);
                SSLUtil.assertAuthenticated(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"), new BigInteger("1448538842"));
                assertTrue(proxyServer.getRecordedExceptions().isEmpty());
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailLoginBasicAuthWhenServerIsUntrusted() throws ConfigError {
        int port = proxyServer.getDestination().getPort();
        SessionConnector acceptor = createAcceptor(port, true, "single-session/server.keystore");

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyServer.getPort(), port, PROXY_USERNAME, PROXY_PASSWORD, true, "single-session/empty.keystore");

            try {
                initiator.start();
                SessionUtil.assertNotLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                SessionUtil.assertNotLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
                SSLUtil.assertNotAuthenticated(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"), true);
                SSLUtil.assertNotAuthenticated(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"), true);
                assertTrue(proxyServer.getRecordedExceptions().isEmpty());
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailBasicAuthWhenInvalidCredentials() throws ConfigError {
        int port = proxyServer.getDestination().getPort();
        SessionConnector acceptor = createAcceptor(port, false, null);

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyServer.getPort(), port, "a", "b", false, null);

            try {
                initiator.start();
                SessionUtil.assertNotLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                SessionUtil.assertNotLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
                SSLUtil.assertNotAuthenticated(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"), false);
                SSLUtil.assertNotAuthenticated(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"), false);
                assertFalse(proxyServer.getRecordedExceptions().isEmpty());
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailBasicAuthWhenInvalidCredentialsWithSsl() throws ConfigError {
        int port = proxyServer.getDestination().getPort();
        SessionConnector acceptor = createAcceptor(port, true, "single-session/server.keystore");

        try {
            acceptor.start();

            SessionConnector initiator = createInitiator(proxyServer.getPort(), port, "a", "b", true, "single-session/client.truststore");

            try {
                initiator.start();
                SessionUtil.assertNotLoggedOn(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"));
                SessionUtil.assertNotLoggedOn(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"));
                SSLUtil.assertNotAuthenticated(acceptor, new SessionID(FixVersions.BEGINSTRING_FIX44, "ALICE", "BOB"), true);
                SSLUtil.assertNotAuthenticated(initiator, new SessionID(FixVersions.BEGINSTRING_FIX44, "BOB", "ALICE"), true);
                assertFalse(proxyServer.getRecordedExceptions().isEmpty());
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    private SessionConnector createAcceptor(int port, boolean useSsl, String keyStoreName) throws ConfigError {
        MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
        MessageFactory messageFactory = new DefaultMessageFactory();
        SessionSettings acceptorSettings = createAcceptorSettings("ALICE", "BOB", port, useSsl, keyStoreName);
        return new ThreadedSocketAcceptor(new ApplicationAdapter(), messageStoreFactory, acceptorSettings, messageFactory);
    }

    private SessionConnector createInitiator(int proxyPort, int port, String proxyUsername, String proxyPassword,
                                             boolean useSsl, String trustStoreName) throws ConfigError {
        MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
        MessageFactory messageFactory = new DefaultMessageFactory();
        SessionSettings initiatorSettings = createInitiatorSettings("BOB", "ALICE", proxyPort, port, proxyUsername, proxyPassword, useSsl, trustStoreName);
        return new ThreadedSocketInitiator(new ApplicationAdapter(), messageStoreFactory, initiatorSettings, messageFactory);
    }

    private SessionSettings createAcceptorSettings(String senderId, String targetId, int port, boolean useSsl, String keyStoreName) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "acceptor");
        defaults.put(Acceptor.SETTING_SOCKET_ACCEPT_PORT, Integer.toString(port));
        defaults.put(Session.SETTING_START_TIME, "00:00:00");
        defaults.put(Session.SETTING_END_TIME, "00:00:00");
        defaults.put(Session.SETTING_HEARTBTINT, "30");

        if (useSsl) {
            defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        } else {
            defaults.put(SSLSupport.SETTING_USE_SSL, "N");
        }

        if (keyStoreName != null) {
            defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, keyStoreName);
            defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, "password");
            defaults.put(SSLSupport.SETTING_KEY_STORE_TYPE, "JCEKS");

        }

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, senderId, targetId);

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);
        sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
        sessionSettings.setString(sessionID, "SenderCompID", senderId);
        sessionSettings.setString(sessionID, "TargetCompID", targetId);

        return sessionSettings;
    }

    private SessionSettings createInitiatorSettings(String senderId, String targetId, int proxyPort, int port,
                                                    String proxyUsername, String proxyPassword,
                                                    boolean useSsl, String trustStoreName) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "initiator");
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PROTOCOL, ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_HOST, "localhost");
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PORT, Integer.toString(port));
        defaults.put(Initiator.SETTING_RECONNECT_INTERVAL, "2");
        defaults.put(Initiator.SETTING_PROXY_HOST, "localhost");
        defaults.put(Initiator.SETTING_PROXY_PORT, Integer.toString(proxyPort));
        defaults.put(Initiator.SETTING_PROXY_TYPE, "http");
        defaults.put(Initiator.SETTING_PROXY_VERSION, "1.1");

        if (proxyUsername != null) {
            defaults.put(Initiator.SETTING_PROXY_USER, proxyUsername);
        }

        if (proxyPassword != null) {
            defaults.put(Initiator.SETTING_PROXY_PASSWORD, proxyPassword);
        }

        if (useSsl) {
            defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        } else {
            defaults.put(SSLSupport.SETTING_USE_SSL, "N");
        }

        if (trustStoreName != null) {
            defaults.put(SSLSupport.SETTING_TRUST_STORE_NAME, trustStoreName);
            defaults.put(SSLSupport.SETTING_TRUST_STORE_PWD, "password");
            defaults.put(SSLSupport.SETTING_TRUST_STORE_TYPE, "JCEKS");
        }

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
