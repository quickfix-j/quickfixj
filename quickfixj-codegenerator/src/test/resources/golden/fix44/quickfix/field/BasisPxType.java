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

import quickfix.CharField;

public class BasisPxType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 419;
    public static final char CLOSING_PRICE_AT_MORNING_SESSION = '2';
    public static final char CLOSING_PRICE = '3';
    public static final char CURRENT_PRICE = '4';
    public static final char SQ = '5';
    public static final char VWAP_THROUGH_A_DAY = '6';
    public static final char VWAP_THROUGH_A_MORNING_SESSION = '7';
    public static final char VWAP_THROUGH_AN_AFTERNOON_SESSION = '8';
    public static final char VWAP_THROUGH_A_DAY_EXCEPT_YORI = '9';
    public static final char VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI = 'A';
    public static final char VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI = 'B';
    public static final char STRIKE = 'C';
    public static final char OPEN = 'D';
    public static final char OTHERS = 'Z';
    
    public BasisPxType() {
        super(419);
    }

    public BasisPxType(char data) {
        super(419, data);
    }
}