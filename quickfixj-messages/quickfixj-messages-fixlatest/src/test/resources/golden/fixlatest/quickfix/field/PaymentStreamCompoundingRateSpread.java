/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamCompoundingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42632;

  public PaymentStreamCompoundingRateSpread() {
    super(42632);
  }

  public PaymentStreamCompoundingRateSpread(BigDecimal data) {
    super(42632, data);
  }

  public PaymentStreamCompoundingRateSpread(double data) {
    super(42632, BigDecimal.valueOf(data));
  }
}
