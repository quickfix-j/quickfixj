package quickfix;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import quickfix.field.converter.UtcTimestampConverter;

import junit.framework.TestCase;

public class ScreenLogTest extends TestCase {
    public ScreenLogTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }
   
    public void testScreenLog() {
        long systemTime = SystemTime.get();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER", "TARGET");
        ByteArrayOutputStream data = new ByteArrayOutputStream();

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.setBool(sessionID, SessionSettings.SCREEN_LOG_EVENTS, true);
        sessionSettings.setBool(sessionID, SessionSettings.SCREEN_LOG_INCOMING, true);
        sessionSettings.setBool(sessionID, SessionSettings.SCREEN_LOG_OUTGOING, true);
        
        ScreenLogFactory factory = new ScreenLogFactory(sessionSettings);
        ScreenLog log = (ScreenLog)factory.create(sessionID);
        log.setOut(new PrintStream(data));

        log.onIncoming("TEST");
        assertLoggedMessage(data, systemTime, "incoming");

        log.onOutgoing("TEST");
        assertLoggedMessage(data, systemTime, "outgoing");

        log.onEvent("TEST");
        assertLoggedMessage(data, systemTime, "event");
    }

    private void assertLoggedMessage(ByteArrayOutputStream data, long systemTime, String type) {
        String expectedLogEntry = "<"
                + UtcTimestampConverter.convert(new Date(systemTime), false)
                + ", FIX.4.2:SENDER->TARGET, " + type + "> (TEST)"
                + System.getProperty("line.separator");
        String actualLogEntry = new String(data.toByteArray());
        assertEquals("wrong log entry", expectedLogEntry, actualLogEntry);
        data.reset();
    }
}