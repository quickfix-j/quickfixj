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

public class Side extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 54;
    public static final char BUY = '1';
    public static final char SELL = '2';
    public static final char BUY_MINUS = '3';
    public static final char SELL_PLUS = '4';
    public static final char SELL_SHORT = '5';
    public static final char SELL_SHORT_EXEMPT = '6';
    public static final char UNDISCLOSED = '7';
    public static final char CROSS = '8';
    public static final char CROSS_SHORT = '9';
    public static final char CROSS_SHORT_EXEMPT = 'A';
    public static final char AS_DEFINED = 'B';
    public static final char OPPOSITE = 'C';
    public static final char SUBSCRIBE = 'D';
    public static final char REDEEM = 'E';
    public static final char LEND = 'F';
    public static final char BORROW = 'G';
    
    public Side() {
        super(54);
    }

    public Side(char data) {
        super(54, data);
    }
}