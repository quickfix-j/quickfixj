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

import java.util.HashMap;

import junit.framework.TestCase;

import org.apache.mina.common.IoFilterAdapter;
import org.apache.mina.common.IoFilterChain;
import org.apache.mina.common.IoFilterChainBuilder;
import org.apache.mina.common.IoSession;
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
        final WriteCounter initiatorWriteCounter = new WriteCounter();
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
            initiator.setIoFilterChainBuilder(new IoFilterChainBuilder() {
                public void buildFilterChain(IoFilterChain chain) throws Exception {
                    chain.addLast("TestFilter", initiatorWriteCounter);
                 } 
             });

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
        assertTrue("Initiator write count = 0, filter problem?", initiatorWriteCounter.getCount() > 0);
        assertTrue("Acceptor write count = 0, filter problem?", serverThread.getWriteCount() > 0);
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

    private class WriteCounter extends IoFilterAdapter {
        private int count;
        
        public void filterWrite(NextFilter nextFilter, IoSession session, WriteRequest writeRequest) throws Exception {
            super.filterWrite(nextFilter, session, writeRequest);
            count++;
        }
        
        public int getCount() {
            return count;
        }
        
    }
    
    private class ServerThread extends Thread {
        private ATServer server;
        private WriteCounter writeCounter = new WriteCounter();
        
        public ServerThread() {
            super("test server");
            server = new ATServer();
            server.setIoFilterChainBuilder(new IoFilterChainBuilder() {
                public void buildFilterChain(IoFilterChain chain) throws Exception {
                    chain.addLast("TestFilter", writeCounter);
                 } 
             });
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
    }

}
