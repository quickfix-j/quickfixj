/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40336;

  public LegPaymentStreamRateSpread() {
    super(40336);
  }

  public LegPaymentStreamRateSpread(BigDecimal data) {
    super(40336, data);
  }

  public LegPaymentStreamRateSpread(double data) {
    super(40336, BigDecimal.valueOf(data));
  }
}
