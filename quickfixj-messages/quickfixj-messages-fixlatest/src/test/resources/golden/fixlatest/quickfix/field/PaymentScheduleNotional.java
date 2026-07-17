/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40835;

  public PaymentScheduleNotional() {
    super(40835);
  }

  public PaymentScheduleNotional(BigDecimal data) {
    super(40835, data);
  }

  public PaymentScheduleNotional(double data) {
    super(40835, BigDecimal.valueOf(data));
  }
}
