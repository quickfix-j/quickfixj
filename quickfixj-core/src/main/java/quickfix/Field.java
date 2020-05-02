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

/**
 * Base class for FIX message fields. This class should be
 * abstract but that would break compatibility with the QF JNI
 * classes.
 */
public /*abstract*/ class Field<T> implements Serializable {
    static final long serialVersionUID = 7098326013456432197L;
    private int tag;
    private T object;
    private boolean isCalculated = false;
    private String data;
    private byte[] dataBytes;

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
        isCalculated = false;
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
     * Returns the formatted field (tag=value<SOH>)
     *
     * @return the formatted field
     */
    @Override
    public String toString() {
        calculate();
        return data;
    }

    /*package*/ void toString(StringBuilder buffer) {
        if (isCalculated)
            buffer.append(data);
        else
            buffer.append(tag).append('=').append(objectAsString());
    }

    protected String objectAsString() {
        return object.toString();
    }

    public boolean equals(Object object) {
        return super.equals(object)
                || object instanceof Field
                   && tag == ((Field<?>) object).getField()
                   && getObject().equals(((Field<?>) object).getObject());
    }

    public int hashCode() {
        return object.hashCode();
    }

    /**
     * Returns the length of this field's FIX-encoded bytes (tag=value),
     * including the trailing SOH byte.
     *
     * @return the length of this field's encoded bytes
     */
    /*package*/ int getLength() {
        calculate();
        return (dataBytes != null ? dataBytes.length : data.length()) + 1;
    }

    /**
     * Returns the checksum of this field's FIX-encoded bytes (tag=value),
     * including the trailing SOH byte.
     *
     * @return the checksum of this field's encoded bytes
     */
    /*package*/ int getChecksum() {
        calculate();
        return ((dataBytes != null
                ? MessageUtils.checksum(dataBytes, false)
                : MessageUtils.checksum(CharsetSupport.getCharsetInstance(), data, false)) + 1) & 0xFF;
    }

    private void calculate() {
        if (isCalculated) {
            return;
        }
        StringBuilder buffer = new StringBuilder();
        toString(buffer);
        data = buffer.toString();
        if (!CharsetSupport.isStringEquivalent(CharsetSupport.getCharsetInstance()))
            dataBytes = data.getBytes(CharsetSupport.getCharsetInstance());
        isCalculated = true;
    }

    public void setTag(int tag) {
        this.tag = tag;
        isCalculated = false;
        calculate();
    }
}
