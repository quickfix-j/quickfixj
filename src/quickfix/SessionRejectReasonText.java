/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.util.HashMap;

import quickfix.field.SessionRejectReason;

class SessionRejectReasonText extends SessionRejectReason {
    private static HashMap rejectReasonText = new HashMap();
    
    static {
        rejectReasonText.put(new Integer(INVALID_TAG_NUMBER), "Invalid tag number");
        rejectReasonText.put(new Integer(REQUIRED_TAG_MISSING), "Required tag missing");
        rejectReasonText.put(new Integer(TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE), "Tag not defined for this message type");
        rejectReasonText.put(new Integer(UNDEFINED_TAG), "Undefined Tag");
        rejectReasonText.put(new Integer(TAG_SPECIFIED_WITHOUT_A_VALUE), "Tag specified without a value");
        rejectReasonText.put(new Integer(VALUE_IS_INCORRECT), "Value is incorrect (out of range) for this tag");
        rejectReasonText.put(new Integer(INCORRECT_DATA_FORMAT_FOR_VALUE), "Incorrect data format for value");
        rejectReasonText.put(new Integer(DECRYPTION_PROBLEM), "Decryption problem");
        rejectReasonText.put(new Integer(SIGNATURE_PROBLEM), "Signature problem");
        rejectReasonText.put(new Integer(COMPID_PROBLEM), "CompID problem");
        rejectReasonText.put(new Integer(SENDINGTIME_ACCURACY_PROBLEM), "SendingTime accuracy problem");
        rejectReasonText.put(new Integer(INVALID_MSGTYPE), "Invalid MsgType");
        rejectReasonText.put(new Integer(TAG_APPEARS_MORE_THAN_ONCE), "Tag appears more than once");
        rejectReasonText.put(new Integer(TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER), "Tag specified out of required order");
        rejectReasonText.put(new Integer(INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP), "Incorrect NumInGroup count for repeating group");

    }

    public static String getMessage(int sessionRejectReason) {
        return (String)rejectReasonText.get(new Integer(sessionRejectReason));
    }

}
