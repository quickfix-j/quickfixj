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
 * Field has a badly formatted value. (From the C++ API documentation.)
 */
public class IncorrectDataFormat extends Exception {
    public final int field;
    public final String data;

    /**
     * @param field the tag number with the incorrect data
     * @param data the incorrect data
     */
    public IncorrectDataFormat(final int field, final String data) {
        this(field, data, "Field ["+field+"] contains badly formatted data.");
    }

    /**
     * This constructor is here for QF JNI compatibility.
     * 
     * @param field the tag number with the incorrect data
     */
    public IncorrectDataFormat(final int field) {
        this(field, null);
    }

    /**
     * This constructor is here for QF JNI compatibility.
     * 
     * @param message
     */
    public IncorrectDataFormat(final String message) {
        this(0, null, message);
    }

    private IncorrectDataFormat(final int field, final String data, final String message) {
        super(message);
        this.field = field;
        this.data = data;
    }
}
