/*============================================================================
 *
 * Copyright (c) 2000-2006 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

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

        AcceptorIoHandler handler = new AcceptorIoHandler(acceptorSessions, new NetworkingOptions(
                new Properties()), mockEventHandlingStrategy, null);

        mockIoSessionControl.replay();
        mockEventHandlingStrategyControl.replay();

        handler.processMessage(mockIoSession, new Logout());

        mockIoSessionControl.verify();
        mockEventHandlingStrategyControl.verify();
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
        logout.getHeader().setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
        logout.getHeader().setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

        mockEventHandlingStrategy.onMessage(qfSession, logout);
        
        HashMap acceptorSessions = new HashMap();

        AcceptorIoHandler handler = new AcceptorIoHandler(acceptorSessions, new NetworkingOptions(
                new Properties()), mockEventHandlingStrategy, null);

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
        logout.getHeader().setString(SenderCompID.FIELD, qfSession.getSessionID().getSenderCompID());
        logout.getHeader().setString(TargetCompID.FIELD, qfSession.getSessionID().getTargetCompID());

        // Expect that onMessage will not be called
        //mockEventHandlingStrategy.onMessage(qfSession, logout);
        
        HashMap acceptorSessions = new HashMap();
        acceptorSessions.put(qfSession.getSessionID(), qfSession);
        
        AcceptorIoHandler handler = new AcceptorIoHandler(acceptorSessions, new NetworkingOptions(
                new Properties()), mockEventHandlingStrategy, null);

        mockIoSessionControl.replay();
        mockEventHandlingStrategyControl.replay();
        
        handler.processMessage(mockIoSession, logout);

        mockIoSessionControl.verify();
        mockEventHandlingStrategyControl.verify();
    }
}
