package quickfix.test.acceptance;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestSuite;

import org.apache.log4j.Logger;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.MemoryStoreFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.netty.AbstractSocketAcceptor;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

public class ATServer implements Runnable {
    private final Logger log = Logger.getLogger(ATServer.class);
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final Set fixVersions;

    public ATServer(TestSuite suite) {
        fixVersions = new HashSet();
        Enumeration e = suite.tests();
        while (e.hasMoreElements()) {
            fixVersions.add(e.nextElement().toString().substring(0,5));
        }
        log.info("creating sessions for "+fixVersions);
    }

    public void run() {
        try {
            SessionSettings settings = new SessionSettings();
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "ConnectionType", "acceptor");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "SocketAcceptPort", "9877");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "StartTime", "00:00:00");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "EndTime", "00:00:00");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "SenderCompID", "ISLD");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "TargetCompID", "TW");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "ResetOnDisconnect", "Y");
            settings.setString(SessionSettings.DEFAULT_SESSION_ID, "FileStorePath", "data/server");

            SessionID sessionID;

            if (fixVersions.contains("fix40")) {
                sessionID = new SessionID("FIX.4.0", "ISLD", "TW");
                settings.setString(sessionID, "BeginString", "FIX.4.0");
                settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX40.xml");
            }

            if (fixVersions.contains("fix41")) {
                sessionID = new SessionID("FIX.4.1", "ISLD", "TW");
                settings.setString(sessionID, "BeginString", "FIX.4.1");
                settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX41.xml");
            }

            if (fixVersions.contains("fix42")) {
                sessionID = new SessionID("FIX.4.2", "ISLD", "TW");
                settings.setString(sessionID, "BeginString", "FIX.4.2");
                settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX42.xml");
            }

            if (fixVersions.contains("fix43")) {
                sessionID = new SessionID("FIX.4.3", "ISLD", "TW");
                settings.setString(sessionID, "BeginString", "FIX.4.3");
                settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX43.xml");
            }

            if (fixVersions.contains("fix44")) {
                sessionID = new SessionID("FIX.4.4", "ISLD", "TW");
                settings.setString(sessionID, "BeginString", "FIX.4.4");
                settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX44.xml");
            }

            ATApplication application = new ATApplication();
            FileStoreFactory factory = new FileStoreFactory(settings);
            //MemoryStoreFactory factory = new MemoryStoreFactory();
            AbstractSocketAcceptor acceptor = new SocketAcceptor(application, factory, settings,
                    new DefaultMessageFactory());
            acceptor.setLogonPollingTimeout(1000);
            acceptor.start();
            acceptor.waitForInitialization();
            initializationLatch.countDown();
            synchronized (application) {
                try {
                    application.wait();
                } catch (InterruptedException e1) {
                    log.info("server exiting");
                }
            }
        } catch (Throwable e) {
            log.error("error in AT server", e);
        }
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
    }
}