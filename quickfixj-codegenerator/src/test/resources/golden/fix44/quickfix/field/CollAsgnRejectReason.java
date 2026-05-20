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

public class CollAsgnRejectReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 906;
    public static final int UNKNOWN_DEAL = 0;
    public static final int UNKNOWN_OR_INVALID_INSTRUMENT = 1;
    public static final int UNAUTHORIZED_TRANSACTION = 2;
    public static final int INSUFFICIENT_COLLATERAL = 3;
    public static final int INVALID_TYPE_OF_COLLATERAL = 4;
    public static final int EXCESSIVE_SUBSTITUTION = 5;
    public static final int OTHER = 99;
    
    public CollAsgnRejectReason() {
        super(906);
    }

    public CollAsgnRejectReason(int data) {
        super(906, data);
    }
}