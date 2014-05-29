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

package quickfix;

/**
 * An exception thrown when a tags value is not valid according to the data dictionary.
 */
public class IncorrectTagValue extends Exception {

    public IncorrectTagValue(int field) {
        super("Field ["+field+"] contains an incorrect tag value.");
        this.field = field;
    }

    public IncorrectTagValue(int field, String value) {
        super();
        this.field = field;
        this.value = value;
    }

    public IncorrectTagValue(String s) {
        super(s);
    }

    @Override
    public String toString() {
        String str = super.toString();
        if (field != 0) str += " field=" + field;
        if (value != null) str += " value=" + value;
        return str;
    }

    public int field;

    public String value;
}
