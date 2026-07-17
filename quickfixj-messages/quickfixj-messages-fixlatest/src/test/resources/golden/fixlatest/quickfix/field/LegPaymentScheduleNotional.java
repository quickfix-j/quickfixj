/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40381;

  public LegPaymentScheduleNotional() {
    super(40381);
  }

  public LegPaymentScheduleNotional(BigDecimal data) {
    super(40381, data);
  }

  public LegPaymentScheduleNotional(double data) {
    super(40381, BigDecimal.valueOf(data));
  }
}
