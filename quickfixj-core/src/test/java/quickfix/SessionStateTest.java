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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SessionStateTest  {

    private MockSystemTimeSource timeSource;

    @Before
    public void setUp() {
        timeSource = new MockSystemTimeSource(1000);
        SystemTime.setTimeSource(timeSource);
    }

    @After
    public void tearDown() {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void testTimeoutDefaultsAreNonzero() {
        SessionState state = new SessionState(new Object(), null, 0, false, null,
            Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);
        state.setLastReceivedTime(900);
        assertFalse("logon timeout not init'ed", state.isLogonTimedOut());

        state.setLogoutSent(true);
        state.setLastSentTime(900);
        assertFalse("logout timeout not init'ed", state.isLogoutTimedOut());
    }

    @Test
    public void testTestRequestTiming() {
        SessionState state = new SessionState(new Object(), null, 0, false, null,
            Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);
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

    @Test
    public void testHeartbeatTiming() {
        // we set a HB interval of 2 seconds = 2000ms
        SessionState state = new SessionState(new Object(), null, 2 /* HB interval */, false, null,
                Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);

        long now = System.currentTimeMillis();
        timeSource.setSystemTimes(now);
        state.setLastSentTime(now);
        assertFalse("heartbeat shouldn't be needed yet", state.isHeartBeatNeeded());
        timeSource.increment(1000);
        assertFalse("heartbeat shouldn't be needed yet", state.isHeartBeatNeeded());
        timeSource.increment(1000);
        // current time is now 2000ms further since the start, i.e. the HB interval has elapsed
        assertTrue("heartbeat should be needed", state.isHeartBeatNeeded());
    }

    @Test
    public void testSessionTimeout() {
        SessionState state = new SessionState(new Object(), null, 30, false, null,
            Session.DEFAULT_TEST_REQUEST_DELAY_MULTIPLIER, Session.DEFAULT_HEARTBEAT_TIMEOUT_MULTIPLIER);

        // session should timeout after 2.4 * 30 = 72 seconds
        state.setLastReceivedTime(950_000);

        timeSource.setSystemTimes(1_000_000L);
        assertFalse("session is still valid", state.isTimedOut());

        timeSource.setSystemTimes(1_021_999L);
        assertFalse("session is still valid", state.isTimedOut());

        timeSource.setSystemTimes(1_022_000L);
        assertTrue("session timed out", state.isTimedOut());
    }
}
