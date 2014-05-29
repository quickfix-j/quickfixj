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
 * An exception thrown when a field is not found in message. If you see
 * this exception, be sure you accessing the field in the correct section
 * of the message (for example, a header field in message.getHeader()).
 */
public class FieldNotFound extends Exception {

    public FieldNotFound(int field) {
        super("Field ["+field+"] was not found in message.");
        this.field = field;
    }

    public FieldNotFound(String s) {
        super(s);
    }

    public int field;
}
