/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamCompoundingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42926;

  public UnderlyingPaymentStreamCompoundingRateMultiplier() {
    super(42926);
  }

  public UnderlyingPaymentStreamCompoundingRateMultiplier(BigDecimal data) {
    super(42926, data);
  }

  public UnderlyingPaymentStreamCompoundingRateMultiplier(double data) {
    super(42926, BigDecimal.valueOf(data));
  }
}
