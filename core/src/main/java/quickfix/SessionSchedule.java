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
import java.util.Comparator;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentSkipListSet;

/**
 * Corresponds to SessionTime in C++ code
 */
class SessionSchedule {
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");

    private TimeEndPoint startTime;
    private TimeEndPoint endTime;

    private TimeZone sessionTimeZone;

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
        int startDay = -1;
        if (weeklySession) {
            startDay = getDay(settings, sessionID, Session.SETTING_START_DAY, -1);
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
        int endDay = -1;
        if (weeklySession) {
            endDay = getDay(settings, sessionID, Session.SETTING_END_DAY, -1);
        }

        initialize(startDay, startTime, endDay, endTime);
    }

    SessionSchedule(int startDay, Calendar startTime, int endDay, Calendar endTime) {
        initialize(startDay, startTime, endDay, endTime);
    }

    private void initialize(int startDay, Calendar startTime, int endDay, Calendar endTime) {
        this.startTime = new TimeEndPoint(startDay, startTime);
        this.endTime = new TimeEndPoint(endDay, endTime);
    }

    private class TimeEndPoint {
        private int weekDay;
        private int hour;
        private int minute;
        private int second;

        public TimeEndPoint(int day, Calendar c) {
            this(day, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
        }

        public TimeEndPoint(int day, int hour, int minute, int second) {
            weekDay = day;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
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
                return (weekDay != -1 ? "d=" + DayConverter.toString(weekDay) + "," : "") + hour
                        + ":" + minute + ":" + second;
            } catch (ConfigError e) {
                return "ERROR: " + e.getMessage();
            }
        }

        public int getDay() {
            return weekDay;
        }
    }

    private TimeInterval theMostRecentIntervalBefore(Calendar t) {
        TimeInterval timeInterval = getIntervalFromPool();
        Calendar startCal = timeInterval.getStart();
        startCal.setTimeInMillis(t.getTimeInMillis());
        startCal.set(Calendar.MILLISECOND, 0);

        if (startTime.getDay() != -1) {
            startCal.set(Calendar.DAY_OF_WEEK, startTime.getDay());
        }
        if (startTime.getDay() == -1 && t.get(Calendar.HOUR_OF_DAY) < startTime.getHour()) {
            startCal.add(Calendar.DATE, -1);
        }
        if (startTime.getDay() != -1
                && (t.get(Calendar.DAY_OF_WEEK) < startTime.getDay() || (t
                        .get(Calendar.DAY_OF_WEEK) == startTime.getDay() && t
                        .get(Calendar.HOUR_OF_DAY) < startTime.getHour()))) {
            startCal.add(Calendar.WEEK_OF_YEAR, -1);
        }
        startCal.set(Calendar.HOUR_OF_DAY, startTime.getHour());
        startCal.set(Calendar.MINUTE, startTime.getMinute());
        startCal.set(Calendar.SECOND, startTime.getSecond());

        Calendar endCal = timeInterval.getEnd();
        endCal.setTimeInMillis(startCal.getTimeInMillis());

        if (endTime.getDay() != -1) {
            endCal.set(Calendar.DAY_OF_WEEK, endTime.getDay());
        }
        if (endTime.getDay() == -1 && startTime.getHour() >= endTime.getHour()) {
            endCal.add(Calendar.DATE, 1);
        }
        if (endTime.getDay() != -1
                && (startTime.getDay() > endTime.getDay() || (startTime.getDay() == endTime
                        .getDay() && startTime.getHour() >= endTime.getHour()))) {
            endCal.add(Calendar.WEEK_OF_YEAR, 1);
        }
        endCal.set(Calendar.HOUR_OF_DAY, endTime.getHour());
        endCal.set(Calendar.MINUTE, endTime.getMinute());
        endCal.set(Calendar.SECOND, endTime.getSecond());

        return timeInterval;
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

        public void release() {
            start.clear();
            end.clear();
            intervalPool.add(this);
        }
    }

    private ConcurrentSkipListSet intervalPool = new ConcurrentSkipListSet(new Comparator() {

        public int compare(Object o1, Object o2) {
            return 1;
        }
    });

    private TimeInterval getIntervalFromPool() {
        TimeInterval i = (TimeInterval) intervalPool.pollFirst();
        if (i == null) {
            i = new TimeInterval();
        }
        return i;
    }

    public boolean isSameSession(Calendar time1, Calendar time2) {
        TimeInterval interval1 = null;
        TimeInterval interval2 = null;
        try {
            interval1 = theMostRecentIntervalBefore(time1);
            if (!interval1.isContainingTime(time1)) {
                return false;
            }

            interval2 = theMostRecentIntervalBefore(time2);
            if (!interval2.isContainingTime(time2)) {
                return false;
            }

            return interval1.equals(interval2);
        } finally {
            if (interval1 != null) {
                interval1.release();
            }
            if (interval2 != null) {
                interval2.release();
            }
        }
    }

    private boolean isDailySession() {
        return startTime.getDay() == -1 && endTime.getDay() == -1;
    }

    public boolean isSessionTime() {
        Calendar now = SystemTime.getUtcCalendar();
        TimeInterval interval = theMostRecentIntervalBefore(now);
        try {
            return interval.isContainingTime(now);
        } finally {
            interval.release();
        }
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
}