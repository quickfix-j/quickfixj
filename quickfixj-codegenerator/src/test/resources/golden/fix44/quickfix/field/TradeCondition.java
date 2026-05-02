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

public class TradeCondition extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 277;
    public static final String CASH_MARKET = "A";
    public static final String AVERAGE_PRICE_TRADE = "B";
    public static final String CASH_TRADE = "C";
    public static final String NEXT_DAY_MARKET = "D";
    public static final String OPENING_REOPENING_TRADE_DETAIL = "E";
    public static final String INTRADAY_TRADE_DETAIL = "F";
    public static final String RULE127 = "G";
    public static final String RULE155 = "H";
    public static final String SOLD_LAST = "I";
    public static final String NEXT_DAY_TRADE = "J";
    public static final String OPENED = "K";
    public static final String SELLER = "L";
    public static final String SOLD = "M";
    public static final String STOPPED_STOCK = "N";
    public static final String IMBALANCE_MORE_BUYERS = "P";
    public static final String IMBALANCE_MORE_SELLERS = "Q";
    public static final String OPENING_PRICE = "R";
    
    public TradeCondition() {
        super(277);
    }

    public TradeCondition(String data) {
        super(277, data);
    }
}