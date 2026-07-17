/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosAmtReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1585;

  public static final int OPTIONS_SETTLEMENT = 0;

  public static final int PENDING_EROSION_ADJUSTMENT = 1;

  public static final int FINAL_EROSION_ADJUSTMENT = 2;

  public static final int TEAR_UP_COUPON_AMOUNT = 3;

  public static final int PRICE_ALIGNMENT_INTEREST = 4;

  public static final int DELIVERY_INVOICE_CHARGES = 5;

  public static final int DELIVERY_STORAGE_CHARGES = 6;

  public PosAmtReason() {
    super(1585);
  }

  public PosAmtReason(Integer data) {
    super(1585, data);
  }

  public PosAmtReason(int data) {
    super(1585, data);
  }
}
