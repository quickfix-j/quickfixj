/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40675;

  public UnderlyingPaymentScheduleRateSpread() {
    super(40675);
  }

  public UnderlyingPaymentScheduleRateSpread(BigDecimal data) {
    super(40675, data);
  }

  public UnderlyingPaymentScheduleRateSpread(double data) {
    super(40675, BigDecimal.valueOf(data));
  }
}
