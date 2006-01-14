package quickfix;

import java.util.HashMap;

import quickfix.field.BusinessRejectReason;

public class BusinessRejectReasonText extends BusinessRejectReason {
    private static HashMap rejectReasonText = new HashMap();
    
    static {
        rejectReasonText.put(new Integer(FIELD), "Field");
        rejectReasonText.put(new Integer(OTHER), "Other");
        rejectReasonText.put(new Integer(UNKOWN_ID), "Unknown ID");
        rejectReasonText.put(new Integer(UNKNOWN_SECURITY), "Unknown Security");
        rejectReasonText.put(new Integer(UNSUPPORTED_MESSAGE_TYPE), "Unsupported Message Type");
        rejectReasonText.put(new Integer(APPLICATION_NOT_AVAILABLE), "Application Not Available");
        rejectReasonText.put(new Integer(CONDITIONALLY_REQUIRED_FIELD_MISSING), "Conditionally Required Field Missing");
        rejectReasonText.put(new Integer(NOT_AUTHORIZED), "Not authorized");
        rejectReasonText.put(new Integer(DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME), "DeliverTo Firm Not Available At This Time");

    }

    public static String getMessage(int rejectReason) {
        return (String)rejectReasonText.get(new Integer(rejectReason));
    }
    
}
