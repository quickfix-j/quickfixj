/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamCompoundingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42631;

  public PaymentStreamCompoundingRateMultiplier() {
    super(42631);
  }

  public PaymentStreamCompoundingRateMultiplier(BigDecimal data) {
    super(42631, data);
  }

  public PaymentStreamCompoundingRateMultiplier(double data) {
    super(42631, BigDecimal.valueOf(data));
  }
}
