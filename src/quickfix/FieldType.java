/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.util.HashMap;

public class FieldType {
    private String name;
    private static HashMap values = new HashMap();

    private FieldType(String name) {
        this.name = name;
        values.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static FieldType fromName(String fixVersion, String name) {
        FieldType type = (FieldType) values.get(name);
        // TODO review the spec about this Char->String conversion 
//        if ( fixVersion.compareTo(FixVersions.BEGINSTRING_FIX42) == -1 && type == FieldType.Char ) {
//            type = FieldType.String;
//        }
        return type != null ? type : FieldType.Unknown;
    }

    public final static FieldType Unknown = new FieldType("UNKNOWN");
    public final static FieldType String = new FieldType("STRING");
    public final static FieldType Char = new FieldType("CHAR");
    public final static FieldType Price = new FieldType("PRICE");
    public final static FieldType Int = new FieldType("INT");
    public final static FieldType Amt = new FieldType("AMT");
    public final static FieldType Qty = new FieldType("QTY");
    public final static FieldType Currency = new FieldType("CURRENCY");
    public final static FieldType MultipleValueString = new FieldType("MULTIPLEVALUESTRING");
    public final static FieldType Exchange = new FieldType("EXCHANGE");
    public final static FieldType UtcTimeStamp = new FieldType("UTCTIMESTAMP");
    public final static FieldType Boolean = new FieldType("BOOLEAN");
    public final static FieldType LocalMktDate = new FieldType("LOCALMKTDATE");
    public final static FieldType Data = new FieldType("DATA");
    public final static FieldType Float = new FieldType("FLOAT");
    public final static FieldType PriceOffset = new FieldType("PRICEOFFSET");
    public final static FieldType MonthYear = new FieldType("MONTHYEAR");
    public final static FieldType DayOfMonth = new FieldType("DAYOFMONTH");
    public final static FieldType UtcDateOnly = new FieldType("UTCDATEONLY");
    public final static FieldType UtcDate = new FieldType("UTCDATEONLY");
    public final static FieldType UtcTimeOnly = new FieldType("UTCTIMEONLY");
    public final static FieldType NumInGroup = new FieldType("NUMINGROUP");
    public final static FieldType Percentage = new FieldType("PERCENTAGE");
    public final static FieldType SeqNum = new FieldType("SEQNUM");
    public final static FieldType Length = new FieldType("LENGTH");
    public final static FieldType Country = new FieldType("COUNTRY");

}