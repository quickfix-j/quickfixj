/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamFutureValueNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40618;

  public UnderlyingPaymentStreamFutureValueNotional() {
    super(40618);
  }

  public UnderlyingPaymentStreamFutureValueNotional(BigDecimal data) {
    super(40618, data);
  }

  public UnderlyingPaymentStreamFutureValueNotional(double data) {
    super(40618, BigDecimal.valueOf(data));
  }
}
