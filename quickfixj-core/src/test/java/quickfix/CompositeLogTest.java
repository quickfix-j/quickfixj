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
import junit.framework.TestCase;

public class CompositeLogTest extends TestCase {
    public void testCompositeLog() throws Exception {
        Log mockLog1 = mock(Log.class);
        Log mockLog2 = mock(Log.class);

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);
        
        log.onIncoming("INCOMING");
        log.onOutgoing("OUTGOING");
        log.onEvent("EVENT");
        
        verify(mockLog1).onIncoming("INCOMING");
        verify(mockLog2).onIncoming("INCOMING");
        verify(mockLog1).onOutgoing("OUTGOING");
        verify(mockLog2).onOutgoing("OUTGOING");
        verify(mockLog1).onEvent("EVENT");
        verify(mockLog2).onEvent("EVENT");
    }
}
