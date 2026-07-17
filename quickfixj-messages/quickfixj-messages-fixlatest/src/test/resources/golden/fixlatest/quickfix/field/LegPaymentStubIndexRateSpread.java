/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStubIndexRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40429;

  public LegPaymentStubIndexRateSpread() {
    super(40429);
  }

  public LegPaymentStubIndexRateSpread(BigDecimal data) {
    super(40429, data);
  }

  public LegPaymentStubIndexRateSpread(double data) {
    super(40429, BigDecimal.valueOf(data));
  }
}
