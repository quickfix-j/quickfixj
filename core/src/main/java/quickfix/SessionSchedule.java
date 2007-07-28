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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Corresponds to SessionTime in C++ code
 */
class SessionSchedule {
    private static final int NOT_SET = -1;
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(.*)");
    private final TimeEndPoint startTime;
    private final TimeEndPoint endTime;

    SessionSchedule(SessionSettings settings, SessionID sessionID) throws ConfigError,
            FieldConvertError {
        boolean startDayPresent = settings.isSetting(sessionID, Session.SETTING_START_DAY);
        boolean endDayPresent = settings.isSetting(sessionID, Session.SETTING_END_DAY);

        if (startDayPresent && !endDayPresent) {
            throw new ConfigError("Session " + sessionID + ": StartDay used without EndDay");
        }

        if (endDayPresent && !startDayPresent) {
            throw new ConfigError("Session " + sessionID + ": EndDay used without StartDay");
        }

        boolean weeklySession = startDayPresent && endDayPresent;

        String startTimeString = settings.getString(sessionID, Session.SETTING_START_TIME);
        String endTimeString = settings.getString(sessionID, Session.SETTING_END_TIME);

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

        Matcher matcher = TIME_PATTERN.matcher(startTimeString);
        if (!matcher.find()) {
            throw new ConfigError("Session " + sessionID + ": could not parse start time '"
                    + startTimeString + "'.");
        }
        Calendar localTime = SystemTime.getUtcCalendar();
        TimeZone startTimeZone = getTimeZone(matcher.group(4), sessionTimeZone);
        localTime.setTimeZone(startTimeZone);
        localTime.set(Calendar.MILLISECOND, 0);
        localTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(matcher.group(1)));
        localTime.set(Calendar.MINUTE, Integer.parseInt(matcher.group(2)));
        localTime.set(Calendar.SECOND, Integer.parseInt(matcher.group(3)));
        Calendar startTime = SystemTime.getUtcCalendar();
        startTime.setTime(localTime.getTime());
        int startDay = NOT_SET;
        if (weeklySession) {
            startDay = getDay(settings, sessionID, Session.SETTING_START_DAY, NOT_SET);
        }

        matcher = TIME_PATTERN.matcher(endTimeString);
        if (!matcher.find()) {
            throw new ConfigError("Session " + sessionID + ": could not parse end time '"
                    + endTimeString + "'.");
        }
        localTime = SystemTime.getUtcCalendar();
        TimeZone endTimeZone = getTimeZone(matcher.group(4), sessionTimeZone);
        localTime.setTimeZone(endTimeZone);
        localTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(matcher.group(1)));
        localTime.set(Calendar.MINUTE, Integer.parseInt(matcher.group(2)));
        localTime.set(Calendar.SECOND, Integer.parseInt(matcher.group(3)));
        Calendar endTime = SystemTime.getUtcCalendar();
        endTime.setTime(localTime.getTime());
        int endDay = NOT_SET;
        if (weeklySession) {
            endDay = getDay(settings, sessionID, Session.SETTING_END_DAY, NOT_SET);
        }

        this.startTime = new TimeEndPoint(startDay, startTime,startTimeZone);
        this.endTime = new TimeEndPoint(endDay, endTime, endTimeZone);
    }

    private TimeZone getTimeZone(String tz, TimeZone defaultZone) {
        return "".equals(tz) ? defaultZone : TimeZone.getTimeZone(tz.trim());
    }
    
    private class TimeEndPoint {
        private final int weekDay;
        private final int hour;
        private final int minute;
        private final int second;
        private final int timeInSeconds;
        private final TimeZone tz;

        public TimeEndPoint(int day, Calendar c, TimeZone tz) {
            this(day, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND), tz);
        }

        public TimeEndPoint(int day, int hour, int minute, int second, TimeZone tz) {
            weekDay = day;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.tz = tz;
            timeInSeconds = timeInSeconds(hour, minute, second);
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        public String toString() {
            try {
                return (isSet(weekDay) ? "d=" + DayConverter.toString(weekDay) + "," : "") + hour
                        + ":" + minute + ":" + second + " " + tz;
            } catch (ConfigError e) {
                return "ERROR: " + e.getMessage();
            }
        }

        public int getDay() {
            return weekDay;
        }

        public int getTimeInSeconds() {
            return timeInSeconds;
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
        
        public TimeZone getTimeZone() {
            return tz;
        }
    }

    private TimeInterval theMostRecentIntervalBefore(Calendar t) {
        TimeInterval timeInterval = new TimeInterval();
        Calendar intervalStart = timeInterval.getStart();

        intervalStart.setTimeInMillis(t.getTimeInMillis());
        intervalStart.set(Calendar.HOUR_OF_DAY, startTime.getHour());
        intervalStart.set(Calendar.MINUTE, startTime.getMinute());
        intervalStart.set(Calendar.SECOND, startTime.getSecond());
        intervalStart.set(Calendar.MILLISECOND, 0);
        if (isSet(startTime.getDay())) {
            intervalStart.set(Calendar.DAY_OF_WEEK, startTime.getDay());
            if (intervalStart.getTimeInMillis() > t.getTimeInMillis()) {
                intervalStart.add(Calendar.WEEK_OF_YEAR, -1);
            }
        } else if (intervalStart.getTimeInMillis() > t.getTimeInMillis()) {
            intervalStart.add(Calendar.DAY_OF_YEAR, -1);
        }

        Calendar intervalEnd = timeInterval.getEnd();
        intervalEnd.setTimeInMillis(intervalStart.getTimeInMillis());
        intervalEnd.set(Calendar.HOUR_OF_DAY, endTime.getHour());
        intervalEnd.set(Calendar.MINUTE, endTime.getMinute());
        intervalEnd.set(Calendar.SECOND, endTime.getSecond());
        intervalEnd.set(Calendar.MILLISECOND, 0);
        if (isSet(endTime.getDay())) {
            intervalEnd.set(Calendar.DAY_OF_WEEK, endTime.getDay());
            if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
                intervalEnd.add(Calendar.WEEK_OF_MONTH, 1);
            }
        } else if (intervalEnd.getTimeInMillis() <= intervalStart.getTimeInMillis()) {
            intervalEnd.add(Calendar.DAY_OF_WEEK, 1);
        }

        return timeInterval;
        
    }

    private static class TimeInterval {
        private Calendar start = SystemTime.getUtcCalendar();
        private Calendar end = SystemTime.getUtcCalendar();

        public boolean isContainingTime(Calendar t) {
            return t.equals(start) || t.equals(end) || (t.after(start) && t.before(end));
        }

        public String toString() {
            return start.getTime() + " --> " + end.getTime();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof TimeInterval == false) {
                return false;
            }
            TimeInterval otherInterval = (TimeInterval) other;
            return start.equals(otherInterval.start) && end.equals(otherInterval.end);
        }

        public int hashCode() {
            assert false : "hashCode not supported";
            return 0;
        }
        
        public Calendar getStart() {
            return start;
        }

        public Calendar getEnd() {
            return end;
        }

    }

    public boolean isSameSession(Calendar time1, Calendar time2) {
        TimeInterval interval1 = theMostRecentIntervalBefore(time1);
        if (!interval1.isContainingTime(time1)) {
            return false;
        }
        TimeInterval interval2 = theMostRecentIntervalBefore(time2);
        if (!interval2.isContainingTime(time2)) {
            return false;
        }
        return interval1.equals(interval2);
    }

    private boolean isDailySession() {
        return !isSet(startTime.getDay()) && !isSet(endTime.getDay());
    }

    public boolean isSessionTime() {
        Calendar now = SystemTime.getUtcCalendar();
        TimeInterval interval = theMostRecentIntervalBefore(now);
        return interval.isContainingTime(now);
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();

        SimpleDateFormat dowFormat = new SimpleDateFormat("EEEE");
        dowFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
        timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        TimeInterval ti = theMostRecentIntervalBefore(SystemTime.getUtcCalendar());

        formatTimeInterval(buf, ti, timeFormat, false);

        // Now the localized equivalents, if necessary
        if (startTime.getTimeZone() != SystemTime.UTC_TIMEZONE
                || endTime.getTimeZone() != SystemTime.UTC_TIMEZONE) {
            buf.append(" (");
            formatTimeInterval(buf, ti, timeFormat, true);
            buf.append(")");
        }

        return buf.toString();
    }

    private void formatTimeInterval(StringBuffer buf, TimeInterval timeInterval,
            SimpleDateFormat timeFormat, boolean local) {
        if (!isDailySession()) {
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

    private void formatDayOfWeek(StringBuffer buf, int dayOfWeek) {
        try {
            String dayName = DayConverter.toString(dayOfWeek).toUpperCase();
            if (dayName.length() > 3) {
                dayName = dayName.substring(0, 3);
            }
            buf.append(dayName);
        } catch (ConfigError e) {
            buf.append("[Error: unknown day " + dayOfWeek + "]");
        }
    }

    private int getDay(SessionSettings settings, SessionID sessionID, String key, int defaultValue)
            throws ConfigError, FieldConvertError {
        return DayConverter.toInteger(settings.getString(sessionID, key));
    }

    private boolean isSet(int value) {
        return value != NOT_SET;
    }

    private int timeInSeconds(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
    }
}