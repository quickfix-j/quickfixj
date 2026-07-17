/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RiskLimitType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1530;

  public static final int CREDIT_LIMIT = 0;

  public static final int GROSS_LIMIT = 1;

  public static final int NET_LIMIT = 2;

  public static final int EXPOSURE = 3;

  public static final int LONG_LIMIT = 4;

  public static final int SHORT_LIMIT = 5;

  public static final int CASH_MARGIN = 6;

  public static final int ADDITIONAL_MARGIN = 7;

  public static final int TOTAL_MARGIN = 8;

  public static final int LIMIT_CONSUMED = 9;

  public static final int CLIP_SIZE = 10;

  public static final int MAX_NOTIONAL_ORDER_SIZE = 11;

  public static final int DV01PV01LIMIT = 12;

  public static final int CS01LIMIT = 13;

  public static final int VOLUME_LIMIT_PER_TIME_PERIOD = 14;

  public static final int VOL_FILLED_PCT_ORD_VOL_TM_PERIOD = 15;

  public static final int NOTL_FILLED_PCT_NOTL_TM_PERIOD = 16;

  public static final int TRANSACTION_EXECUTION_LIMIT_PER_TIME_PERIOD = 17;

  public RiskLimitType() {
    super(1530);
  }

  public RiskLimitType(Integer data) {
    super(1530, data);
  }

  public RiskLimitType(int data) {
    super(1530, data);
  }
}
