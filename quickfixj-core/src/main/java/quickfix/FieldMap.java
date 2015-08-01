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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.SessionRejectReason;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DecimalConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

/**
 * Field container used by messages, groups, and composites.
 */
public abstract class FieldMap implements Serializable {

    static final long serialVersionUID = -3193357271891865972L;

    private final int[] fieldOrder;

    private final TreeMap<Integer, Field<?>> fields;

    private final TreeMap<Integer, List<Group>> groups = new TreeMap<Integer, List<Group>>();

    protected FieldMap(int[] fieldOrder) {
        this.fieldOrder = fieldOrder;
        fields = new TreeMap<Integer, Field<?>>(
                fieldOrder != null ? new FieldOrderComparator() : null);
    }

    protected FieldMap() {
        this(null);
    }

    public int[] getFieldOrder() {
        return fieldOrder;
    }

    public void clear() {
        fields.clear();
        groups.clear();
    }

    public boolean isEmpty() {
        return fields.isEmpty();
    }

    protected static int indexOf(int field, int[] fieldOrder) {
        if (fieldOrder != null) {
            for (int i = 0; i < fieldOrder.length; i++) {
                if (field == fieldOrder[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean isOrderedField(int field, int[] fieldOrder) {
        return indexOf(field, fieldOrder) > -1;
    }

    private class FieldOrderComparator implements Comparator<Integer>, Serializable {
        static final long serialVersionUID = 3416006398018829270L;

        private int rank(int field, int[] fieldOrder) {
            int index = indexOf(field, fieldOrder);
            return index > -1 ? index : Integer.MAX_VALUE; // unspecified fields are last
        }

        public int compare(Integer tag1, Integer tag2) {
            int rank1 = rank(tag1, getFieldOrder());
            int rank2 = rank(tag2, getFieldOrder());

            return rank1 != Integer.MAX_VALUE || rank2 != Integer.MAX_VALUE
                    ? rank1 - rank2 // order by rank if it is specified for either tag
                    : tag1 - tag2; // order by tag if both tags have unspecified ordering
        }
    }

    public void setFields(FieldMap fieldMap) {
        fields.clear();
        fields.putAll(fieldMap.fields);
    }

    protected void setComponent(MessageComponent component) {
        component.copyTo(this);
    }

    protected void getComponent(MessageComponent component) {
        component.clear();
        component.copyFrom(this);
    }

    public void setGroups(FieldMap fieldMap) {
        groups.clear();
        groups.putAll(fieldMap.groups);
    }

    protected void setGroups(int key, List<Group> groupList) {
        groups.put(key, groupList);
    }

    public void setString(int field, String value) {
        setField(new StringField(field, value));
    }

    public void setBytes(int field, byte[] value) {
        setField(field, new BytesField(field, value));
    }

    public void setBoolean(int field, boolean value) {
        setField(new StringField(field, BooleanConverter.convert(value)));
    }

    public void setChar(int field, char value) {
        setField(new StringField(field, CharConverter.convert(value)));
    }

    public void setInt(int field, int value) {
        setField(new StringField(field, IntConverter.convert(value)));
    }

    public void setDouble(int field, double value) {
        setDouble(field, value, 0);
    }

    public void setDouble(int field, double value, int padding) {
        setField(new StringField(field, DoubleConverter.convert(value, padding)));
    }

    public void setDecimal(int field, BigDecimal value) {
        setField(new StringField(field, DecimalConverter.convert(value)));
    }

    public void setDecimal(int field, BigDecimal value, int padding) {
        setField(new StringField(field, DecimalConverter.convert(value, padding)));
    }

    public void setUtcTimeStamp(int field, Date value) {
        setUtcTimeStamp(field, value, false);
    }

    public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
        setField(new StringField(field, UtcTimestampConverter.convert(value, includeMilliseconds)));
    }

    public void setUtcTimeOnly(int field, Date value) {
        setUtcTimeOnly(field, value, false);
    }

    public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
        setField(new StringField(field, UtcTimeOnlyConverter.convert(value, includeMillseconds)));
    }

    public void setUtcDateOnly(int field, Date value) {
        setField(new StringField(field, UtcDateOnlyConverter.convert(value)));
    }

    StringField getField(int field) throws FieldNotFound {
        final StringField f = (StringField) fields.get(field);
        if (f == null) {
            throw new FieldNotFound(field);
        }
        return f;
    }

    Field<?> getField(int field, Field<?> defaultValue) {
        final Field<?> f = fields.get(field);
        if (f == null) {
            return defaultValue;
        }
        return f;
    }

    private Field<?> getField(int field, boolean notFoundException) throws FieldNotFound {
        final Field<?> f = fields.get(field);
        if (f == null && notFoundException) {
            throw new FieldNotFound(field);
        }
        return f;
    }


    public String getString(int field) throws FieldNotFound {
        return getField(field).getObject();
    }

    public boolean getBoolean(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof BooleanField)
            return ((BooleanField)f).getValue();
        try {
            return BooleanConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public char getChar(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof CharField)
            return ((CharField)f).getValue();
        try {
            return CharConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public int getInt(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof IntField)
            return ((IntField)f).getValue();
        try {
            return IntConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public double getDouble(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof DoubleField)
            return ((DoubleField)f).getValue();
        try {
            return DoubleConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public BigDecimal getDecimal(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof DecimalField)
            return ((DecimalField)f).getValue();
        try {
            return DecimalConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcTimeStamp(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof UtcTimeStampField)
            return ((UtcTimeStampField)f).getValue();
        try {
            return UtcTimestampConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcTimeOnly(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof UtcTimeOnlyField)
            return ((UtcTimeOnlyField)f).getValue();
        try {
            return UtcTimeOnlyConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcDateOnly(int field) throws FieldNotFound {
        Field<?> f = getField(field, true);
        if(f instanceof UtcDateOnlyField)
            return ((UtcDateOnlyField)f).getValue();
        try {
            return UtcDateOnlyConverter.convert(f.objectAsString());
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public void setField(int key, Field<?> field) {
        fields.put(key, field);
    }

    private void setField(Field<?> field) {
        if (field.getObject() == null) {
            throw new NullPointerException("Null field values are not allowed.");
        }
        fields.put(field.getField(), field);
    }

    public void setField(StringField field) {
        setField((Field<?>)field);
    }

    public void setField(BooleanField field) {
        setField((Field<?>) field);
    }

    public void setField(CharField field) {
        setField((Field<?>) field);
    }

    public void setField(IntField field) {
        setField((Field<?>)field);
    }

    public void setField(DoubleField field) {
        fields.put(field.getField(), field);
    }

    public void setField(DecimalField field) {
        setField((Field<?>) field);
    }

    public void setField(UtcTimeStampField field) {
        setField((Field<?>) field);
    }

    public void setField(UtcTimeOnlyField field) {
        setField((Field<?>) field);
    }

    public void setField(UtcDateOnlyField field) {
        setField((Field<?>)field);
    }

    public void setField(BytesField field) {
        setBytes(field.getField(), field.getObject());
    }

    static <T, F extends Field<T>> F updateValue(F field, T value) {
        field.setObject(value);
        return field;
    }

    public BytesField getField(BytesField field) throws FieldNotFound {
        final Field<?> returnField = fields.get(field.getField());
        if (returnField == null) {
            throw new FieldNotFound(field.getField());
        } else if (returnField instanceof BytesField) {
            return (BytesField) returnField;
        } else {
            throw new FieldException(SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE,
                    field.getField());
        }
    }

    public StringField getField(StringField field) throws FieldNotFound {
        return updateValue(field, getString(field.getField()));
    }

    public BooleanField getField(BooleanField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof BooleanField)
            field.setObject(((BooleanField)f).getObject());
        else try {
            field.setObject(BooleanConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }


    public CharField getField(CharField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof CharField)
            field.setObject(((CharField) f).getObject());
        else try {
            field.setObject(CharConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public IntField getField(IntField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof IntField)
            field.setObject(((IntField)f).getObject());
        else try {
            field.setObject(IntConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public DoubleField getField(DoubleField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof DoubleField)
            field.setObject(((DoubleField)f).getObject());
        else try {
            field.setObject(DoubleConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public DecimalField getField(DecimalField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof DecimalField)
            field.setObject(((DecimalField)f).getObject());
        else try {
            field.setObject(DecimalConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public UtcTimeStampField getField(UtcTimeStampField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof UtcTimeStampField)
            field.setObject(((UtcTimeStampField)f).getObject());
        else try {
            field.setObject(UtcTimestampConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public UtcTimeOnlyField getField(UtcTimeOnlyField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof UtcTimeOnlyField)
            field.setObject(((UtcTimeOnlyField)f).getObject());
        else try {
            field.setObject(UtcTimeOnlyConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    public UtcDateOnlyField getField(UtcDateOnlyField field) throws FieldNotFound {
        Field<?> f = getField(field.getField(), true);
        if(f instanceof UtcDateOnlyField)
            field.setObject(((UtcDateOnlyField)f).getObject());
        else try {
            field.setObject(UtcDateOnlyConverter.convert(f.objectAsString()));
        } catch (final FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        }
        return field;
    }

    private FieldException newIncorrectDataException(FieldConvertError e, int tag) {
        return new FieldException(SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE,
                e.getMessage(), tag);
    }

    public boolean isSetField(int field) {
        return fields.containsKey(field);
    }

    public boolean isSetField(Field<?> field) {
        return isSetField(field.getField());
    }

    public void removeField(int field) {
        fields.remove(field);
    }

    public Iterator<Field<?>> iterator() {
        return fields.values().iterator();
    }

    protected void initializeFrom(FieldMap source) {
        fields.clear();
        fields.putAll(source.fields);
        for (Entry<Integer, List<Group>> entry : source.groups.entrySet()) {
            final List<Group> clones = new ArrayList<Group>();
            for (final Group group : entry.getValue()) {
                final Group clone = new Group(group.getFieldTag(),
                        group.delim(), group.getFieldOrder());
                clone.initializeFrom(group);
                clones.add(clone);
            }
            groups.put(entry.getKey(), clones);
        }
    }

    private boolean isGroupField(int field) {
        return groups.containsKey(field);
    }

    private static void appendField(StringBuilder buffer, Field<?> field) {
        if (field != null) {
            field.toString(buffer);
            buffer.append('\001');
        }
    }

    protected void calculateString(StringBuilder buffer, int[] preFields, int[] postFields) {
        if (preFields != null) {
            for (int preField : preFields) {
                appendField(buffer, getField(preField, null));
            }
        }

        for (final Field<?> field : fields.values()) {
            final int tag = field.getField();
            if (!isOrderedField(tag, preFields) && !isOrderedField(tag, postFields)
                    && !isGroupField(tag)) {
                appendField(buffer, field);
            } else if (isGroupField(tag) && isOrderedField(tag, fieldOrder)
                    && getGroupCount(tag) > 0) {
                appendField(buffer, field);
                for (Group group : getGroups(tag)) {
                    group.calculateString(buffer, preFields, postFields);
                }
            }
        }

        for (final Entry<Integer, List<Group>> entry : groups.entrySet()) {
            final Integer groupCountTag = entry.getKey();
            if (!isOrderedField(groupCountTag, fieldOrder)) {
                final List<Group> groups = entry.getValue();
                int groupCount = groups.size();
                if (groupCount > 0) {
                    final IntField countField = new IntField(groupCountTag.intValue(), groupCount);
                    appendField(buffer, countField);
                    for (Group group : groups) {
                        group.calculateString(buffer, preFields, postFields);
                    }
                }
            }
        }

        if (postFields != null) {
            for (int postField : postFields) {
                appendField(buffer, getField(postField, null));
            }
        }
    }

    int calculateLength() {
        int result = 0;
        for (final Field<?> field : fields.values()) {
            int tag = field.getField();
            if (tag != BeginString.FIELD && tag != BodyLength.FIELD
                    && tag != CheckSum.FIELD && !isGroupField(tag)) {
                result += field.getLength();
            }
        }

        for (Entry<Integer, List<Group>> entry : groups.entrySet()) {
            final List<Group> groupList = entry.getValue();
            if (!groupList.isEmpty()) {
                final IntField groupField = new IntField(entry.getKey());
                groupField.setValue(groupList.size());
                result += groupField.getLength();
                for (final Group group : groupList) {
                    result += group.calculateLength();
                }
            }
        }
        return result;
    }

    int calculateChecksum() {
        int result = 0;
        for (final Field<?> field : fields.values()) {
            if (field.getField() != CheckSum.FIELD && !isGroupField(field.getField())) {
                result += field.getChecksum();
            }
        }

        for (Entry<Integer, List<Group>> entry : groups.entrySet()) {
            final List<Group> groupList = entry.getValue();
            if (!groupList.isEmpty()) {
                final IntField groupField = new IntField(entry.getKey());
                groupField.setValue(groupList.size());
                result += groupField.getChecksum();
                for (final Group group : groupList) {
                    result += group.calculateChecksum();
                }
            }
        }

        return result & 0xFF;
    }

    /**
     * Returns the number of groups associated with the specified count tag.
     *
     * @param tag the count tag number
     * @return the number of times the group repeats
     */
    public int getGroupCount(int tag) {
        return getGroups(tag).size();
    }

    public Iterator<Integer> groupKeyIterator() {
        return groups.keySet().iterator();
    }

    Map<Integer, List<Group>> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        addGroupRef(new Group(group));
    }

    public void addGroupRef(Group group) {
        int countTag = group.getFieldTag();
        List<Group> currentGroups = getGroups(countTag);
        currentGroups.add(group);
        setGroupCount(countTag, currentGroups.size());
    }

    protected void setGroupCount(int countTag, int groupSize) {
        try {
            if (groupSize == 1)
                setField(countTag, new StringField(countTag, "1"));
            else
                getField(countTag).setValue(NumbersCache.get(groupSize));
        } catch (final FieldNotFound e) {
            // Shouldn't happen
            throw new RuntimeError(e);
        }
    }

    public List<Group> getGroups(int field) {
        List<Group> groupList = groups.get(field);
        if (groupList == null) {
            groupList = new ArrayList<Group>();
            groups.put(field, groupList);
        }
        return groupList;
    }

    public Group getGroup(int num, Group group) throws FieldNotFound {
        final List<Group> groupList = getGroups(group.getFieldTag());
        if (num > groupList.size()) {
            throw new FieldNotFound(group.getFieldTag() + ", index=" + num);
        }
        final Group grp = groupList.get(num - 1);
        group.setFields(grp);
        group.setGroups(grp);
        return group;
    }

    public Group getGroup(int num, int groupTag) throws FieldNotFound {
        List<Group> groupList = getGroups(groupTag);
        if (num > groupList.size()) {
            throw new FieldNotFound(groupTag + ", index=" + num);
        }
        return groupList.get(num - 1);
    }

    public void replaceGroup(int num, Group group) {
        final int offset = num - 1;
        final List<Group> groupList = getGroups(group.getFieldTag());
        if (offset < 0 || offset >= groupList.size()) {
            return;
        }
        groupList.set(offset, new Group(group));
    }

    public void removeGroup(int field) {
        getGroups(field).clear();
        removeField(field);
    }

    public void removeGroup(int num, int field) {
        final List<Group> groupList = getGroups(field);
        if (num <= groupList.size()) {
            groupList.remove(num - 1);
        }
        if (!groupList.isEmpty()) {
            setGroupCount(field, groupList.size());
        }
    }

    public void removeGroup(int num, Group group) {
        removeGroup(num, group.getFieldTag());
    }

    public void removeGroup(Group group) {
        removeGroup(group.getFieldTag());
    }

    public boolean hasGroup(int field) {
        return groups.containsKey(field);
    }

    public boolean hasGroup(int num, int field) {
        return hasGroup(field) && num <= getGroups(field).size();
    }

    public boolean hasGroup(int num, Group group) {
        return hasGroup(num, group.getFieldTag());
    }

    public boolean hasGroup(Group group) {
        return hasGroup(group.getFieldTag());
    }

}
