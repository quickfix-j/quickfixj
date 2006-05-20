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

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

public class SessionScheduleTest extends TestCase {
    private MockSystemTimeSource mockSystemTimeSource;
    private Locale defaultLocale;

    protected void setUp() throws Exception {
        super.setUp();
        mockSystemTimeSource = new MockSystemTimeSource();
        SystemTime.setTimeSource(mockSystemTimeSource);
        defaultLocale = Locale.getDefault();
    }

    protected void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        Locale.setDefault(defaultLocale);
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

    private void doIsSessionTimeTest(SessionSettings settings, SessionID sessionID,
            boolean expectedInSession, int year, int month, int day, int hour, int minute,
            int second, String timeZoneID) throws ConfigError, FieldConvertError {
        mockSystemTimeSource.setTime(getTimeStamp(year, month, day, hour, minute, second, TimeZone
                .getTimeZone(timeZoneID)));
        SessionSchedule schedule = new SessionSchedule(settings, sessionID);
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

        // ------------

        start = getUtcTime(10, 0, 0);
        end = getUtcTime(2, 0, 0);
        schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);

        t1 = getUtcTimeStamp(2000, 10, 10, 17, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 1, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);
        t2 = getUtcTimeStamp(2000, 10, 9, 23, 0, 0);
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

        // Reset start/end time so that they fall within an hour of midnight
        Calendar startTime = getUtcTime(0, 5, 0);
        Calendar endTime = getUtcTime(23, 45, 0);

        // Make it a week-long session
        int startDay = 1;
        int endDay = 7;
        schedule = new SessionSchedule(startTime.getTime(), endTime.getTime(), startDay, endDay);

        // Check that ST-->DST (Sunday is missing one hour) is handled
        t1 = getUtcTimeStamp(2006, 4, 4, 0, 0, 0);
        t2 = getUtcTimeStamp(2006, 4, 3, 1, 0, 0);
        doIsSameSessionTest( schedule, t1, t2, true );

        // Check that DST-->ST (Sunday has an extra hour) is handled
        t1 = getUtcTimeStamp(2006, 10, 30, 1, 0, 0);
        t2 = getUtcTimeStamp(2006, 10, 31, 1, 0, 0);
        doIsSameSessionTest( schedule, t1, t2, true );

        // Check that everything works across a year boundary
        t1 = getUtcTimeStamp(2006, 12, 31, 10, 10, 10);
        t2 = getUtcTimeStamp(2007, 1, 1, 10, 10, 10);
        doIsSameSessionTest( schedule, t1, t2, true );

//        // Check that "missing" start and end days are handled as isSameSession without days
//        startDay = -1;
//        endDay = -1;
//        schedule = new SessionSchedule(startTime.getTime(), endTime.getTime(), startDay, endDay);
//        doIsSameSessionTest( schedule, t1, t2, true );
    }

    public void testSettingsWithoutStartEndDay() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "01:00:00 ");
        settings.setString(Session.SETTING_END_TIME, " 05:00:00");
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
        settings.setString(Session.SETTING_TIMEZONE, "  US/Eastern ");
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

    /**
     * From 1968 to 1971, GMT was an hour ahead of UTC. If we perform all our calculations in 1970,
     * someone in GMT (e.g. London) will see sessions ending an hour later than expected. This test
     * demonstrates the 1970 behavior and verifies that calculations on current dates give the proper results.
     *
     * <p/>
     * More details at:
     * <p/>
     * http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4644278
     * http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4832236
     */
    public void testThatUTCAndGMTAreTheSameNow() throws ConfigError, FieldConvertError,
            ParseException {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "00:01:00");
        settings.setString(Session.SETTING_END_TIME, "21:50:00");

        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");

        // In 1970, a session configured to end at 21:50 UTC would end at
        // 22:50 London time any time of year.
        doIsSessionTimeTest(settings, sessionID, true, 1970, Calendar.JANUARY, 27, 22, 50, 0,
                "Europe/London");
        doIsSessionTimeTest(settings, sessionID, false, 1970, Calendar.JANUARY, 27, 22, 50, 1,
                "Europe/London");
        doIsSessionTimeTest(settings, sessionID, true, 1970, Calendar.JULY, 27, 22, 50, 0,
                "Europe/London");
        doIsSessionTimeTest(settings, sessionID, false, 1970, Calendar.JULY, 27, 22, 50, 1,
                "Europe/London");

        // Now, at least in winter, it should end at 21:50 in both zones --
        // if the end time session setting is being parsed correctly.
        doIsSessionTimeTest(settings, sessionID, true, 2006, Calendar.FEBRUARY, 27, 21, 50, 0,
                "Europe/London");
        doIsSessionTimeTest(settings, sessionID, false, 2006, Calendar.FEBRUARY, 27, 21, 50, 1,
                "Europe/London");

        // When summer time (BST) is in effect, London time will be an hour
        // ahead again, and the session will end at 22:50 there.
        doIsSessionTimeTest(settings, sessionID, true, 2006, Calendar.JULY, 27, 22, 50, 0,
                "Europe/London");
        doIsSessionTimeTest(settings, sessionID, false, 2006, Calendar.JULY, 27, 22, 50, 1,
                "Europe/London");

        settings.setString(Session.SETTING_TIMEZONE, "Europe/London");

        // In 1970, a session configured to end at 21:50 GMT would end at
        // 20:50 UTC any time of year.
        doIsSessionTimeTest(settings, sessionID, true, 1970, Calendar.JANUARY, 27, 20, 50, 0, "UTC");
        doIsSessionTimeTest(settings, sessionID, false, 1970, Calendar.JANUARY, 27, 20, 50, 1,
                "UTC");
        doIsSessionTimeTest(settings, sessionID, true, 1970, Calendar.JULY, 27, 20, 50, 0, "UTC");
        doIsSessionTimeTest(settings, sessionID, false, 1970, Calendar.JULY, 27, 20, 50, 1, "UTC");

        // Now, at least in winter, it should end at 21:50 in both zones --
        // if the end time session setting is being parsed correctly.
        doIsSessionTimeTest(settings, sessionID, true, 2006, Calendar.FEBRUARY, 27, 21, 50, 0,
                "UTC");
        doIsSessionTimeTest(settings, sessionID, false, 2006, Calendar.FEBRUARY, 27, 21, 50, 1,
                "UTC");

        // When summer time (BST) is in effect, London time will be an hour
        // ahead again, and the session will end at 20:50 UTC there.
        doIsSessionTimeTest(settings, sessionID, true, 2006, Calendar.JULY, 27, 20, 50, 0, "UTC");
        doIsSessionTimeTest(settings, sessionID, false, 2006, Calendar.JULY, 27, 20, 50, 1, "UTC");
    }

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

        Locale.setDefault(Locale.FRANCE);
        settings.setString(sessionID, Session.SETTING_START_DAY, "lun.");
        settings.setString(sessionID, Session.SETTING_END_DAY, "vendredi");
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
        assertEquals("schedule is wrong", isSameSession, schedule.isSameSession(time1, time2));
        assertEquals("schedule is wrong", isSameSession, schedule.isSameSession(time2, time1));
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
