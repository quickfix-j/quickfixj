package quickfix;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import junit.framework.TestCase;

public class SLF4JLogTest extends TestCase {
    public SLF4JLogTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
        System.setProperty("org.apache.commons.logging.Log",
                "org.apache.commons.logging.impl.Jdk14Logger");
    }

    protected void tearDown() throws Exception {
        System.getProperties().remove("org.apache.commons.logging.Log");
        super.tearDown();
    }

    public void testLog() throws Exception {
        long systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());
        SessionSettings settings = new SessionSettings();
        SLF4JLogFactory factory = new SLF4JLogFactory(settings);
        Log commonsLog = factory.create(sessionID);

        String loggedText = "TEST123";

        setUpLoggerForTest(SLF4JLog.DEFAULT_EVENT_CATEGORY);
        commonsLog.onEvent(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_EVENT_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY);
        commonsLog.onIncoming(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_INCOMING_MSG_CATEGORY, loggedText);

        setUpLoggerForTest(SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY);
        commonsLog.onOutgoing(loggedText);
        assertMessageLogged(sessionID, SLF4JLog.DEFAULT_OUTGOING_MSG_CATEGORY, loggedText);

        settings.setString(sessionID, SLF4JLogFactory.SETTING_EVENT_CATEGORY, "event");
        settings.setString(sessionID, SLF4JLogFactory.SETTING_INMSG_CATEGORY, "in");
        settings.setString(sessionID, SLF4JLogFactory.SETTING_OUTMSG_CATEGORY, "out");
        commonsLog = factory.create(sessionID);

        setUpLoggerForTest("event");
        commonsLog.onEvent(loggedText);
        assertMessageLogged(sessionID, "event", loggedText);

        setUpLoggerForTest("in");
        commonsLog.onIncoming(loggedText);
        assertMessageLogged(sessionID, "in", loggedText);

        setUpLoggerForTest("out");
        commonsLog.onOutgoing(loggedText);
        assertMessageLogged(sessionID, "out", loggedText);

    }

    private void assertMessageLogged(SessionID sessionID, String categoryName, String message) {
        Logger logger = Logger.getLogger(categoryName);
        TestHandler testHandler = null;
        Handler[] handlers = logger.getHandlers();
        for (int i = 0; i < handlers.length; i++) {
            if (handlers[i] instanceof TestHandler) {
                testHandler = (TestHandler) handlers[i];
                break;
            }
        }
        assertNotNull(testHandler);
        assertEquals(1, testHandler.records.size());
        LogRecord r = (LogRecord) testHandler.records.get(0);
        assertEquals(categoryName, r.getLoggerName());
        assertEquals(sessionID + ": " + message, r.getMessage());
    }

    private TestHandler setUpLoggerForTest(String category) {
        Logger logger = Logger.getLogger(category);
        logger.setUseParentHandlers(false);
        Handler[] handlers = logger.getHandlers();
        for (int i = 0; i < handlers.length; i++) {
            System.out.println(handlers[i]);
            logger.removeHandler(handlers[i]);
        }
        TestHandler testHandler = new TestHandler();
        logger.addHandler(testHandler);
        return testHandler;
    }

    private class TestHandler extends java.util.logging.Handler {
        public ArrayList records = new ArrayList();

        public void close() throws SecurityException {
        }

        public void flush() {
        }

        public void publish(LogRecord record) {
            records.add(record);
        }

    }
}