/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamCompoundingSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42401;

  public LegPaymentStreamCompoundingSpread() {
    super(42401);
  }

  public LegPaymentStreamCompoundingSpread(BigDecimal data) {
    super(42401, data);
  }

  public LegPaymentStreamCompoundingSpread(double data) {
    super(42401, BigDecimal.valueOf(data));
  }
}
