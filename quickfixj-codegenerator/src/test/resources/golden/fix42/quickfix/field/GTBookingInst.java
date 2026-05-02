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

public class GTBookingInst extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 427;
    public static final int BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION = 0;
    public static final int ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES = 1;
    public static final int ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE = 2;
    
    public GTBookingInst() {
        super(427);
    }

    public GTBookingInst(int data) {
        super(427, data);
    }
}