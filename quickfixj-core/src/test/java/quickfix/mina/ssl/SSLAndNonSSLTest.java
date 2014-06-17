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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.MessageStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SystemTime;
import quickfix.ThreadedSocketInitiator;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.acceptor.AbstractSocketAcceptor;
import quickfix.test.acceptance.ATApplication;

public class SSLAndNonSSLTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    protected void setUp() throws Exception {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void testSSLClient() throws Exception {
        doLogonTest("TW1", "9887", "Y");
    }

    @Test
    public void testNonSSLClient() throws Exception {
        doLogonTest("TW2", "9888", "N");
    }

    private void doLogonTest(String clientCompId, String port, String useSSL) throws InterruptedException, ConfigError {
        ServerThread serverThread = new ServerThread();
        try {
            serverThread.setDaemon(true);
            serverThread.start();
            serverThread.waitForInitialization();

            SessionID clientSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, clientCompId, "ISLD");
            SessionSettings settings = getClientSessionSettings(clientSessionID, port, useSSL);
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

    private SessionSettings getClientSessionSettings(SessionID clientSessionID, String socketConnectPort, String socketUseSSL) {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<Object, Object>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put("SocketUseSSL", socketUseSSL);
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", socketConnectPort);
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
        private Initiator initiator;
        private boolean stopAfterLogon;

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
            server.run();
        }

        public void waitForInitialization() throws InterruptedException {
            server.waitForInitialization();
        }
    }

    private class ATServer implements Runnable {
        private final Logger log = LoggerFactory.getLogger(ATServer.class);
        private final CountDownLatch initializationLatch = new CountDownLatch(1);
        private final CountDownLatch tearDownLatch = new CountDownLatch(1);
        private final SessionSettings settings = new SessionSettings();
        private AbstractSocketAcceptor acceptor;

        public ATServer() {
            // defaults
        }

        public void run() {
            try {
                HashMap<Object, Object> defaults = new HashMap<Object, Object>();
                defaults.put("ConnectionType", "acceptor");
                defaults.put("SocketAcceptProtocol", ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
                defaults.put("SocketTcpNoDelay", "Y");
                defaults.put("StartTime", "00:00:00");
                defaults.put("EndTime", "00:00:00");
                defaults.put("FileStorePath", "target/data/server");
                defaults.put("ValidateUserDefinedFields", "N");

                settings.set(defaults);

                // TW1 is a SSL client at 9887
                SessionID sessionID1 = new SessionID(FixVersions.BEGINSTRING_FIX42, "ISLD", "TW1");
                settings.setString(sessionID1, "SenderCompID", "ISLD");
                settings.setString(sessionID1, "TargetCompID", "TW1");
                settings.setString(sessionID1, "BeginString", FixVersions.BEGINSTRING_FIX42);
                settings.setString(sessionID1, "SocketAcceptPort", "9887");
                settings.setString(sessionID1, SSLSupport.SETTING_USE_SSL, "Y");

                // TW2 is a non SSL client at 9888
                SessionID sessionID2 = new SessionID(FixVersions.BEGINSTRING_FIX42, "ISLD", "TW2");
                settings.setString(sessionID2, "SenderCompID", "ISLD");
                settings.setString(sessionID2, "TargetCompID", "TW2");
                settings.setString(sessionID2, "BeginString", FixVersions.BEGINSTRING_FIX42);
                settings.setString(sessionID2, "SocketAcceptPort", "9888");
                settings.setString(sessionID2, SSLSupport.SETTING_USE_SSL, "N");

                ATApplication application = new ATApplication();
                MessageStoreFactory factory = new MemoryStoreFactory();
                quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
                acceptor = new SocketAcceptor(application, factory, settings, logFactory,
                        new DefaultMessageFactory());

                acceptor.start();

                initializationLatch.countDown();
                CountDownLatch shutdownLatch = new CountDownLatch(1);
                try {
                    shutdownLatch.await();
                } catch (InterruptedException e1) {
                    try {
                        acceptor.stop(true);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    } finally {
                        tearDownLatch.countDown();
                    }
                    log.info("server exiting");
                }
            } catch (Throwable e) {
                log.error("error in AT server", e);
            }
        }

        public void waitForInitialization() throws InterruptedException {
            initializationLatch.await();
        }
    }

}
