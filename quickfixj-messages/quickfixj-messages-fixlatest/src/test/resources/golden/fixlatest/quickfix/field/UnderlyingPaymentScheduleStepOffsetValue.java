/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleStepOffsetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40682;

  public UnderlyingPaymentScheduleStepOffsetValue() {
    super(40682);
  }

  public UnderlyingPaymentScheduleStepOffsetValue(BigDecimal data) {
    super(40682, data);
  }

  public UnderlyingPaymentScheduleStepOffsetValue(double data) {
    super(40682, BigDecimal.valueOf(data));
  }
}
