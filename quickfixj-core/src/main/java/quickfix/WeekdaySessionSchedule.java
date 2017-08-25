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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Daily schedule that can be configured to only login on specific days e.g. Mon -> Fri
 * The day specified corresponds to the day that the StartTime is valid,
 * this is relevant when StartTime is after EndTime
 */
public class WeekdaySessionSchedule implements SessionSchedule {
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(.*)");

    private final int[] weekdayOffsets;
    private final TimeEndPoint startTime;
    private final TimeEndPoint endTime;

    protected final static Logger log = LoggerFactory.getLogger(WeekdaySessionSchedule.class);

    WeekdaySessionSchedule(SessionSettings settings, SessionID sessionID) throws ConfigError,
            FieldConvertError {

        TimeZone defaultTimeZone = getDefaultTimeZone(settings, sessionID);

        if (!settings.isSetting(sessionID, Session.SETTING_WEEKDAYS))
            throw new ConfigError("Session " + sessionID + ": does not have " + Session.SETTING_WEEKDAYS + " specified");

        String weekdayNames = settings.getString(sessionID, Session.SETTING_WEEKDAYS);
        if (weekdayNames.isEmpty())
            throw new ConfigError("Session " + sessionID + ": " + Session.SETTING_WEEKDAYS + " is empty");

        String[] weekdayNameArray = weekdayNames.split(",");
        weekdayOffsets = new int[weekdayNameArray.length];
        for (int i = 0; i < weekdayNameArray.length; i++) {
            if (weekdayNameArray[i].length() != 3)
                throw new ConfigError("Session " + sessionID + ": " + Session.SETTING_WEEKDAYS + " has an illegal weekday: [" + weekdayNameArray[i] + "] in " + weekdayNames);

            weekdayOffsets[i] = DayConverter.toInteger(weekdayNameArray[i]);
        }

        startTime = getTimeEndPoint(settings, sessionID, defaultTimeZone, Session.SETTING_START_TIME);
        endTime = getTimeEndPoint(settings, sessionID, defaultTimeZone, Session.SETTING_END_TIME);

        log.info("{} using schedule: {}", sessionID, toString());
    }

    private TimeEndPoint getTimeEndPoint(SessionSettings settings, SessionID sessionID,
                                         TimeZone defaultTimeZone, String timeSetting) throws ConfigError,
            FieldConvertError {

        Matcher matcher = TIME_PATTERN.matcher(settings.getString(sessionID, timeSetting));
        if (!matcher.find()) {
            throw new ConfigError("Session " + sessionID + ": could not parse time '"
                    + settings.getString(sessionID, timeSetting) + "'.");
        }

        return new TimeEndPoint(
                Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)),
                Integer.parseInt(matcher.group(3)), getTimeZone(matcher.group(4), defaultTimeZone));
    }

    private TimeZone getDefaultTimeZone(SessionSettings settings, SessionID sessionID)
            throws ConfigError, FieldConvertError {
        TimeZone sessionTimeZone;
        if (settings.isSetting(sessionID, Session.SETTING_TIMEZONE)) {
            String sessionTimeZoneID = settings.getString(sessionID, Session.SETTING_TIMEZONE);
            sessionTimeZone = TimeZone.getTimeZone(sessionTimeZoneID);
            if ("GMT".equals(sessionTimeZone.getID()) && !"GMT".equals(sessionTimeZoneID)) {
                throw new ConfigError("Unrecognized time zone '" + sessionTimeZoneID
                        + "' for session " + sessionID);
            }
        } else {
            sessionTimeZone = TimeZone.getTimeZone("UTC");
        }
        return sessionTimeZone;
    }

    private TimeZone getTimeZone(String tz, TimeZone defaultZone) {
        return "".equals(tz) ? defaultZone : TimeZone.getTimeZone(tz.trim());
    }

    private class TimeEndPoint {
        private final int hour;
        private final int minute;
        private final int second;
        private final int timeInSeconds;
        private final TimeZone tz;

        TimeEndPoint(int hour, int minute, int second, TimeZone tz) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.tz = tz;
            timeInSeconds = timeInSeconds(hour, minute, second);
        }

        int getHour() {
            return hour;
        }

        int getMinute() {
            return minute;
        }

        int getSecond() {
            return second;
        }

        public String toString() {
            Calendar calendar = Calendar.getInstance(tz);
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, minute);
            calendar.set(Calendar.SECOND, second);
            final SimpleDateFormat utc = new SimpleDateFormat("HH:mm:ss");
            utc.setTimeZone(TimeZone.getTimeZone("UTC"));
            return utc.format(calendar.getTime()) + "-" + utc.getTimeZone().getID();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof TimeEndPoint) {
                TimeEndPoint otherTime = (TimeEndPoint) o;
                return timeInSeconds == otherTime.timeInSeconds;
            }
            return false;
        }

        public int hashCode() {
            assert false : "hashCode not supported";
            return 0;
        }

        TimeZone getTimeZone() {
            return tz;
        }
    }

    /**
     * find the most recent session date/time range on or before t
     * if t is in a session then that session will be returned
     * @param t specific date/time
     * @return relevant session date/time range
     */
    private TimeInterval theMostRecentIntervalBefore(Calendar t) {
        TimeInterval timeInterval = new TimeInterval();
        Calendar intervalStart = timeInterval.getStart();
        intervalStart.setTimeZone(startTime.getTimeZone());
        intervalStart.setTimeInMillis(t.getTimeInMillis());
        intervalStart.set(Calendar.HOUR_OF_DAY, startTime.getHour());
        intervalStart.set(Calendar.MINUTE, startTime.getMinute());
        intervalStart.set(Calendar.SECOND, startTime.getSecond());
        intervalStart.set(Calendar.MILLISECOND, 0);

        Calendar intervalEnd = timeInterval.getEnd();
        intervalEnd.setTimeZone(endTime.getTimeZone());
        intervalEnd.setTimeInMillis(t.getTimeInMillis());
        intervalEnd.set(Calendar.HOUR_OF_DAY, endTime.getHour());
        intervalEnd.set(Calendar.MINUTE, endTime.getMinute());
        intervalEnd.set(Calendar.SECOND, endTime.getSecond());
        intervalEnd.set(Calendar.MILLISECOND, 0);

        while (intervalStart.getTimeInMillis() > t.getTimeInMillis() ||
                !validDayOfWeek(intervalStart)) {
            intervalStart.add(Calendar.DAY_OF_WEEK, -1);
            intervalEnd.add(Calendar.DAY_OF_WEEK, -1);
        }

        if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
            intervalEnd.add(Calendar.DAY_OF_WEEK, 1);
        }

        return timeInterval;
    }

    /**
     * is the startDateTime a valid day based on the permitted days of week
     * @param startDateTime time to test
     * @return flag indicating if valid
     */
    private boolean validDayOfWeek(Calendar startDateTime) {
        int dow = startDateTime.get(Calendar.DAY_OF_WEEK);
        for (int i = 0; i < weekdayOffsets.length; i++)
            if (weekdayOffsets[i] == dow)
                return true;
        return false;
    }

    private static class TimeInterval {
        private final Calendar start = SystemTime.getUtcCalendar();
        private final Calendar end = SystemTime.getUtcCalendar();

        boolean isContainingTime(Calendar t) {
            return t.compareTo(start) >= 0 && t.compareTo(end) <= 0;
        }

        public String toString() {
            return start.getTime() + " --> " + end.getTime();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInterval)) {
                return false;
            }
            TimeInterval otherInterval = (TimeInterval) other;
            return start.equals(otherInterval.start) && end.equals(otherInterval.end);
        }

        public int hashCode() {
            assert false : "hashCode not supported";
            return 0;
        }

        Calendar getStart() {
            return start;
        }

        Calendar getEnd() {
            return end;
        }
    }

    /**
     * Predicate for determining if the two times are in the same session
     * @param time1 test time 1
     * @param time2 test time 2
     * @return return true if in the same session
     */
    @Override
    public boolean isSameSession(Calendar time1, Calendar time2) {
        TimeInterval interval1 = theMostRecentIntervalBefore(time1);
        if (!interval1.isContainingTime(time1)) {
            return false;
        }
        TimeInterval interval2 = theMostRecentIntervalBefore(time2);
        return interval2.isContainingTime(time2) && interval1.equals(interval2);
    }

    @Override
    public boolean isNonStopSession() {
        return false;
    }

    /**
     * Predicate for determining if the session should be active at the current time.
     *
     * @return true if session should be active, false otherwise.
     */
    @Override
    public boolean isSessionTime() {
        return isSessionTime(SystemTime.getUtcCalendar());
    }

    boolean isSessionTime(Calendar time) {
        TimeInterval interval = theMostRecentIntervalBefore(time);
        return interval.isContainingTime(time);
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();

        SimpleDateFormat dowFormat = new SimpleDateFormat("EEEE");
        dowFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss-z");
        timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        TimeInterval ti = theMostRecentIntervalBefore(SystemTime.getUtcCalendar());

        formatTimeInterval(buf, ti, timeFormat, false);

        // Now the localized equivalents, if necessary
        if (!startTime.getTimeZone().equals(SystemTime.UTC_TIMEZONE)
                || !endTime.getTimeZone().equals(SystemTime.UTC_TIMEZONE)) {
            buf.append(" (");
            formatTimeInterval(buf, ti, timeFormat, true);
            buf.append(")");
        }

        return buf.toString();
    }

    private void formatTimeInterval(StringBuilder buf, TimeInterval timeInterval,
                                    SimpleDateFormat timeFormat, boolean local) {
        try {
            for (int i = 0; i < weekdayOffsets.length; i++) {
                buf.append(DayConverter.toString(weekdayOffsets[i]));
                buf.append(", ");
            }
        } catch (ConfigError ex) {
            // this can't happen as these are created using DayConverter.toInteger
        }

        if (local) {
            timeFormat.setTimeZone(startTime.getTimeZone());
        }
        buf.append(timeFormat.format(timeInterval.getStart().getTime()));

        buf.append(" - ");

        if (local) {
            timeFormat.setTimeZone(endTime.getTimeZone());
        }
        buf.append(timeFormat.format(timeInterval.getEnd().getTime()));
    }

    private int timeInSeconds(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
    }
}
