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

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * A timestamp-valued message field (a timestamp has both a date and a time).
 */
public class UtcTimeStampField extends Field<LocalDateTime> {

    private UtcTimestampPrecision precision = getDefaultUtcTimestampPrecision();

    public UtcTimeStampField(int field) {
        super(field, LocalDateTime.now(ZoneOffset.UTC));
    }

    protected UtcTimeStampField(int field, LocalDateTime data) {
        super(field, data);
    }

    protected UtcTimeStampField(int field, LocalDateTime data, UtcTimestampPrecision precision) {
        super(field, data);
        this.precision = precision;
    }

    public UtcTimeStampField(int field, boolean includeMilliseconds) {
        super(field, LocalDateTime.now(ZoneOffset.UTC));
        this.precision = includeMilliseconds ? UtcTimestampPrecision.MILLIS : UtcTimestampPrecision.SECONDS;
    }

    public UtcTimeStampField(int field, UtcTimestampPrecision precision) {
        super(field, LocalDateTime.now(ZoneOffset.UTC));
        this.precision = precision;
    }

    protected UtcTimeStampField(int field, LocalDateTime data, boolean includeMilliseconds) {
        super(field, data);
        this.precision = includeMilliseconds ? UtcTimestampPrecision.MILLIS : UtcTimestampPrecision.SECONDS;
    }
    
    public UtcTimestampPrecision getPrecision() {
        return precision;
    }
    
    public void setValue(LocalDateTime value) {
        setObject(value);
    }

    public LocalDateTime getValue() {
        return getObject();
    }

    public boolean valueEquals(LocalDateTime value) {
        return getValue().equals(value);
    }

    protected UtcTimestampPrecision getDefaultUtcTimestampPrecision() {
        return UtcTimestampPrecision.MILLIS;
    }
}
