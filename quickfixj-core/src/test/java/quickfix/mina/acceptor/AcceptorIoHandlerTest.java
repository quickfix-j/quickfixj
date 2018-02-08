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

import java.time.LocalDateTime;
import org.apache.mina.core.session.IoSession;
import org.junit.Test;
import quickfix.FixVersions;
import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.SessionID;
import quickfix.UnitTestApplication;
import quickfix.field.ApplVerID;
import quickfix.field.DefaultApplVerID;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.fix44.Logout;
import quickfix.fixt11.Logon;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.acceptor.AbstractSocketAcceptor.StaticAcceptorSessionProvider;

import java.util.HashMap;
import java.util.Properties;
import static junit.framework.TestCase.fail;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

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

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID,
                new UnitTestApplication(), false);
        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(null); // to create a new Session

        final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
        acceptorSessions.put(sessionID, session);
        final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

        final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

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

    @Test
    public void testMessageBeforeLogon() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(null);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        HashMap<SessionID, Session> acceptorSessions = new HashMap<>();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

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

        Session qfSession = SessionFactoryTestSupport.createSession();
        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(qfSession);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        Logout logout = new Logout();
        logout.getHeader()
                .setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
        logout.getHeader()
                .setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

        HashMap<SessionID, Session> acceptorSessions = new HashMap<>();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        handler.processMessage(mockIoSession, logout);

        verify(mockIoSession).getAttribute("QF_SESSION");
        verify(mockEventHandlingStrategy).onMessage(qfSession, logout);
    }

    @Test
    public void testMessageBeforeLogonWithKnownButUnboundSession() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);

        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(null);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        Session qfSession = SessionFactoryTestSupport.createSession();

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
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        handler.processMessage(mockIoSession, logout);

        verify(mockIoSession).getAttribute("QF_SESSION");
        verifyNoMoreInteractions(mockEventHandlingStrategy);
    }

    // QFJ-933
    @Test
    public void testLogonWithoutHeartBtInt() throws Exception {
        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);
        IoSession mockIoSession = mock(IoSession.class);

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIXT11, "SENDER",
                "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID,
                new UnitTestApplication(), false);
        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(null); // to create a new Session

        final HashMap<SessionID, Session> acceptorSessions = new HashMap<>();
        acceptorSessions.put(sessionID, session);
        final StaticAcceptorSessionProvider sessionProvider = createSessionProvider(acceptorSessions);

        final AcceptorIoHandler handler = new AcceptorIoHandler(sessionProvider,
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        final DefaultApplVerID defaultApplVerID = new DefaultApplVerID(ApplVerID.FIX50SP2);
        final Logon message = new Logon(new EncryptMethod(EncryptMethod.NONE_OTHER),
                new HeartBtInt(30), defaultApplVerID);
        message.getHeader().setString(TargetCompID.FIELD, sessionID.getSenderCompID());
        message.getHeader().setString(SenderCompID.FIELD, sessionID.getTargetCompID());
        message.getHeader().setField(new SendingTime(LocalDateTime.now()));
        message.getHeader().setInt(MsgSeqNum.FIELD, 1);
        // remove HeartBtInt field and make sure there is no Exception
        message.removeField(HeartBtInt.FIELD);
        try {
            handler.processMessage(mockIoSession, message);
        } catch (Exception e) {
            fail("No exception should be thrown! " + e);
        }
    }

}
