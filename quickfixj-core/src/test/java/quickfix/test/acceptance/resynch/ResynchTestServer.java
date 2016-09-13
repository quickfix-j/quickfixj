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

package quickfix.test.acceptance.resynch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Application;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FixVersions;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;
import quickfix.mina.SessionConnector;

public class ResynchTestServer extends MessageCracker implements Application, Runnable, PropertyChangeListener {

    SocketAcceptor acceptor;
    private final Logger log = LoggerFactory.getLogger(ResynchTestServer.class);
    private final SessionSettings settings = new SessionSettings();
    private Thread serverThread;
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final CountDownLatch shutdownLatch = new CountDownLatch(1);

    private boolean unsynchMode = false;
    private boolean validateSequenceNumbers = true;

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        crack(message, sessionId);
    }

    public void onCreate(SessionID sessionId) {
//        if (isUnsynchMode()) {
//            // NB: there is a chance that lookupSession will fail since
//            // the sessions are kept in a ConcurrentHashMap which does not block.
//            // From JavaDoc: Retrievals reflect the results of the most recently
//            // completed update operations.
//            // For the sake of completion of the AcceptanceTests, we will try again once.
//            Session session = Session.lookupSession(sessionId);
//                int i = 1;
//            while (session == null) {
//                System.out.println("XXXXXXXX was NULL " + i++ + " times ");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {}
//                session = Session.lookupSession(sessionId);
////                if (session == null) {
////                    throw new RuntimeException("Could not lookup session " + sessionId);
////                }
//            }
//            try {
//                session.setNextTargetMsgSeqNum(10);
//            } catch (IOException e) {
//                log.error(e.getMessage());
//            }
//        }
    }

    public void onLogon(SessionID sessionId) {
    }

    public void onLogout(SessionID sessionId) {
        shutdownLatch.countDown();
    }

    public void start() {
        serverThread = new Thread(this, "ResynchTestServer");
        serverThread.setDaemon(true);
        serverThread.start();
    }

    public void stop() {
        shutdownLatch.countDown();
//        try {
//            serverThread.join();
//        } catch (InterruptedException ex) {
//            java.util.logging.Logger.getLogger(ResynchTestServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void run() {
        try {
            HashMap<Object, Object> defaults = new HashMap<Object, Object>();
            defaults.put("ConnectionType", "acceptor");
            defaults.put("SocketAcceptPort", "19889");
            defaults.put("StartTime", "00:00:00");
            defaults.put("EndTime", "00:00:00");
            defaults.put("SenderCompID", "ISLD");
            defaults.put("TargetCompID", "TW");
            defaults.put("FileStorePath", "target/data/server");
            defaults.put("ValidateUserDefinedFields", "Y");
            defaults.put("ValidateSequenceNumbers", validateSequenceNumbers ? "Y" : "N");
            settings.set(defaults);

            SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ISLD", "TW");
            settings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
            // settings.setString(sessionID, "DataDictionary", "etc/" + FixVersions.BEGINSTRING_FIX44.replaceAll("\\.", "")
            //         + ".xml");

            MessageStoreFactory factory = new MemoryStoreFactory();

            acceptor = new SocketAcceptor(this, factory, settings, new ScreenLogFactory(settings),
                    new DefaultMessageFactory());
            acceptor.addPropertyChangeListener(this);
            acceptor.start();

            // XXX wait some time?
            try {
                //acceptor.waitForInitialization();
                initializationLatch.countDown();

                try {
                    shutdownLatch.await();
                } catch (InterruptedException e) {
                }

                log.info("ResynchTestServer shutting down.");
            } finally {
//                acceptor.stop(true);
                acceptor.stop();
            }
        } catch (Throwable e) {
            log.error("Error in ResynchTestServer server: ", e);
        }
    }

    public void toAdmin(Message message, SessionID sessionId) {
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
    }

    public static void main(String[] args) {
        ResynchTestServer server = new ResynchTestServer();
        server.run();
    }

    public void setUnsynchMode(boolean unsynchMode) {
        this.unsynchMode = unsynchMode;
    }

    public void setValidateSequenceNumbers(boolean validateSequenceNumbers) {
        this.validateSequenceNumbers = validateSequenceNumbers;
    }

    public boolean isValidateSequenceNumbers() {
        return validateSequenceNumbers;
    }

    public boolean isUnsynchMode() {
        return unsynchMode;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(SessionConnector.SESSIONS_PROPERTY)) {
            SessionID sessionId = new SessionID(FixVersions.BEGINSTRING_FIX44, "ISLD", "TW");
            System.out.println( "XXX got property change event: " + evt);
            if (isUnsynchMode()) {
                // NB: there is a chance that lookupSession will fail since
                // the sessions are kept in a ConcurrentHashMap which does not block.
                // From JavaDoc: Retrievals reflect the results of the most recently
                // completed update operations.
                // For the sake of completion of the AcceptanceTests, we will try again once.
                Session session = Session.lookupSession(sessionId);
                int i = 1;
                while (session == null) {
                    System.out.println("XXXXXXXX was NULL " + i++ + " times ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    session = Session.lookupSession(sessionId);
//                if (session == null) {
//                    throw new RuntimeException("Could not lookup session " + sessionId);
//                }
                }
                try {
                    session.setNextTargetMsgSeqNum(10);
                } catch (IOException e) {
                    log.error(e.getMessage());
                }
            }
        }
    }
}
