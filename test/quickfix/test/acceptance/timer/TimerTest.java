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

package quickfix.test.acceptance.timer;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import junit.framework.TestCase;

import org.apache.mina.util.AvailablePortFinder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FixVersions;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;
import quickfix.UnsupportedMessageType;
import quickfix.field.ListID;
import quickfix.fix44.ListStatusRequest;
import quickfix.fix44.Logon;
import quickfix.fix44.TestRequest;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

public class TimerTest extends TestCase {
    private Thread serverThread;
    private TimerTestServer server;

    public void testAcceptorTimer() {
        try {
            new TimerTestClient(server.getPort()).run();
        } catch (ConfigError configError) {
            fail(configError.getMessage());
        } catch (SessionNotFound sessionNotFound) {
            fail(sessionNotFound.getMessage());
        } catch (InterruptedException e) {
            fail(e.getMessage());
        }
    }

    protected void setUp() throws Exception {
        super.setUp();
        server = new TimerTestServer();
        serverThread = new Thread(server, "TimerTestServer");
        serverThread.start();
        server.waitForInitialization();
    }

    protected void tearDown() throws Exception {
        serverThread.interrupt();
        super.tearDown();
    }
    
    private static class TimerTestClient extends MessageCracker implements Application {
        private final Logger log = LoggerFactory.getLogger(TimerTestClient.class);
        private final SessionSettings settings = new SessionSettings();
        private final CountDownLatch shutdownLatch = new CountDownLatch(1);
        private boolean failed;
        private final int port;

        public TimerTestClient(int port) {
            this.port = port;
        }

        public void crack(Message message, SessionID sessionID) throws UnsupportedMessageType,
                FieldNotFound, IncorrectTagValue {
            super.crack(message, sessionID);
        }

        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        }

        public void fromApp(Message message, SessionID sessionID) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            crack(message, sessionID);
        }

        public void onCreate(SessionID sessionId) {
        }

        public void onLogon(SessionID sessionId) {
        }

        public void onLogout(SessionID sessionId) {
        }

        public void onMessage(ListStatusRequest message, SessionID sessionID) {
            log.info("got ListStatusRequest");
        }

        private void stop(boolean failed) {
            this.failed = failed;
            shutdownLatch.countDown();
        }

        public void run() throws ConfigError, SessionNotFound, InterruptedException {
            HashMap defaults = new HashMap();
            defaults.put("ConnectionType", "initiator");
            defaults.put("HeartBtInt", "2");
            defaults.put("SocketConnectHost", "localhost");
            defaults.put("SocketConnectPort", Integer.toString(port));
            defaults.put("StartTime", "00:00:00");
            defaults.put("EndTime", "00:00:00");
            defaults.put("SenderCompID", "TW");
            defaults.put("TargetCompID", "ISLD");
            defaults.put("FileStorePath", "output/data/client");
            defaults.put("ValidateUserDefinedFields", "Y");
            settings.set(defaults);

            SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "TW", "ISLD");
            settings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
            settings.setString(sessionID, "DataDictionary", "etc/"
                    + FixVersions.BEGINSTRING_FIX44.replaceAll("\\.", "") + ".xml");

            MessageStoreFactory storeFactory = new MemoryStoreFactory();
            Initiator initiator = new SocketInitiator(this, storeFactory, settings,
                    new ScreenLogFactory(settings), new DefaultMessageFactory());
            initiator.start();

            try {
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {
                        stop(false);
                    }
                }, 5000);

                shutdownLatch.await();

                if (failed) {
                    String message = "TimerTestClient had to send a test request, indicating that the test server was not reliably sending heartbeats.";
                    log.error(message);
                    throw new RuntimeError(message);
                }
            } finally {
                initiator.stop();
            }
        }

        public void toAdmin(Message message, SessionID sessionId) {
            if (message instanceof TestRequest) {
                stop(true);
            }
        }

        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        }

        public static void main(String[] args) throws ConfigError, SessionNotFound,
                InterruptedException {
            TimerTestClient ttc = new TimerTestClient(10000);
            ttc.run();
        }
    }
    
    private static class TimerTestServer extends MessageCracker implements Application, Runnable {
        SocketAcceptor acceptor;
        private final CountDownLatch initializationLatch = new CountDownLatch(1);
        private final Logger log = LoggerFactory.getLogger(TimerTestServer.class);
        private final SessionSettings settings = new SessionSettings();
        private boolean stop = false;
        private final Object shutdownLatch = new Object();
        private int port;

        private class DelayedTestRequest extends TimerTask {
            SessionID session;

            DelayedTestRequest(SessionID sessionID) {
                this.session = sessionID;
            }

            public void run() {
                try {
                    log.info("Sending offset message");
                    ListStatusRequest lsr = new ListStatusRequest(new ListID("somelist"));
                    Session.sendToTarget(lsr, this.session);
                } catch (SessionNotFound sessionNotFound) {
                    // not going to happen
                }
            }
        }

        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            // sleep to move our timer off from the client's
            if (message instanceof Logon) {
                new Timer().schedule(new DelayedTestRequest(sessionId), 3000);
            }
        }

        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        }

        public void onCreate(SessionID sessionId) {
        }

        public void onLogon(SessionID sessionId) {
        }

        public void onLogout(SessionID sessionId) {
            log.info("logout");
            synchronized (shutdownLatch) {
                stop = true;
                shutdownLatch.notify();
            }
        }

        public void run() {
            try {
                HashMap defaults = new HashMap();
                defaults.put("ConnectionType", "acceptor");
                port = AvailablePortFinder.getNextAvailable(10000);
                defaults.put("SocketAcceptPort", Integer.toString(port));
                defaults.put("StartTime", "00:00:00");
                defaults.put("EndTime", "00:00:00");
                defaults.put("SenderCompID", "ISLD");
                defaults.put("TargetCompID", "TW");
                defaults.put("FileStorePath", "output/data/server");
                defaults.put("ValidateUserDefinedFields", "Y");
                defaults.put("ResetOnDisconnect", "Y");
                settings.set(defaults);

                SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ISLD", "TW");
                settings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);

                MessageStoreFactory factory = new MemoryStoreFactory();
                acceptor = new SocketAcceptor(this, factory, settings,
                        new ScreenLogFactory(settings), new DefaultMessageFactory());
                acceptor.start();
                try {
                    //acceptor.waitForInitialization();
                    initializationLatch.countDown();

                    while (!stop) {
                        synchronized (shutdownLatch) {
                            try {
                                shutdownLatch.wait();
                            } catch (InterruptedException e) {
                            }
                        }
                    }

                    log.info("TimerTestServer shutting down.");
                } finally {
                    acceptor.stop();
                }
            } catch (Throwable e) {
                log.error("Error in TimerTestServer server: ", e);
            }
        }

        public void toAdmin(Message message, SessionID sessionId) {
        }

        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        }

        public void waitForInitialization() throws InterruptedException {
            initializationLatch.await();
        }

        public int getPort() {
            return port;
        }
        
        public static void main(String[] args) {
            TimerTestServer server = new TimerTestServer();
            server.run();
        }
    }

}