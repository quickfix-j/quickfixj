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

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import quickfix.FieldConvertError;

/**
 * Convert between a date and a String
 */
public class UtcDateOnlyConverter extends AbstractDateTimeConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static ThreadLocal<UtcDateOnlyConverter> utcDateConverter = new ThreadLocal<UtcDateOnlyConverter>();
    private DateFormat dateFormat = createDateFormat("yyyyMMdd");

    /**
     * Convert a date to a String ("YYYYMMDD")
     * @param d the date to convert
     * @return the formatted date
     */
    public static String convert(Date d) {
        return getFormatter().format(d);
    }

    private static DateFormat getFormatter() {
        UtcDateOnlyConverter converter = utcDateConverter.get();
        if (converter == null) {
            converter = new UtcDateOnlyConverter();
            utcDateConverter.set(converter);
        }
        return converter.dateFormat;
    }

    /**
     * Convert between a String and a date
     * @param value the String to convert
     * @return the parsed Date
     * @throws FieldConvertError raised for an invalid date string.
     */
    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        String type = "date";
        assertLength(value, 8, type);
        assertDigitSequence(value, 0, 8, type);
        try {
            d = getFormatter().parse(value);
        } catch (ParseException e) {
            throwFieldConvertError(value, type);
        }
        return d;
    }

}