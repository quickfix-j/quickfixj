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

import quickfix.IntField;

public class TradeRequestResult extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 749;
    public static final int SUCCESSFUL = 0;
    public static final int INVALID_OR_UNKNOWN_INSTRUMENT = 1;
    public static final int INVALID_TYPE_OF_TRADE_REQUESTED = 2;
    public static final int INVALID_PARTIES = 3;
    public static final int INVALID_TRANSPORT_TYPE_REQUESTED = 4;
    public static final int INVALID_DESTINATION_REQUESTED = 5;
    public static final int TRADEREQUESTTYPE_NOT_SUPPORTED = 8;
    public static final int UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST = 9;
    public static final int OTHER = 99;
    
    public TradeRequestResult() {
        super(749);
    }

    public TradeRequestResult(int data) {
        super(749, data);
    }
}