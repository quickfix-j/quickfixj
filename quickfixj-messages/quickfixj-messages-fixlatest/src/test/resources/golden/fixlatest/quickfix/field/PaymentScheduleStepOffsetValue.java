/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleStepOffsetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40846;

  public PaymentScheduleStepOffsetValue() {
    super(40846);
  }

  public PaymentScheduleStepOffsetValue(BigDecimal data) {
    super(40846, data);
  }

  public PaymentScheduleStepOffsetValue(double data) {
    super(40846, BigDecimal.valueOf(data));
  }
}
