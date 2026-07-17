/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradingCapacity extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1815;

  public static final int CUSTOMER = 1;

  public static final int CUSTOMER_PROFESSIONAL = 2;

  public static final int BROKER_DEALER = 3;

  public static final int CUSTOMER_BROKER_DEALER = 4;

  public static final int PRINCIPAL = 5;

  public static final int MARKET_MAKER = 6;

  public static final int AWAY_MARKET_MAKER = 7;

  public static final int SYSTEMATIC_INTERNALISER = 8;

  public TradingCapacity() {
    super(1815);
  }

  public TradingCapacity(Integer data) {
    super(1815, data);
  }

  public TradingCapacity(int data) {
    super(1815, data);
  }
}
