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

import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

import quickfix.field.HeartBtInt;
import quickfix.field.MsgType;
import quickfix.netty.FIXMessageData;

public abstract class AbstractSocketAcceptor implements Acceptor {
    private Log log = org.apache.commons.logging.LogFactory.getLog(getClass());
    private static final String DEFAULT_SESSION_SERVER_NAME = "quickfix-acceptor";
    private static final String DEFAULT_IO_THREAD_PREFIX = "quickfix-io";
    private boolean isStopRequested;
    private final Application application;
    private final SessionSettings settings;
    private final MessageStoreFactory messageStoreFactory;
    private final MessageFactory messageFactory;
    private final LogFactory logFactory;
    private final SessionFactory sessionFactory;
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private long logonPollingTimeout = 5000;
    private long logonPollingPeriod = 500;

    protected AbstractSocketAcceptor(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    protected AbstractSocketAcceptor(Application application,
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
            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                Object sectionKey = i.next();
                if (sectionKey != SessionSettings.DEFAULT_SESSION_ID) {
                    SessionID sessionID = (SessionID) sectionKey;
                    quickfixSessions.put(sessionID, sessionFactory.create(sessionID, settings));
                }
            }

            onInitialize(handleMessageInCaller);
            ioProcessor = new IoProcessor();
            ioProcessor.setThreadNamePrefix(DEFAULT_IO_THREAD_PREFIX);
            EventDispatcher eventDispatcher = new LowLatencyEventDispatcher();

            ioProcessor.setThreadPoolSize(1);
            ioProcessor.start();

            int acceptPort = getIntSetting(SessionSettings.SOCKET_ACCEPT_PORT);

            // Create Netty session server
            nettySessionServer = new SessionServer();
            nettySessionServer.setIoProcessor(ioProcessor);
            nettySessionServer.setEventDispatcher(eventDispatcher);
            nettySessionServer.setMessageRecognizer(FIXMessageData.RECOGNIZER);
            nettySessionServer.addSessionListener(new NettySessionListener());
            nettySessionServer.setBindAddress(new InetSocketAddress(acceptPort));
            nettySessionServer.setThreadName(DEFAULT_SESSION_SERVER_NAME);
            nettySessionServer.start();
            log.info("listening for connections on port " + acceptPort);
            initializationLatch.countDown();
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
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

    private class NettySessionListener implements SessionListener {

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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
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
            // QF session not bound yet, extract Session ID from message
            SessionID sessionID = getSessionID(message, true);
            quickfixSession = (quickfix.Session) quickfixSessions.get(sessionID);
        }
        if (quickfixSession == null) {
            logError(nettySession, null, "invalid QF session ID", null);
            // TODO review disconnect
            nettySession.close();
            return null;
        }
        return quickfixSession;
    }

    public void setLogonPollingTimeout(long logonPollingTimeout) {
        this.logonPollingTimeout = logonPollingTimeout;
    }

    public void setLogonPollingPeriod(long logonPollingPeriod) {
        this.logonPollingPeriod = logonPollingPeriod;
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
            quickfix.Message fixMessage = fixMessageData.parse(dataDictionary);
            //onMessage(nettySession, quickfixSession, fixMessage);

            try {
                if (fixMessage.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                    if (quickfixSession.isLoggedOn()) {
                        for (long i = 0; i < logonPollingTimeout && quickfixSession.isLoggedOn(); i += logonPollingPeriod) {
                            Thread.sleep(logonPollingPeriod);
                        }
                        if (quickfixSession.isLoggedOn()) {
                            logError(nettySession, quickfixSession.getSessionID(),
                                    "multiple logon, disconnecting client", null);
                            nettySession.close();
                            return;
                        }

                    }
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
                    ResponderAdapter responderAdapter = new ResponderAdapter(nettySession,
                            quickfixSession);
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private final class ResponderAdapter implements Responder {
        private final Session nettySession;
        private quickfix.Session quickfixSession;

        private ResponderAdapter(Session nettySession, quickfix.Session quickfixSession) {
            this.nettySession = nettySession;
            this.quickfixSession = quickfixSession;
        }

        public boolean send(String data) {
            // TODO - pool the FIXMessageData objects
            nettySession.write(new FIXMessageData(data));
            return true;
        }

        public void disconnect() {
            logDebug(nettySession, null, "session unbound");
            quickfixSessionForNettySession.remove(nettySession);
            nettySession.close();
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

}