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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import net.gleamynode.netty2.EventDispatcher;
import net.gleamynode.netty2.IoProcessor;
import net.gleamynode.netty2.LowLatencyEventDispatcher;
import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.Session;
import net.gleamynode.netty2.SessionListener;
import net.gleamynode.netty2.SessionServer;

import org.apache.commons.logging.Log;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.FieldConvertError;
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
import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.field.converter.IntConverter;
import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentHashMap;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

public abstract class AbstractSocketAcceptor implements Acceptor {
    private final Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private static final String DEFAULT_SESSION_SERVER_NAME = "quickfix-acceptor";
    private static final String DEFAULT_IO_THREAD_PREFIX = "quickfix-io";
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final Map quickfixSessionForNettySession = new ConcurrentHashMap();
    private final Map quickfixSessions = new ConcurrentHashMap();
    private long stopRequestTime;
    private boolean isStopRequested;
    private final SessionSettings settings;
    private final SessionFactory sessionFactory;
    private boolean firstPoll = true;
    private SessionServer nettySessionServer;
    private IoProcessor ioProcessor;

    protected AbstractSocketAcceptor(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    protected AbstractSocketAcceptor(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) {
        this.settings = settings;
        sessionFactory = new SessionFactory(application, messageStoreFactory, logFactory);
    }

    protected abstract void onInitialize(boolean isBlocking);

    protected abstract void onBlock();

    protected abstract void onStart();

    protected abstract void onMessage(Session nettySession, Message message);

    protected abstract boolean onPoll();

    protected abstract void onStop();

    public final void block() throws ConfigError, RuntimeError {
        initialize(true);
        onBlock();
    }

    public final boolean poll() throws ConfigError, RuntimeError {
        if (firstPoll) {
            initialize(true);
            firstPoll = false;
        }

        return onPoll();
    }

    public void start() throws ConfigError, RuntimeError {
        initialize(false);
        onStart();
    }

    public final void stop() {
        stop(false);
    }

    public final void stop(boolean force) {
        Iterator sessionItr = quickfixSessions.values().iterator();
        while (sessionItr.hasNext()) {
            quickfix.Session session = (quickfix.Session)sessionItr.next();
            try {
                session.logout();
            } catch (Throwable e) {
                logError(null, session.getSessionID(), "error during logout", e); 
            }
        }

        if (!force) {
            for ( int second = 1; second <= 10 && isLoggedOn(); ++second )
                try {
                    Thread.sleep( 1 );
                } catch (InterruptedException e) {
                    log.error(e);
                }
        }
        
        ioProcessor.stop();
        nettySessionServer.stop();
        stopRequestTime = System.currentTimeMillis();
        isStopRequested = true;
    }

    protected long getStopRequestTime() {
        return stopRequestTime;
    }
    
    protected boolean isStopRequested() {
        return isStopRequested;
    }

    private void initialize(boolean handleMessageInCaller) throws ConfigError {
        try {
            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                Object sectionKey = i.next();
                if (sectionKey != SessionSettings.DEFAULT_SESSION_ID) {
                    SessionID sessionID = (SessionID) sectionKey;
                    String connectionType = settings.getString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE);
                    if (connectionType.equals(SessionFactory.ACCEPTOR_CONNECTION_TYPE)) {
                        quickfixSessions.put(sessionID, sessionFactory.create(sessionID, settings));
                    }
                }
            }

            onInitialize(handleMessageInCaller);

            EventDispatcher eventDispatcher = new LowLatencyEventDispatcher();
            ioProcessor = new IoProcessor();
            ioProcessor.setThreadNamePrefix(DEFAULT_IO_THREAD_PREFIX);
            ioProcessor.setThreadPoolSize(1);
            ioProcessor.start();

            int acceptPort = getIntSetting(Acceptor.SETTING_SOCKET_ACCEPT_PORT);
            InetSocketAddress socketAddress;
            if (settings.isSetting(SessionSettings.DEFAULT_SESSION_ID,
                    SETTING_SOCKET_ACCEPT_ADDRESS)) {
                socketAddress = new InetSocketAddress(settings.getString(
                        SessionSettings.DEFAULT_SESSION_ID, SETTING_SOCKET_ACCEPT_ADDRESS),
                        acceptPort);
            } else {
                socketAddress = new InetSocketAddress(acceptPort);
            }

            // Create Netty session server
            nettySessionServer = new SessionServer();
            nettySessionServer.setIoProcessor(ioProcessor);
            nettySessionServer.setEventDispatcher(eventDispatcher);
            nettySessionServer.setMessageRecognizer(FIXMessageData.RECOGNIZER);
            nettySessionServer.addSessionListener(new AcceptorSessionListener());
            nettySessionServer.setBindAddress(socketAddress);
            nettySessionServer.setThreadName(DEFAULT_SESSION_SERVER_NAME);
            nettySessionServer.start();
            log.info("listening for connections on port " + acceptPort);
            initializationLatch.countDown();
        } catch (FieldConvertError e) {
            throw new ConfigError(e);
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
    }

    private int getIntSetting(String key) throws ConfigError {
        try {
            return IntConverter
                    .convert(settings.getString(SessionSettings.DEFAULT_SESSION_ID, key));
        } catch (FieldConvertError e) {
            throw (ConfigError) new ConfigError(e.getMessage()).fillInStackTrace();
        }
    }

    private quickfix.Session getQuickFixSession(Session nettySession) {
        return (quickfix.Session) quickfixSessionForNettySession.get(nettySession);
    }

    private class AcceptorSessionListener implements SessionListener {

        public void connectionEstablished(Session nettySession) {
            logDebug(nettySession, null, "connection established");
        }

        public void connectionClosed(Session nettySession) {
            logDebug(nettySession, null, "connection closed");
            quickfix.Session quickfixSession = getQuickFixSession(nettySession);
            if (quickfixSession != null) {
                logDebug(nettySession, quickfixSession.getSessionID(),
                        "unbinding and disconnecting session");
                try {
                    quickfixSessionForNettySession.remove(nettySession);
                    quickfixSession.disconnect();
                } catch (IOException e) {
                    exceptionCaught(nettySession, e);
                }
            }
        }

        public void sessionIdle(Session nettySession) {
            logDebug(nettySession, null, "connection idle");
            quickfix.Session quickfixSession = getQuickFixSession(nettySession);
            if (quickfixSession != null) {
                logDebug(nettySession, quickfixSession.getSessionID(), "connection idle");
                try {
                    quickfixSession.next();
                } catch (IOException e) {
                    exceptionCaught(nettySession, e);
                }
            } else {
                logDebug(nettySession, null, "connection idle, no QF session");
            }
        }

        public void messageReceived(Session nettySession, Message message) {
            try {
                onMessage(nettySession, message);
            } catch (Throwable e) {
                exceptionCaught(nettySession, e);
            }
        }

        public void exceptionCaught(Session nettySession, Throwable cause) {
            logDebug(nettySession, null, "connection exception");
            quickfix.Session quickFixSession = getQuickFixSession(nettySession);
            if (quickFixSession != null) {
                try {
                    LogUtil.logThrowable(quickFixSession.getLog(), cause.getMessage(), cause);
                    quickFixSession.disconnect();
                } catch (IOException e) {
                    LogUtil.logThrowable(quickFixSession.getLog(), e.getMessage(), e);
                }
            } else {
                logError(nettySession, null, "connection exception, no bound session", cause);
                nettySession.close();
            }
        }

        public void messageSent(Session nettySession, Message message) {
            logDebug(nettySession, null, "sent message");
        }
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

    protected quickfix.Session getQuickFixSession(Session nettySession, Message message) {
        quickfix.Session quickfixSession = getQuickFixSession(nettySession);
        if (quickfixSession == null) {
            // No QF session for this Netty session, 
            SessionID sessionID = getSessionID(message, true);
            quickfixSession = (quickfix.Session) quickfixSessions.get(sessionID);
            if (quickfixSession != null) {
                ResponderAdapter r = (ResponderAdapter) quickfixSession.getResponder();
                if (r != null) {
                    // QF session is bound to another Netty session. Not allowed.
                    logError(nettySession, sessionID,
                            "session with multiple connections not allowed", null);
                    nettySession.close();
                    return null;
                }
            }
        }
        if (quickfixSession == null) {
            logError(nettySession, null, "unknown QF session ID", null);
            nettySession.close();
            return null;
        }
        return quickfixSession;
    }

    protected void processMessage(Session nettySession, Message message) {
        logDebug(nettySession, null, "received message");
        quickfix.Session quickfixSession = getQuickFixSession(nettySession, message);
        if (quickfixSession == null) {
            return;
        }

        try {
            FIXMessageData fixMessageData = (FIXMessageData) message;
            quickfixSession.getState().logIncoming(fixMessageData.toString());
            DataDictionary dataDictionary = quickfixSession.getDataDictionary();
            fixMessageData.setSession(quickfixSession);
            quickfix.Message fixMessage = fixMessageData.parse(dataDictionary);

            try {
                if (fixMessage.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                    if (fixMessage.isSetField(HeartBtInt.FIELD)) {
                        int heartbeatInterval = fixMessage.getInt(HeartBtInt.FIELD);
                        nettySession.getConfig().setIdleTime(heartbeatInterval);
                        quickfixSession.getState().setHeartBeatInterval(heartbeatInterval);
                        if (log.isDebugEnabled()) {
                            logDebug(nettySession, quickfixSession.getSessionID(),
                                    "heartbeat/idle=" + heartbeatInterval);
                        }
                    }
                    quickfixSessionForNettySession.put(nettySession, quickfixSession);
                    ResponderAdapter responderAdapter = new ResponderAdapter(nettySession);
                    quickfixSession.setResponder(responderAdapter);
                    logDebug(nettySession, quickfixSession.getSessionID(), "session bound");
                }
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
            LogUtil.logThrowable(quickfixSession.getLog(), "error during disconnect", e);
        }
    }

    private final class ResponderAdapter implements Responder {
        private final Session nettySession;

        private ResponderAdapter(Session nettySession) {
            this.nettySession = nettySession;
        }

        public boolean send(String data) {
            // TODO PERFORMANCE pool the FIXMessageData objects
            nettySession.write(new FIXMessageData(data));
            return true;
        }

        public void disconnect() {
            logDebug(nettySession, null, "session unbound");
            quickfixSessionForNettySession.remove(nettySession);
            nettySession.close();
        }

        public Session getNettySession() {
            return nettySession;
        }
    }

    private SessionID getSessionID(Message message, boolean reverse) {
        String targetCompID = null;
        String senderCompID = null;
        // data is cached in message
        String messageData = message.toString();
        // skip known header bytes
        for (int i = 13; i < messageData.length() && targetCompID == null || senderCompID == null; i++) {
            if (startsWith(messageData, i, "56=")) {
                targetCompID = getValue(messageData, i + 3);
            } else if (startsWith(messageData, i, "49=")) {
                senderCompID = getValue(messageData, i + 3);
            }
        }
        return new SessionID(messageData.substring(2, 9), (reverse ? targetCompID : senderCompID),
                (reverse ? senderCompID : targetCompID));
    }

    private boolean startsWith(String messageData, int offset, String prefix) {
        for (int i = 0; i < prefix.length(); i++) {
            int dataOffset = offset + i;
            if (dataOffset > messageData.length()) {
                return false;
            }
            if (messageData.charAt(dataOffset) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private String getValue(String messageData, int offset) {
        int i = offset;
        while (i < messageData.length() && messageData.charAt(i) != '\001') {
            i++;
        }
        return messageData.substring(offset, i);
    }

    public boolean isLoggedOn() {
        Iterator sessionItr = quickfixSessions.values().iterator();
        while (sessionItr.hasNext()) {
            quickfix.Session s = (quickfix.Session) sessionItr.next();
            if (s.isLoggedOn()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList getSessions() {
        return new ArrayList(quickfixSessions.values());
    }
}