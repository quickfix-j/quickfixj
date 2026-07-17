/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 297;

  public static final int ACCEPTED = 0;

  public static final int CANCEL_FOR_SYMBOL = 1;

  public static final int CANCELED_FOR_SECURITY_TYPE = 2;

  public static final int CANCELED_FOR_UNDERLYING = 3;

  public static final int CANCELED_ALL = 4;

  public static final int REJECTED = 5;

  public static final int REMOVED_FROM_MARKET = 6;

  public static final int EXPIRED = 7;

  public static final int QUERY = 8;

  public static final int QUOTE_NOT_FOUND = 9;

  public static final int PENDING = 10;

  public static final int PASS = 11;

  public static final int LOCKED_MARKET_WARNING = 12;

  public static final int CROSS_MARKET_WARNING = 13;

  public static final int CANCELED_DUE_TO_LOCK_MARKET = 14;

  public static final int CANCELED_DUE_TO_CROSS_MARKET = 15;

  public static final int ACTIVE = 16;

  public static final int CANCELED = 17;

  public static final int UNSOLICITED_QUOTE_REPLENISHMENT = 18;

  public static final int PENDING_END_TRADE = 19;

  public static final int TOO_LATE_TO_END = 20;

  public static final int TRADED = 21;

  public static final int TRADED_AND_REMOVED = 22;

  public static final int CONTRACT_TERMINATES = 23;

  public QuoteStatus() {
    super(297);
  }

  public QuoteStatus(Integer data) {
    super(297, data);
  }

  public QuoteStatus(int data) {
    super(297, data);
  }
}
