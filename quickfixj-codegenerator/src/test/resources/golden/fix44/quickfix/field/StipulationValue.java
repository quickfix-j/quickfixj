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

public class StipulationValue extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 234;
    public static final String SPECIAL_CUM_DIVIDEND = "CD";
    public static final String SPECIAL_EX_DIVIDEND = "XD";
    public static final String SPECIAL_CUM_COUPON = "CC";
    public static final String SPECIAL_EX_COUPON = "XC";
    public static final String SPECIAL_CUM_BONUS = "CB";
    public static final String SPECIAL_EX_BONUS = "XB";
    public static final String SPECIAL_CUM_RIGHTS = "CR";
    public static final String SPECIAL_EX_RIGHTS = "XR";
    public static final String SPECIAL_CUM_CAPITAL_REPAYMENTS = "CP";
    public static final String SPECIAL_EX_CAPITAL_REPAYMENTS = "XP";
    public static final String CASH_SETTLEMENT = "CS";
    public static final String SPECIAL_PRICE = "SP";
    public static final String REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES = "TR";
    public static final String GUARANTEED_DELIVERY = "GD";
    
    public StipulationValue() {
        super(234);
    }

    public StipulationValue(String data) {
        super(234, data);
    }
}