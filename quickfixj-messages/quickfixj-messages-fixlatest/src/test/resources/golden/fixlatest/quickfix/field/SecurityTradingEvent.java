/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityTradingEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1174;

  public static final int ORDER_IMBALANCE = 1;

  public static final int TRADING_RESUMES = 2;

  public static final int PRICE_VOLATILITY_INTERRUPTION = 3;

  public static final int CHANGE_OF_TRADING_SESSION = 4;

  public static final int CHANGE_OF_TRADING_SUBSESSION = 5;

  public static final int CHANGE_OF_SECURITY_TRADING_STATUS = 6;

  public static final int CHANGE_OF_BOOK_TYPE = 7;

  public static final int CHANGE_OF_MARKET_DEPTH = 8;

  public static final int CORPORATE_ACTION = 9;

  public SecurityTradingEvent() {
    super(1174);
  }

  public SecurityTradingEvent(Integer data) {
    super(1174, data);
  }

  public SecurityTradingEvent(int data) {
    super(1174, data);
  }
}
