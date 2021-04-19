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

package quickfix.test.acceptance.timer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.ConfigError;
import quickfix.SessionNotFound;

public class TimerTest {

    TimerTestServer server;

    @Test
    public void testAcceptorTimer() throws ConfigError, SessionNotFound, InterruptedException {
        new TimerTestClient().run();
    }

    @Before
    public void setUp() throws Exception {
        server = new TimerTestServer();
        server.start();
        server.waitForInitialization();
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }
}
