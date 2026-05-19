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

public class ListExecInstType extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 433;
    public static final char IMMEDIATE = '1';
    public static final char WAIT_FOR_EXECUTE_INSTRUCTION = '2';
    public static final char EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN = '3';
    public static final char EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP = '4';
    public static final char EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW = '5';
    
    public ListExecInstType() {
        super(433);
    }

    public ListExecInstType(char data) {
        super(433, data);
    }
}