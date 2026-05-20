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

public class ClearingInstruction extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 577;
    public static final int PROCESS_NORMALLY = 0;
    public static final int EXCLUDE_FROM_ALL_NETTING = 1;
    public static final int BILATERAL_NETTING_ONLY = 2;
    public static final int EX_CLEARING = 3;
    public static final int SPECIAL_TRADE = 4;
    public static final int MULTILATERAL_NETTING = 5;
    public static final int CLEAR_AGAINST_CENTRAL_COUNTERPARTY = 6;
    public static final int EXCLUDE_FROM_CENTRAL_COUNTERPARTY = 7;
    public static final int MANUAL_MODE = 8;
    public static final int AUTOMATIC_POSTING_MODE = 9;
    public static final int AUTOMATIC_GIVE_UP_MODE = 10;
    public static final int QUALIFIED_SERVICE_REPRESENTATIVE = 11;
    public static final int CUSTOMER_TRADE = 12;
    public static final int SELF_CLEARING = 13;
    
    public ClearingInstruction() {
        super(577);
    }

    public ClearingInstruction(int data) {
        super(577, data);
    }
}