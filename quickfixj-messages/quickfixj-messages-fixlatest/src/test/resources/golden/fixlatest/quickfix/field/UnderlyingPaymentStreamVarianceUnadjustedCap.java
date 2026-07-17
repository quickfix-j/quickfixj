/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamVarianceUnadjustedCap extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42973;

  public UnderlyingPaymentStreamVarianceUnadjustedCap() {
    super(42973);
  }

  public UnderlyingPaymentStreamVarianceUnadjustedCap(BigDecimal data) {
    super(42973, data);
  }

  public UnderlyingPaymentStreamVarianceUnadjustedCap(double data) {
    super(42973, BigDecimal.valueOf(data));
  }
}
