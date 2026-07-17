/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40385;

  public LegPaymentScheduleRateSpread() {
    super(40385);
  }

  public LegPaymentScheduleRateSpread(BigDecimal data) {
    super(40385, data);
  }

  public LegPaymentScheduleRateSpread(double data) {
    super(40385, BigDecimal.valueOf(data));
  }
}
