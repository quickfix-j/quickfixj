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

import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.field.MsgType;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SingleThreadedEventHandlingStrategy;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static org.junit.Assert.*;

/**
 * QFJ-643: Unable to restart a stopped acceptor (SocketAcceptor)
 *
 * Check if a connection can be established against a restarted SocketAcceptor.
 *
 * MultiAcceptorTest served as a template for this test.
 */
public class SocketAcceptorTest {
    // store static Session count before the test to check cleanup
    private static final int SESSION_COUNT = Session.numSessions();

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final SessionID acceptorSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42,
            "ACCEPTOR", "INITIATOR");
    private final SessionID initiatorSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42,
            "INITIATOR", "ACCEPTOR");

    @After
    public void cleanup() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SocketAcceptorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testRestartOfAcceptor() throws Exception {
        TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
        TestInitiatorApplication testInitiatorApplication = new TestInitiatorApplication();
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        Acceptor acceptor = null;
        Initiator initiator = null;
        try {
            acceptor = createAcceptor(testAcceptorApplication);
            acceptor.start();
            initiator = createInitiator(testInitiatorApplication);

            assertNotNull("Session should be registered", lookupSession(acceptorSessionID));

            acceptor.stop();
            assertNull("Session should NOT be registered", lookupSession(acceptorSessionID));

            acceptor.start();
            assertNotNull("Session should be registered", lookupSession(acceptorSessionID));
            initiator.start();

            // we expect one thread for acceptor, one for initiator
            checkThreads(bean, 2);

            testAcceptorApplication.waitForLogon();
            testInitiatorApplication.waitForLogon();
            assertTrue("acceptor should have logged on by now", acceptor.isLoggedOn());
            assertTrue("initiator should have logged on by now", initiator.isLoggedOn());
        } finally {
            if (initiator != null) {
                try {
                    initiator.stop();
                } catch (RuntimeException e) {
                    log.error(e.getMessage(), e);
                }
            }
            if (acceptor != null) {
                try {
                    acceptor.stop();
                } catch (RuntimeException e) {
                    log.error(e.getMessage(), e);
                }
            }
            testAcceptorApplication.waitForLogout();
            testInitiatorApplication.waitForLogout();
        }
    }

    // QFJ-825
    @Test
    public void testQuickRestartOfAcceptor() throws Exception {
        Acceptor acceptor = null;
        try {
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
            acceptor = createAcceptor(testAcceptorApplication);
            acceptor.start();
            Thread.sleep(2500L);
            acceptor.stop();
            acceptor.start();
            checkThreads(bean, 1);
        } finally {
            if (acceptor != null) {
                acceptor.stop(true);
            }
            Thread.sleep(500);
        }
    }

    // QFJ-825
    @Test
    public void testDoubleStartOfAcceptor() throws Exception {
        Acceptor acceptor = null;
        try {
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
            acceptor = createAcceptor(testAcceptorApplication);
            acceptor.start();
            // second start should be ignored
            acceptor.start();
            checkThreads(bean, 1);
        } finally {
            if (acceptor != null) {
                acceptor.stop(true);
            }
            Thread.sleep(500);
        }
    }

    @Test
    public void testSessionsAreCleanedUp() throws Exception {
        Acceptor acceptor = null;
        try {
            TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
            acceptor = createAcceptor(testAcceptorApplication);
            acceptor.start();
            assertEquals(1, acceptor.getSessions().size() );
            assertEquals(1 + SESSION_COUNT, Session.numSessions() );
            
        } finally {
            if (acceptor != null) {
                acceptor.stop(true);
                assertTrue("After stop() the Session count should not be higher than before the test", Session.numSessions() <= SESSION_COUNT );
                assertEquals("After stop() the Session count should be zero in Connector", 0, acceptor.getSessions().size() );
            }
        }
    }

    @Test
    public void testSessionsAreCleanedUpOnThreadedSocketAcceptor() throws Exception {
        Acceptor acceptor = null;
        try {
            TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
            acceptor = createAcceptorThreaded(testAcceptorApplication);
            acceptor.start();
            assertEquals(1, acceptor.getSessions().size() );
            assertEquals(1 + SESSION_COUNT, Session.numSessions() );
            
        } finally {
            if (acceptor != null) {
                acceptor.stop(true);
                assertTrue("After stop() the Session count should not be higher than before the test", Session.numSessions() <= SESSION_COUNT );
                assertEquals("After stop() the Session count should be zero in Connector", 0, acceptor.getSessions().size() );
            }
        }
    }
    
    private void checkThreads(ThreadMXBean bean, int expectedNum) {
        ThreadInfo[] dumpAllThreads = bean.dumpAllThreads(false, false);
        int qfjMPThreads = 0;
        for (ThreadInfo threadInfo : dumpAllThreads) {
            if (SingleThreadedEventHandlingStrategy.MESSAGE_PROCESSOR_THREAD_NAME.equals(threadInfo
                    .getThreadName())) {
                qfjMPThreads++;
            }
        }
        assertEquals("Exactly " + expectedNum + " 'QFJ Message Processor' thread(s) expected", expectedNum, qfjMPThreads);
    }

    private Session lookupSession(SessionID sessionID) {
        return Session.lookupSession(sessionID);
    }

    private static class TestAcceptorApplication extends ApplicationAdapter {

        private final CountDownLatch logonLatch;
        private final CountDownLatch logoutLatch;

        public TestAcceptorApplication() {
            logonLatch = new CountDownLatch(1);
            logoutLatch = new CountDownLatch(1);
        }

        @Override
        public void onLogon(SessionID sessionId) {
            super.onLogon(sessionId);
            logonLatch.countDown();
        }

        public void waitForLogon() {
            try {
                assertTrue("Logon timed out", logonLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }
        
        public void waitForLogout() {
            try {
                assertTrue("Logout timed out", logoutLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            try {
                if (MsgType.LOGOUT.equals(MessageUtils.getMessageType(message.toString()))) {
                    logoutLatch.countDown();
                }
            } catch (InvalidMessage ex) {
                // ignore
            }
        }
    }

    private static class TestInitiatorApplication extends ApplicationAdapter {

        private final CountDownLatch logonLatch;
        private final CountDownLatch logoutLatch;

        public TestInitiatorApplication() {
            logonLatch = new CountDownLatch(1);
            logoutLatch = new CountDownLatch(1);
        }

        @Override
        public void onLogon(SessionID sessionId) {
            super.onLogon(sessionId);
            logonLatch.countDown();
        }

        public void waitForLogon() {
            try {
                assertTrue("Logon timed out", logonLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        public void waitForLogout() {
            try {
                assertTrue("Logout timed out", logoutLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            try {
                if (MsgType.LOGOUT.equals(MessageUtils.getMessageType(message.toString()))) {
                    logoutLatch.countDown();
                }
            } catch (InvalidMessage ex) {
                // ignore
            }
        }
    }

    private Acceptor createAcceptor(TestAcceptorApplication testAcceptorApplication)
            throws ConfigError {

        SessionSettings settings = createAcceptorSettings();

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private Acceptor createAcceptorThreaded(TestAcceptorApplication testAcceptorApplication)
            throws ConfigError {

        SessionSettings settings = createAcceptorSettings();

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new ThreadedSocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }
    
    private SessionSettings createAcceptorSettings() {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("BeginString", "FIX.4.2");
        settings.setString(acceptorSessionID, "SocketAcceptProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(acceptorSessionID, "SocketAcceptPort", "10000");
        settings.set(defaults);
        return settings;
    }

    private Initiator createInitiator(TestInitiatorApplication testInitiatorApplication) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("FileStorePath", "target/data/client");
        defaults.put("ValidateUserDefinedFields", "Y");
        settings.setString("BeginString", FixVersions.BEGINSTRING_FIX42);
        settings.setString(initiatorSessionID, "SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(initiatorSessionID, "SocketConnectHost", "127.0.0.1");
        settings.setString(initiatorSessionID, "SocketConnectPort", "10000");
        settings.set(defaults);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketInitiator(testInitiatorApplication, factory, settings, logFactory, new DefaultMessageFactory());
    }

}
