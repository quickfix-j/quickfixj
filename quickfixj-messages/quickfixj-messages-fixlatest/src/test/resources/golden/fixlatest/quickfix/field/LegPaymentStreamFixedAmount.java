/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40327;

  public LegPaymentStreamFixedAmount() {
    super(40327);
  }

  public LegPaymentStreamFixedAmount(BigDecimal data) {
    super(40327, data);
  }

  public LegPaymentStreamFixedAmount(double data) {
    super(40327, BigDecimal.valueOf(data));
  }
}
