/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40851;

  public PaymentScheduleWeight() {
    super(40851);
  }

  public PaymentScheduleWeight(BigDecimal data) {
    super(40851, data);
  }

  public PaymentScheduleWeight(double data) {
    super(40851, BigDecimal.valueOf(data));
  }
}
