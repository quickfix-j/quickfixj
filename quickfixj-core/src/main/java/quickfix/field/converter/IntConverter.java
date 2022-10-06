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

/**
 * Convert between an integer and a String
 */
public final class IntConverter {

    /**
     * Convert an integer to a String
     *
     * @param i the integer to convert
     * @return the String representing the integer
     * @see java.lang.Long#toString(long)
     */
    public static String convert(int i) {
        return Long.toString(i);
    }

    /**
     * Convert a String to an integer.
     *
     * @param value the String to convert
     * @return the converted integer
     * @throws FieldConvertError raised if the String does not represent a valid
     * integer
     * @see java.lang.Integer#parseInt(String)
     */
    public static int convert(String value) throws FieldConvertError {
        try {
            for (int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i)) && !(i == 0 && value.charAt(i) == '-')) {
                    throw new FieldConvertError("invalid integral value: " + value);
                }
            }
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid integral value: " + value + ": " + e);
        }
    }

    /**
     * Please note that input needs to be validated first, otherwise unexpected
     * results may occur. Please also note that this method has no range or overflow
     * check, so please only use it when you are sure that no overflow might occur
     * (e.g. for parsing seconds or smaller integers).
     *
     * @param value the String to convert
     * @param off offset position from which String should be parsed
     * @param len length to parse
     * @return the converted int
     */
    static int parseInt(String value, int off, int len) {
        int num = 0;
        boolean negative = false;
        for (int index = 0; index < len; index++) {
            final char charAt = value.charAt(off + index);
            if (index == 0 && charAt == '-') {
                negative = true;
                continue;
            }
            num = (num * 10) + charAt - '0';
        }
        return negative ? -num : num;
    }

    /**
     * Please note that input needs to be validated first, otherwise unexpected
     * results may occur. Please also note that this method has no range or overflow
     * check, so please only use it when you are sure that no overflow might occur
     * (e.g. for parsing seconds or smaller integers).
     * 
     * @param value the String to convert
     * @return the converted long
     */
    static long parseLong(String value) {
        long num = 0;
        boolean negative = false;
        for (int index = 0; index < value.length(); index++) {
            final char charAt = value.charAt(index);
            if (index == 0 && charAt == '-') {
                negative = true;
                continue;
            }
            num = (num * 10) + (value.charAt(index) - '0');
        }
        return negative ? -num : num;
    }
}
