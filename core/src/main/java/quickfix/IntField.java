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

import java.lang.Integer;

/**
 * A integer message field.
 */
public class IntField extends Field<Integer> {

    public IntField(int field) {
        super(field, 0);
    }

    public IntField(int field, Integer data) {
        super(field, data);
    }

    public IntField(int field, int data) {
        super(field, data);
    }

    public void setValue(Integer value) {
        setObject(value);
    }

    public void setValue(int value) {
        setObject(value);
    }

    public int getValue() {
        return getObject();
    }

    public boolean valueEquals(Integer value) {
        return getObject().equals(value);
    }

    public boolean valueEquals(int value) {
        return getObject().equals(value);
    }
}
