/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamCompoundingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42430;

  public LegPaymentStreamCompoundingRateMultiplier() {
    super(42430);
  }

  public LegPaymentStreamCompoundingRateMultiplier(BigDecimal data) {
    super(42430, data);
  }

  public LegPaymentStreamCompoundingRateMultiplier(double data) {
    super(42430, BigDecimal.valueOf(data));
  }
}
