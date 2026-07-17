/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamLinkInitialLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42468;

  public LegPaymentStreamLinkInitialLevel() {
    super(42468);
  }

  public LegPaymentStreamLinkInitialLevel(BigDecimal data) {
    super(42468, data);
  }

  public LegPaymentStreamLinkInitialLevel(double data) {
    super(42468, BigDecimal.valueOf(data));
  }
}
