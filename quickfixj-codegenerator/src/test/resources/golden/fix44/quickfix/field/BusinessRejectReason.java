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

public class BusinessRejectReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 380;
    public static final int OTHER = 0;
    public static final int UNKOWN_ID = 1;
    public static final int UNKNOWN_SECURITY = 2;
    public static final int UNSUPPORTED_MESSAGE_TYPE = 3;
    public static final int APPLICATION_NOT_AVAILABLE = 4;
    public static final int CONDITIONALLY_REQUIRED_FIELD_MISSING = 5;
    public static final int NOT_AUTHORIZED = 6;
    public static final int DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = 7;
    
    public BusinessRejectReason() {
        super(380);
    }

    public BusinessRejectReason(int data) {
        super(380, data);
    }
}