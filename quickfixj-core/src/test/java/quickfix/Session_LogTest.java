package quickfix;

import static org.mockito.AdditionalMatchers.and;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.SessionFactoryTestSupport.Builder;
import quickfix.SessionTestSupport.UnitTestResponder;
import quickfix.field.*;
import quickfix.fix44.Logon;
import quickfix.fix44.News;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Session_LogTest {

    private static final Logger logger = LoggerFactory.getLogger(Session_LogTest.class);

    private final Log mockLog = mock(TestLog.class, Answers.CALLS_REAL_METHODS);
    private final LogFactory mockLogFactory = mock(LogFactory.class);
    private final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
    private final Message message = createAppMessage(2);

    @Before
    public void setUp() {
        SystemTime.setTimeSource(null);
        when(mockLogFactory.create(sessionID)).thenReturn(mockLog);
        message.getHeader().setInt(BodyLength.FIELD, 123);
        message.getTrailer().setInt(CheckSum.FIELD, 123);
        message.setInt(33, 0);
    }

    @Test
    public void testWhenMessageIsMissingTagAndRejectingInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.getHeader().removeField(49);
        message.setString(123, "abc");

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), and(contains("Rejecting invalid message"), contains("123=abc")));
        String failureReason = "Reject sent for message 2: Required tag missing, field=49";
        verify(mockLog).onErrorEvent(anyString(), eq(failureReason));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq(failureReason));
    }

    @Test
    public void testWhenMessageIsMissingTagAndNotSendingRejectsForInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(false, false);

        message.getHeader().removeField(49);
        message.setString(123, "abc");

        session.next(message);

        String failureReason = "Warn: incoming message with missing field: 49: Required tag missing, field=49";
        verify(mockLog).onErrorEvent(anyString(), and(contains(failureReason), contains("123=abc")));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq(failureReason));
    }

    @Test
    public void testWhenMessageHasUnexpectedTagAndRejectingInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.setString(98, "3");

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), and(contains("Rejecting invalid message: quickfix.FieldException: Tag not" +
            " defined for this message type, field=98"), contains("98=3")));
        verify(mockLog).onInvalidMessage(contains("98=3"), eq("Reject sent for message 2: Tag not" +
            " defined for this message type, field=98"));
    }

    @Test
    public void testWhenMessageHasUnexpectedTagAndNotSendingRejectsForInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(false, false);

        message.setString(98, "3");

        session.next(message);

        String failureReason = "Warn: incoming message with incorrect field: 98=3";
        verify(mockLog).onErrorEvent(anyString(), and(contains(failureReason), contains("98=3")));
        verify(mockLog).onInvalidMessage(contains("98=3"), eq(failureReason));
    }

    @Test
    public void testWhenMessageHasIncorrectTagDataFormatAndRejectingInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.setString(123, "abc");

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), and(contains("Rejecting invalid message: quickfix.IncorrectDataFormat: Incorrect" +
            " data format for value, field=123"), contains("123=abc")));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq("Reject sent for message 2: Incorrect data" +
            " format for value, field=123, value=abc"));
    }

    @Test
    public void testWhenMessageHasIncorrectTagDataFormatAndNotSendingRejectsForInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(false, false);

        message.setString(123, "abc");

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), and(contains("Rejecting invalid message: quickfix.IncorrectDataFormat: Incorrect" +
            " data format for value, field=123"), contains("123=abc")));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq("Reject sent for message 2: Incorrect data" +
            " format for value, field=123, value=abc"));
    }

    @Test
    public void testWhenMessageHasIncorrectTagValueAndRejectingInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.setInt(427, 3);

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), and(contains("Rejecting invalid message: quickfix.IncorrectTagValue: Value is" +
            " incorrect (out of range) for this tag, field=427"), contains("427=3")));
        verify(mockLog).onInvalidMessage(contains("427=3"), eq("Reject sent for message 2: Value is" +
            " incorrect (out of range) for this tag, field=427, value=3"));
    }

    @Test
    public void testWhenMessageHasIncorrectTagValueAndNotSendingRejectsForInvalidMessagesThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(false, false);

        message.setInt(427, 3);

        session.next(message);

        String failureReason = "Warn: incoming message with quickfix.IncorrectTagValue: Value is incorrect (out of" +
            " range) for this tag, field=427, value=3";
        verify(mockLog).onErrorEvent(anyString(), and(contains(failureReason), contains("427=3")));
        verify(mockLog).onInvalidMessage(contains("427=3"), eq(failureReason));
    }

    @Test
    public void testWhenMessageVerificationFailsThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.getHeader().removeField(49);
        message.getHeader().setString(49, "IncorrectSenderCompID");

        session.next(message);

        String failureReason = "Reject sent for message 2: CompID problem";
        verify(mockLog).onErrorEvent(anyString(), eq(failureReason));
        verify(mockLog).onInvalidMessage(contains("49=IncorrectSenderCompID"), eq(failureReason));
    }

    @Test
    public void testWhenRequiredTagMissingAndNotDisconnectingOnErrorThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.getHeader().removeField(BeginString.FIELD);
        message.setString(123, "abc");

        session.next(message);

        String failureReason = "Reject sent for message 2: Conditionally Required Field Missing: tag=8";
        verify(mockLog).onErrorEvent(anyString(), eq(failureReason));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq(failureReason));
    }

    @Test
    public void testWhenRequiredTagMissingAndDisconnectingOnErrorThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, true);

        message.getHeader().removeField(BeginString.FIELD);
        message.setString(123, "abc");

        session.next(message);

        String failureReason = "Encountered invalid message: quickfix.FieldNotFound: Field was not found in message, field=8";
        verify(mockLog).onErrorEvent(anyString(), and(contains("123=abc"), contains(failureReason)));
        verify(mockLog).onInvalidMessage(contains("123=abc"), eq(failureReason));
    }

    @Test
    public void testWhenBeginStringDoesNotMatchSessionAndDisconnectingOnErrorThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, true);

        message.getHeader().removeField(BeginString.FIELD);
        message.getHeader().setString(BeginString.FIELD, "abc");

        session.next(message);

        String failureReason = "Encountered invalid message: quickfix.UnsupportedVersion: Message version 'abc' does" +
            " not match the session version 'FIX.4.4'";
        verify(mockLog).onErrorEvent(anyString(), and(contains("8=abc"), contains(failureReason)));
        verify(mockLog).onInvalidMessage(contains("8=abc"), eq(failureReason));
    }

    @Test
    public void testWhenBeginStringDoesNotMatchSessionAndNotDisconnectingOnErrorThenMessageIsLogged() throws Exception {
        final Session session = createLoggedOnSession(true, false);

        message.getHeader().removeField(BeginString.FIELD);
        message.getHeader().setString(BeginString.FIELD, "abc");

        session.next(message);

        verify(mockLog).onErrorEvent(anyString(), eq("Disconnecting: Incorrect BeginString: quickfix.UnsupportedVersion:" +
            " Message version 'abc' does not match the session version 'FIX.4.4'"));
        verify(mockLog).onInvalidMessage(contains("8=abc"), eq("Incorrect BeginString: Message version 'abc'" +
            " does not match the session version 'FIX.4.4'"));
    }

    private Session createLoggedOnSession(boolean rejectInvalidMessage, boolean disconnectOnError) throws Exception {
        Session session = new Builder()
            .setSessionId(sessionID)
            .setApplication(new UnitTestApplication()).setIsInitiator(false)
            .setDataDictionaryProvider(new DefaultDataDictionaryProvider())
            .setLogFactory(mockLogFactory)
            .setCheckCompID(true)
            .setRejectInvalidMessage(rejectInvalidMessage)
            .setDisconnectOnError(disconnectOnError)
            .build();
        logon(session);
        return session;
    }

    private static void logon(Session session) throws Exception {
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        logonTo(session);
    }

    private static void logonTo(Session session) throws Exception {
        logonTo(session, 1);
    }

    private static void logonTo(Session session, int sequence) throws Exception {
        final Logon receivedLogon = new Logon();
        receivedLogon.getHeader().setInt(BodyLength.FIELD, 123);
        receivedLogon.getTrailer().setInt(CheckSum.FIELD, 123);
        receivedLogon.setInt(EncryptMethod.FIELD, 0);
        setUpHeader(session.getSessionID(), receivedLogon, true, sequence);
        receivedLogon.setInt(HeartBtInt.FIELD, 30);
        session.next(receivedLogon);
    }

    private static void setUpHeader(SessionID sessionID, Message message, boolean reversed, int sequence) {
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

    private static News createAppMessage(int sequence) {
        final News news = new News(new Headline("Headline"));
        news.getHeader().setString(SenderCompID.FIELD, "TARGET");
        news.getHeader().setString(TargetCompID.FIELD, "SENDER");
        news.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        news.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        return news;
    }


    private static class TestLog implements Log {

        @Override
        public void clear() {
            logger.info("clear");
        }

        @Override
        public void onIncoming(String message) {
            logger.info(String.format("onIncoming message = %s", message));
        }

        @Override
        public void onOutgoing(String message) {
            logger.info(String.format("onOutgoing message = %s", message));
        }

        @Override
        public void onEvent(String text) {
            logger.info(String.format("onEvent text = %s", text));
        }

        @Override
        public void onErrorEvent(String category, String text) {
            logger.info(String.format("onErrorEvent text = %s", text));
        }

        @Override
        public void onInvalidMessage(String messageString, String failureReason) {
            logger.info(String.format("onInvalidMessage messageString = %s, failureReason = %s", messageString, failureReason));
        }

        @Override
        public void onDisconnect(String reason) {
            logger.info(String.format("onDisconnect reason = %s", reason));
        }
    }

}
