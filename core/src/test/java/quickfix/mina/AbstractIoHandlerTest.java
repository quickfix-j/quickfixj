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

package quickfix.mina;

import junit.framework.TestCase;

import org.apache.mina.common.IoSession;
import org.easymock.MockControl;

import quickfix.*;

public class AbstractIoHandlerTest extends TestCase {
    public void testMessageSentOnWrongConnection() throws Exception {
        AbstractIoHandler handler = new AbstractIoHandler(null) {
            @Override
            protected void processMessage(IoSession ioSession, Message message) throws Exception {
            }
        };

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        Session session = SessionFactoryTestSupport.createSession(sessionID,
                new UnitTestApplication(), true);

        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();
        mockIoSession.getAttribute(SessionConnector.QF_SESSION);
        mockIoSessionControl.setReturnValue(session);

        String messageString = "8=FIX.4.2\0019=40\00135=A\00149=X\00156=Y\001627=2\001"
                + "628=FOO\001628=BAR\00198=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=228\001";

        mockIoSessionControl.replay();

        // A session FIX.4.4:SENDER->TARGET has been bound to the IoSession.
        // A message is received for a different session.
        // The error should be detected.

        try {
            handler.messageReceived(mockIoSession, messageString);
            fail("No illegal state exception");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            // Expected exception
        }

        mockIoSessionControl.verify();
    }
}
