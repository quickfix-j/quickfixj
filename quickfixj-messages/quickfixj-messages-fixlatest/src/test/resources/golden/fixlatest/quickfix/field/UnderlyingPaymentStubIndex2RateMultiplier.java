/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStubIndex2RateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40732;

  public UnderlyingPaymentStubIndex2RateMultiplier() {
    super(40732);
  }

  public UnderlyingPaymentStubIndex2RateMultiplier(BigDecimal data) {
    super(40732, data);
  }

  public UnderlyingPaymentStubIndex2RateMultiplier(double data) {
    super(40732, BigDecimal.valueOf(data));
  }
}
