/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40384;

  public LegPaymentScheduleRateMultiplier() {
    super(40384);
  }

  public LegPaymentScheduleRateMultiplier(BigDecimal data) {
    super(40384, data);
  }

  public LegPaymentScheduleRateMultiplier(double data) {
    super(40384, BigDecimal.valueOf(data));
  }
}
