package quickfix;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import quickfix.field.ApplVerID;
import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.EndSeqNo;
import quickfix.field.GapFillFlag;
import quickfix.field.Headline;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NewSeqNo;
import quickfix.field.NextExpectedMsgSeqNum;
import quickfix.field.OrigSendingTime;
import quickfix.field.PossDupFlag;
import quickfix.field.RefSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.SessionStatus;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.field.Text;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.News;
import quickfix.fix44.Reject;
import quickfix.fix44.ResendRequest;
import quickfix.fix44.SequenceReset;
import quickfix.fix44.TestRequest;
import quickfix.test.util.ReflectionUtil;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import static quickfix.SessionFactoryTestSupport.createSession;

/**
 * Note: most session tests are in the form of acceptance tests.
 */
public class SessionTest {

    @Before
    public void setUp() {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void testDisposalOfFileResources() throws Exception {
        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        final MessageStoreFactory mockMessageStoreFactory = mock(MessageStoreFactory.class);
        final CloseableMessageStore mockMessageStore = mock(CloseableMessageStore.class);
        stub(mockMessageStoreFactory.create(sessionID)).toReturn(
                mockMessageStore);

        final LogFactory mockLogFactory = mock(LogFactory.class);
        final CloseableLog mockLog = mock(CloseableLog.class);
        stub(mockLogFactory.create(sessionID)).toReturn(mockLog);

        try (Session session = new Session(application,
                mockMessageStoreFactory, sessionID, null, null, mockLogFactory,
                new DefaultMessageFactory(), 30, false, 30, UtcTimestampPrecision.MILLIS, true, false,
                false, false, false, false, true, false, 1.5, null, true,
                new int[] { 5 }, false, false, false, false, true, false, true, false,
                null, true, 0, false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false)) {
            // Simulate socket disconnect
            session.setResponder(null);
        }

        verify(mockMessageStore).close();
        verifyNoMoreInteractions(mockMessageStore);

        verify(mockLog, atLeastOnce()).onEvent(anyString());
        verify(mockLog).close();
        verifyNoMoreInteractions(mockLog);
    }

    /**
     * This is a smoke test for handling noncloseable resources. Obviously,
     * these resources should not be closed. If they are, it will generate an
     * error (probably a class cast exception).
     *
     * @throws Exception
     */
    @Test
    public void testNondisposableFileResources() throws Exception {
        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        final MessageStoreFactory mockMessageStoreFactory = mock(MessageStoreFactory.class);
        final MessageStore mockMessageStore = mock(MessageStore.class);
        stub(mockMessageStoreFactory.create(sessionID)).toReturn(
                mockMessageStore);

        final LogFactory mockLogFactory = mock(LogFactory.class);
        final Log mockLog = mock(Log.class);
        stub(mockLogFactory.create(sessionID)).toReturn(mockLog);

        try (Session session = new Session(application,
                mockMessageStoreFactory, sessionID, null, null, mockLogFactory,
                new DefaultMessageFactory(), 30, false, 30, UtcTimestampPrecision.MILLIS, true, false,
                false, false, false, false, true, false, 1.5, null, true,
                new int[] { 5 }, false, false, false, false, true, false, true, false,
                null, true, 0, false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false)) {
            // Simulate socket disconnect
            session.setResponder(null);
            
            verifyNoMoreInteractions(mockMessageStore);
            
            verify(mockLog, atLeastOnce()).onEvent(anyString());
            verifyNoMoreInteractions(mockLog);
        }
    }

    private interface CloseableMessageStore extends MessageStore, Closeable {
    }

    private interface CloseableLog extends Log, Closeable {
    }

    @Test
    public void testSessionWithoutValidateSequenceNumbers() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = createSession(sessionID, application, true,
                true, false)) {

            final UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            
            final Message logonRequest = new Message(responder.sentMessageData);
            session.next(createLogonResponse(sessionID, logonRequest, 1));
            
            assertEquals(
                    1,
                    application.lastToAdminMessage().getHeader()
                            .getInt(MsgSeqNum.FIELD));
            assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(2, session.getStore().getNextSenderMsgSeqNum());
            
            session.next(createHeartbeatMessage(1002));
            assertNotEquals(ResendRequest.MSGTYPE, application
                    .lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            
            session.next(createHeartbeatMessage(1003));
            assertNotEquals(ResendRequest.MSGTYPE, application
                    .lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            
            session.next(createHeartbeatMessage(1001));
            assertNotEquals(ResendRequest.MSGTYPE, application
                    .lastToAdminMessage().getHeader().getString(MsgType.FIELD));
        }
    }

    // QFJ-703
    @Test
    public void testPossDupMessageWithoutOrigSendingTime() throws Exception {

        // test default behaviour, i.e. that the message is rejected
        // when not setting 122/OrigSendingTime
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        UnitTestApplication application = new UnitTestApplication();
        Session session = createSession(sessionID, application, true, true,
                true);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        session.logon();
        session.next();

        Message logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 1));

        assertEquals(
                1,
                application.lastToAdminMessage().getHeader()
                        .getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        News newsMessage = createAppMessage(2);
        newsMessage.getHeader().setBoolean(PossDupFlag.FIELD, true);
        session.next(newsMessage);
        assertEquals(Reject.MSGTYPE, application.lastToAdminMessage()
                .getHeader().getString(MsgType.FIELD));
        assertNull(application.lastFromAppMessage());

        // test that the message is NOT rejected when
        // setting requiresOrigSendingTime=false
        // and not setting 122/OrigSendingTime
        application = new UnitTestApplication();
        session = createSession(sessionID, application, true, true, true);
        responder = new UnitTestResponder();
        session.setRequiresOrigSendingTime(false);

        session.setResponder(responder);

        session.logon();
        session.next();

        logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 1));

        assertEquals(
                1,
                application.lastToAdminMessage().getHeader()
                        .getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        newsMessage = createAppMessage(2);
        newsMessage.getHeader().setBoolean(PossDupFlag.FIELD, true);
        session.next(newsMessage);
        assertEquals(Logon.MSGTYPE, application.lastToAdminMessage()
                .getHeader().getString(MsgType.FIELD));
        assertNull(application.lastToAppMessage());
        assertEquals(News.MSGTYPE, application.lastFromAppMessage()
                .getHeader().getString(MsgType.FIELD));

        session.close();
    }

    @Test
    public void testInferResetSeqNumAcceptedWithNonInitialSequenceNumber()
            throws Exception {

        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = createSession(sessionID, application, true,
                true)) {

            final UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            
            final Message logonRequest = new Message(responder.sentMessageData);
            session.next(createLogonResponse(sessionID, logonRequest, 2));
            
            assertTrue(
                    "Should not infer a reset when the sequence number is not one",
                    responder.disconnectCalled);
        }
    }

    @Test
    public void testInferResetSeqNumAccepted() throws Exception {

        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = createSession(sessionID, application, true,
                true)) {

            final UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            
            final Message logonRequest = new Message(responder.sentMessageData);
            final Message logonResponse = createLogonResponse(sessionID,
                    logonRequest, 1);
            session.next(logonResponse);
            
            assertFalse("Should not disconnect when an accepted reset is inferred",
                    responder.disconnectCalled);
        }
    }

    @Test
    // QFJ-603
    public void testUnsupportedVersion() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = createSession(sessionID, application, true,
                true)) {

            final UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            
            final Message logonRequest = new Message(responder.sentMessageData);
            final Message logonResponse = createLogonResponse(sessionID,
                    logonRequest, 1);
            session.next(logonResponse);
            
            final News newsMessage = createAppMessage(2);
            // set a BeginString unsupported by the session
            newsMessage.getHeader().setString(BeginString.FIELD,
                    FixVersions.BEGINSTRING_FIX40);
            session.next(newsMessage);
            final Message lastToAdminMessage = application.lastToAdminMessage();
            assertEquals(MsgType.LOGOUT,
                    lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals(
                    "Incorrect BeginString: Message version 'FIX.4.0' does not match the session version 'FIX.4.4'",
                    lastToAdminMessage.getString(Text.FIELD));
            assertTrue(responder.disconnectCalled);
        }
    }

    // QFJ-650
    @Test
    public void testLogoutOnMissingMsgSeqNum() throws Exception {

        final Application application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            
            final TestRequest testRequest = (TestRequest) createAdminMessage(2);
            session.next(testRequest);
            
            assertEquals(3, state.getNextSenderMsgSeqNum());
            assertEquals(3, state.getNextTargetMsgSeqNum());
            
            testRequest.getHeader().removeField(MsgSeqNum.FIELD);
            // this should disconnect the session due to the missing MsgSeqNum
            session.next(testRequest);
            assertFalse("Session should be disconnected", session.isLoggedOn());
            
            // make sure that the target seq num has not been incremented
            assertEquals(4, state.getNextSenderMsgSeqNum());
            assertEquals(3, state.getNextTargetMsgSeqNum());
            session.setResponder(new UnitTestResponder());
            logonTo(session, 3);
            assertEquals(5, state.getNextSenderMsgSeqNum());
            assertEquals(4, state.getNextTargetMsgSeqNum());
            assertTrue("Session should be connected", session.isLoggedOn());
        }
    }

    // QFJ-750
    @Test
    public void testLogoutMsgSeqNumTooHighOrLow() throws Exception {

        final Application application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            
            final TestRequest testRequest = (TestRequest) createAdminMessage(2);
            session.next(testRequest);
            
            assertEquals(3, state.getNextSenderMsgSeqNum());
            assertEquals(3, state.getNextTargetMsgSeqNum());
            
            logoutFrom(session, 100);
            assertFalse("Session should be disconnected", session.isLoggedOn());
            
            // make sure that the target seq num has not been incremented
            assertEquals(4, state.getNextSenderMsgSeqNum());
            assertEquals(3, state.getNextTargetMsgSeqNum());
            session.setResponder(new UnitTestResponder());
            logonTo(session, 3);
            assertEquals(5, state.getNextSenderMsgSeqNum());
            assertEquals(4, state.getNextTargetMsgSeqNum());
            assertTrue("Session should be connected", session.isLoggedOn());
            
            logoutFrom(session, 1);
            // make sure that the target seq num has not been incremented
            assertEquals(6, state.getNextSenderMsgSeqNum());
            assertEquals(4, state.getNextTargetMsgSeqNum());
        }
    }

    @Test
    public void testRejectMsgSeqNumTooHighOrLow() throws Exception {

        final Application application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            
            processMessage(session, createReject(2, 100));
            assertEquals(3, state.getNextTargetMsgSeqNum());
            
            // Reject with unexpected seqnum should not increment target seqnum
            processMessage(session, createReject(50, 100));
            assertEquals(3, state.getNextTargetMsgSeqNum());
            
            // Reject with unexpected seqnum should not increment target seqnum
            processMessage(session, createReject(1, 100));
            assertEquals(3, state.getNextTargetMsgSeqNum());
        }
    }

    /**
     * QFJ-357 Until QF/J 1.5.1 the behaviour was observed that a Logout message
     * was always sent as first message. This could be be provoked by altering
     * the Session file to contain an old timestamp and deleting the filestore
     * files to set the sequence numbers to 1. On the next Logon attempt, the
     * Session would get reset and a Logout message would get sent. On versions
     * newer than 1.5.1 this test should pass.
     */
    @Test
    public void testLogonIsFirstMessageOnAcceptor() throws Exception {

        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);

        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpFileStoreSession(application, false,
                new UnitTestResponder(), settings, sessionID)) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            
            // we should only answer with a Logon message
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(MsgType.LOGON, application.toAdminMessages.get(0)
                    .getHeader().getString(MsgType.FIELD));
            
            // no reset should have been triggered by QF/J after the Logon attempt
            assertEquals(0, application.sessionResets);
            assertTrue("Session should be connected", session.isLoggedOn());
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
        }
    }

    // QFJ-773
    @Test
    public void testLogonLogoutOnAcceptor() throws Exception {
        
        final LocalDateTime now = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(now);
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.atOffset(offset).toInstant().toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().minus(100000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime", UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        try (Session session = setUpFileStoreSession(application, false,
                responder, settings, sessionID)) {
            session.addStateListener(application);
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            
            // we should only answer with a Logon message
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(MsgType.LOGON, application.toAdminMessages.get(0)
                    .getHeader().getString(MsgType.FIELD));
            
            // no reset should have been triggered by QF/J after the Logon attempt
            assertEquals(0, application.sessionResets);
            assertTrue("Session should be connected", session.isLoggedOn());
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            
            session.next();
            // increment time to force logout and reset
            systemTimeSource.increment(3700000);
            session.next();
            logoutFrom(session, state.getNextTargetMsgSeqNum());
            assertEquals(SystemTime.getDate(), state.getCreationTime());
            systemTimeSource.increment(10000);
            session.next();
            systemTimeSource.increment(10000);
            session.next();
            systemTimeSource.increment(10000);
            session.next();
            systemTimeSource.increment(10000);
            
            // we should only reset once outside of the session time window
            assertEquals(1, application.sessionResets);
            assertFalse("Session should be disconnected", session.isLoggedOn());
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            session.setResponder(responder);
            // this should get rejected since we are outside of the session time
            // window
            logonTo(session);
            assertFalse("Session should be disconnected", session.isLoggedOn());
            
            // if we now logon to the session, it will be considered new
            // and a reset will be done
            session.setResponder(responder);
            session.next();
            assertEquals(2, application.sessionResets);
            systemTimeSource.increment(86100000); // jump one day but stay inside
            // session time
            session.next();
            logonTo(session);
            assertTrue("Session should be connected", session.isLoggedOn());
            assertEquals(SystemTime.getDate(), state.getCreationTime());
            
            // check that the creation time is not updated inside of the session
            // time window
            int delta = 60000;
            systemTimeSource.increment(delta);
            assertEquals(SystemTime.getDate().getTime()
                    - state.getCreationTime().getTime(), delta);
            session.next();
            assertTrue("Session should be connected", session.isLoggedOn());
        }
    }

    @Test
    // QFJ-716
    public void testStartOfInitiatorOutsideOfSessionTime() throws Exception {
        final LocalDateTime now = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(now);
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.toInstant(offset).toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // we want to start the initiator before the StartTime
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().plus(1800000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime",   UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpFileStoreSession(application, true,
                new UnitTestResponder(), settings, sessionID)) {
            session.addStateListener(application);
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            session.next();
            systemTimeSource.increment(10000);
            session.next();
            systemTimeSource.increment(10000);
            session.next();
            
            // we should send no messages since we are outside of session time
            assertEquals(0, application.toAdminMessages.size());
            // no reset should have been triggered by QF/J (since we were not logged
            // on)
            assertEquals(0, application.sessionResets);
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            // increase time to be within session time
            systemTimeSource.increment(1900000);
            session.next();
            session.next();
            // we should have sent a Logon since the StartTime has been reached now
            assertEquals(1, application.toAdminMessages.size());
            Message logon = application.toAdminMessages.get(0);
            assertEquals(MsgType.LOGON, logon.getHeader().getString(MsgType.FIELD));
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            Message createLogonResponse = createLogonResponse(new SessionID(
                    FixVersions.BEGINSTRING_FIX44, "TARGET", "SENDER"), logon, 1);
            session.next(createLogonResponse);
            assertTrue(session.isLoggedOn());
            assertEquals(1, application.sessionResets);
            
            // increase time to be out of session time
            systemTimeSource.increment(1900000);
            session.next();
            logoutFrom(session, state.getNextTargetMsgSeqNum());
            Message logout = application.lastToAdminMessage();
            assertEquals(MsgType.LOGOUT, logout.getHeader()
                    .getString(MsgType.FIELD));
            assertFalse(session.isLoggedOn());
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            assertEquals(2, application.sessionResets);
        }
    }

    @Test
    // QFJ-716 - we need to make sure that the first message sent is a Logon
    public void testStartOfInitiatorInsideOfSessionTime() throws Exception {

        final LocalDateTime now = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(now);
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.toInstant(offset).toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // we want to start the initiator before the StartTime
        // make sure we start inside the Session time
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().minus(2000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime",   UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpFileStoreSession(application, true,
                new UnitTestResponder(), settings, sessionID)) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            session.next();
            systemTimeSource.increment(1000);
            session.next();
            systemTimeSource.increment(1000);
            session.next();
            
            // we should have sent a Logon since we are inside of the SessionTime
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(MsgType.LOGON, application.toAdminMessages.get(0)
                    .getHeader().getString(MsgType.FIELD));
            // no reset should have been triggered by QF/J
            assertEquals(0, application.sessionResets);
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
        }
    }

    @Test
    // QFJ-926
    public void testSessionNotResetRightAfterLogonOnAcceptor() throws Exception {
        // truncate to seconds, otherwise the session time check in Session.next()
        // might already reset the session since the session schedule has only precision of seconds
        final LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(now);
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.toInstant(offset).toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // we want to start the session before the StartTime
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().plus(4500L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime",   UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpFileStoreSession(application, false,
                new UnitTestResponder(), settings, sessionID)) {
            session.addStateListener(application);
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            session.next();
            
            // we should send no messages since we are outside of session time
            assertEquals(0, application.toAdminMessages.size());
            // no reset should have been triggered by QF/J (since we were not logged on)
            assertEquals(0, application.sessionResets);
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            // increase time to be within session time
            systemTimeSource.increment(5000);
            // there should be a Logon but no subsequent reset
            logonTo(session, 1);
            // call next() to provoke SessionTime check which should NOT reset seqnums now
            session.next();
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            assertTrue(session.isLoggedOn());
            assertEquals(1, application.sessionResets);
            
            systemTimeSource.increment(5000);
            session.disconnect("test", false);
            systemTimeSource.increment(5000);
            session.next();
            session.setResponder(new UnitTestResponder());
            
            logonTo(session, 2);
            session.next();
            
            // check that no reset is done on next Logon
            assertEquals(1, application.sessionResets);
        }
    }

    @Test
    // QFJ-926
    public void testSessionNotResetRightAfterLogonOnInitiator() throws Exception {
        // truncate to seconds, otherwise the session time check in Session.next()
        // might already reset the session since the session schedule has only precision of seconds
        final LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(now);
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.toInstant(offset).toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // we want to start the session before the StartTime
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().plus(5000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime",   UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        UnitTestResponder responder = new UnitTestResponder();
        try (Session session = setUpFileStoreSession(application, true, responder, settings, sessionID)) {
            session.addStateListener(application);
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            session.next();
            
            // we should send no messages since we are outside of session time
            assertEquals(0, application.toAdminMessages.size());
            // no reset should have been triggered by QF/J (since we were not logged on)
            assertEquals(0, application.sessionResets);
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            // increase time to be almost within session time to check if session needs to be reset
            // (will not reset since it is not yet within session time)
            systemTimeSource.increment(4500);
            session.next();
            // increase time further so that Logon is sent but reset is not done since last check
            // of session time was done within one second
            systemTimeSource.increment(600);
            session.next();
            systemTimeSource.increment(1000);
            session.next(createLogonResponse(new SessionID(FixVersions.BEGINSTRING_FIX44, "TARGET", "SENDER"), application.lastToAdminMessage(), 1));
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            assertTrue(session.isLoggedOn());
            assertEquals(1, application.sessionResets);
            
            systemTimeSource.increment(5000);
            session.disconnect("test", false);
            systemTimeSource.increment(5000);
            session.next();
            responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.next();
            session.next(createLogonResponse(new SessionID(FixVersions.BEGINSTRING_FIX44, "TARGET", "SENDER"), application.lastToAdminMessage(), 2));
            // check that no reset is done on next Logon
            assertEquals(1, application.sessionResets);
        }
    }

    @Test
    // QFJ-929/QFJ-933
    public void testLogonIsAnsweredWithLogoutOnException() throws Exception {

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        UnitTestApplication application = new UnitTestApplication();
        try (Session session = SessionFactoryTestSupport.createSession(sessionID, application,
                false, false, true, true, null)) {
            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            session.logon();

            session.next();
            Logon logonRequest = new Logon();
            setUpHeader(session.getSessionID(), logonRequest, true, 1);
            logonRequest.setInt(HeartBtInt.FIELD, 30);
            logonRequest.setString(EncryptMethod.FIELD, "");
            logonRequest.toString();    // calculate length and checksum
            session.next(logonRequest);
            // session should not be logged on due to empty EncryptMethod
            assertFalse(session.isLoggedOn());

            assertEquals(1, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
            assertEquals(MsgType.LOGOUT, application.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

            session.setResponder(responder);
            session.logon();
            session.next();
            setUpHeader(session.getSessionID(), logonRequest, true, 2);
            logonRequest.removeField(EncryptMethod.FIELD);
            logonRequest.toString();    // calculate length and checksum
            session.next(logonRequest);
            // session should not be logged on due to missing EncryptMethod
            assertFalse(session.isLoggedOn());

            assertEquals(2, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
            assertEquals(MsgType.LOGOUT, application.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            assertEquals(3, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(3, session.getStore().getNextSenderMsgSeqNum());

            session.setResponder(responder);
            session.logon();
            session.next();
            setUpHeader(session.getSessionID(), logonRequest, true, 3);
            logonRequest.setString(EncryptMethod.FIELD, "A");
            logonRequest.toString();    // calculate length and checksum
            session.next(logonRequest);
            // session should not be logged on due to IncorrectDataFormat
            assertFalse(session.isLoggedOn());

            assertEquals(3, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
            assertEquals(MsgType.LOGOUT, application.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            assertEquals(4, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(4, session.getStore().getNextSenderMsgSeqNum());

            session.setResponder(responder);
            session.logon();
            session.next();
            setUpHeader(session.getSessionID(), logonRequest, true, 4);
            logonRequest.setString(EncryptMethod.FIELD, "99");
            logonRequest.toString();    // calculate length and checksum
            session.next(logonRequest);
            // session should not be logged on due to IncorrectTagValue
            assertFalse(session.isLoggedOn());

            assertEquals(4, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
            assertEquals(MsgType.LOGOUT, application.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            assertEquals(5, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(5, session.getStore().getNextSenderMsgSeqNum());
            session.setResponder(responder);
            session.logon();
            session.next();
            setUpHeader(session.getSessionID(), logonRequest, true, 5);
            logonRequest.setString(EncryptMethod.FIELD, "0");
            logonRequest.setString(NextExpectedMsgSeqNum.FIELD, "XXX");
            logonRequest.toString();    // calculate length and checksum
            session.next(logonRequest);
            // session should not be logged on due to IncorrectTagValue
            assertFalse(session.isLoggedOn());

            assertEquals(5, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
            assertEquals(MsgType.LOGOUT, application.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
            assertEquals(6, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(6, session.getStore().getNextSenderMsgSeqNum());
        }
    }

    /**
     * QFJ-357 This test should make sure that outside the Session time _only_ a
     * Logout message is sent to the counterparty. Formerly it could be observed
     * sometimes that there was a Logon message with a Logout message
     * immediately following.
     */
    @Test
    public void testLogonOutsideSessionTimeIsRejected() throws Exception {

        final LocalDateTime now = LocalDateTime.now();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource(
                now.toInstant(ZoneOffset.UTC).toEpochMilli());
        SystemTime.setTimeSource(systemTimeSource);
        // set up some basic stuff
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // construct a session schedule which is not active at the moment
        // add 30 minutes
        settings.setString("StartTime", UtcTimeOnlyConverter.convert(now.toLocalTime().plus(1800000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("EndTime",   UtcTimeOnlyConverter.convert(now.toLocalTime().plus(3600000L, ChronoUnit.MILLIS), UtcTimestampPrecision.SECONDS));
        settings.setString("TimeZone", TimeZone.getDefault().getID());
        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpFileStoreSession(application, false,
                new UnitTestResponder(), settings, sessionID)) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);
            // we should only answer with a Logout message
            assertEquals(1, application.toAdminMessages.size());
            assertEquals(MsgType.LOGOUT, application.toAdminMessages.get(0)
                    .getHeader().getString(MsgType.FIELD));
            assertFalse("Session should not be connected", session.isLoggedOn());
            assertTrue(application.toAdminMessages.get(0).getString(Text.FIELD)
                    .contains("Logon attempt not within session time"));
            // Normally, next() is called periodically; we only do it here to reset
            // the seqNums.
            // The seqNums should be reset because it was tried to establish a
            // connection
            // outside of the session schedule.
            session.next();
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
        }
    }

    // QFJ-357
    private void setupFileStoreForQFJ357(final SessionID sessionID,
            final SessionSettings settings) throws ConfigError,
            FieldConvertError, IOException {

        // construct the path to the filestore (mostly c&p from FileStore class)
        settings.setString(FileStoreFactory.SETTING_FILE_STORE_PATH,
                System.getProperty("java.io.tmpdir"));
        final String path = settings
                .getString(FileStoreFactory.SETTING_FILE_STORE_PATH);
        final String fullPath = new File(path == null ? "." : path)
                .getAbsolutePath();
        final String sessionName = FileUtil.sessionIdFileName(sessionID);
        final String prefix = FileUtil.fileAppendPath(fullPath, sessionName
                + ".");
        final String sessionFileName = prefix + "session";
        try (DataOutputStream sessionTimeOutput = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(sessionFileName,
                        false)))) {
            // removing the file does NOT trigger the reset in the Session
            // constructor, so we fake an outdated session
            sessionTimeOutput.writeUTF(UtcTimestampConverter.convert(
                    new Date(0), true));
        }

        // delete files to have the message store reset seqNums to 1
        // (on QF/J 1.5.1 this triggered the needReset() method to return false)
        final String msgFileName = prefix + "body";
        final String headerFileName = prefix + "header";
        final String senderSeqNumFileName = prefix + "senderseqnums";
        final String targetSeqNumFileName = prefix + "targetseqnums";

        String[] fileNamesToDelete = new String[] { msgFileName,
                headerFileName, senderSeqNumFileName, targetSeqNumFileName };

        for (String fileNameToDelete : fileNamesToDelete) {
            File fileToDelete = new File(fileNameToDelete);
            if (fileToDelete.exists() && !fileToDelete.delete()) {
                throw new RuntimeException("Error during cleanup : file "
                        + fileNameToDelete + " can't be deleted");
            }
        }
    }

    @Test
    public void testLogonTagsInitiator() throws Exception {
        int logonTag1 = 553;    // body field
        int logonTag2 = 50;    // header field
        String logonTagValue1 = "foo123=bar";
        String logonTagValue2 = "barsubid";
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "foo", "bar");
        String settingsString = "";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.4\n";
        settingsString += "ConnectionType=initiator\n";
        settingsString += "SocketConnectPort=5001\n";
        settingsString += "SocketConnectHost=localhost\n";
        settingsString += "StartTime=00:00:00\n";
        settingsString += "EndTime=00:00:00\n";
        settingsString += "SenderCompID=foo\n";
        settingsString += "TargetCompID=bar\n";
        settingsString += "HeartBtInt=30\n";
        settingsString += "LogonTag=" + logonTag1 + "=" + logonTagValue1 + "\n";
        settingsString += "LogonTag1=" + logonTag2 + "=" + logonTagValue2 + "\n";

        SessionSettings settings = SessionSettingsTest.setUpSession(settingsString);
        UnitTestApplication application = new UnitTestApplication();
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(application, new MemoryStoreFactory(), new ScreenLogFactory());
        try (Session session = sessionFactory.create(sessionID, settings)) {
            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            session.logon();
            session.next();
            Message logonMessage = application.toAdminMessages.get(0);
            assertTrue(logonMessage.isSetField(logonTag1));
            assertTrue(logonMessage.getHeader().isSetField(logonTag2));
            assertEquals(logonTagValue1, logonMessage.getString(logonTag1));
            assertEquals(logonTagValue2, logonMessage.getHeader().getString(logonTag2));
            session.getDataDictionary().validate(logonMessage);
        }
    }
    

    @Test
    public void testLogonTagsAcceptor() throws Exception {
        int logonTag1 = 553;    // body field
        int logonTag2 = 50;    // header field
        String logonTagValue1 = "foo123=bar";
        String logonTagValue2 = "barsubid";
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "foo", "bar");
        String settingsString = "";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.4\n";
        settingsString += "ConnectionType=acceptor\n";
        settingsString += "SocketAcceptPort=5001\n";
        settingsString += "StartTime=00:00:00\n";
        settingsString += "EndTime=00:00:00\n";
        settingsString += "SenderCompID=foo\n";
        settingsString += "TargetCompID=bar\n";
        settingsString += "HeartBtInt=30\n";
        settingsString += "DataDictionary=FIX44.xml\n";
        settingsString += "LogonTag=" + logonTag1 + "=" + logonTagValue1 + "\n";
        settingsString += "LogonTag1=" + logonTag2 + "=" + logonTagValue2 + "\n";

        SessionSettings settings = SessionSettingsTest.setUpSession(settingsString);
        UnitTestApplication application = new UnitTestApplication();
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(application, new MemoryStoreFactory(), new ScreenLogFactory());
        try (Session session = sessionFactory.create(sessionID, settings)) {
            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            logonTo(session);
            session.next();
            assertTrue(session.isLoggedOn());
            Message logonMessage = application.toAdminMessages.get(0);
            assertTrue(logonMessage.isSetField(logonTag1));
            assertTrue(logonMessage.getHeader().isSetField(logonTag2));
            assertEquals(logonTagValue1, logonMessage.getString(logonTag1));
            assertEquals(logonTagValue2, logonMessage.getHeader().getString(logonTag2));
            session.getDataDictionary().validate(logonMessage);
        }
    }
    
    // QFJ-60
    @Test
    public void testRejectLogon() throws Exception {

        // Create application that rejects all logons
        final Application application = new UnitTestApplication() {

            @Override
            public void fromAdmin(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST");
            }
        };

        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextSenderMsgSeqNum());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            
            logonTo(session);

            assertFalse(state.isLogonSent());
            assertFalse(state.isLogonReceived());
            assertFalse(state.isLogonAlreadySent());
            assertFalse(state.isLogonSendNeeded());
            assertFalse(state.isLogonTimedOut());
            assertFalse(state.isLogoutSent());
            assertFalse(state.isLogoutReceived());
            assertFalse(state.isLogoutTimedOut());
            
            assertEquals(2, state.getNextSenderMsgSeqNum());
            assertEquals(2, state.getNextTargetMsgSeqNum());
        }
    }

    // QFJ-696
    @Test
    public void testRejectLogonWithSessionStatus() throws Exception {

        // Create application that rejects all logons
        Application application = new UnitTestApplication() {

            @Override
            public void fromAdmin(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST", SessionStatus.SESSION_ACTIVE);
            }
        };

        logonTo(setUpSession(application, false, new UnitTestResponder()));
        assertEquals(SessionStatus.SESSION_ACTIVE,
                ((UnitTestApplication) application).lastToAdminMessage()
                        .getInt(SessionStatus.FIELD));

        application = new UnitTestApplication() {

            @Override
            public void fromAdmin(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST", -1);
            }
        };

        logonTo(setUpSession(application, false, new UnitTestResponder()));
        assertFalse(((UnitTestApplication) application).lastToAdminMessage()
                .isSetField(SessionStatus.FIELD));
    }

    @Test
    // QFJ-339
    public void testSendingTimeRejectBeforeLogon() throws Exception {
        try (Session session = setUpSession(new UnitTestApplication(), false,
                new UnitTestResponder())) {

            final Message message = new Logon();
            message.getHeader().setString(SenderCompID.FIELD, "SENDER");
            message.getHeader().setString(TargetCompID.FIELD, "TARGET");
            message.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(LocalDateTime.ofInstant(Instant.EPOCH, ZoneOffset.UTC), UtcTimestampPrecision.SECONDS));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);
            
            final SessionStateListener mockStateListener = mock(SessionStateListener.class);
            session.addStateListener(mockStateListener);
            
            session.next(message);
            
            verify(mockStateListener).onDisconnect();
            verifyNoMoreInteractions(mockStateListener);
        }
    }

    @Test
    // QFJ-339
    public void testCorruptLogonReject() throws Exception {
        try (Session session = setUpSession(new UnitTestApplication(), false,
                new UnitTestResponder())) {

            final Message message = new Logon();
            message.getHeader().setString(SenderCompID.FIELD, "SENDER");
            message.getHeader().setString(TargetCompID.FIELD, "TARGET");
            message.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(LocalDateTime.now(ZoneOffset.UTC), UtcTimestampPrecision.SECONDS));
            message.getHeader().setInt(MsgSeqNum.FIELD, 100);
            
            final SessionStateListener mockStateListener = mock(SessionStateListener.class);
            session.addStateListener(mockStateListener);
            
            session.next(message);
            
            verify(mockStateListener).onDisconnect();
            verifyNoMoreInteractions(mockStateListener);
        }
    }

    @Test
    public void testSequenceRollbackOnCallbackException() throws Exception {

        // Create application that rejects all logons
        final Application application = new UnitTestApplication() {

            @Override
            public void fromApp(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new RuntimeException("TEST");
            }

            @Override
            public void fromAdmin(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                if (message.getHeader().getString(MsgType.FIELD)
                        .equals(MsgType.LOGON)) {
                    return;
                }
                throw new RuntimeException("TEST");
            }
        };

        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
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
    }

    // QFJ-271
    @Test
    public void testSequenceResetStackOverflow() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            logonTo(session, 1);
            
            assertTrue(session.isLoggedOn());
            assertEquals(2, state.getNextTargetMsgSeqNum());
            
            for (int i = 2; i <= 41; i++) {
                processMessage(session, createAppMessage(i));
            }
            assertEquals(42, state.getNextTargetMsgSeqNum());
            
            processMessage(session, createAppMessage(50));
            processMessage(session, createSequenceReset(51, 51, true));
            
            for (int i = 42; i <= 49; i++) {
                processMessage(session, createAppMessage(i));
            }
            
            assertEquals(51, state.getNextTargetMsgSeqNum());
            processMessage(session, createHeartbeatMessage(51));
            assertEquals(52, state.getNextTargetMsgSeqNum());
            assertTrue(session.isLoggedOn());
            assertFalse(state.isResendRequested());
            assertTrue(state.getQueuedSeqNums().isEmpty());
        }
    }

    // QFJ-626
    @Test
    public void testResendMessagesWithIncorrectChecksum() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        try (Session session = SessionFactoryTestSupport.createSession(sessionID, application, false, false, true, true, null)) {
            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            final SessionState state = getSessionState(session);
            
            assertTrue(session.isUsingDataDictionary());
            
            final Logon logonToSend = new Logon();
            setUpHeader(session.getSessionID(), logonToSend, true, 1);
            logonToSend.setInt(HeartBtInt.FIELD, 30);
            logonToSend.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
            logonToSend.toString(); // calculate length/checksum
            session.next(logonToSend);
            
            session.send(createAppMessage(2));
            final News createAppMessage = createAppMessage(3);
            createAppMessage.setString(11, "ÄÖÜäöü?ß");
            session.send(createAppMessage);
            session.send(createAppMessage(4));
            session.send(createAppMessage(5));
            
            // ugly hack: alter the store to get an invalid checksum
            String toString = createAppMessage.toString();
            final String replace = toString.replace("10=", "10=1");
            state.set(3, replace);
            
            Message createResendRequest = createResendRequest(2, 1);
            createResendRequest.toString(); // calculate length/checksum
            processMessage(session, createResendRequest);
            
            Message createAdminMessage = createAdminMessage(3);
            createAdminMessage.toString();  // calculate length/checksum
            session.next(createAdminMessage);
            
            // all messages should have been resent
            assertEquals(5, application.lastToAppMessage().header.getInt(MsgSeqNum.FIELD));
            assertFalse(state.isResendRequested());
        }
    }

    // QFJ-493
    @Test
    public void testGapFillSatisfiesResendRequest() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            session.setNextTargetMsgSeqNum(684);
            logonTo(session, 687);
            
            assertTrue(state.isResendRequested());
            assertEquals(684, state.getNextTargetMsgSeqNum());
            processMessage(session, createResendRequest(688, 1));
            
            processMessage(session, createSequenceReset(684, 688, true));
            
            processMessage(session, createHeartbeatMessage(689));
            
            assertFalse(state.isResendRequested());
        }
    }

    // QFJ-673
    @Test
    public void testResendRequestIsProcessedAndQueued() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            session.setNextSenderMsgSeqNum(1006);
            logonTo(session, 6);
            
            assertTrue(state.isResendRequested());
            assertEquals(1, state.getNextTargetMsgSeqNum());
            processMessage(session, createResendRequest(7, 1005));
            assertEquals(1, state.getNextTargetMsgSeqNum());
            processMessage(session, createSequenceReset(1, 6, true));
            assertEquals(8, state.getNextTargetMsgSeqNum());
            // we need to satisfy the resendrequest of the opposing side
            assertEquals(MsgType.SEQUENCE_RESET, MessageUtils
                    .getMessageType(application.lastToAdminMessage().toString()));
            assertTrue(state.isResendRequested());
            processMessage(session, createHeartbeatMessage(8));
            assertFalse(state.isResendRequested());
            processMessage(session, createHeartbeatMessage(9));
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            assertEquals(10, state.getNextTargetMsgSeqNum());
        }
    }

    @Test
    public void testResendRequestMsgSeqNum() throws Exception {

        // test seqnum too low
        final Application application = new UnitTestApplication() {
        };
        Session session = setUpSession(application, false,
                new UnitTestResponder());
        SessionState state = getSessionState(session);

        assertEquals(1, state.getNextTargetMsgSeqNum());
        logonTo(session, 1);
        assertEquals(2, state.getNextTargetMsgSeqNum());
        processMessage(session, createResendRequest(1, 100));
        assertFalse("Session should be logged out since seqnum too low!",
                session.isLoggedOn());

        // test seqnum too high
        session = setUpSession(application, false, new UnitTestResponder());
        state = getSessionState(session);

        assertEquals(1, state.getNextTargetMsgSeqNum());
        logonTo(session, 1);
        assertEquals(2, state.getNextTargetMsgSeqNum());

        assertFalse(state.isResendRequested());
        processMessage(session, createHeartbeatMessage(8));
        assertTrue(state.isResendRequested());
        processMessage(session, createResendRequest(10, 100));

        // satisfy ResendRequest
        processMessage(session, createSequenceReset(2, 11, true));
        assertEquals(11, state.getNextTargetMsgSeqNum());
        processMessage(session, createHeartbeatMessage(11));
        assertFalse(state.isResendRequested());
        processMessage(session, createHeartbeatMessage(12));
        assertTrue(session.isLoggedOn());

        session.close();
    }

    // QFJ-658 and acceptance test 20_SimultaneousResendRequests.def
    @Test
    public void testSimultaneousResendRequests() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            SessionState state = getSessionState(session);
            
            assertEquals(1, state.getNextTargetMsgSeqNum());
            logonTo(session, 1);
            assertEquals(2, state.getNextTargetMsgSeqNum());
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            
            processMessage(session, createAppMessage(2));
            session.send(createAppMessage(2));
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            
            processMessage(session, createAppMessage(3));
            session.send(createAppMessage(3));
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            
            processMessage(session, createHeartbeatMessage(7));
            assertTrue(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            processMessage(session, createResendRequest(8, 2));
            assertTrue(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            
            processMessage(session, createHeartbeatMessage(4));
            assertTrue(state.isResendRequested());
            processMessage(session, createHeartbeatMessage(5));
            assertTrue(state.isResendRequested());
            processMessage(session, createHeartbeatMessage(6));
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            
            // we need to satisfy the resendrequest of the opposing side
            assertEquals(MsgType.SEQUENCE_RESET, MessageUtils
                    .getMessageType(application.lastToAdminMessage().toString()));
            assertEquals(9, state.getNextTargetMsgSeqNum());
            processMessage(session, createHeartbeatMessage(9));
            processMessage(session, createHeartbeatMessage(10));
            assertEquals(11, state.getNextTargetMsgSeqNum());
        }
    }

    // QFJ-750
    @Test
    public void testRemoveQueuedMessagesOnSequenceReset() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final SessionState state = getSessionState(session);
            
            final int from = 10;
            int numberOfMsgs = 200;
            int to = from + numberOfMsgs;
            
            logonTo(session, 1);
            assertEquals(2, state.getNextTargetMsgSeqNum());
            for (int i = from; i < to; i++) {
                processMessage(session, createAppMessage(i));
            }
            for (int i = from; i < to; i++) {
                assertTrue(state.getQueuedSeqNums().contains(i));
            }

            assertEquals(state.getQueuedSeqNums().size(), numberOfMsgs);
            assertTrue(application.fromAppMessages.isEmpty());
            // Create a sequence reset which will cause deletion of almost all
            // messages
            // from the sessionState queue since former messages are skipped.
            // The remaining two messages will then be dequeued and processed by the
            // app.
            final int two = 2;
            processMessage(session, createSequenceReset(2, to - two, true));
            assertEquals(application.fromAppMessages.size(), two);
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            assertTrue(state.getQueuedSeqNums().isEmpty());
        }
    }

    /**
     * QFJ-721: Receiving a non-Logon message after having sent a Logon on a
     * non-FIXT session formerly lead to a NPE since the field
     * targetDefaultApplVerID was not initialized in all cases.
     */
    @Test
    public void testNonLogonMessageNonFIXT() throws Exception {

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final ApplVerID applVerID = MessageUtils
                .toApplVerID(FixVersions.BEGINSTRING_FIX44);
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = SessionFactoryTestSupport.createSession(
                sessionID, application, true, false, true, true, null)) {
            session.setResponder(new UnitTestResponder());
            
            assertTrue(session.isUsingDataDictionary());
            assertEquals(applVerID, session.getTargetDefaultApplicationVersionID());
            session.next();
            session.next();
            Message createHeartbeatMessage = createHeartbeatMessage(1);
            createHeartbeatMessage.toString(); // calculate checksum, length
            processMessage(session, createHeartbeatMessage);
            assertEquals(applVerID, session.getTargetDefaultApplicationVersionID());
            assertFalse(session.isLoggedOn());
        }
    }

    /**
     * QFJ-721: For FIXT sessions the targetDefaultApplVerID should have been
     * set after the Logon.
     */
    @Test
    public void testNonLogonMessageFIXT() throws Exception {

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET");
        final ApplVerID applVerID = MessageUtils
                .toApplVerID(FixVersions.FIX50SP2);
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = SessionFactoryTestSupport.createSession(
                sessionID, application, true, false, true, true,
                new DefaultApplVerID(ApplVerID.FIX50SP2))) {
            session.setResponder(new UnitTestResponder());
            
            // construct example messages
            final quickfix.fixt11.Heartbeat heartbeat = new quickfix.fixt11.Heartbeat();
            setUpHeader(session.getSessionID(), heartbeat, true, 1);
            heartbeat.toString(); // calculate checksum, length
            final quickfix.fixt11.Logon logon = new quickfix.fixt11.Logon();
            setUpHeader(session.getSessionID(), logon, true, 1);
            logon.setInt(HeartBtInt.FIELD, 30);
            logon.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
            logon.setString(DefaultApplVerID.FIELD, ApplVerID.FIX50SP2);
            logon.toString(); // calculate checksum, length
            
            assertTrue(session.isUsingDataDictionary());
            assertNull(session.getTargetDefaultApplicationVersionID());
            session.next();
            session.next();
            session.next(heartbeat);
            assertNull(session.getTargetDefaultApplicationVersionID());
            assertFalse(session.isLoggedOn());
            
            // retry Logon
            session.setResponder(new UnitTestResponder());
            session.next();
            session.next();
            assertNull(session.getTargetDefaultApplicationVersionID());
            session.next(logon);
            assertEquals(applVerID, session.getTargetDefaultApplicationVersionID());
            assertTrue(session.isLoggedOn());
        }
    }

    private void processMessage(Session session, Message message)
            throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        try {
            session.next(message);
        } catch (final Throwable e) {
            // This simulated the behavior of the QFJ connectors
            // They will just discard a message with an error (without
            // incrementing the sequence number).
        }
    }

    private Message createAdminMessage(int sequence) {
        final TestRequest msg = new TestRequest(new TestReqID("ID"));
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        return msg;
    }

    private Message createHeartbeatMessage(int sequence) {
        final Heartbeat msg = new Heartbeat();
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        return msg;
    }

    private Message createReject(int sequence, int refSeqNum) {
        final Reject msg = new Reject();
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        msg.setInt(RefSeqNum.FIELD, refSeqNum);
        return msg;
    }

    private Message createResendRequest(int sequence, int from) {
        final ResendRequest msg = new ResendRequest();
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        msg.setInt(BeginSeqNo.FIELD, from);
        msg.setInt(EndSeqNo.FIELD, 0);
        return msg;
    }

    private Message createSequenceReset(int sequence, int to, boolean gapFill) {
        final SequenceReset msg = new SequenceReset();
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        msg.getHeader().setBoolean(PossDupFlag.FIELD, true);
        msg.getHeader().setUtcTimeStamp(OrigSendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        msg.setBoolean(GapFillFlag.FIELD, gapFill);
        msg.setInt(NewSeqNo.FIELD, to);
        return msg;
    }

    @Test
    public void testDontCatchErrorsFromCallback() throws Exception {

        final Application application = new UnitTestApplication() {

            @Override
            public void fromApp(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new Error("TEST");
            }
        };

        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            logonTo(session);

            try {
                session.next(createHeartbeatMessage(2)); // should increment target
                // seqnum
                session.next(createHeartbeatMessage(3)); // should increment target
                // seqnum
                session.next(createHeartbeatMessage(4)); // should increment target
                // seqnum
                assertEquals(5, session.getExpectedTargetNum());
                session.next(createAppMessage(5)); // should NOT increment target
                // seqnum
                fail("No error thrown");
            } catch (final Throwable t) {
                assertEquals("java.lang.Error: TEST", t.getMessage());
                assertEquals(5, session.getExpectedTargetNum());
                assertEquals(2, session.getExpectedSenderNum());
                session.next(createHeartbeatMessage(5)); // should increment target
                // seqnum
                assertEquals(6, session.getExpectedTargetNum());
                assertEquals(2, session.getExpectedSenderNum());
            }
        }
    }

    // QFJ-572
    @Test
    public void testCatchErrorsFromCallbackAndSendReject() throws Exception {

        final UnitTestApplication application = new UnitTestApplication() {

            @Override
            public void fromAdmin(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                final String msgType = message.getHeader().getString(
                        MsgType.FIELD);
                if (MsgType.HEARTBEAT.equals(msgType)) {
                    throw new Error("TESTAdmin");
                }
            }

            @Override
            public void fromApp(Message message, SessionID sessionId)
                    throws FieldNotFound, IncorrectDataFormat,
                    IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new Error("TEST");
            }
        };

        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            session.setRejectMessageOnUnhandledException(true);
            logonTo(session);

            try {
                session.next(createAppMessage(2));
                assertEquals(3, session.getExpectedTargetNum());
                assertEquals(3, session.getExpectedSenderNum());
                assertEquals(MsgType.NEWS, application.lastFromAppMessage()
                        .getHeader().getString(MsgType.FIELD));
                assertEquals(MsgType.BUSINESS_MESSAGE_REJECT, application
                        .lastToAppMessage().getHeader().getString(MsgType.FIELD));
                
                session.next(createHeartbeatMessage(3));
                assertEquals(4, session.getExpectedTargetNum());
                assertEquals(4, session.getExpectedSenderNum());
                assertEquals(MsgType.HEARTBEAT, application.lastFromAdminMessage()
                        .getHeader().getString(MsgType.FIELD));
                assertEquals(MsgType.REJECT, application.lastToAdminMessage()
                        .getHeader().getString(MsgType.FIELD));
                
                session.next(createAdminMessage(4));
                assertEquals(5, session.getExpectedTargetNum());
                assertEquals(5, session.getExpectedSenderNum());
                assertEquals(MsgType.TEST_REQUEST, application
                        .lastFromAdminMessage().getHeader()
                        .getString(MsgType.FIELD));
                assertEquals(MsgType.HEARTBEAT, application.lastToAdminMessage()
                        .getHeader().getString(MsgType.FIELD));
            } catch (final Throwable t) {
                fail("Error was thrown: " + t.getMessage());
            }
        }
    }

    private News createAppMessage(int sequence) {
        final News news = new News(new Headline("Headline"));
        news.getHeader().setString(SenderCompID.FIELD, "TARGET");
        news.getHeader().setString(TargetCompID.FIELD, "SENDER");
        news.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        news.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now(ZoneOffset.UTC));
        return news;
    }

    private SessionState getSessionState(Session session)
            throws NoSuchFieldException, IllegalAccessException {
        final Field stateField = session.getClass().getDeclaredField("state");
        stateField.setAccessible(true);
        return (SessionState) stateField.get(session);
    }

    /**
     * Verifies that the session has been registered before the logger tries
     * accessing it Use case: JdbcLogger not setup correctly, barfs during
     * Session creation, tries to log and can't find the session in global
     * session list yet.
     */
    @Test
    public void testSessionRegisteredCorrectly() throws Exception {
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        JdbcTestSupport.setHypersonicSettings(settings);
        // do not initialize the SQL tables so that the JdbcLog will fail
        final SessionID sessionID = new SessionID("FIX.4.2",
                "SENDER-sessionRegister", "TARGET-sessionRegister");
        settings.setString(sessionID, "ConnectionType", "acceptor");
        final DefaultSessionFactory factory = new DefaultSessionFactory(
                new UnitTestApplication(), new MemoryStoreFactory(),
                new JdbcLogFactory(settings));
        try {
            try (Session session = factory.create(sessionID, settings)) {
                assertNotNull(session);
            }
        } catch (final NullPointerException nex) {
            fail("Session not registering correctly so JdbcLog fails while printing an error: "
                    + nex.getMessage());
        } catch (final NoClassDefFoundError e) {
            // this test does not work in Eclipse but we
            // catch the Exception in order to ignore the test
        }
    }

    @Test
    public void testNonpersistedGapFill() throws Exception {
        final SessionID sessionID = new SessionID("FIX.4.4:SENDER->TARGET");
        try (Session session = SessionFactoryTestSupport
                .createNonpersistedSession(sessionID,
                        new UnitTestApplication(), false)) {
            session.getStore().setNextTargetMsgSeqNum(200);
            final SessionState state = ReflectionUtil.getField(session, "state",
                    SessionState.class);
            state.setLogonReceived(true);
            final ResendRequest resendRequest = new ResendRequest();
            resendRequest.getHeader().setField(
                    new SenderCompID(sessionID.getTargetCompID()));
            resendRequest.getHeader().setField(
                    new TargetCompID(sessionID.getSenderCompID()));
            resendRequest.getHeader().setField(new SendingTime(LocalDateTime.now(ZoneOffset.UTC)));
            resendRequest.getHeader().setField(new MsgSeqNum(200));
            resendRequest.set(new BeginSeqNo(1));
            resendRequest.set(new EndSeqNo(100));
            session.next(resendRequest);
            assertEquals(201, state.getNextTargetMsgSeqNum());
        }
    }

    @Test
    // QFJ-457
    public void testAcceptorRejectsLogonWhenLogoutInitiatedLocally() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {

            logonTo(session);
            assertTrue(session.isEnabled());
            assertTrue(session.isLoggedOn());
            
            session.logout();
            session.next();
            
            final Message logout = new Logout();
            logout.getHeader().setString(SenderCompID.FIELD, "TARGET");
            logout.getHeader().setString(TargetCompID.FIELD, "SENDER");
            logout.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(LocalDateTime.now(ZoneOffset.UTC), UtcTimestampPrecision.SECONDS));
            logout.getHeader().setInt(MsgSeqNum.FIELD, 2);
            session.next(logout);

            assertFalse(session.isEnabled());
            assertFalse(session.isLoggedOn());
            logonTo(session, 3);
            Message lastToAdminMessage = application.lastToAdminMessage();
            assertEquals(Logout.MSGTYPE, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
        }
    }

    @Test
    public void testAcceptorAcceptsLogonWhenLogoutInitiatedExternally() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {

            logonTo(session);
            assertTrue(session.isEnabled());
            assertTrue(session.isLoggedOn());

            final Message logout = new Logout();
            logout.getHeader().setString(SenderCompID.FIELD, "TARGET");
            logout.getHeader().setString(TargetCompID.FIELD, "SENDER");
            logout.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(LocalDateTime.now(ZoneOffset.UTC), UtcTimestampPrecision.SECONDS));
            logout.getHeader().setInt(MsgSeqNum.FIELD, 2);
            session.next(logout);

            session.next();

            assertTrue(session.isEnabled());
            assertFalse(session.isLoggedOn());
            logonTo(session, 3);
            Message lastToAdminMessage = application.lastToAdminMessage();
            assertEquals(Logon.MSGTYPE, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
        }
    }

    @Test
    // QFJ-444
    public void testStateFlagsAreResetOnLogout() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        try (Session session = setUpSession(application, false,
                new UnitTestResponder())) {
            final Message logout = new Logout();
            logout.getHeader().setString(SenderCompID.FIELD, "TARGET");
            logout.getHeader().setString(TargetCompID.FIELD, "SENDER");
            logout.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(LocalDateTime.now(ZoneOffset.UTC), UtcTimestampPrecision.SECONDS));
            logout.getHeader().setInt(MsgSeqNum.FIELD, 2);
            
            logonTo(session);
            assertFalse(session.isLogoutSent());
            assertFalse(session.isLogoutReceived());
            assertTrue(session.isLogonReceived());
            assertTrue(session.isLogonSent());
            
            /*
            * Setting the responder to NULL here was formerly causing that the
            * flags logoutReceived and logoutSent (amongst others) were not reset
            * to false because the Session.disconnect() method returned too early
            * since no responder was set anymore.
            */
            session.setResponder(null);
            session.next(logout);
            
            assertFalse(session.isLogoutReceived());
            assertFalse(session.isLogoutSent());
            assertFalse(session.isLogonReceived());
            assertFalse(session.isLogonSent());
            
            session.setResponder(new UnitTestResponder());
            logonTo(session, 3);
            assertFalse(session.isLogoutSent());
            assertFalse(session.isLogoutReceived());
            assertTrue(session.isLogonReceived());
            assertTrue(session.isLogonSent());
            
            session.disconnect("Forced by UnitTest", true);
            assertFalse(session.isLogoutReceived());
            assertFalse(session.isLogoutSent());
            assertFalse(session.isLogonReceived());
            assertFalse(session.isLogonSent());
            
            // onLogout was called
            assertEquals(1, application.logoutSessions.size());
        }
    }

    @Test
    // QFJ-557
    public void testGenerateRejectAndTargetSeqNum() throws Exception {

        SessionID sessionID = new SessionID("FIX.4.2", "US", "THEM");
        SessionSettings settings = new SessionSettings();
        settings.setString(SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setLong(Session.SETTING_HEARTBTINT, 30L);
        settings.setString(Session.SETTING_TIMEZONE, "EST");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        settings.setBool(Session.SETTING_CHECK_LATENCY, false);

        try (Session session = new DefaultSessionFactory(new ApplicationAdapter(),
                new MemoryStoreFactory(), new SLF4JLogFactory(settings))
                .create(sessionID, settings)) {

            session.setResponder(new UnitTestResponder());
            
            session.next();
            session.setNextSenderMsgSeqNum(177);
            session.setNextTargetMsgSeqNum(223);
            String[] messages = {
                "8=FIX.4.2\0019=0081\00135=A\00149=THEM\00156=US\001369=177\00152=20100908-17:59:30.551\00134=227\00198=0\001108=30\00110=36\001",
                "8=FIX.4.2\0019=0107\00135=z\001115=THEM\00149=THEM\00156=US\001369=177\00152=20100908-17:59:30.551\00134=228\001336=1\001340=2\00176=US\001439=USS\00110=133\001",
                "8=FIX.4.2\0019=0113\00135=4\00134=223\00143=Y\001122=20100908-17:59:30.642\00149=THEM\00156=US\001369=178\00152=20100908-17:59:30.642\001123=Y\00136=225\00110=110\001",
                "8=FIX.4.2\0019=0246\00135=8\001115=THEM\00134=225\00143=Y\001122=20100908-17:52:37.920\00149=THEM\00156=US\001369=178\00152=20100908-17:59:30.642\00137=10118506\00111=a00000052.1\00117=17537743\00120=0\001150=4\00139=4\00155=ETFC\00154=1\00138=500000\00144=0.998\00132=0\00131=0\001151=0\00114=0\0016=0\00160=20100908-17:52:37.920\00110=80\001" };
            for (String message : messages)
                session.next(MessageUtils.parse(session, message));
            
            assertEquals(226, session.getStore().getNextTargetMsgSeqNum());
        }
    }

    @Test
    // QFJ-776
    public void testLogonWithoutTargetCompID() throws Exception {

        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        UnitTestApplication application = new UnitTestApplication();
        SessionSettings sessionSettings = SessionSettingsTest
                .setUpSession(null);
        SessionFactoryTestSupport factoryTestSupport = new SessionFactoryTestSupport();
        Session session = factoryTestSupport.create(sessionID, sessionSettings);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        session.logon();
        assertTrue(session.getCheckCompID());

        session.next();
        Logon logonRequest = new Logon();
        setUpHeader(session.getSessionID(), logonRequest, true, 1);
        logonRequest.setInt(HeartBtInt.FIELD, 30);
        logonRequest.getHeader().removeField(TargetCompID.FIELD);
        session.next(logonRequest);
        // session should not be logged on due to missing TargetCompID
        assertFalse(session.isLoggedOn());

        // create session which has checkCompID=N
        session = createSession(sessionID, application, false, true);
        session.setResponder(responder);
        session.logon();
        assertFalse(session.getCheckCompID());
        logonRequest = new Logon();
        setUpHeader(session.getSessionID(), logonRequest, true, 1);
        logonRequest.setInt(HeartBtInt.FIELD, 30);
        logonRequest.getHeader().removeField(TargetCompID.FIELD);
        session.next(logonRequest);
        assertTrue(session.isLoggedOn());

        assertEquals(
                1,
                application.lastToAdminMessage().getHeader()
                        .getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        session.close();
    }
    
    // QFJ-751
    @Test
    public void testSequenceResetGapFillWithZeroChunkSize() throws Exception {
        testSequenceResetGapFillWithChunkSize(0);
    }

    // QFJ-751
    @Test
    public void testSequenceResetGapFillWithChunkSize5() throws Exception {
        testSequenceResetGapFillWithChunkSize(5);
    }

    // QFJ-751
    @Test
    public void testSequenceResetGapFillWithChunkSize8() throws Exception {
        testSequenceResetGapFillWithChunkSize(8);
    }

    // QFJ-751
    @Test
    public void testSequenceResetGapFillWithChunkSize10() throws Exception {
        testSequenceResetGapFillWithChunkSize(10);
    }

    // QFJ-751
    private void testSequenceResetGapFillWithChunkSize(int chunkSize)
            throws Exception {
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        boolean isInitiator = true, resetOnLogon = false, validateSequenceNumbers = true;

        try (Session session = new Session(new UnitTestApplication(),
                new MemoryStoreFactory(), sessionID, null, null,
                new SLF4JLogFactory(new SessionSettings()),
                new DefaultMessageFactory(), isInitiator ? 30 : 0, false, 30,
                UtcTimestampPrecision.MILLIS, resetOnLogon, false, false, false, false, false, true,
                false, 1.5, null, validateSequenceNumbers, new int[] { 5 },
                false, false, false, false, true, false, true, false, null, true,
                chunkSize, false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false)) {

            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            final SessionState state = getSessionState(session);
            
            session.logon();
            session.next();
            
            assertEquals(1, session.getStore().getNextTargetMsgSeqNum());
            
            Message logonRequest = new Message(responder.sentMessageData);
            
            // Deliver Logon response with too high sequence 20 instead of 1.
            session.next(createLogonResponse(sessionID, logonRequest, 20));
            
            assertTrue(state.isResendRequested());
            // The expected target sequence should still be 1.
            assertEquals(1, session.getStore().getNextTargetMsgSeqNum());
            
            // Deliver the missing message #1.
            session.next(createAppMessage(1));
            assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
            
            // Deliver the missing message #2.
            session.next(createAppMessage(2));
            assertEquals(3, session.getStore().getNextTargetMsgSeqNum());
            
            // Deliver SequenceReset-GapFill from 3 to 5
            session.next(createSequenceReset(3, 5, true));
            
            // Deliver the missing message #5.
            session.next(createAppMessage(5));
            /*
            * The expected target sequence number should be 6 now.
            */
            assertEquals(6, session.getStore().getNextTargetMsgSeqNum());
            assertTrue(session.isLoggedOn());
            assertTrue(state.isResendRequested());
            for (int i = 6; i <= 19; i++) {
                session.next(createAppMessage(i));
            }
            assertFalse(state.isResendRequested());
            assertTrue(session.isLoggedOn());
            // seqnum 20 will be retrieved from the queue, so we should be at 21 now
            assertEquals(21, session.getStore().getNextTargetMsgSeqNum());
        }
    }

	@Test
	public void correct_sequence_number_for_last_gap_fill_if_next_sender_sequence_number_is_higher_than_the_last_message_resent()
			throws IOException, InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType,
			IncorrectTagValue, IncorrectDataFormat, NoSuchFieldException, IllegalAccessException {
		final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
		final boolean resetOnLogon = false;
		final boolean validateSequenceNumbers = true;

		Session session = new Session(new UnitTestApplication(), new MemoryStoreFactory(),
				sessionID, null, null, null,
				new DefaultMessageFactory(), 30, false, 30, UtcTimestampPrecision.MILLIS, resetOnLogon,
				false, false, false, false, false, true, false, 1.5, null, validateSequenceNumbers,
				new int[]{5}, false, false, false, false, true, false, true, false, null, true, 0,
				false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false);

		Responder mockResponder = mock(Responder.class);
		when(mockResponder.send(anyString())).thenReturn(true);
		session.setResponder(mockResponder);

		session.logon();
		session.next();

		ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
		verify(mockResponder).send(messageCaptor.capture());
		session.next(createLogonResponse(sessionID, new Message(messageCaptor.getValue()), 101));
		MessageStore messageStore = session.getStore();

		for (int i=messageStore.getNextSenderMsgSeqNum(); i<=5; i++) {
			String executionReportString = "8=FIX.4.2\0019=0246\00135=8\001115=THEM\00134=" + i + "\00143=Y\001122=20100908-17:52:37.920\00149=THEM\00156=US\001369=178\00152=20100908-17:59:30.642\00137=10118506\00111=a00000052.1\00117=17537743\00120=0\001150=4\00139=4\00155=ETFC\00154=1\00138=500000\00144=0.998\00132=0\00131=0\001151=0\00114=0\0016=0\00160=20100908-17:52:37.920\00110=80\001";
			messageStore.set(i, executionReportString);
			messageStore.incrNextSenderMsgSeqNum();
		}

		//simulate a bunch of admin messages that were not persisted
		for (int i=0; i<5; i++)
			messageStore.incrNextSenderMsgSeqNum();

		final Message resendRequest = createResendRequest(1, 1);
		session.next(resendRequest);

		verify(mockResponder, times(7)).send(messageCaptor.capture());
		Message lastGapFill = new Message(messageCaptor.getAllValues().get(messageCaptor.getAllValues().size()-1));
		assertEquals("4", lastGapFill.getHeader().getString(MsgType.FIELD));
		assertEquals(lastGapFill.getHeader().getString(MsgSeqNum.FIELD), "6");
	}

	@Test
	public void correct_sequence_number_for_last_gap_fill_if_next_sender_sequence_number_is_higher_than_last_message_resent_when_enableNextExpectedMsgSeqNum_is_true()
			throws FieldNotFound, InvalidMessage, IOException, RejectLogon, IncorrectDataFormat, IncorrectTagValue,
			UnsupportedMessageType {
		boolean enableNextExpectedMsgSeqNum = true;

		final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
		final boolean resetOnLogon = false;
		final boolean validateSequenceNumbers = true;

		Session session = new Session(new UnitTestApplication(), new MemoryStoreFactory(),
				sessionID, null, null, null,
				new DefaultMessageFactory(), 30, false, 30, UtcTimestampPrecision.MILLIS, resetOnLogon,
				false, false, false, false, false, true, false, 1.5, null, validateSequenceNumbers,
				new int[]{5}, false, false, false, false, true, false, true, false, null, true, 0,
				enableNextExpectedMsgSeqNum, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false);

		Responder mockResponder = mock(Responder.class);
		when(mockResponder.send(anyString())).thenReturn(true);
		session.setResponder(mockResponder);

		session.logon();
		session.next();

		ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
		verify(mockResponder).send(messageCaptor.capture());
		session.next(createLogonResponse(sessionID, new Message(messageCaptor.getValue()), 101));
		MessageStore messageStore = session.getStore();

		for (int i=messageStore.getNextSenderMsgSeqNum(); i<=5; i++) {
			String executionReportString = "8=FIX.4.2\0019=0246\00135=8\001115=THEM\00134=" + i + "\00143=Y\001122=20100908-17:52:37.920\00149=THEM\00156=US\001369=178\00152=20100908-17:59:30.642\00137=10118506\00111=a00000052.1\00117=17537743\00120=0\001150=4\00139=4\00155=ETFC\00154=1\00138=500000\00144=0.998\00132=0\00131=0\001151=0\00114=0\0016=0\00160=20100908-17:52:37.920\00110=80\001";
			messageStore.set(i, executionReportString);
			messageStore.incrNextSenderMsgSeqNum();
		}

		//simulate a bunch of admin messages that were not persisted
		for (int i=0; i<5; i++)
			messageStore.incrNextSenderMsgSeqNum();

		final Message resendRequest = createResendRequest(1, 1);
		session.next(resendRequest);

		verify(mockResponder, times(7)).send(messageCaptor.capture());
		Message lastGapFill = new Message(messageCaptor.getAllValues().get(messageCaptor.getAllValues().size()-1));
		assertEquals("4", lastGapFill.getHeader().getString(MsgType.FIELD));
		assertEquals(lastGapFill.getHeader().getString(MsgSeqNum.FIELD), "6");
	}

    @Test
    // QFJ-795
    public void testMsgSeqNumTooHighWithDisconnectOnError() throws Exception {
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final boolean isInitiator = true, resetOnLogon = false, validateSequenceNumbers = true;

        final boolean disconnectOnError = true;

        try (Session session = new Session(new UnitTestApplication(),
                new MemoryStoreFactory(), sessionID, null, null,
                new SLF4JLogFactory(new SessionSettings()),
                new DefaultMessageFactory(), isInitiator ? 30 : 0, false, 30,
                UtcTimestampPrecision.MILLIS, resetOnLogon, false, false, false, false, false, true,
                false, 1.5, null, validateSequenceNumbers, new int[] { 5 },
                false, disconnectOnError, false, false, true, false, true, false,
                null, true, 0, false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false)) {

            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            
            // Deliver Logon response with too high sequence number 100
            Message logonRequest = new Message(responder.sentMessageData);
            session.next(createLogonResponse(sessionID, logonRequest, 100));
            
            // Deliver application message with too high sequence number 101
            session.next(createAppMessage(101));
            // Check, if session is still connected.
            assertTrue(session.hasResponder());
        }
    }

    @Test
    // QFJ-873
    public void testTimestampPrecision() throws Exception {
        final SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final boolean isInitiator = true, resetOnLogon = false, validateSequenceNumbers = true;

        final boolean disconnectOnError = true;
        UnitTestApplication unitTestApplication = new UnitTestApplication();

        try (Session session = new Session(unitTestApplication,
                new MemoryStoreFactory(), sessionID, null, null,
                new SLF4JLogFactory(new SessionSettings()),
                new DefaultMessageFactory(), isInitiator ? 30 : 0, false, 30,
                UtcTimestampPrecision.NANOS, resetOnLogon, false, false, false, false, false, true,
                false, 1.5, null, validateSequenceNumbers, new int[] { 5 },
                false, disconnectOnError, false, false, true, false, true, false,
                null, true, 0, false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false)) {

            UnitTestResponder responder = new UnitTestResponder();
            session.setResponder(responder);
            
            session.logon();
            session.next();
            String sendingTimeField = unitTestApplication.toAdminMessages.get(0).getHeader().getString(SendingTime.FIELD);
            assertEquals("SendingTime should have NANOS precision (27 characters total)", 27, sendingTimeField.length());
            String substring = sendingTimeField.substring(sendingTimeField.lastIndexOf(".") + 1);
            assertEquals("SendingTime should have NANOS precision (9 digits after dot)", 9, substring.length());
            Long.parseLong(substring);
        }
    }

    @Test
    public void testLargeQueue10() throws Exception {
        testLargeQueue(10);
    }

    @Test
    public void testLargeQueue100() throws Exception {
        testLargeQueue(100);
    }

    @Test
    public void testLargeQueue1000() throws Exception {
        testLargeQueue(1000);
    }

    @Test
    public void testLargeQueue10000() throws Exception {
        testLargeQueue(10000);
    }

    @Test
    public void testLargeQueue20000() throws Exception {
        testLargeQueue(20000);
    }

    // QFJ-788
    private void testLargeQueue(int N) throws Exception {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        boolean isInitiator = true, resetOnLogon = false, validateSequenceNumbers = true;
        final UnitTestApplication unitTestApplication = new UnitTestApplication();

        Session session = new Session(unitTestApplication, new MemoryStoreFactory(),
                sessionID, null, null, null,
                new DefaultMessageFactory(), isInitiator ? 30 : 0, false, 30, UtcTimestampPrecision.MILLIS, resetOnLogon,
                false, false, false, false, false, true, false, 1.5, null, validateSequenceNumbers,
                new int[]{5}, false, false, false, false, true, false, true, false, null, true, 0,
                false, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false);

        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        final SessionState state = getSessionState(session);

        /*
         * Logon to the session with a clean store and sequence numbers [1,1].
         */
        assertEquals(1, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(1, session.getStore().getNextSenderMsgSeqNum());

        session.logon();
        session.next();

        /*
         * Logon request was sent to the counterparty.
         *
         * Now we'll receive Logon response with too high sequence number 101
         * instead of 1, which should initiate the resend process. During the
         * resend process the counterparty should send us the missing messages
         * from 1 to 100.
         */
        // Deliver Logon response with sequnce number 101.
        Message logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 101));

        /*
         * Logon response was received. The resend process should have been
         * initiated.
         */
        assertTrue(state.isResendRequested());
        // The expected target sequence should still be 1.
        assertEquals(1, session.getStore().getNextTargetMsgSeqNum());

        /*
         * We sent a resend request from 1 to 100.
         *
         * The counterpatry quickly responds with a sequence reset from
         * 1 to 100, so we can adjust our expected sequence number value
         * and skip a number of administrative messages that should
         * never be resent.
         */
        // Deliver SequenceReset-GapFill from 1 to 100
        session.next(createSequenceReset(1, 100, true));
        assertEquals(100, session.getStore().getNextTargetMsgSeqNum());

        /*
         * So, we're still missing the message at sequence 100, which is an
         * application message.
         *
         * Unfortunately the counterparty is very slow in resending
         * application messages, but they will eventually send the
         * message to us.
         *
         * In the meantime they have a temporary burst of real-time data and
         * they send us N (possibly thousands) application messages within a
         * short period of time. All the messages get stored in a temporary
         * queue managed by QuickFIX/J.
         */
        for (int i = 0; i < N; i++) {
            session.next(createAppMessage(102 + i));
            // Each message gets queued in a temporary queue.
        }

        /*
         * Eventually the counterparty sends us the missing application
         * message with sequence number 100.
         *
         * However, depending on the number of messages stored in the
         * temporary queue the queue will be either processed correctly,
         * or the recursive nature of the next()/nextQueued() call will
         * blow up with a StackOverflowError.
         */
        // Deliver the last missing application message #100.
        session.next(createPossDupAppMessage(100));
         // Check the expected target sequence number after the queue has been
        // fully processed.
        assertEquals(N + 102, session.getStore().getNextTargetMsgSeqNum());

        /*
         * The best solution to this issue (StackOverflowError) is to refactor
         * the code such that the recursion between next()/nextQueued() is
         * replaced with a regular loop.
         */
    }

    @Test
    public void testResendSeqWithReject() throws Exception {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final boolean resetOnLogon = false;
        final boolean validateSequenceNumbers = true;
        boolean enableNextExpectedMsgSeqNum = false;
        boolean isInitiator = false;

        UnitTestApplication app = new UnitTestApplication() {
            private int logonCount = 0;

            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                if (message.getHeader().getString(MsgType.FIELD).equals(Logon.MSGTYPE)) {
                    logonCount += 1;
                }
                if (logonCount == 2) {
                    throw new RejectLogon("RejectLogon");
                }
            }
        };

        Session session = new Session(app, new MemoryStoreFactory(),
                sessionID, null, null, null,
                new DefaultMessageFactory(), isInitiator ? 30 : 0, false, 30, UtcTimestampPrecision.MILLIS, resetOnLogon,
                false, false, false, false, false, true, false, 1.5, null, validateSequenceNumbers,
                new int[]{5}, false, false, false, false, true, false, true, false, null, true, 0,
                enableNextExpectedMsgSeqNum, false, true, new ArrayList<>(), Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER, false);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        logonTo(session, 1);
        //Do Something
        session.next(createAppMessage(2));
        session.next(createAppMessage(3));
        session.disconnect("Disconnecting", true);
        session.next();
        session.logon();

        //Logon
        session.setResponder(responder);
        logonTo(session, 105);
        //Rejected
        assertEquals(Logout.MSGTYPE, app.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
        assertEquals("RejectLogon", app.lastToAdminMessage().getString(Text.FIELD));

        //Logon
        session.setResponder(responder);
        logonTo(session, 106);
        //Accepted
        assertEquals(Logon.MSGTYPE, app.lastFromAdminMessage().getHeader().getString(MsgType.FIELD));

        session.next();
        session.next();
        //ResendRequest
        assertEquals(ResendRequest.MSGTYPE, app.lastToAdminMessage().getHeader().getString(MsgType.FIELD));
        assertEquals(4, app.lastToAdminMessage().getInt(BeginSeqNo.FIELD));
        assertEquals(0, app.lastToAdminMessage().getInt(EndSeqNo.FIELD));
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void acceptorSession_ShouldWaitForLogoutResponseBeforeDisconnecting_WhenSendingLogoutDuringResetInSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, false)) {

            final SessionState state = getSessionState(session);

            logonTo(session);

            session.reset();

            logoutFrom(session, state.getNextTargetMsgSeqNum());
        }

        assertFor244(application, responder, 1, 1, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void acceptorSession_ShouldWaitForLogoutResponseBeforeDisconnecting_WhenSendingLogoutDuringResetOutsideSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, false)) {

            final SessionState state = getSessionState(session);

            logonTo(session);

            systemTimeSource.increment(TimeUnit.HOURS.toMillis(startTimeEndTimeOffsetHours) * 2);

            session.reset();

            logoutFrom(session, state.getNextTargetMsgSeqNum());
        }

        assertFor244(application, responder, 1, 1, 1, true);

    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void initiatorSession_ShouldWaitForLogoutResponseBeforeDisconnecting_WhenSendingLogoutDuringResetInSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, true)) {

            final SessionState state = getSessionState(session);

            session.next();

            logonTo(session);

            session.reset();

            logoutFrom(session, state.getNextTargetMsgSeqNum());
        }

        assertFor244(application, responder, 1, 1, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void initiatorSession_ShouldWaitForLogoutResponseBeforeDisconnecting_WhenSendingLogoutDuringResetOutsideSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, true)) {

            final SessionState state = getSessionState(session);

            session.next();

            logonTo(session);

            systemTimeSource.increment(TimeUnit.HOURS.toMillis(startTimeEndTimeOffsetHours) * 2);

            session.reset();

            logoutFrom(session, state.getNextTargetMsgSeqNum());
        }

        assertFor244(application, responder, 1, 1, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void acceptorSession_ShouldWaitForLogoutTimeoutBeforeDisconnecting_WhenSendingLogoutDuringResetInSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, false)) {

            final SessionState state = getSessionState(session);
            final long logoutTimeoutMs = TimeUnit.SECONDS.toMillis(state.getLogoutTimeout());

            logonTo(session);

            session.reset();

            systemTimeSource.increment(logoutTimeoutMs * 2);

            session.next();
        }

        assertFor244(application, responder, 1, 0, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void acceptorSession_ShouldWaitForLogoutTimeoutBeforeDisconnecting_WhenSendingLogoutDuringResetOutsideSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, false)) {

            final SessionState state = getSessionState(session);
            final long logoutTimeoutMs = TimeUnit.SECONDS.toMillis(state.getLogoutTimeout());

            logonTo(session);

            systemTimeSource.increment(TimeUnit.HOURS.toMillis(startTimeEndTimeOffsetHours) * 2);

            session.reset();

            systemTimeSource.increment(logoutTimeoutMs * 2);

            session.next();
        }

        assertFor244(application, responder, 1, 0, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void initiatorSession_ShouldWaitForLogoutTimeoutBeforeDisconnecting_WhenSendingLogoutDuringResetInSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, true)) {

            final SessionState state = getSessionState(session);
            final long logoutTimeoutMs = TimeUnit.SECONDS.toMillis(state.getLogoutTimeout());

            session.next();

            logonTo(session);

            session.reset();

            systemTimeSource.increment(logoutTimeoutMs * 2);

            session.next();
        }

        assertFor244(application, responder, 1, 0, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @Test
    public void initiatorSession_ShouldWaitForLogoutTimeoutBeforeDisconnecting_WhenSendingLogoutDuringResetOutsideSessionTime()
        throws ConfigError, IOException, IllegalAccessException, FieldConvertError, NoSuchFieldException,
        InvalidMessage, FieldNotFound, RejectLogon, UnsupportedMessageType, IncorrectTagValue, IncorrectDataFormat {

        final UnitTestApplication application = new UnitTestApplication();
        final UnitTestResponder responder = new UnitTestResponder();
        final MockSystemTimeSource systemTimeSource = new MockSystemTimeSource();
        final int startTimeEndTimeOffsetHours = 1;

        try (Session session =
                 setupFor244(application, responder, systemTimeSource, startTimeEndTimeOffsetHours, true)) {

            final SessionState state = getSessionState(session);
            final long logoutTimeoutMs = TimeUnit.SECONDS.toMillis(state.getLogoutTimeout());

            session.next();

            logonTo(session);

            systemTimeSource.increment(TimeUnit.HOURS.toMillis(startTimeEndTimeOffsetHours) * 2);

            session.reset();

            systemTimeSource.increment(logoutTimeoutMs * 2);

            session.next();
        }

        assertFor244(application, responder, 1, 0, 1, true);
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @SuppressWarnings("SameParameterValue")
    private Session setupFor244(UnitTestApplication application,
                                UnitTestResponder responder,
                                MockSystemTimeSource systemTimeSource,
                                int startTimeEndTimeOffsetHours,
                                boolean isInitiator)
        throws ConfigError, FieldConvertError, IOException, NoSuchFieldException, IllegalAccessException {

        final LocalDateTime now = LocalDateTime.now();
        final ZoneOffset zoneOffset = ZoneOffset.systemDefault()
            .getRules()
            .getOffset(now);
        final Instant nowInstant = now.toInstant(zoneOffset);
        final long nowEpocMillis = nowInstant.toEpochMilli();

        systemTimeSource.setSystemTimes(nowEpocMillis);
        SystemTime.setTimeSource(systemTimeSource);

        final LocalTime nowLocalTime = now.toLocalTime();
        final LocalTime nowLocalTimeMinusStartTimeEndTimeOffsetHours =
            nowLocalTime.minusHours(startTimeEndTimeOffsetHours);
        final LocalTime nowLocalTimePlusStartTimeEndTimeOffsetHours =
            nowLocalTime.plusHours(startTimeEndTimeOffsetHours);
        final String startTime =
            UtcTimeOnlyConverter.convert(nowLocalTimeMinusStartTimeEndTimeOffsetHours, UtcTimestampPrecision.SECONDS);
        final String endTime =
            UtcTimeOnlyConverter.convert(nowLocalTimePlusStartTimeEndTimeOffsetHours, UtcTimestampPrecision.SECONDS);
        final String timeZone = TimeZone.getDefault()
            .getID();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        final SessionSettings sessionSettings = SessionSettingsTest.setUpSession(null);
        sessionSettings.setString(Session.SETTING_START_TIME, startTime);
        sessionSettings.setString(Session.SETTING_END_TIME, endTime);
        sessionSettings.setString(Session.SETTING_TIMEZONE, timeZone);

        setupFileStoreForQFJ357(sessionID, sessionSettings);

        Session session = setUpFileStoreSession(application, isInitiator, responder, sessionSettings, sessionID);
        session.addStateListener(application);

        return session;
    }

    /**
     * https://github.com/quickfix-j/quickfixj/issues/244
     * */
    @SuppressWarnings("SameParameterValue")
    private void assertFor244(UnitTestApplication application,
                              UnitTestResponder responder,
                              long expectedLogoutMessageSentCount,
                              long expectedLogoutMessageReceivedCount,
                              int expectedSessionResetCount,
                              boolean expectedDisconnectCalled) {

        final long actualLogoutMessageSentCount = application.toAdminMessages.stream()
            .filter(message -> message instanceof Logout)
            .count();
        final long actualLogoutMessageReceivedCount = application.fromAdminMessages.stream()
            .filter(message -> message instanceof Logout)
            .count();
        final int actualSessionResets = application.sessionResets;
        final boolean actualDisconnectCalled = responder.disconnectCalled;

        assertEquals(
            String.format("Expected logout message sent count: %d.", expectedLogoutMessageSentCount),
            expectedLogoutMessageSentCount,
            actualLogoutMessageSentCount
        );
        assertEquals(
            String.format("Expected logout message received count: %d.", expectedLogoutMessageReceivedCount),
            expectedLogoutMessageReceivedCount,
            actualLogoutMessageReceivedCount
        );
        assertEquals(
            String.format("Expected session reset count: %d.", expectedSessionResetCount),
            expectedSessionResetCount,
            actualSessionResets
        );
        assertEquals(
            String.format("Expected disconnect called: %b.", expectedDisconnectCalled),
            expectedDisconnectCalled,
            actualDisconnectCalled
        );
    }

    private News createPossDupAppMessage(int sequence) {
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

    private Session setUpSession(Application application, boolean isInitiator,
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

    private Session setUpFileStoreSession(Application application,
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

    private Message createLogonResponse(final SessionID sessionID,
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

    private void logonTo(Session session) throws FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType,
            IOException, InvalidMessage {
        logonTo(session, 1);
    }

    private void logonTo(Session session, int sequence) throws FieldNotFound,
            RejectLogon, IncorrectDataFormat, IncorrectTagValue,
            UnsupportedMessageType, IOException, InvalidMessage {
        final Logon receivedLogon = new Logon();
        setUpHeader(session.getSessionID(), receivedLogon, true, sequence);
        receivedLogon.setInt(HeartBtInt.FIELD, 30);
        receivedLogon.setInt(EncryptMethod.FIELD, 0);
        receivedLogon.toString();   // calculate length and checksum
        session.next(receivedLogon);
    }

    private void logoutFrom(Session session, int sequence)
            throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        final Logout receivedLogout = new Logout();
        setUpHeader(session.getSessionID(), receivedLogout, true, sequence);
        session.next(receivedLogout);
    }

    private void setUpHeader(SessionID sessionID, Message message,
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

    private class UnitTestResponder implements Responder {
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

    @Test
    public void testSendWithAllowPosDupAsFalse_ShouldRemovePossDupFlagAndOrigSendingTime() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID, application, false, false, true, true, null);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        logonTo(session);

        session.send(createPossDupAppMessage(1), false);

        final Message sentMessage = new Message(responder.sentMessageData);

        assertFalse(sentMessage.getHeader().isSetField(PossDupFlag.FIELD));
        assertFalse(sentMessage.getHeader().isSetField(OrigSendingTime.FIELD));
    }

    @Test
    public void testSendWithAllowPosDupAsFalse_ShouldRemovePossDupFlagAndOrigSendingTime_GivenAllowPosDupConfigurationPropertySetToTrue() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID, application, false, false, true, true, null);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        session.setAllowPosDup(true);
        logonTo(session);
        session.send(createPossDupAppMessage(1), false);

        final Message sentMessage = new Message(responder.sentMessageData);

        assertFalse(sentMessage.getHeader().isSetField(PossDupFlag.FIELD));
        assertFalse(sentMessage.getHeader().isSetField(OrigSendingTime.FIELD));
    }

    @Test
    public void testSendWithAllowPosDupAsTrue_ShouldKeepPossDupFlagAndOrigSendingTime() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID, application, false, false, true, true, null);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        logonTo(session);
        session.send(createPossDupAppMessage(1), true);

        final Message sentMessage = new Message(responder.sentMessageData);

        assertTrue(sentMessage.getHeader().isSetField(PossDupFlag.FIELD));
        assertTrue(sentMessage.getHeader().isSetField(OrigSendingTime.FIELD));
    }

    @Test
    public void testSend_ShouldKeepPossDupFlagAndOrigSendingTime_GivenAllowPosDupConfigurationPropertySetToTrue() throws Exception {
        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID, application, false, false, true, true, null);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        session.setAllowPosDup(true);
        logonTo(session);
        session.send(createPossDupAppMessage(1));

        final Message sentMessage = new Message(responder.sentMessageData);

        assertTrue(sentMessage.getHeader().isSetField(PossDupFlag.FIELD));
        assertTrue(sentMessage.getHeader().isSetField(OrigSendingTime.FIELD));
    }
}
