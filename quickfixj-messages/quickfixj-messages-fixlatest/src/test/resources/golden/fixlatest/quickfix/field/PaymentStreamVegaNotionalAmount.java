/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamVegaNotionalAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42682;

  public PaymentStreamVegaNotionalAmount() {
    super(42682);
  }

  public PaymentStreamVegaNotionalAmount(BigDecimal data) {
    super(42682, data);
  }

  public PaymentStreamVegaNotionalAmount(double data) {
    super(42682, BigDecimal.valueOf(data));
  }
}
