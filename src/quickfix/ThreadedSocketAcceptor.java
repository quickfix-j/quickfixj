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

package quickfix;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;

import net.gleamynode.netty2.IoProcessor;
import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.OrderedEventDispatcher;
import net.gleamynode.netty2.Session;
import net.gleamynode.netty2.SessionServer;
import net.gleamynode.netty2.ThreadPooledEventDispatcher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.netty.AbstractSessionListener;
import quickfix.netty.FIXMessageData;

public class ThreadedSocketAcceptor implements Acceptor {
    private Log log = LogFactory.getLog(getClass());
    private SessionSettings settings;
    private SessionFactory sessionFactory;

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, quickfix.LogFactory logFactory, MessageFactory messageFactory)
            throws ConfigError {
        initialize(application, messageStoreFactory, settings, logFactory, messageFactory);
        // This is thrown for compatibility
        if (settings == null) {
            throw new ConfigError("no settings");
        }
    }

    public ThreadedSocketAcceptor(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    private void initialize(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, quickfix.LogFactory logFactory, MessageFactory messageFactory) {
        sessionFactory = new SessionFactory(application, messageStoreFactory, logFactory);
        this.settings = settings;
    }

    public void block() throws ConfigError, RuntimeError {
        // TODO Implement block
    }

    public boolean poll() throws ConfigError, RuntimeError {
        // TODO Implement poll
        return false;
    }

    public void start() throws ConfigError, RuntimeError {
        try {
            IoProcessor ioProcessor = new IoProcessor();
            ThreadPooledEventDispatcher eventDispatcher = new OrderedEventDispatcher();

            ioProcessor.start();

            int ioThreadPoolSize = 1; // TODO init from settings
            ioProcessor.setThreadPoolSize(ioThreadPoolSize);

            int eventDispatcherThreadPoolSize = 1; // TODO init from settings
            eventDispatcher.setThreadPoolSize(eventDispatcherThreadPoolSize);
            eventDispatcher.start();

            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                Object sectionKey = i.next();
                if (sectionKey instanceof SessionID) {
                    final SessionID sessionID = (SessionID) sectionKey;
                    int port = 0;
                    try {
                        port = (int) settings
                                .getLong(sessionID, SessionSettings.SOCKET_ACCEPT_PORT);
                    } catch (ConfigError e) {
                        throw e;
                    } catch (FieldConvertError e) {
                        throw (ConfigError) new ConfigError(e.getMessage()).fillInStackTrace();
                    }

                    SessionServer server = new SessionServer();
                    server.setIoProcessor(ioProcessor);
                    server.setEventDispatcher(eventDispatcher);
                    server.setMessageRecognizer(FIXMessageData.RECOGNIZER);

                    server.addSessionListener(new NettySessionResponder(sessionID));
                    server.setBindAddress(new InetSocketAddress(port));
                    server.start();
                    log.info("listening for connections on port " + port);
                }

            }
        } catch (Exception e) {
            throw (RuntimeError) new RuntimeError(e.getMessage()).initCause(e);
        }
    }

    public void stop() {
        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
            Object sectionKey = i.next();
            if (sectionKey instanceof SessionID) {
                quickfix.Session session = quickfix.Session.lookupSession((SessionID) sectionKey);
                session.logout();
            }
        }
    }

    private final class NettySessionResponder extends AbstractSessionListener {
        private final SessionID sessionID;
        private HashMap quickFixSessionsByNettySession = new HashMap();
        private HashMap quickFixSessionsBySessionID = new HashMap();

        private NettySessionResponder(SessionID sessionID) {
            this.sessionID = sessionID;
        }

        public void connectionEstablished(Session nettySession) {
            super.connectionEstablished(nettySession);
            logInfo(nettySession, "connection attempt");
            quickfix.Session quickFixSession = getQuickFixSession(sessionID);
            if (quickFixSession == null) {
                try {
                    quickFixSession = sessionFactory.create(sessionID, settings);
                    quickFixSessionsBySessionID.put(sessionID, quickFixSession);
                    quickFixSessionsByNettySession.put(nettySession, quickFixSession);
                    quickFixSession.setResponder(new ResponderAdapter(nettySession));
                    logInfo(nettySession, "connection established");
                } catch (ConfigError e) {
                    if (quickFixSession != null) {
                        LogUtil.logThrowable(quickFixSession.getLog(), e.getMessage(), e);
                    } else {
                        logError(nettySession, e.getMessage(), e);
                    }
                }
            } else {
                if (quickFixSession.isLoggedOn()) {
                    logError(nettySession, "multiple logon to same session, disconnecting", null);
                    nettySession.close();
                } else {
                    logInfo(nettySession, "connection established; resuming session");
                    quickFixSessionsByNettySession.put(nettySession, quickFixSession);
                    quickFixSession.setResponder(new ResponderAdapter(nettySession));
                }
            }
        }

        public void messageReceived(Session nettySession, Message message) {
            super.messageReceived(nettySession, message);
            logDebug(nettySession, "messageReceived");
            quickfix.Session quickFixSession = getQuickFixSession(nettySession);
            if (quickFixSession == null) {
                logDebug(nettySession, "no QuickFIX session for processing message, ignoring.");
                return;
            }
            FIXMessageData fixMessageData = (FIXMessageData) message;
            try {
                quickFixSession.getState().logIncoming(fixMessageData.toString());
                quickfix.Message fixMessage = fixMessageData.parse(quickFixSession
                        .getDataDictionary());
                if (fixMessage.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                    if (fixMessage.isSetField(HeartBtInt.FIELD)) {
                        int heartbeatInterval = fixMessage.getInt(HeartBtInt.FIELD);
                        nettySession.getConfig().setIdleTime(heartbeatInterval);
                        quickFixSession.getState().setHeartBeatInterval(heartbeatInterval);
                    }
                }
                quickFixSession.next(fixMessage);
            } catch (Throwable e) {
                e.printStackTrace();
                quickfix.Log sessionLog = quickFixSession.getLog();
                LogUtil.logThrowable(sessionLog, "error while receiving message", e);
                if (fixMessageData.isLogon()) {
                    try {
                        quickFixSession.disconnect();
                    } catch (IOException e1) {
                        LogUtil.logThrowable(sessionLog, "error during disconnect", e);
                    }
                }
            }
        }

        public void connectionClosed(Session nettySession) {
            logInfo(nettySession, "connection closed");
            super.connectionClosed(nettySession);
            quickfix.Session quickFixSession = getQuickFixSession(nettySession);
            if (quickFixSession != null) {
                try {
                    quickFixSession.disconnect();
                } catch (IOException e) {
                    LogUtil.logThrowable(quickFixSession.getLog(),
                            "error while closing connection", e);
                }
            }
        }

        private quickfix.Session getQuickFixSession(Session nettySession) {
            return (quickfix.Session) quickFixSessionsByNettySession.get(nettySession);
        }

        private quickfix.Session getQuickFixSession(SessionID sessionID) {
            return (quickfix.Session) quickFixSessionsBySessionID.get(sessionID);
        }

        public void exceptionCaught(Session nettySession, Throwable cause) {
            logInfo(nettySession, "exception caught");
            quickfix.Session quickFixSession = getQuickFixSession(nettySession);
            if (quickFixSession != null) {
                try {
                    LogUtil.logThrowable(quickFixSession.getLog(), cause.getMessage(), cause);
                    quickFixSession.disconnect();
                } catch (IOException e) {
                    LogUtil.logThrowable(quickFixSession.getLog(), e.getMessage(), e);
                }
            } else {
                logError(nettySession, "no session when exception was thrown", cause);
            }
        }

        public void sessionIdle(Session nettySession) {
            logDebug(nettySession, "session idle");
            quickfix.Session quickFixSession = getQuickFixSession(nettySession);
            try {
                quickFixSession.next();
            } catch (IOException e) {
                LogUtil.logThrowable(quickFixSession.getLog(), e.getMessage(), e);
            }
        }

        private void logInfo(Session nettySession, String message) {
            log.info(message + getLogSuffix(nettySession));
        }

        private String getLogSuffix(Session nettySession) {
            return ": sessionID=" + sessionID + ", socket=" + nettySession.getSocketAddressString();
        }

        private void logError(Session nettySession, String message, Throwable t) {
            log.error(message + getLogSuffix(nettySession), t);
        }

        private void logDebug(Session nettySession, String message) {
            log.debug(message + getLogSuffix(nettySession));
        }
        
        private final class ResponderAdapter implements Responder {
            private final Session nettySession;

            private ResponderAdapter(Session nettySession) {
                super();
                this.nettySession = nettySession;
            }

            public boolean send(String data) {
                nettySession.write(new FIXMessageData(data));
                return true;
            }

            public void disconnect() {
                logDebug(nettySession,
                        "removing mapping from Netty to QuickFIX session");
                quickFixSessionsByNettySession.remove(nettySession);
                if (nettySession.isConnected()) {
                    nettySession.close();
                }
            }
        }

    }

}