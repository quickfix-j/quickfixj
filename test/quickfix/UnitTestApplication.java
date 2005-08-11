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
        // TODO Auto-generated method stub
    
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        // TODO Auto-generated method stub
    
    }

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        // TODO Auto-generated method stub
    
    }

    public void toAdmin(Message message, SessionID sessionId) {
        // TODO Auto-generated method stub
    
    }

    public void onLogout(SessionID sessionId) {
        // TODO Auto-generated method stub
    
    }

    public void onLogon(SessionID sessionId) {
        // TODO Auto-generated method stub
    
    }

    public void onCreate(SessionID sessionId) {
        // TODO Auto-generated method stub
    
    }
}