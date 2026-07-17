/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStubIndexRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40718;

  public UnderlyingPaymentStubIndexRateMultiplier() {
    super(40718);
  }

  public UnderlyingPaymentStubIndexRateMultiplier(BigDecimal data) {
    super(40718, data);
  }

  public UnderlyingPaymentStubIndexRateMultiplier(double data) {
    super(40718, BigDecimal.valueOf(data));
  }
}
