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
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import quickfix.FieldConvertError;

abstract class AbstractDateTimeConverter {
    protected static void assertLength(String value, int i, String type) throws FieldConvertError {
        if (value.length() != i) {
            throwFieldConvertError(value, type);
        }
    }

    protected static void assertDigitSequence(String value, int i, int j, String type)
            throws FieldConvertError {
        for (int offset = i; offset < j; offset++) {
            if (!Character.isDigit(value.charAt(offset))) {
                throwFieldConvertError(value, type);
            }
        }
    }

    protected static void assertSeparator(String value, int offset, char ch, String type)
            throws FieldConvertError {
        if (value.charAt(offset) != ch) {
            throwFieldConvertError(value, type);
        }
    }

    protected static void throwFieldConvertError(String value, String type)
            throws FieldConvertError {
        throw new FieldConvertError("invalid UTC " + type + " value: " + value);
    }

    protected static long parseLong(String s) {
        return parseLong(s, 0, s.length());
    }

    protected static long parseLong(String s, int begin, int end) {
        long n = 0;
        for (int i = begin; i < end; i++) {
            n = (n * 10) + (s.charAt(i) - '0');
        }
        return n;
    }

    protected static DateFormat createDateFormat(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        sdf.setDateFormatSymbols(new DateFormatSymbols(Locale.US));
        return sdf;
    }

    static final class DontCareFieldPosition extends FieldPosition {
        // The singleton of DontCareFieldPosition.
        static final FieldPosition INSTANCE = new DontCareFieldPosition();

        private DontCareFieldPosition() {
            super(0);
        }
    }

}
