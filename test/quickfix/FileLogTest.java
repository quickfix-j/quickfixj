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

    protected void setUp() throws Exception {
        super.setUp();
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }

    public void testLog() throws Exception {
        long systemTime = SystemTime.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + System.currentTimeMillis(),
                "TARGET" + System.currentTimeMillis());

        File path = File.createTempFile("test", "");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, path.getParentFile()
                .getAbsolutePath());
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);

        log.onIncoming("INTEST");
        assertEquals("wrong message", "INTEST\n", readLog(log.getIncomingFileName()));

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getOutgoingFileName()));

        // Bug #140
        assertTrue("wrong file name for events", log.getEventFileName().endsWith(".event"));
        
        log.onEvent("EVENTTEST");
        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), false);
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));
        
        // Test append - Bug #140
        log.close();
        log = (FileLog) factory.create(sessionID);
        assertEquals("wrong message", "INTEST\n", readLog(log.getIncomingFileName()));
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getOutgoingFileName()));
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