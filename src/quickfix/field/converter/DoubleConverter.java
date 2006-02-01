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

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickfix.FieldConvertError;


public class DoubleConverter {
    private static DecimalFormat doubleFormat = null;
    private static final Pattern doublePattern = Pattern.compile("-?\\d*(\\.\\d*)?");

    static {
        doubleFormat = new DecimalFormat("#.##############");
        // Assigning Locale.US is necessary to avoid mixed up with decimal separators ex : , for France and . for US 
        doubleFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
    }
    
    public static String convert(double d) {
        // TODO PERFORMANCE This can be optimized!
        synchronized (doubleFormat) {
            return doubleFormat.format(d);
        }
    }

    public static double convert(String value) throws FieldConvertError {
        try {
            Matcher matcher = doublePattern.matcher(value);
            if (!matcher.matches()) {
                throw new NumberFormatException();
            }
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid double value: " + value);
        }
    }
}