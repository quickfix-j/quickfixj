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
import quickfix.field.converter.UtcTimestampConverter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ScreenLogTest extends TestCase {
    private long systemTime;

    public ScreenLogTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
        systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
    }

    protected void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        super.tearDown();
    }

    public void testScreenLog() {
        doScreenLogTest(true);
    }

    public void testScreenLogWithoutHeartBeats() {
        doScreenLogTest(false);
    }

    private void doScreenLogTest(boolean includeHeartBeats) {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER", "TARGET");
        ByteArrayOutputStream data = new ByteArrayOutputStream();

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.setBool(sessionID, ScreenLogFactory.SETTING_LOG_EVENTS, true);
        sessionSettings.setBool(sessionID, ScreenLogFactory.SETTING_LOG_INCOMING, true);
        sessionSettings.setBool(sessionID, ScreenLogFactory.SETTING_LOG_OUTGOING, true);
        sessionSettings.setBool(sessionID, ScreenLogFactory.SETTING_LOG_HEARTBEATS,
                includeHeartBeats);

        ScreenLogFactory factory = new ScreenLogFactory(sessionSettings);
        ScreenLog log = (ScreenLog) factory.create(sessionID);
        log.setOut(new PrintStream(data));

        log.onIncoming("35=0\001INCOMING\001");
        if (!includeHeartBeats) {
            assertNoMessageLogged(data);
        } else {
            assertLoggedMessage(data, systemTime, "incoming", "35=0\001INCOMING\001");
        }

        log.onOutgoing("35=0\001OUTGOING\001");
        if (!includeHeartBeats) {
            assertNoMessageLogged(data);
        } else {
            assertLoggedMessage(data, systemTime, "outgoing", "35=0\001OUTGOING\001");
        }

        log.onEvent("TEST");
        assertLoggedMessage(data, systemTime, "event", "TEST");
    }

    private void assertNoMessageLogged(ByteArrayOutputStream data) {
        assertEquals(0, data.size());
    }

    private void assertLoggedMessage(ByteArrayOutputStream data, long systemTime, String type,
            String content) {
        String expectedLogEntry = "<" + UtcTimestampConverter.convert(new Date(systemTime), false)
                + ", FIX.4.2:SENDER->TARGET, " + type + "> (" + content + ")"
                + System.getProperty("line.separator");
        String actualLogEntry = new String(data.toByteArray());
        assertEquals("wrong log entry", expectedLogEntry, actualLogEntry);
        data.reset();
    }
}
