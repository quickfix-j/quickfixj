/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41168;

  public PaymentScheduleRateConversionFactor() {
    super(41168);
  }

  public PaymentScheduleRateConversionFactor(BigDecimal data) {
    super(41168, data);
  }

  public PaymentScheduleRateConversionFactor(double data) {
    super(41168, BigDecimal.valueOf(data));
  }
}
