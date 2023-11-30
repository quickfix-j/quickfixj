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

import quickfix.FieldConvertError;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * Convert between a date and a String
 */
public class UtcDateOnlyConverter extends AbstractDateTimeConverter {

    static final String TYPE = "date";
    static final int DATE_LENGTH = 8;
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static final ThreadLocal<UtcDateOnlyConverter> UTC_DATE_CONVERTER = new ThreadLocal<>();
    private final DateFormat dateFormat = createDateFormat("yyyyMMdd");
    private static final DateTimeFormatter FORMATTER_DATE = createDateTimeFormat("yyyyMMdd");

    /**
     * Convert a date to a String ("YYYYMMDD")
     *
     * @param d the date to convert
     * @return the formatted date
     */
    public static String convert(Date d) {
        return getFormatter().format(d);
    }

    public static String convert(LocalDate d) {
        return d.format(FORMATTER_DATE);
    }

    private static DateFormat getFormatter() {
        UtcDateOnlyConverter converter = UTC_DATE_CONVERTER.get();
        if (converter == null) {
            converter = new UtcDateOnlyConverter();
            UTC_DATE_CONVERTER.set(converter);
        }
        return converter.dateFormat;
    }

    /**
     * Convert between a String and a date
     *
     * @param value the String to convert
     * @return the parsed Date
     * @throws FieldConvertError raised for an invalid date string.
     */
    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        checkString(value);
        try {
            d = getFormatter().parse(value);
        } catch (ParseException e) {
            throwFieldConvertError(value, TYPE);
        }
        return d;
    }

    public static LocalDate convertToLocalDate(String value) throws FieldConvertError {
        checkString(value);
        try {
            return LocalDate.parse(value.substring(0, DATE_LENGTH), FORMATTER_DATE);
        } catch (DateTimeParseException e) {
            throwFieldConvertError(value, TYPE);
        }
        return null;
    }

    private static void checkString(String value) throws FieldConvertError {
        assertLength(value, DATE_LENGTH, TYPE);
        assertDigitSequence(value, 0, DATE_LENGTH, TYPE);
    }
    
    /**
     * @param localDate
     * @return a java.util.Date with date part filled from LocalDate.
     */
    public static Date getDate(LocalDate localDate) {
        if (localDate != null) {
            return Date.from(localDate.atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        }
        return null;
    }

}
