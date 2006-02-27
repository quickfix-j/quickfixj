package quickfix;

import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.test.acceptance.ATServer;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class SocketInitiatorTest extends TestCase {
    private Logger log = LoggerFactory.getLogger(getClass());

    protected void setUp() throws Exception {
        SystemTime.setTimeSource(null);
    }

    public void testLogonAfterServerDisconnect() throws Exception {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.start();
            serverThread.waitForInitialization();
            SessionID serverSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ISLD", "TW");
            Session serverSession = Session.lookupSession(serverSessionID);

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());

            try {
                log.info("Do first login");
                clientApplication.setUpLogonExpectation();
                initiator.start();
                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);

                log.info("Disconnect from server-side and assert that client session "
                        + "reconnects and logs on properly");
                clientApplication.setUpLogonExpectation();
                serverSession.disconnect();
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(100L);
                    if (serverSession.getResponder() == null) {
                        break;
                    }
                }
                assertLoggedOn(clientApplication, clientSession);
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
        }
    }

    public void testPoll() throws Exception {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            clientApplication.setUpLogonExpectation();

            final SocketInitiator initiator = new SocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());

            // BUG #105 - SocketInitiator poll had class cast exception
            // The class cast was from timer events occuring every one second.
            // We sleep for one second and then check the poll.
            try {
                initiator.poll();
                Session clientSession = Session.lookupSession(clientSessionID);
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(300);
                    if (clientSession.isLoggedOn()) {
                        break;
                    }
                    initiator.poll();
                }

                assertLoggedOn(clientApplication, clientSession);

                // BUG #106 - sessions were not being recorded.
                List sessions = initiator.getManagedSessions();
                assertTrue("wrong logon status", initiator.isLoggedOn());
                assertEquals("wrong # of session", 1, sessions.size());
            } finally {
                initiator.stop();
            }

            boolean pollResult = true;
            for (int i = 0; i < 5; i++) {
                Thread.sleep(300);
                pollResult = initiator.poll();
                if (!pollResult) {
                    break;
                }
            }
            log.info("Poll returned " + pollResult);

            assertFalse("wrong logon status", initiator.isLoggedOn());
        } finally {
            serverThread.interrupt();
        }
    }

    public void testBlockLogoffAfterLogon() throws Exception {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            final SocketInitiator initiator = new SocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            try {
                clientApplication.stopAfterLogon(initiator);
                clientApplication.setUpLogonExpectation();

                initiator.block();
                assertFalse("wrong logon status", initiator.isLoggedOn());
                assertEquals("wrong # of session", 1, initiator.getManagedSessions().size());
            } finally {
                initiator.stop();
            }

        } finally {
            serverThread.interrupt();
        }
    }

    private SessionSettings getClientSessionSettings(SessionID clientSessionID) {
        SessionSettings settings = new SessionSettings();
        HashMap defaults = new HashMap();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", "9877");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("FileStorePath", "output/data/client");
        defaults.put("ValidateUserDefinedFields", "Y");
        settings.set(defaults);
        settings.setString(clientSessionID, "BeginString", FixVersions.BEGINSTRING_FIX42);
        settings.setString(clientSessionID, "DataDictionary", "etc/"
                + FixVersions.BEGINSTRING_FIX42.replaceAll("\\.", "") + ".xml");
        return settings;
    }

    private void assertLoggedOn(ClientApplication clientApplication, Session clientSession)
            throws InterruptedException {
        assertNotNull("no client session", clientSession);
        clientApplication.logonLatch.await(20, TimeUnit.SECONDS);
        assertTrue("client session not logged in", clientSession.isLoggedOn());
    }

    private class ClientApplication extends ApplicationAdapter {
        public CountDownLatch logonLatch;
        private Initiator initiator;
        private boolean stopAfterLogon;

        public ClientApplication() {

        }

        public void stopAfterLogon(Initiator initiator) {
            this.initiator = initiator;
            this.stopAfterLogon = true;
        }

        public void setUpLogonExpectation() {
            logonLatch = new CountDownLatch(1);
        }

        public void onLogon(SessionID sessionId) {
            if (logonLatch != null) {
                log.info("Releasing logon latch");
                logonLatch.countDown();
            }
            if (stopAfterLogon) {
                log.info("Stopping after logon");
                initiator.stop();
            }
        }

    }

    private class ServerThread extends Thread {
        private ATServer server;

        public ServerThread() {
            super("test server");
            server = new ATServer();
        }

        public void run() {
            server.setUsingMemoryStore(true);
            server.acceptFixVersion(FixVersions.BEGINSTRING_FIX42);
            server.run();
        }

        public void waitForInitialization() throws InterruptedException {
            server.waitForInitialization();
        }
    }

}
