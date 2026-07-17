/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40838;

  public PaymentScheduleRateMultiplier() {
    super(40838);
  }

  public PaymentScheduleRateMultiplier(BigDecimal data) {
    super(40838, data);
  }

  public PaymentScheduleRateMultiplier(double data) {
    super(40838, BigDecimal.valueOf(data));
  }
}
