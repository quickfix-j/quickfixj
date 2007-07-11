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

import java.net.InetSocketAddress;

import junit.framework.TestCase;

import org.apache.mina.common.CloseFuture;
import org.apache.mina.common.IoSession;
import org.easymock.MockControl;

public class IoSessionResponderTest extends TestCase {
    public void testSend() throws Exception {
        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();
        mockIoSession.write("abcd");
        mockIoSessionControl.setReturnValue(null);

        IoSessionResponder responder = new IoSessionResponder(mockIoSession);

        mockIoSessionControl.replay();

        responder.send("abcd");

        mockIoSessionControl.verify();
    }

    public void testDisconnect() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockProtocolSession = (IoSession) mockProtocolSessionControl.getMock();
        mockProtocolSession.getScheduledWriteRequests();
        mockProtocolSessionControl.setReturnValue(0);
        
        MockControl mockCloseFutureControl = MockControl.createControl(CloseFuture.class);
        CloseFuture mockCloseFuture = (CloseFuture) mockCloseFutureControl.getMock();
        mockCloseFuture.join();
        
        mockProtocolSession.close();
        mockProtocolSessionControl.setReturnValue(mockCloseFuture);

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        responder.disconnect();

        mockProtocolSessionControl.verify();
    }

    public void testGetRemoteSocketAddress() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockProtocolSession = (IoSession) mockProtocolSessionControl.getMock();
        mockProtocolSessionControl.expectAndReturn(mockProtocolSession.getRemoteAddress(),
                new InetSocketAddress("1.2.3.4", 5432));

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        assertEquals("/1.2.3.4:5432", responder.getRemoteIPAddress());

        mockProtocolSessionControl.verify();
    }
}
