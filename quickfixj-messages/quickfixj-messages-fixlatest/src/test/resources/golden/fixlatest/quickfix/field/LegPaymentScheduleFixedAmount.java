/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40388;

  public LegPaymentScheduleFixedAmount() {
    super(40388);
  }

  public LegPaymentScheduleFixedAmount(BigDecimal data) {
    super(40388, data);
  }

  public LegPaymentScheduleFixedAmount(double data) {
    super(40388, BigDecimal.valueOf(data));
  }
}
