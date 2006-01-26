package quickfix.test.acceptance.timer;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.FixVersions;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.MessageStoreFactory;
import quickfix.RejectLogon;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.UnsupportedMessageType;
import quickfix.fix44.ListStatusRequest;
import quickfix.fix44.TestRequest;

/**
 * @author <a href="mailto:jhensley@bonddesk.com">John Hensley</a>
 */
public class TimerTestClient extends MessageCracker implements Application {
    private final Log log = LogFactory.getLog(TimerTestServer.class);
    private final SessionSettings settings = new SessionSettings();
    private boolean stop = false;
    private final Object shutdownLatch = new Object();
    private boolean failed;

    public void crack(Message message, SessionID sessionID) throws UnsupportedMessageType,
            FieldNotFound, IncorrectTagValue {
        super.crack(message, sessionID);
    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
    }

    public void fromApp(Message message, SessionID sessionID) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        crack(message, sessionID);
    }

    public void onCreate(SessionID sessionId) {
    }

    public void onLogon(SessionID sessionId) {
    }

    public void onLogout(SessionID sessionId) {
    }

    public void onMessage(ListStatusRequest message, SessionID sessionID) {
        log.info("got ListStatusRequest");
    }

    private void stop(boolean failed) {
        synchronized (shutdownLatch) {
            stop = true;
            this.failed = failed;
            shutdownLatch.notify();
        }
    }

    public void run() throws ConfigError, SessionNotFound, InterruptedException {
        HashMap defaults = new HashMap();
        defaults.put("ConnectionType", "initiator");
        defaults.put("HeartBtInt", "2");
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", "9888");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("SenderCompID", "TW");
        defaults.put("TargetCompID", "ISLD");
        defaults.put("FileStorePath", "output/data/client");
        defaults.put("ValidateUserDefinedFields", "Y");
        settings.set(defaults);

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "TW", "ISLD");
        settings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        settings.setString(sessionID, "DataDictionary", "etc/"
                + FixVersions.BEGINSTRING_FIX44.replaceAll("\\.", "") + ".xml");

        MessageStoreFactory storeFactory = new MemoryStoreFactory();
        Initiator initiator = new SocketInitiator(this, storeFactory, settings,
                new ScreenLogFactory(settings), new DefaultMessageFactory());
        initiator.start();

        try {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    stop(false);
                }
            }, 5000);

            while (!stop) {
                synchronized (shutdownLatch) {
                    try {
                        shutdownLatch.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }

            if (failed) {
                String message = "TimerTestClient had to send a test request, indicating that the test server was not reliably sending heartbeats.";
                log.error(message);
                throw new RuntimeError(message);
            }
        } finally {
            initiator.stop();
        }
    }

    public void toAdmin(Message message, SessionID sessionId) {
        if (message instanceof TestRequest) {
            stop(true);
        }
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
    }

    public static void main(String[] args) throws ConfigError, SessionNotFound,
            InterruptedException {
        TimerTestClient ttc = new TimerTestClient();
        ttc.run();
    }
}