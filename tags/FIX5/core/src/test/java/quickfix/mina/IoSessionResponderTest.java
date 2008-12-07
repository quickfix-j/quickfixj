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

import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import junit.framework.TestCase;

import org.apache.mina.common.IoSession;
import org.apache.mina.common.WriteFuture;

public class IoSessionResponderTest extends TestCase {
    public void testAsynchronousSend() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        stub(mockWriteFuture.isWritten()).toReturn(true);
        stub(mockIoSession.write("abcd")).toReturn(mockWriteFuture);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, false, 0);

        boolean result = responder.send("abcd");
        
        assertTrue(result);
        verify(mockIoSession).write("abcd");
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    public void testSynchronousSend() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);
        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        stub(mockIoSession.write("abcd")).toReturn(mockWriteFuture);
        stub(mockWriteFuture.join(timeout)).toReturn(true);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout);

        boolean result = responder.send("abcd");
        
        assertTrue(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).join(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    public void testSynchronousSendWithJoinException() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);

        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        stub(mockIoSession.write("abcd")).toReturn(mockWriteFuture);
        stubVoid(mockWriteFuture).toThrow(new RuntimeException("TEST")).on().join(timeout);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout);

        boolean result = responder.send("abcd");
        
        assertFalse(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).join(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    public void testSynchronousSendWithJoinTimeout() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);

        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        stub(mockIoSession.write("abcd")).toReturn(mockWriteFuture);
        stub(mockWriteFuture.join(timeout)).toReturn(false);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout);

        boolean result = responder.send("abcd");
        
        assertFalse(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).join(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    public void testDisconnect() throws Exception {
        IoSession mockProtocolSession = mock(IoSession.class);
        stub(mockProtocolSession.getScheduledWriteRequests()).toReturn(0);
        stub(mockProtocolSession.close()).toReturn(null);

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession, false, 0);
        responder.disconnect();


        verify(mockProtocolSession).getScheduledWriteRequests();
        verify(mockProtocolSession).close();

        verifyNoMoreInteractions(mockProtocolSession);
}

    public void testGetRemoteSocketAddress() throws Exception {
        IoSession mockProtocolSession = mock(IoSession.class);
        stub(mockProtocolSession.getRemoteAddress()).toReturn(
                new InetSocketAddress("1.2.3.4", 5432));

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession, false, 0);

        assertEquals("/1.2.3.4:5432", responder.getRemoteIPAddress());
        verify(mockProtocolSession).getRemoteAddress();
        verifyNoMoreInteractions(mockProtocolSession);
    }
}
