/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteEntryStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1167;

  public static final int ACCEPTED = 0;

  public static final int REJECTED = 5;

  public static final int REMOVED_FROM_MARKET = 6;

  public static final int EXPIRED = 7;

  public static final int LOCKED_MARKET_WARNING = 12;

  public static final int CROSS_MARKET_WARNING = 13;

  public static final int CANCELED_DUE_TO_LOCK_MARKET = 14;

  public static final int CANCELED_DUE_TO_CROSS_MARKET = 15;

  public static final int ACTIVE = 16;

  public QuoteEntryStatus() {
    super(1167);
  }

  public QuoteEntryStatus(Integer data) {
    super(1167, data);
  }

  public QuoteEntryStatus(int data) {
    super(1167, data);
  }
}
