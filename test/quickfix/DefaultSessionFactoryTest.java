package quickfix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickfix.test.acceptance.ATApplication;
import junit.framework.TestCase;

public class DefaultSessionFactoryTest extends TestCase {

    private SessionID sessionID;
    private SessionSettings settings;
    private SessionFactory factory;

    protected void setUp() throws Exception {
        super.setUp();
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "FOO", "BAR");
        setUpDefaultSettings();
        factory = new DefaultSessionFactory(new ATApplication(), new MemoryStoreFactory(),
                new ScreenLogFactory(true, true, true));
    }

    public void testMinimalSettings() throws Exception {
        factory.create(sessionID, settings);
    }

    public void testNoConnectionType() throws Exception {
        settings.removeSetting(sessionID, SessionFactory.SETTING_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no connection type exception", "Missing ConnectionType");
    }

    public void testWrongConnectionType() throws Exception {
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE, "fargle");
        createSessionAndAssertConfigError("no connection type exception", "Invalid ConnectionType");
    }

    public void testUseDataDictionaryByDefault() {
        settings.removeSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
        createSessionAndAssertConfigError("no data dictionary exception",
                "DataDictionary not defined");
    }

    public void testBadPathForDataDictionary() throws Exception {
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "xyz");
        createSessionAndAssertConfigError("no data dictionary exception",
                ".*cannot find the file.*");
    }

    public void testIncorrectDayValues() throws Exception {
        String exceptionMessagePattern = "invalid format for day \\(use su,mo,tu,we,th,fr,sa\\): ";
        settings.setString(sessionID, Session.SETTING_START_DAY, "xx");
        createSessionAndAssertConfigError("no exception", exceptionMessagePattern + "'xx'");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_DAY, "yy");
        createSessionAndAssertConfigError("no exception", exceptionMessagePattern + "'yy'");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_DAY, "mo");
        createSessionAndAssertConfigError("no exception", "StartDay used without EndDay");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_DAY, "mo");
        createSessionAndAssertConfigError("no exception", "EndDay used without StartDay");

        assertValidDay("mon");
        assertValidDay("mond");
        assertValidDay("monda");
        assertValidDay("monday");
        assertValidDay("tu");
        assertValidDay("tuesday");
        assertValidDay("we");
        assertValidDay("wednes");
        assertValidDay("th");
        assertValidDay("thurs");
        assertValidDay("fr");
        assertValidDay("frid");
        assertValidDay("sa");
        assertValidDay("satur");
        assertValidDay("su");
        assertValidDay("sun");
    }

    public void testInitiatorWithoutHeartbeat() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_HEARTBTINT);
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        createSessionAndAssertConfigError("no exception", "HeartBtInt not defined");
    }

    private void assertValidDay(String day) throws ConfigError {
        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_DAY, day);
        settings.setString(sessionID, Session.SETTING_END_DAY, "mon");
        factory.create(sessionID, settings);
        // no exception
    }

    public void testIncorrectTimeValues() throws Exception {
        settings.setString(sessionID, Session.SETTING_START_TIME, "00:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        factory.create(sessionID, settings);
        // no exception

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_TIME, "xx");
        createSessionAndAssertConfigError("no exception", "invalid UTC time value: xx");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_TIME, "yy");
        createSessionAndAssertConfigError("no exception", "invalid UTC time value: yy");
    }

    private void createSessionAndAssertConfigError(String message, String pattern) {
        try {
            factory.create(sessionID, settings);
            fail(message);
        } catch (ConfigError e) {
            if (pattern != null) {
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(e.getMessage());
                assertTrue("exception message not matched, expected: " + pattern + ", got: "
                        + e.getMessage(), m.matches());
            }
        }
    }

    private void setUpDefaultSettings() {
        settings = new SessionSettings();
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, false);
        settings.setString(sessionID, Session.SETTING_START_TIME, "09:00:00");
        settings.setString(sessionID, Session.SETTING_END_TIME, "16:00:00");
        settings.setString(sessionID, Session.SETTING_HEARTBTINT, "10");
    }
}