/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41922;

  public UnderlyingPaymentStreamRateConversionFactor() {
    super(41922);
  }

  public UnderlyingPaymentStreamRateConversionFactor(BigDecimal data) {
    super(41922, data);
  }

  public UnderlyingPaymentStreamRateConversionFactor(double data) {
    super(41922, BigDecimal.valueOf(data));
  }
}
