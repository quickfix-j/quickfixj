/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ListRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1386;

  public static final int BROKER_CREDIT = 0;

  public static final int EXCHANGE_CLOSED = 2;

  public static final int TOO_LATE_TO_ENTER = 4;

  public static final int UNKNOWN_ORDER = 5;

  public static final int DUPLICATE_ORDER = 6;

  public static final int UNSUPPORTED_ORDER_CHARACTERISTIC = 11;

  public static final int OTHER = 99;

  public ListRejectReason() {
    super(1386);
  }

  public ListRejectReason(Integer data) {
    super(1386, data);
  }

  public ListRejectReason(int data) {
    super(1386, data);
  }
}
