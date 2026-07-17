/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41574;

  public LegPaymentStreamRateConversionFactor() {
    super(41574);
  }

  public LegPaymentStreamRateConversionFactor(BigDecimal data) {
    super(41574, data);
  }

  public LegPaymentStreamRateConversionFactor(double data) {
    super(41574, BigDecimal.valueOf(data));
  }
}
