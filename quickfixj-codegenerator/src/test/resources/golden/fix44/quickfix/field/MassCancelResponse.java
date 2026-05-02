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

public class MassCancelResponse extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 531;
    public static final char CANCEL_REQUEST_REJECTED = '0';
    public static final char CANCEL_ORDERS_FOR_A_SECURITY = '1';
    public static final char CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = '2';
    public static final char CANCEL_ORDERS_FOR_A_PRODUCT = '3';
    public static final char CANCEL_ORDERS_FOR_A_CFICODE = '4';
    public static final char CANCEL_ORDERS_FOR_A_SECURITYTYPE = '5';
    public static final char CANCEL_ORDERS_FOR_A_TRADING_SESSION = '6';
    public static final char CANCEL_ALL_ORDERS = '7';
    
    public MassCancelResponse() {
        super(531);
    }

    public MassCancelResponse(char data) {
        super(531, data);
    }
}