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
    private Calendar startTime;
    private Calendar endTime;
    private int startDay;
    private int endDay;

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
    }

    private boolean isSessionTime(Calendar start, Calendar end, Calendar time) {
        Calendar timeOnly = getTimeOnly(time);
        return start.before(end) ? ((timeOnly.after(start) || timeOnly.equals(start)) && (timeOnly
                .before(end) || timeOnly.equals(end))) : ((timeOnly.after(start) || timeOnly
                .equals(start)) || (timeOnly.before(end) || timeOnly.equals(end)));

    }

    private Calendar getTimeOnly(Calendar time) {
        Calendar timeOnly = new GregorianCalendar(1970, 0, 1, time.get(Calendar.HOUR_OF_DAY), time
                .get(Calendar.MINUTE), time.get(Calendar.SECOND));
        timeOnly.setTimeZone(TimeZone.getTimeZone("UTC"));
        return timeOnly;
    }

    private boolean isSameSession(Calendar start, Calendar end, Calendar time1, Calendar time2) {
        if (!isSessionTime(start, end, time1) || !isSessionTime(start, end, time2)) {
            return false;
        }

        if (time1.equals(time2)) {
            return true;
        }

        Calendar time1Date = getDateOnly(time1);
        Calendar time2Date = getDateOnly(time2);

        if (start.before(end) || start.equals(end)) {
            return time1Date.equals(time2Date);
        } else if (start.after(end)) {
            return Math.abs(time1Date.getTimeInMillis() - time2Date.getTimeInMillis()) < 86400000L;
        }
        return false;
    }

    private boolean isSameSession(Calendar startTime, Calendar endTime, int startDay, int endDay,
            Calendar time1, Calendar time2) {
        if (!isSessionTime(startTime, endTime, startDay, endDay, time1) || 
                !isSessionTime(startTime, endTime, startDay, endDay, time2)) {
            return false;
        }

        if (time1.equals(time2)) {
            return true;
        }

        int time1Range = time1.get(Calendar.DAY_OF_WEEK) - startDay;
        int time2Range = time2.get(Calendar.DAY_OF_WEEK) - startDay;

        if (time1Range == 0) {
            Calendar timeOnly = getTimeOnly(time1);
            if (timeOnly.before(startTime)) {
                time1Range = 7;
            }
        }

        if (time2Range == 0) {
            Calendar timeOnly = getTimeOnly(time2);
            if (timeOnly.before(startTime)) {
                time2Range = 7;
            }
        }

        time1 = (Calendar)time1.clone(); time1.add(Calendar.DATE, -1 * time1Range);
        time2 = (Calendar)time2.clone(); time2.add(Calendar.DATE, -1 * time2Range);

        return time1.get(Calendar.YEAR) == time2.get(Calendar.YEAR)
                && time1.get(Calendar.DAY_OF_YEAR) == time2.get(Calendar.DAY_OF_YEAR);
    }

    private Calendar getDateOnly(Calendar time) {
        Calendar date = new GregorianCalendar(time.get(Calendar.YEAR), time.get(Calendar.MONTH),
                time.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        date.setTimeZone(TimeZone.getTimeZone("UTC"));
        return date;
    }

    public boolean isSessionTime() {
        Calendar now = SystemTime.getUtc();
        if (startDay < 0 && endDay < 0) {
            return isSessionTime(startTime, endTime, now);
        }
        return isSessionTime(startTime, endTime, startDay, endDay, now);
    }

    private boolean isSessionTime(Calendar startTime, Calendar endTime, int startDay, int endDay,
            Calendar time) {
        int currentDay = time.get(Calendar.DAY_OF_WEEK);
        Calendar currentTime = getTimeOnly(time);

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
            return isSameSession(startTime, endTime, time1, time2);
        }
        return isSameSession(startTime, endTime, startDay, endDay, time1, time2);
    }
}