/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class EntitlementType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1775;

  public static final int TRADE = 0;

  public static final int MAKE_MARKETS = 1;

  public static final int HOLD_POSITIONS = 2;

  public static final int PERFORM_GIVE_UPS = 3;

  public static final int SUBMIT_IOIS = 4;

  public static final int SUBSCRIBE_MARKET_DATA = 5;

  public static final int SHORT_WITH_PRE_BORROW = 6;

  public static final int SUBMIT_QUOTE_REQUESTS = 7;

  public static final int RESPOND_TO_QUOTE_REQUESTS = 8;

  public EntitlementType() {
    super(1775);
  }

  public EntitlementType(Integer data) {
    super(1775, data);
  }

  public EntitlementType(int data) {
    super(1775, data);
  }
}
