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
import net.gleamynode.netty2.Session;

import org.apache.commons.logging.Log;

import quickfix.netty.AbstractSocketInitiator;
import quickfix.test.acceptance.ATApplication;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class SocketInitiator extends AbstractSocketInitiator {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private BlockingQueue messageQueue;

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
            messageQueue = new LinkedBlockingQueue();
        }
    }

    protected void onBlock() {
        while (!isStopRequested()) {
            try {
                ((MessageEvent) messageQueue.take()).process();
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
            // TODO wait for logout
            return false;
        }

        if (messageQueue.peek() != null) {
            ((MessageEvent) messageQueue.poll()).process();
        }

        return true;
    }

    protected void onStop() {
        // empty
    }

    protected void onMessage(Session nettySession, Message message) {
        if (messageQueue != null) {
            // TODO find a way to not create an object here
            messageQueue.add(new MessageEvent(nettySession, message));
        } else {
            processMessage(nettySession, message);
        }
    }

    /**
     * This class is used to defer message processing to the thread calling
     * block or poll.
     */
    private class MessageEvent {
        private Session session;
        private Message message;

        public MessageEvent(Session session, Message message) {
            this.session = session;
            this.message = message;
        }

        public void process() {
            processMessage(session, message);
        }
    }

    public static void main(String[] args) {
        try {
            SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "TW", "ISLD");
            SessionSettings sessionSettings = new SessionSettings();
            sessionSettings.setString(sessionID, SessionSettings.BEGINSTRING,
                    FixVersions.BEGINSTRING_FIX42);
            sessionSettings.setString(sessionID, SessionSettings.DATA_DICTIONARY,
                    "src/quickfix/codegen/FIX42.xml");
            sessionSettings.setString(sessionID, SessionSettings.START_TIME, "00:00:00");
            sessionSettings.setString(sessionID, SessionSettings.END_TIME, "00:00:00");
            // TODO heartbeat interval should be optional
            sessionSettings.setString(sessionID, SessionSettings.HEARTBTINT, "20"); 
            sessionSettings.setString(sessionID, SessionSettings.CONNECTION_TYPE, "initiator");
            sessionSettings.setString(sessionID, SessionSettings.SOCKET_CONNECT_HOST, "localhost");
            sessionSettings.setLong(sessionID, SessionSettings.SOCKET_CONNECT_PORT, 9877);

            SocketInitiator socketInitiator = new SocketInitiator(new ATApplication() {
                public void toAdmin(quickfix.Message message, SessionID sessionID) {
                    // TODO Auto-generated method stub
                    super.toAdmin(message, sessionID);
                    System.err.println("toAdmin: "+message);
                }

                public void fromAdmin(quickfix.Message message, SessionID sessionID)
                        throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                    // TODO Auto-generated method stub
                    super.fromAdmin(message, sessionID);
                    System.err.println("fromAdmin: "+message);
                }
            }, new MemoryStoreFactory(), sessionSettings, new ScreenLogFactory(true, true, true),
                    new DefaultMessageFactory());
            socketInitiator.start();
            quickfix.Session.lookupSession(sessionID).logon();
            //socketInitiator.
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}