package quickfix.test.acceptance;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestSuite;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import quickfix.CommonsLogFactory;
import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;
import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;

public class ATServer implements Runnable {
    private final Log log = LogFactory.getLog(ATServer.class);
    private final CountDownLatch initializationLatch = new CountDownLatch(1);
    private final Set fixVersions = new HashSet();
    private final SessionSettings settings = new SessionSettings();
    private boolean resetOnDisconnect;
    private boolean usingMemoryStore;
    private ThreadedSocketAcceptor acceptor;

    public ATServer(TestSuite suite) {
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
            acceptor = new ThreadedSocketAcceptor(application, factory, settings,
                    new CommonsLogFactory(settings), new DefaultMessageFactory());
            acceptor.start();
            //acceptor.waitForInitialization();
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