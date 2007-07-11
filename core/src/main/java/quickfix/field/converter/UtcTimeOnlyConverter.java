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
 * Convert between a time and a String.
 */
public class UtcTimeOnlyConverter extends AbstractDateTimeConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static ThreadLocal<UtcTimeOnlyConverter> utcTimeConverter = new ThreadLocal<UtcTimeOnlyConverter>();
    private DateFormat utcTimeFormat = createDateFormat("HH:mm:ss");
    private DateFormat utcTimeFormatMillis = createDateFormat("HH:mm:ss.SSS");

    /**
     * Convert a time (represented as a Date) to a String (HH:MM:SS or HH:MM:SS.SSS)
     * @param d the date with the time to convert
     * @param includeMilliseconds controls whether milliseconds are included in the result
     * @return a String representing the time.
     */
    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimeOnlyConverter converter = utcTimeConverter.get();
        if (converter == null) {
            converter = new UtcTimeOnlyConverter();
            utcTimeConverter.set(converter);
        }
        return includeMillis ? converter.utcTimeFormatMillis : converter.utcTimeFormat;
    }

    /**
     * Convert between a String and a time
     * @param value the string to parse
     * @return a date object representing the time
     * @throws FieldConvertError raised for invalid time string
     */
    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        try {
            d = getFormatter(value.length() == 12).parse(value);
        } catch (ParseException e) {
            throwFieldConvertError(value, "time");
        }
        return d;
    }

}