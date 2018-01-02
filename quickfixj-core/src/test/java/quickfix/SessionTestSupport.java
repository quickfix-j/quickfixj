package quickfix;

import quickfix.field.*;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.News;

import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SessionTestSupport {

    static void logonTo(Session session) throws FieldNotFound, RejectLogon,
        IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType,
        IOException, InvalidMessage {
        logonTo(session, 1);
    }

    static void logonTo(Session session, int sequence) throws FieldNotFound,
        RejectLogon, IncorrectDataFormat, IncorrectTagValue,
        UnsupportedMessageType, IOException, InvalidMessage {
        final Logon receivedLogon = new Logon();
        setUpHeader(session.getSessionID(), receivedLogon, true, sequence);
        receivedLogon.setInt(HeartBtInt.FIELD, 30);
        receivedLogon.setInt(EncryptMethod.FIELD, 0);
        receivedLogon.toString();   // calculate length and checksum
        session.next(receivedLogon);
    }

    static void logoutFrom(Session session, int sequence)
        throws FieldNotFound, RejectLogon, IncorrectDataFormat,
        IncorrectTagValue, UnsupportedMessageType, IOException,
        InvalidMessage {
        final Logout receivedLogout = new Logout();
        setUpHeader(session.getSessionID(), receivedLogout, true, sequence);
        session.next(receivedLogout);
    }

    static void setUpHeader(SessionID sessionID, Message message,
                             boolean reversed, int sequence) {
        message.getHeader().setString(
            TargetCompID.FIELD,
            reversed ? sessionID.getSenderCompID() : sessionID
                .getTargetCompID());
        message.getHeader().setString(
            SenderCompID.FIELD,
            reversed ? sessionID.getTargetCompID() : sessionID
                .getSenderCompID());
        message.getHeader().setField(new SendingTime(SystemTime.getLocalDateTime()));
        message.getHeader().setInt(MsgSeqNum.FIELD, sequence);
    }

    static Message createPossDupAppMessage(int sequence) {
        // create a regular app message and and add the PossDup
        // and OrigSendingTime tags to it
        final News news = createAppMessage(sequence);
        news.getHeader().setBoolean(PossDupFlag.FIELD, true);
        try {
            LocalDateTime d = news.getHeader().getUtcTimeStamp(SendingTime.FIELD);
            news.getHeader().setUtcTimeStamp(OrigSendingTime.FIELD,
                d.minus(1L, ChronoUnit.HOURS));
        } catch (FieldNotFound e) {
            throw new RuntimeException();
        }
        return news;
    }

    static Session setUpSession(Application application, boolean isInitiator,
                                 Responder responder) throws NoSuchFieldException,
        IllegalAccessException {
        final SessionID sessionID = new SessionID(
            FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(
            sessionID, application, isInitiator);
        session.setResponder(responder);
        final SessionState state = getSessionState(session);
        assertEquals(isInitiator, state.isInitiator());
        assertFalse(state.isLogonSent());
        assertFalse(state.isLogonReceived());
        assertFalse(state.isLogonAlreadySent());
        assertEquals(isInitiator, state.isLogonSendNeeded());
        assertFalse(state.isLogonTimedOut());
        assertFalse(state.isLogoutSent());
        assertFalse(state.isLogoutReceived());
        assertFalse(state.isLogoutTimedOut());
        return session;
    }

    static SessionState getSessionState(Session session)
        throws NoSuchFieldException, IllegalAccessException {
        final Field stateField = session.getClass().getDeclaredField("state");
        stateField.setAccessible(true);
        return (SessionState) stateField.get(session);
    }

    static Session setUpFileStoreSession(Application application,
                                          boolean isInitiator, Responder responder, SessionSettings settings,
                                          SessionID sessionID) throws NoSuchFieldException,
        IllegalAccessException, ConfigError, FieldConvertError, IOException {

        final SessionSchedule sessionSchedule = new DefaultSessionSchedule(settings,
            sessionID);
        final Session session = SessionFactoryTestSupport
            .createFileStoreSession(sessionID, application, isInitiator,
                settings, sessionSchedule);
        session.setResponder(responder);
        final SessionState state = getSessionState(session);
        assertEquals(isInitiator, state.isInitiator());
        assertFalse(state.isLogonSent());
        assertFalse(state.isLogonReceived());
        assertFalse(state.isLogonAlreadySent());
        assertEquals(isInitiator, state.isLogonSendNeeded());
        assertFalse(state.isLogonTimedOut());
        assertFalse(state.isLogoutSent());
        assertFalse(state.isLogoutReceived());
        assertFalse(state.isLogoutTimedOut());
        return session;
    }

    static Message createLogonResponse(final SessionID sessionID,
                                        final Message logonRequest, int responseSequenceNumber)
        throws FieldNotFound {
        final Message logonResponse = new DefaultMessageFactory().create(
            sessionID.getBeginString(), MsgType.LOGON);
        logonResponse.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
        logonResponse.setInt(HeartBtInt.FIELD,
            logonRequest.getInt(HeartBtInt.FIELD));
        final Message.Header header = logonResponse.getHeader();
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        header.setInt(MsgSeqNum.FIELD, responseSequenceNumber);
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getLocalDateTime(), UtcTimestampPrecision.MILLIS);
        return logonResponse;
    }

    static News createAppMessage(int sequence) {
        final News news = new News(new Headline("Headline"));
        news.getHeader().setString(SenderCompID.FIELD, "TARGET");
        news.getHeader().setString(TargetCompID.FIELD, "SENDER");
        news.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        news.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        News.LinesOfText linesOfText = new News.LinesOfText();
        linesOfText.set(new Text("Line 1"));
        news.addGroup(linesOfText);
        return news;
    }


    public static class UnitTestResponder implements Responder {
        public String sentMessageData;
        public boolean disconnectCalled;

        @Override
        public boolean send(String data) {
            sentMessageData = data;
            return true;
        }

        @Override
        public String getRemoteAddress() {
            return null;
        }

        @Override
        public void disconnect() {
            disconnectCalled = true;
        }
    }
}
