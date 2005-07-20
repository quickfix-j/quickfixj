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
    private IntField field;
    private int delim;
    
    public Group() { }
    
    public Group(int field, int delim) {
        this(field, delim, null);
    }

    public Group(Group group) {
        this(group.getFieldTag(), group.getDelimeter(), group.getFieldOrder());
        setFields(group);
    }
    
    public Group(int field, int delim, int[] order) {
        super(order);
        this.field = new IntField(field);
        this.delim = delim;
    }
    
    private int getDelimeter() {
        return delim;
    }

    public void addGroup(Group group) {
        // TODO QUESTION review why this is unsupported
        throw new UnsupportedOperationException();
    }
    
    public Group getGroup(int num, Group group) throws FieldNotFound {
        // TODO QUESTION review why this is unsupported
        throw new UnsupportedOperationException();
    }

    public int getFieldTag() {
        return field.getTag();
    }
}
