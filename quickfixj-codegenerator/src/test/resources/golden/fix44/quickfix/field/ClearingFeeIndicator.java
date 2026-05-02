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

import quickfix.StringField;

public class ClearingFeeIndicator extends StringField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 635;
    public static final String CBOE_MEMBER = "B";
    public static final String NON_MEMBER_AND_CUSTOMER = "C";
    public static final String EQUITY_MEMBER_AND_CLEARING_MEMBER = "E";
    public static final String FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS = "F";
    public static final String FIRMS_106H_AND_106J = "H";
    public static final String GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS = "I";
    public static final String LESSEE_AND_106F_EMPLOYEES = "L";
    public static final String ALL_OTHER_OWNERSHIP_TYPES = "M";
    
    public ClearingFeeIndicator() {
        super(635);
    }

    public ClearingFeeIndicator(String data) {
        super(635, data);
    }
}