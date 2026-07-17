/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamCompoundingFixedRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42605;

  public PaymentStreamCompoundingFixedRate() {
    super(42605);
  }

  public PaymentStreamCompoundingFixedRate(BigDecimal data) {
    super(42605, data);
  }

  public PaymentStreamCompoundingFixedRate(double data) {
    super(42605, BigDecimal.valueOf(data));
  }
}
