/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40674;

  public UnderlyingPaymentScheduleRateMultiplier() {
    super(40674);
  }

  public UnderlyingPaymentScheduleRateMultiplier(BigDecimal data) {
    super(40674, data);
  }

  public UnderlyingPaymentScheduleRateMultiplier(double data) {
    super(40674, BigDecimal.valueOf(data));
  }
}
