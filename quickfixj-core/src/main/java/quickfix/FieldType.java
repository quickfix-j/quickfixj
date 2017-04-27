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
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * A field type enum class.
 */
public enum FieldType {

    UNKNOWN,
    STRING,
    CHAR,
    PRICE(Double.class),
    INT(Integer.class),
    AMT(Double.class),
    QTY(Double.class),
    CURRENCY,
    MULTIPLEVALUESTRING,
    MULTIPLESTRINGVALUE, // QFJ-881
    EXCHANGE,
    UTCTIMESTAMP(LocalDateTime.class),
    BOOLEAN(Boolean.class),
    LOCALMKTDATE,
    DATA,
    FLOAT(Double.class),
    PRICEOFFSET(Double.class),
    MONTHYEAR,
    DAYOFMONTH(Integer.class),
    UTCDATEONLY(LocalDate.class),
    UTCDATE(LocalDate.class),
    UTCTIMEONLY(LocalTime.class),
    TIME,
    NUMINGROUP(Integer.class),
    PERCENTAGE(Double.class),
    SEQNUM(Integer.class),
    LENGTH(Integer.class),
    COUNTRY;

    private final Class<?> javaType;

    FieldType(Class<?> javaType) {
        this.javaType = javaType;
    }

    FieldType() {
        this(String.class);
    }

    public Class<?> getJavaType() {
        return javaType;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + name() + "," + javaType + "," + ordinal() + "]";
    }

    public static FieldType fromName(String fixVersion, String name) {
        try {
            return FieldType.valueOf(name);
        } catch (IllegalArgumentException iae) {
            return UNKNOWN;
        }
    }
}
