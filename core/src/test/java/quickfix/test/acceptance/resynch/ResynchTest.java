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

package quickfix.test.acceptance.resynch;

import junit.framework.TestCase;
import quickfix.ConfigError;
import quickfix.SessionNotFound;

public class ResynchTest extends TestCase {
    private Thread serverThread;

    ResynchTestServer server;

    public void testAcceptorTimerSync() throws ConfigError, SessionNotFound, InterruptedException {
        serverThread.start();
        server.waitForInitialization();
        new ResynchTestClient().run();
    }

    public void testAcceptorTimerUnsync() throws ConfigError, SessionNotFound, InterruptedException {
        server.setUnsynchMode(true);
        serverThread.start();
        server.waitForInitialization();
        ResynchTestClient client = new ResynchTestClient();
        client.setUnsynchMode(true);
        client.run();
    }

    public void testAcceptorTimerUnsyncWith() throws ConfigError, SessionNotFound, InterruptedException {
        server.setUnsynchMode(true);
        serverThread.start();
        server.waitForInitialization();
        ResynchTestClient client = new ResynchTestClient();
        client.setUnsynchMode(false);
        client.setForceResynch(true);
        client.run();
    }

    protected void setUp() throws Exception {
        super.setUp();
        server = new ResynchTestServer();
        serverThread = new Thread(server, "TimerTestServer");
    }

    protected void tearDown() throws Exception {
        serverThread.interrupt();
        super.tearDown();
    }
}