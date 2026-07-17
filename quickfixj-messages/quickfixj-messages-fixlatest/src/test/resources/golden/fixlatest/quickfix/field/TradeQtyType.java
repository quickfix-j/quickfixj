/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeQtyType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1842;

  public static final int CLEARED_QUANTITY = 0;

  public static final int LONG_SIDE_CLAIMED_QUANTITY = 1;

  public static final int SHORT_SIDE_CLAIMED_QUANTITY = 2;

  public static final int LONG_SIDE_REJECTED_QUANTITY = 3;

  public static final int SHORT_SIDE_REJECTED_QUANTITY = 4;

  public static final int PENDING_QUANTITY = 5;

  public static final int TRANSACTION_QUANTITY = 6;

  public static final int REMAINING_QUANTITY = 7;

  public static final int PREVIOUS_REMAINING_QUANTITY = 8;

  public TradeQtyType() {
    super(1842);
  }

  public TradeQtyType(Integer data) {
    super(1842, data);
  }

  public TradeQtyType(int data) {
    super(1842, data);
  }
}
