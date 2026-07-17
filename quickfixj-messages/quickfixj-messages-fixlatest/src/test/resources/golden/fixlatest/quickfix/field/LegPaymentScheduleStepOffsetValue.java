/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleStepOffsetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40392;

  public LegPaymentScheduleStepOffsetValue() {
    super(40392);
  }

  public LegPaymentScheduleStepOffsetValue(BigDecimal data) {
    super(40392, data);
  }

  public LegPaymentScheduleStepOffsetValue(double data) {
    super(40392, BigDecimal.valueOf(data));
  }
}
