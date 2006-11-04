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
 * Represents a repeating field group within a message.
 */
public class Group extends FieldMap {
    private IntField field;
    private int delim;

    /**
     * Create a group with the specified count and delimeter fields.
     * @param field the count tag number
     * @param delim the delimeter tag number (first group field)
     */
    public Group(int field, int delim) {
        this(field, delim, new int[] { delim });
    }

    /**
     * Copy a group.
     * @param group the group to copy
     */
    public Group(Group group) {
        this(group.getFieldTag(), group.delim(), group.getFieldOrder());
        setFields(group);
        setGroups(group);
    }
    
    /**
     * Create a group with the specified count and delimeter fields and
     * field ordering.
     * @param field
     * @param delim
     * @param order
     */
    public Group(int field, int delim, int[] order) {
        super(order);
        this.field = new IntField(field);
        this.delim = delim;
    }
    
    /**
     * @return the group delimeter tag number.
     */
    public int delim() {
        return delim;
    }
    
    /**
     * Add a copy of the group to the message.
     * @param group the group to copy
     */
    public void addGroup(Group group) {
        super.addGroup(group);
    }
    
    /**
     * Copy the group at the specified index into the supplied group object.
     * @param num the index of the group (1 based)
     * @param group the target group object for the group fields (it will be cleared).sss
     */
    public Group getGroup(int num, Group group) throws FieldNotFound {
        return super.getGroup(num, group);
    }

    /**
     * @return the count field tag.
     */
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
}