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

    private static final String LONG_MAX_STRING = String.valueOf(Long.MAX_VALUE);

    /**
     * Convert an unsigned long to a String
     *
     * @param l the long to convert
     * @return the String representing the long
     * @see NumbersCache#get(long)
     */
    public static String convert(long l) {
        return NumbersCache.get(l);
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

            // Heuristic: since we have no range check in our parseLong() we only parse
            // values which have at least one digit less than Long.MAX_VALUE and
            // leave longer Strings to Long.parseLong().
            // NB: we must not simply reject strings longer than MAX_VALUE since
            // they could possibly include an arbitrary number of leading zeros.
            if (value.length() < LONG_MAX_STRING.length()) {
                return parseLong(value);
            } else {
                try {
                    return Long.parseLong(value);
                } catch (NumberFormatException e) {
                    throw new FieldConvertError("invalid unsigned long value: " + value + ": " + e);
                }
            }
        } else {
            throw new FieldConvertError("invalid unsigned long value: empty string");
        }
    }

    private static long parseLong(String value) throws FieldConvertError {
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

}
