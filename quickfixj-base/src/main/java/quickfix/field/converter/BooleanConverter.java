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

import quickfix.FieldConvertError;

/**
 * Converts between a boolean and a string.
 */
public class BooleanConverter {
    private static final String NO = "N";
    private static final String YES = "Y";

    /**
     * Converts a boolean to a String.
     *
     * @param b the boolean value
     * @return "Y" for true and "N" for false.
     */
    public static String convert(boolean b) {
        return b ? YES : NO;
    }

    /**
     * Converts a String value to a boolean.
     *
     * @param value the String value to convert
     * @return true if "Y" and false if "N"
     * @throws FieldConvertError raised for any value other than "Y" or "N".
     */
    public static boolean convert(String value) throws FieldConvertError {
        return convert(value, 0, value == null ? 0 : value.length());
    }
    
    /**
     * Converts a range of a String to a boolean without allocating.
     *
     * Semantics are identical to convert(value.substring(offset, offset + length)),
     * including error messages.
     */
    public static boolean convert(String value, int offset, int length) throws FieldConvertError {
        if (value == null) {
            throw new FieldConvertError("invalid boolean value: " + value);
        }
        if (offset < 0 || length < 0 || value.length() - offset < length) {
            throw new FieldConvertError("invalid boolean value: offset=" + offset
                    + ", length=" + length + ", value.length=" + value.length());
        }
        if (length == 1) {
            final char c = value.charAt(offset);
            if (c == 'Y') return true;
            if (c == 'N') return false;
        }
        throw new FieldConvertError("invalid boolean value: " + window(value, offset, length));
    }
}
