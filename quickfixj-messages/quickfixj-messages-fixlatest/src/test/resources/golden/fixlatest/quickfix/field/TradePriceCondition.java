/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradePriceCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1839;

  public static final int SPECIAL_CUM_DIVIDEND = 0;

  public static final int SPECIAL_CUM_RIGHTS = 1;

  public static final int SPECIAL_EX_DIVIDEND = 2;

  public static final int SPECIAL_EX_RIGHTS = 3;

  public static final int SPECIAL_CUM_COUPON = 4;

  public static final int SPECIAL_CUM_CAPITAL_REPAYMENTS = 5;

  public static final int SPECIAL_EX_COUPON = 6;

  public static final int SPECIAL_EX_CAPITAL_REPAYMENTS = 7;

  public static final int CASH_SETTLEMENT = 8;

  public static final int SPECIAL_CUM_BONUS = 9;

  public static final int SPECIAL_PRICE = 10;

  public static final int SPECIAL_EX_BONUS = 11;

  public static final int GUARANTEED_DELIVERY = 12;

  public static final int SPECIAL_DIVIDEND = 13;

  public static final int PRICE_IMPROVEMENT = 14;

  public static final int NON_PRICE_FORMING_TRADE = 15;

  public static final int TRADE_EXEMPTED_FROM_TRADING_OBLIGATION = 16;

  public static final int PRICE_PENDING = 17;

  public static final int PRICE_NOT_APPLICABLE = 18;

  public TradePriceCondition() {
    super(1839);
  }

  public TradePriceCondition(Integer data) {
    super(1839, data);
  }

  public TradePriceCondition(int data) {
    super(1839, data);
  }
}
