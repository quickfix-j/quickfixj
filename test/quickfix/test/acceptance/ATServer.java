package quickfix.test.acceptance;

import org.apache.log4j.Logger;

import quickfix.Acceptor;
import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public class ATServer implements Runnable {
    private final Logger log = Logger.getLogger(ATServer.class);

    public static void main(String[] args) throws Exception {
        new ATServer().run();
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

//            sessionID = new SessionID("FIX.4.0", "ISLD", "TW");
//            settings.setString(sessionID, "BeginString", "FIX.4.0");
//            settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX40.xml");
//
//            sessionID = new SessionID("FIX.4.1", "ISLD", "TW");
//            settings.setString(sessionID, "BeginString", "FIX.4.1");
//            settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX41.xml");

            sessionID = new SessionID("FIX.4.2", "ISLD", "TW");
            settings.setString(sessionID, "BeginString", "FIX.4.2");
            settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX42.xml");
            
//            sessionID = new SessionID("FIX.4.3", "ISLD", "TW");
//            settings.setString(sessionID, "BeginString", "FIX.4.3");
//            settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX43.xml");
//
//            sessionID = new SessionID("FIX.4.4", "ISLD", "TW");
//            settings.setString(sessionID, "BeginString", "FIX.4.4");
//            settings.setString(sessionID, "DataDictionary", "src/quickfix/codegen/FIX44.xml");

            ATApplication application = new ATApplication();
            FileStoreFactory factory = new FileStoreFactory(settings);
            Acceptor acceptor = new SocketAcceptor(application, factory, settings,
                    new DefaultMessageFactory());
            acceptor.start();

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
}