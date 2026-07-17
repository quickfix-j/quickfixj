/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40671;

  public UnderlyingPaymentScheduleNotional() {
    super(40671);
  }

  public UnderlyingPaymentScheduleNotional(BigDecimal data) {
    super(40671, data);
  }

  public UnderlyingPaymentScheduleNotional(double data) {
    super(40671, BigDecimal.valueOf(data));
  }
}
