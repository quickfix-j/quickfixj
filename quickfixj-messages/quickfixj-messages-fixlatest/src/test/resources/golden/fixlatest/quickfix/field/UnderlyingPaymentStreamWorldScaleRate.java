/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamWorldScaleRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41906;

  public UnderlyingPaymentStreamWorldScaleRate() {
    super(41906);
  }

  public UnderlyingPaymentStreamWorldScaleRate(BigDecimal data) {
    super(41906, data);
  }

  public UnderlyingPaymentStreamWorldScaleRate(double data) {
    super(41906, BigDecimal.valueOf(data));
  }
}
