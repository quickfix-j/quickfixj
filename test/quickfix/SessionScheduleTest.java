package quickfix;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

public class SessionScheduleTest extends TestCase {
    private MockSystemTimeSource mockSystemTimeSource;

    protected void setUp() throws Exception {
        super.setUp();
        mockSystemTimeSource = new MockSystemTimeSource();
        SystemTime.setTimeSource(mockSystemTimeSource);
    }

    protected void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        super.tearDown();
    }

    public void testSessionTimeStartBeforeEnd() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        SessionSchedule schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);
        doIsSessionTimeTest(schedule, true, 2004, 10, 10, 10, 0, 0);
        doIsSessionTimeTest(schedule, true, 2004, 10, 10, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2004, 10, 10, 2, 0, 0);
        doIsSessionTimeTest(schedule, false, 2004, 10, 10, 19, 0, 0);
        doIsSessionTimeTest(schedule, false, 2004, 10, 10, 18, 0, 1);
    }

    public void testSessionTimeEndBeforeStart() throws Exception {
        Calendar start = getUtcTime(18, 0, 0);
        Calendar end = getUtcTime(3, 0, 0);
        SessionSchedule schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);
        doIsSessionTimeTest(schedule, true, 2000, 10, 10, 18, 0, 0);
        doIsSessionTimeTest(schedule, true, 2000, 10, 10, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2000, 10, 10, 4, 0, 0);
        doIsSessionTimeTest(schedule, false, 2004, 10, 10, 17, 0, 0);
    }

    private void doIsSessionTimeTest(SessionSchedule schedule, boolean expectedInSession, int year,
            int month, int day, int hour, int minute, int second) {
        doIsSessionTimeTest(schedule, expectedInSession, year, month, day, hour, minute, second,
                TimeZone.getTimeZone("UTC"));
    }

    private void doIsSessionTimeTest(SessionSchedule schedule, boolean expectedInSession, int year,
            int month, int day, int hour, int minute, int second, TimeZone timeZone) {
        mockSystemTimeSource
                .setTime(getTimeStamp(year, month, day, hour, minute, second, timeZone));
        assertEquals("schedule is wrong", expectedInSession, schedule.isSessionTime());
    }

    public void testSessionTimeWithDay() throws Exception {
        Calendar start = getUtcTime(18, 0, 0);
        Calendar end = getUtcTime(3, 0, 0);
        SessionSchedule schedule = new SessionSchedule(start.getTime(), end.getTime(), 7, 7);

        doIsSessionTimeTest(schedule, false, 2004, 6, 24, 10, 0, 0);
        doIsSessionTimeTest(schedule, true, 2004, 6, 24, 18, 0, 0);
        doIsSessionTimeTest(schedule, true, 2004, 6, 24, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2004, 6, 24, 3, 0, 1);
        doIsSessionTimeTest(schedule, true, 2004, 6, 24, 18, 0, 1);
        doIsSessionTimeTest(schedule, false, 2004, 6, 25, 3, 0, 1);
        doIsSessionTimeTest(schedule, true, 2004, 6, 26, 18, 0, 1);
    }

    public void testIsSameSessionWithoutDay() throws Exception {
        //=====================================================
        // start time is less than end time
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        SessionSchedule schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);

        // same time
        Calendar t1 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        Calendar t2 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 2 in same session but greater
        t1 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 11, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 2 in same session but less
        t1 = getUtcTimeStamp(2000, 10, 10, 11, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 1 not in session
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // time 2 not in session
        t1 = getUtcTimeStamp(2000, 10, 10, 10, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 2, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // same time (in session window) two different days
        t1 = getUtcTimeStamp(2000, 10, 10, 12, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 11, 12, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        //=====================================================
        // start time is greater than end time
        start = getUtcTime(18, 0, 0);
        end = getUtcTime(13, 0, 0);
        schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);

        // same session same day
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 20, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same time (in session window) two different days
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 11, 19, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // same session time 2 is in next day
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 11, 2, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same session time 1 is in next day
        t1 = getUtcTimeStamp(2000, 10, 11, 2, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 1 is 25 hours greater than time 2
        t1 = getUtcTimeStamp(2000, 10, 11, 21, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 20, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        //=====================================================
        // start time is equal to end time
        start = getUtcTime(6, 0, 0);
        end = getUtcTime(6, 0, 0);
        schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);

        t1 = getUtcTimeStamp(2004, 1, 13, 19, 10, 0);
        t2 = getUtcTimeStamp(2004, 10, 14, 19, 06, 0);
        doIsSameSessionTest(schedule, t1, t2, false);
    }

    public void testIsSameSessionWithDay() throws Exception {
        SessionSchedule schedule = new SessionSchedule(getUtcTime(3, 0, 0).getTime(), getUtcTime(
                18, 0, 0).getTime(), 2, 5);

        Calendar t1 = getUtcTimeStamp(2004, 6, 27, 3, 0, 0);
        Calendar t2 = getUtcTimeStamp(2004, 6, 25, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        t1 = getUtcTimeStamp(2004, 6, 31, 3, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 27, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        t1 = getUtcTimeStamp(2004, 6, 27, 3, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 27, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        t1 = getUtcTimeStamp(2004, 6, 26, 10, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 27, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        t1 = getUtcTimeStamp(2004, 6, 27, 10, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 29, 2, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        t1 = getUtcTimeStamp(2004, 6, 27, 10, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 20, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        t1 = getUtcTimeStamp(2004, 6, 27, 2, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 20, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        t1 = getUtcTimeStamp(2004, 6, 26, 2, 0, 0);
        t2 = getUtcTimeStamp(2004, 6, 19, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

    }

    public void testSettingsWithoutStartEndDay() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "05:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2002, 5, 5, 0, 30, 0);
        doIsSessionTimeTest(schedule, true, 2002, 7, 5, 1, 30, 0);
        doIsSessionTimeTest(schedule, false, 2003, 5, 5, 6, 30, 0);
    }

    public void testSettingsWithStartEndDay() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_DAY, "Tue");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_DAY, "Fri");
        settings.setString(Session.SETTING_END_TIME, "05:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2006, 1, 27, 0, 30, 0);
        doIsSessionTimeTest(schedule, false, 2006, 1, 27, 1, 30, 0);
        doIsSessionTimeTest(schedule, true, 2006, 1, 28, 1, 30, 0);
        doIsSessionTimeTest(schedule, true, 2006, 1, 28, 6, 30, 0);
        doIsSessionTimeTest(schedule, false, 2006, 2, 4, 4, 30, 0);
    }

    public void testSettingsWithoutStartEndDayWithTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        TimeZone tz = TimeZone.getTimeZone("US/Eastern");
        doIsSessionTimeTest(schedule, false, 2002, 5, 5, 0, 59, 0, tz);
        doIsSessionTimeTest(schedule, true, 2002, 7, 5, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2003, 5, 5, 16, 30, 0, tz);
    }
    
    public void testSettingsWithStartEndDayAndTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_DAY, "Tue");
        settings.setString(Session.SETTING_END_DAY, "Fri");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        TimeZone tz = TimeZone.getTimeZone("US/Eastern");        
        doIsSessionTimeTest(schedule, false, 2006, 1, 27, 0, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 1, 27, 1, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 1, 28, 0, 59, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 1, 28, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 2, 1, 0, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 2, 3, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 2, 3, 16, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 2, 4, 16, 30, 0);
    }

    public void testSettingsWithStartGreaterThanEndDayAndTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_DAY, "Fri");
        settings.setString(Session.SETTING_END_DAY, "Mon");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        TimeZone tz = TimeZone.getTimeZone("US/Eastern");        
        doIsSessionTimeTest(schedule, true, 2006, 1, 27, 0, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 1, 27, 1, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 1, 27, 16, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 1, 28, 0, 59, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 1, 28, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 2, 1, 0, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2006, 2, 3, 0, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 2, 3, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 2, 3, 16, 30, 0, tz);
        doIsSessionTimeTest(schedule, true, 2006, 2, 4, 16, 30, 0);
    }

    // TODO TEST Add test for UTC/GMT issue in 1970

    public void testBadDaySpecification() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_DAY, "BOGUS");
        settings.setString(Session.SETTING_END_DAY, "FARGLE");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        try {
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("invalid format") != -1);
        }        
    }

    public void testBadTimeSpecification() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
 
        try {
            settings.setString(Session.SETTING_START_TIME, "01:xx:00");
            settings.setString(Session.SETTING_END_TIME, "15:00:00");
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("could not parse start") != -1);
        }        

        try {
            settings.setString(Session.SETTING_START_TIME, "01:00:00");
            settings.setString(Session.SETTING_END_TIME, "15:00:yy");
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("could not parse end") != -1);
        }        
}

    public void testMissingStartOrEndDay() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
 
        String dayNames[] = new DateFormatSymbols(Locale.getDefault()).getWeekdays();

        try {
            settings.setString(sessionID, Session.SETTING_START_DAY, dayNames[1]);
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("without EndDay") != -1);
        }        

        try {
            settings.removeSetting(sessionID, Session.SETTING_START_DAY);
            settings.setString(Session.SETTING_END_DAY, dayNames[1]);
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("without StartDay") != -1);
        }        
}

    public void testFrenchDayValues() {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");

        Locale defaultLocale = Locale.getDefault();
        try {
            Locale.setDefault(Locale.FRANCE);
            settings.setString(sessionID, Session.SETTING_START_DAY, "lun.");
            settings.setString(sessionID, Session.SETTING_END_DAY, "vendredi");
        } finally {
            Locale.setDefault(defaultLocale);
        }
    }


    public void testBadTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/BOGUS");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
 
        try {
            new SessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().indexOf("Unrecognized time zone") != -1);
        }        
}

    public void testWeeklyToString() throws ConfigError, FieldConvertError {
        // Just be sure it doesn't throw exceptions
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_DAY, "Tue");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_DAY, "Fri");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        assertNotNull(schedule.toString());
    }
    
    public void testDailyToString() throws ConfigError, FieldConvertError {
        // Just be sure it doesn't throw exceptions
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
        assertNotNull(schedule.toString());
    }

    private void doIsSameSessionTest(SessionSchedule schedule, Calendar time1, Calendar time2,
            boolean isSameSession) {
        assertEquals("schedule is wrong", schedule.isSameSession(time1, time2), isSameSession);
        assertEquals("schedule is wrong", schedule.isSameSession(time2, time1), isSameSession);
    }

    private Calendar getTimeStamp(int year, int month, int day, int hour, int minute, int second,
            TimeZone timeZone) {
        Calendar c = new GregorianCalendar(year, month, day, hour, minute, second);
        c.setTimeZone(timeZone);
        return c;
    }

    private Calendar getUtcTimeStamp(int year, int month, int day, int hour, int minute, int second) {
        return getTimeStamp(year, month, day, hour, minute, second, TimeZone.getTimeZone("UTC"));
    }

    private Calendar getUtcTime(int hour, int minute, int second) {
        Calendar c = new GregorianCalendar(1970, 0, 1, hour, minute, second);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        return c;
    }
}
