/*============================================================================
 *
 * Copyright (c) 2000-2006 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

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
