package quickfix.test.acceptance;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;
import junit.framework.TestSuite;

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
import quickfix.mina.acceptor.AbstractSocketAcceptor;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

public class ATServer implements Runnable {
    private final Logger log = LoggerFactory.getLogger(ATServer.class);
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final Set fixVersions = new HashSet();
    private final SessionSettings settings = new SessionSettings();
    private boolean resetOnDisconnect;
    private boolean usingMemoryStore;
    private AbstractSocketAcceptor acceptor;
    private boolean threaded;

    public ATServer(TestSuite suite, boolean threaded) {
        this.threaded = threaded;
        Enumeration e = suite.tests();
        while (e.hasMoreElements()) {
            fixVersions.add(e.nextElement().toString().substring(0, 5));
        }
        resetOnDisconnect = true;
        log.info("creating sessions for " + fixVersions);
    }

    public ATServer() {
        // empty
    }

    public void run() {
        try {
            HashMap defaults = new HashMap();
            defaults.put("ConnectionType", "acceptor");
            defaults.put("SocketAcceptPort", "9877");
            defaults.put("StartTime", "00:00:00");
            defaults.put("EndTime", "00:00:00");
            defaults.put("SenderCompID", "ISLD");
            defaults.put("TargetCompID", "TW");
            if (resetOnDisconnect) {
                defaults.put("ResetOnDisconnect", "Y");
            }
            defaults.put("FileStorePath", "output/data/server");
            defaults.put("ValidateUserDefinedFields", "Y");
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

            ATApplication application = new ATApplication();
            MessageStoreFactory factory = usingMemoryStore
                    ? (MessageStoreFactory) new MemoryStoreFactory()
                    : new FileStoreFactory(settings);
            //LogFactory logFactory = new CommonsLogFactory(settings);
            quickfix.LogFactory logFactory = new ScreenLogFactory(true, true, true);
            if (threaded) {
                acceptor = new ThreadedSocketAcceptor(application, factory, settings, logFactory,
                        new DefaultMessageFactory());
            } else {
                acceptor = new SocketAcceptor(application, factory, settings, logFactory,
                        new DefaultMessageFactory());
            }

            assertSessionIds();

            acceptor.start();

            assertSessionIds();

            initializationLatch.countDown();
            synchronized (application) {
                try {
                    application.wait();
                } catch (InterruptedException e1) {
                    try {
                        acceptor.stop(true);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                    log.info("server exiting");
                }
            }
        } catch (Throwable e) {
            log.error("error in AT server", e);
        }
    }

    private void assertSessionIds() {
        // This is a strange place for this test, but it wasn't convenient
        // to put it elsewhere. Bug #153
        ArrayList sessionIDs = acceptor.getSessions();
        for (int i = 0; i < sessionIDs.size(); i++) {
            Assert.assertTrue(sessionIDs.get(i) instanceof SessionID);
        }
    }

    public void acceptFixVersion(String beginString) {
        SessionID sessionID = new SessionID(beginString, "ISLD", "TW");
        settings.setString(sessionID, "BeginString", beginString);
        settings.setString(sessionID, "DataDictionary", "etc/" + beginString.replaceAll("\\.", "")
                + ".xml");
    }

    public void waitForInitialization() throws InterruptedException {
        initializationLatch.await();
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
}