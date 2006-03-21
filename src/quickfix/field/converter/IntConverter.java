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


public final class IntConverter {
    private IntConverter() { }
    
    public static String convert(int i) {
        return Long.toString(i);
    }

    public static int convert(String value) throws FieldConvertError {
        try {
            for (int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i))) {
                    throw new NumberFormatException();
                }
            }
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid integral value: " + value);
        }
    }
}