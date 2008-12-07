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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * A field type enum class. 
 */
public class FieldType {
    private int ordinal;
    private String name;
    private Class<?> javaType;
    private static HashMap<String, FieldType> values = new HashMap<String, FieldType>();
    private static ArrayList<FieldType> ordinalToValue = new ArrayList<FieldType>();

    private FieldType(String name) {
        this(name, String.class);
    }

    private FieldType(String name, Class<?> javaType) {
        this.javaType = javaType;
        this.name = name;
        ordinal = ordinalToValue.size();
        ordinalToValue.add(this);
        values.put(name, this);
    }

    public String getName() {
        return name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public Class<?> getJavaType() {
        return javaType;
    }
    
    public static FieldType fromOrdinal(int ordinal) {
        if (ordinal < 0 || ordinal >= ordinalToValue.size()) {
            throw new RuntimeError("invalid field type ordinal: " + ordinal);
        }
        return ordinalToValue.get(ordinal);
    }

    public static FieldType fromName(String fixVersion, String name) {
        FieldType type = values.get(name);
        return type != null ? type : FieldType.Unknown;
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + getName() + "," + getJavaType() + "," + getOrdinal() + "]";
    }


    public final static FieldType Unknown = new FieldType("UNKNOWN");
    public final static FieldType String = new FieldType("STRING");
    public final static FieldType Char = new FieldType("CHAR");
    public final static FieldType Price = new FieldType("PRICE", Double.class);
    public final static FieldType Int = new FieldType("INT", Integer.class);
    public final static FieldType Amt = new FieldType("AMT", Double.class);
    public final static FieldType Qty = new FieldType("QTY", Double.class);
    public final static FieldType Currency = new FieldType("CURRENCY");
    public final static FieldType MultipleValueString = new FieldType("MULTIPLEVALUESTRING");
    public final static FieldType Exchange = new FieldType("EXCHANGE");
    public final static FieldType UtcTimeStamp = new FieldType("UTCTIMESTAMP", Date.class);
    public final static FieldType Boolean = new FieldType("BOOLEAN", Boolean.class);
    public final static FieldType LocalMktDate = new FieldType("LOCALMKTDATE");
    public final static FieldType Data = new FieldType("DATA");
    public final static FieldType Float = new FieldType("FLOAT", Double.class);
    public final static FieldType PriceOffset = new FieldType("PRICEOFFSET", Double.class);
    public final static FieldType MonthYear = new FieldType("MONTHYEAR");
    public final static FieldType DayOfMonth = new FieldType("DAYOFMONTH", Integer.class);
    public final static FieldType UtcDateOnly = new FieldType("UTCDATEONLY", Date.class);
    public final static FieldType UtcDate = new FieldType("UTCDATE", Date.class);
    public final static FieldType UtcTimeOnly = new FieldType("UTCTIMEONLY", Date.class);
    public final static FieldType Time = new FieldType("TIME");
    public final static FieldType NumInGroup = new FieldType("NUMINGROUP", Integer.class);
    public final static FieldType Percentage = new FieldType("PERCENTAGE", Double.class);
    public final static FieldType SeqNum = new FieldType("SEQNUM", Integer.class);
    public final static FieldType Length = new FieldType("LENGTH", Integer.class);
    public final static FieldType Country = new FieldType("COUNTRY");

}