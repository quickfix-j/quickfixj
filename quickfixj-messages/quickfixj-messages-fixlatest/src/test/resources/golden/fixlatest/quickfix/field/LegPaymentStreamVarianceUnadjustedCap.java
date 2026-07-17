/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamVarianceUnadjustedCap extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42477;

  public LegPaymentStreamVarianceUnadjustedCap() {
    super(42477);
  }

  public LegPaymentStreamVarianceUnadjustedCap(BigDecimal data) {
    super(42477, data);
  }

  public LegPaymentStreamVarianceUnadjustedCap(double data) {
    super(42477, BigDecimal.valueOf(data));
  }
}
