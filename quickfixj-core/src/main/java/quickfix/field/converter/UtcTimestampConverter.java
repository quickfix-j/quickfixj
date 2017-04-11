/** *****************************************************************************
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
 ***************************************************************************** */
package quickfix.field.converter;

import org.quickfixj.SimpleCache;
import quickfix.FieldConvertError;
import quickfix.SystemTime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Convert between a timestamp and a String. A timestamp includes both a date
 * and a time.
 */
public class UtcTimestampConverter extends AbstractDateTimeConverter {

    static final int LENGTH_INCL_SECONDS = 17;
    static final int LENGTH_INCL_MILLIS = 21;
    static final int LENGTH_INCL_MICROS = 24;
    static final int LENGTH_INCL_NANOS = 27;
    static final int LENGTH_INCL_PICOS = 30;

    private static final ThreadLocal<UtcTimestampConverter> UTC_TIMESTAMP_CONVERTER = new ThreadLocal<>();
    private static final SimpleCache<String, Long> DATE_CACHE = new SimpleCache<>(dateString -> {
        final Calendar c = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
        c.setTimeZone(SystemTime.UTC_TIMEZONE);
        final int year = Integer.parseInt(dateString.substring(0, 4));
        final int month = Integer.parseInt(dateString.substring(4, 6));
        final int day = Integer.parseInt(dateString.substring(6, 8));
        c.set(year, month - 1, day);
        return c.getTimeInMillis();
    });

    private final DateFormat utcTimestampFormat = createDateFormat("yyyyMMdd-HH:mm:ss");
    private final DateFormat utcTimestampFormatMillis = createDateFormat("yyyyMMdd-HH:mm:ss.SSS");

    /**
     * Convert a timestamp (represented as a Date) to a String.
     *
     * @param d the date to convert
     * @param includeMilliseconds controls whether milliseconds are included in
     * the result
     * @return the formatted timestamp
     */
    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimestampConverter converter = UTC_TIMESTAMP_CONVERTER.get();
        if (converter == null) {
            converter = new UtcTimestampConverter();
            UTC_TIMESTAMP_CONVERTER.set(converter);
        }
        return includeMillis ? converter.utcTimestampFormatMillis : converter.utcTimestampFormat;
    }

    //
    // Performance optimization: the calendar for the start of the day is cached.
    // The time is converted to millis and then added to the millis specified by
    // the base calendar.
    //
    /**
     * Convert a timestamp string into a Date.
     *
     * @param value the timestamp String
     * @return the parsed timestamp
     * @exception FieldConvertError raised if timestamp is an incorrect format.
     */
    public static Date convert(String value) throws FieldConvertError {
        verifyFormat(value);
        long timeOffset = (parseLong(value.substring(9, 11)) * 3600000L)
                + (parseLong(value.substring(12, 14)) * 60000L)
                + (parseLong(value.substring(15, LENGTH_INCL_SECONDS)) * 1000L);
        if (value.length() == LENGTH_INCL_MILLIS || value.length() == LENGTH_INCL_MICROS || value.length() == LENGTH_INCL_NANOS || value.length() == LENGTH_INCL_PICOS) {
            // accept up to picosenconds but parse only up to milliseconds
            timeOffset += parseLong(value.substring(18, LENGTH_INCL_MILLIS));
        }
        return new Date(getMillisForDay(value) + timeOffset);
    }

    private static Long getMillisForDay(String value) {
        return DATE_CACHE.computeIfAbsent(value.substring(0, 8));
    }

    private static void verifyFormat(String value) throws FieldConvertError {
        String type = "timestamp";
        if (value.length() != LENGTH_INCL_SECONDS && value.length() != LENGTH_INCL_MILLIS && value.length() != LENGTH_INCL_MICROS && value.length() != LENGTH_INCL_NANOS && value.length() != LENGTH_INCL_PICOS) {
            throwFieldConvertError(value, type);
        }
        assertDigitSequence(value, 0, 8, type);
        assertSeparator(value, 8, '-', type);
        assertDigitSequence(value, 9, 11, type);
        assertSeparator(value, 11, ':', type);
        assertDigitSequence(value, 12, 14, type);
        assertSeparator(value, 14, ':', type);
        assertDigitSequence(value, 15, LENGTH_INCL_SECONDS, type);
        if (value.length() == LENGTH_INCL_MILLIS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', type);
            assertDigitSequence(value, 18, LENGTH_INCL_MILLIS, type);
        } else if (value.length() == LENGTH_INCL_MICROS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', type);
            assertDigitSequence(value, 18, LENGTH_INCL_MICROS, type);
        } else if (value.length() == LENGTH_INCL_NANOS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', type);
            assertDigitSequence(value, 18, LENGTH_INCL_NANOS, type);
        } else if (value.length() == LENGTH_INCL_PICOS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', type);
            assertDigitSequence(value, 18, LENGTH_INCL_PICOS, type);
        } else if (value.length() != LENGTH_INCL_SECONDS) {
            throwFieldConvertError(value, type);
        }
    }
}
