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

public class OwnerType extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 522;
    public static final int INDIVIDUAL_INVESTOR = 1;
    public static final int PUBLIC_COMPANY = 2;
    public static final int PRIVATE_COMPANY = 3;
    public static final int INDIVIDUAL_TRUSTEE = 4;
    public static final int COMPANY_TRUSTEE = 5;
    public static final int PENSION_PLAN = 6;
    public static final int CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT = 7;
    public static final int TRUSTS = 8;
    public static final int FIDUCIARIES = 9;
    public static final int NETWORKING_SUB_ACCOUNT = 10;
    public static final int NON_PROFIT_ORGANIZATION = 11;
    public static final int CORPORATE_BODY = 12;
    public static final int NOMINEE = 13;
    
    public OwnerType() {
        super(522);
    }

    public OwnerType(int data) {
        super(522, data);
    }
}