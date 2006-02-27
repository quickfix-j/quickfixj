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

import java.util.Date;

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
        setGroups(group);
    }
    
    public Group(int field, int delim, int[] order) {
        super(order);
        this.field = new IntField(field);
        this.delim = delim;
    }
    
    int getDelimeter() {
        return delim;
    }

    public void addGroup(Group group) {
        super.addGroup(group);
    }
    
    public Group getGroup(int num, Group group) throws FieldNotFound {
        return super.getGroup(num, group);
    }


    public int getFieldTag() {
        return field.getTag();
    }

    /**
     * @deprecated Use getFieldTag 
     * @return the field's tag number
     */
    public int field() {
        return getFieldTag();
    }
    
    public void setBoolean(int field, boolean value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setBoolean(field, value);
    }

    public void setChar(int field, char value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setChar(field, value);
    }

    public void setDouble(int field, double value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setDouble(field, value);
    }

    public void setField(BooleanField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(CharField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(DoubleField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(IntField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(StringField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcDateOnlyField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcTimeOnlyField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setField(UtcTimeStampField field) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setField(field);
    }

    public void setInt(int field, int value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setInt(field, value);
    }

    public void setString(int field, String value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setString(field, value);
    }

    public void setUtcDateOnly(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcDateOnly(field, value);
    }

    public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeOnly(field, value, includeMillseconds);
    }

    public void setUtcTimeOnly(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeOnly(field, value);
    }

    public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeStamp(field, value, includeMilliseconds);
    }

    public void setUtcTimeStamp(int field, Date value) {
        // TODO QF 1.11 Temporary (hopefully) overrides to remove NoTagValue declaration
        super.setUtcTimeStamp(field, value);
    }

}