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

import quickfix.UtcTimestampPrecision;
import org.quickfixj.SimpleCache;
import quickfix.FieldConvertError;
import quickfix.SystemTime;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Convert between a timestamp and a String. A timestamp includes both a date
 * and a time.
 */
public class UtcTimestampConverter extends AbstractDateTimeConverter {

    static String TYPE = "timestamp";
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
    private static final DateTimeFormatter FORMATTER_SECONDS = createDateTimeFormat("yyyyMMdd-HH:mm:ss");
    private static final DateTimeFormatter FORMATTER_MILLIS  = createDateTimeFormat("yyyyMMdd-HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER_MICROS  = createDateTimeFormat("yyyyMMdd-HH:mm:ss.SSSSSS");
    private static final DateTimeFormatter FORMATTER_NANOS   = createDateTimeFormat("yyyyMMdd-HH:mm:ss.SSSSSSSSS");

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

    /**
     * Convert a timestamp (represented as a LocalDateTime) to a String.
     *
     * @param d the date to convert
     * @param precision controls whether seconds, milliseconds, microseconds or
     * nanoseconds are included in the result
     * @return the formatted timestamp
     */
    public static String convert(LocalDateTime d, UtcTimestampPrecision precision) {
        switch (precision) {
            case SECONDS:
                return d.format(FORMATTER_SECONDS);
            case MILLIS:
                return d.format(FORMATTER_MILLIS);
            case MICROS:
                return d.format(FORMATTER_MICROS);
            case NANOS:
                return d.format(FORMATTER_NANOS);
            default:
                return d.format(FORMATTER_MILLIS);
        }
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimestampConverter converter = UTC_TIMESTAMP_CONVERTER.get();
        if (converter == null) {
            converter = new UtcTimestampConverter();
            UTC_TIMESTAMP_CONVERTER.set(converter);
        }
        return includeMillis ? converter.utcTimestampFormatMillis : converter.utcTimestampFormat;
    }

    /**
     * Convert a timestamp string into a Date.
     * Date has up to millisecond precision.
     *
     * @param value the timestamp String
     * @return the parsed timestamp
     * @exception FieldConvertError raised if timestamp is an incorrect format.
     */
    public static Date convert(String value) throws FieldConvertError {
        verifyFormat(value);
        long timeOffset = getTimeOffsetSeconds(value);
        if (value.length() >= LENGTH_INCL_MILLIS) { // format has already been verified
            // accept up to picosenconds but parse only up to milliseconds
            timeOffset += parseLong(value.substring(18, LENGTH_INCL_MILLIS));
        }
        return new Date(getMillisForDay(value) + timeOffset);
    }

    /**
     * Convert a timestamp string into a LocalDateTime object.
     * LocalDateTime has up to nanosecond precision.
     *
     * @param value the timestamp String
     * @return the parsed timestamp
     * @exception FieldConvertError raised if timestamp is an incorrect format.
     */
    public static LocalDateTime convertToLocalDateTime(String value) throws FieldConvertError {
        verifyFormat(value);
        int length = value.length();
        try {
            switch (length) {
                case LENGTH_INCL_SECONDS:
                    return LocalDateTime.parse(value, FORMATTER_SECONDS);
                case LENGTH_INCL_MILLIS:
                    return LocalDateTime.parse(value, FORMATTER_MILLIS);
                case LENGTH_INCL_MICROS:
                    return LocalDateTime.parse(value, FORMATTER_MICROS);
                case LENGTH_INCL_NANOS:
                case LENGTH_INCL_PICOS:
                    return LocalDateTime.parse(value.substring(0, LENGTH_INCL_NANOS), FORMATTER_NANOS);
                default:
                    throwFieldConvertError(value, TYPE);
            }
        } catch (DateTimeParseException e) {
            throwFieldConvertError(value, TYPE);
        }
        return null;
    } 

    private static Long getMillisForDay(String value) {
        // Performance optimization: the calendar for the start of the day is cached.
        return DATE_CACHE.computeIfAbsent(value.substring(0, 8));
    }

    private static long getTimeOffsetSeconds(String value) {
        long timeOffset = (parseLong(value.substring(9, 11)) * 3600000L)
                + (parseLong(value.substring(12, 14)) * 60000L)
                + (parseLong(value.substring(15, LENGTH_INCL_SECONDS)) * 1000L);
        return timeOffset;
    }

    private static void verifyFormat(String value) throws FieldConvertError {
        assertLength(value, TYPE, LENGTH_INCL_SECONDS, LENGTH_INCL_MILLIS, LENGTH_INCL_MICROS, LENGTH_INCL_NANOS, LENGTH_INCL_PICOS);
        assertDigitSequence(value, 0, 8, TYPE);
        assertSeparator(value, 8, '-', TYPE);
        assertDigitSequence(value, 9, 11, TYPE);
        assertSeparator(value, 11, ':', TYPE);
        assertDigitSequence(value, 12, 14, TYPE);
        assertSeparator(value, 14, ':', TYPE);
        assertDigitSequence(value, 15, LENGTH_INCL_SECONDS, TYPE);
        if (value.length() == LENGTH_INCL_MILLIS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', TYPE);
            assertDigitSequence(value, 18, LENGTH_INCL_MILLIS, TYPE);
        } else if (value.length() == LENGTH_INCL_MICROS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', TYPE);
            assertDigitSequence(value, 18, LENGTH_INCL_MICROS, TYPE);
        } else if (value.length() == LENGTH_INCL_NANOS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', TYPE);
            assertDigitSequence(value, 18, LENGTH_INCL_NANOS, TYPE);
        } else if (value.length() == LENGTH_INCL_PICOS) {
            assertSeparator(value, LENGTH_INCL_SECONDS, '.', TYPE);
            assertDigitSequence(value, 18, LENGTH_INCL_PICOS, TYPE);
        } else if (value.length() != LENGTH_INCL_SECONDS) {
            throwFieldConvertError(value, TYPE);
        }
    }

     /**
     * @param localDateTime
     * @return a java.util.Date filled from LocalDateTime (truncated to milliseconds).
     */
    public static Date getDate(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return Date.from(localDateTime.toInstant(ZoneOffset.UTC));
        }
        return null;
    }

}
