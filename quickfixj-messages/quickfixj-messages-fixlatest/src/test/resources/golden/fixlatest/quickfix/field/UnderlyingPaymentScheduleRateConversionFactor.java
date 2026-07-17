/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41885;

  public UnderlyingPaymentScheduleRateConversionFactor() {
    super(41885);
  }

  public UnderlyingPaymentScheduleRateConversionFactor(BigDecimal data) {
    super(41885, data);
  }

  public UnderlyingPaymentScheduleRateConversionFactor(double data) {
    super(41885, BigDecimal.valueOf(data));
  }
}
