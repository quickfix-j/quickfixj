/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentPresentValueAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40225;

  public PaymentPresentValueAmount() {
    super(40225);
  }

  public PaymentPresentValueAmount(BigDecimal data) {
    super(40225, data);
  }

  public PaymentPresentValueAmount(double data) {
    super(40225, BigDecimal.valueOf(data));
  }
}
