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

import org.quickfixj.CharsetSupport;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Base class for FIX message fields. This class should be
 * abstract but that would break compatibility with the QF JNI
 * classes.
 */
public /*abstract*/ class Field<T> implements Serializable {
    static final long serialVersionUID = 7098326013456432197L;
    private int tag;
    private T object;
    protected String data;

    public Field(int field, T object) {
        this.tag = field;
        this.object = object;
    }

    /**
     * Gets the field's tag.
     *
     * @return the tag
     */
    public int getTag() {
        return tag;
    }

    /**
     * Gets the field's tag. (QF/C++ compatibility)
     *
     * @return the tag
     * @see quickfix.Field#getTag()
     */
    public int getField() {
        return getTag();
    }

    /**
     * Sets the field's value to the given object.
     *
     * @param object
     */
    protected void setObject(T object) {
        this.object = object;
        data = null;
    }

    /**
     * Get the field value
     *
     * @return an object representing the field's value
     */
    public T getObject() {
        return object;
    }

    /**
     * Return's the formatted field (tag=value<SOH>)
     *
     * @return the formatted field
     */
    public String toString() {
        calculate();
        return data;
    }

    /*package*/ void toString(StringBuilder buffer) {
        if(null != data) {
            buffer.append(data);
            return;
        }
        buffer.append(quickfix.NumbersCache.get(tag)).append('=');
        if(object instanceof Number) {
            if(object instanceof Integer)
                appendNumber(buffer, ((Integer)object).longValue());
            else if(object instanceof Double)
                appendDouble(buffer, (Double) object);
            else if(object instanceof Float)
                buffer.append(((Float)object).floatValue());
            else if(object instanceof BigDecimal)
                buffer.append(((BigDecimal)object).toPlainString());
            else
                appendNumber(buffer, ((Number)object).longValue());
        } else
            objectAsString(buffer);
    }

    private static void appendNumber(StringBuilder buffer, long value) {
        if(value < 0) {
            buffer.append('-');
            value = Math.abs(value);
        }
        buffer.append(quickfix.NumbersCache.get(value));
    }

    private static void appendDouble(StringBuilder buffer, double value) {
        if(value < 0d) {
            buffer.append('-');
            value = Math.abs(value);
        }
        String str = quickfix.NumbersCache.get(value);
        if(null != str)
            buffer.append(str);
        else
            buffer.append(value);
    }

    protected String objectAsString() {
        return object.toString();
    }

    protected void objectAsString(StringBuilder stringBuilder) {
        stringBuilder.append(objectAsString());
    }

    public boolean equals(Object object) {
        return super.equals(object) || (object instanceof Field &&
                ((Field<?>) object).equals(tag, getObject()));
    }

    private boolean equals(int tag, Object object) {
        if(this.tag != tag)
            return false;
        Object thisObject = getObject();
        if(thisObject == null)
            return object == null;
        return thisObject.equals(object);
    }

    public int hashCode() {
        return getObject().hashCode();
    }

    /**
     * Returns the length of this field's FIX-encoded bytes (tag=value),
     * including the trailing SOH byte.
     *
     * @return the length of this field's encoded bytes
     */
    /*package*/ int getLength() {
        calculate();
        return MessageUtils.length(CharsetSupport.getCharsetInstance(), data) + 1;
    }

    /**
     * Returns the checksum of this field's FIX-encoded bytes (tag=value),
     * including the trailing SOH byte.
     *
     * @return the checksum of this field's encoded bytes
     */
    /*package*/ int getChecksum() {
        calculate();
        return (MessageUtils.checksum(CharsetSupport.getCharsetInstance(), data, false) + 1) & 0xFF;
    }

    private static final ThreadLocal<StringBuilder> buffers = new ThreadLocal<StringBuilder>() {
        @Override
        protected StringBuilder initialValue() {
            return new StringBuilder(256);
        }
    };

    private void calculate() {
        if(null == data) {
            StringBuilder buffer = buffers.get();
            try {
                toString(buffer);
                data = buffer.toString();
            } finally {
                buffer.setLength(0);
            }
        }
    }

    public void setTag(int tag) {
        this.tag = tag;
        data = null;
    }
}
