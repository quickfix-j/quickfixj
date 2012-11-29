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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.HashMap;
import java.util.Properties;

import org.apache.mina.common.IoSession;
import org.junit.Test;

import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.SessionID;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;
import quickfix.fix44.Logout;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.acceptor.AbstractSocketAcceptor.StaticAcceptorSessionProvider;

public class AcceptorIoHandlerTest {
    
    @Test
    public void testMessageBeforeLogon() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        stub(mockIoSession.getAttribute("QF_SESSION")).toReturn(null);

        EventHandlingStrategy mockEventHandlingStrategy = mock(EventHandlingStrategy.class);

        HashMap<SessionID, Session> acceptorSessions = new HashMap<SessionID, Session>();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        handler.processMessage(mockIoSession, new Logout());

        verify(mockIoSession).getAttribute("QF_SESSION");
        verifyNoMoreInteractions(mockEventHandlingStrategy);
    }

    private StaticAcceptorSessionProvider createSessionProvider(HashMap<SessionID,Session> acceptorSessions) {
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

        HashMap<SessionID, Session> acceptorSessions = new HashMap<SessionID, Session>();

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

        HashMap<SessionID, Session> acceptorSessions = new HashMap<SessionID, Session>();
        acceptorSessions.put(qfSession.getSessionID(), qfSession);

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        handler.processMessage(mockIoSession, logout);

        verify(mockIoSession).getAttribute("QF_SESSION");
        verifyNoMoreInteractions(mockEventHandlingStrategy);
    }
}
