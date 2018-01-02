package quickfix;

public class ErrorEventReasons {
    public static final String MULTIPLE_LOGONS = "MULTIPLE_LOGONS";
    public static final String GET_NEXT_SEQ_NUM_FAILURE = "GET_NEXT_SEQ_NUM_FAILURE";
    public static final String GARBLED_MESSAGE = "GARBLED_MESSAGE";
    public static final String SKIPPING_INVALID_MESSAGE = "SKIPPING_INVALID_MESSAGE";
    public static final String LOGON_REJECTED = "LOGON_REJECTED";
    public static final String REQUIRED_FIELD_MISSING = "REQUIRED_FIELD_MISSING";
    public static final String DISCONNECT_FOLLOWING_ERROR = "DISCONNECT_FOLLOWING_ERROR";
    public static final String REJECTING_INVALID_MESSAGE = "REJECTING_INVALID_MESSAGE";
    public static final String INVALID_MESSAGE = "INVALID_MESSAGE";
    public static final String RESETTING_ON_ERROR = "RESETTING_ON_ERROR";
    public static final String MESSAGE_MISSING_MSGSEQNUM = "MESSAGE_MISSING_MSGSEQNUM";
    public static final String INVALID_SEQUENCE_RESET = "INVALID_SEQUENCE_RESET";
    public static final String VERIFY_FAILED = "VERIFY_FAILED";
    public static final String LOGON_REQUEST_FAILURE = "LOGON_REQUEST_FAILURE";
    public static final String SENDING_REJECT = "SENDING_REJECT";
    public static final String SENDING_BUSINESS_REJECT = "SENDING_BUSINESS_REJECT";
    public static final String RESEND_REQUEST_PARSER_FAILURE = "RESEND_REQUEST_PARSER_FAILURE";
    public static final String RESEND_REQUEST_SEND_FAILURE = "RESEND_REQUEST_SEND_FAILURE";
    public static final String CONNECTION_FAILED = "CONNECTION_FAILED";
    public static final String REFRESH_UNSUPPORTED = "REFRESH_UNSUPPORTED";
    public static final String FAILED_TO_QUEUE_MESSAGE = "FAILED_TO_QUEUE_MESSAGE";
    public static final String FAILED_TO_CREATE_SESSION = "FAILED_TO_CREATE_SESSION";
    public static final String APPLICATION_ERROR = "APPLICATION_ERROR";
    public static final String IO_ERROR = "IO_ERROR";
    public static final String MESSAGE_PROCESSOR_ERROR = "MESSAGE_PROCESSOR_ERROR";
    public static final String MESSAGE_DISPATCHER_ERROR = "MESSAGE_DISPATCHER_ERROR";
}
