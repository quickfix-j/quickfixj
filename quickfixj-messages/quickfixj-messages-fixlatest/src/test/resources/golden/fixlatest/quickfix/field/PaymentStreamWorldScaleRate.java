/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamWorldScaleRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41189;

  public PaymentStreamWorldScaleRate() {
    super(41189);
  }

  public PaymentStreamWorldScaleRate(BigDecimal data) {
    super(41189, data);
  }

  public PaymentStreamWorldScaleRate(double data) {
    super(41189, BigDecimal.valueOf(data));
  }
}
