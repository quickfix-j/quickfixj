/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollateralAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2632;

  public static final int MARKET_VALUATION = 0;

  public static final int PORTFOLIO_VALUE = 1;

  public static final int VALUE_CONFIRMED = 2;

  public static final int COLLATERAL_CREDIT_VALUE = 3;

  public static final int ADDITIONAL_COLLATERAL_VALUE = 4;

  public static final int ESTIMATED_MARKET_VALUATION = 5;

  public CollateralAmountType() {
    super(2632);
  }

  public CollateralAmountType(Integer data) {
    super(2632, data);
  }

  public CollateralAmountType(int data) {
    super(2632, data);
  }
}
