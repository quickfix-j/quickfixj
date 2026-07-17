/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentScheduleWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40687;

  public UnderlyingPaymentScheduleWeight() {
    super(40687);
  }

  public UnderlyingPaymentScheduleWeight(BigDecimal data) {
    super(40687, data);
  }

  public UnderlyingPaymentScheduleWeight(double data) {
    super(40687, BigDecimal.valueOf(data));
  }
}
