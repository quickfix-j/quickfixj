package quickfix;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import junit.framework.TestCase;

public class TestScreenLog extends TestCase {
    public TestScreenLog(String name) {
        super(name);
    }

    public void testScreenLog() {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER", "TARGET");
        ByteArrayOutputStream data = new ByteArrayOutputStream();

        ScreenLog log = new ScreenLog(true, true, true, sessionID, new PrintStream(data));

        log.onIncoming("TEST");
        assertLoggedMessage(data, systemTime, "incoming");

        log.onOutgoing("TEST");
        assertLoggedMessage(data, systemTime, "outgoing");

        log.onEvent("TEST");
        assertLoggedMessage(data, systemTime, "event");
    }

    private void assertLoggedMessage(ByteArrayOutputStream data, long systemTime, String type) {
        String expectedLogEntry = "<"
                + FieldValueConverter.UtcTimestampConverter.convert(new Date(systemTime), false)
                + ", FIX.4.2:SENDER->TARGET, " + type + "> (TEST)"
                + System.getProperty("line.separator");
        String actualLogEntry = new String(data.toByteArray());
        assertEquals("wrong log entry", expectedLogEntry, actualLogEntry);
        data.reset();
    }
}