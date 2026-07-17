/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamLinkMaximumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42970;

  public UnderlyingPaymentStreamLinkMaximumBoundary() {
    super(42970);
  }

  public UnderlyingPaymentStreamLinkMaximumBoundary(BigDecimal data) {
    super(42970, data);
  }

  public UnderlyingPaymentStreamLinkMaximumBoundary(double data) {
    super(42970, BigDecimal.valueOf(data));
  }
}
