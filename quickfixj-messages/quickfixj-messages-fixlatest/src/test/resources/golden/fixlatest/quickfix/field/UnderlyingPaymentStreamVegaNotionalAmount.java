/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamVegaNotionalAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42977;

  public UnderlyingPaymentStreamVegaNotionalAmount() {
    super(42977);
  }

  public UnderlyingPaymentStreamVegaNotionalAmount(BigDecimal data) {
    super(42977, data);
  }

  public UnderlyingPaymentStreamVegaNotionalAmount(double data) {
    super(42977, BigDecimal.valueOf(data));
  }
}
