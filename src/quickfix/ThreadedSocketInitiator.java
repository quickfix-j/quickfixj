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

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.util.Iterator;

import net.gleamynode.netty2.IoProcessor;
import net.gleamynode.netty2.Message;
import net.gleamynode.netty2.MessageRecognizer;
import net.gleamynode.netty2.OrderedEventDispatcher;
import net.gleamynode.netty2.Session;
import net.gleamynode.netty2.SessionListener;
import net.gleamynode.netty2.ThreadPooledEventDispatcher;
import quickfix.netty.AbstractSessionListener;
import quickfix.netty.FIXMessageData;

public class ThreadedSocketInitiator implements Initiator {
    private static final int DEFAULT_THREAD_POOL_SIZE = 16;
    private Application application;
    private MessageStoreFactory messageStoreFactory;
    private SessionSettings settings;
    private LogFactory logFactory;
    private MessageFactory messageFactory;
    private int threadPoolSize;

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory) throws ConfigError {
        // This exception is thrown for compatibility reasons
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        initialize(application, messageStoreFactory, settings, logFactory, messageFactory,
                DEFAULT_THREAD_POOL_SIZE);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            LogFactory logFactory, MessageFactory messageFactory, int threadPoolSize) {
        initialize(application, messageStoreFactory, settings, logFactory, messageFactory,
                threadPoolSize);
    }

    public ThreadedSocketInitiator(Application application,
            MessageStoreFactory messageStoreFactory, SessionSettings settings,
            MessageFactory messageFactory) throws ConfigError {
        this(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
    }

    private void initialize(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,
            int threadPoolSize) {
        this.application = application;
        this.messageStoreFactory = messageStoreFactory;
        this.settings = settings;
        this.logFactory = logFactory;
        this.messageFactory = messageFactory;
        this.threadPoolSize = threadPoolSize;
    }

    public void start() throws ConfigError, RuntimeError {
        try {
            IoProcessor ioProcessor = new IoProcessor();
            ThreadPooledEventDispatcher eventDispatcher = new OrderedEventDispatcher();

            ioProcessor.start();

            eventDispatcher.setThreadPoolSize(threadPoolSize);
            eventDispatcher.start();

            for (Iterator i = settings.sectionIterator(); i.hasNext();) {
                Object sectionKey = i.next();
                if (sectionKey instanceof SessionID) {
                    SessionID sessionID = (SessionID) sectionKey;
                    String host = settings
                            .getString(sessionID, SessionSettings.SOCKET_CONNECT_HOST);
                    int port = 0;
                    try {
                        port = (int) settings.getLong(sessionID,
                                SessionSettings.SOCKET_CONNECT_PORT);
                    } catch (ConfigError e) {
                        throw e;
                    } catch (FieldConvertError e) {
                        throw (ConfigError) new ConfigError(e.getMessage()).initCause(e);
                    }
                    // TODO configure reconnect interval

                    DataDictionary dataDictionary = new DataDictionary(new FileInputStream(settings
                            .getString(sessionID, SessionSettings.DATA_DICTIONARY)));
                    SessionSchedule sessionSchedule = null;
                    //                    if (settings.isSetting(sessionID,
                    // SessionSettings.START_TIME)) {
                    //                        
                    //                    }

                    int heartbeatInterval = 30;
                    if (settings.isSetting(sessionID, SessionSettings.HEARTBTINT)) {
                        heartbeatInterval = (int) settings.getLong(sessionID,
                                SessionSettings.HEARTBTINT);
                    }

                    // TODO configure heart beats
                    MessageRecognizer recognizer = FIXMessageData.RECOGNIZER;
                    Session nettySession = new Session(ioProcessor, new InetSocketAddress(host,
                            port), recognizer, eventDispatcher);
                    
                    quickfix.Session quickFixSession = new quickfix.Session(application,
                            messageStoreFactory, sessionID, dataDictionary, sessionSchedule,
                            logFactory, messageFactory, heartbeatInterval);

                    SessionListener sessionListener = new NettySessionResponder(nettySession,
                            quickFixSession);
                    nettySession.addSessionListener(sessionListener);
                    nettySession.start();

                    // TODO determine if this is the correct way to drive the
                    // session
                    quickFixSession.next();
                }

            }
        } catch (Exception e) {
            throw (RuntimeError) new RuntimeError(e.getMessage()).initCause(e);
        }
    }

    public void stop() {
        // TODO review C++ code for stop
        //        for (Iterator i = settings.sectionIterator(); i.hasNext();) {
        //            Object sectionKey = i.next();
        //            if (sectionKey instanceof SessionID) {
        //                quickfix.Session session = quickfix.Session.lookupSession((SessionID)
        // sectionKey);
        //                session.logout();
        //            }
        //        }
    }

    public void block() throws ConfigError, RuntimeError {
        // TODO Auto-generated method stub
    }

    public boolean poll() throws ConfigError, RuntimeError {
        // TODO Auto-generated method stub
        return false;
    }

    private final class NettySessionResponder extends AbstractSessionListener implements Responder {
        private final Session nettySession;
        private DataDictionary dataDictionary;
        private quickfix.Session quickfixSession;

        private NettySessionResponder(Session nettySession, quickfix.Session quickfixSession) {
            this.nettySession = nettySession;
            this.dataDictionary = quickfixSession.getDataDictionary();
            this.quickfixSession = quickfixSession;
        }

        public void connectionEstablished(Session session) {
            super.connectionEstablished(session);
            quickfixSession.setResponder(this);
        }

        public void messageReceived(Session session, Message message) {
            super.messageReceived(session, message);
            FIXMessageData fixMessageData = (FIXMessageData) message;
            try {
                quickfixSession.getState().logIncoming(fixMessageData.toString());
                quickfixSession.next(fixMessageData.parse(dataDictionary));
            } catch (Exception e) {
                LogUtil.logThrowable(quickfixSession.getLog(), "error receiving message", e);
            }
        }

        public boolean send(String data) {
            nettySession.write(new FIXMessageData(data));
            return true;
        }

        public void disconnect() {
            nettySession.close();
        }

        public void sessionIdle(Session session) {
            System.err.println("************** IDLE ***************");
        }
    }
}