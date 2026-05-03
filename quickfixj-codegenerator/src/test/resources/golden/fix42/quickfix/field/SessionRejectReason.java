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

public class SessionRejectReason extends IntField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 373;
    public static final int INVALID_TAG_NUMBER = 0;
    public static final int REQUIRED_TAG_MISSING = 1;
    public static final int TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE = 2;
    public static final int UNDEFINED_TAG = 3;
    public static final int TAG_SPECIFIED_WITHOUT_A_VALUE = 4;
    public static final int VALUE_IS_INCORRECT = 5;
    public static final int INCORRECT_DATA_FORMAT_FOR_VALUE = 6;
    public static final int DECRYPTION_PROBLEM = 7;
    public static final int SIGNATURE_PROBLEM = 8;
    public static final int COMPID_PROBLEM = 9;
    public static final int SENDINGTIME_ACCURACY_PROBLEM = 10;
    public static final int E = 11;
    
    public SessionRejectReason() {
        super(373);
    }

    public SessionRejectReason(int data) {
        super(373, data);
    }
}