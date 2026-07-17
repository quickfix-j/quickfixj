/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleFixedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40678;

  public UnderlyingPaymentScheduleFixedAmount() {
    super(40678);
  }

  public UnderlyingPaymentScheduleFixedAmount(BigDecimal data) {
    super(40678, data);
  }

  public UnderlyingPaymentScheduleFixedAmount(double data) {
    super(40678, BigDecimal.valueOf(data));
  }
}
