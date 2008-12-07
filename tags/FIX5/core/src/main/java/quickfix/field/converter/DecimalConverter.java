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

import java.math.BigDecimal;

import quickfix.FieldConvertError;

public class DecimalConverter {
    /**
     * Converts a double to a string with no padding.
     * @param d the BigDecimal to convert
     * @return the formatted String representing the incoming decimal.
     * @see #convert(BigDecimal, int)
     */
    public static String convert(BigDecimal d) {
        return d.toPlainString();
    }

    /**
     * Converts a decimal to a string with padding.
     * @param d the decimal to convert
     * @param padding the number of zeros to add to end of the formatted decimal
     * @return the formatted String representing the decimal.
     */
    public static String convert(BigDecimal d, int padding) {
        return DoubleConverter.getDecimalFormat(padding).format(d);
    }

    /**
     * Convert a String value to a decimal.
     * @param value the String value to convert
     * @return the parsed BigDecimal
     * @throws FieldConvertError if the String is not a valid decimal pattern.
     */
    public static BigDecimal convert(String value) throws FieldConvertError {
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid double value: " + value);
        }
    }
}
