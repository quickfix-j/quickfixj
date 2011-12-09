package quickfix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static quickfix.SessionFactoryTestSupport.createSession;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.EndSeqNo;
import quickfix.field.Headline;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.PossDupFlag;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.field.converter.UtcTimestampConverter;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.News;
import quickfix.fix44.Reject;
import quickfix.fix44.ResendRequest;
import quickfix.fix44.TestRequest;
import quickfix.test.util.ReflectionUtil;

/**
 * Note: most session tests are in the form of acceptance tests.
 *
 */
public class SessionTest {

    @Test
    public void testDisposalOfFileResources() throws Exception {
        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        final MessageStoreFactory mockMessageStoreFactory = mock(MessageStoreFactory.class);
        final CloseableMessageStore mockMessageStore = mock(CloseableMessageStore.class);
        stub(mockMessageStoreFactory.create(sessionID)).toReturn(mockMessageStore);

        final LogFactory mockLogFactory = mock(LogFactory.class);
        final CloseableLog mockLog = mock(CloseableLog.class);
        stub(mockLogFactory.create(sessionID)).toReturn(mockLog);

        final Session session = new Session(application, mockMessageStoreFactory, sessionID, null,
                null, mockLogFactory, new DefaultMessageFactory(), 30, false, 30, true, true,
                false, false, false, false, false, true, false, 1.5, null, true, new int[] { 5 },
                false, false, false, true, false, null, true,0, false, false);

        // Simulate socket disconnect
        session.setResponder(null);

        session.close();

        verify(mockMessageStore).close();
        verifyNoMoreInteractions(mockMessageStore);

        verify(mockLog, atLeastOnce()).onEvent(anyString());
        verify(mockLog).close();
        verifyNoMoreInteractions(mockLog);
    }

    /**
     * This is a smoke test for handling noncloseable resources. Obviously, these
     * resources should not be closed. If they are, it will generate an error (probably
     * a class cast exception).
     * @throws Exception
     */
    @Test
    public void testNondisposableFileResources() throws Exception {
        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        final MessageStoreFactory mockMessageStoreFactory = mock(MessageStoreFactory.class);
        final MessageStore mockMessageStore = mock(MessageStore.class);
        stub(mockMessageStoreFactory.create(sessionID)).toReturn(mockMessageStore);

        final LogFactory mockLogFactory = mock(LogFactory.class);
        final Log mockLog = mock(Log.class);
        stub(mockLogFactory.create(sessionID)).toReturn(mockLog);

        final Session session = new Session(application, mockMessageStoreFactory, sessionID, null,
                null, mockLogFactory, new DefaultMessageFactory(), 30, false, 30, true, true,
                false, false, false, false, false, true, false, 1.5, null, true, new int[] { 5 },
                false, false, false, true, false, null, true,0, false, false);

        // Simulate socket disconnect
        session.setResponder(null);

        session.close();

        verifyNoMoreInteractions(mockMessageStore);

        verify(mockLog, atLeastOnce()).onEvent(anyString());
        verifyNoMoreInteractions(mockLog);
    }

    private interface CloseableMessageStore extends MessageStore, Closeable {
    }

    private interface CloseableLog extends Log, Closeable {
    }

    @Test
    public void testSessionWithoutValidateSequenceNumbers() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = createSession(sessionID, application, true, true, false);

        final UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        session.logon();
        session.next();

        final Message logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 1));

        assertEquals(1, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        session.next(createHeartbeatMessage(1002));
        assertFalse(ResendRequest.MSGTYPE.equals(application.lastToAdminMessage().getHeader().getString(MsgType.FIELD)));

        session.next(createHeartbeatMessage(1003));
        assertFalse(ResendRequest.MSGTYPE.equals(application.lastToAdminMessage().getHeader().getString(MsgType.FIELD)));

        session.next(createHeartbeatMessage(1001));
        assertFalse(ResendRequest.MSGTYPE.equals(application.lastToAdminMessage().getHeader().getString(MsgType.FIELD)));
    }

    // QFJ-654
    @Test
    public void testPossDupMessageWithoutOrigSendingTime() throws Exception {

        // test default behaviour, i.e. that the message is rejected
        // when not setting 122/OrigSendingTime
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        UnitTestApplication application = new UnitTestApplication();
        Session session = createSession(sessionID, application, true, true, true);
        UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        session.logon();
        session.next();

        Message logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 1));

        assertEquals(1, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        News newsMessage = createAppMessage(2);
        newsMessage.getHeader().setBoolean(PossDupFlag.FIELD, true);
        session.next(newsMessage);
        assertTrue(Reject.MSGTYPE.equals(application.lastToAdminMessage().getHeader()
                .getString(MsgType.FIELD)));
        assertNull(application.lastFromAppMessage());


        // test that the message is NOT rejected when
        // setting rejectInvalidMessage=false
        // and not setting 122/OrigSendingTime
        application = new UnitTestApplication();
        session = createSession(sessionID, application, true, true, true);
        responder = new UnitTestResponder();
        session.setRejectInvalidMessage(false);

        session.setResponder(responder);

        session.logon();
        session.next();

        logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 1));

        assertEquals(1, application.lastToAdminMessage().getHeader().getInt(MsgSeqNum.FIELD));
        assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
        assertEquals(2, session.getStore().getNextSenderMsgSeqNum());

        newsMessage = createAppMessage(2);
        newsMessage.getHeader().setBoolean(PossDupFlag.FIELD, true);
        session.next(newsMessage);
        assertTrue(Logon.MSGTYPE.equals(application.lastToAdminMessage().getHeader()
                .getString(MsgType.FIELD)));
        assertNull(application.lastToAppMessage());
        assertTrue(News.MSGTYPE.equals(application.lastFromAppMessage().getHeader()
                .getString(MsgType.FIELD)));
    }

    @Test
    public void testInferResetSeqNumAcceptedWithNonInitialSequenceNumber() throws Exception {

        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = createSession(sessionID, application, true, true);

        final UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        session.logon();
        session.next();

        final Message logonRequest = new Message(responder.sentMessageData);
        session.next(createLogonResponse(sessionID, logonRequest, 2));

        assertTrue("Should not infer a reset when the sequence number is not one",
                responder.disconnectCalled);
    }

    @Test
    public void testInferResetSeqNumAccepted() throws Exception {

        final Application application = new UnitTestApplication();

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = createSession(sessionID, application, true, true);

        final UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);

        session.logon();
        session.next();

        final Message logonRequest = new Message(responder.sentMessageData);
        final Message logonResponse = createLogonResponse(sessionID, logonRequest, 1);
        session.next(logonResponse);

        assertFalse("Should not disconnect when an accepted reset is inferred",
                responder.disconnectCalled);
    }

    // QFJ-650
    @Test
    public void testLogoutOnMissingMsgSeqNum() throws Exception {

        final Application application = new UnitTestApplication();
        final Session session = setUpSession(application, false, new UnitTestResponder());
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
        logonTo(session, 3);
        assertEquals(5, state.getNextSenderMsgSeqNum());
        assertEquals(4, state.getNextTargetMsgSeqNum());
        assertTrue("Session should be connected", session.isLoggedOn());

    }

    /**
     * QFJ-357
     * Until QF/J 1.5.1 the behaviour was observed that a Logout message was always sent as first message.
     * This could be be provoked by altering the Session file to contain an old timestamp and deleting
     * the filestore files to set the sequence numbers to 1. On the next Logon attempt, the Session would get reset
     * and a Logout message would get sent.
     * On versions newer than 1.5.1 this test should pass.
     */
    @Test
    public void testLogonIsFirstMessage() throws Exception {

        // set up some basic stuff
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);

        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        final Session session = setUpFileStoreSession(application, false,
                new UnitTestResponder(), settings, sessionID);
        final SessionState state = getSessionState(session);

        assertEquals(1, state.getNextSenderMsgSeqNum());
        assertEquals(1, state.getNextTargetMsgSeqNum());

        logonTo(session);

        // we should only answer with a Logon message
        assertEquals(1, application.toAdminMessages.size());
        for (Message message : application.toAdminMessages) {
            assertEquals(MsgType.LOGON, message.getHeader().getString(MsgType.FIELD));
        }

        // no reset should have been triggered by QF/J after the Logon attempt
        assertEquals(0, application.sessionResets);
        assertTrue("Session should be connected", session.isLoggedOn());

        assertEquals(2, state.getNextSenderMsgSeqNum());
        assertEquals(2, state.getNextTargetMsgSeqNum());

    }

    /**
     * QFJ-357
     * This test should make sure that outside the Session time _only_ a Logout
     * message is sent to the counterparty. Formerly it could be observed sometimes
     * that there was a Logon message with a Logout message immediately following.
     */
    @Test
    public void testLogonOutsideSessionTimeIsRejected() throws Exception {

        // set up some basic stuff
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        // construct a session schedule which will almost never accept a connection
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        settings.setString("StartTime", "00:00:01");
        settings.setString("EndTime", "00:00:02");
        settings.setString("StartDay", DayConverter.toString(calendar.get(Calendar.DAY_OF_WEEK)));
        settings.setString("EndDay", DayConverter.toString(calendar.get(Calendar.DAY_OF_WEEK)));

        setupFileStoreForQFJ357(sessionID, settings);

        // Session gets constructed, triggering a reset
        final UnitTestApplication application = new UnitTestApplication();
        final Session session = setUpFileStoreSession(application, false, new UnitTestResponder(),
                settings, sessionID);
        final SessionState state = getSessionState(session);

        assertEquals(1, state.getNextSenderMsgSeqNum());
        assertEquals(1, state.getNextTargetMsgSeqNum());

        logonTo(session);

        // we should only answer with a Logout message
        assertEquals(1, application.toAdminMessages.size());
        for (Message message : application.toAdminMessages) {
            assertEquals(MsgType.LOGOUT, message.getHeader().getString(MsgType.FIELD));
        }

        assertFalse("Session should not be connected", session.isLoggedOn());

        // Normally, next() is called periodically; we only do it here to reset the seqNums.
        // The seqNums should be reset because it was tried to establish a connection
        // outside of the session schedule.
        session.next();
        assertEquals(1, state.getNextSenderMsgSeqNum());
        assertEquals(1, state.getNextTargetMsgSeqNum());
    }

    // QFJ-357
    private void setupFileStoreForQFJ357(final SessionID sessionID, final SessionSettings settings)
            throws ConfigError, FieldConvertError, FileNotFoundException, IOException {

        // construct the path to the filestore (mostly c&p from FileStore class)
        settings.setString(FileStoreFactory.SETTING_FILE_STORE_PATH,
                System.getProperty("java.io.tmpdir"));
        final String path = settings.getString(FileStoreFactory.SETTING_FILE_STORE_PATH);
        final String fullPath = new File(path == null ? "." : path).getAbsolutePath();
        final String sessionName = FileUtil.sessionIdFileName(sessionID);
        final String prefix = FileUtil.fileAppendPath(fullPath, sessionName + ".");
        final String sessionFileName = prefix + "session";
        final DataOutputStream sessionTimeOutput = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(sessionFileName, false)));
        try {
            // removing the file does NOT trigger the reset in the Session
            // constructor, so we fake an outdated session
            sessionTimeOutput.writeUTF(UtcTimestampConverter.convert(new Date(0), true));
        } finally {
            sessionTimeOutput.close();
        }

        // delete files to have the message store reset seqNums to 1
        // (on QF/J 1.5.1 this triggered the needReset() method to return false)
        final String msgFileName = prefix + "body";
        final String headerFileName = prefix + "header";
        final String seqNumFileName = prefix + "seqnums";
        new File(msgFileName).delete();
        new File(headerFileName).delete();
        new File(seqNumFileName).delete();
    }

    // QFJ-60
    @Test
    public void testRejectLogon() throws Exception {

        // Create application that rejects all logons
        final Application application = new UnitTestApplication() {

            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                throw new RejectLogon("FOR TEST");
            }

        };

        final Session session = setUpSession(application, false, new UnitTestResponder());
        final SessionState state = getSessionState(session);

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

    @Test
    //QFJ-339
    public void testSendingTimeRejectBeforeLogon() throws Exception {
        final Session session = setUpSession(new UnitTestApplication(), false,
                new UnitTestResponder());

        final Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "SENDER");
        message.getHeader().setString(TargetCompID.FIELD, "TARGET");
        message.getHeader().setString(SendingTime.FIELD,
                UtcTimestampConverter.convert(new Date(0), false));
        message.getHeader().setInt(MsgSeqNum.FIELD, 1);

        final SessionStateListener mockStateListener = mock(SessionStateListener.class);
        session.addStateListener(mockStateListener);

        session.next(message);

        verify(mockStateListener).onDisconnect();
        verifyNoMoreInteractions(mockStateListener);
    }

    @Test
    //QFJ-339
    public void testCorruptLogonReject() throws Exception {
        final Session session = setUpSession(new UnitTestApplication(), false,
                new UnitTestResponder());

        final Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "SENDER");
        message.getHeader().setString(TargetCompID.FIELD, "TARGET");
        message.getHeader().setString(SendingTime.FIELD,
                UtcTimestampConverter.convert(new Date(), false));
        message.getHeader().setInt(MsgSeqNum.FIELD, 100);

        final SessionStateListener mockStateListener = mock(SessionStateListener.class);
        session.addStateListener(mockStateListener);

        session.next(message);

        verify(mockStateListener).onDisconnect();
        verifyNoMoreInteractions(mockStateListener);
    }


    @Test
    public void testSequenceRollbackOnCallbackException() throws Exception {

        // Create application that rejects all logons
        final Application application = new UnitTestApplication() {

            @Override
            public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new RuntimeException("TEST");
            }

            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                if (message.getHeader().getString(MsgType.FIELD).equals(MsgType.LOGON)) {
                    return;
                }
                throw new RuntimeException("TEST");
            }

        };

        final Session session = setUpSession(application, false, new UnitTestResponder());
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

    private void processMessage(Session session, Message message) throws FieldNotFound,
            RejectLogon, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType,
            IOException, InvalidMessage {
        try {
            session.next(message);
        } catch (final Throwable e) {
            // This simulated the behavior of the QFJ connectors
            // The will just discard a message with an error (without
            // incrementing the sequence number).
        }
    }

    private Message createAdminMessage(int sequence) {
        final TestRequest msg = new TestRequest(new TestReqID("ID"));
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return msg;
    }

    private Message createHeartbeatMessage(int sequence) {
        final Heartbeat msg = new Heartbeat();
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return msg;
    }

    @Test
    public void testDontCatchErrorsFromCallback() throws Exception {

        // Create application that rejects all logons
        final Application application = new UnitTestApplication() {

            @Override
            public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
                super.fromApp(message, sessionId);
                throw new Error("TEST");
            }

        };

        final Session session = setUpSession(application, false, new UnitTestResponder());
        logonTo(session);

        try {
            session.next(createAppMessage(2));
            fail("No error thrown");
        } catch (final Error e) {
            assertEquals("TEST", e.getMessage());
        }
    }

    private News createAppMessage(int sequence) {
        final News news = new News(new Headline("Headline"));
        news.getHeader().setString(SenderCompID.FIELD, "TARGET");
        news.getHeader().setString(TargetCompID.FIELD, "SENDER");
        news.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        news.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return news;
    }

    private SessionState getSessionState(Session session) throws NoSuchFieldException,
            IllegalAccessException {
        final Field stateField = session.getClass().getDeclaredField("state");
        stateField.setAccessible(true);
        final SessionState state = (SessionState) stateField.get(session);
        return state;
    }

    /** Veifies that the session has been registered before the logger tries accessing it
     * Use case:
     *  JdbcLogger not setup correctly, barfs during Session creation, tries to log and
     * can't find the session in global session list yet.
     */
    @Test
    public void testSessionRegisteredCorrectly() throws Exception {
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        JdbcTestSupport.setHypersonicSettings(settings);
        // do not initialize the SQL tables so that the JdbcLog will fail
        final SessionID sessionID = new SessionID("FIX.4.2", "SENDER-sessionRegister",
                "TARGET-sessionRegister");
        settings.setString(sessionID, "ConnectionType", "acceptor");
        final DefaultSessionFactory factory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new JdbcLogFactory(settings));
        try {
            final Session session = factory.create(sessionID, settings);
            assertNotNull(session);
        } catch (final NullPointerException nex) {
            fail("Session not registering correctly so JdbcLog fails while printing an error: "
                    + nex.getMessage());
        }
    }

    @Test
    public void testNonpersistedGapFill() throws Exception {
        final SessionID sessionID = new SessionID("FIX.4.4:SENDER->TARGET");
        final Session session = SessionFactoryTestSupport.createNonpersistedSession(sessionID,
                new UnitTestApplication(), false);
        session.getStore().setNextTargetMsgSeqNum(200);
        final SessionState state = ReflectionUtil.getField(session, "state", SessionState.class);
        state.setLogonReceived(true);
        final ResendRequest resendRequest = new ResendRequest();
        resendRequest.getHeader().setField(new SenderCompID(sessionID.getTargetCompID()));
        resendRequest.getHeader().setField(new TargetCompID(sessionID.getSenderCompID()));
        resendRequest.getHeader().setField(new SendingTime(new Date()));
        resendRequest.getHeader().setField(new MsgSeqNum(200));
        resendRequest.set(new BeginSeqNo(1));
        resendRequest.set(new EndSeqNo(100));
        session.next(resendRequest);
        assertEquals(201, state.getNextTargetMsgSeqNum());
    }


    @Test
    //QFJ-457
    public void testAcceptorRelogon() throws Exception {
        final UnitTestApplication application = new UnitTestApplication() ;
        final Session session = setUpSession(application , false,
                new UnitTestResponder());

        logonTo(session);
        assertTrue(session.isEnabled());
        assertTrue(session.isLoggedOn());

        session.logout();
        session.next();

        final Message logout = new Logout();
        logout.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logout.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logout.getHeader().setString(SendingTime.FIELD,
                UtcTimestampConverter.convert(new Date(), false));
        logout.getHeader().setInt(MsgSeqNum.FIELD, 2);
        session.next(logout);

//        session.reset();
        assertFalse(session.isLoggedOn());
        logonTo(session, 3);
        Message lastToAdminMessage = application.lastToAdminMessage();
        assertFalse(Logout.MSGTYPE .equals(lastToAdminMessage.getHeader().getString(MsgType.FIELD)));

    }

    private Session setUpSession(Application application, boolean isInitiator, Responder responder)
            throws NoSuchFieldException, IllegalAccessException {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID, application,
                isInitiator);
        session.setResponder(responder);
        final SessionState state = getSessionState(session);
        assertEquals(isInitiator, state.isInitiator());
        assertEquals(false, state.isLogonSent());
        assertEquals(false, state.isLogonReceived());
        assertEquals(false, state.isLogonAlreadySent());
        assertEquals(isInitiator, state.isLogonSendNeeded());
        assertEquals(false, state.isLogonTimedOut());
        assertEquals(false, state.isLogoutSent());
        assertEquals(false, state.isLogoutReceived());
        assertEquals(false, state.isLogoutTimedOut());
        return session;
    }

    private Session setUpFileStoreSession(Application application, boolean isInitiator,
            Responder responder, SessionSettings settings, SessionID sessionID)
            throws NoSuchFieldException, IllegalAccessException, ConfigError, FieldConvertError,
            IOException {

        final SessionSchedule sessionSchedule = new SessionSchedule(settings, sessionID);
        final Session session = SessionFactoryTestSupport.createFileStoreSession(sessionID,
                application, isInitiator, settings, sessionSchedule);
        session.setResponder(responder);
        final SessionState state = getSessionState(session);
        assertEquals(isInitiator, state.isInitiator());
        assertEquals(false, state.isLogonSent());
        assertEquals(false, state.isLogonReceived());
        assertEquals(false, state.isLogonAlreadySent());
        assertEquals(isInitiator, state.isLogonSendNeeded());
        assertEquals(false, state.isLogonTimedOut());
        assertEquals(false, state.isLogoutSent());
        assertEquals(false, state.isLogoutReceived());
        assertEquals(false, state.isLogoutTimedOut());
        return session;
    }

    private Message createLogonResponse(final SessionID sessionID, final Message logonRequest,
            int responseSequenceNumber) throws FieldNotFound {
        final Message logonResponse = new DefaultMessageFactory().create(
                sessionID.getBeginString(), MsgType.LOGON);
        logonResponse.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
        logonResponse.setInt(HeartBtInt.FIELD, logonRequest.getInt(HeartBtInt.FIELD));
        final Message.Header header = logonResponse.getHeader();
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        header.setInt(MsgSeqNum.FIELD, responseSequenceNumber);
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getDate(), true);
        return logonResponse;
    }

    private void logonTo(Session session) throws FieldNotFound, RejectLogon, IncorrectDataFormat,
            IncorrectTagValue, UnsupportedMessageType, IOException, InvalidMessage {
        logonTo(session, 1);
    }

    private void logonTo(Session session, int sequence) throws FieldNotFound, RejectLogon,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType, IOException,
            InvalidMessage {
        final Logon receivedLogon = new Logon();
        setUpHeader(session.getSessionID(), receivedLogon, true, sequence);
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

    private class UnitTestResponder implements Responder {
        public String sentMessageData;
        public boolean disconnectCalled;

        public boolean send(String data) {
            sentMessageData = data;
            return true;
        }

        public String getRemoteIPAddress() {
            return null;
        }

        public void disconnect() {
            disconnectCalled = true;
        }
    }

}
