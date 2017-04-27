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

package quickfix.field.converter;

import quickfix.UtcTimestampPrecision;
import quickfix.FieldConvertError;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * Convert between a time and a String.
 */
public class UtcTimeOnlyConverter extends AbstractDateTimeConverter {

    static String TYPE = "time";
    static final int LENGTH_INCL_SECONDS    = 8;
    static final int LENGTH_INCL_MILLIS     = 12;
    static final int LENGTH_INCL_MICROS     = 15;
    static final int LENGTH_INCL_NANOS      = 18;
    static final int LENGTH_INCL_PICOS      = 21;

    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static final ThreadLocal<UtcTimeOnlyConverter> UTC_TIME_CONVERTER = new ThreadLocal<>();
    private final DateFormat utcTimeFormat = createDateFormat("HH:mm:ss");
    private final DateFormat utcTimeFormatMillis = createDateFormat("HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER_SECONDS = createDateTimeFormat("HH:mm:ss");
    private static final DateTimeFormatter FORMATTER_MILLIS  = createDateTimeFormat("HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER_MICROS  = createDateTimeFormat("HH:mm:ss.SSSSSS");
    private static final DateTimeFormatter FORMATTER_NANOS   = createDateTimeFormat("HH:mm:ss.SSSSSSSSS");

    /**
     * Convert a time (represented as a Date) to a String (HH:MM:SS or HH:MM:SS.SSS)
     *
     * @param d the date with the time to convert
     * @param includeMilliseconds controls whether milliseconds are included in the result
     * @return a String representing the time.
     */
    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    /**
     * Convert a time (represented as LocalTime) to a String
     *
     * @param d the LocalTime with the time to convert
     * @param precision controls whether seconds, milliseconds, microseconds or
     * nanoseconds are included in the result
     * @return a String representing the time.
     */
    public static String convert(LocalTime d, UtcTimestampPrecision precision) {
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
        UtcTimeOnlyConverter converter = UTC_TIME_CONVERTER.get();
        if (converter == null) {
            converter = new UtcTimeOnlyConverter();
            UTC_TIME_CONVERTER.set(converter);
        }
        return includeMillis ? converter.utcTimeFormatMillis : converter.utcTimeFormat;
    }

    /**
     * Convert between a String and a time
     *
     * @param value the string to parse
     * @return a date object representing the time
     * @throws FieldConvertError raised for invalid time string
     */
    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        assertLength(value, TYPE, LENGTH_INCL_SECONDS, LENGTH_INCL_MILLIS, LENGTH_INCL_MICROS, LENGTH_INCL_NANOS, LENGTH_INCL_PICOS);
        try {
            final boolean includeMillis = (value.length() >= LENGTH_INCL_MILLIS);
            d = getFormatter(includeMillis).parse(includeMillis ? value.substring(0, LENGTH_INCL_MILLIS) : value);
        } catch (ParseException e) {
            throwFieldConvertError(value, TYPE);
        }
        return d;
    }

    public static LocalTime convertToLocalTime(String value) throws FieldConvertError {
        assertLength(value, TYPE, LENGTH_INCL_SECONDS, LENGTH_INCL_MILLIS, LENGTH_INCL_MICROS, LENGTH_INCL_NANOS, LENGTH_INCL_PICOS);
        try {
            int length = value.length();
            switch (length) {
                case LENGTH_INCL_SECONDS:
                    return LocalTime.parse(value, FORMATTER_SECONDS);
                case LENGTH_INCL_MILLIS:
                    return LocalTime.parse(value, FORMATTER_MILLIS);
                case LENGTH_INCL_MICROS:
                    return LocalTime.parse(value, FORMATTER_MICROS);
                case LENGTH_INCL_NANOS:
                    return LocalTime.parse(value, FORMATTER_NANOS);
                case LENGTH_INCL_PICOS:
                    return LocalTime.parse(value.substring(0, LENGTH_INCL_NANOS), FORMATTER_NANOS);
                default:
                    throwFieldConvertError(value, TYPE);        
            }
        } catch (DateTimeParseException e) {
            throwFieldConvertError(value, TYPE);
        }
        return null;
    }

    /**
     * @param localTime
     * @return a java.util.Date with time part filled from LocalTime (truncated to milliseconds).
     */
    public static Date getDate(LocalTime localTime) {
        if (localTime != null) {
            return Date.from(localTime.atDate(LocalDate.ofEpochDay(0)).atZone(ZoneOffset.UTC).toInstant());
        }
        return null;
    }
    
}
