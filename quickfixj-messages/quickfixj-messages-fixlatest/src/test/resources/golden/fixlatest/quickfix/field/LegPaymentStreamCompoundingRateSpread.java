/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamCompoundingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42431;

  public LegPaymentStreamCompoundingRateSpread() {
    super(42431);
  }

  public LegPaymentStreamCompoundingRateSpread(BigDecimal data) {
    super(42431, data);
  }

  public LegPaymentStreamCompoundingRateSpread(double data) {
    super(42431, BigDecimal.valueOf(data));
  }
}
