/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleSettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41539;

  public LegPaymentScheduleSettlPeriodPrice() {
    super(41539);
  }

  public LegPaymentScheduleSettlPeriodPrice(BigDecimal data) {
    super(41539, data);
  }

  public LegPaymentScheduleSettlPeriodPrice(double data) {
    super(41539, BigDecimal.valueOf(data));
  }
}
