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

public class PaymentMethod extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 492;
    public static final int CREST = 1;
    public static final int NSCC = 2;
    public static final int EUROCLEAR = 3;
    public static final int CLEARSTREAM = 4;
    public static final int CHEQUE = 5;
    public static final int TELEGRAPHIC_TRANSFER = 6;
    public static final int FEDWIRE = 7;
    public static final int DEBIT_CARD = 8;
    public static final int DIRECT_DEBIT = 9;
    public static final int DIRECT_CREDIT = 10;
    public static final int CREDIT_CARD = 11;
    public static final int ACH_DEBIT = 12;
    public static final int ACH_CREDIT = 13;
    public static final int BPAY = 14;
    public static final int HIGH_VALUE_CLEARING_SYSTEM = 15;
    
    public PaymentMethod() {
        super(492);
    }

    public PaymentMethod(int data) {
        super(492, data);
    }
}