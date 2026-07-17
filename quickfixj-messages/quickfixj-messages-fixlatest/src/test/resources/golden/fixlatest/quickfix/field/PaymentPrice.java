/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40218;

  public PaymentPrice() {
    super(40218);
  }

  public PaymentPrice(BigDecimal data) {
    super(40218, data);
  }

  public PaymentPrice(double data) {
    super(40218, BigDecimal.valueOf(data));
  }
}
