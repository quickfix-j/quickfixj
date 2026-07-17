/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamLinkMinimumBoundary extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42475;

  public LegPaymentStreamLinkMinimumBoundary() {
    super(42475);
  }

  public LegPaymentStreamLinkMinimumBoundary(BigDecimal data) {
    super(42475, data);
  }

  public LegPaymentStreamLinkMinimumBoundary(double data) {
    super(42475, BigDecimal.valueOf(data));
  }
}
