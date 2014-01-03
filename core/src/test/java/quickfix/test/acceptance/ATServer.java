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

package quickfix.test.acceptance;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import junit.framework.Assert;
import junit.framework.TestSuite;

import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.MessageStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.ThreadedSocketAcceptor;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.acceptor.AbstractSocketAcceptor;
import quickfix.mina.ssl.SSLSupport;

public class ATServer implements Runnable {
    private final Logger log = LoggerFactory.getLogger(ATServer.class);
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final CountDownLatch tearDownLatch = new CountDownLatch(1);
    private final Set<String> fixVersions = new HashSet<String>();
    private final SessionSettings settings = new SessionSettings();
    private boolean resetOnDisconnect;
    private boolean usingMemoryStore;
    private AbstractSocketAcceptor acceptor;
    private int transportType = ProtocolFactory.SOCKET;
    private int port = 9877;
    private boolean threaded;
    private IoFilterChainBuilder ioFilterChainBuilder;
    private boolean useSSL;
    private String keyStoreName;
    private String keyStorePassword;
    private Map<Object, Object> overridenProperties = null;
    
    public ATServer() {
        // defaults
    }

    public ATServer(TestSuite suite, boolean threaded, int transportType, int port) {
        this(suite, threaded, transportType, port, null);
    }
    
    public ATServer(TestSuite suite, boolean threaded, int transportType, int port, Map<Object, Object> overridenProperties) {
        this.threaded = threaded;
        this.overridenProperties = overridenProperties;
        this.transportType = transportType;
        this.port = port;
        Enumeration<junit.framework.Test> e = suite.tests();
        while (e.hasMoreElements()) {
            fixVersions.add(e.nextElement().toString().substring(0, 5));
        }
        resetOnDisconnect = true;
        log.info("creating sessions for " + fixVersions);
    }
    
    public void run() {
        try {
            HashMap<Object, Object> defaults = new HashMap<Object, Object>();
            defaults.put("ConnectionType", "acceptor");
            defaults.put("SocketAcceptProtocol", ProtocolFactory.getTypeString(transportType));
            defaults.put("SocketAcceptPort", Integer.toString(port));
            defaults.put("SocketTcpNoDelay", "Y");
            defaults.put("StartTime", "00:00:00");
            defaults.put("EndTime", "00:00:00");
            defaults.put("SenderCompID", "ISLD");
            defaults.put("TargetCompID", "TW");
            defaults.put("JdbcDriver", "com.mysql.jdbc.Driver");
            defaults.put("JdbcURL", "jdbc:mysql://localhost/quickfix");
            defaults.put("JdbcUser", "quickfixj");
            defaults.put("JdbcPassword", "quickfixj");
            if (useSSL) {
                defaults.put("SocketUseSSL", "Y");
            }
            if (keyStoreName != null) {
                defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, keyStoreName);
            }
            if (keyStorePassword != null) {
                defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, keyStorePassword);
            }
            if (resetOnDisconnect) {
                defaults.put("ResetOnDisconnect", "Y");
            }
            defaults.put("FileStorePath", "output/data/server");
            defaults.put("ValidateUserDefinedFields", "Y");
            // New for FIXT/FIX5
            defaults.put("DefaultApplVerID", "7");
            if (overridenProperties != null) defaults.putAll(overridenProperties);
            
            settings.set(defaults);

            if (fixVersions.contains("fix40")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIX40);
            }

            if (fixVersions.contains("fix41")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIX41);
            }

            if (fixVersions.contains("fix42")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIX42);
            }

            if (fixVersions.contains("fix43")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIX43);
            }

            if (fixVersions.contains("fix44")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIX44);
            }
            
            if (fixVersions.contains("fix50")) {
                acceptFixVersion(FixVersions.BEGINSTRING_FIXT11);
            }

            ATApplication application = new ATApplication();
            MessageStoreFactory factory = usingMemoryStore
                    ? (MessageStoreFactory) new MemoryStoreFactory()
                    : new FileStoreFactory(settings);
            //MessageStoreFactory factory = new JdbcStoreFactory(settings);
            //LogFactory logFactory = new CommonsLogFactory(settings);
            quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
            //quickfix.LogFactory logFactory = new JdbcLogFactory(settings);
            if (threaded) {
                acceptor = new ThreadedSocketAcceptor(application, factory, settings, logFactory,
                        new DefaultMessageFactory());
            } else {
                acceptor = new SocketAcceptor(application, factory, settings, logFactory,
                        new DefaultMessageFactory());
            }
            assertSessionIds();

            acceptor.setIoFilterChainBuilder(ioFilterChainBuilder);
            acceptor.start();

            assertSessionIds();

            initializationLatch.countDown();
            CountDownLatch shutdownLatch = new CountDownLatch(1);
            try {
                shutdownLatch.await();
            } catch (InterruptedException e1) {
                try {
                    acceptor.stop(true);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                } finally {
                    tearDownLatch.countDown();
                }
                log.info("server exiting");
            }
        } catch (Throwable e) {
            log.error("error in AT server", e);
        }
    }

    private void assertSessionIds() {
        // This is a strange place for this test, but it wasn't convenient
        // to put it elsewhere. Bug #153
        ArrayList<SessionID> sessionIDs = acceptor.getSessions();
        for (int i = 0; i < sessionIDs.size(); i++) {
            Assert.assertTrue(sessionIDs.get(i) instanceof SessionID);
        }
    }

    public void acceptFixVersion(String beginString) {
        SessionID sessionID = new SessionID(beginString, "ISLD", "TW");
        settings.setString(sessionID, "BeginString", beginString);
        //        settings.setString(sessionID, "DataDictionary", "etc/" + beginString.replaceAll("\\.", "")
        //                + ".xml");
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
    }

    public void waitForTearDown() throws InterruptedException {
        tearDownLatch.await();
    }
    
    public void stop() {
        acceptor.stop();
    }

    public void setUsingMemoryStore(boolean usingMemoryStore) {
        this.usingMemoryStore = usingMemoryStore;
    }

    public void setResetOnDisconnect(boolean resetOnDisconnect) {
        this.resetOnDisconnect = resetOnDisconnect;
    }

    public static void main(String[] args) {
        ATServer server = new ATServer();
        server.acceptFixVersion(FixVersions.BEGINSTRING_FIX42);
        server.run();
    }

    public AbstractSocketAcceptor getAcceptor() {
        return acceptor;
    }

    public void setIoFilterChainBuilder(IoFilterChainBuilder builder) {
        ioFilterChainBuilder = builder;
    }

    public void setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
    }

    public void setKeyStoreName(String keyStoreName) {
        this.keyStoreName = keyStoreName;
        
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }
}
