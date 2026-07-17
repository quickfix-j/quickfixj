/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExecRestatementReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 378;

  public static final int GTCORPORATE_ACTION = 0;

  public static final int GTRENEWAL = 1;

  public static final int VERBAL_CHANGE = 2;

  public static final int REPRICING_OF_ORDER = 3;

  public static final int BROKER_OPTION = 4;

  public static final int PARTIAL_DECLINE_OF_ORDER_QTY = 5;

  public static final int CANCEL_ON_TRADING_HALT = 6;

  public static final int CANCEL_ON_SYSTEM_FAILURE = 7;

  public static final int MARKET = 8;

  public static final int CANCELED = 9;

  public static final int WAREHOUSE_RECAP = 10;

  public static final int PEG_REFRESH = 11;

  public static final int CANCEL_ON_CONNECTION_LOSS = 12;

  public static final int CANCEL_ON_LOGOUT = 13;

  public static final int ASSIGN_TIME_PRIORITY = 14;

  public static final int CANCELLED_FOR_TRADE_PRICE_VIOLATION = 15;

  public static final int CANCELLED_FOR_CROSS_IMBALANCE = 16;

  public static final int OTHER = 99;

  public ExecRestatementReason() {
    super(378);
  }

  public ExecRestatementReason(Integer data) {
    super(378, data);
  }

  public ExecRestatementReason(int data) {
    super(378, data);
  }
}
