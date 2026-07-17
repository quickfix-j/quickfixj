/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamLinkMaximumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42675;

  public PaymentStreamLinkMaximumBoundary() {
    super(42675);
  }

  public PaymentStreamLinkMaximumBoundary(BigDecimal data) {
    super(42675, data);
  }

  public PaymentStreamLinkMaximumBoundary(double data) {
    super(42675, BigDecimal.valueOf(data));
  }
}
