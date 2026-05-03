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

public class DiscretionInst extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 388;
    public static final char RELATED_TO_DISPLAYED_PRICE = '0';
    public static final char RELATED_TO_MARKET_PRICE = '1';
    public static final char RELATED_TO_PRIMARY_PRICE = '2';
    public static final char RELATED_TO_LOCAL_PRIMARY_PRICE = '3';
    public static final char RELATED_TO_MIDPOINT_PRICE = '4';
    public static final char RELATED_TO_LAST_TRADE_PRICE = '5';
    public static final char RELATED_TO_VWAP = '6';
    
    public DiscretionInst() {
        super(388);
    }

    public DiscretionInst(char data) {
        super(388, data);
    }
}