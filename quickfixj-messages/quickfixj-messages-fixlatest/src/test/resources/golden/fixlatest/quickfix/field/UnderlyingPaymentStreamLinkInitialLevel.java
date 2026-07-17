/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamLinkInitialLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42964;

  public UnderlyingPaymentStreamLinkInitialLevel() {
    super(42964);
  }

  public UnderlyingPaymentStreamLinkInitialLevel(BigDecimal data) {
    super(42964, data);
  }

  public UnderlyingPaymentStreamLinkInitialLevel(double data) {
    super(42964, BigDecimal.valueOf(data));
  }
}
