package quickfix;

import java.util.Calendar;
import java.util.GregorianCalendar;
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

    private void doIsSessionTimeTest(SessionSchedule schedule, boolean inSession, int year,
            int month, int day, int hour, int minute, int second) {
        mockSystemTimeSource.setTime(getUtcTimeStamp(year, month, day, hour, minute, second));
        assertEquals("schedule is wrong", schedule.isSessionTime(), inSession);
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

        // start time is greater than end time
        start = getUtcTime(18, 0, 0);
        end = getUtcTime(13, 0, 0);
        schedule = new SessionSchedule(start.getTime(), end.getTime(), -1, -1);

        // same session same day
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 20, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same session time 2 is in next day
        t1 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 2, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // same session time 1 is in next day
        t1 = getUtcTimeStamp(2000, 10, 10, 2, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 19, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, true);

        // time 1 is 25 hours greater than time 2
        t1 = getUtcTimeStamp(2000, 10, 11, 21, 0, 0);
        t2 = getUtcTimeStamp(2000, 10, 10, 20, 0, 0);
        doIsSameSessionTest(schedule, t1, t2, false);

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

    private void doIsSameSessionTest(SessionSchedule schedule, Calendar time1, Calendar time2,
            boolean isSame) {
        assertEquals("schedule is wrong", schedule.isSameSession(time1, time2), isSame);
        assertEquals("schedule is wrong", schedule.isSameSession(time2, time1), isSame);
    }

    private Calendar getUtcTimeStamp(int year, int month, int day, int hour, int minute, int second) {
        Calendar c = new GregorianCalendar(year, month, day, hour, minute, second);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        return c;
    }

    private Calendar getUtcTime(int hour, int minute, int second) {
        Calendar c = new GregorianCalendar(1970, 0, 1, hour, minute, second);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        return c;
    }

    // public void testTimeZone() throws Exception {
    // SimpleDateFormat format = new SimpleDateFormat();
    // format.setTimeZone(TimeZone.getTimeZone("UTC"));
    // Calendar c = new GregorianCalendar(2004, 10, 10, 1, 2, 3);
    // System.out.println(format.format(c.getTime()));
    // c.setTimeZone(TimeZone.getTimeZone("UTC"));
    // System.out.println(format.format(c.getTime()));
    // }

}
