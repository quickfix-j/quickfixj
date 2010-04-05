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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import junit.framework.TestCase;

public class SessionSettingsTest extends TestCase {

    public SessionSettingsTest(String name) {
        super(name);
    }

    public void testExtendedSettings() throws ConfigError {
        String settingsString = "";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.2\n";
        settingsString += "SenderCompID=Company\n";
        settingsString += "SenderSubID=FixedIncome\n";
        settingsString += "SenderLocationID=HongKong\n";
        settingsString += "TargetCompID=CLIENT1\n";
        settingsString += "TargetSubID=HedgeFund\n";
        settingsString += "TargetLocationID=NYC\n";

        SessionSettings settings = new SessionSettings(new ByteArrayInputStream(settingsString.getBytes()));
        SessionID id = settings.sectionIterator().next();
        assertEquals("Company", id.getSenderCompID());
        assertEquals("FixedIncome", id.getSenderSubID());
        assertEquals("HongKong", id.getSenderLocationID());
        assertEquals("CLIENT1", id.getTargetCompID());
        assertEquals("HedgeFund", id.getTargetSubID());
        assertEquals("NYC", id.getTargetLocationID());
    }

    public void testSettings() throws Exception {
        SessionSettings settings = setUpSession();

        SessionID sessionID1 = new SessionID("FIX.4.2", "TW", "CLIENT1");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");
        SessionID sessionID3 = new SessionID("FIX.4.2", "FOO", "BAR");

        assertEquals("wrong setting", "acceptor", settings
                .getString(sessionID1, SessionFactory.SETTING_CONNECTION_TYPE));
        assertEquals("wrong setting", "00:00:00", settings.getString(sessionID2, Session.SETTING_END_TIME));
        assertEquals("wrong setting", "CLIENT1", settings.getString(sessionID1, SessionSettings.TARGETCOMPID));
        assertEquals("wrong setting", "CLIENT2", settings.getString(sessionID2, SessionSettings.TARGETCOMPID));

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

        Iterator<SessionID> sectionIterator = settings.sectionIterator();
        assertNotNull(sectionIterator.next());
        assertNotNull(sectionIterator.next());
        assertNotNull(sectionIterator.next());
        assertFalse(sectionIterator.hasNext());
    }

    public void testMergedProperties() throws Exception {
        SessionSettings settings = setUpSession();
        SessionID sessionID = new SessionID("FIX.4.2", "TW", "CLIENT1");

        // Only defined in defaults
        assertEquals("1234", settings.getSessionProperties(sessionID, true).get("TestLong"));
        assertEquals(null, settings.getSessionProperties(sessionID, false).get("TestLong"));
    }

    private SessionSettings setUpSession() throws ConfigError {
        return setUpSession(null);
    }

    public static SessionSettings setUpSession(String extra) throws ConfigError {
        String settingsString = "";
        settingsString += "#comment\n";
        settingsString += "[DEFAULT]\n";
        settingsString += "Empty=\n";
        settingsString += "ConnectionType=acceptor\n";
        settingsString += "SocketAcceptPort=5001\n";
        settingsString += "FileStorePath=store\n";
        settingsString += "StartTime=00:00:00\n";
        settingsString += "EndTime=00:00:00\n";
        settingsString += "TestLong=1234\n";
        settingsString += "TestLong2=abcd\n";
        settingsString += "TestDouble=12.34\n";
        settingsString += "TestDouble2=abcd\n";
        settingsString += "TestBoolTrue=Y\n";
        settingsString += "TestBoolFalse=N\n";
        settingsString += "SenderCompID=TW\n";
        settingsString += "\r\n";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.2\n";
        settingsString += "TargetCompID=CLIENT1\n";
        settingsString += "DataDictionary=../spec/FIX42.xml\n";
        settingsString += "\n";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.2\n";
        settingsString += "TargetCompID=CLIENT2\n";
        settingsString += "DataDictionary=../spec/FIX42.xml\n";
        if (extra != null) {
            settingsString += extra;
        }
        return createSettingsFromString(settingsString);
    }

    private static SessionSettings createSettingsFromString(String settingsString) throws ConfigError {
        ByteArrayInputStream cfg = new ByteArrayInputStream(settingsString.getBytes());
        return new SessionSettings(cfg);
    }

    public void testSessionKeyIterator() throws Exception {
        SessionSettings settings = setUpSession();
        Iterator<SessionID> itr = settings.sectionIterator();
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

    public void testFinalCommentWithoutTrailingNewline() throws Exception {
        SessionSettings settings = setUpSession("label=no trailing newline\n# a comment without trailing newline");
        SessionID sessionID2 = new SessionID("FIX.4.2", "TW", "CLIENT2");

        assertEquals("no trailing newline", settings.getString(sessionID2, "label"));
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

    // QFJ-204
    public void testVariableInterpolationInDefaultSection() throws Exception {
        System.setProperty("sender", "SENDER");
        System.setProperty("target", "TARGET");
        String settingsString = "";
        settingsString += "[DEFAULT]\n";
        settingsString += "SenderCompID=${sender}\n";
        settingsString += "[SESSION]\n";
        settingsString += "BeginString=FIX.4.2\n";
        settingsString += "TargetCompID=${target}\n";
        SessionSettings settings = createSettingsFromString(settingsString);
        assertEquals("wrong value", "SENDER", settings.getString("SenderCompID"));
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        assertEquals("wrong value", "SENDER", settings.getString(sessionID, "SenderCompID"));
        assertEquals("wrong value", "TARGET", settings.getString(sessionID, "TargetCompID"));

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

    public void testSettingsToStream() throws Exception {
        SessionSettings expectedSettings = setUpSession();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        expectedSettings.toStream(out);
        String writtenSettingsString = new String(out.toByteArray());
        assertSettingsEqual(expectedSettings, writtenSettingsString);
    }

    private void assertSettingsEqual(SessionSettings expectedSettings, String actualSettingsString) throws ConfigError {
        SessionSettings actualSettings = new SessionSettings(new ByteArrayInputStream(actualSettingsString.getBytes()));
        assertSectionEquals(expectedSettings.getDefaultProperties(), actualSettings.getDefaultProperties());
        Iterator<SessionID> sessionIDs = expectedSettings.sectionIterator();
        while (sessionIDs.hasNext()) {
            SessionID sessionID = (SessionID) sessionIDs.next();
            assertSectionEquals(expectedSettings.getSessionProperties(sessionID), actualSettings
                    .getSessionProperties(sessionID));
        }
    }

    private void assertSectionEquals(Properties expectedProperties, Properties actualProperties) {
        Set<Object> keySet = actualProperties.keySet();
        assertEquals("Key sets don't match", expectedProperties.keySet(), keySet);
        Iterator<Object> p = keySet.iterator();
        while (p.hasNext()) {
            String key = (String) p.next();
            assertEquals("property doesn't match", expectedProperties.getProperty(key), actualProperties
                    .getProperty(key));
        }
    }

    public void testToString() throws Exception {
        SessionSettings expectedSettings = setUpSession();
        String actualString = expectedSettings.toString();
        assertSettingsEqual(expectedSettings, actualString);
    }

    public void testParseSettingReconnectInterval() {
        assertTrue(Arrays.equals(null, SessionSettings.parseSettingReconnectInterval("")));
        assertTrue(Arrays.equals(null, SessionSettings.parseSettingReconnectInterval(null)));
        assertTrue(Arrays.equals(new int[] { 5 }, SessionSettings.parseSettingReconnectInterval("5")));
        assertTrue(Arrays.equals(new int[] { 5, 5 }, SessionSettings.parseSettingReconnectInterval("2x5")));
        assertTrue(Arrays.equals(new int[] { 5, 5, 5, 5 }, SessionSettings.parseSettingReconnectInterval("4x5")));
        assertTrue(Arrays.equals(new int[] { 5, 5, 15, 15 }, SessionSettings.parseSettingReconnectInterval("2x5;2x15")));
        assertTrue(Arrays.equals(new int[] { 5, 5, 15 }, SessionSettings.parseSettingReconnectInterval("2x5;15")));
        assertTrue(Arrays
                .equals(new int[] { 5, 5, 15, 30 }, SessionSettings.parseSettingReconnectInterval("2x5;15;30")));
        assertTrue(Arrays.equals(new int[] { 5, 5, 5, 15, 15, 30 }, SessionSettings
                .parseSettingReconnectInterval("3x5;2x15;30")));
        try {
            SessionSettings.parseSettingReconnectInterval("2x5;A");
            fail("Must throw InvalidParameterException");
        } catch (InvalidParameterException ex) {
            // OK
        }
    }

}