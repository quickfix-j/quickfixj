/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamFutureValueNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40329;

  public LegPaymentStreamFutureValueNotional() {
    super(40329);
  }

  public LegPaymentStreamFutureValueNotional(BigDecimal data) {
    super(40329, data);
  }

  public LegPaymentStreamFutureValueNotional(double data) {
    super(40329, BigDecimal.valueOf(data));
  }
}
