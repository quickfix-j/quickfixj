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

public class ExecRestatementReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 378;
    public static final int GT_CORPORATE_ACTION = 0;
    public static final int GT_RENEWAL_RESTATEMENT = 1;
    public static final int VERBAL_CHANGE = 2;
    public static final int REPRICING_OF_ORDER = 3;
    public static final int BROKER_OPTION = 4;
    public static final int PARTIAL_DECLINE_OF_ORDERQTY = 5;
    public static final int CANCEL_ON_TRADING_HALT = 6;
    public static final int CANCEL_ON_SYSTEM_FAILURE = 7;
    public static final int MARKET_OPTION = 8;
    public static final int CANCELED_NOT_BEST = 9;
    public static final int WAREHOUSE_RECAP = 10;
    public static final int OTHER = 99;
    
    public ExecRestatementReason() {
        super(378);
    }

    public ExecRestatementReason(int data) {
        super(378, data);
    }
}