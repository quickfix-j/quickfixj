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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.SessionRejectReason;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

public abstract class FieldMap implements Serializable {

    static final long serialVersionUID = -3193357271891865972L;

    private final int[] fieldOrder;

    private final TreeMap fields;

    private final TreeMap groups = new TreeMap();

    protected FieldMap(int[] fieldOrder) {
        this.fieldOrder = fieldOrder;
        fields = new TreeMap(fieldOrder != null ? new FieldOrderComparator() : null);
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

    private class FieldOrderComparator implements Comparator, Serializable {
        static final long serialVersionUID = 3416006398018829270L;

        public int compare(Object o1, Object o2) {
            Integer tag1 = (Integer) o1;
            Integer tag2 = (Integer) o2;
            int index1 = indexOf(tag1.intValue(), getFieldOrder());
            int index2 = indexOf(tag2.intValue(), getFieldOrder());

            if ((index1 != Integer.MAX_VALUE) && (index2 != Integer.MAX_VALUE)) {
                // We manage two ordered fields
                return index1 != index2 ? (index1 < index2 ? -1 : 1) : 0;
            } else if ((index1 == Integer.MAX_VALUE) || (index2 == Integer.MAX_VALUE)) {
                if (index1 != index2) {
                    return (index1 == Integer.MAX_VALUE ? 1 : -1);
                } else {
                    // index1 and index2 equals to Integer.MAX_VALUE so use the tags
                    return tag1.intValue() != tag2.intValue() ? (tag1.intValue() < tag2.intValue()
                            ? -1
                            : 1) : 0;
                }
            } else {
                return tag1.intValue() != tag2.intValue() ? (tag1.intValue() < tag2.intValue()
                        ? -1
                        : 1) : 0;
            }
        }

        private int indexOf(int tag, int[] order) {
            if (order != null) {
                for (int i = 0; i < order.length; i++) {
                    if (tag == order[i]) {
                        return i;
                    }
                }
            }
            return Integer.MAX_VALUE;
        }
    }

    public void setFields(FieldMap fieldMap) {
        fields.clear();
        fields.putAll(fieldMap.fields);
    }

    public void setGroups(FieldMap fieldMap) {
        groups.clear();
        groups.putAll(fieldMap.groups);
    }

    public void setString(int field, String value) {
        setField(new StringField(field, value));
    }

    public void setBoolean(int field, boolean value) {
        String s = BooleanConverter.convert(value);
        setField(new StringField(field, s));
    }

    public void setChar(int field, char value) {
        String s = CharConverter.convert(value);
        setField(new StringField(field, s));
    }

    public void setInt(int field, int value) {
        String s = IntConverter.convert(value);
        setField(new StringField(field, s));
    }

    public void setDouble(int field, double value) {
        String s = DoubleConverter.convert(value);
        setField(new StringField(field, s));
    }

    public void setUtcTimeStamp(int field, Date value) {
        setUtcTimeStamp(field, value, false);
    }

    public void setUtcTimeStamp(int field, Date value, boolean includeMilliseconds) {
        String s = UtcTimestampConverter.convert(value, includeMilliseconds);
        setField(new StringField(field, s));
    }

    public void setUtcTimeOnly(int field, Date value) {
        setUtcTimeOnly(field, value, false);
    }

    public void setUtcTimeOnly(int field, Date value, boolean includeMillseconds) {
        String s = UtcTimeOnlyConverter.convert(value, includeMillseconds);
        setField(new StringField(field, s));
    }

    public void setUtcDateOnly(int field, Date value) {
        String s = UtcDateOnlyConverter.convert(value);
        setField(new StringField(field, s));
    }

    public String getString(int field) throws FieldNotFound {
        return getField(field).getObject().toString();
    }

    StringField getField(int field) throws FieldNotFound {
        StringField f = (StringField) fields.get(new Integer(field));
        if (f == null) {
            throw new FieldNotFound(field);
        }
        return f;
    }

    Field getField(int field, Field defaultValue) {
        Field f = (Field) fields.get(new Integer(field));
        if (f == null) {
            return defaultValue;
        }
        return f;
    }

    public boolean getBoolean(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return BooleanConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public char getChar(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return CharConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public int getInt(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return IntConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public double getDouble(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return DoubleConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcTimeStamp(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return UtcTimestampConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcTimeOnly(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return UtcTimeOnlyConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public Date getUtcDateOnly(int field) throws FieldNotFound {
        String value = getField(field).getValue();
        try {
            return UtcDateOnlyConverter.convert(value);
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field);
        }
    }

    public void setField(StringField field) {
        if (field.getValue() == null) {
            throw new NullPointerException("Null field values are not allowed.");
        }
        Integer key = new Integer(field.getField());
        fields.put(key, field);
    }

    public void setField(BooleanField field) {
        setBoolean(field.getField(), field.getValue());
    }

    public void setField(CharField field) {
        setChar(field.getField(), field.getValue());
    }

    public void setField(IntField field) {
        setInt(field.getField(), field.getValue());
    }

    public void setField(DoubleField field) {
        setDouble(field.getField(), field.getValue());
    }

    public void setField(UtcTimeStampField field) {
        setUtcTimeStamp(field.getField(), field.getValue());
    }

    public void setField(UtcTimeOnlyField field) {
        setUtcTimeOnly(field.getField(), field.getValue());
    }

    public void setField(UtcDateOnlyField field) {
        setUtcDateOnly(field.getField(), field.getValue());
    }

    public StringField getField(StringField field) throws FieldNotFound {
        return (StringField) getFieldInternal(field);
    }

    private Field getFieldInternal(Field field) throws FieldNotFound {
        field.setObject(getField(field.getField()).getObject());
        return field;
    }

    public BooleanField getField(BooleanField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(new Boolean(BooleanConverter.convert(value)));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public CharField getField(CharField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(new Character(CharConverter.convert(value)));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public IntField getField(IntField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(new Integer(IntConverter.convert(value)));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public DoubleField getField(DoubleField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(new Double(DoubleConverter.convert(value)));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public UtcTimeStampField getField(UtcTimeStampField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(UtcTimestampConverter.convert(value));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public UtcTimeOnlyField getField(UtcTimeOnlyField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(UtcTimeOnlyConverter.convert(value));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    public UtcDateOnlyField getField(UtcDateOnlyField field) throws FieldNotFound {
        try {
            String value = getField(field.getField()).getValue();
            field.setObject(UtcDateOnlyConverter.convert(value));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, field.getField());
        } catch (FieldNotFound e) {
            throw e;
        }
        return field;
    }

    private FieldException newIncorrectDataException(FieldConvertError e, int tag) {
        return new FieldException(SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE, e
                .getMessage(), tag);
    }

    public boolean isSetField(int field) {
        return fields.containsKey(new Integer(field));
    }

    public boolean isSetField(Field field) {
        return isSetField(field.getField());
    }

    public void removeField(int field) {
        fields.remove(new Integer(field));
    }

    public Iterator iterator() {
        return fields.values().iterator();
    }

    protected void initializeFrom(FieldMap source) {
        fields.clear();
        fields.putAll(source.fields);
    }

    // Patch from David VINCENT
    private boolean isGroupField(int field) {
        return groups.get(new Integer(field)) != null;
    }

    // End Patch from David VINCENT

    void calculateString(StringBuffer buffer, int[] preFields, int[] postFields) {
        if (preFields != null) {
            for (int i = 0; i < preFields.length; i++) {
                Field field = getField(preFields[i], null);
                field.toString(buffer);
                buffer.append('\001');
            }
        }
        for (Iterator iter = fields.values().iterator(); iter.hasNext();) {
            Field field = (Field) iter.next();
            // Patch from David VINCENT
            if (!isOrderedField(field.getField(), preFields)
                    && !isOrderedField(field.getField(), postFields)
                    && !isGroupField(field.getField())) {
                // End Patch from David VINCENT
                field.toString(buffer);
                buffer.append('\001');
            }
        }

        for (Iterator iter = groups.entrySet().iterator(); iter.hasNext();) {
            Map.Entry entry = (Map.Entry) iter.next();
            List mygroups = (List) entry.getValue();
            IntField groupField = new IntField(((Integer) entry.getKey()).intValue());
            groupField.setValue(mygroups.size());
            groupField.toString(buffer);
            buffer.append('\001');
            // Acceptance test copies message with group length field already
            // present
            // This causes two fields to be sent.
            // buffer.append(entry.getKey()).append("=").append(groups.size()).append('\001');
            for (int i = 0; i < mygroups.size(); i++) {
                FieldMap groupFields = (FieldMap) mygroups.get(i);
                groupFields.calculateString(buffer, preFields, postFields);
            }
        }
        if (postFields != null) {
            for (int i = 0; i < postFields.length; i++) {
                Field field = getField(postFields[i], null);
                field.toString(buffer);
                buffer.append('\001');
            }
        }
    }

    private boolean isOrderedField(int field, int[] afieldOrder) {
        if (afieldOrder != null) {
            for (int i = 0; i < afieldOrder.length; i++) {
                if (field == afieldOrder[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    int calculateLength() {
        int result = 0;
        int length = 0;
        for (Iterator iter = fields.values().iterator(); iter.hasNext();) {
            Field field = (Field) iter.next();
            if (field.getField() == BeginString.FIELD || field.getField() == BodyLength.FIELD
                    || field.getField() == CheckSum.FIELD || isGroupField(field.getField())) {
                continue;
            }
            length = field.getLength();
            result += length;
        }

        Iterator iterator = groups.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            List groupList = (List) entry.getValue();
            IntField groupField = new IntField(((Integer) entry.getKey()).intValue());
            groupField.setValue(groupList.size());
            length = groupField.getLength();
            result += length;
            for (int i = 0; i < groupList.size(); i++) {
                Group group = (Group) groupList.get(i);
                length = group.calculateLength();
                result += length;
            }
        }

        return result;

    }

    int calculateTotal() {

        int result = 0;
        for (Iterator iter = fields.values().iterator(); iter.hasNext();) {
            Field field = (Field) iter.next();
            if (field.getField() == CheckSum.FIELD || isGroupField(field.getField())) {
                continue;
            }
            result += field.getTotal();
        }

        Iterator iterator = groups.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            List groupList = (List) entry.getValue();
            IntField groupField = new IntField(((Integer) entry.getKey()).intValue());
            groupField.setValue(groupList.size());
            result += groupField.getTotal();
            for (int i = 0; i < groupList.size(); i++) {
                Group group = (Group) groupList.get(i);
                result += group.calculateTotal();
            }
        }

        return result;
    }

    int getGroupCount(int tag) {
        return getGroups(tag).size();
    }

    public Iterator groupKeyIterator() {
        return groups.keySet().iterator();
    }

    Map getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        getGroups(group.getFieldTag()).add(new Group(group));
    }

    /* package */List getGroups(int field) {
        List groupList = (List) groups.get(new Integer(field));
        if (groupList == null) {
            groupList = new ArrayList();
            groups.put(new Integer(field), groupList);
        }
        return groupList;
    }

    public Group getGroup(int num, Group group) throws FieldNotFound {
        List groupList = getGroups(group.getFieldTag());
        if (num > groupList.size()) {
            throw new FieldNotFound(group.getFieldTag() + ", index=" + num);
        }
        group.setFields((Group) groupList.get(num - 1));
        group.setGroups((Group) groupList.get(num - 1));
        return group;
    }

    public void removeGroup(int field) {
        getGroups(field).clear();
    }

    public void removeGroup(int num, int field) {
        List groupList = getGroups(field);
        if (num <= groupList.size()) {
            groupList.remove(num - 1);
        }
    }

    public void removeGroup(int num, Group group) {
        removeGroup(num, group.getFieldTag());
    }

    public void removeGroup(Group group) {
        removeGroup(group.getFieldTag());
    }

    public boolean hasGroup(int field) {
        return groups.containsKey(new Integer(field));
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