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

public class ContAmtType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 519;
    public static final int COMMISSION_AMOUNT = 1;
    public static final int COMMISSION_PERCENT = 2;
    public static final int INITIAL_CHARGE_AMOUNT = 3;
    public static final int INITIAL_CHARGE_PERCENT = 4;
    public static final int DISCOUNT_AMOUNT = 5;
    public static final int DISCOUNT_PERCENT = 6;
    public static final int DILUTION_LEVY_AMOUNT = 7;
    public static final int DILUTION_LEVY_PERCENT = 8;
    public static final int EXIT_CHARGE_AMOUNT = 9;
    
    public ContAmtType() {
        super(519);
    }

    public ContAmtType(int data) {
        super(519, data);
    }
}