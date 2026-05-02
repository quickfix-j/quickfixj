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
    public static final String DO_NOT_INCREASE_DNI = "E";
    public static final String DO_NOT_REDUCE_DNR = "F";
    public static final String ALL_OR_NONE_AON = "G";
    public static final String INSTITUTIONS_ONLY = "I";
    public static final String LAST_PEG = "L";
    public static final String MIDPRICE_PEG = "M";
    public static final String NONNEGOTIABLE = "N";
    public static final String OPENING_PEG = "O";
    public static final String MARKET_PEG = "P";
    public static final String PRIMARY_PEG = "R";
    public static final String SUSPEND = "S";
    public static final String FIXED_PEG = "T";
    public static final String CUSTOMER_DISPLAY_INSTRUCTION = "U";
    public static final String NETTING = "V";
    public static final String PEG_TO_VWAP = "W";
    
    public ExecInst() {
        super(18);
    }

    public ExecInst(String data) {
        super(18, data);
    }
}