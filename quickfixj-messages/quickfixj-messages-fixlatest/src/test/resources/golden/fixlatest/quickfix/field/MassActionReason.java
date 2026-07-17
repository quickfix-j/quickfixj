/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassActionReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2675;

  public static final int NONE = 0;

  public static final int TRADING_RISK_CONTROL = 1;

  public static final int CLEARING_RISK_CONTROL = 2;

  public static final int MARKET_MAKER_PROTECTION = 3;

  public static final int STOP_TRADING = 4;

  public static final int EMERGENCY_ACTION = 5;

  public static final int SESSION_LOSS_LOGOUT = 6;

  public static final int DUPLICATE_LOGIN = 7;

  public static final int PRODUCT_NOT_TRADED = 8;

  public static final int INSTRUMENT_NOT_TRADED = 9;

  public static final int COMPLE_INSTRUMENT_DELETED = 10;

  public static final int CIRCUIT_BREAKER_ACTIVATED = 11;

  public static final int OTHER = 99;

  public MassActionReason() {
    super(2675);
  }

  public MassActionReason(Integer data) {
    super(2675, data);
  }

  public MassActionReason(int data) {
    super(2675, data);
  }
}
