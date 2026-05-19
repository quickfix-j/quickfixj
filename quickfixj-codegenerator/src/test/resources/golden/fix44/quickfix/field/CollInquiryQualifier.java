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

public class CollInquiryQualifier extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 896;
    public static final int TRADEDATE = 0;
    public static final int GC_INSTRUMENT = 1;
    public static final int COLLATERALINSTRUMENT = 2;
    public static final int SUBSTITUTION_ELIGIBLE = 3;
    public static final int NOT_ASSIGNED = 4;
    public static final int PARTIALLY_ASSIGNED = 5;
    public static final int FULLY_ASSIGNED = 6;
    public static final int OUTSTANDING_TRADES = 7;
    
    public CollInquiryQualifier() {
        super(896);
    }

    public CollInquiryQualifier(int data) {
        super(896, data);
    }
}