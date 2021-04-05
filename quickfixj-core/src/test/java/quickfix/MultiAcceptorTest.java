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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.field.TestReqID;
import quickfix.fix42.TestRequest;
import quickfix.mina.ProtocolFactory;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class MultiAcceptorTest {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private TestAcceptorApplication testAcceptorApplication;

    @After
    public void tearDown() throws Exception {
        testAcceptorApplication.tearDown();
    }

    @Test
    public void testMultipleAcceptor() throws Exception {
        testAcceptorApplication = new TestAcceptorApplication(3);
        Acceptor acceptor = null;
        Initiator initiator = null;
        try {
            int freePort1 = AvailablePortFinder.getNextAvailable();
            int freePort2 = AvailablePortFinder.getNextAvailable();
            int freePort3 = AvailablePortFinder.getNextAvailable();

            acceptor = createAcceptor(freePort1, freePort2, freePort3, false);
            acceptor.start();

            initiator = createInitiator(false, freePort1, freePort2, freePort3);
            initiator.start();

            testAcceptorApplication.waitForLogon();

            doSessionDispatchingTest(1);
            doSessionDispatchingTest(2);
            doSessionDispatchingTest(3);
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
        }
    }

    @Test
    public void testMessageSentOnWrongAcceptor() throws Exception {
        testAcceptorApplication = new TestAcceptorApplication(2);
        Acceptor acceptor = null;
        Initiator initiator = null;

        try {
            int freePort1 = AvailablePortFinder.getNextAvailable();
            int freePort2 = AvailablePortFinder.getNextAvailable();
            int freePort3 = AvailablePortFinder.getNextAvailable();

            acceptor = createAcceptor(freePort1, freePort2, freePort3, false);
            acceptor.start();

            initiator = createInitiator(true, freePort1, freePort2, freePort3);
            initiator.start();

            testAcceptorApplication.waitForLogon();

            TestRequest message = new TestRequest();
            message.set(new TestReqID("TEST" + 3));
            SessionID sessionID = getSessionIDForClient(3);
            Session.sendToTarget(message, sessionID);

            testAcceptorApplication.assertNoMessages(sessionID);
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
        }
    }

    @Test
    public void testContinueInitializationOnError() throws Exception {
        testAcceptorApplication = new TestAcceptorApplication(3);
        int freePort1 = AvailablePortFinder.getNextAvailable();
        int freePort2 = AvailablePortFinder.getNextAvailable();
        int freePort3 = AvailablePortFinder.getNextAvailable();

        Acceptor acceptor = createAcceptor(freePort1, freePort2, freePort3, true);
        acceptor.start();

        List<SessionID> acceptorSessions = acceptor.getSessions();
        assertEquals(2, acceptorSessions.size());
        SessionID session1 = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + 1, "INITIATOR");
        SessionID session2 = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + 2, "INITIATOR");
        SessionID session3 = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + 3, "INITIATOR");
        assertTrue(acceptorSessions.contains(session1));
        assertFalse(acceptorSessions.contains(session2));
        assertTrue(acceptorSessions.contains(session3));

        acceptor.stop(true);
    }

    private void doSessionDispatchingTest(int i) throws SessionNotFound, InterruptedException,
            FieldNotFound {
        TestRequest message = new TestRequest();
        message.set(new TestReqID("TEST" + i));
        SessionID sessionID = getSessionIDForClient(i);

        testAcceptorApplication.setMessageLatch(new CountDownLatch(1));
        Session.sendToTarget(message, sessionID);

        testAcceptorApplication.waitForMessages();
        testAcceptorApplication.assertTestRequestOnSession("TEST" + i, sessionID);
    }

    private SessionID getSessionIDForClient(int i) {
        return new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + i, "INITIATOR");
    }

    private static class TestAcceptorApplication extends ApplicationAdapter {
        private final HashMap<SessionID, Message> sessionMessages = new HashMap<>();
        private final CountDownLatch logonLatch;
        private CountDownLatch messageLatch;

        public TestAcceptorApplication(int countDown) {
            logonLatch = new CountDownLatch(countDown);
        }

        public void onLogon(SessionID sessionId) {
            super.onLogon(sessionId);
            logonLatch.countDown();
        }

        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            sessionMessages.put(sessionId, message);
            if (messageLatch != null) {
                messageLatch.countDown();
            }
        }

        public void assertTestRequestOnSession(String text, SessionID sessionID)
                throws FieldNotFound {
            Message testRequest = sessionMessages.get(sessionID);
            assertNotNull("no message", testRequest);
            assertEquals("wrong message", text, testRequest.getString(TestReqID.FIELD));
        }

        public void assertNoMessages(SessionID sessionID) {
            assertNull("unexpected message", sessionMessages.get(sessionID));
        }

        public void waitForLogon() {
            try {
                logonLatch.await(20, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        public synchronized void setMessageLatch(CountDownLatch messageLatch) {
            this.messageLatch = messageLatch;
        }

        public synchronized void waitForMessages() {
            try {
                if (!messageLatch.await(20, TimeUnit.SECONDS)) {
                    fail("Timed out waiting for message");
                }
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        public void tearDown() {
            sessionMessages.clear();
        }
    }

    private Initiator createInitiator(boolean wrongPort, int freePort1, int freePort2, int freePort3) throws ConfigError {
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
        settings.set(defaults);

        configureInitiatorForSession(settings, 1, freePort1);
        configureInitiatorForSession(settings, 2, freePort2);
        configureInitiatorForSession(settings, 3, wrongPort ? 1000 : freePort3);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketInitiator(new ApplicationAdapter() {
        }, factory, settings, logFactory, new DefaultMessageFactory());
    }

    private void configureInitiatorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "INITIATOR", "ACCEPTOR-" + i);
        settings.setString(sessionID, "SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(sessionID, "SocketConnectHost", "127.0.0.1");
        settings.setString(sessionID, "SocketConnectPort", Integer.toString(port));
    }

    private Acceptor createAcceptor(int freePort1, int freePort2, int freePort3, boolean addFaultySession) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put(SessionSettings.SENDERCOMPID, "ISLD");
        defaults.put(SessionSettings.TARGETCOMPID, "TW");
        defaults.put("BeginString", "FIX.4.2");
        defaults.put("ResetOnDisconnect", "Y");
        if (addFaultySession) {
            defaults.put("UseDataDictionary", "Y");
            defaults.put("DataDictionary", "FIX42.xml");
            defaults.put(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR, "Y");
        }
        settings.set(defaults);

        configureAcceptorForSession(settings, 1, freePort1);
        configureAcceptorForSession(settings, 2, freePort2);
        configureAcceptorForSession(settings, 3, freePort3);

        if (addFaultySession) {
            // set a non-existent dictionary to let one session creation fail
            SessionID faultySessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + 2, "INITIATOR");
            settings.setString(faultySessionID, "DataDictionary", "unknown.xml");
        }

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private void configureAcceptorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + i, "INITIATOR");
        settings.setString(sessionID, "SocketAcceptProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(sessionID, "SocketAcceptPort", Integer.toString(port));
    }
}
