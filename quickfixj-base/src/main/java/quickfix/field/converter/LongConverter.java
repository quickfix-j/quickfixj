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
import quickfix.NumbersCache;

/**
 * Convert between an unsigned long and a String
 */
public final class LongConverter {

    private static final int FAST_PARSE_MAX_LENGTH = 18;
    private static final long UNSIGNED_MULTIPLY_THRESHOLD = Long.divideUnsigned(-1L, 10L);
    private static final int UNSIGNED_LAST_DIGIT_THRESHOLD = (int) Long.remainderUnsigned(-1L, 10L);

    /**
     * Convert an unsigned long to a String
     *
     * @param l the long to convert
     * @return the String representing the long
     * @see NumbersCache#get(long)
     */
    public static String convert(long l) {
        return l >= 0 ? NumbersCache.get(l) : Long.toUnsignedString(l);
    }

    /**
     * Convert a String to an unsigned long.
     *
     * @param value the String to convert
     * @return the converted long
     * @throws FieldConvertError raised if the String does not represent a valid
     * unsigned long (i.e. one or more decimal digits, no sign character).
     */
    public static long convert(String value) throws FieldConvertError {

        if (!value.isEmpty()) {
            final char firstChar = value.charAt(0);
            if (!IntConverter.isDigit(firstChar)) {
                throw new FieldConvertError("invalid unsigned long value: " + value);
            }

            // Fast path for values that cannot overflow signed long during parse.
            if (value.length() <= FAST_PARSE_MAX_LENGTH) {
                return parseLongFast(value);
            } else {
                return parseLongChecked(value);
            }
        } else {
            throw new FieldConvertError("invalid unsigned long value: empty string");
        }
    }

    private static long parseLongFast(String value) throws FieldConvertError {
        long num = 0;
        for (int i = 0; i < value.length(); i++) {
            final char ch = value.charAt(i);
            if (IntConverter.isDigit(ch)) {
                num = (num * 10) + (ch - '0');
            } else {
                throw new FieldConvertError("invalid unsigned long value: " + value);
            }
        }
        return num;
    }

    private static long parseLongChecked(String value) throws FieldConvertError {
        long num = 0;
        for (int i = 0; i < value.length(); i++) {
            final char ch = value.charAt(i);
            if (!IntConverter.isDigit(ch)) {
                throw new FieldConvertError("invalid unsigned long value: " + value);
            }
            final int digit = ch - '0';
            if (Long.compareUnsigned(num, UNSIGNED_MULTIPLY_THRESHOLD) > 0
                    || (num == UNSIGNED_MULTIPLY_THRESHOLD && digit > UNSIGNED_LAST_DIGIT_THRESHOLD)) {
                throw new FieldConvertError("invalid unsigned long value: " + value);
            }
            num = (num * 10) + digit;
        }
        return num;
    }

}
