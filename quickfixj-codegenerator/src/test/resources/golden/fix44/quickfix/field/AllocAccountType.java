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

public class AllocAccountType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 798;
    public static final int ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = 1;
    public static final int ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = 2;
    public static final int HOUSE_TRADER = 3;
    public static final int FLOOR_TRADER = 4;
    public static final int ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = 6;
    public static final int ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = 7;
    public static final int JOINT_BACKOFFICE_ACCOUNT = 8;
    
    public AllocAccountType() {
        super(798);
    }

    public AllocAccountType(int data) {
        super(798, data);
    }
}