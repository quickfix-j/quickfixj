/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionCashSettlMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40108;

  public static final int CASH_PRICE = 0;

  public static final int CASH_PRICE_ALTERNATE = 1;

  public static final int PAR_YIELD_CURVE_ADJUSTED = 2;

  public static final int ZERO_COUPON_YIELD_CURVE_ADJUSTED = 3;

  public static final int PAR_YIELD_CURVE_UNADJUSTED = 4;

  public static final int CROSS_CURRENCY = 5;

  public static final int COLLATERALIZED_PRICE = 6;

  public ProvisionCashSettlMethod() {
    super(40108);
  }

  public ProvisionCashSettlMethod(Integer data) {
    super(40108, data);
  }

  public ProvisionCashSettlMethod(int data) {
    super(40108, data);
  }
}
