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
import java.time.ZoneOffset;

/*
 * A time-valued message field.
 */
public class UtcTimeOnlyField extends Field<LocalTime> {
    
    private UtcTimestampPrecision precision = UtcTimestampPrecision.MILLIS;

    public UtcTimeOnlyField(int field) {
        super(field, LocalTime.now(ZoneOffset.UTC));
    }

    protected UtcTimeOnlyField(int field, LocalTime data) {
        super(field, data);
    }

    protected UtcTimeOnlyField(int field, LocalTime data, UtcTimestampPrecision precision) {
        super(field, data);
        this.precision = precision;
    }

    public UtcTimeOnlyField(int field, boolean includeMilliseconds) {
        super(field, LocalTime.now(ZoneOffset.UTC));
        this.precision = includeMilliseconds ? UtcTimestampPrecision.MILLIS : UtcTimestampPrecision.SECONDS;
    }

    protected UtcTimeOnlyField(int field, LocalTime data, boolean includeMilliseconds) {
        super(field, data);
        this.precision = includeMilliseconds ? UtcTimestampPrecision.MILLIS : UtcTimestampPrecision.SECONDS;
    }
    
    public UtcTimestampPrecision getPrecision() {
        return precision;
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

}
