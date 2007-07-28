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

/**
 * A double-values message field.
 */
public class DecimalField extends Field<BigDecimal> {

    private int padding = 0;

    public DecimalField(int field) {
        super(field, BigDecimal.ZERO);
    }

    public DecimalField(int field, BigDecimal data) {
        super(field, data);
    }

    public DecimalField(int field, double data) {
        super(field, BigDecimal.valueOf(data));
    }

    public DecimalField(int field, BigDecimal data, int padding) {
        super(field, data);
        this.padding = padding;
    }

    public void setValue(BigDecimal value) {
        setObject(value);
    }

    public void setValue(double value) {
        setObject(BigDecimal.valueOf(value));
    }

    public BigDecimal getValue() {
        return getObject();
    }

    public int getPadding() {
        return padding;
    }

    public boolean valueEquals(BigDecimal value) {
        return getValue().compareTo(value) == 0;
    }

    public boolean valueEquals(double value) {
        return getValue().compareTo(new BigDecimal(value)) == 0;
    }
}
