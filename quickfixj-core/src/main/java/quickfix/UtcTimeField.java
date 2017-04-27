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

import java.time.LocalTime;

/**
 * A LocalTime-valued message field with up to nanosecond precision.
 */
public class UtcTimeField extends Field<LocalTime> {

    protected UtcTimestampPrecision precision = UtcTimestampPrecision.MILLIS;

    protected UtcTimeField(int field) {
        super(field, LocalTime.now());
    }

    protected UtcTimeField(int field, LocalTime data) {
        super(field, data);
    }

    protected UtcTimeField(int field, LocalTime data, UtcTimestampPrecision precision) {
        super(field, data);
        this.precision = precision;
    }

    public void setValue(LocalTime value) {
        setObject(value);
    }

    public LocalTime getValue() {
        return getObject();
    }

    public boolean valueEquals(LocalTime value) {
        return getValue().equals(value);
    }
    
    public UtcTimestampPrecision getPrecision() {
        return precision;
    }
}
