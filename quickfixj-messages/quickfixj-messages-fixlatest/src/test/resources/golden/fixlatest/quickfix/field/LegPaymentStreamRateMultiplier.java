/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40335;

  public LegPaymentStreamRateMultiplier() {
    super(40335);
  }

  public LegPaymentStreamRateMultiplier(BigDecimal data) {
    super(40335, data);
  }

  public LegPaymentStreamRateMultiplier(double data) {
    super(40335, BigDecimal.valueOf(data));
  }
}
