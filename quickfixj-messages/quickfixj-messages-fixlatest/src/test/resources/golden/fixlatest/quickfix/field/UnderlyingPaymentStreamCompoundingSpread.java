/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamCompoundingSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42897;

  public UnderlyingPaymentStreamCompoundingSpread() {
    super(42897);
  }

  public UnderlyingPaymentStreamCompoundingSpread(BigDecimal data) {
    super(42897, data);
  }

  public UnderlyingPaymentStreamCompoundingSpread(double data) {
    super(42897, BigDecimal.valueOf(data));
  }
}
