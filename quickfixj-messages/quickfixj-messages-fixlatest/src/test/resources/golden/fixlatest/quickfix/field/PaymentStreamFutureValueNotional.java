/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamFutureValueNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40787;

  public PaymentStreamFutureValueNotional() {
    super(40787);
  }

  public PaymentStreamFutureValueNotional(BigDecimal data) {
    super(40787, data);
  }

  public PaymentStreamFutureValueNotional(double data) {
    super(40787, BigDecimal.valueOf(data));
  }
}
