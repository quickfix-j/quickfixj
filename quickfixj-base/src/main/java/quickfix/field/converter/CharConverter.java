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
 * Converts between a character and a String.
 */
public class CharConverter {

    /**
     * Converts a character to a String
     *
     * @param c the character to convert
     * @return a single character String based on the converted character
     * @see java.lang.Character#toString(char)
     */
    public static String convert(char c) {
        return Character.toString(c);
    }

    /**
     * Convert a String value to a character.
     *
     * @param value
     * @return the converted character
     * @throws FieldConvertError if String length != 1
     */
    public static char convert(String value) throws FieldConvertError {
        return convert(value, 0, value == null ? 0 : value.length());
    }
    
    /**
     * Converts a range of a String to a character without allocating.
     *
     * Semantics are identical to convert(value.substring(offset, offset + length)),
     * including error messages.
     */
    public static char convert(String value, int offset, int length) throws FieldConvertError {
        if (value == null) {
            throw new NullPointerException();
        }
        if (offset < 0 || length < 0 || value.length() - offset < length) {
            throw new FieldConvertError("invalid character value: offset=" + offset
                    + ", length=" + length + ", value.length=" + value.length());
        }
        if (length != 1) {
            throw new FieldConvertError("invalid character value: " + window(value, offset, length));
        }
        return value.charAt(offset);
    }
}
