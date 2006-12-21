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
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
    private final TimeEndPoint startTime;
    private final TimeEndPoint endTime;
    private final TimeZone sessionTimeZone;

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
        localTime.setTimeZone(sessionTimeZone);
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
        localTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(matcher.group(1)));
        localTime.set(Calendar.MINUTE, Integer.parseInt(matcher.group(2)));
        localTime.set(Calendar.SECOND, Integer.parseInt(matcher.group(3)));
        Calendar endTime = SystemTime.getUtcCalendar();
        endTime.setTime(localTime.getTime());
        int endDay = NOT_SET;
        if (weeklySession) {
            endDay = getDay(settings, sessionID, Session.SETTING_END_DAY, NOT_SET);
        }

        this.startTime = new TimeEndPoint(startDay, startTime);
        this.endTime = new TimeEndPoint(endDay, endTime);
    }

    private class TimeEndPoint {
        private final int weekDay;
        private final int hour;
        private final int minute;
        private final int second;
        private final int timeInSeconds;

        public TimeEndPoint(int day, Calendar c) {
            this(day, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
        }

        public TimeEndPoint(int day, int hour, int minute, int second) {
            weekDay = day;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
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
                        + ":" + minute + ":" + second;
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
    }

    private TimeInterval theMostRecentIntervalBefore(Calendar t) {
        TimeInterval timeInterval = new TimeInterval();
        Calendar startCal = timeInterval.getStart();
        startCal.setTimeInMillis(t.getTimeInMillis());
        startCal.set(Calendar.MILLISECOND, 0);

        int scheduleStartDay = startTime.getDay();
        int scheduleStartHour = startTime.getHour();

        int day = t.get(Calendar.DAY_OF_WEEK);

        if (isSet(scheduleStartDay)) {
            startCal.set(Calendar.DAY_OF_WEEK, scheduleStartDay);
            if (day < scheduleStartDay
                    || (isSameDay(day, scheduleStartDay) && isTimeBefore(t, startTime))) {
                startCal.add(Calendar.WEEK_OF_YEAR, -1);
            }
        } else {
            if (isTimeBefore(t, startTime)) {
                startCal.add(Calendar.DATE, -1);
            }
        }

        startCal.set(Calendar.HOUR_OF_DAY, scheduleStartHour);
        startCal.set(Calendar.MINUTE, startTime.getMinute());
        startCal.set(Calendar.SECOND, startTime.getSecond());

        Calendar endCal = timeInterval.getEnd();
        endCal.setTimeInMillis(startCal.getTimeInMillis());

        int scheduleEndDay = endTime.getDay();

        if (isSet(scheduleEndDay)) {
            endCal.set(Calendar.DAY_OF_WEEK, scheduleEndDay);
            if (scheduleStartDay > scheduleEndDay
                    || (isSameDay(scheduleStartDay, scheduleEndDay) && isTimeAfter(startTime,
                            endTime))) {
                endCal.add(Calendar.WEEK_OF_YEAR, 1);
            }
        }

        if (!isSet(scheduleEndDay)
                && (isTimeAfter(startTime, endTime) || startTime.equals(endTime))) {
            endCal.add(Calendar.DATE, 1);
        }

        endCal.set(Calendar.HOUR_OF_DAY, endTime.getHour());
        endCal.set(Calendar.MINUTE, endTime.getMinute());
        endCal.set(Calendar.SECOND, endTime.getSecond());

        return timeInterval;
    }

    private boolean isSameDay(int day1, int day2) {
        return day1 == day2;
    }

    private boolean isTimeBefore(Calendar calendar, TimeEndPoint timeEndPoint) {
        return timeInSeconds(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND)) < timeEndPoint.getTimeInSeconds();
    }

    private boolean isTimeAfter(TimeEndPoint timeEndPoint, TimeEndPoint timeEndPoint2) {
        return timeEndPoint.getTimeInSeconds() > timeEndPoint2.getTimeInSeconds();
    }

    private class TimeInterval {
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

        formatTimeInterval(buf, ti, timeFormat);

        // Now the localized equivalents, if necessary
        if (sessionTimeZone != null && !TimeZone.getTimeZone("UTC").equals(sessionTimeZone)) {
            dowFormat.setTimeZone(sessionTimeZone);
            timeFormat.setTimeZone(sessionTimeZone);

            buf.append(" (");
            formatTimeInterval(buf, ti, timeFormat);
            buf.append(")");
        }

        return buf.toString();
    }

    private void formatTimeInterval(StringBuffer buf, TimeInterval timeInterval,
            SimpleDateFormat timeFormat) {
        if (!isDailySession()) {
            buf.append("weekly, ");
            formatDayOfWeek(buf, startTime.getDay());
            buf.append(" ");
        } else {
            buf.append("daily, ");
        }

        buf.append(timeFormat.format(timeInterval.getStart().getTime()));

        buf.append(" - ");

        if (!isDailySession()) {
            formatDayOfWeek(buf, endTime.getDay());
            buf.append(" ");
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