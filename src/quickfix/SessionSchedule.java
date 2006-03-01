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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Corresponds to SessionTime in C++ code
 */
class SessionSchedule {
    private static final long ONE_DAY_IN_MILLIS = 86400000L;

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

    SessionSchedule(SessionSettings settings, SessionID sessionID) throws ConfigError, FieldConvertError {
        if (settings.isSetting(sessionID, Session.SETTING_START_DAY) && !settings.isSetting(sessionID, Session.SETTING_END_DAY))
        {
            throw new ConfigError("Session " + sessionID + ": StartDay used without EndDay");
        }

        if (settings.isSetting(sessionID, Session.SETTING_END_DAY) && !settings.isSetting(sessionID, Session.SETTING_START_DAY))
        {
            throw new ConfigError("Session " + sessionID + ": EndDay used without StartDay");
        }

        String startTimeString = settings.getString(sessionID, Session.SETTING_START_TIME);
        String endTimeString = settings.getString(sessionID, Session.SETTING_END_TIME);

        boolean weeklySession = false;

        SimpleDateFormat timeParser = null;
        if (settings.isSetting(sessionID, Session.SETTING_START_DAY) && settings.isSetting(sessionID, Session.SETTING_END_DAY))
        {
            startTimeString = settings.getString(sessionID, Session.SETTING_START_DAY) + " " + startTimeString;
            endTimeString = settings.getString(sessionID, Session.SETTING_END_DAY) + " " + endTimeString;
            weeklySession = true;
            timeParser = new SimpleDateFormat("EEEE HH:mm:ss yyyyMMdd");
        } else {
            timeParser = new SimpleDateFormat("HH:mm:ss yyyyMMdd");
        }

        if (settings.isSetting(sessionID, Session.SETTING_TIMEZONE)) {
            String sessionTimeZoneID = settings.getString(sessionID, Session.SETTING_TIMEZONE);
            sessionTimeZone = TimeZone.getTimeZone(sessionTimeZoneID);
            if ("GMT".equals(sessionTimeZone.getID()) && !"GMT".equals(sessionTimeZoneID)) {
                throw new ConfigError("Unrecognized time zone '" + sessionTimeZoneID + "' for session " + sessionID);
            }
        } else {
            sessionTimeZone = TimeZone.getTimeZone("UTC");
        }
        timeParser.setTimeZone(sessionTimeZone);

        SimpleDateFormat ymd = new SimpleDateFormat("yyyyMMdd");
        String dateString = " " + ymd.format(new Date());
        try {
            Date parsedStartTime = timeParser.parse(startTimeString + dateString);
            startTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            startTime.setTime(parsedStartTime);
            startTime.set(1970, 0, 1);
            if (weeklySession) {
                startDay = startTime.get(Calendar.DAY_OF_WEEK);
            }
        } catch (ParseException e) {
            throw new ConfigError("Session " + sessionID + ": could not parse start time '" + startTimeString + "'.");
        }

        try {
            Date parsedEndTime = timeParser.parse(endTimeString + dateString);
            endTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            endTime.setTime(parsedEndTime);
            endTime.set(1970, 0, 1);
            if (weeklySession) {
                endDay = endTime.get(Calendar.DAY_OF_WEEK);
            }
        } catch (ParseException e) {
            throw new ConfigError("Session " + sessionID + ": could not parse end time '" + endTimeString + "'.");
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
        dateOnlyOut.set(timestampIn.get(Calendar.YEAR), timestampIn.get(Calendar.MONTH), timestampIn.get(Calendar.DAY_OF_MONTH));
        return dateOnlyOut;
    }

    private Calendar getTimeOnly(Calendar timestampIn, Calendar timeOnlyOut) {
        timeOnlyOut.set(1970, 0, 1);
        timeOnlyOut.set(Calendar.HOUR_OF_DAY, timestampIn.get(Calendar.HOUR_OF_DAY));
        timeOnlyOut.set(Calendar.MINUTE, timestampIn.get(Calendar.MINUTE));
        timeOnlyOut.set(Calendar.SECOND, timestampIn.get(Calendar.SECOND));
        return timeOnlyOut;
    }

    private boolean isDailySessionTime(Calendar timestamp) {
        Calendar timeOnly = getTimeOnly(timestamp, calendar1);
        return startTime.before(endTime) ? ((timeOnly.after(startTime) || timeOnly.equals(startTime)) && (timeOnly
                .before(endTime) || timeOnly.equals(endTime))) : ((timeOnly.after(startTime) || timeOnly
                .equals(startTime)) || (timeOnly.before(endTime) || timeOnly.equals(endTime)));
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
        } else if (startTime.after(endTime)) {
            return Math.abs(timestamp1.getTimeInMillis() - timestamp2.getTimeInMillis()) < ONE_DAY_IN_MILLIS;
        }

        return false;
    }

    public boolean isSameSession(Calendar time1, Calendar time2) {
        if (startDay < 0 && endDay < 0) {
            return isSameDailySession(time1, time2);
        }
        return isSameWeeklySession(time1, time2);
    }

    private boolean isSameWeeklySession(Calendar timestamp1, Calendar timestamp2) {
        if (!isWeeklySessionTime(timestamp1) || !isWeeklySessionTime(timestamp2)) {
            return false;
        }

        if (timestamp1.equals(timestamp2)) {
            return true;
        }

        int time1Range = timestamp1.get(Calendar.DAY_OF_WEEK) - startDay;
        int time2Range = timestamp2.get(Calendar.DAY_OF_WEEK) - startDay;

        if (time1Range == 0) {
            Calendar timeOnly = getTimeOnly(timestamp1, calendar1);
            if (timeOnly.before(startTime)) {
                time1Range = 7;
            }
        }

        if (time2Range == 0) {
            Calendar timeOnly = getTimeOnly(timestamp2, calendar2);
            if (timeOnly.before(startTime)) {
                time2Range = 7;
            }
        }

        timestamp1 = (Calendar) timestamp1.clone();
        timestamp1.add(Calendar.DATE, -1 * time1Range);
        timestamp2 = (Calendar) timestamp2.clone();
        timestamp2.add(Calendar.DATE, -1 * time2Range);

        return timestamp1.get(Calendar.YEAR) == timestamp2.get(Calendar.YEAR) && timestamp1.get(Calendar.DAY_OF_YEAR) == timestamp2.get(Calendar.DAY_OF_YEAR);
    }

    public boolean isSessionTime() {
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
}