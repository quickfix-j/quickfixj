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

package quickfix.mina.ssl;

import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.filter.ssl.SslFilter;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SystemTime;
import quickfix.ThreadedSocketInitiator;
import quickfix.mina.ProtocolFactory;
import quickfix.test.acceptance.ATServer;
import quickfix.test.util.ExpectedTestFailure;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SecureSocketTest {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final int transportProtocol = ProtocolFactory.SOCKET;

    @Before
    public void setUp() throws Exception {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void testLogonWithBadCertificate() throws Exception {
        ServerThread serverThread = new ServerThread("nonexistent", "pwd");
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            final CountDownLatch exceptionCaught = new CountDownLatch(1);
            initiator.setIoFilterChainBuilder(chain -> chain.addFirst("ExceptionCatcher", new IoFilterAdapter() {
                public void exceptionCaught(NextFilter nextFilter, IoSession session, Throwable cause) {
                    log.info("MINA exception: {}", cause.getMessage());
                    exceptionCaught.countDown();
                    nextFilter.exceptionCaught(session, cause);
                }
            }));

            try {
                log.info("Do login");
                initiator.start();
                assertTrue("no exception thrown", exceptionCaught.await(10, TimeUnit.SECONDS));
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
    }

    @Test
    public void testLogonWithDefaultCertificate() throws Exception {
        doLogonTest(null, null);
    }

    @Test
    public void testLogonWithCustomCertificate() throws Exception {
        doLogonTest("test.keystore", "quickfixjtestpw");
    }

    @Test
    public void testLogonIsSentBeforeTlsHandshakeCompletes() throws Exception {
        CountDownLatch clientHelloReceived = new CountDownLatch(1);
        CountDownLatch releaseServerHandshake = new CountDownLatch(1);
        CountDownLatch logonWrittenBeforeTlsSecured = new CountDownLatch(1);
        AtomicBoolean firstEncryptedMessage = new AtomicBoolean(true);

        IoFilterChainBuilder pauseTlsHandshake = chain -> chain.addFirst("pause TLS handshake", new IoFilterAdapter() {
            @Override
            public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
                if (firstEncryptedMessage.compareAndSet(true, false)) {
                    clientHelloReceived.countDown();
                    if (!releaseServerHandshake.await(10, TimeUnit.SECONDS)) {
                        throw new AssertionError("Timed out waiting to resume TLS handshake");
                    }
                }
                nextFilter.messageReceived(session, message);
            }
        });
        ServerThread serverThread = new ServerThread(null, null, pauseTlsHandshake);

        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            initiator.setIoFilterChainBuilder(chain -> chain.addLast("observe Logon write", new IoFilterAdapter() {
                @Override
                public void filterWrite(NextFilter nextFilter, IoSession session, WriteRequest writeRequest)
                        throws Exception {
                    Object message = writeRequest.getMessage();
                    if (message instanceof String && ((String) message).contains("35=A\u0001")
                            && session.getAttribute(SslFilter.SSL_SECURED) == null) {
                        logonWrittenBeforeTlsSecured.countDown();
                    }
                    nextFilter.filterWrite(session, writeRequest);
                }
            }));

            try {
                clientApplication.setUpLogonExpectation();
                initiator.start();

                assertTrue("acceptor did not receive ClientHello",
                        clientHelloReceived.await(10, TimeUnit.SECONDS));
                assertTrue("initiator did not write Logon before TLS was secured",
                        logonWrittenBeforeTlsSecured.await(10, TimeUnit.SECONDS));

                releaseServerHandshake.countDown();
                assertLoggedOn(clientApplication, Session.lookupSession(clientSessionID));
            } finally {
                releaseServerHandshake.countDown();
                initiator.stop();
            }
        } finally {
            releaseServerHandshake.countDown();
            serverThread.interrupt();
            serverThread.join();
        }
    }

    /**
     * This is more of an anti-test. To verify that the client-side initiator adds the
     * specified keystore/pwd to the SSL context, reset the pwd to be invalid.
     * During startup, the socket initiator should fail because SSL context is mis-configured.
     * Thus, we verify that we use SSL keystore/pwd in client connection, since
     * we don't have any easy way to get to any of the vars inside the client-side initiator.
     * Note that we have to use a unique certificate here (not test.keystore)
     * so that it's not cached by another test so that there are no false failures.
     * The test-client.keystore key store is just a copy of test.keystore under a different name.
     */
    @Test
    public void testLogonWithBadCertificateOnInitiatorSide() throws Exception {
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID);
        // reset client side to invalid certs
        settings.setString(SSLSupport.SETTING_KEY_STORE_NAME, "test-client.keystore");
        settings.setString(SSLSupport.SETTING_KEY_STORE_PWD, "wrong-pwd");
        ClientApplication clientApplication = new ClientApplication();
        final ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                new MemoryStoreFactory(), settings, new DefaultMessageFactory());

        log.info("Start initator and try logon");
        new ExpectedTestFailure(ConfigError.class, "Can't create SSLContext") {
            protected void execute() throws Throwable {
                initiator.start();
            }
        }.run();
    }

    private void doLogonTest(String keyStoreName, String keyStorePassword) throws InterruptedException, ConfigError {
        ServerThread serverThread = new ServerThread(keyStoreName, keyStorePassword);
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());

            try {
                log.info("Do login");
                clientApplication.setUpLogonExpectation();
                initiator.start();
                Session clientSession = Session.lookupSession(clientSessionID);
                assertLoggedOn(clientApplication, clientSession);
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
    }

    private SessionSettings getClientSessionSettings(SessionID clientSessionID) {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(transportProtocol));
        defaults.put("SocketUseSSL", "Y");
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", "9877");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
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
                log.info("Releasing logon latch");
                logonLatch.countDown();
            }
        }
    }

    private class ServerThread extends Thread {

        private final ATServer server;

        public ServerThread(String keyStoreName, String keyStorePassword) {
            this(keyStoreName, keyStorePassword, null);
        }

        public ServerThread(String keyStoreName, String keyStorePassword, IoFilterChainBuilder ioFilterChainBuilder) {
            super("test server");
            server = new ATServer();
            server.setUseSSL(true);
            server.setKeyStoreName(keyStoreName);
            server.setKeyStorePassword(keyStorePassword);
            server.setIoFilterChainBuilder(ioFilterChainBuilder);
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
