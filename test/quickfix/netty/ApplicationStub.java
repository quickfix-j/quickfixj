
package quickfix.netty;

import org.apache.log4j.Logger;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

public class ApplicationStub implements Application {
    private final Logger log = Logger.getLogger(ApplicationStub.class);

    public void onCreate(SessionID sessionId) {
        log.info("onCreate(sessionId = " + sessionId + ")");
    }

    public void onLogon(SessionID sessionId) {
        log.info("onLogon(sessionId = " + sessionId + ")");
    }

    public void onLogout(SessionID sessionId) {
        log.info("onLogout(sessionId = " + sessionId + ")");
    }

    public void toAdmin(quickfix.Message message, SessionID sessionId) {
        log.info("toAdmin(message = " + message + ", sessionId = " + sessionId + ")");
    }

    public void toApp(quickfix.Message message, SessionID sessionId) throws DoNotSend {
        log.info("toApp(message = " + message + ", sessionId = " + sessionId + ")");
    }

    public void fromAdmin(quickfix.Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        log.info("fromAdmin(message = " + message + ", sessionId = " + sessionId + ")");
    }

    public void fromApp(quickfix.Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        log.info("fromApp(message = " + message + ", sessionId = " + sessionId + ")");
    }
}
