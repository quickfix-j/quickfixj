/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40785;

  public PaymentStreamFixedAmount() {
    super(40785);
  }

  public PaymentStreamFixedAmount(BigDecimal data) {
    super(40785, data);
  }

  public PaymentStreamFixedAmount(double data) {
    super(40785, BigDecimal.valueOf(data));
  }
}
