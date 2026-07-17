/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamRateIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41914;

  public UnderlyingPaymentStreamRateIndexLevel() {
    super(41914);
  }

  public UnderlyingPaymentStreamRateIndexLevel(BigDecimal data) {
    super(41914, data);
  }

  public UnderlyingPaymentStreamRateIndexLevel(double data) {
    super(41914, BigDecimal.valueOf(data));
  }
}
