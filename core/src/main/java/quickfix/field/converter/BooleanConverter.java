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
        if (YES.equals(value)) {
            return true;
        } else if (NO.equals(value)) {
            return false;
        } else {
            throw new FieldConvertError("invalid boolean value: " + value);
        }
    }
}