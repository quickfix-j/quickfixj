/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideCollateralReinvestmentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2867;

  public static final int MONEY_MARKET_FUND = 0;

  public static final int OTHER_COMINGLED_POOL = 1;

  public static final int REPO_MARKET = 2;

  public static final int DIRECT_PURCHASE_OF_SECURITIES = 3;

  public static final int OTHER_INVESTMENTS = 4;

  public SideCollateralReinvestmentType() {
    super(2867);
  }

  public SideCollateralReinvestmentType(Integer data) {
    super(2867, data);
  }

  public SideCollateralReinvestmentType(int data) {
    super(2867, data);
  }
}
