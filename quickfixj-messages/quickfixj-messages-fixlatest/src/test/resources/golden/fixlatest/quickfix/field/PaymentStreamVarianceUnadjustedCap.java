/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamVarianceUnadjustedCap extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42678;

  public PaymentStreamVarianceUnadjustedCap() {
    super(42678);
  }

  public PaymentStreamVarianceUnadjustedCap(BigDecimal data) {
    super(42678, data);
  }

  public PaymentStreamVarianceUnadjustedCap(double data) {
    super(42678, BigDecimal.valueOf(data));
  }
}
