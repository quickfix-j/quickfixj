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

public class RegistRejReasonCode extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 507;
    public static final int INVALID_UNACCEPTABLE_ACCOUNT_TYPE = 1;
    public static final int INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE = 2;
    public static final int INVALID_UNACCEPTABLE_OWNERSHIP_TYPE = 3;
    public static final int INVALID_UNACCEPTABLE_NO_REG_DETLS = 4;
    public static final int INVALID_UNACCEPTABLE_REG_SEQ_NO = 5;
    public static final int INVALID_UNACCEPTABLE_REG_DTLS = 6;
    public static final int INVALID_UNACCEPTABLE_MAILING_DTLS = 7;
    public static final int INVALID_UNACCEPTABLE_MAILING_INST = 8;
    public static final int INVALID_UNACCEPTABLE_INVESTOR_ID = 9;
    public static final int INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE = 10;
    public static final int INVALID_UNACCEPTABLE_DATE_OF_BIRTH = 11;
    public static final int INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE = 12;
    public static final int INVALID_UNACCEPTABLE_NODISTRIBINSTNS = 13;
    public static final int INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE = 14;
    public static final int INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD = 15;
    public static final int INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME = 16;
    public static final int INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE = 17;
    public static final int INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM = 18;
    public static final int OTHER = 99;
    
    public RegistRejReasonCode() {
        super(507);
    }

    public RegistRejReasonCode(int data) {
        super(507, data);
    }
}