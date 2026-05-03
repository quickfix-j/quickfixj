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

public class ExecInst extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 18;
    public static final String NOT_HELD = "1";
    public static final String WORK = "2";
    public static final String GO_ALONG = "3";
    public static final String OVER_THE_DAY = "4";
    public static final String HELD = "5";
    public static final String PARTICIPATE_DONT_INITIATE = "6";
    public static final String STRICT_SCALE = "7";
    public static final String TRY_TO_SCALE = "8";
    public static final String STAY_ON_BIDSIDE = "9";
    public static final String STAY_ON_OFFERSIDE = "0";
    public static final String NO_CROSS = "A";
    public static final String OK_TO_CROSS = "B";
    public static final String CALL_FIRST = "C";
    public static final String PERCENT_OF_VOLUME = "D";
    public static final String DO_NOT_INCREASE = "E";
    public static final String DO_NOT_REDUCE = "F";
    public static final String ALL_OR_NONE = "G";
    public static final String REINSTATE_ON_SYSTEM_FAILURE = "H";
    public static final String INSTITUTIONS_ONLY = "I";
    public static final String REINSTATE_ON_TRADING_HALT = "J";
    public static final String CANCEL_ON_TRADING_HALT = "K";
    public static final String LAST_PEG = "L";
    public static final String MID_PRICE = "M";
    public static final String NON_NEGOTIABLE = "N";
    public static final String OPENING_PEG = "O";
    public static final String MARKET_PEG = "P";
    public static final String CANCEL_ON_SYSTEM_FAILURE = "Q";
    public static final String PRIMARY_PEG = "R";
    public static final String SUSPEND = "S";
    public static final String FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = "T";
    public static final String CUSTOMER_DISPLAY_INSTRUCTION = "U";
    public static final String NETTING = "V";
    public static final String PEG_TO_VWAP = "W";
    public static final String TRADE_ALONG = "X";
    public static final String TRY_TO_STOP = "Y";
    public static final String CANCEL_IF_NOT_BEST = "Z";
    public static final String TRAILING_STOP_PEG = "a";
    public static final String STRICT_LIMIT = "b";
    public static final String IGNORE_PRICE_VALIDITY_CHECKS = "c";
    public static final String PEG_TO_LIMIT_PRICE = "d";
    public static final String WORK_TO_TARGET_STRATEGY = "e";
    
    public ExecInst() {
        super(18);
    }

    public ExecInst(String data) {
        super(18, data);
    }
}