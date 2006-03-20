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
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        File path = File.createTempFile("test", "");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, path.getParentFile()
                .getAbsolutePath());
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

        String prefix = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();

        log.onIncoming("INTEST");
        assertEquals("wrong message", "INTEST\n", readLog(log.getMessagesFileName()));
        assertEquals(prefix + ".messages.log", new File(log.getMessagesFileName()).getName());
        log.clear();

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getMessagesFileName()));

        // Bug #140
        assertEquals(prefix + ".event.log", new File(log.getEventFileName()).getName());

        log.onEvent("EVENTTEST");
        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), false);
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));

        // Test append - Bug #140
        // The last output should still be in the file
        log.close();
        log = (FileLog) factory.create(sessionID);
        assertEquals("wrong message", "OUTTEST\n", readLog(log.getMessagesFileName()));
        assertEquals("wrong message", formattedTime + ": EVENTTEST\n", readLog(log
                .getEventFileName()));
    }

    public void testLogWithMessageTimestamps() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        File path = File.createTempFile("test", "");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, path.getParentFile()
                .getAbsolutePath());
        settings.setBool(sessionID, FileLogFactory.SETTING_INCLUDE_TIMESTAMP_FOR_MESSAGES, true);
        
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), false);

        String prefix = sessionID.getBeginString() + "-" + sessionID.getSenderCompID() + "-"
                + sessionID.getTargetCompID();

        log.onIncoming("INTEST");
        assertEquals("wrong message", formattedTime + ": " + "INTEST\n", readLog(log.getMessagesFileName()));
        assertEquals(prefix + ".messages.log", new File(log.getMessagesFileName()).getName());
        log.clear();

        log.onOutgoing("OUTTEST");
        assertEquals("wrong message", formattedTime + ": " + "OUTTEST\n", readLog(log.getMessagesFileName()));
    }

    public void testLogWithMillisInTimestamp() throws Exception {
        long systemTime = System.currentTimeMillis();
        SystemTime.setTimeSource(new MockSystemTimeSource(systemTime));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER" + systemTime, "TARGET" + systemTime);

        File path = File.createTempFile("test", "");
        SessionSettings settings = new SessionSettings();
        settings.setString(sessionID, FileLogFactory.SETTING_FILE_LOG_PATH, path.getParentFile()
                .getAbsolutePath());
        settings.setBool(sessionID, FileLogFactory.SETTING_INCLUDE_MILLIS_IN_TIMESTAMP, true);
        
        FileLogFactory factory = new FileLogFactory(settings);
        FileLog log = (FileLog) factory.create(sessionID);
        log.setSyncAfterWrite(true);

        log.onEvent("EVENTTEST");
        String formattedTime = UtcTimestampConverter.convert(new Date(systemTime), true);
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