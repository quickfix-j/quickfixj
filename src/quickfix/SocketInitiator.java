/*******************************************************************************
 * * Copyright (c) 2001-2005 quickfixengine.org All rights reserved. * * This
 * file is part of the QuickFIX FIX Engine * * This file may be distributed
 * under the terms of the quickfixengine.org * license as defined by
 * quickfixengine.org and appearing in the file * LICENSE included in the
 * packaging of this file. * * This file is provided AS IS with NO WARRANTY OF
 * ANY KIND, INCLUDING THE * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE. * * See http://www.quickfixengine.org/LICENSE for
 * licensing information. * * Contact ask@quickfixengine.org if any conditions
 * of this licensing are * not clear to you. *
 ******************************************************************************/

package quickfix;

import net.gleamynode.netty2.Message;

import org.apache.commons.logging.Log;

import quickfix.netty.AbstractSocketInitiator;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class SocketInitiator extends AbstractSocketInitiator {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private BlockingQueue eventQueue;

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        // This exception is thrown for compatibility reasons
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    public SocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        // This exception is thrown for compatibility reasons
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    protected void onInitialize(boolean handleMessageInCaller) {
        if (handleMessageInCaller) {
            eventQueue = new LinkedBlockingQueue();
        }
    }

    protected void onBlock() {
        while (!isStopRequested()) {
            try {
                Object event = eventQueue.take();
                System.err.println(Thread.currentThread() + ": processing "+event);
                if (event instanceof Message) {
                    processMessage((Message) event);
                } else if (event instanceof Session) {
                    processTimerEvent((Session) event);
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    protected void onStart() {
        // empty
    }

    protected boolean onPoll() {
        if (isStopRequested()) {
            if (!isLoggedOn()) {
                return false;
            }
            if (System.currentTimeMillis() - getStopRequestTimestamp() > 5000L) {
                return false;
            }
        }

        if (eventQueue.peek() != null) {
            processMessage((Message) eventQueue.poll());
        }

        return true;
    }

    protected void onStop() {
        // empty
    }

    protected void onMessage(Message message) {
        if (eventQueue != null) {
            eventQueue.add(message);
        } else {
            processMessage(message);
        }
    }

    protected void onTimerEvent(Session quickfixSession) {
        if (eventQueue != null) {
            eventQueue.add(quickfixSession);
        } else {
            processTimerEvent(quickfixSession);
        }
    }
//
//    public static void main(String[] args) {
//        try {
//            final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
//            SessionSettings sessionSettings = new SessionSettings();
//            sessionSettings.setString(sessionID, SessionSettings.BEGINSTRING,
//                    FixVersions.BEGINSTRING_FIX42);
//            sessionSettings.setString(sessionID, SessionSettings.DATA_DICTIONARY,
//                    "src/quickfix/codegen/FIX42.xml");
//            sessionSettings.setString(sessionID, SessionSettings.START_TIME, "00:00:00");
//            sessionSettings.setString(sessionID, SessionSettings.END_TIME, "00:00:00");
//            sessionSettings.setString(sessionID, SessionSettings.HEARTBTINT, "20");
//            sessionSettings.setString(sessionID, SessionSettings.CONNECTION_TYPE, "initiator");
//            sessionSettings.setString(sessionID, SessionSettings.SOCKET_CONNECT_HOST, "localhost");
//            sessionSettings.setLong(sessionID, SessionSettings.SOCKET_CONNECT_PORT, 9877);
//            sessionSettings.setLong(sessionID, SessionSettings.RECONNECT_INTERVAL, 2);
//
//            SocketInitiator socketInitiator = new SocketInitiator(new ATApplication() {
//                public void toAdmin(quickfix.Message message, SessionID sessionID) {
//                    super.toAdmin(message, sessionID);
//                    System.err.println("toAdmin: " + message);
//                }
//
//                public void fromAdmin(quickfix.Message message, SessionID sessionID)
//                        throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
//                    super.fromAdmin(message, sessionID);
//                    System.err.println("fromAdmin: " + message);
//                }
//            }, new MemoryStoreFactory(), sessionSettings, new ScreenLogFactory(true, true, true),
//                    new DefaultMessageFactory());
//            // new Thread(new Runnable() {
//            // public void run() {
//            // try {
//            // Thread.sleep(10000);
//            // System.err.println("LOGGING OUT");
//            // quickfix.Session session =
//            // quickfix.Session.lookupSession(sessionID);
//            // session.logout();
//            // session.next();
//            // } catch (Exception e) {
//            // e.printStackTrace();
//            // }
//            // }
//            // }).start();
//            // socketInitiator.start();
//            socketInitiator.block();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}