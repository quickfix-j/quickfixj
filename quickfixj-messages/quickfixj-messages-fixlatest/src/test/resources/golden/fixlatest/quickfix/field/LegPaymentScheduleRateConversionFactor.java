/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41537;

  public LegPaymentScheduleRateConversionFactor() {
    super(41537);
  }

  public LegPaymentScheduleRateConversionFactor(BigDecimal data) {
    super(41537, data);
  }

  public LegPaymentScheduleRateConversionFactor(double data) {
    super(41537, BigDecimal.valueOf(data));
  }
}
