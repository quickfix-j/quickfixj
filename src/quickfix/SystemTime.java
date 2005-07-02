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
import java.util.TimeZone;

public class SystemTime {
    public static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone("UTC");

    private static SystemTimeSource systemTimeSource = new SystemTimeSource() {
        public long getTime() {
            return System.currentTimeMillis();
        }
    };

    public static long currentTimeMillis() {
        return systemTimeSource.getTime();
    }

    public static Date getDate() {
        return new Date(currentTimeMillis());
    }
    
    public static void setTimeSource(SystemTimeSource systemTimeSource) {
        SystemTime.systemTimeSource = systemTimeSource;
    }

    public static Calendar getUtcCalendar() {
        Calendar c = Calendar.getInstance(SystemTime.UTC_TIMEZONE);
        c.setTimeInMillis(currentTimeMillis());
        return c;
    }
    
    public static Calendar getUtcCalendar(Date date) {
        Calendar c = getUtcCalendar();
        c.setTime(date);
        return c;
    }

}
