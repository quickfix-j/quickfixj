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

import quickfix.field.converter.DoubleConverter;

/**
 * A double-values message field.
 */
public class DoubleField extends Field<Double> {

    private static final Double ZERO = 0d;
    private double value = 0d;
    private int padding = 0;

    public DoubleField(int field) {
        super(field, ZERO);
    }

    public DoubleField(int field, Double data) {
        super(field, data);
        checkForValidDouble(data);
        value = data;
    }

    public DoubleField(int field, double data) {
        super(field, ZERO);
        checkForValidDouble(data);
        value = data;
    }

    public DoubleField(int field, double data, int padding) {
        super(field, ZERO);
        checkForValidDouble(data);
        value = data;
        this.padding = padding;
    }

    public void setValue(Double value) {
        checkForValidDouble(value);
        setObject(value);
    }

    public void setValue(double value) {
        checkForValidDouble(value);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    protected void setObject(Double object) {
        super.setObject(object);
        value = object;
    }

    @Override
    public Double getObject() {
        Double val = super.getObject();
        if(null != val && value == val)
            return val;
        super.setObject(value);
        return super.getObject();
    }

    public int getPadding() {
        return padding;
    }

    public boolean valueEquals(Double value) {
        return null != value && valueEquals(value.doubleValue());
    }

    public boolean valueEquals(double value) {
        return this.value == value;
    }

    // QFJ-808: NaN or infinity values cannot be transmitted via FIX in a DoubleField
    private void checkForValidDouble(double value) throws NumberFormatException {
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw new NumberFormatException("Tried to set NaN or infinite value.");
        }
    }

    @Override
    void toString(StringBuilder buffer) {
        if (null != super.data) {
            buffer.append(super.data);
            return;
        }
        buffer.append(NumbersCache.get(getTag())).append('=');
        double val = value;
        if(val < 0d) {
            buffer.append('-');
            val = Math.abs(val);
        }
        String str = NumbersCache.get(val);
        if(null != str)
            buffer.append(str);
        else
            buffer.append(objectAsString());
    }

    @Override
    protected String objectAsString() {
        return DoubleConverter.convert(value);
    }

    @Override
    protected void objectAsString(StringBuilder stringBuilder) {
        stringBuilder.append(objectAsString());
    }

    @Override
    public int hashCode() {
        long bits = Double.doubleToLongBits(value);
        return (int)(bits ^ (bits >>> 32));
    }
}
