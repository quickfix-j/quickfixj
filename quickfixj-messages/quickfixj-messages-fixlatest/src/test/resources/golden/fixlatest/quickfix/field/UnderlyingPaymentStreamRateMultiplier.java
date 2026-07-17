/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40624;

  public UnderlyingPaymentStreamRateMultiplier() {
    super(40624);
  }

  public UnderlyingPaymentStreamRateMultiplier(BigDecimal data) {
    super(40624, data);
  }

  public UnderlyingPaymentStreamRateMultiplier(double data) {
    super(40624, BigDecimal.valueOf(data));
  }
}
