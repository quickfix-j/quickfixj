/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix.netty;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;

import net.gleamynode.netty2.EventDispatcher;
import net.gleamynode.netty2.IoProcessor;
import net.gleamynode.netty2.LowLatencyEventDispatcher;
import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;
import net.gleamynode.netty2.SessionListener;
import net.gleamynode.netty2.SessionServer;

import org.apache.commons.logging.Log;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.FieldConvertError;
import quickfix.FieldValueConverter;
import quickfix.Initiator;
import quickfix.InvalidMessage;
import quickfix.LogFactory;
import quickfix.LogUtil;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Responder;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;

public abstract class AbstractSocketInitiator implements Initiator {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private static final String DEFAULT_IO_THREAD_PREFIX = "quickfix-io";
    private boolean isStopRequested;
    private final Application application;
    private final SessionSettings settings;
    private final MessageStoreFactory messageStoreFactory;
    private final MessageFactory messageFactory;
    private final LogFactory logFactory;
    private final SessionFactory sessionFactory;

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    protected AbstractSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        this.application = application;
        this.settings = settings;
        this.messageStoreFactory = messageStoreFactory;
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
        sessionFactory = new SessionFactory(application, messageStoreFactory, logFactory);
    }

    protected abstract void onBlock();

    protected abstract void onStart();

    public final void block() throws ConfigError, RuntimeError {
        initialize(true);
        onBlock();
    }

    protected abstract void onMessage(Session nettySession, Message message);

    private boolean firstPoll = true;
    private SessionServer nettySessionServer;

    protected abstract boolean onPoll();

    public final boolean poll() throws ConfigError, RuntimeError {
        if (firstPoll) {
            initialize(true);
            firstPoll = false;
        }

        return onPoll();
    }

    private Thread quickFixThread;
    private IoProcessor ioProcessor;

    public void start() throws ConfigError, RuntimeError {
        initialize(false);
        onStart();
    }

    protected abstract void onStop();

    public final void stop() {
        // logout of sessions
        // wait for logouts
        // sync with initialization
        //quickFixThread.interrupt();
        ioProcessor.stop();
        nettySessionServer.stop();
        isStopRequested = true;
    }

    protected boolean isStopRequested() {
        return isStopRequested;
    }

    // Netty IO thread will place messages on a queue
    // for the application thread to process.

    protected abstract void onInitialize(boolean isBlocking);

    private HashMap quickfixSessions = new HashMap();

    private void initialize(boolean handleMessageInCaller) throws ConfigError {
        try {

            onInitialize(handleMessageInCaller);
            EventDispatcher eventDispatcher = new LowLatencyEventDispatcher();
            ioProcessor = new IoProcessor();
            ioProcessor.setThreadNamePrefix(DEFAULT_IO_THREAD_PREFIX);
            ioProcessor.setThreadPoolSize(1);
            ioProcessor.start();

            SessionFactory factory = new SessionFactory(application, messageStoreFactory,
                    logFactory);
            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                Object sectionKey = i.next();
                // TODO add iterator for non-default session - and/or for
                // connector/acceptor sessions
                if (sectionKey != SessionSettings.DEFAULT_SESSION_ID
                        && (!settings.isSetting((SessionID) sectionKey,
                                SessionSettings.CONNECTION_TYPE) || settings.getString(
                                (SessionID) sectionKey, SessionSettings.CONNECTION_TYPE).equals(
                                "initiator"))) {
                    SessionID sessionID = (SessionID) sectionKey;
                    String host;
                    int port;
                    try {
                        host = settings.getString(sessionID, SessionSettings.SOCKET_CONNECT_HOST);
                        port = (int) settings.getLong(sessionID,
                                SessionSettings.SOCKET_CONNECT_PORT);
                    } catch (ConfigError e) {
                        throw e;
                    } catch (FieldConvertError e) {
                        throw (ConfigError) new ConfigError(e.getMessage()).initCause(e);
                    }

                    quickfix.Session quickfixSession = factory.create(sessionID, settings);

                    Session nettySession = new Session(ioProcessor, new InetSocketAddress(host,
                            port), FIXMessageData.RECOGNIZER, eventDispatcher);

                    InitiatorSessionListener sessionListener = new InitiatorSessionListener(
                            nettySession, quickfixSession);
                    quickfixSession.setResponder(sessionListener);
                    nettySession.addSessionListener(sessionListener);
                    quickfixSessionForNettySession.put(nettySession, quickfixSession);
                    nettySession.start();
                }
            }
            if (quickfixSessionForNettySession.size() == 0) {
                throw new ConfigError("no initiators in settings");
            }
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    private int getIntSetting(String key) throws ConfigError {
        try {
            // TODO add ability to bind a specific network card
            return FieldValueConverter.IntConverter.convert(settings.getString(
                    SessionSettings.DEFAULT_SESSION_ID, key));
        } catch (FieldConvertError e) {
            throw (ConfigError) new ConfigError(e.getMessage()).fillInStackTrace();
        }
    }

    private HashMap quickfixSessionForNettySession = new HashMap();

    private quickfix.Session getQuickFixSession(Session nettySession) {
        return (quickfix.Session) quickfixSessionForNettySession.get(nettySession);
    }

    private String getLogSuffix(Session nettySession, SessionID sessionID) {
        return ": " + (sessionID != null ? (": sessionID=" + sessionID.toString() + ", ") : "")
                + "socket=" + nettySession.getSocketAddressString();
    }

    private void logError(Session nettySession, SessionID sessionID, String message, Throwable t) {
        log.error(message + getLogSuffix(nettySession, sessionID), t);
    }

    private void logDebug(Session nettySession, SessionID sessionID, String message) {
        log.debug(message + getLogSuffix(nettySession, sessionID));
    }

    protected void processMessage(Session nettySession, Message message) {
        logDebug(nettySession, null, "received message");
        quickfix.Session quickfixSession = getQuickFixSession(nettySession);
        if (quickfixSession == null) {
            return;
        }

        try {
            FIXMessageData fixMessageData = (FIXMessageData) message;
            quickfixSession.getState().logIncoming(fixMessageData.toString());
            DataDictionary dataDictionary = quickfixSession.getDataDictionary();
            quickfix.Message fixMessage = fixMessageData.parse(dataDictionary);
            try {
                quickfixSession.next(fixMessage);
            } catch (Throwable e) {
                quickfix.Log sessionLog = quickfixSession.getLog();
                LogUtil.logThrowable(sessionLog, "error while receiving message", e);
                if (fixMessageData.isLogon()) {
                    try {
                        quickfixSession.disconnect();
                    } catch (IOException ioException) {
                        LogUtil.logThrowable(sessionLog, "error during disconnect", ioException);
                    }
                }
            }

        } catch (InvalidMessage e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public class InitiatorSessionListener implements SessionListener, Responder {
        private final Session nettySession;
        private DataDictionary dataDictionary;
        private quickfix.Session quickfixSession;

        private InitiatorSessionListener(Session nettySession, quickfix.Session quickfixSession) {
            this.nettySession = nettySession;
            this.dataDictionary = quickfixSession.getDataDictionary();
            this.quickfixSession = quickfixSession;
        }

        /*
         * (non-Javadoc)
         * 
         * @see net.gleamynode.netty2.SessionListener#connectionEstablished(net.gleamynode.netty2.Session)
         */
        public void connectionEstablished(Session session) {
            System.err.println("connection established: " + session);
            try {
                quickfixSession.next();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        /* (non-Javadoc)
         * @see net.gleamynode.netty2.SessionListener#connectionClosed(net.gleamynode.netty2.Session)
         */
        public void connectionClosed(Session session) {
            try {
                // TODO I'm not sure if I should call reset or disconnect here
                quickfixSession.reset();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        /* (non-Javadoc)
         * @see net.gleamynode.netty2.SessionListener#messageSent(net.gleamynode.netty2.Session, net.gleamynode.netty2.Message)
         */
        public void messageSent(Session session, Message message) {
            // TODO add log entry
        }
        
        /*
         * (non-Javadoc)
         * 
         * @see net.gleamynode.netty2.SessionListener#messageReceived(net.gleamynode.netty2.Session,
         *      net.gleamynode.netty2.Message)
         */
        public void messageReceived(Session session, Message message) {
            FIXMessageData fixMessageData = (FIXMessageData) message;
            try {
                quickfixSession.getState().logIncoming(fixMessageData.toString());
                quickfixSession.next(fixMessageData.parse(dataDictionary));
            } catch (Exception e) {
                LogUtil.logThrowable(quickfixSession.getLog(), "error receiving message", e);
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see net.gleamynode.netty2.SessionListener#sessionIdle(net.gleamynode.netty2.Session)
         */
        public void sessionIdle(Session nettySession) {
            if (quickfixSession.isLoggedOn()) {
                try {
                    quickfixSession.next();
                } catch (IOException e) {
                    exceptionCaught(nettySession, e);
                }
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see quickfix.netty.AbstractSessionListener#exceptionCaught(net.gleamynode.netty2.Session,
         *      java.lang.Throwable)
         */
        public void exceptionCaught(Session session, Throwable cause) {
            // TODO
            cause.printStackTrace();
        }

        /*
         * (non-Javadoc)
         * 
         * @see quickfix.Responder#send(java.lang.String)
         */
        public boolean send(String data) {
            nettySession.write(new FIXMessageData(data));
            return true;
        }

        /*
         * (non-Javadoc)
         * 
         * @see quickfix.Responder#disconnect()
         */
        public void disconnect() {
            nettySession.close();
        }
    }
}