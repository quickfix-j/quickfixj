/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamLinkInitialLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42669;

  public PaymentStreamLinkInitialLevel() {
    super(42669);
  }

  public PaymentStreamLinkInitialLevel(BigDecimal data) {
    super(42669, data);
  }

  public PaymentStreamLinkInitialLevel(double data) {
    super(42669, BigDecimal.valueOf(data));
  }
}
