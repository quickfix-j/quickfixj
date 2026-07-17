/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamRateIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41566;

  public LegPaymentStreamRateIndexLevel() {
    super(41566);
  }

  public LegPaymentStreamRateIndexLevel(BigDecimal data) {
    super(41566, data);
  }

  public LegPaymentStreamRateIndexLevel(double data) {
    super(41566, BigDecimal.valueOf(data));
  }
}
