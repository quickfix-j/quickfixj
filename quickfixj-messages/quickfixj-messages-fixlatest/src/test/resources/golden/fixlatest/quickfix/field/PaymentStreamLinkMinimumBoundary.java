/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamLinkMinimumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42676;

  public PaymentStreamLinkMinimumBoundary() {
    super(42676);
  }

  public PaymentStreamLinkMinimumBoundary(BigDecimal data) {
    super(42676, data);
  }

  public PaymentStreamLinkMinimumBoundary(double data) {
    super(42676, BigDecimal.valueOf(data));
  }
}
