package quickfix;

import java.io.IOException;
import java.util.Date;

import junit.framework.TestCase;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.fix44.Logon;

/**
 * Note: most session tests are in the form of acceptance tests.
 *
 */
public class SessionTest extends TestCase {
    
    // QFJ-60
    public void testRejectLogon() throws Exception {

        // Create application that rejects all logons
        Application application = new UnitTestApplication() {

            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST");
            }
            
        };
        
        Session session = setUpSession(application);
        SessionState state = session.getState();
        
        assertEquals(false, state.isInitiator());
        assertEquals(false, state.isLogonSent());
        assertEquals(false, state.isLogonReceived());
        assertEquals(false, state.isLogonAlreadySent());
        assertEquals(false, state.isLogonSendNeeded());
        assertEquals(false, state.isLogonTimedOut());
        assertEquals(false, state.isLogoutSent());
        assertEquals(false, state.isLogoutReceived());
        assertEquals(false, state.isLogoutTimedOut());
        
        assertEquals(1, state.getNextSenderMsgSeqNum());
        assertEquals(1, state.getNextTargetMsgSeqNum());

        logonTo(session);
        
        assertEquals(false, state.isLogonSent());
        assertEquals(false, state.isLogonReceived());
        assertEquals(false, state.isLogonAlreadySent());
        assertEquals(false, state.isLogonSendNeeded());
        assertEquals(false, state.isLogonTimedOut());
        assertEquals(false, state.isLogoutSent());
        assertEquals(false, state.isLogoutReceived());
        assertEquals(false, state.isLogoutTimedOut());
        
        assertEquals(2, state.getNextSenderMsgSeqNum());
        assertEquals(2, state.getNextTargetMsgSeqNum());
    }

    private Session setUpSession(Application application) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        Session session = SessionFactoryTestSupport.createSession(sessionID, application, false);
        session.setResponder(new UnitTestResponder());
        return session;
    }

    private void logonTo(Session session) throws FieldNotFound, RejectLogon, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        Logon receivedLogon = new Logon();
        setUpHeader(session.getSessionID(), receivedLogon, true, 1);
        receivedLogon.setInt(HeartBtInt.FIELD, 30);
        session.next(receivedLogon);
    }

    private void setUpHeader(SessionID sessionID, Message message, boolean reversed, int sequence) {
        message.getHeader().setString(TargetCompID.FIELD, reversed ? sessionID.getSenderCompID() : sessionID.getTargetCompID());
        message.getHeader().setString(SenderCompID.FIELD, reversed ? sessionID.getTargetCompID() : sessionID.getSenderCompID());
        message.getHeader().setField(new SendingTime(new Date()));
        message.getHeader().setInt(MsgSeqNum.FIELD, sequence);
    }
    
    private final class UnitTestResponder implements Responder {

        public boolean send(String data) {
            return false;
        }

        public String getRemoteIPAddress() {
            return null;
        }

        public void disconnect() {
        }
    }


}
