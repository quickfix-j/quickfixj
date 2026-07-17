/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStubIndexRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40428;

  public LegPaymentStubIndexRateMultiplier() {
    super(40428);
  }

  public LegPaymentStubIndexRateMultiplier(BigDecimal data) {
    super(40428, data);
  }

  public LegPaymentStubIndexRateMultiplier(double data) {
    super(40428, BigDecimal.valueOf(data));
  }
}
