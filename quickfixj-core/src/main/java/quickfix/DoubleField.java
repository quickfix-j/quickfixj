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
 * A double-values message field.
 */
public class DoubleField extends Field<Double> {

    private int padding = 0;

    public DoubleField(int field) {
        super(field, 0d);
    }

    public DoubleField(int field, Double data) {
        super(field, data);
        checkForValidDouble(data);
    }

    public DoubleField(int field, double data) {
        super(field, data);
        checkForValidDouble(data);
    }

    public DoubleField(int field, double data, int padding) {
        super(field, data);
        checkForValidDouble(data);
        this.padding = padding;
    }

    public void setValue(Double value) {
        checkForValidDouble(value);
        setObject(value);
    }

    public void setValue(double value) {
        checkForValidDouble(value);
        setObject(value);
    }

    public double getValue() {
        return getObject();
    }

    public int getPadding() {
        return padding;
    }

    public boolean valueEquals(Double value) {
        return getObject().equals(value);
    }

    public boolean valueEquals(double value) {
        return getObject().equals(value);
    }

    // QFJ-808: NaN or infinity values cannot be transmitted via FIX in a DoubleField
    private void checkForValidDouble(Double value) throws NumberFormatException {
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw new NumberFormatException("Tried to set NaN or infinite value.");
        }
    }
}
