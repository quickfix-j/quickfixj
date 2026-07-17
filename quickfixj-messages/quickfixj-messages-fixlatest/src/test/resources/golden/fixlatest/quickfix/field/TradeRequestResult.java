/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeRequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 749;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_OR_UNKNOWN_INSTRUMENT = 1;

  public static final int INVALID_TYPE_OF_TRADE_REQUESTED = 2;

  public static final int INVALID_PARTIES = 3;

  public static final int INVALID_TRANSPORT_TYPE_REQUESTED = 4;

  public static final int INVALID_DESTINATION_REQUESTED = 5;

  public static final int TRADE_REQUEST_TYPE_NOT_SUPPORTED = 8;

  public static final int NOT_AUTHORIZED = 9;

  public static final int OTHER = 99;

  public TradeRequestResult() {
    super(749);
  }

  public TradeRequestResult(Integer data) {
    super(749, data);
  }

  public TradeRequestResult(int data) {
    super(749, data);
  }
}
