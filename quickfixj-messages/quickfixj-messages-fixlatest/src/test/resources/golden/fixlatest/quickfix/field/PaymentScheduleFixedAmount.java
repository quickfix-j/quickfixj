/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40842;

  public PaymentScheduleFixedAmount() {
    super(40842);
  }

  public PaymentScheduleFixedAmount(BigDecimal data) {
    super(40842, data);
  }

  public PaymentScheduleFixedAmount(double data) {
    super(40842, BigDecimal.valueOf(data));
  }
}
