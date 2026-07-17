/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamRateConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41205;

  public PaymentStreamRateConversionFactor() {
    super(41205);
  }

  public PaymentStreamRateConversionFactor(BigDecimal data) {
    super(41205, data);
  }

  public PaymentStreamRateConversionFactor(double data) {
    super(41205, BigDecimal.valueOf(data));
  }
}
