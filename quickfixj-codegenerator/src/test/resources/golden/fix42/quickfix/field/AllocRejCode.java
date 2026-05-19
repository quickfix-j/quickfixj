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

public class AllocRejCode extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 88;
    public static final int UNKNOWN_ACCOUNT = 0;
    public static final int INCORRECT_QUANTITY = 1;
    public static final int INCORRECT_AVERAGE_PRICE = 2;
    public static final int UNKNOWN_EXECUTING_BROKER_MNEMONIC = 3;
    public static final int COMMISSION_DIFFERENCE = 4;
    public static final int UNKNOWN_ORDERID = 5;
    public static final int UNKNOWN_LISTID = 6;
    public static final int OTHER = 7;
    
    public AllocRejCode() {
        super(88);
    }

    public AllocRejCode(int data) {
        super(88, data);
    }
}