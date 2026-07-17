/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamLinkMinimumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42971;

  public UnderlyingPaymentStreamLinkMinimumBoundary() {
    super(42971);
  }

  public UnderlyingPaymentStreamLinkMinimumBoundary(BigDecimal data) {
    super(42971, data);
  }

  public UnderlyingPaymentStreamLinkMinimumBoundary(double data) {
    super(42971, BigDecimal.valueOf(data));
  }
}
