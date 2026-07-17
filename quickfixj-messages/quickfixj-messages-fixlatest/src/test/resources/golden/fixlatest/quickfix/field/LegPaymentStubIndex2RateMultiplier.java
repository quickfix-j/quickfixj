/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStubIndex2RateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40442;

  public LegPaymentStubIndex2RateMultiplier() {
    super(40442);
  }

  public LegPaymentStubIndex2RateMultiplier(BigDecimal data) {
    super(40442, data);
  }

  public LegPaymentStubIndex2RateMultiplier(double data) {
    super(40442, BigDecimal.valueOf(data));
  }
}
