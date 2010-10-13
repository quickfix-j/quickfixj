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
import java.util.concurrent.CountDownLatch;

import org.apache.mina.util.AvailablePortFinder;
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
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;
import quickfix.field.ListID;
import quickfix.fix44.ListStatusRequest;
import quickfix.fix44.Logon;

/**
 * @author <a href="mailto:jhensley@bonddesk.com">John Hensley</a>
 */
public class TimerTestServer extends MessageCracker implements Application, Runnable {
    SocketAcceptor acceptor;
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final Logger log = LoggerFactory.getLogger(TimerTestServer.class);
    private final SessionSettings settings = new SessionSettings();
    private final CountDownLatch shutdownLatch = new CountDownLatch(1);

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

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        // sleep to move our timer off from the client's
        if (message instanceof Logon) {
            new Timer().schedule(new DelayedTestRequest(sessionId), 3000);
        }
    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
    }

    public void onCreate(SessionID sessionId) {
    }

    public void onLogon(SessionID sessionId) {
    }

    public void onLogout(SessionID sessionId) {
        log.info("logout");
        shutdownLatch.countDown();
    }

    public void run() {
        try {
            HashMap<Object, Object> defaults = new HashMap<Object, Object>();
            defaults.put("ConnectionType", "acceptor");
            defaults.put("SocketAcceptPort", Integer.toString(AvailablePortFinder
                    .getNextAvailable(10000)));
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
            //            settings.setString(sessionID, "DataDictionary", "etc/" + FixVersions.BEGINSTRING_FIX44.replaceAll("\\.", "")
            //                    + ".xml");

            MessageStoreFactory factory = new MemoryStoreFactory();
            acceptor = new SocketAcceptor(this, factory, settings, new ScreenLogFactory(settings),
                    new DefaultMessageFactory());
            acceptor.start();
            try {
                //acceptor.waitForInitialization();
                initializationLatch.countDown();

                    try {
                    shutdownLatch.await();
                } catch (InterruptedException e) {
                }

                log.info("TimerTestServer shutting down.");
            } finally {
                acceptor.stop();
            }
        } catch (Throwable e) {
            log.error("Error in TimerTestServer server: ", e);
            initializationLatch.countDown();
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
        TimerTestServer server = new TimerTestServer();
        server.run();
    }
}
