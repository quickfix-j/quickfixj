package quickfix;

import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;
import quickfix.test.acceptance.ATServer;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class SocketInitiatorTest extends TestCase {
    public void testLogonAfterServerDisconnect() throws Exception {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.start();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            SocketInitiator initiator = new SocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());

            // Do initial logon
            clientApplication.setUpLogonExpectation();
            initiator.start();
            Session clientSession = Session.lookupSession(clientSessionID);
            assertLoggedOn(clientApplication, clientSession);

            // Disconnect from server-side and assert that client session reconnects and
            // logs on properly.
            SessionID serverSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ISLD", "TW");
            Session serverSession = Session.lookupSession(serverSessionID);
            clientApplication.setUpLogonExpectation();
            serverSession.disconnect();
            assertLoggedOn(clientApplication, clientSession);
        } finally {
            serverThread.interrupt();
        }
    }

    public void testPoll() throws Exception {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.start();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            SocketInitiator initiator = new SocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());

            // Do initial logon
            clientApplication.setUpLogonExpectation();
            //initiator.start();

            // BUG #105 - SocketInitiator poll had class cast exception
            // The class cast was from timer events occuring every one second.
            // We sleep for one second and then check the poll.
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(300);
                    initiator.poll();
                }
                
                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);
                
                // BUG #106 - sessions were not being recorded.
                List sessions = initiator.getSessions();
                assertTrue("wrong logon status", initiator.isLoggedOn());
                assertEquals("wrong # of session", 1, sessions.size());
            } finally {
                initiator.stop();
            }

            assertFalse("wrong logon status", initiator.isLoggedOn());

        } finally {
            serverThread.interrupt();
            Thread.sleep(1000L);
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
        defaults.put("SenderCompID", "ISLD");
        defaults.put("TargetCompID", "TW");
        defaults.put("HeartBtInt", "30");
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

        public void setUpLogonExpectation() {
            logonLatch = new CountDownLatch(1);
        }

        public void onLogon(SessionID sessionId) {
            if (logonLatch != null) {
                logonLatch.countDown();
            }
        }
    }

    private class ServerThread extends Thread {
        public ServerThread() {
            super("test server");
        }

        public void run() {
            ATServer server = new ATServer();
            server.setUsingMemoryStore(true);
            server.acceptFixVersion(FixVersions.BEGINSTRING_FIX42);
            server.run();
        }
    }

}
