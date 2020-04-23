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
 * Corresponds to SessionTime in C++ code
 */
public class DefaultSessionSchedule implements SessionSchedule { 
    private static final int NOT_SET = -1;
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(.*)");
    private final TimeEndPoint startTime;
    private final TimeEndPoint endTime;
    private final boolean isNonStopSession;
    private final boolean isWeekdaySession;
    private final int[] weekdayOffsets;
    protected static final Logger LOG = LoggerFactory.getLogger(DefaultSessionSchedule.class);

    //Cache recent time data to reduce creation of calendar objects
    private ThreadLocal<Calendar> threadLocalCalendar;
    private ThreadLocal<TimeInterval> threadLocalRecentTimeInterval;

    public DefaultSessionSchedule(SessionSettings settings, SessionID sessionID) throws ConfigError,
            FieldConvertError {
        threadLocalCalendar = ThreadLocal.withInitial(SystemTime::getUtcCalendar);
        threadLocalRecentTimeInterval = new ThreadLocal<>();
        isNonStopSession = settings.isSetting(sessionID, Session.SETTING_NON_STOP_SESSION)
            && settings.getBool(sessionID, Session.SETTING_NON_STOP_SESSION);

        TimeZone defaultTimeZone = getDefaultTimeZone(settings, sessionID);
        if (isNonStopSession) {
            isWeekdaySession = false;
            weekdayOffsets = new int[0];
            startTime = endTime = new TimeEndPoint(NOT_SET, 0, 0, 0, defaultTimeZone);
            return;
        } else {
            isWeekdaySession = settings.isSetting(sessionID, Session.SETTING_WEEKDAYS);
        }

        boolean startDayPresent = settings.isSetting(sessionID, Session.SETTING_START_DAY);
        boolean endDayPresent = settings.isSetting(sessionID, Session.SETTING_END_DAY);

        if (isWeekdaySession) {
            if (startDayPresent || endDayPresent )
                throw new ConfigError("Session " + sessionID + ": usage of StartDay or EndDay is not compatible with setting " + Session.SETTING_WEEKDAYS);

            String weekdayNames = settings.getString(sessionID, Session.SETTING_WEEKDAYS);
            if (weekdayNames.isEmpty())
                throw new ConfigError("Session " + sessionID + ": " + Session.SETTING_WEEKDAYS + " is empty");

            String[] weekdayNameArray = weekdayNames.split(",");
            weekdayOffsets = new int[weekdayNameArray.length];
            for (int i = 0; i < weekdayNameArray.length; i++) {
                weekdayOffsets[i] = DayConverter.toInteger(weekdayNameArray[i]);
            }
        } else {
            weekdayOffsets = new int[0];

            if (startDayPresent && !endDayPresent) {
                throw new ConfigError("Session " + sessionID + ": StartDay used without EndDay");
            }

            if (endDayPresent && !startDayPresent) {
                throw new ConfigError("Session " + sessionID + ": EndDay used without StartDay");
            }
        }
        startTime = getTimeEndPoint(settings, sessionID, defaultTimeZone, Session.SETTING_START_TIME, Session.SETTING_START_DAY);
        endTime = getTimeEndPoint(settings, sessionID, defaultTimeZone, Session.SETTING_END_TIME, Session.SETTING_END_DAY);
        LOG.info("[{}] {}", sessionID, toString());
    }

    private TimeEndPoint getTimeEndPoint(SessionSettings settings, SessionID sessionID,
                                         TimeZone defaultTimeZone, String timeSetting, String daySetting) throws ConfigError,
            FieldConvertError {

        Matcher matcher = TIME_PATTERN.matcher(settings.getString(sessionID, timeSetting));
        if (!matcher.find()) {
            throw new ConfigError("Session " + sessionID + ": could not parse time '"
                    + settings.getString(sessionID, timeSetting) + "'.");
        }

        return new TimeEndPoint(
                getDay(settings, sessionID, daySetting, NOT_SET),
                Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)),
                Integer.parseInt(matcher.group(3)), getTimeZone(matcher.group(4), defaultTimeZone));
    }

    private TimeZone getDefaultTimeZone(SessionSettings settings, SessionID sessionID)
            throws ConfigError {
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

    private static class TimeEndPoint {
        private final int weekDay;
        private final int hour;
        private final int minute;
        private final int second;
        private final int timeInSeconds;
        private final TimeZone tz;

        public TimeEndPoint(int day, int hour, int minute, int second, TimeZone tz) {
            weekDay = day;
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

        int getDay() {
            return weekDay;
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

        if (isWeekdaySession) {
            while (intervalStart.getTimeInMillis() > t.getTimeInMillis() ||
                    !validDayOfWeek(intervalStart)) {
                intervalStart.add(Calendar.DAY_OF_WEEK, -1);
                intervalEnd.add(Calendar.DAY_OF_WEEK, -1);
            }

            if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
                intervalEnd.add(Calendar.DAY_OF_WEEK, 1);
            }

        } else {
            if (isSet(startTime.getDay())) {
                intervalStart.set(Calendar.DAY_OF_WEEK, startTime.getDay());
                if (intervalStart.getTimeInMillis() > t.getTimeInMillis()) {
                    intervalStart.add(Calendar.WEEK_OF_YEAR, -1);
                    intervalEnd.add(Calendar.WEEK_OF_YEAR, -1);
                }
            } else if (intervalStart.getTimeInMillis() > t.getTimeInMillis()) {
                intervalStart.add(Calendar.DAY_OF_YEAR, -1);
                intervalEnd.add(Calendar.DAY_OF_YEAR, -1);
            }

            if (isSet(endTime.getDay())) {
                intervalEnd.set(Calendar.DAY_OF_WEEK, endTime.getDay());
                if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
                    intervalEnd.add(Calendar.WEEK_OF_MONTH, 1);
                }
            } else if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
                intervalEnd.add(Calendar.DAY_OF_WEEK, 1);
            }
        }

        return timeInterval;
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

    @Override
    public boolean isSameSession(Calendar time1, Calendar time2) {
        if (isNonStopSession())
            return true;
        TimeInterval interval1 = theMostRecentIntervalBefore(time1);
        if (!interval1.isContainingTime(time1)) {
            return false;
        }
        TimeInterval interval2 = theMostRecentIntervalBefore(time2);
        return interval2.isContainingTime(time2) && interval1.equals(interval2);
    }

    @Override
    public boolean isNonStopSession() {
        return isNonStopSession;
    }

    private boolean isDailySession() {
        return !isSet(startTime.getDay()) && !isSet(endTime.getDay());
    }
    
    @Override
    public boolean isSessionTime() {
        if(isNonStopSession()) {
            return true;
        }
        Calendar now = threadLocalCalendar.get();
        now.setTimeInMillis(SystemTime.currentTimeMillis());
        TimeInterval mostRecentInterval = threadLocalRecentTimeInterval.get();
        if (mostRecentInterval != null && mostRecentInterval.isContainingTime(now)) {
            return true;
        }
        mostRecentInterval = theMostRecentIntervalBefore(now);
        boolean result = mostRecentInterval.isContainingTime(now);
        threadLocalRecentTimeInterval.set(mostRecentInterval);
        return result;
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
        if (isWeekdaySession) {
            try {
                for (int i = 0; i < weekdayOffsets.length; i++) {
                    buf.append(DayConverter.toString(weekdayOffsets[i]));
                    buf.append(", ");
                }
            } catch (ConfigError ex) {
                // this can't happen as these are created using DayConverter.toInteger
            }
        } else if (!isDailySession()) {
            buf.append("weekly, ");
            formatDayOfWeek(buf, startTime.getDay());
            buf.append(" ");
        } else {
            buf.append("daily, ");
        }

        if (local) {
            timeFormat.setTimeZone(startTime.getTimeZone());
        }
        buf.append(timeFormat.format(timeInterval.getStart().getTime()));

        buf.append(" - ");

        if (!isDailySession()) {
            formatDayOfWeek(buf, endTime.getDay());
            buf.append(" ");
        }
        if (local) {
            timeFormat.setTimeZone(endTime.getTimeZone());
        }
        buf.append(timeFormat.format(timeInterval.getEnd().getTime()));
    }

    private void formatDayOfWeek(StringBuilder buf, int dayOfWeek) {
        try {
            String dayName = DayConverter.toString(dayOfWeek).toUpperCase();
            if (dayName.length() > 3) {
                dayName = dayName.substring(0, 3);
            }
            buf.append(dayName);
        } catch (ConfigError e) {
            buf.append("[Error: unknown day ").append(dayOfWeek).append("]");
        }
    }

    private int getDay(SessionSettings settings, SessionID sessionID, String key, int defaultValue)
            throws ConfigError, FieldConvertError {
        return settings.isSetting(sessionID, key) ?
                DayConverter.toInteger(settings.getString(sessionID, key))
                : NOT_SET;
    }

    private boolean isSet(int value) {
        return value != NOT_SET;
    }

    private static int timeInSeconds(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
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
}
