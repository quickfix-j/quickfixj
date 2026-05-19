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

public class CustOrderCapacity extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 582;
    public static final int MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = 1;
    public static final int CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = 2;
    public static final int MEMBER_TRADING_FOR_ANOTHER_MEMBER = 3;
    public static final int ALL_OTHER = 4;
    
    public CustOrderCapacity() {
        super(582);
    }

    public CustOrderCapacity(int data) {
        super(582, data);
    }
}