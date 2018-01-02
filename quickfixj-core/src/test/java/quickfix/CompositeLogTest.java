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

package quickfix;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class CompositeLogTest {

    @Test
    public void testClearDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.clear();

        verify(mockLog1).clear();
        verify(mockLog2).clear();
    }

    @Test
    public void testOnIncomingDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onIncoming("INCOMING");

        verify(mockLog1).onIncoming("INCOMING");
        verify(mockLog2).onIncoming("INCOMING");
    }

    @Test
    public void testOnOutgoingDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onOutgoing("OUTGOING");

        verify(mockLog1).onOutgoing("OUTGOING");
        verify(mockLog2).onOutgoing("OUTGOING");
    }

    @Test
    public void testOnEventDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onEvent("EVENT");

        verify(mockLog1).onEvent("EVENT");
        verify(mockLog2).onEvent("EVENT");
    }

    @Test
    public void testOnErrorEventDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onErrorEvent("Category","ERROR EVENT");

        verify(mockLog1).onErrorEvent("Category","ERROR EVENT");
        verify(mockLog2).onErrorEvent("Category","ERROR EVENT");
    }

    @Test
    public void testOnInvalidMessageDelegates() {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onInvalidMessage("INVALID MESSAGE", "FAILURE REASON");

        verify(mockLog1).onInvalidMessage("INVALID MESSAGE", "FAILURE REASON");
        verify(mockLog2).onInvalidMessage("INVALID MESSAGE", "FAILURE REASON");
    }

    @Test(expected = OutOfMemoryError.class)
    public void testOOMEIsThrownIfThrownByAComponentLogWhenRethrowExceptionsIsTrue() throws OutOfMemoryError {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        doThrow(new OutOfMemoryError()).when(mockLog1).onIncoming(anyString());

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);

        log.onIncoming("INCOMING");
    }

    @Test(expected = OutOfMemoryError.class)
    public void testOOMEIsThrownIfThrownByAComponentLogWhenRethrowExceptionsIsFalse() throws OutOfMemoryError {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        doThrow(new OutOfMemoryError()).when(mockLog1).onIncoming(anyString());

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(false);

        log.onIncoming("INCOMING");
    }

}
