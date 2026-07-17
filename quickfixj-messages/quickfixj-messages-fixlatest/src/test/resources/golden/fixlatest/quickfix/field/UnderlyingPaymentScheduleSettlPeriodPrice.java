/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleSettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41887;

  public UnderlyingPaymentScheduleSettlPeriodPrice() {
    super(41887);
  }

  public UnderlyingPaymentScheduleSettlPeriodPrice(BigDecimal data) {
    super(41887, data);
  }

  public UnderlyingPaymentScheduleSettlPeriodPrice(double data) {
    super(41887, BigDecimal.valueOf(data));
  }
}
