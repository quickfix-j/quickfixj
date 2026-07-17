/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamLinkMaximumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42474;

  public LegPaymentStreamLinkMaximumBoundary() {
    super(42474);
  }

  public LegPaymentStreamLinkMaximumBoundary(BigDecimal data) {
    super(42474, data);
  }

  public LegPaymentStreamLinkMaximumBoundary(double data) {
    super(42474, BigDecimal.valueOf(data));
  }
}
