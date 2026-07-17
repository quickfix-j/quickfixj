/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40616;

  public UnderlyingPaymentStreamFixedAmount() {
    super(40616);
  }

  public UnderlyingPaymentStreamFixedAmount(BigDecimal data) {
    super(40616, data);
  }

  public UnderlyingPaymentStreamFixedAmount(double data) {
    super(40616, BigDecimal.valueOf(data));
  }
}
