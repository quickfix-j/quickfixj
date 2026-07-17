/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40794;

  public PaymentStreamRateSpread() {
    super(40794);
  }

  public PaymentStreamRateSpread(BigDecimal data) {
    super(40794, data);
  }

  public PaymentStreamRateSpread(double data) {
    super(40794, BigDecimal.valueOf(data));
  }
}
