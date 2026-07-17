/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStubIndex2RateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40896;

  public PaymentStubIndex2RateMultiplier() {
    super(40896);
  }

  public PaymentStubIndex2RateMultiplier(BigDecimal data) {
    super(40896, data);
  }

  public PaymentStubIndex2RateMultiplier(double data) {
    super(40896, BigDecimal.valueOf(data));
  }
}
