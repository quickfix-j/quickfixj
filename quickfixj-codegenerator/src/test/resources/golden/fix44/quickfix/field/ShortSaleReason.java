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

public class ShortSaleReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 853;
    public static final int DEALER_SOLD_SHORT = 0;
    public static final int DEALER_SOLD_SHORT_EXEMPT = 1;
    public static final int SELLING_CUSTOMER_SOLD_SHORT = 2;
    public static final int SELLING_CUSTOMER_SOLD_SHORT_EXEMPT = 3;
    public static final int QUALIFED_SERVICE_REPRESENTATIVE_OR_AUTOMATIC_GIVEUP_CONTRA_SIDE_SOLD_SHORT = 4;
    public static final int QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT = 5;
    
    public ShortSaleReason() {
        super(853);
    }

    public ShortSaleReason(int data) {
        super(853, data);
    }
}