package quickfix;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import junit.framework.TestCase;

public class SessionSettingsTest extends TestCase {

    public SessionSettingsTest(String name) {
        super(name);
    }

    public void testSettings() throws Exception {
        SessionSettings settings = setUpSession();

        SessionID sessionID1 = new SessionID("FIX.4.2", "TW", "CLIENT1");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");
        SessionID sessionID3 = new SessionID("FIX.4.2", "FOO", "BAR");

        assertEquals("wrong setting", "acceptor", settings.getString(sessionID1,
                SessionFactory.SETTING_CONNECTION_TYPE));
        assertEquals("wrong setting", "00:00:00", settings.getString(sessionID2,
                Session.SETTING_END_TIME));
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
        assertFalse(sectionIterator.hasNext());
    }

    private SessionSettings setUpSession() throws ConfigError {
        return setUpSession(null);
    }

    private SessionSettings setUpSession(String extra) throws ConfigError {
        String data = new String();
        data += "#comment\n";
        data += "[DEFAULT]\n";
        data += "Empty=\n";
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
        data += "\r\n";
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
        if (extra != null) {
            data += extra;
        }
        ByteArrayInputStream cfg = new ByteArrayInputStream(data.getBytes());

        SessionSettings settings = new SessionSettings(cfg);
        return settings;
    }

    public void testSessionKeyIterator() throws Exception {
        SessionSettings settings = setUpSession();
        Iterator itr = settings.sectionIterator();
        while (itr.hasNext()) {
            SessionID id = (SessionID) itr.next();
            assertEquals("FIX", id.getBeginString().substring(0, 3));
            assertEquals("", id.getSessionQualifier());
        }
    }

    public void testMethodsForDefaults() throws Exception {
        SessionSettings settings = setUpSession();
        assertEquals("acceptor", settings.getString("ConnectionType"));
        assertEquals(1234, settings.getLong("TestLong"));
        assertEquals(12.34, settings.getDouble("TestDouble"), 0);
        assertEquals(true, settings.getBool("TestBoolTrue"));
        assertTrue(settings.isSetting("ConnectionType"));
        assertFalse(settings.isSetting("bogus"));
    }

    public void testDefaultsSet() throws Exception {
        SessionSettings settings = setUpSession();
        Properties defaults = new Properties();
        defaults.put("foo", "mumble");
        defaults.put("baz", "fargle");
        defaults.put("FileStorePath", "bargle");
        settings.set(defaults);
        assertEquals("acceptor", settings.getString("ConnectionType"));
        assertEquals("mumble", settings.getString("foo"));
        assertEquals("fargle", settings.getString("baz"));
        assertEquals("bargle", settings.getString("FileStorePath"));
    }

    public void testSpecialCharactersInKeys() throws Exception {
        SessionSettings settings = setUpSession("$$$foo bar.baz@@@=value\n");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");

        assertEquals("value", settings.getString(sessionID2, "$$$foo bar.baz@@@"));
    }

    public void testStrangeCharactersInValues() throws Exception {
        SessionSettings settings = setUpSession("label=   This is a test? Yes, it is.\n");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");

        assertEquals("This is a test? Yes, it is.", settings.getString(sessionID2, "label"));
    }

    public void testDefaultSetters() throws Exception {
    	SessionSettings settings = setUpSession();
    	settings.setBool("bool", true);
    	assertEquals("wrong default value", true, settings.getBool("bool"));
    	settings.setDouble("double", 10.00);
    	assertEquals("wrong default value", 10.00, settings.getDouble("double"), 0);
    	settings.setLong("long", 1000L);
    	assertEquals("wrong default value", 1000L, settings.getLong("long"));
    	settings.setString("string", "xyz");
    	assertEquals("wrong default value", "xyz", settings.getString("string"));
    }
    
    public void testVariableInterpolationWithDefaultValueSource() throws Exception {
        System.setProperty("test.1", "FOO");
        System.setProperty("test.2", "BAR");
        SessionSettings settings = setUpSession();
        settings.setString("VariableTest", "ABC ${test.1} XYZ ${test.1}${test.2}");
        assertEquals("wrong default value", "ABC FOO XYZ FOOBAR", settings.getString("VariableTest"));
        settings.setString("VariableTest", "ABC ${test.1} XYZ ${test.1}${test.2} 123");
        assertEquals("wrong default value", "ABC FOO XYZ FOOBAR 123", settings.getString("VariableTest"));
    }
    
    public void testVariableInterpolationWithNoSysProps() throws Exception {
        System.setProperty("test.1", "FOO");
        System.setProperty("test.2", "BAR");
        SessionSettings settings = setUpSession();
        settings.setVariableValues(new Properties());
        settings.setString("VariableTest", "ABC ${test.1} XYZ ${test.1}${test.2}");
        assertEquals("wrong default value", "ABC ${test.1} XYZ ${test.1}${test.2}", settings.getString("VariableTest"));
    }

    public void testVariableInterpolationWithProps() throws Exception {
        System.setProperty("test.2", "BAR");
        Properties properties = new Properties(System.getProperties());
        properties.setProperty("test.1", "FOO");
        SessionSettings settings = setUpSession();
        settings.setVariableValues(properties);
        settings.setString("VariableTest", "ABC ${test.1} XYZ ${test.1}${test.2}");
        assertEquals("wrong default value", "ABC FOO XYZ FOOBAR", settings.getString("VariableTest"));
        settings.setString("VariableTest", "ABC ${test.1} XYZ ${test.1}${test.2} 123");
        assertEquals("wrong default value", "ABC FOO XYZ FOOBAR 123", settings.getString("VariableTest"));
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