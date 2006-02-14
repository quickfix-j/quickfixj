package quickfix;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;
import quickfix.test.acceptance.ATApplication;

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

    public void testUseDataDictionaryByDefault() throws Exception {
        settings.removeSetting(sessionID, Session.SETTING_USE_DATA_DICTIONARY);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "BOGUS");
        createSessionAndAssertDictionaryNotFound();
    }

    private void createSessionAndAssertDictionaryNotFound() throws ConfigError {
        try {
            factory.create(sessionID, settings);
            fail("no data dictionary exception");
        } catch (DataDictionary.Exception e) {
            assertTrue("exception message not matched, expected: " + "... Could not find data ..."
                    + ", got: " + e.getMessage(),
                    e.getMessage().indexOf("Could not find data") != -1);
        }
    }

    public void testBadPathForDataDictionary() throws Exception {
        settings.setBool(sessionID, Session.SETTING_USE_DATA_DICTIONARY, true);
        settings.setString(sessionID, Session.SETTING_DATA_DICTIONARY, "xyz");
        createSessionAndAssertDictionaryNotFound();
    }

    public void testIncorrectDayValues() throws Exception {
        settings.setString(sessionID, Session.SETTING_START_DAY, "mon");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: StartDay used without EndDay");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_DAY, "mon");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: EndDay used without StartDay");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_DAY, "Monday");
        settings.setString(sessionID, Session.SETTING_END_DAY, "Tuesday");
        settings.setString(sessionID, Session.SETTING_START_DAY, "xx");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse start time 'xx 09:00:00'.");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_START_DAY, "Monday");
        settings.setString(sessionID, Session.SETTING_END_DAY, "Tuesday");
        settings.setString(sessionID, Session.SETTING_END_DAY, "yy");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse end time 'yy 16:00:00'.");

        assertValidDay("mon");
        assertValidDay("monday");
        assertValidDay("tuesday");
        assertValidDay("wed");
        assertValidDay("thu");
        assertValidDay("fri");
        assertValidDay("sat");
        assertValidDay("sun");
    }

    public void testFrenchDayValues() {
        setUpDefaultSettings();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        settings.setString(sessionID, Session.SETTING_START_DAY, "lun.");
        settings.setString(sessionID, Session.SETTING_END_DAY, "vendredi");
        Locale.setDefault(defaultLocale);
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
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse start time 'xx'.");

        setUpDefaultSettings();
        settings.setString(sessionID, Session.SETTING_END_TIME, "yy");
        createSessionAndAssertConfigError("no exception",
                "Session FIX.4.2:FOO->BAR: could not parse end time 'yy'.");
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
        settings.setString(sessionID, "BeginString", "FIX.4.2");
    }
}