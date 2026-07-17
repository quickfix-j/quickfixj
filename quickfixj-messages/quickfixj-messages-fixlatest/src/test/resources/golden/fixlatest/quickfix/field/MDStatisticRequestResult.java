/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDStatisticRequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2473;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_OR_UNKNOWN_MARKET = 1;

  public static final int INVALID_OR_UNKNOWN_MARKET_SEGMENT = 2;

  public static final int INVALID_OR_UNKNOWN_SECURITY_LIST = 3;

  public static final int INVALID_OR_UNKNOWN_INSTRUMENTS = 4;

  public static final int INVALID_PARTIES = 5;

  public static final int TRADE_DATE_OUT_OF_SUPPORTED_RANGE = 6;

  public static final int UNSUPPORTED_STATISTIC_TYPE = 7;

  public static final int UNSUPPORTED_SCOPE_OR_SUB_SCOPE = 8;

  public static final int UNSUPPORTED_SCOPE_TYPE = 9;

  public static final int MARKET_DEPTH_NOT_SUPPORTED = 10;

  public static final int FREQUENCY_NOT_SUPPORTED = 11;

  public static final int UNSUPPORTED_STATISTIC_INTERVAL = 12;

  public static final int UNSUPPORTED_STATISTIC_DATE_RANGE = 13;

  public static final int UNSUPPORTED_STATISTIC_TIME_RANGE = 14;

  public static final int UNSUPPORTED_RATIO_TYPE = 15;

  public static final int INVALID_OR_UNKNOWN_TRADE_INPUT_SOURCE = 16;

  public static final int INVALID_OR_UNKNOWN_TRADING_SESSION = 17;

  public static final int UNAUTHORIZED_FOR_STATISTIC_REQUEST = 18;

  public static final int OTHER = 99;

  public MDStatisticRequestResult() {
    super(2473);
  }

  public MDStatisticRequestResult(Integer data) {
    super(2473, data);
  }

  public MDStatisticRequestResult(int data) {
    super(2473, data);
  }
}
