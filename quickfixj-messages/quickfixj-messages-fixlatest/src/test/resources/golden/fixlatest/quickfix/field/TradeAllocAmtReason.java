/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeAllocAmtReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1850;

  public static final int OPTIONS_SETTLEMENT = 0;

  public static final int PENDING_EROSION_ADJUSTMENT = 1;

  public static final int FINAL_EROSION_ADJUSTMENT = 2;

  public static final int TEAR_UP_COUPON_AMOUNT = 3;

  public static final int PRICE_ALIGNMENT_INTEREST = 4;

  public static final int DELIVERY_INVOICE_CHARGES = 5;

  public static final int DELIVERY_STORAGE_CHARGES = 6;

  public TradeAllocAmtReason() {
    super(1850);
  }

  public TradeAllocAmtReason(Integer data) {
    super(1850, data);
  }

  public TradeAllocAmtReason(int data) {
    super(1850, data);
  }
}
