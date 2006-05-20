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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Corresponds to SessionTime in C++ code
 */
class SessionSchedule {
    private static final long ONE_DAY_IN_MILLIS = 86400000L;
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");

    //
    // These are cached calendars. Creating calendars to do session time calculations
    // on every message was too expensive. This is a performance optimization.
    // It assumes that there is a separate SessionTime object for each session and
    // that the session is accessing it in a single thread.
    //
    private Calendar calendar1 = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
    private Calendar calendar2 = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
    private int endDay = -1;
    private Calendar endTime;
    private TimeZone sessionTimeZone;
    private int startDay = -1;
    private Calendar startTime;

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
        localTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(matcher.group(1)));
        localTime.set(Calendar.MINUTE, Integer.parseInt(matcher.group(2)));
        localTime.set(Calendar.SECOND, Integer.parseInt(matcher.group(3)));
        startTime = SystemTime.getUtcCalendar();
        startTime.setTime(localTime.getTime());
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
        endTime = SystemTime.getUtcCalendar();
        endTime.setTime(localTime.getTime());
        if (weeklySession) {
            endDay = getDay(settings, sessionID, Session.SETTING_END_DAY, -1);
        }
        calendar1.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    SessionSchedule(Date startTime, Date endTime, int startDay, int endDay) {
        this.startTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        this.startTime.setTime(startTime);
        this.endTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        this.endTime.setTime(endTime);
        this.startDay = startDay;
        this.endDay = endDay;
        if (startDay > 0 && endDay > 0 && startDay == endDay && endTime.after(startTime)) {
            endTime = startTime;
        }
        calendar1.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private Calendar getDateOnly(Calendar timestampIn, Calendar dateOnlyOut) {
        dateOnlyOut.set(Calendar.HOUR_OF_DAY, 0);
        dateOnlyOut.set(Calendar.MINUTE, 0);
        dateOnlyOut.set(Calendar.SECOND, 0);
        dateOnlyOut.set(timestampIn.get(Calendar.YEAR), timestampIn.get(Calendar.MONTH),
                timestampIn.get(Calendar.DAY_OF_MONTH));
        return dateOnlyOut;
    }

    private Calendar getTimeOnly(Calendar timestampIn, Calendar timeOnlyOut) {
        Calendar cal = SystemTime.getUtcCalendar();
        timeOnlyOut.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        timeOnlyOut.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        timeOnlyOut.set(Calendar.DATE, cal.get(Calendar.DATE));
        timeOnlyOut.set(Calendar.HOUR_OF_DAY, timestampIn.get(Calendar.HOUR_OF_DAY));
        timeOnlyOut.set(Calendar.MINUTE, timestampIn.get(Calendar.MINUTE));
        timeOnlyOut.set(Calendar.SECOND, timestampIn.get(Calendar.SECOND));
        return timeOnlyOut;
    }

    private void adjustSessionTimes() {
        Calendar cal = SystemTime.getUtcCalendar();
        startTime.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        startTime.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        startTime.set(Calendar.DATE, cal.get(Calendar.DATE));
        endTime.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        endTime.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        endTime.set(Calendar.DATE, cal.get(Calendar.DATE));
    }

    private boolean isDailySessionTime(Calendar timestamp) {
        Calendar timeOnly = getTimeOnly(timestamp, calendar1);
        return startTime.before(endTime)
                ? ((timeOnly.after(startTime) || timeOnly.equals(startTime)) && (timeOnly
                        .before(endTime) || timeOnly.equals(endTime)))
                : ((timeOnly.after(startTime) || timeOnly.equals(startTime)) || (timeOnly
                        .before(endTime) || timeOnly.equals(endTime)));
    }

    private boolean isSameDailySession(Calendar timestamp1, Calendar timestamp2) {
        if (!isDailySessionTime(timestamp1) || !isDailySessionTime(timestamp2)) {
            return false;
        }

        if (timestamp1.equals(timestamp2)) {
            return true;
        }

        Calendar date1 = getDateOnly(timestamp1, calendar1);
        Calendar date2 = getDateOnly(timestamp2, calendar2);

        if (startTime.before(endTime) || startTime.equals(endTime)) {
            return date1.equals(date2);
        } else {
            long sessionLength = ONE_DAY_IN_MILLIS
                    - (startTime.getTimeInMillis() - endTime.getTimeInMillis());

            long timeInMillis1 = timestamp1.getTimeInMillis();
            long timeInMillis2 = timestamp2.getTimeInMillis();

            if (timestamp1.after(timestamp2)) {
                long delta = getTimeOnly(timestamp2, calendar1).getTimeInMillis()
                        - startTime.getTimeInMillis();

                if (delta < 0) {
                    delta = ONE_DAY_IN_MILLIS + delta;
                }

                return (timeInMillis1 - timeInMillis2) < (sessionLength - delta);
            } else {
                return (timeInMillis2 - timeInMillis1) < sessionLength;
            }
        }
    }

    public boolean isSameSession(Calendar time1, Calendar time2) {
        adjustSessionTimes();
        if (startDay < 0 && endDay < 0) {
            return isSameDailySession(time1, time2);
        }
        return isSameWeeklySession(time1, time2);
    }

    private boolean isSameWeeklySession(Calendar timestamp1, Calendar timestamp2) {
        if (!isWeeklySessionTime(timestamp1) || !isWeeklySessionTime(timestamp2)) {
            return false;
        }

        long day1 = timestamp1.getTimeInMillis() / 86400000L;
        long day2 = timestamp2.getTimeInMillis() / 86400000L;
        return Math.abs(day1 - day2) < 7;
    }

    public boolean isSessionTime() {
        adjustSessionTimes();
        Calendar now = SystemTime.getUtcCalendar();
        if (startDay < 0 && endDay < 0) {
            return isDailySessionTime(now);
        }
        return isWeeklySessionTime(now);
    }

    private boolean isWeekly() {
        return startDay > 0 && endDay > 0;
    }

    private boolean isWeeklySessionTime(Calendar timestamp) {
        int currentDay = timestamp.get(Calendar.DAY_OF_WEEK);
        Calendar currentTime = getTimeOnly(timestamp, calendar1);

        if (startDay == endDay) {
            if (currentTime.before(startTime) && currentTime.after(endTime)) {
                return false;
            }
        } else if (startDay < endDay) {
            if (currentDay < startDay || currentDay > endDay) {
                return false;
            } else if (currentDay == startDay && currentTime.before(startTime)) {
                return false;
            } else if (currentDay == endDay && currentTime.after(endTime)) {
                return false;
            }
        } else if (startDay > endDay) {
            if (currentDay < startDay && currentDay > endDay) {
                return false;
            } else if (currentDay == startDay && currentTime.before(startTime)) {
                return false;
            } else if (currentDay == endDay && currentTime.after(endTime)) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        adjustSessionTimes();
        StringBuffer buf = new StringBuffer();

        SimpleDateFormat dowFormat = new SimpleDateFormat("EEEE");
        dowFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
        timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Calendar now = SystemTime.getUtcCalendar();
        now.setTime(startTime.getTime());

        if (isWeekly()) {
            buf.append("weekly, ");
            now.set(Calendar.DAY_OF_WEEK, startDay);
            buf.append(dowFormat.format(now.getTime()));
            buf.append(" ");
        } else {
            buf.append("daily, ");
        }

        buf.append(timeFormat.format(now.getTime()));

        buf.append(" - ");

        now.setTime(endTime.getTime());
        if (isWeekly()) {
            now.set(Calendar.DAY_OF_WEEK, endDay);
            buf.append(dowFormat.format(now.getTime()));
            buf.append(" ");
        }
        buf.append(timeFormat.format(now.getTime()));

        // Now the localized equivalents, if necessary
        if (sessionTimeZone != null && !TimeZone.getTimeZone("UTC").equals(sessionTimeZone)) {
            dowFormat.setTimeZone(sessionTimeZone);
            timeFormat.setTimeZone(sessionTimeZone);

            buf.append(" (");
            now.setTime(startTime.getTime());
            if (isWeekly()) {
                now.set(Calendar.DAY_OF_WEEK, startDay);
                buf.append(dowFormat.format(now.getTime()));
                buf.append(" ");
            }

            buf.append(timeFormat.format(now.getTime()));

            buf.append(" - ");

            now.setTime(endTime.getTime());
            if (isWeekly()) {
                now.set(Calendar.DAY_OF_WEEK, endDay);
                buf.append(dowFormat.format(now.getTime()));
                buf.append(" ");
            }
            buf.append(timeFormat.format(now.getTime()));
            buf.append(")");
        }
        return buf.toString();
    }

    private int getDay(SessionSettings settings, SessionID sessionID, String key, int defaultValue)
            throws ConfigError, FieldConvertError {
        return DayConverter.toInteger(settings.getString(sessionID, key));
    }

}