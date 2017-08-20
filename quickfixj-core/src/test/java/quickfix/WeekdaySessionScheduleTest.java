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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import quickfix.field.converter.UtcTimeOnlyConverter;

public class WeekdaySessionScheduleTest {
    private MockSystemTimeSource mockSystemTimeSource;
    private Locale defaultLocale;

    @Before
    public void setUp() throws Exception {
        mockSystemTimeSource = new MockSystemTimeSource();
        SystemTime.setTimeSource(mockSystemTimeSource);
        defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.GERMANY);
    }

    @After
    public void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        Locale.setDefault(defaultLocale);
    }

    private SessionSchedule newSessionSchedule(Date startTime, Date endTime, String weekdays) throws Exception {
        SessionSettings settings = new SessionSettings();
        if (weekdays != null && weekdays.length() > 0) {
            settings.setString(Session.SETTING_WEEKDAYS, weekdays);
        }
        if (startTime != null) {
            settings.setString(Session.SETTING_START_TIME, UtcTimeOnlyConverter.convert(startTime, false));
        }
        if (endTime != null) {
            settings.setString(Session.SETTING_END_TIME, UtcTimeOnlyConverter.convert(endTime, false));
        }
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        return new WeekdaySessionSchedule(settings, sessionID);
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
        assertEquals("in session expectation incorrect", expectedInSession, schedule
                .isSessionTime());
    }

    private void doIsSessionTimeTest(SessionSettings settings, SessionID sessionID,
                                     boolean expectedInSession, int year, int month, int day, int hour, int minute,
                                     int second, String timeZoneID) throws ConfigError, FieldConvertError {
        mockSystemTimeSource.setTime(getTimeStamp(year, month, day, hour, minute, second, TimeZone
                .getTimeZone(timeZoneID)));
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);
        assertEquals("schedule is wrong", expectedInSession, schedule.isSessionTime());
    }

    @Test
    public void testMissingStartTime() throws Exception {
        Calendar end = getUtcTime(18, 0, 0);
        try {
            newSessionSchedule(null, end.getTime(), "Mon");
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testMissingEndTime() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        try {
            newSessionSchedule(start.getTime(), null, "Mon");
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testMissingWeekdays() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        try {
            newSessionSchedule(start.getTime(), end.getTime(), null);
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testInvalidWeekdays1() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        try {
            newSessionSchedule(start.getTime(), end.getTime(), "AAA");
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testInvalidWeekdays2() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        try {
            newSessionSchedule(start.getTime(), end.getTime(), ",Mon");
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testInvalidWeekdays3() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        try {
            newSessionSchedule(start.getTime(), end.getTime(), "Mon,,Tue");
            fail("no exception");
        } catch (ConfigError e) {
            // do nothing
        }
    }

    @Test
    public void testSessionTimeStartBeforeEnd() throws Exception {
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        SessionSchedule schedule = newSessionSchedule(start.getTime(), end.getTime(), "Mon,Tue,Wed,Thu,Fri");
        // Sunday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 2, 59, 59);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 18, 0, 1);
        // Monday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 2, 2, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 2, 3, 0, 0);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 2, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 2, 18, 0, 1);
        // Tuesday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 3, 2, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 3, 3, 0, 0);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 3, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 3, 18, 0, 1);
        // Wednesday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 4, 2, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 4, 3, 0, 0);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 4, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 4, 18, 0, 1);
        // Thursday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 5, 2, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 5, 3, 0, 0);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 5, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 5, 18, 0, 1);
        // Friday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 6, 2, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 6, 3, 0, 0);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 6, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 6, 18, 0, 1);
        // Saturday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 2, 59, 59);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 18, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 18, 0, 1);
    }
    @Test
    public void testSessionTimeEndBeforeStart() throws Exception {
        Calendar start = getUtcTime(18, 0, 0);
        Calendar end = getUtcTime(3, 0, 0);
        SessionSchedule schedule = newSessionSchedule(start.getTime(), end.getTime(), "Mon,Tue,Wed,Thu,Fri");
        // Sunday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 17, 59, 59);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 1, 18, 0, 0);
        // Monday
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 2, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 2, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 2, 17, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 2, 18, 0, 0);
        // Tuesday
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 3, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 3, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 3, 17, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 3, 18, 0, 0);
        // Wednesday
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 4, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 4, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 4, 17, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 4, 18, 0, 0);
        // Thursday
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 5, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 5, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 5, 17, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 5, 18, 0, 0);
        // Friday
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 6, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 6, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 6, 17, 59, 59);
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 6, 18, 0, 0);
        // Saturday
        doIsSessionTimeTest(schedule, true, 2017, Calendar.JANUARY, 7, 3, 0, 0);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 3, 0, 1);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 17, 59, 59);
        doIsSessionTimeTest(schedule, false, 2017, Calendar.JANUARY, 7, 18, 0, 0);
    }

    @Test
    public void testIsSameSession() throws Exception {
        // =====================================================
        // start time is less than end time
        Calendar start = getUtcTime(3, 0, 0);
        Calendar end = getUtcTime(18, 0, 0);
        SessionSchedule schedule = newSessionSchedule(start.getTime(), end.getTime(), "Mon,Tue,Wed,Thu,Fri");

        // same time
        Calendar t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        Calendar t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 2 in same session but greater
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 2 in same session but less
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 1 not in session
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 1);
        doIsSameSessionTest(schedule, t1, t2, false);

        // time 2 not in session
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 1);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // same time (in session window) two different days
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 3, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // =====================================================
        // start time is greater than end time
        start = getUtcTime(18, 0, 0);
        end = getUtcTime(13, 0, 0);
        schedule = newSessionSchedule(start.getTime(), end.getTime(), "Mon,Tue,Wed,Thu,Fri");

        // same session same day
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 19, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same time (in session window) two different days
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 18, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // same session time 2 is in next day
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 3, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same session time 1 is in next day
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 3, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 1 is 25 hours greater than time 2
        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 19, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

        // =====================================================
        // start time is equal to end time
        start = getUtcTime(6, 0, 0);
        end = getUtcTime(6, 0, 0);
        schedule = newSessionSchedule(start.getTime(), end.getTime(), "Mon,Tue,Wed,Thu,Fri");

        t1 = getUtcTimeStamp(2017, Calendar.JANUARY, 3, 18, 0, 0);
        t2 = getUtcTimeStamp(2017, Calendar.JANUARY, 2, 18, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);
    }

    @Test
    public void testSettingsWithoutStartEndDayWithTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "  US/Eastern ");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);
        TimeZone tz = TimeZone.getTimeZone("US/Eastern");
        doIsSessionTimeTest(schedule, false, 2002, 5, 5, 0, 59, 0, tz);
        doIsSessionTimeTest(schedule, true, 2002, 7, 5, 14, 30, 0, tz);
        doIsSessionTimeTest(schedule, false, 2003, 5, 5, 16, 30, 0, tz);
    }

    @Test
    public void testSettingsWithTimeZoneInTime() throws Exception {
        // This test is very susceptible to whether the system time starts
        // in daylight time or not, so we just force it that way.  Otherwise
        // the first time the mock time source gets set to a time with daylight time
        // then the schedule appears to change 1 hr.
        TimeZone tz = TimeZone.getTimeZone("US/Eastern");
        mockSystemTimeSource.setTime(getTimeStamp(2002, 5, 5, 0, 0, 0, tz));
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "01:00:00 US/Eastern");
        settings.setString(Session.SETTING_END_TIME, "15:00:00 US/Central");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2002, 5, 5, 0, 59, 0, tz);
        doIsSessionTimeTest(schedule, true, 2002, 7, 5, 14, 30, 0, tz);

        // The end time is actually 16:00 Eastern time but specified as
        // 15:00 Central time.
        doIsSessionTimeTest(schedule, true, 2003, 5, 5, 15, 59, 0, tz);
        doIsSessionTimeTest(schedule, true, 2003, 5, 5, 16, 0, 0, tz);
        doIsSessionTimeTest(schedule, false, 2003, 5, 5, 16, 1, 0, tz);
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
    @Test
    public void testThatUTCAndGMTAreTheSameNow() throws ConfigError, FieldConvertError,
            ParseException {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "00:01:00");
        settings.setString(Session.SETTING_END_TIME, "21:50:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri,Sat,Sun");

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

    @Test
    public void testBadTimeSpecification() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");

        try {
            settings.setString(Session.SETTING_START_TIME, "01:xx:00");
            settings.setString(Session.SETTING_END_TIME, "15:00:00");
            new WeekdaySessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().contains("could not parse"));
        }

        try {
            settings.setString(Session.SETTING_START_TIME, "01:00:00");
            settings.setString(Session.SETTING_END_TIME, "15:00:yy");
            new WeekdaySessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().contains("could not parse"));
        }
    }

    @Test
    public void testBadTimeZone() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/BOGUS");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");

        try {
            new WeekdaySessionSchedule(settings, sessionID);
            fail("no exception");
        } catch (ConfigError e) {
            assertTrue(e.getMessage().contains("Unrecognized time zone"));
        }
    }

    @Test
    public void testWeekdayToString() throws ConfigError, FieldConvertError {
        // Just be sure it doesn't throw exceptions
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "US/Eastern");
        settings.setString(Session.SETTING_START_TIME, "01:00:00");
        settings.setString(Session.SETTING_END_TIME, "15:00:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);
        assertNotNull(schedule.toString());
    }

    @Test
    public void testSettingsWithDST() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "Europe/Zurich");
        settings.setString(Session.SETTING_START_TIME, "01:30:00");
        settings.setString(Session.SETTING_END_TIME, "03:15:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri,Sat,Sun");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        //
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 20, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 20, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 20, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 20, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 20, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        schedule = new WeekdaySessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 27, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 27, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 27, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 27, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 27, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 28, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 28, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 28, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 28, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 28, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 29, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 29, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 29, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2012, Calendar.OCTOBER, 29, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2012, Calendar.OCTOBER, 29, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        schedule = new WeekdaySessionSchedule(settings, sessionID);
        doIsSessionTimeTest(schedule, false, 2013, Calendar.MARCH, 30, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.MARCH, 30, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.MARCH, 30, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.MARCH, 30, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2013, Calendar.MARCH, 30, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        doIsSessionTimeTest(schedule, false, 2013, Calendar.MARCH, 31, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.MARCH, 31, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2013, Calendar.MARCH, 31, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich")); // -> this is 03:16 !
        doIsSessionTimeTest(schedule, true, 2013, Calendar.MARCH, 31, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2013, Calendar.MARCH, 31, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        //
        doIsSessionTimeTest(schedule, false, 2013, Calendar.APRIL, 1, 1, 29, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.APRIL, 1, 1, 31, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.APRIL, 1, 2, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, true, 2013, Calendar.APRIL, 1, 3, 14, 0, TimeZone.getTimeZone("Europe/Zurich"));
        doIsSessionTimeTest(schedule, false, 2013, Calendar.APRIL, 1, 3, 16, 0, TimeZone.getTimeZone("Europe/Zurich"));
    }

    @Test
    public void testSettingsWithStartEndDayWithDSTMocked() throws Exception {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_TIMEZONE, "America/New_York");
        settings.setString(Session.SETTING_START_TIME, "20:00:00");
        settings.setString(Session.SETTING_END_TIME, "17:00:00");
        settings.setString(Session.SETTING_WEEKDAYS, "Mon,Tue,Wed,Thu,Fri,Sat,Sun");

        mockSystemTimeSource.setTime(getTimeStamp(2008, Calendar.NOVEMBER, 2, 18, 0, 0, TimeZone.getTimeZone("America/New_York")));

        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new WeekdaySessionSchedule(settings, sessionID);

        //System.out.println(schedule);

        // November,2 -> Sunday
        doIsSessionTimeTest(schedule, true, 2008, Calendar.NOVEMBER, 2, 20, 0, 0,
                TimeZone.getTimeZone("America/New_York"));
        // November,7 -> Friday
        doIsSessionTimeTest(schedule, true, 2008, Calendar.NOVEMBER, 7, 17, 0, 0,
                TimeZone.getTimeZone("America/New_York"));
    }

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("E M/d HH:mm:ss");

    {
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private void doIsSameSessionTest(SessionSchedule schedule, Calendar time1, Calendar time2,
                                     boolean isSameSession) {
        assertEquals("isSameSession is wrong", isSameSession, schedule.isSameSession(time1, time2));
        assertEquals("isSameSession is wrong", isSameSession, schedule.isSameSession(time2, time1));
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
        // Monday
        return getUtcTimeStamp(2017, Calendar.JANUARY, 2, hour, minute, second);
    }
}
