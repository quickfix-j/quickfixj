/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideCollateralAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2694;

  public static final int MARKET_VALUATION = 0;

  public static final int PORTFOLIO_VALUE = 1;

  public static final int VALUE_CONFIRMED = 2;

  public static final int COLLATERAL_CREDIT_VALUE = 3;

  public static final int ADDITIONAL_COLLATERAL_VALUE = 4;

  public static final int ESTIMATED_MARKET_VALUATION = 5;

  public SideCollateralAmountType() {
    super(2694);
  }

  public SideCollateralAmountType(Integer data) {
    super(2694, data);
  }

  public SideCollateralAmountType(int data) {
    super(2694, data);
  }
}
