/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideClearingTradePriceType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1598;

  public static final int TRADE_CLEARING_AT_EXECUTION_PRICE = 0;

  public static final int TRADE_CLEARING_AT_ALTERNATE_CLEARING_PRICE = 1;

  public SideClearingTradePriceType() {
    super(1598);
  }

  public SideClearingTradePriceType(Integer data) {
    super(1598, data);
  }

  public SideClearingTradePriceType(int data) {
    super(1598, data);
  }
}
