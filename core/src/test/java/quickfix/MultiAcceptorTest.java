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

import org.apache.mina.common.TransportType;

import quickfix.field.TestReqID;
import quickfix.fix42.TestRequest;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class MultiAcceptorTest extends TestCase {

    private TestAcceptorApplication testAcceptorApplication = new TestAcceptorApplication();

    protected void tearDown() throws Exception {
        super.tearDown();
        testAcceptorApplication.tearDown();
    }

    public void testMultipleAcceptor() throws Exception {
        Acceptor acceptor = null;
        Initiator initiator = null;
        try {
            acceptor = createAcceptor();
            acceptor.start();

            initiator = createInitiator(false);
            initiator.start();

            testAcceptorApplication.waitForLogon();

            testAcceptorApplication.setMessageLatch(new CountDownLatch(3));
            doSessionDispatchingTest(1);
            doSessionDispatchingTest(2);
            doSessionDispatchingTest(3);
            
        } finally {
            if (acceptor != null) {
                acceptor.stop();
            }
            if (initiator != null) {
                initiator.stop();
            }
        }
    }

    public void testMessageSentOnWrongAcceptor() throws Exception {
        Acceptor acceptor = createAcceptor();
        acceptor.start();

        Initiator initiator = createInitiator(true);
        initiator.start();

        testAcceptorApplication.waitForLogon();

        TestRequest message = new TestRequest();
        message.set(new TestReqID("TEST"+3));
        System.out.println("@@@@@ DEBUG MultiAcceptorTest.testMultipleAcceptor "+message);
        SessionID sessionID = getSessionIDForClient(3);
        Session.sendToTarget(message, sessionID);
        
        testAcceptorApplication.assertNoMessages(sessionID);        
    }
    
    private void doSessionDispatchingTest(int i) throws SessionNotFound, InterruptedException, FieldNotFound {
        TestRequest message = new TestRequest();
        message.set(new TestReqID("TEST"+i));
        System.out.println("@@@@@ DEBUG MultiAcceptorTest.testMultipleAcceptor "+message);
        SessionID sessionID = getSessionIDForClient(i);
        Session.sendToTarget(message, sessionID);

        testAcceptorApplication.waitForMessages();
        testAcceptorApplication.assertTestRequestOnSession("TEST"+i, sessionID);
    }

    private SessionID getSessionIDForClient(int i) {
        return new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER" + i, "TARGET");
    }

    private class TestAcceptorApplication extends ApplicationAdapter {
        private HashMap sessionMessages = new HashMap();
        private CountDownLatch logonLatch = new CountDownLatch(3);
        private CountDownLatch messageLatch;
        
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

        public void assertTestRequestOnSession(String text, SessionID sessionID) throws FieldNotFound {
            Message testRequest = (Message)sessionMessages.get(sessionID);
            assertNotNull("no message", testRequest);
            System.out.println("@@@@@ DEBUG TestAcceptorApplication.assertTestRequestOnSession "+testRequest);
            assertEquals("wrong message", text, testRequest.getString(TestReqID.FIELD));
        }

        public void assertNoMessages(SessionID sessionID) {
            assertNull("unexpected message", sessionMessages.get(sessionID));
        }
        
        public void waitForLogon() {
            try {
                logonLatch.await(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }
        
        public void setMessageLatch(CountDownLatch messageLatch) {
            this.messageLatch = messageLatch;
        }
        
        public void waitForMessages() {
            try {
                messageLatch.await(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                fail(e.getMessage());
            }
        }
        
        public void tearDown() {
            sessionMessages.clear();
        }
    }

    private Initiator createInitiator(boolean wrongPort) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap defaults = new HashMap();
        defaults.put("ConnectionType", "initiator");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("FileStorePath", "output/data/client");
        defaults.put("ValidateUserDefinedFields", "Y");
        settings.setString("BeginString", FixVersions.BEGINSTRING_FIX42);
        settings.set(defaults);

        configureInitiatorForSession(settings, 1, 1000);
        configureInitiatorForSession(settings, 2, 1000);
        configureInitiatorForSession(settings, 3, wrongPort ? 1000 : 2000);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketInitiator(new ApplicationAdapter() {
        }, factory, settings, logFactory, new DefaultMessageFactory());
    }

    private void configureInitiatorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TARGET", "SENDER" + i);
        settings.setString(sessionID, "SocketConnectProtocol", TransportType.VM_PIPE.toString());
        settings.setString(sessionID, "SocketConnectPort", Integer.toString(port));
    }

    private Acceptor createAcceptor() throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap defaults = new HashMap();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("SenderCompID", "ISLD");
        defaults.put("TargetCompID", "TW");
        defaults.put("BeginString", "FIX.4.2");
        defaults.put("ResetOnDisconnect", "Y");
        settings.set(defaults);

        configureAcceptorForSession(settings, 1, 1000);
        configureAcceptorForSession(settings, 2, 1000);
        configureAcceptorForSession(settings, 3, 2000);

        MessageStoreFactory factory = new MemoryStoreFactory();
        quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
        return new SocketAcceptor(testAcceptorApplication, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private void configureAcceptorForSession(SessionSettings settings, int i, int port) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER" + i, "TARGET");
        settings.setString(sessionID, "SocketAcceptProtocol", TransportType.VM_PIPE.toString());
        settings.setString(sessionID, "SocketAcceptPort", Integer.toString(port));
    }
}
