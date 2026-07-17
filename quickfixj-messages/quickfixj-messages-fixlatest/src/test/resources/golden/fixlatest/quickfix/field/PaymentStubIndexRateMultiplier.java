/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStubIndexRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40882;

  public PaymentStubIndexRateMultiplier() {
    super(40882);
  }

  public PaymentStubIndexRateMultiplier(BigDecimal data) {
    super(40882, data);
  }

  public PaymentStubIndexRateMultiplier(double data) {
    super(40882, BigDecimal.valueOf(data));
  }
}
