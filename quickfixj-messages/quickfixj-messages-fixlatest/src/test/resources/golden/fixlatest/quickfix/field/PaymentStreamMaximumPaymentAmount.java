/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamMaximumPaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41183;

  public PaymentStreamMaximumPaymentAmount() {
    super(41183);
  }

  public PaymentStreamMaximumPaymentAmount(BigDecimal data) {
    super(41183, data);
  }

  public PaymentStreamMaximumPaymentAmount(double data) {
    super(41183, BigDecimal.valueOf(data));
  }
}
