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

import java.util.HashMap;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.mina.common.IoSession;
import org.easymock.MockControl;

import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;
import quickfix.fix44.Logout;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.NetworkingOptions;
import quickfix.mina.acceptor.AbstractSocketAcceptor.StaticAcceptorSessionProvider;

public class AcceptorIoHandlerTest extends TestCase {
    public void testMessageBeforeLogon() throws Exception {
        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();
        mockIoSession.getAttribute("QF_SESSION");
        mockIoSessionControl.setReturnValue(null);

        MockControl mockEventHandlingStrategyControl = MockControl
                .createControl(EventHandlingStrategy.class);
        EventHandlingStrategy mockEventHandlingStrategy = (EventHandlingStrategy) mockEventHandlingStrategyControl
                .getMock();

        HashMap acceptorSessions = new HashMap();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        mockIoSessionControl.replay();
        mockEventHandlingStrategyControl.replay();

        handler.processMessage(mockIoSession, new Logout());

        mockIoSessionControl.verify();
        mockEventHandlingStrategyControl.verify();
    }

    private StaticAcceptorSessionProvider createSessionProvider(HashMap acceptorSessions) {
        return new AbstractSocketAcceptor.StaticAcceptorSessionProvider(acceptorSessions);
    }

    public void testMessageBeforeLogonWithBoundSession() throws Exception {
        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();

        Session qfSession = SessionFactoryTestSupport.createSession();
        mockIoSession.getAttribute("QF_SESSION");
        mockIoSessionControl.setReturnValue(qfSession);

        MockControl mockEventHandlingStrategyControl = MockControl
                .createControl(EventHandlingStrategy.class);
        EventHandlingStrategy mockEventHandlingStrategy = (EventHandlingStrategy) mockEventHandlingStrategyControl
                .getMock();

        Logout logout = new Logout();
        logout.getHeader()
                .setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
        logout.getHeader()
                .setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

        mockEventHandlingStrategy.onMessage(qfSession, logout);

        HashMap acceptorSessions = new HashMap();

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        mockIoSessionControl.replay();
        mockEventHandlingStrategyControl.replay();

        handler.processMessage(mockIoSession, logout);

        mockIoSessionControl.verify();
        mockEventHandlingStrategyControl.verify();
    }

    public void testMessageBeforeLogonWithKnownButUnboundSession() throws Exception {
        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();

        mockIoSession.getAttribute("QF_SESSION");
        mockIoSessionControl.setReturnValue(null);

        MockControl mockEventHandlingStrategyControl = MockControl
                .createControl(EventHandlingStrategy.class);
        EventHandlingStrategy mockEventHandlingStrategy = (EventHandlingStrategy) mockEventHandlingStrategyControl
                .getMock();

        Session qfSession = SessionFactoryTestSupport.createSession();

        Logout logout = new Logout();
        logout.getHeader()
                .setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
        logout.getHeader()
                .setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

        // Expect that onMessage will not be called
        //mockEventHandlingStrategy.onMessage(qfSession, logout);

        HashMap acceptorSessions = new HashMap();
        acceptorSessions.put(qfSession.getSessionID(), qfSession);

        AcceptorIoHandler handler = new AcceptorIoHandler(createSessionProvider(acceptorSessions),
                new NetworkingOptions(new Properties()), mockEventHandlingStrategy);

        mockIoSessionControl.replay();
        mockEventHandlingStrategyControl.replay();

        handler.processMessage(mockIoSession, logout);

        mockIoSessionControl.verify();
        mockEventHandlingStrategyControl.verify();
    }
}
