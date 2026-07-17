/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderEventReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1798;

  public static final int ADD_ORDER_REQUEST = 1;

  public static final int MODIFY_ORDER_REQUEST = 2;

  public static final int DELETE_ORDER_REQUEST = 3;

  public static final int ORDER_ENTERED_OOB = 4;

  public static final int ORDER_MODIFIED_OOB = 5;

  public static final int ORDER_DELETED_OOB = 6;

  public static final int ORDER_ACTIVATED_OR_TRIGGERED = 7;

  public static final int ORDER_EXPIRED = 8;

  public static final int RESERVE_ORDER_REFRESHED = 9;

  public static final int AWAY_MARKET_BETTER = 10;

  public static final int CORPORATE_ACTION = 11;

  public static final int START_OF_DAY = 12;

  public static final int END_OF_DAY = 13;

  public OrderEventReason() {
    super(1798);
  }

  public OrderEventReason(Integer data) {
    super(1798, data);
  }

  public OrderEventReason(int data) {
    super(1798, data);
  }
}
