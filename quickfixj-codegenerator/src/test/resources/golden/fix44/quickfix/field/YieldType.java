/* Generated Java Source File */
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

package quickfix.field;

import quickfix.StringField;

public class YieldType extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 235;
    public static final String AFTER_TAX_YIELD = "AFTERTAX";
    public static final String ANNUAL_YIELD = "ANNUAL";
    public static final String YIELD_AT_ISSUE = "ATISSUE";
    public static final String YIELD_TO_AVERAGE_MATURITY = "AVGMATURITY";
    public static final String BOOK_YIELD = "BOOK";
    public static final String YIELD_TO_NEXT_CALL = "CALL";
    public static final String YIELD_CHANGE_SINCE_CLOSE = "CHANGE";
    public static final String CLOSING_YIELD = "CLOSE";
    public static final String COMPOUND_YIELD = "COMPOUND";
    public static final String CURRENT_YIELD = "CURRENT";
    public static final String TRUE_GROSS_YIELD = "GROSS";
    public static final String GOVERNMENT_EQUIVALENT_YIELD = "GOVTEQUIV";
    public static final String YIELD_WITH_INFLATION_ASSUMPTION = "INFLATION";
    public static final String INVERSE_FLOATER_BOND_YIELD = "INVERSEFLOATER";
    public static final String MOST_RECENT_CLOSING_YIELD = "LASTCLOSE";
    public static final String CLOSING_YIELD_MOST_RECENT_MONTH = "LASTMONTH";
    public static final String CLOSING_YIELD_MOST_RECENT_QUARTER = "LASTQUARTER";
    public static final String CLOSING_YIELD_MOST_RECENT_YEAR = "LASTYEAR";
    public static final String YIELD_TO_LONGEST_AVERAGE_LIFE = "LONGAVGLIFE";
    public static final String MARK_TO_MARKET_YIELD = "MARK";
    public static final String YIELD_TO_MATURITY = "MATURITY";
    public static final String YIELD_TO_NEXT_REFUND = "NEXTREFUND";
    public static final String OPEN_AVERAGE_YIELD = "OPENAVG";
    public static final String YIELD_TO_NEXT_PUT = "PUT";
    public static final String PREVIOUS_CLOSE_YIELD = "PREVCLOSE";
    public static final String PROCEEDS_YIELD = "PROCEEDS";
    public static final String SEMI_ANNUAL_YIELD = "SEMIANNUAL";
    public static final String YIELD_TO_SHORTEST_AVERAGE_LIFE = "SHORTAVGLIFE";
    public static final String SIMPLE_YIELD = "SIMPLE";
    public static final String TAX_EQUIVALENT_YIELD = "TAXEQUIV";
    public static final String YIELD_TO_TENDER_DATE = "TENDER";
    public static final String TRUE_YIELD = "TRUE";
    public static final String YIELD_VALUE_OF_1_32 = "VALUE1_32";
    public static final String YIELD_TO_WORST = "WORST";
    
    public YieldType() {
        super(235);
    }

    public YieldType(String data) {
        super(235, data);
    }
}