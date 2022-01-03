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
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;


public class IoSessionResponderTest {
    
    @Test
    public void testAsynchronousSend() throws Exception {
        IoSession mockIoSession = mock(IoSession.class);
        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        when(mockWriteFuture.isWritten()).thenReturn(true);
        when(mockIoSession.write("abcd")).thenReturn(mockWriteFuture);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, false, 0, 0);

        boolean result = responder.send("abcd");

        assertTrue(result);
        verify(mockIoSession).write("abcd");
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    @Test
    public void testSynchronousSend() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);
        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        when(mockIoSession.write("abcd")).thenReturn(mockWriteFuture);
        when(mockWriteFuture.awaitUninterruptibly(timeout)).thenReturn(true);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout, 0);

        boolean result = responder.send("abcd");

        assertTrue(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).awaitUninterruptibly(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    @Test
    public void testSynchronousSendWithJoinException() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);

        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        when(mockIoSession.write("abcd")).thenReturn(mockWriteFuture);
        doThrow(new RuntimeException("TEST")).when(mockWriteFuture).awaitUninterruptibly(timeout);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout, 0);

        boolean result = responder.send("abcd");

        assertFalse(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).awaitUninterruptibly(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    @Test
    public void testSynchronousSendWithJoinTimeout() throws Exception {
        int timeout = 123;
        IoSession mockIoSession = mock(IoSession.class);

        WriteFuture mockWriteFuture = mock(WriteFuture.class);
        when(mockIoSession.write("abcd")).thenReturn(mockWriteFuture);
        when(mockWriteFuture.awaitUninterruptibly(timeout)).thenReturn(false);
        IoSessionResponder responder = new IoSessionResponder(mockIoSession, true, timeout, 0);

        boolean result = responder.send("abcd");

        assertFalse(result);
        verify(mockIoSession).write("abcd");
        verify(mockWriteFuture).awaitUninterruptibly(timeout);
        verifyNoMoreInteractions(mockWriteFuture);
        verifyNoMoreInteractions(mockIoSession);
    }

    @Test
    public void testDisconnect() throws Exception {
        IoSession mockProtocolSession = mock(IoSession.class);
        
        when(mockProtocolSession.getScheduledWriteMessages()).thenReturn(0);
        when(mockProtocolSession.closeNow()).thenReturn(null);

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession, false, 0, 0);
        responder.disconnect();

        verify(mockProtocolSession).closeOnFlush();
        verify(mockProtocolSession).setAttribute("QFJ_RESET_IO_CONNECTOR", Boolean.TRUE);

        verifyNoMoreInteractions(mockProtocolSession);
    }

    @Test
    public void testGetRemoteSocketAddress() throws Exception {
        IoSession mockProtocolSession = mock(IoSession.class);
        when(mockProtocolSession.getRemoteAddress()).thenReturn(new InetSocketAddress("1.2.3.4", 5432));

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession, false, 0, 0);

        assertEquals("/1.2.3.4:5432", responder.getRemoteAddress());
        verify(mockProtocolSession).getRemoteAddress();
        verifyNoMoreInteractions(mockProtocolSession);
    }
}
