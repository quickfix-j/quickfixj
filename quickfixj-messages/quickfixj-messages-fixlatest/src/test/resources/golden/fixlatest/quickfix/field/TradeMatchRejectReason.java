/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeMatchRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1897;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY_INFORMATION = 1;

  public static final int UNKNOWN_INSTRUMENT = 2;

  public static final int UNAUTHORIZED = 3;

  public static final int INVALID_TRADE_TYPE = 4;

  public static final int OTHER = 99;

  public TradeMatchRejectReason() {
    super(1897);
  }

  public TradeMatchRejectReason(Integer data) {
    super(1897, data);
  }

  public TradeMatchRejectReason(int data) {
    super(1897, data);
  }
}
