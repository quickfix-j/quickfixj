/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamVegaNotionalAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42481;

  public LegPaymentStreamVegaNotionalAmount() {
    super(42481);
  }

  public LegPaymentStreamVegaNotionalAmount(BigDecimal data) {
    super(42481, data);
  }

  public LegPaymentStreamVegaNotionalAmount(double data) {
    super(42481, BigDecimal.valueOf(data));
  }
}
