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
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class SLF4JLogTest extends TestCase {
    public SLF4JLogTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }

    @Override
    protected void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        super.tearDown();
    }

    public void testLog() throws Exception {
        final SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());
        final long systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        final SessionSettings settings = new SessionSettings();
        final SLF4JLogFactory factory = new SLF4JLogFactory(settings);
        Log log = factory.create(sessionID);

        final String loggedText = "TEST123";

        setUpLoggerForTest(SLF4JLog.DEFAULT_EVENT_CATEGORY);
        log.onEvent(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_EVENT_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_ERROR_EVENT_CATEGORY);
        log.onErrorEvent(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_ERROR_EVENT_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);
        log.onIncoming(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
        log.onOutgoing(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY, loggedText);

        settings.setString(sessionID, SLF4JLogFactory.SETTING_EVENT_CATEGORY, "event");
        settings.setString(sessionID, SLF4JLogFactory.SETTING_ERROR_EVENT_CATEGORY, "errorEvent");
        settings.setString(sessionID, SLF4JLogFactory.SETTING_INMSG_CATEGORY, "in");
        settings.setString(sessionID, SLF4JLogFactory.SETTING_OUTMSG_CATEGORY, "out");
        log = factory.create(sessionID);

        setUpLoggerForTest("event");
        log.onEvent(loggedText);
        assertMessageLogged(sessionID, "event", loggedText);

        setUpLoggerForTest("errorEvent");
        log.onErrorEvent(loggedText);
        assertMessageLogged(sessionID, "errorEvent", loggedText);

        setUpLoggerForTest("in");
        log.onIncoming(loggedText);
        assertMessageLogged(sessionID, "in", loggedText);

        setUpLoggerForTest("out");
        log.onOutgoing(loggedText);
        assertMessageLogged(sessionID, "out", loggedText);
    }

    public void testLogHeartbeatFiltering() throws Exception {
        final SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());
        final long systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        final SessionSettings settings = new SessionSettings();
        final SLF4JLogFactory factory = new SLF4JLogFactory(settings);
        SLF4JLog log = (SLF4JLog) factory.create(sessionID);

        final String loggedText = "HEARTBEAT\00135=0\001";

        setUpLoggerForTest(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);
        log.onIncoming(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
        log.onOutgoing(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY, loggedText);

        settings.setBool(sessionID, SLF4JLogFactory.SETTING_LOG_HEARTBEATS, false);
        log = (SLF4JLog) factory.create(sessionID);

        setUpLoggerForTest(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);
        log.onIncoming(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);

        setUpLoggerForTest(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
        log.onOutgoing(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
    }

    public void testLogFilteredByLevel() throws Exception {
        final SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());
        final long systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        final SessionSettings settings = new SessionSettings();
        final SLF4JLogFactory factory = new SLF4JLogFactory(settings);
        final Log log = factory.create(sessionID);

        final String loggedText = "TEST123";

        setUpLoggerForTest(SLF4JLog.DEFAULT_EVENT_CATEGORY);
        getTestHandler(SLF4JLog.DEFAULT_EVENT_CATEGORY).setLevel(Level.WARNING);
        log.onEvent(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_EVENT_CATEGORY);

        setUpLoggerForTest(SLF4JLog.DEFAULT_ERROR_EVENT_CATEGORY);
        getTestHandler(SLF4JLog.DEFAULT_ERROR_EVENT_CATEGORY).setLevel(Level.SEVERE);
        log.onErrorEvent(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_EVENT_CATEGORY);

        setUpLoggerForTest(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);
        getTestHandler(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY).setLevel(Level.WARNING);
        log.onIncoming(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);

        setUpLoggerForTest(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
        getTestHandler(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY).setLevel(Level.WARNING);
        log.onOutgoing(loggedText);
        assertMessageNotLogged(sessionID, SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
    }

    /**
     * Check to make sure that if we use log4j underneath with SLF4J we use
     * the right wrapper function so that the appropriate calling location shows up
     * instead of our wrapper SLF4JLog class itself
     */
    public void testLog4j_correctFQCN() throws Exception {
        final MyLog4JLog myLog4j = new MyLog4JLog();
        final SLF4JLog slf4jLog = new MySLF4JLog(new SessionID("FIX.4.2", "sender", "target"),
                "my-caller-fqcn", myLog4j);

        final String loggedText = "TEST123";
        slf4jLog.onEvent(loggedText);
        assertEquals(1, myLog4j.messages.size());
        assertEquals("my-caller-fqcn", myLog4j.fqcns.get(0));
        assertEquals("TEST123", myLog4j.messages.get(0));
        slf4jLog.close();
    }

    private void assertMessageNotLogged(SessionID sessionID, String categoryName) {
        final TestHandler testHandler = getTestHandler(categoryName);
        assertEquals(0, testHandler.records.size());
    }

    private void assertMessageLogged(SessionID sessionID, String categoryName, String message) {
        final TestHandler testHandler = getTestHandler(categoryName);
        assertEquals(1, testHandler.records.size());
        final LogRecord r = testHandler.records.get(0);
        if (r.getLoggerName() != null) {
            // The conditional is required because of a bug in SLF4J 1.0
            // when used with JDK 1.4 logging. The wrapper does not pass
            // the logger name.
            assertEquals(categoryName, r.getLoggerName());
        }
        assertEquals(sessionID + ": " + message, r.getMessage());
    }

    private TestHandler getTestHandler(String categoryName) {
        final Logger logger = Logger.getLogger(categoryName);
        TestHandler testHandler = null;
        final Handler[] handlers = logger.getHandlers();
        for (final Handler handler : handlers) {
            if (handler instanceof TestHandler) {
                testHandler = (TestHandler) handler;
                break;
            }
        }
        assertNotNull(testHandler);
        return testHandler;
    }

    private TestHandler setUpLoggerForTest(String category) {
        final Logger logger = Logger.getLogger(category);
        logger.setUseParentHandlers(false);
        final Handler[] handlers = logger.getHandlers();
        for (final Handler handler : handlers) {
            //System.err.println("Removing unexpected handler: " + handlers[i]);
            logger.removeHandler(handler);
        }
        final TestHandler testHandler = new TestHandler();
        logger.addHandler(testHandler);
        return testHandler;
    }

    private class TestHandler extends java.util.logging.Handler {
        public final ArrayList<LogRecord> records = new ArrayList<>();

        @Override
        public void close() throws SecurityException {
        }

        @Override
        public void flush() {
        }

        @Override
        public void publish(LogRecord record) {
            if (record.getLevel().intValue() >= getLevel().intValue()) {
                records.add(record);
            }
        }
    }

    public class MySLF4JLog extends SLF4JLog {
        private final org.slf4j.Logger underlyingLog;

        public MySLF4JLog(SessionID sessionID, String inCallerFQCN, org.slf4j.Logger inUnderlyingLog) {
            super(sessionID, "test-event-cat", "test-error-event-cat", "test-incoming-msg-cat",
                    "test-outgoing-msg-cat", false, false, inCallerFQCN);
            underlyingLog = inUnderlyingLog;
        }

        @Override
        protected void log(org.slf4j.Logger log, String text) {
            super.log(underlyingLog, text);
        }
    }

    private class MyLog4JLog extends DummySLF4JLogger implements LocationAwareLogger {
        final Vector<String> messages = new Vector<>();
        final Vector<String> fqcns = new Vector<>();

        public void log(Marker marker, String fqcn, int level, String message, Object[] params,
                Throwable t) {
            messages.add(message);
            fqcns.add(fqcn);
        }

        @Override
        public boolean isInfoEnabled() {
            return true;
        }
    }
}
