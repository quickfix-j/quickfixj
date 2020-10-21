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

import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SingleThreadedEventHandlingStrategy;
import quickfix.test.acceptance.ATServer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import static junit.framework.TestCase.assertNotNull;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import quickfix.field.MsgType;
import quickfix.test.util.ReflectionUtil;

public class SocketInitiatorTest {
    private final Logger log = LoggerFactory.getLogger(getClass());
    // store static Session count before the test to check cleanup
    private static final int SESSION_COUNT = Session.numSessions();

    @Before
    public void setUp() throws Exception {
        SystemTime.setTimeSource(null);
    }

    @After
    public void cleanup() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SocketInitiatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testLogonAfterServerDisconnect() throws Exception {
        final WriteCounter initiatorWriteCounter = new WriteCounter("initiator");
        int freePort = AvailablePortFinder.getNextAvailable();
        ServerThread serverThread = new ServerThread(freePort);
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();
            SessionID serverSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ISLD", "TW");
            Session serverSession = Session.lookupSession(serverSessionID);

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            initiator.setIoFilterChainBuilder(chain -> chain.addLast("TestFilter", initiatorWriteCounter));

            try {
                log.info("Do first login");
                clientApplication.setUpLogonExpectation();
                initiator.start();
                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);

                log.info("Disconnect from server-side and assert that client session "
                        + "reconnects and logs on properly");
                clientApplication.setUpLogonExpectation();
                serverSession.disconnect("Server side disconnection for testing", false);
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(100L);
                    if (serverSession.hasResponder()) {
                        break;
                    }
                }
                assertLoggedOn(clientApplication, clientSession);
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
        assertTrue("Initiator write count = 0, filter problem?",
                initiatorWriteCounter.getCount() > 0);
        assertTrue("Acceptor write count = 0, filter problem?", serverThread.getWriteCount() > 0);
        assertTrue("Initiator sessionCreated not called",
                initiatorWriteCounter.wasSessionCreatedCalled());
        assertTrue("Acceptor sessionCreated not called", serverThread.wasSessionCreatedCalled());
    }

    @Test
    public void testInitiatorStop() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
        ClientApplication clientApplication = new ClientApplication();
        Initiator initiator = new SocketInitiator(clientApplication, new MemoryStoreFactory(),
                settings, new DefaultMessageFactory());

        doTestOfStop(clientSessionID, clientApplication, initiator, freePort);
    }

    @Test
    public void testInitiatorStopStart() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
        ClientApplication clientApplication = new ClientApplication();
        Initiator initiator = new SocketInitiator(clientApplication, new MemoryStoreFactory(),
                settings, new DefaultMessageFactory());

        doTestOfRestart(clientSessionID, clientApplication, initiator, null, freePort);
    }

    @Test
    public void testInitiatorStopThreaded() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
        ClientApplication clientApplication = new ClientApplication();
        Initiator initiator = new ThreadedSocketInitiator(clientApplication,
                new MemoryStoreFactory(), settings, new DefaultMessageFactory());

        doTestOfStop(clientSessionID, clientApplication, initiator, freePort);
    }

    @Test
    public void testInitiatorStopStartFileLog() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        File messageLog = new File(getTempDirectory() + File.separatorChar
                + "FIX.4.2-TW-ISLD.messages.log");
        File eventLog = new File(getTempDirectory() + File.separatorChar
                + "FIX.4.2-TW-ISLD.event.log");
        messageLog.delete();
        eventLog.delete();

        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
        ClientApplication clientApplication = new ClientApplication();
        settings.setString("FileLogPath", getTempDirectory());
        settings.setString("ResetOnLogon", "Y");
        FileLogFactory logFactory = new FileLogFactory(settings);
        Initiator initiator = new SocketInitiator(clientApplication, new MemoryStoreFactory(),
                settings, logFactory, new DefaultMessageFactory());
        doTestOfRestart(clientSessionID, clientApplication, initiator, messageLog, freePort);

        messageLog.delete();
        eventLog.delete();
    }

    @Test
    public void testInitiatorStopStartThreaded() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
        ClientApplication clientApplication = new ClientApplication();
        Initiator initiator = new ThreadedSocketInitiator(clientApplication,
                new MemoryStoreFactory(), settings, new DefaultMessageFactory());

        doTestOfRestart(clientSessionID, clientApplication, initiator, null, freePort);
    }

    // QFJ-825
    @Test
    public void testDoubleStartOfInitiator() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        Initiator initiator = null;
        try {
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID, freePort);
            ClientApplication clientApplication = new ClientApplication();
            initiator = new SocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            initiator.start();
            initiator.start();
            ThreadInfo[] dumpAllThreads = bean.dumpAllThreads(false, false);
            int qfjMPThreads = 0;
            for (ThreadInfo threadInfo : dumpAllThreads) {
                if (SingleThreadedEventHandlingStrategy.MESSAGE_PROCESSOR_THREAD_NAME.equals(threadInfo
                        .getThreadName())) {
                    qfjMPThreads++;
                }
            }
            assertEquals("Exactly one 'QFJ Message Processor' thread expected", 1, qfjMPThreads);
        } finally {
            if (initiator != null) {
                initiator.stop(true);
            }
        }
    }

    private interface LogSessionStateListener extends Log, SessionStateListener {}

    // QFJ-907
    @Test
    public void testConnectedSocketsAreClosedAfterInitiatorClosed() throws Exception {
        final ServerSocket serverSocket = new ServerSocket(0);
        final int port = serverSocket.getLocalPort();

        final AtomicBoolean socketConnected = new AtomicBoolean(false);
        Thread socketThread = new Thread(() -> {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                socketConnected.set(true);
                final InputStream is = socket.getInputStream();
                while (is.read() != -1) {
                }
            } catch (Exception e) {
            } finally {
                try {
                    serverSocket.close();
                } catch (Exception e) {
                }
                try {
                    socket.close();
                } catch (Exception e) {
                }
                socketConnected.set(false);
            }
        });

        socketThread.setDaemon(true);
        socketThread.start();

        final SessionSettings settings = new SessionSettings();
        settings.setString("StartTime", "00:00:00");
        settings.setString("EndTime", "00:00:00");
        settings.setString("ReconnectInterval", "30");
        settings.setString("HeartBtInt", "30");

        final SessionID sessionId = new SessionID("FIX.4.4", "SENDER", "TARGET");
        settings.setString(sessionId, "BeginString", "FIX.4.4");

        settings.setString("ConnectionType", "initiator");
        settings.setLong(sessionId, "SocketConnectPort", port);
        settings.setString(sessionId, "SocketConnectHost", "localhost");

        final AtomicInteger onConnectCallCount = new AtomicInteger(0);
        final AtomicInteger onDisconnectCallCount = new AtomicInteger(0);

        LogSessionStateListener logSessionStateListener = new LogSessionStateListener() {
            @Override
            public void clear() {
            }

            @Override
            public void onIncoming(String message) {
            }

            @Override
            public void onOutgoing(String message) {
            }

            @Override
            public void onEvent(String text) {
            }

            @Override
            public void onErrorEvent(String text) {
            }

            @Override
            public void onConnect() {
                onConnectCallCount.incrementAndGet();
            }

            @Override
            public void onDisconnect() {
                onDisconnectCallCount.incrementAndGet();
            }

            @Override
            public void onLogon() {
            }

            @Override
            public void onLogout() {
            }

            @Override
            public void onReset() {
            }

            @Override
            public void onRefresh() {
            }

            @Override
            public void onMissedHeartBeat() {
            }

            @Override
            public void onHeartBeatTimeout() {
            }

            @Override
            public void onResendRequestSent(int beginSeqNo, int endSeqNo, int currentEndSeqNo) {
            }

            @Override
            public void onSequenceResetReceived(int newSeqNo, boolean gapFillFlag) {
            }

            @Override
            public void onResendRequestSatisfied(int beginSeqNo, int endSeqNo) {
            }
        };

        LogFactory logFactory = sessionID -> logSessionStateListener;

        final SocketInitiator initiator = new SocketInitiator(new ApplicationAdapter(), new MemoryStoreFactory(), settings,
                logFactory, new DefaultMessageFactory());
        initiator.start();

        Thread.sleep(5000L);
        assertTrue(socketConnected.get()); // make sure socket is connected
        assertEquals(1, onConnectCallCount.intValue());
        assertEquals(0, onDisconnectCallCount.intValue());

        initiator.stop();

        Thread.sleep(5000L);
        assertFalse(socketConnected.get()); // make sure socket is NOT connected after initiator is stopped
        assertEquals(1, onConnectCallCount.intValue());
        assertEquals(1, onDisconnectCallCount.intValue());
    }

    private void doTestOfRestart(SessionID clientSessionID, ClientApplication clientApplication,
            final Initiator initiator, File messageLog, int port) throws InterruptedException, ConfigError {
        ServerThread serverThread = new ServerThread(port);
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();
            long messageLogLength = 0;
            try {
                clientApplication.setUpLogonExpectation();
                initiator.start();
                assertTrue(initiator.getSessions().contains(clientSessionID));
                assertEquals(1, initiator.getSessions().size());

                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);

                clientApplication.setUpLogoutExpectation();
                initiator.stop();
                assertLoggedOut(clientApplication, clientSession);
                assertFalse(initiator.getSessions().contains(clientSessionID));
                assertTrue(initiator.getSessions().isEmpty());
                if (messageLog != null) {
                    messageLogLength = messageLog.length();
                    assertTrue(messageLog.length() > 0);
                }
                assertEquals("Client application should receive logout", 1, clientApplication.logoutCounter);

                clientApplication.setUpLogonExpectation();

                initiator.start();
                clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);
                assertTrue(initiator.getSessions().contains(clientSessionID));
                assertEquals(1, initiator.getSessions().size());

                if (messageLog != null) {
                    // QFJ-698: check that we were still able to write to the messageLog after the restart
                    assertTrue(messageLog.length() > messageLogLength);
                }
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
        assertEquals("Client application should receive logout", 2, clientApplication.logoutCounter);
        assertTrue("After stop() the Session count should not be higher than before the test", Session.numSessions() <= SESSION_COUNT );
        assertEquals("After stop() the Session count should be zero in Connector", 0, initiator.getSessions().size() );
    }

    private void doTestOfStop(SessionID clientSessionID, ClientApplication clientApplication,
            Initiator initiator, int freePort) throws InterruptedException, ConfigError {
        ServerThread serverThread = new ServerThread(freePort);
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();
            try {
                clientApplication.setUpLogonExpectation();

                initiator.start();
                assertTrue(initiator.getSessions().contains(clientSessionID));
                assertEquals(1, initiator.getSessions().size());

                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);

                clientApplication.setUpLogoutExpectation();

                initiator.stop();
                assertLoggedOut(clientApplication, clientSession);
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
    }

    private SessionSettings getClientSessionSettings(SessionID clientSessionID, int port) {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", Integer.toString(port));
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("ResetOnLogon", "Y");
        defaults.put("FileStorePath", "target/data/client");
        defaults.put("ValidateUserDefinedFields", "Y");
        settings.set(defaults);
        settings.setString(clientSessionID, "BeginString", FixVersions.BEGINSTRING_FIX42);
        settings.setString(clientSessionID, "DataDictionary", "FIX42.xml");
        return settings;
    }

    private void assertLoggedOn(ClientApplication clientApplication, Session clientSession)
            throws InterruptedException {
        assertNotNull("no client session", clientSession);
        
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            executor.execute(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    // ignore
                }
                if ( clientApplication.logonLatch.getCount() > 0 ) {
                    System.err.println("XXX Dumping threads since latch count is not zero...");
                    ReflectionUtil.dumpStackTraces();
                }
            });
        } finally {
            executor.shutdown();
        }

        final boolean await = clientApplication.logonLatch.await(20, TimeUnit.SECONDS); 
        assertTrue("Expected logon did not occur", await); 
        assertTrue("client session not logged in", clientSession.isLoggedOn());
    }

    private void assertLoggedOut(ClientApplication clientApplication, Session clientSession)
            throws InterruptedException {
        assertNotNull("no client session", clientSession);
        final boolean await = clientApplication.logoutLatch.await(20, TimeUnit.SECONDS);
        if (!await) {
            ReflectionUtil.dumpStackTraces();
        }
        assertTrue("Expected logout did not occur", await);
        assertFalse("client session logged in?", clientSession.isLoggedOn());
    }

    private class ClientApplication extends ApplicationAdapter {
        public CountDownLatch logonLatch;
        public CountDownLatch logoutLatch;
        private Initiator initiator;
        private boolean stopAfterLogon;
        public volatile int logoutCounter = 0;

        public void stopAfterLogon(Initiator initiator) {
            this.initiator = initiator;
            this.stopAfterLogon = true;
        }

        public void setUpLogonExpectation() {
            logonLatch = new CountDownLatch(1);
        }
 
        public void setUpLogoutExpectation() {
            logoutLatch = new CountDownLatch(1);
        }

        @Override
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

        @Override
        public void toAdmin(Message message, SessionID sessionId) {
            log.info("[{}] {}", sessionId, message);

            // Only countdown the latch if a logout message is actually sent
            try {
                if (logoutLatch != null && message.getHeader().isSetField(MsgType.FIELD)
                        && MsgType.LOGOUT.equals(message.getHeader().getString(MsgType.FIELD))) {
                    log.info("Releasing logout latch for session [{}] with message {}", sessionId, message);
                    logoutLatch.countDown();
                }
            } catch (FieldNotFound fieldNotFound) {
                log.error("FieldNotFound for session [{}] in message {}", sessionId, message);
            }
        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            try {
                if (MsgType.LOGOUT.equals(MessageUtils.getMessageType(message.toString()))) {
                    logoutCounter++;
                }
            } catch (InvalidMessage ex) {
                // ignore
            }
        }
    }

    private class WriteCounter extends IoFilterAdapter {
        private final String name;
        private int count;
        private boolean sessionCreated;

        public WriteCounter(String name) {
            this.name = name;
        }

        public void sessionCreated(NextFilter nextFilter, IoSession session) throws Exception {
            sessionCreated = true;
            super.sessionCreated(nextFilter, session);
        }

        public void filterWrite(NextFilter nextFilter, IoSession session, WriteRequest writeRequest)
                throws Exception {
            super.filterWrite(nextFilter, session, writeRequest);
            count++;
        }

        public int getCount() {
            return count;
        }

        public boolean wasSessionCreatedCalled() {
            return sessionCreated;
        }

        public String toString() {
            return getClass().getName() + "[" + name + "]@" + System.identityHashCode(this);
        }
    }

    private class ServerThread extends Thread {
        private final ATServer server;
        private final WriteCounter writeCounter = new WriteCounter("acceptor");
        private final int port;

        public ServerThread(final int port) {
            super("test server");
            this.port = port;
            server = new ATServer(port, ProtocolFactory.VM_PIPE);
            server.setIoFilterChainBuilder(chain -> chain.addLast("TestFilter", writeCounter));
        }

        public void run() {
            server.setUsingMemoryStore(true);
            server.acceptFixVersion(FixVersions.BEGINSTRING_FIX42);
            server.run();
        }

        public void waitForInitialization() throws InterruptedException {
            server.waitForInitialization();
        }

        public int getWriteCount() {
            return writeCounter.getCount();
        }

        public boolean wasSessionCreatedCalled() {
            return writeCounter.wasSessionCreatedCalled();
        }
    }

    private String getTempDirectory() throws IOException {
        File path = File.createTempFile("test", "");
        File tempdir = path.getParentFile();
        return tempdir.getAbsolutePath();
    }

}
