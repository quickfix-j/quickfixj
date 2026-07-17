/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStubIndex2RateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40443;

  public LegPaymentStubIndex2RateSpread() {
    super(40443);
  }

  public LegPaymentStubIndex2RateSpread(BigDecimal data) {
    super(40443, data);
  }

  public LegPaymentStubIndex2RateSpread(double data) {
    super(40443, BigDecimal.valueOf(data));
  }
}
