/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40839;

  public PaymentScheduleRateSpread() {
    super(40839);
  }

  public PaymentScheduleRateSpread(BigDecimal data) {
    super(40839, data);
  }

  public PaymentScheduleRateSpread(double data) {
    super(40839, BigDecimal.valueOf(data));
  }
}
