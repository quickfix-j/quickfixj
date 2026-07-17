/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentFloatingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43101;

  public PaymentFloatingRateSpread() {
    super(43101);
  }

  public PaymentFloatingRateSpread(BigDecimal data) {
    super(43101, data);
  }

  public PaymentFloatingRateSpread(double data) {
    super(43101, BigDecimal.valueOf(data));
  }
}
