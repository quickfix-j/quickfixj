package quickfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import junit.framework.TestCase;

public class TestFileLog extends TestCase {
    public TestFileLog(String name) {
        super(name);
    }

    public void testLog() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());

        File path = File.createTempFile("test", "");
        FileLog log = new FileLog(path.getParentFile().getAbsolutePath(), sessionID);

        log.onIncoming("INTEST");
        assertEquals("wrong message", "INTEST\n", readLog(log.getIncomingFileName()));

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getOutgoingFileName()));

        log.onEvent("EVENTTEST");
        String formattedTime = FieldValueConverter.UtcTimestampConverter.convert(new Date(
                systemTime), false);
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));
    }

    private String readLog(String path) throws IOException {
        File file = new File(path);
        FileInputStream in = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        in.read(data);
        return new String(data);

    }
}