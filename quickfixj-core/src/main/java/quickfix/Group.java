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
    private final IntField field;
    private final int delim;

    /**
     * Create a group with the specified count and delimiter fields.
     *
     * @param field the count tag number
     * @param delim the delimiter tag number (first group field)
     */
    public Group(int field, int delim) {
        this(field, delim, new int[] { delim });
    }

    /**
     * Copy a group.
     *
     * @param group the group to copy
     */
    public Group(Group group) {
        this(group.getFieldTag(), group.delim(), group.getFieldOrder());
        setFields(group);
        setGroups(group);
    }

    /**
     * Create a group with the specified count and delimiter fields and
     * field ordering.
     *
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
     * @return the group delimiter tag number.
     */
    public int delim() {
        return delim;
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
