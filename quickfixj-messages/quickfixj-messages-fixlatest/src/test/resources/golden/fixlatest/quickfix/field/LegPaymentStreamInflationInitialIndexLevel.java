/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamInflationInitialIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40356;

  public LegPaymentStreamInflationInitialIndexLevel() {
    super(40356);
  }

  public LegPaymentStreamInflationInitialIndexLevel(BigDecimal data) {
    super(40356, data);
  }

  public LegPaymentStreamInflationInitialIndexLevel(double data) {
    super(40356, BigDecimal.valueOf(data));
  }
}
