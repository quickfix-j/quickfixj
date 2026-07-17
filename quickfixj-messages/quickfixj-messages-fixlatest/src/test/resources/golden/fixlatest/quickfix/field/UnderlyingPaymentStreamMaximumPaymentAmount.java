/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamMaximumPaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41900;

  public UnderlyingPaymentStreamMaximumPaymentAmount() {
    super(41900);
  }

  public UnderlyingPaymentStreamMaximumPaymentAmount(BigDecimal data) {
    super(41900, data);
  }

  public UnderlyingPaymentStreamMaximumPaymentAmount(double data) {
    super(41900, BigDecimal.valueOf(data));
  }
}
