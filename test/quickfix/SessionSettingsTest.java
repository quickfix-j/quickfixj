package quickfix;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import junit.framework.TestCase;

public class SessionSettingsTest extends TestCase {

    public SessionSettingsTest(String name) {
        super(name);
    }

    public void testSettings() throws Exception {
        String data = new String();
        data += "[DEFAULT]";
        data += "ConnectionType=acceptor\n";
        data += "SocketAcceptPort=5001\n";
        data += "FileStorePath=store\n";
        data += "StartTime=00:00:00\n";
        data += "EndTime=00:00:00\n";
        data += "TestLong=1234\n";
        data += "TestLong2=abcd\n";
        data += "TestDouble=12.34\n";
        data += "TestDouble2=abcd\n";
        data += "TestBoolTrue=Y\n";
        data += "TestBoolFalse=N\n";
        data += "\n";
        data += "[SESSION]\n";
        data += "BeginString=FIX.4.2\n";
        data += "SenderCompID=TW\n";
        data += "TargetCompID=CLIENT1\n";
        data += "DataDictionary=../spec/FIX42.xml\n";
        data += "\n";
        data += "[SESSION]\n";
        data += "BeginString=FIX.4.2\n";
        data += "SenderCompID=TW\n";
        data += "TargetCompID=CLIENT2\n";
        data += "DataDictionary=../spec/FIX42.xml\n";
        ByteArrayInputStream cfg = new ByteArrayInputStream(data.getBytes());

        SessionSettings settings = new SessionSettings(cfg);

        SessionID sessionID1 = new SessionID("FIX.4.2", "TW", "CLIENT1");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");
        SessionID sessionID3 = new SessionID("FIX.4.2", "FOO", "BAR");

        assertEquals("wrong setting", "acceptor", settings.getString(sessionID1,
                SessionSettings.CONNECTION_TYPE));
        assertEquals("wrong setting", "00:00:00", settings.getString(sessionID2,
                SessionSettings.END_TIME));
        assertEquals("wrong setting", "CLIENT1", settings.getString(sessionID1,
                SessionSettings.TARGETCOMPID));
        assertEquals("wrong setting", "CLIENT2", settings.getString(sessionID2,
                SessionSettings.TARGETCOMPID));

        try {
            settings.getString(new SessionID("FIX.4.2", "FOO", "BAR"), "xyz");
            fail("expected exception");
        } catch (ConfigError e) {
            // expected
        }

        assertEquals("wrong setting", 1234, settings.getLong(sessionID1, "TestLong"));
        try {
            settings.getLong(sessionID1, "TestLong2");
            fail("expected exception");
        } catch (FieldConvertError e) {
            // expected
        }
        settings.setLong(sessionID3, "TestLong", 4321);
        assertEquals("wrong setting", 4321, settings.getLong(sessionID3, "TestLong"));

        assertEquals("wrong setting", 12.34, settings.getDouble(sessionID1, "TestDouble"), 0);
        try {
            settings.getDouble(sessionID1, "TestDouble2");
            fail("expected exception");
        } catch (FieldConvertError e) {
            // expected
        }
        settings.setDouble(sessionID3, "TestDouble", 43.21);
        assertEquals("wrong setting", 43.21, settings.getDouble(sessionID3, "TestDouble"), 0);
        
        assertTrue("wrong setting", settings.getBool(sessionID1, "TestBoolTrue"));
        assertFalse("wrong setting", settings.getBool(sessionID1, "TestBoolFalse"));
        settings.setBool(sessionID3, "TestBool", true);
        assertTrue("wrong settings", settings.getBool(sessionID3, "TestBool"));
        
        settings.setString(sessionID3, "TestString", "foo");
        assertEquals("wrong setting", "foo", settings.getString(sessionID3, "TestString"));
        
        assertTrue("wrong setting", settings.isSetting(sessionID1, "StartTime"));
        
        Iterator sectionIterator = settings.sectionIterator();
        assertNotNull(sectionIterator.next());
        assertNotNull(sectionIterator.next());
        assertNotNull(sectionIterator.next());
        assertNotNull(sectionIterator.next());
        assertFalse(sectionIterator.hasNext());
    }

    public void testToString() {
        new SessionSettings().toString();
        // Passes if no exceptions are thrown
    }
    
    public void testDefaultConstructor() {
        new SessionSettings();
        // Passes if no exception is thrown
    }

    public void testConfigError() throws Exception {
        InputStream cfg = new InputStream() {
            public synchronized int read() throws IOException {
                throw new IOException("TEST");
            }
        };

        try {
            new SessionSettings(cfg);
            fail("expected exception");
        } catch (ConfigError e) {
            // expected
        }
    }
}