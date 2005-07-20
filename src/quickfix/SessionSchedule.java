/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Corresponds to SessionTime in C++ code
 */
class SessionSchedule {
    private static final long ONE_DAY_IN_MILLIS = 86400000L;
    private Calendar startTime;
    private Calendar endTime;
    private int startDay;
    private int endDay;
    
    //
    // These are cached calendars. Creating calendars to do session time calculations
    // on every message was too expensive. This is a performance optimization.
    // It assumes that there is a separate SessionTime object for each session and
    // that the session is accessing it in a single thread.
    //
    private Calendar calendar1 = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
    private Calendar calendar2 = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
    
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
            return Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis()) < ONE_DAY_IN_MILLIS;
        }
        
        return false;
    }

    private boolean isSameWeeklySession(Calendar timestamp1, Calendar timestamp2) {
        if (!isWeeklySessionTime(timestamp1) || 
                !isWeeklySessionTime(timestamp2)) {
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

        timestamp1 = (Calendar)timestamp1.clone(); timestamp1.add(Calendar.DATE, -1 * time1Range);
        timestamp2 = (Calendar)timestamp2.clone(); timestamp2.add(Calendar.DATE, -1 * time2Range);

        return timestamp1.get(Calendar.YEAR) == timestamp2.get(Calendar.YEAR)
                && timestamp1.get(Calendar.DAY_OF_YEAR) == timestamp2.get(Calendar.DAY_OF_YEAR);
    }

    public boolean isSessionTime() {
        Calendar now = SystemTime.getUtcCalendar();
        if (startDay < 0 && endDay < 0) {
            return isDailySessionTime(now);
        }
        return isWeeklySessionTime(now);
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

    public boolean isSameSession(Calendar time1, Calendar time2) {
        if (startDay < 0 && endDay < 0) {
            return isSameDailySession(time1, time2);
        }
        return isSameWeeklySession(time1, time2);
    }

    private Calendar getTimeOnly(Calendar timestampIn, Calendar timeOnlyOut) {
        timeOnlyOut.set(1970, 0, 1);
        timeOnlyOut.set(Calendar.HOUR_OF_DAY, timestampIn.get(Calendar.HOUR_OF_DAY));
        timeOnlyOut.set(Calendar.MINUTE, timestampIn.get(Calendar.MINUTE));
        timeOnlyOut.set(Calendar.SECOND, timestampIn.get(Calendar.SECOND));
        return timeOnlyOut;
    }

    private Calendar getDateOnly(Calendar timestampIn, Calendar dateOnlyOut) {
        dateOnlyOut.set(Calendar.HOUR_OF_DAY, 0);
        dateOnlyOut.set(Calendar.MINUTE, 0);
        dateOnlyOut.set(Calendar.SECOND, 0);
        dateOnlyOut.set(timestampIn.get(Calendar.YEAR), timestampIn.get(Calendar.MONTH), timestampIn.get(Calendar.DAY_OF_MONTH));
        return dateOnlyOut;
    }
}