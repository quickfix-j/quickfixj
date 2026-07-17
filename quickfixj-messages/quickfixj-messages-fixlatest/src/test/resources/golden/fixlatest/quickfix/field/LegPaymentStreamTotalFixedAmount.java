/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamTotalFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41557;

  public LegPaymentStreamTotalFixedAmount() {
    super(41557);
  }

  public LegPaymentStreamTotalFixedAmount(BigDecimal data) {
    super(41557, data);
  }

  public LegPaymentStreamTotalFixedAmount(double data) {
    super(41557, BigDecimal.valueOf(data));
  }
}
