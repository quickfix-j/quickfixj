/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DerivativeEventType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1287;

  public static final int PUT = 1;

  public static final int CALL = 2;

  public static final int TENDER = 3;

  public static final int SINKING_FUND_CALL = 4;

  public static final int ACTIVATION = 5;

  public static final int INACTIVIATION = 6;

  public static final int LAST_ELIGIBLE_TRADE_DATE = 7;

  public static final int SWAP_START_DATE = 8;

  public static final int SWAP_END_DATE = 9;

  public static final int SWAP_ROLL_DATE = 10;

  public static final int SWAP_NEXT_START_DATE = 11;

  public static final int SWAP_NEXT_ROLL_DATE = 12;

  public static final int FIRST_DELIVERY_DATE = 13;

  public static final int LAST_DELIVERY_DATE = 14;

  public static final int INITIAL_INVENTORY_DUE_DATE = 15;

  public static final int FINAL_INVENTORY_DUE_DATE = 16;

  public static final int FIRST_INTENT_DATE = 17;

  public static final int LAST_INTENT_DATE = 18;

  public static final int POSITION_REMOVAL_DATE = 19;

  public static final int MINIMUM_NOTICE = 20;

  public static final int DELIVERY_START_TIME = 21;

  public static final int DELIVERY_END_TIME = 22;

  public static final int FIRST_NOTICE_DATE = 23;

  public static final int LAST_NOTICE_DATE = 24;

  public static final int FIRST_EXERCISE_DATE = 25;

  public static final int REDEMPTION_DATE = 26;

  public static final int TRD_CNTNTN_EFCTV_DT = 27;

  public static final int OTHER = 99;

  public DerivativeEventType() {
    super(1287);
  }

  public DerivativeEventType(Integer data) {
    super(1287, data);
  }

  public DerivativeEventType(int data) {
    super(1287, data);
  }
}
