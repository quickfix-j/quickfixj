/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 300;

  public static final int UNKNOWN_SYMBOL = 1;

  public static final int EXCHANGE = 2;

  public static final int QUOTE_REQUEST_EXCEEDS_LIMIT = 3;

  public static final int TOO_LATE_TO_ENTER = 4;

  public static final int UNKNOWN_QUOTE = 5;

  public static final int DUPLICATE_QUOTE = 6;

  public static final int INVALID_BID = 7;

  public static final int INVALID_PRICE = 8;

  public static final int NOT_AUTHORIZED_TO_QUOTE_SECURITY = 9;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND = 10;

  public static final int QUOTE_LOCKED = 11;

  public static final int INVALID_OR_UNKNOWN_SECURITY_ISSUER = 12;

  public static final int INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY = 13;

  public static final int NOTIONAL_VALUE_EXCEEDS_THRESHOLD = 14;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND_DEPR = 15;

  public static final int REFERENCE_PRICE_NOT_AVAILABLE = 16;

  public static final int INSUFFICIENT_CREDIT_LIMIT = 17;

  public static final int EXCEEDED_CLIP_SIZE_LIMIT = 18;

  public static final int EXCEEDED_MAX_NOTIONAL_ORDER_AMT = 19;

  public static final int EXCEEDED_DV01PV01LIMIT = 20;

  public static final int EXCEEDED_CS01LIMIT = 21;

  public static final int OTHER = 99;

  public QuoteRejectReason() {
    super(300);
  }

  public QuoteRejectReason(Integer data) {
    super(300, data);
  }

  public QuoteRejectReason(int data) {
    super(300, data);
  }
}
