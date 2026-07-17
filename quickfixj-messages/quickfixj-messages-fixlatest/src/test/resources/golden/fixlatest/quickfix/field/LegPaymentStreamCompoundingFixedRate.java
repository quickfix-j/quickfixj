/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamCompoundingFixedRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42404;

  public LegPaymentStreamCompoundingFixedRate() {
    super(42404);
  }

  public LegPaymentStreamCompoundingFixedRate(BigDecimal data) {
    super(42404, data);
  }

  public LegPaymentStreamCompoundingFixedRate(double data) {
    super(42404, BigDecimal.valueOf(data));
  }
}
