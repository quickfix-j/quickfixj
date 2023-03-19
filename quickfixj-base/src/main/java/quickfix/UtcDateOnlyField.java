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

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

/**
 * A date-valued message field.
 */
public class UtcDateOnlyField extends Field<LocalDate> {

    public static final DateTimeFormatter UTC_DATE_ONLY_FORMATTER;
    static {
        UTC_DATE_ONLY_FORMATTER = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendValue(YEAR, 4)
                .appendValue(MONTH_OF_YEAR, 2)
                .appendValue(DAY_OF_MONTH, 2)
                .toFormatter();
    }

    public UtcDateOnlyField(int field) {
        super(field, LocalDate.now(ZoneOffset.UTC));
    }

    protected UtcDateOnlyField(int field, LocalDate data) {
        super(field, data);
    }
    
    protected UtcDateOnlyField(int field, String data) {
        super(field, LocalDate.parse(data, UTC_DATE_ONLY_FORMATTER));
    }
            
    public void setValue(LocalDate value) {
        setObject(value);
    }

    public LocalDate getValue() {
        return getObject();
    }

    public boolean valueEquals(LocalDate value) {
        return getValue().equals(value);
    }

}
