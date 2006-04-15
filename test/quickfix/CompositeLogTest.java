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

import org.easymock.MockControl;

import junit.framework.TestCase;

public class CompositeLogTest extends TestCase {
    public void testCompositeLog() throws Exception {
        MockControl mockLog1Control = MockControl.createControl(Log.class);
        Log mockLog1 = (Log)mockLog1Control.getMock();
        
        MockControl mockLog2Control = MockControl.createControl(Log.class);
        Log mockLog2 = (Log)mockLog2Control.getMock();

        CompositeLog log = new CompositeLog(new Log[] { mockLog1, mockLog2 });
        log.setRethrowExceptions(true);
        
        mockLog1.onIncoming("INCOMING");
        mockLog2.onIncoming("INCOMING");
        mockLog1.onOutgoing("OUTGOING");
        mockLog2.onOutgoing("OUTGOING");
        mockLog1.onEvent("EVENT");
        mockLog2.onEvent("EVENT");
        
        mockLog1Control.replay();
        mockLog2Control.replay();
        
        log.onIncoming("INCOMING");
        log.onOutgoing("OUTGOING");
        log.onEvent("EVENT");
        
        mockLog1Control.verify();
        mockLog2Control.verify();
    }
}
