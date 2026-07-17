/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamCompoundingSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42602;

  public PaymentStreamCompoundingSpread() {
    super(42602);
  }

  public PaymentStreamCompoundingSpread(BigDecimal data) {
    super(42602, data);
  }

  public PaymentStreamCompoundingSpread(double data) {
    super(42602, BigDecimal.valueOf(data));
  }
}
