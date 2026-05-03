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

import quickfix.CharField;

public class MoneyLaunderingStatus extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 481;
    public static final char PASSED = 'Y';
    public static final char NOT_CHECKED = 'N';
    public static final char EXEMPT_BELOW_THE_LIMIT = '1';
    public static final char EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION = '2';
    public static final char EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION = '3';
    
    public MoneyLaunderingStatus() {
        super(481);
    }

    public MoneyLaunderingStatus(char data) {
        super(481, data);
    }
}