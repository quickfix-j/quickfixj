/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrdRejReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 103;

  public static final int BROKER_CREDIT = 0;

  public static final int UNKNOWN_SYMBOL = 1;

  public static final int EXCHANGE_CLOSED = 2;

  public static final int ORDER_EXCEEDS_LIMIT = 3;

  public static final int TOO_LATE_TO_ENTER = 4;

  public static final int UNKNOWN_ORDER = 5;

  public static final int DUPLICATE_ORDER = 6;

  public static final int DUPLICATE_OF_AVERBALLY_COMMUNICATED_ORDER = 7;

  public static final int STALE_ORDER = 8;

  public static final int TRADE_ALONG_REQUIRED = 9;

  public static final int INVALID_INVESTOR_ID = 10;

  public static final int UNSUPPORTED_ORDER_CHARACTERISTIC = 11;

  public static final int SURVEILLANCE_OPTION = 12;

  public static final int INCORRECT_QUANTITY = 13;

  public static final int INCORRECT_ALLOCATED_QUANTITY = 14;

  public static final int UNKNOWN_ACCOUNT = 15;

  public static final int PRICE_EXCEEDS_CURRENT_PRICE_BAND = 16;

  public static final int INVALID_PRICE_INCREMENT = 18;

  public static final int REFERENCE_PRICE_NOT_AVAILABLE = 19;

  public static final int NOTIONAL_VALUE_EXCEEDS_THRESHOLD = 20;

  public static final int ALGORITH_RISK_THRESHOLD_BREACHED = 21;

  public static final int SHORT_SELL_NOT_PERMITTED = 22;

  public static final int SHORT_SELL_SECURITY_PRE_BORROW_RESTRICTION = 23;

  public static final int SHORT_SELL_ACCOUNT_PRE_BORROW_RESTRICTION = 24;

  public static final int INSUFFICIENT_CREDIT_LIMIT = 25;

  public static final int EXCEEDED_CLIP_SIZE_LIMIT = 26;

  public static final int EXCEEDED_MAX_NOTIONAL_ORDER_AMT = 27;

  public static final int EXCEEDED_DV01PV01LIMIT = 28;

  public static final int EXCEEDED_CS01LIMIT = 29;

  public static final int OTHER = 99;

  public OrdRejReason() {
    super(103);
  }

  public OrdRejReason(Integer data) {
    super(103, data);
  }

  public OrdRejReason(int data) {
    super(103, data);
  }
}
