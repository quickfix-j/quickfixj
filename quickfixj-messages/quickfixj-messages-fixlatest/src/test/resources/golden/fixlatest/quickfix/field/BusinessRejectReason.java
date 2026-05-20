/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class BusinessRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 380;

  public static final int OTHER = 0;

  public static final int UNKNOWN_ID = 1;

  public static final int UNKNOWN_SECURITY = 2;

  public static final int UNSUPPORTED_MESSAGE_TYPE = 3;

  public static final int APPLICATION_NOT_AVAILABLE = 4;

  public static final int CONDITIONALLY_REQUIRED_FIELD_MISSING = 5;

  public static final int NOT_AUTHORIZED = 6;

  public static final int DELIVER_TO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = 7;

  public static final int THROTTLE_LIMIT_EXCEEDED = 8;

  public static final int THROTTLE_LIMIT_EXCEEDED_SESSION_DISCONNECTED = 9;

  public static final int THROTTLED_MESSAGES_REJECTED_ON_REQUEST = 10;

  public static final int INVALID_PRICE_INCREMENT = 18;

  public BusinessRejectReason() {
    super(380);
  }

  public BusinessRejectReason(Integer data) {
    super(380, data);
  }

  public BusinessRejectReason(int data) {
    super(380, data);
  }
}
