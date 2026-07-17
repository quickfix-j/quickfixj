/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40625;

  public UnderlyingPaymentStreamRateSpread() {
    super(40625);
  }

  public UnderlyingPaymentStreamRateSpread(BigDecimal data) {
    super(40625, data);
  }

  public UnderlyingPaymentStreamRateSpread(double data) {
    super(40625, BigDecimal.valueOf(data));
  }
}
