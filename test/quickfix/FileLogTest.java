package quickfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import quickfix.field.converter.UtcTimestampConverter;

import junit.framework.TestCase;

public class FileLogTest extends TestCase {
    public FileLogTest(String name) {
        super(name);
    }

    public void testLog() throws Exception {
        long systemTime = SystemTime.get();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());

        File path = File.createTempFile("test", "");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, SessionSettings.FILE_LOG_PATH, path.getParentFile().getAbsolutePath());
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog)factory.create(sessionID);

        log.onIncoming("INTEST");
        assertEquals("wrong message", "INTEST\n", readLog(log.getIncomingFileName()));

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getOutgoingFileName()));

        log.onEvent("EVENTTEST");
        String formattedTime = UtcTimestampConverter.convert(new Date(
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