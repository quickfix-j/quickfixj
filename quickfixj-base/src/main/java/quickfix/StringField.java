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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharArrayConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DecimalConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

/**
 * A string-valued message field.
 */
public class StringField extends Field<String> {
    
    private int offset;
    private int length;
    private boolean collapsed;
    
    private int hashcode;
    private boolean hashed;

    public StringField(int field) {
        super(field, "");
        this.collapsed = true;
    }
    
    public StringField(int field, String data) {
        super(field, data);
        this.offset = 0;
        this.length = data == null ? 0 : data.length();
        this.collapsed = true;
    }
    
    public StringField(int field, String data, int offset, int length) {
        super(field, data);
        if (data == null) {
            this.collapsed = true;
        } else {
            this.offset = offset;
            this.length = length;
            this.collapsed = (offset == 0 && length == data.length());
        }
    }

    public void setValue(String value) {
        setObject(value);
    }

    public String getValue() {
        return getObject();
    }
    
    boolean hasValue() {
        return raw() == null;
    }
    
    int toInt() throws FieldConvertError {
        return IntConverter.convert(raw(), offset, length);
    }
    
    boolean toBoolean() throws FieldConvertError {
        return BooleanConverter.convert(raw(), offset, length);
    }
    
    char toChar() throws FieldConvertError {
        return CharConverter.convert(raw(), offset, length);
    }
    
    char[] toChars() throws FieldConvertError {
        return CharArrayConverter.convert(raw(), offset, length);
    }
    
    BigDecimal toDecimal() throws FieldConvertError {
        return DecimalConverter.convert(raw(), offset, length);
    }
    
    double toDouble() throws FieldConvertError {
        return DoubleConverter.convert(raw(), offset, length);
    }
    
    LocalDateTime toUtcTimestamp() throws FieldConvertError {
        return UtcTimestampConverter.convertToLocalDateTime(getValue());
    }
    
    LocalTime toUtcTimeOnly() throws FieldConvertError {
        return UtcTimeOnlyConverter.convertToLocalTime(getValue());
    }
    
    LocalDate toUtcDateOnly() throws FieldConvertError {
        return UtcDateOnlyConverter.convertToLocalDate(getValue());
    }
    
    @Override
    protected void setObject(String value) {
        super.setObject(value);
        this.collapsed = true;
        this.hashed = false;
        this.offset = 0;
        this.length = value == null ? 0 : value.length();
    }
    
    @Override
    public String getObject() {
        return collapsed ? raw() : collapse();
    }
    
    private String collapse() {
        final String raw = raw();
        final String v = raw.substring(offset, offset + length);
        super.setObject(v);
        this.offset = 0;
        this.length = v.length();
        this.collapsed = true;
        return v;
    }
    
    @Override
    protected String objectAsString() {
        return Objects.requireNonNull(getObject());
    }
    
    @Override
    public int hashCode() {
        if (collapsed) {
            return raw().hashCode();
        }
        if (hashed) {
            return hashcode;
        }
        String s = raw();
        int h = 0;
        for (int i = offset, n = offset + length; i < n; i++) {
            h = 31 * h + s.charAt(i);
        }
        hashcode = h;
        hashed = true;
        return hashcode;
    }
    
    public boolean valueEquals(String value) {
        return value != null && value.length() == this.length
                && raw().regionMatches(this.offset, value, 0, this.length);
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Field)) return false;
        Field<?> other = (Field<?>) object;
        if (getField() != other.getField()) return false;
        if (object instanceof StringField) {
            StringField that = (StringField) object;
            return this.length == that.length
                    && this.raw().regionMatches(this.offset, that.raw(), that.offset, this.length);
        }
        Object v = other.getObject();
        return v instanceof String && ((String) v).length() == this.length
                && this.raw().regionMatches(this.offset, (String) v, 0, this.length);
    }
    
    private String raw() {
        return super.getObject();
    }
}
