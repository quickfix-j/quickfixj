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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.mina.ProtocolFactory;

/**
 * QFJ-643: Unable to restart a stopped acceptor (SocketAcceptor)
 *
 * Check if a connection can be established against a restarted SocketAcceptor.
 *
 * MultiAcceptorTest served as a template for this test.
 */
public class SocketAcceptorTest extends TestCase {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final SessionID acceptorSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42,
            "ACCEPTOR", "INITIATOR");
    private final SessionID initiatorSessionID = new SessionID(FixVersions.BEGINSTRING_FIX42,
            "INITIATOR", "ACCEPTOR");

    @Test
    public void testRestartOfAcceptor() throws Exception {
        TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();
        Acceptor acceptor = null;
        Initiator initiator = null;
        try {
            acceptor = createAcceptor(testAcceptorApplication);
            acceptor.start();
            initiator = createInitiator();

            assertNotNull("Session should be registered", lookupSession(acceptorSessionID));

            acceptor.stop();
            assertNull("Session should NOT be registered", lookupSession(acceptorSessionID));

            acceptor.start();
            assertNotNull("Session should be registered", lookupSession(acceptorSessionID));
            initiator.start();

            testAcceptorApplication.waitForLogon();
            assertTrue("initiator should have logged on by now", acceptor.isLoggedOn());
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

    private Session lookupSession(SessionID sessionID) {
        return Session.lookupSession(sessionID);
    }

    private static class TestAcceptorApplication extends ApplicationAdapter {

        private final CountDownLatch logonLatch;

        public TestAcceptorApplication() {
            logonLatch = new CountDownLatch(1);
        }

        public void onLogon(SessionID sessionId) {
            super.onLogon(sessionId);
            logonLatch.countDown();
        }

        public void waitForLogon() {
            try {
                logonLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }
    }

    private Acceptor createAcceptor(TestAcceptorApplication testAcceptorApplication)
            throws ConfigError {

        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<Object, Object>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("BeginString", "FIX.4.2");
        settings.setString(acceptorSessionID, "SocketAcceptProtocol", ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(acceptorSessionID, "SocketAcceptPort", "10000");
        settings.set(defaults);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private Initiator createInitiator() throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<Object, Object>();
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
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketInitiator(new ApplicationAdapter() {
        }, factory, settings, logFactory, new DefaultMessageFactory());
    }

}
