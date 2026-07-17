/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamWorldScaleRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41558;

  public LegPaymentStreamWorldScaleRate() {
    super(41558);
  }

  public LegPaymentStreamWorldScaleRate(BigDecimal data) {
    super(41558, data);
  }

  public LegPaymentStreamWorldScaleRate(double data) {
    super(41558, BigDecimal.valueOf(data));
  }
}
