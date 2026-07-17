/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteRequestRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 658;

  public static final int UNKNOWN_SYMBOL = 1;

  public static final int EXCHANGE = 2;

  public static final int QUOTE_REQUEST_EXCEEDS_LIMIT = 3;

  public static final int TOO_LATE_TO_ENTER = 4;

  public static final int INVALID_PRICE = 5;

  public static final int NOT_AUTHORIZED_TO_REQUEST_QUOTE = 6;

  public static final int NO_MATCH_FOR_INQUIRY = 7;

  public static final int NO_MARKET_FOR_INSTRUMENT = 8;

  public static final int NO_INVENTORY = 9;

  public static final int PASS = 10;

  public static final int INSUFFICIENT_CREDIT = 11;

  public static final int EXCEEDED_CLIP_SIZE_LIMIT = 12;

  public static final int EXCEEDED_MAX_NOTIONAL_ORDER_AMT = 13;

  public static final int EXCEEDED_DV01PV01LIMIT = 14;

  public static final int EXCEEDED_CS01LIMIT = 15;

  public static final int OTHER = 99;

  public QuoteRequestRejectReason() {
    super(658);
  }

  public QuoteRequestRejectReason(Integer data) {
    super(658, data);
  }

  public QuoteRequestRejectReason(int data) {
    super(658, data);
  }
}
