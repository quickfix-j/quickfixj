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
 * Convert between an integer and a String
 */
public final class IntConverter {

    private static final String INT_MAX_STRING = String.valueOf(Integer.MAX_VALUE);
    
    /**
     * Convert an integer to a String
     *
     * @param i the integer to convert
     * @return the String representing the integer
     * @see NumbersCache#get(int) 
     */
    public static String convert(int i) {
        return NumbersCache.get(i);
    }

    /**
     * Convert a String to an integer.
     *
     * @param value the String to convert
     * @return the converted integer
     * @throws FieldConvertError raised if the String does not represent a valid
     * FIX integer, i.e. optional negative sign and rest are digits.
     * @see java.lang.Integer#parseInt(String)
     */
    public static int convert(String value) throws FieldConvertError {
        return convert(value, 0, value.length());
    }
    
    /**
     * Convert a range of a String to an integer without allocating.
     *
     * Semantics are identical to convert(value.substring(offset, offset + length)),
     * including error messages and edge cases.
     *
     * @param value  the String containing the number
     * @param offset the start offset (inclusive)
     * @param length the number of characters to convert
     * @return the converted int
     * @throws FieldConvertError if the range does not represent a valid FIX integer
     */
    public static int convert(String value, int offset, int length) throws FieldConvertError {
        if (offset < 0 || length < 0 || value.length() - offset < length) {
            throw new FieldConvertError("invalid integral value: offset=" + offset
                    + ", length=" + length + ", value.length=" + value.length());
        }
        if (length == 0) {
            throw new FieldConvertError("invalid integral value: empty string");
        }
        
        final char firstChar = value.charAt(offset);
        final boolean isNegative = (firstChar == '-');
        if (!isDigit(firstChar) && !isNegative) {
            throw new FieldConvertError("invalid integral value: " + window(value, offset, length));
        }
        final int minLength = (isNegative ? 2 : 1);
        if (length < minLength) {
            throw new FieldConvertError("invalid integral value: " + window(value, offset, length));
        }
        
        // Heuristic: since we have no range check in our parseInt() we only parse
        // values which have at least one digit less than Integer.MAX_VALUE and
        // leave longer Strings to Integer.parseInt().
        // NB: we must not simply reject strings longer than MAX_VALUE since
        // they could possibly include an arbitrary number of leading zeros.
        final int maxLength = (isNegative ? INT_MAX_STRING.length() : INT_MAX_STRING.length() - 1);
        if (length > maxLength) {
            final String s = window(value, offset, length);
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                throw new FieldConvertError("invalid integral value: " + s + ": " + e);
            }
        }
        
        for (int i = isNegative ? 1 : 0; i < length; i++) {
            if (!isDigit(value.charAt(offset + i))) {
                throw new FieldConvertError("invalid integral value: " + window(value, offset, length));
            }
        }
        return parseInt(value, offset, length);
    }
    
    /** The window as a String; avoids copying when the range is the whole value. */
    private static String window(String value, int offset, int length) {
        return (offset == 0 && length == value.length()) ? value : value.substring(offset, offset + length);
    }

    /**
     * Please note that input needs to be validated first, otherwise unexpected
     * results may occur. Please also note that this method has no range or
     * overflow check, so please only use it when you are sure that no overflow
     * might occur (e.g. for parsing seconds or smaller integers).
     *
     * This method does however check if the contained characters are digits.
     *
     * @param value the String to convert
     * @param isNegative if passed String is negative, first character will
     * be skipped since it is assumed that it contains the negative sign
     * @return the converted int
     */
    private static int parseInt(String value, boolean isNegative) throws FieldConvertError {
        int num = 0;
        int firstIndex = (isNegative ? 1 : 0);
        for (int i = firstIndex; i < value.length(); i++) {
            if (isDigit(value.charAt(i))) {
                num = (num * 10) + (value.charAt(i) - '0');
            } else {
                throw new FieldConvertError("invalid integral value: " + value);
            }
        }
        return isNegative ? -num : num;
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
    
    /**
     * Check if a character is a digit, i.e. in the range between 0 and 9.
     *
     * @param character character to check
     * @return true if character is a digit between 0 and 9
     */
    static boolean isDigit(char character) {
        return (character >= '0' && character <= '9');
    }

}
