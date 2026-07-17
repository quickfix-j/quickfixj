/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleSettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41170;

  public PaymentScheduleSettlPeriodPrice() {
    super(41170);
  }

  public PaymentScheduleSettlPeriodPrice(BigDecimal data) {
    super(41170, data);
  }

  public PaymentScheduleSettlPeriodPrice(double data) {
    super(41170, BigDecimal.valueOf(data));
  }
}
