/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingProvisionCashSettlMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42166;

  public static final int CASH_PRICE = 0;

  public static final int CASH_PRICE_ALTERNATE = 1;

  public static final int PAR_YIELD_CURVE_ADJUSTED = 2;

  public static final int ZERO_COUPON_YIELD_CURVE_ADJUSTED = 3;

  public static final int PAR_YIELD_CURVE_UNADJUSTED = 4;

  public static final int CROSS_CURRENCY = 5;

  public static final int COLLATERALIZED_PRICE = 6;

  public UnderlyingProvisionCashSettlMethod() {
    super(42166);
  }

  public UnderlyingProvisionCashSettlMethod(Integer data) {
    super(42166, data);
  }

  public UnderlyingProvisionCashSettlMethod(int data) {
    super(42166, data);
  }
}
