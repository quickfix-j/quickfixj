/**
 * 
 */
package quickfix;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

public class UnitTestApplication implements Application {
    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
    
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
    }

    public void toAdmin(Message message, SessionID sessionId) {
    }

    public void onLogout(SessionID sessionId) {
    }

    public void onLogon(SessionID sessionId) {
    }

    public void onCreate(SessionID sessionId) {
    }
}