/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina.acceptor;

import org.apache.mina.core.session.IoSession;
import org.junit.Test;
import quickfix.FixVersions;
import quickfix.Message;
import quickfix.MessageUtils;
import quickfix.Responder;
import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SessionSettingsTest;
import quickfix.UnitTestApplication;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.Headline;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.Text;
import quickfix.fix44.Logout;
import quickfix.fixt11.Logon;
import quickfix.fix50.News;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.SessionConnector;
import quickfix.mina.SessionConnectorStub;
import quickfix.mina.SingleThreadedEventHandlingStrategy;
import quickfix.mina.acceptor.AbstractSocketAcceptor.StaticAcceptorSessionProvider;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class AcceptorIoHandlerTest {

    /**
     * QFJ-592
     * We need to make sure that the targetDefaultApplVerID gets set as early as possible,
     * hence we set it before the Logon message is put to the event queue.
     */
    @Test
    public void testFIXTLogonAndApplVerID() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        try (Session session = SessionFactoryTestSupport.createSession(sessionID,
                new UnitTestApplication(), false)) {
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(sessionID, session);
            final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

            final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                    settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

            final DefaultApplVerID defaultApplVerID = new DefaultApplVerID(ApplVerID.FIX50SP2);
            final Logon message = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER),
                    new HeartBtInt(30), defaultApplVerID);
            message.getHeader().setString(TargetCompID.FIELD, sessionID.getSenderCompID());
            message.getHeader().setString(SenderCompID.FIELD, sessionID.getTargetCompID());
            message.getHeader().setField(new SendingTime(LocalDateTime.now()));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);

            handler.processMessage(mockIoSession, message);
            assertEquals(defaultApplVerID.getValue(), session.getTargetDefaultApplicationVersionID()
                    .getValue());
        }
    }

    @Test
    public void testFIXTLogonAndUnknownApplVerID() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final UnitTestApplication unitTestApplication = new UnitTestApplication();
        try (Session session = SessionFactoryTestSupport.createSession(sessionID, unitTestApplication, false, false, true, true, new DefaultApplVerID(DefaultApplVerID.FIX50SP2))) {
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(sessionID, session);
            final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

            final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                    settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

            final DefaultApplVerID defaultApplVerID = new DefaultApplVerID("33");
            final Logon message = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER),
                    new HeartBtInt(30), defaultApplVerID);
            message.getHeader().setString(TargetCompID.FIELD, sessionID.getSenderCompID());
            message.getHeader().setString(SenderCompID.FIELD, sessionID.getTargetCompID());
            message.getHeader().setField(new SendingTime(LocalDateTime.now()));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);

            handler.messageReceived(mockIoSession, message.toString());
            session.next(message);

            Message lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.LOGOUT, MessageUtils.getMessageType(lastToAdminMessage.toString()));
            assertTrue(lastToAdminMessage.getString(Text.FIELD).contains("Invalid DefaultApplVerID=33"));
        }
    }

    @Test
    public void testMessageBeforeLogon() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);
        when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        HashMap<SessionID, Session> acceptorSessions = new HashMap<>();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        handler.processMessage(mockIoSession, new Logout());

        verify(mockIoSession).getAttribute("QF_SESSION");
        verifyNoMoreInteractions(mockEventHandlingStrategy);
    }

    private StaticAcceptorSessionProvider createSessionProvider(HashMap<SessionID, Session> acceptorSessions) {
        return new AbstractSocketAcceptor.StaticAcceptorSessionProvider(acceptorSessions);
    }

    @Test
    public void testMessageBeforeLogonWithBoundSession() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);

        try (Session qfSession = SessionFactoryTestSupport.createSession()) {
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(qfSession);

            EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

            Logout logout = new Logout();
            logout.getHeader()
                    .setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
            logout.getHeader()
                    .setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

            HashMap<SessionID, Session> acceptorSessions = new HashMap<>();

            AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                    settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

            handler.processMessage(mockIoSession, logout);

            verify(mockIoSession).getAttribute("QF_SESSION");
            verify(mockEventHandlingStrategy).onMessage(qfSession, logout);
        }
    }

    @Test
    public void testMessageBeforeLogonWithKnownButUnboundSession() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);

        when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        try (Session qfSession = SessionFactoryTestSupport.createSession()) {

            Logout logout = new Logout();
            logout.getHeader()
                    .setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
            logout.getHeader()
                    .setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

            // Expect that onMessage will not be called
            //mockEventHandlingStrategy.onMessage(qfSession, logout);

            HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(qfSession.getSessionID(), qfSession);
            AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                    settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

            handler.processMessage(mockIoSession, logout);

            verify(mockIoSession).getAttribute("QF_SESSION");
            verifyNoMoreInteractions(mockEventHandlingStrategy);
        }
    }

    // QFJ-933
    @Test
    public void testLogonWithoutHeartBtInt() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);
        SessionSettings settings = mock(SessionSettings.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        try (Session session = SessionFactoryTestSupport.createSession(sessionID,
                new UnitTestApplication(), false)) {
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(sessionID, session);
            final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

            final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                    settings, new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

            final DefaultApplVerID defaultApplVerID = new DefaultApplVerID(ApplVerID.FIX50SP2);
            final Logon message = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER),
                    new HeartBtInt(30), defaultApplVerID);
            message.getHeader().setString(TargetCompID.FIELD, sessionID.getSenderCompID());
            message.getHeader().setString(SenderCompID.FIELD, sessionID.getTargetCompID());
            message.getHeader().setField(new SendingTime(LocalDateTime.now()));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);
            // remove HeartBtInt field and make sure there is no Exception
            message.removeField(HeartBtInt.FIELD);
            handler.processMessage(mockIoSession, message);
            // No exception should be thrown!
        }
    }

    // QFJ-950
    @Test
    public void testRejectGarbledMessage() throws Exception {
        SessionSettings settings = SessionSettingsTest.setUpSession(null);
        SessionConnector connector = new SessionConnectorStub(settings);
        SingleThreadedEventHandlingStrategy eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(connector, 1000);
        IoSession mockIoSession = mock(IoSession.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final UnitTestApplication unitTestApplication = new UnitTestApplication();
        try (Session session = SessionFactoryTestSupport.createSession(sessionID, unitTestApplication, false, true, true, true, new DefaultApplVerID(ApplVerID.FIX50SP2))) {
            session.setRejectGarbledMessage(true);
            eventHandlingStrategy.blockInThread();
            Responder responder = new UnitTestResponder();
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(sessionID, session);
            final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

            final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
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

            // garbled: wrong checksum
            fixString = "8=FIXT.1.19=6835=B34=449=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=110=256";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(5, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(5, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

            // garbled: invalid tag 49garbled
            fixString = "8=FIXT.1.19=6835=B34=549garbled=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=110=256";
            handler.messageReceived(mockIoSession, fixString);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            // ensure that seqnums are incremented (i.e. message is not ignored)
            assertEquals(6, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(6, session.getStore().getNextSenderMsgSeqNum());

            lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertEquals(MsgType.REJECT, lastToAdminMessage.getHeader().getString(MsgType.FIELD));
            assertEquals("Message failed basic validity check", lastToAdminMessage.getString(Text.FIELD));

        } finally {
            eventHandlingStrategy.stopHandlingMessages(true);
        }
    }

    // QFJ-976
    @Test
    public void testRejectGarbledMessageWithoutMsgTypeBeforeSessionIsCreated() throws Exception {
        SessionSettings settings = SessionSettingsTest.setUpSession(null);
        SessionConnector connector = new SessionConnectorStub(settings);
        SingleThreadedEventHandlingStrategy eventHandlingStrategy = new SingleThreadedEventHandlingStrategy(connector, 1000);
        IoSession mockIoSession = mock(IoSession.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final UnitTestApplication unitTestApplication = new UnitTestApplication();

        try (Session session = SessionFactoryTestSupport.createSession(sessionID, unitTestApplication, false, true, true, true, new DefaultApplVerID(ApplVerID.FIX50SP2))) {
            session.setRejectGarbledMessage(true);
            eventHandlingStrategy.blockInThread();
            Responder responder = new UnitTestResponder();
            when(mockIoSession.getAttribute("QF_SESSION")).thenReturn(null);    // to create a new Session

            final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
            acceptorSessions.put(sessionID, session);
            final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

            final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                    settings, new NetworkingOptions(new Properties()), eventHandlingStrategy);

            // garbled: missing msgtype
            String fixString = "8=FIXT.1.19=6834=349=TARGET52=20180623-22:06:28.97756=SENDER148=foo33=a10=248";

            handler.messageReceived(mockIoSession, fixString);
            session.setResponder(responder);
            // wait some time for EventHandlingStrategy to poll the message
            Thread.sleep(EventHandlingStrategy.THREAD_WAIT_FOR_MESSAGE_MS * 2);

            assertEquals(1, session.getStore().getNextTargetMsgSeqNum());
            assertEquals(1, session.getStore().getNextSenderMsgSeqNum());

            Message lastToAdminMessage = unitTestApplication.lastToAdminMessage();
            assertNull(lastToAdminMessage);
        } finally {
            eventHandlingStrategy.stopHandlingMessages(true);
        }
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
}
