/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CxlRejReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 102;

  public static final int TOO_LATE_TO_CANCEL = 0;

  public static final int UNKNOWN_ORDER = 1;

  public static final int BROKER_CREDIT = 2;

  public static final int ORDER_ALREADY_IN_PENDING_STATUS = 3;

  public static final int UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST = 4;

  public static final int ORIG_ORD_MOD_TIME = 5;

  public static final int DUPLICATE_CL_ORD_ID = 6;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE = 7;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND = 8;

  public static final int INVALID_PRICE_INCREMENT = 18;

  public static final int OTHER = 99;

  public CxlRejReason() {
    super(102);
  }

  public CxlRejReason(Integer data) {
    super(102, data);
  }

  public CxlRejReason(int data) {
    super(102, data);
  }
}
