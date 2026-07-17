/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStubFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40422;

  public LegPaymentStubFixedAmount() {
    super(40422);
  }

  public LegPaymentStubFixedAmount(BigDecimal data) {
    super(40422, data);
  }

  public LegPaymentStubFixedAmount(double data) {
    super(40422, BigDecimal.valueOf(data));
  }
}
