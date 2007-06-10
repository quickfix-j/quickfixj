package quickfix;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

import junit.framework.TestCase;
import quickfix.field.Headline;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.fix44.Logon;
import quickfix.fix44.News;
import quickfix.fix44.TestRequest;

/**
 * Note: most session tests are in the form of acceptance tests.
 *
 */
public class SessionTest extends TestCase {

    // QFJ-60
    public void testRejectLogon() throws Exception {

        // Create application that rejects all logons
        Application application = new UnitTestApplication() {

            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST");
            }

        };

        Session session = setUpSession(application);
        SessionState state = getSessionState(session);

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

    public void testSequenceRollbackOnCallbackException() throws Exception {

        // Create application that rejects all logons
        Application application = new UnitTestApplication() {

            public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new RuntimeException("TEST");
            }

            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                if (message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                    return;
                }
                throw new RuntimeException("TEST");
            }

        };

        Session session = setUpSession(application);
        SessionState state = getSessionState(session);

        logonTo(session);
        assertEquals(2, state.getNextSenderMsgSeqNum());
        assertEquals(2, state.getNextTargetMsgSeqNum());

        processMessage(session, createAppMessage(2));

        assertEquals(2, state.getNextSenderMsgSeqNum());
        assertEquals(2, state.getNextTargetMsgSeqNum());

        // To avoid resendRequest
        state.setNextTargetMsgSeqNum(3);
        
        processMessage(session, createAdminMessage(3));

        assertEquals(2, state.getNextSenderMsgSeqNum());
        assertEquals(3, state.getNextTargetMsgSeqNum());
}

    private void processMessage(Session session, Message message) throws FieldNotFound, RejectLogon, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        try {
            session.next(message);
        } catch (Throwable e) {
            // This simulated the behavior of the QFJ connectors
            // The will just discard a message with an error (without
            // incrementing the sequence number).
        }
    }

    private Message createAdminMessage(int sequence) {
        TestRequest msg = new TestRequest(new TestReqID("ID"));
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return msg;
    }

    public void testDontCatchErrorsFromCallback() throws Exception {

        // Create application that rejects all logons
        Application application = new UnitTestApplication() {

            public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new Error("TEST");
            }

        };

        Session session = setUpSession(application);
        logonTo(session);

        try {
            session.next(createAppMessage(2));
            fail("No error thrown");
        } catch (Error e) {
            assertEquals("TEST", e.getMessage());
        }
    }

    private News createAppMessage(int sequence) {
        News news = new News(new Headline("Headline"));
        news.getHeader().setString(SenderCompID.FIELD, "TARGET");
        news.getHeader().setString(TargetCompID.FIELD, "SENDER");
        news.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        news.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return news;
    }

    private SessionState getSessionState(Session session) throws NoSuchFieldException,
            IllegalAccessException {
        Field stateField = session.getClass().getDeclaredField("state");
        stateField.setAccessible(true);
        SessionState state = (SessionState) stateField.get(session);
        return state;
    }

    /** Veifies that the session has been registered before the logger tries accessing it
     * Use case:
     *  JdbcLogger not setup correctly, barfs during Session creation, tries to log and
     * can't find the session in global session list yet
     */
    public void testSessionRegisteredCorrectly() throws Exception {
        SessionSettings settings = SessionSettingsTest.setUpSession(null);
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        JdbcTestSupport.setHypersonicSettings(settings);
        // do not initialize the SQL tables so that the JdbcLog will fail
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER-sessionRegister",
                "TARGET-sessionRegister");
        settings.setString(sessionID, "ConnectionType", "acceptor");
        DefaultSessionFactory factory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new JdbcLogFactory(settings));
        try {
            Session session = factory.create(sessionID, settings);
            assertNotNull(session);
        } catch (NullPointerException nex) {
            fail("Session not registering correctly so JdbcLog fails while printing an error: "
                    + nex.getMessage());
        }
    }

    private Session setUpSession(Application application) throws NoSuchFieldException,
            IllegalAccessException {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        Session session = SessionFactoryTestSupport.createSession(sessionID, application, false);
        session.setResponder(new UnitTestResponder());
        SessionState state = getSessionState(session);
        assertEquals(false, state.isInitiator());
        assertEquals(false, state.isLogonSent());
        assertEquals(false, state.isLogonReceived());
        assertEquals(false, state.isLogonAlreadySent());
        assertEquals(false, state.isLogonSendNeeded());
        assertEquals(false, state.isLogonTimedOut());
        assertEquals(false, state.isLogoutSent());
        assertEquals(false, state.isLogoutReceived());
        assertEquals(false, state.isLogoutTimedOut());
        return session;
    }

    private void logonTo(Session session) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        Logon receivedLogon = new Logon();
        setUpHeader(session.getSessionID(), receivedLogon, true, 1);
        receivedLogon.setInt(HeartBtInt.FIELD, 30);
        session.next(receivedLogon);
    }

    private void setUpHeader(SessionID sessionID, Message message, boolean reversed, int sequence) {
        message.getHeader().setString(TargetCompID.FIELD,
                reversed ? sessionID.getSenderCompID() : sessionID.getTargetCompID());
        message.getHeader().setString(SenderCompID.FIELD,
                reversed ? sessionID.getTargetCompID() : sessionID.getSenderCompID());
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
