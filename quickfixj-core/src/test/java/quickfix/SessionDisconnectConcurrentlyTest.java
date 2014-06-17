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

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.Test;

import quickfix.field.TestReqID;
import quickfix.fix42.TestRequest;
import quickfix.mina.ProtocolFactory;

public class SessionDisconnectConcurrentlyTest extends TestCase {
    private TestAcceptorApplication testAcceptorApplication;

    protected void tearDown() throws Exception {
        super.tearDown();
        testAcceptorApplication.tearDown();
    }

    // QFJ-738
    @Test(timeout = 15000)
    public void testConcurrentDisconnection() throws Exception {
        testAcceptorApplication = new TestAcceptorApplication(1);
        final Acceptor acceptor = createAcceptor();
        final Initiator initiator = createInitiator();
        try {
            acceptor.start();
            initiator.start();

            testAcceptorApplication.waitForLogon();

            doSessionDispatchingTest(1);
        } finally {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            initiator.stop();
            acceptor.stop();
            List<String> deadlockedThreads = thread.getDeadlockedThreads();
            assertTrue("No threads should be deadlocked: " + deadlockedThreads,
                    deadlockedThreads.isEmpty());
        }
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
        private final HashMap<SessionID, Message> sessionMessages = new HashMap<SessionID, Message>();
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

        public void waitForLogon() {
            try {
                logonLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }

        public synchronized void setMessageLatch(CountDownLatch messageLatch) {
            this.messageLatch = messageLatch;
        }

        public synchronized void waitForMessages() {
            try {
                if (!messageLatch.await(10, TimeUnit.SECONDS)) {
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
        settings.set(defaults);

        configureInitiatorForSession(settings, 1, 10001);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketInitiator(new ApplicationAdapter() {
        }, factory, settings, logFactory, new DefaultMessageFactory());
    }

    private void configureInitiatorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "INITIATOR", "ACCEPTOR-"
                + i);
        settings.setString(sessionID, "SocketConnectProtocol",
                ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(sessionID, "SocketConnectHost", "127.0.0.1");
        settings.setString(sessionID, "SocketConnectPort", Integer.toString(port));
    }

    private Acceptor createAcceptor() throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<Object, Object>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put(SessionSettings.SENDERCOMPID, "ISLD");
        defaults.put(SessionSettings.TARGETCOMPID, "TW");
        defaults.put("BeginString", "FIX.4.2");
        defaults.put("ResetOnDisconnect", "Y");
        settings.set(defaults);

        configureAcceptorForSession(settings, 1, 10001);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private void configureAcceptorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "ACCEPTOR-" + i,
                "INITIATOR");
        settings.setString(sessionID, "SocketAcceptProtocol",
                ProtocolFactory.getTypeString(ProtocolFactory.VM_PIPE));
        settings.setString(sessionID, "SocketAcceptPort", Integer.toString(port));
    }

    private static class MyThread extends Thread {

        long[] threadIds = {};
        final ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        @Override
        public void run() {
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadIds = bean.findDeadlockedThreads();
        }

        public List<String> getDeadlockedThreads() {
            List<String> deadlockedThreads = new ArrayList<String>();
            if (null != threadIds) {
                for (long threadId : threadIds) {
                    ThreadInfo threadInfo = bean.getThreadInfo(threadId);
                    deadlockedThreads.add(threadInfo.getThreadId() + ": " + threadInfo.getThreadName()
                            + " state: " + threadInfo.getThreadState());
                }
            }
            return deadlockedThreads;
        }

    }
}
