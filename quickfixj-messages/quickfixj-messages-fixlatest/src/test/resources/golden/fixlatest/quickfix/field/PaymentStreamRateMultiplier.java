/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40793;

  public PaymentStreamRateMultiplier() {
    super(40793);
  }

  public PaymentStreamRateMultiplier(BigDecimal data) {
    super(40793, data);
  }

  public PaymentStreamRateMultiplier(double data) {
    super(40793, BigDecimal.valueOf(data));
  }
}
