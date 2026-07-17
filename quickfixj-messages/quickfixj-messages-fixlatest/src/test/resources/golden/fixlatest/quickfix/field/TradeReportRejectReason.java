/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeReportRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 751;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY_INFORMATION = 1;

  public static final int UNKNOWN_INSTRUMENT = 2;

  public static final int UNAUTHORIZED_TO_REPORT_TRADES = 3;

  public static final int INVALID_TRADE_TYPE = 4;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND = 5;

  public static final int REFERENCE_PRICE_NOT_AVAILABLE = 6;

  public static final int NOTIONAL_VALUE_EXCEEDS_THRESHOLD = 7;

  public static final int OTHER = 99;

  public TradeReportRejectReason() {
    super(751);
  }

  public TradeReportRejectReason(Integer data) {
    super(751, data);
  }

  public TradeReportRejectReason(int data) {
    super(751, data);
  }
}
