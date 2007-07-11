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

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.apache.mina.common.IoFilterAdapter;
import org.apache.mina.common.IoFilterChain;
import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoSession;
import org.apache.mina.common.TransportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SystemTime;
import quickfix.ThreadedSocketInitiator;
import quickfix.test.acceptance.ATServer;
import quickfix.util.ExpectedTestFailure;

public class SecureSocketTest extends TestCase {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final TransportType transportProtocol = TransportType.SOCKET;

    protected void setUp() throws Exception {
        SystemTime.setTimeSource(null);
    }

    public void testLogonWithBadCertificate() throws Exception {
        if (Double.parseDouble(System.getProperty("java.specification.version")) < 1.5) {
            log.warn("Test was not run because java.specification.versionn < 1.5");
            return;
        }
        ServerThread serverThread = new ServerThread("nonexistent", "pwd");
        try {
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID);
            ClientApplication clientApplication = new ClientApplication();
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(clientApplication,
                    new MemoryStoreFactory(), settings, new DefaultMessageFactory());
            final CountDownLatch exceptionCaught = new CountDownLatch(1);
            initiator.setIoFilterChainBuilder(new IoFilterChainBuilder() {
            
                public void buildFilterChain(IoFilterChain chain) throws Exception {
                    chain.addLast("ExceptionCatcher", new IoFilterAdapter() {

                        public void exceptionCaught(NextFilter nextFilter, IoSession session, Throwable cause) throws Exception {
                            log.info("MINA exception: "+cause.getMessage());
                            exceptionCaught.countDown();
                        }
                        
                    });
                }
            });
            
            try {
                log.info("Do login");
                initiator.start();
                assertTrue("no exception thrown", exceptionCaught.await(5, TimeUnit.SECONDS));
            } finally {
                initiator.stop();
            }
        } finally {
            serverThread.interrupt();
            serverThread.join();
        }
    }

    public void testLogonWithDefaultCertificate() throws Exception {
        doLogonTest(null, null);
    }

    public void testLogonWithCustomCertificate() throws Exception {
        doLogonTest("test.cert", "testpassword");
    }

    /** This is more of an anti-test. To verify that the client-side initiator adds the
     * specified keystore/pwd to the SSL context, reset the pwd to be invalid.
     * During startup, the socket iniator should fail b/c ssl context is misconfigured
     * Thus, we verify that we use SSL keystore/pwd in client connection, since
     * we don't have any easy way to get to any of the vars inside the client-side initiator
     * Note that we have to use a unique cert here (not same as test.cert) so that it's not cached
     * by another test so that there are no false failures.
     */
    public void testLogonWithBadCertificateOnInitiatorSide() throws Exception {
        if (Double.parseDouble(System.getProperty("java.specification.version")) < 1.5) {
            log.warn("Test was not run because java.specification.version < 1.5");
            return;
        }
        SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
        SessionSettings settings = getClientSessionSettings(clientSessionID);
        // reset client side to invalid certs
        settings.setString(SSLSupport.SETTING_KEY_STORE_NAME, "test-client.cert");
        settings.setString(SSLSupport.SETTING_KEY_STORE_PWD, "bogus-pwd");
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
        if (Double.parseDouble(System.getProperty("java.specification.version")) < 1.5) {
            log.warn("Test was not run because java.specification.versionn < 1.5");
            return;
        }
        ServerThread serverThread = new ServerThread(keyStoreName, keyStorePassword);
        try {
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
        HashMap<Object, Object> defaults = new HashMap<Object, Object>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectProtocol", transportProtocol.toString());
        defaults.put("SocketUseSSL", "Y");
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", "9877");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("FileStorePath", "core/target/data/client");
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

        public ServerThread(String keyStoreName, String keyStorePassword) {
            super("test server");
            server = new ATServer();
            server.setUseSSL(true);
            server.setKeyStoreName(keyStoreName);
            server.setKeyStorePassword(keyStorePassword);
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
