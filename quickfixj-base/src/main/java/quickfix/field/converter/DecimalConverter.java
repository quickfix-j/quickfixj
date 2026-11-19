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

import static quickfix.field.converter.IntConverter.window;

import java.math.BigDecimal;

import quickfix.FieldConvertError;

public class DecimalConverter {

    /**
     * Converts a double to a string with no padding.
     *
     * @param d the BigDecimal to convert
     * @return the formatted String representing the incoming decimal.
     * @see #convert(BigDecimal, int)
     */
    public static String convert(BigDecimal d) {
        return d.toPlainString();
    }

    /**
     * Converts a decimal to a string with padding.
     *
     * @param d the decimal to convert
     * @param padding the number of zeros to add to end of the formatted decimal
     * @return the formatted String representing the decimal.
     */
    public static String convert(BigDecimal d, int padding) {
        return DoubleConverter.getDecimalFormat(padding).format(d);
    }

    /**
     * Convert a String value to a decimal.
     *
     * @param value the String value to convert
     * @return the parsed BigDecimal
     * @throws FieldConvertError if the String is not a valid decimal pattern.
     */
    public static BigDecimal convert(String value) throws FieldConvertError {
        return convert(value, 0, value == null ? 0 : value.length());
    }
    
    public static BigDecimal convert(String value, int offset, int length) throws FieldConvertError {
        if (value == null) {
            throw new NullPointerException();
        }
        if (offset < 0 || length < 0 || value.length() - offset < length) {
            throw new FieldConvertError("invalid double value: offset=" + offset
                    + ", length=" + length + ", value.length=" + value.length());
        }
        try {
            return parseDecimal(value, offset, length);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid double value: " + window(value, offset, length));
        }
    }
    
    private static BigDecimal parseDecimal(String v, int off, int len) {
        final int end = off + len;
        int i = off;
        boolean negative = false;
        if (i < end) {
            final char c = v.charAt(i);
            if (c == '-') {
                negative = true;
                i++;
            } else if (c == '+') {
                i++;
            }
        }
        long m = 0;
        boolean overflow = false, digit = false, dot = false;
        int frac = 0;
        for (; i < end; i++) {
            final char c = v.charAt(i);
            if (c == '.') {
                if (dot) {
                    return new BigDecimal(window(v, off, len));
                }
                dot = true;
            } else if (c >= '0' && c <= '9') {
                digit = true;
                if (dot) {
                    frac++;
                }
                if (!overflow) {
                    final long next = m * 10 + (c - '0');
                    if (next < 0 || m > (Long.MAX_VALUE - 9) / 10) {
                        overflow = true;
                    } else {
                        m = next;
                    }
                }
            } else {
                return new BigDecimal(window(v, off, len));
            }
        }
        if (!digit || overflow) {
            return new BigDecimal(window(v, off, len));
        }
        return BigDecimal.valueOf(negative ? -m : m, frac);
    }
}
