package quickfix.mina.initiator;

import org.apache.mina.core.session.IoSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import quickfix.*;
import quickfix.FixVersions;
import quickfix.Message;
import quickfix.Responder;
import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.SessionFactoryTestSupport.Builder;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SessionSettingsTest;
import quickfix.UnitTestApplication;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.Text;
import quickfix.fixt11.Logon;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;
import quickfix.mina.SessionConnectorStub;
import quickfix.mina.SingleThreadedEventHandlingStrategy;
import quickfix.mina.TestDataDictionaryProvider;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class InitiatorIoHandlerTest {

    // QFJ-976
    @Test
    public void testRejectGarbledMessage() throws Exception {
        final SessionSettings settings = SessionSettingsTest.setUpSession(null);
        final SessionConnector connector = new SessionConnectorStub(settings);
        final SingleThreadedEventHandlingStrategy eventHandlingStrategy =
                new SingleThreadedEventHandlingStrategy(connector, 1000);
        final IoSession mockIoSession = mock(IoSession.class);
        final Responder responder = mock(Responder.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final UnitTestApplication unitTestApplication = new UnitTestApplication();

        try (Session session = SessionFactoryTestSupport
                .createSession(sessionID, unitTestApplication, false, true, true, true, new DefaultApplVerID(
                        ApplVerID.FIX50SP2))) {
            session.setRejectGarbledMessage(true);
            eventHandlingStrategy.blockInThread();
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final InitiatorIoHandler handler = new InitiatorIoHandler(session,
                    settings, new NetworkingOptions(new Properties()), eventHandlingStrategy);

            final DefaultApplVerID defaultApplVerID = new DefaultApplVerID(ApplVerID.FIX50SP2);
            final Logon message = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER),
                    new HeartBtInt(30), defaultApplVerID);
            message.getHeader().setString(TargetCompID.FIELD, sessionID.getSenderCompID());
            message.getHeader().setString(SenderCompID.FIELD, sessionID.getTargetCompID());
            message.getHeader().setField(new SendingTime(LocalDateTime.now(ZoneOffset.UTC)));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);

            handler.messageReceived(mockIoSession, message.toString());
            session.setResponder(responder);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            assertEquals(2, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(2, session.getStore().getNextSenderMsgSeqNum());
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(session);

            // garbled: character as group count
            String fixString = "8=FIXT.1.19=6835=B34=249=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=a10=248";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(3, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(3, session.getStore().getNextSenderMsgSeqNum());

            Message lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

            // garbled: missing msgtype
            fixString = "8=FIXT.1.19=6834=349=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=a10=248";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(4, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(4, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

            // garbled: wrong group count
            fixString = "8=FIXT.1.19=6835=B34=449=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=110=256";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(5, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(5, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Missing first tag in repeating group 33. Expected 58 to be the first tag in the group, field=10", lastToAdminMessage.getString(Text.FIELD));

            // garbled: wrong checksum
            fixString = "8=FIXT.1.19=6835=B34=549=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=010=256";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(6, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(6, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

            // garbled: invalid tag 49garbled
            fixString = "8=FIXT.1.19=6835=B34=649garbled=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=110=256";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(7, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(7, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

        } finally {
            eventHandlingStrategy.stopHandlingMessages(true);
        }
    }

    @Test
    public void testUnparsableMessageWithMsgTypeLogs() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET");
        final LogFactory mockLogFactory = mock(LogFactory.class);
        final Log mockLog = mock(Log.class);
        when(mockLogFactory.create(sessionID)).thenReturn(mockLog);
        final Session session = createSession(sessionID, mockLogFactory);
        SessionSettings sessionSettings = mock(SessionSettings.class);

        when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(session);

        InitiatorIoHandler handler = new InitiatorIoHandler(session, sessionSettings, new NetworkingOptions(new Properties()),
                mockEventHandlingStrategy);

        String message = "8=FIX.4.2\u000135=D\u0001";
        handler.messageReceived(mockIoSession, message);

        verify(mockLog).onErrorEvent(ErrorEventReasons.INVALID_MESSAGE,"Invalid message: Header fields out of order in " + message);
        verify(mockLog).onInvalidMessage(message, "Header fields out of order in " + message);
    }

    @Test
    public void testMessageWhichParsesWithExceptionLogs() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings sessionSettings = mock(SessionSettings.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER", "TARGET");
        final LogFactory mockLogFactory = mock(LogFactory.class);
        final Log mockLog = mock(Log.class);
        when(mockLogFactory.create(sessionID)).thenReturn(mockLog);
        final Session session = createSession(sessionID, mockLogFactory);

        when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(session);

        InitiatorIoHandler handler = new InitiatorIoHandler(session, sessionSettings,
            new NetworkingOptions(new Properties()),
                mockEventHandlingStrategy);

        String message = "8=FIX.4.2\u00019=123\u000135=D\u00011=abc\u00011=duplicate\u0001";
        handler.messageReceived(mockIoSession, message);

        verify(mockLog).onInvalidMessage(message, "Tag appears more than once, field=1");
    }

    private static Session createSession(SessionID sessionID, LogFactory logFactory) {
        return new Builder().setSessionId(sessionID).setApplication(new UnitTestApplication()).setIsInitiator(true)
                .setDataDictionaryProvider(new TestDataDictionaryProvider()).setLogFactory(logFactory)
                .build();
    }

}
