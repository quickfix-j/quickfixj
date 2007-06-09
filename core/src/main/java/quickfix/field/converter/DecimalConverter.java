/*============================================================================
 *
 * Copyright (c) 2000-2007 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package quickfix.field.converter;

import java.math.BigDecimal;

import quickfix.FieldConvertError;

public class DecimalConverter {
    /**
     * Converts a double to a string with no padding.
     * @param d the double to convert
     * @return the formatted String representing the double.
     * @see #convert(double, int)
     */
    public static String convert(BigDecimal d) {
        return convert(d, 0);
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
