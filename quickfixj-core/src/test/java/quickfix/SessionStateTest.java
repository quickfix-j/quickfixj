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

import junit.framework.TestCase;

public class SessionStateTest extends TestCase {
    protected void setUp() throws Exception {
        super.setUp();
        MockSystemTimeSource mockTimeSource = new MockSystemTimeSource(1000);
        SystemTime.setTimeSource(mockTimeSource);
    }

    protected void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        super.tearDown();
    }

    public void testTimeoutDefaultsAreNonzero() throws Exception {
        SessionState state = new SessionState(new Object(), null, 0, false, null, Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER);
        state.setLastReceivedTime(900);
        assertFalse("logon timeout not init'ed", state.isLogonTimedOut());

        state.setLogoutSent(true);
        state.setLastSentTime(900);
        assertFalse("logout timeout not init'ed", state.isLogoutTimedOut());
    }

    public void testTestRequestTiming() throws Exception {
        SessionState state = new SessionState(new Object(), null, 0, false, null, Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER);
        state.setLastReceivedTime(950);
        state.setHeartBeatInterval(50);
        assertFalse("testRequest shouldn't be needed yet", state.isTestRequestNeeded());
        for (int i = 0; i < 5; i++) {
            state.incrementTestRequestCounter();
        }
        assertFalse("testRequest should be needed", state.isTestRequestNeeded());

        // set the heartbeat interval to something small and we shouldn't need it again
        state.setHeartBeatInterval(3);
        assertFalse("testRequest shouldn't be needed yet", state.isTestRequestNeeded());
    }
}
