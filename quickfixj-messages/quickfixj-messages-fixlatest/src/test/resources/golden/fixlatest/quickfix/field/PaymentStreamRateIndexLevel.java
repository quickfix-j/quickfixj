/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamRateIndexLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41197;

  public PaymentStreamRateIndexLevel() {
    super(41197);
  }

  public PaymentStreamRateIndexLevel(BigDecimal data) {
    super(41197, data);
  }

  public PaymentStreamRateIndexLevel(double data) {
    super(41197, BigDecimal.valueOf(data));
  }
}
