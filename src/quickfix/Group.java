/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

public class Group extends FieldMap {
    private int field;
    private int delim;
    
    public Group() { }
    
    public Group(int field, int delim) {
        this(field, delim, null);
    }

    public Group(Group group) {
        this(group.getField(), group.getDelimeter(), group.getFieldOrder());
        setFields(group);
    }
    
    private int getDelimeter() {
        return delim;
    }
    
    public Group(int field, int delim, int[] order) {
        super(order);
        this.field = field;
        this.delim = delim;
    }

    public void addGroup(Group group) {
        throw new UnsupportedOperationException();
    }
    
    public Group getGroup(int num, Group group) /*throws FieldNotFound*/ {
        throw new UnsupportedOperationException();
    }

    public int getField() {
        return field;
    }
    
//    public native void setString(int field, String value);
//    public native void setBoolean(int field, boolean value);
//    public native void setChar(int field, char value);
//    public native void setInt(int field, int value);
//    public native void setDouble(int field, double value);
//    public native void setUtcTimeStamp(int field, Date value);
//    public native void setUtcTimeOnly(int field, Date value);
//    public native void setUtcDateOnly(int field, Date value);
//
//    public native String getString(int field) throws FieldNotFound;
//    public native boolean getBoolean(int field) throws FieldNotFound;
//    public native char getChar(int field) throws FieldNotFound;
//    public native int getInt(int field) throws FieldNotFound;
//    public native double getDouble(int field) throws FieldNotFound;
//    public native Date getUtcTimeStamp(int field) throws FieldNotFound;
//    public native Date getUtcTimeOnly(int field) throws FieldNotFound;
//    public native Date getUtcDateOnly(int field) throws FieldNotFound;

    // TODO
    public class Iterator implements java.util.Iterator {

        public Iterator( Group aGroup ) {
            //group = aGroup;
            //groupIteratorCreate( this );
        }

        public boolean hasNext() {
            //return groupIteratorHasNext( this );
            return false;
        }

        public Object next() {
            //return groupIteratorNext( this );
            return null;
        }

        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
//
//    private native Iterator groupIteratorCreate( Iterator i );
//    private native boolean groupIteratorHasNext( Iterator i );
//    private native Object groupIteratorNext( Iterator i );
}
