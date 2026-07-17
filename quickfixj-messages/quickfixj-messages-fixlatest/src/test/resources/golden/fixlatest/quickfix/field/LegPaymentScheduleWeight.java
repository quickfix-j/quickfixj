/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentScheduleWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40397;

  public LegPaymentScheduleWeight() {
    super(40397);
  }

  public LegPaymentScheduleWeight(BigDecimal data) {
    super(40397, data);
  }

  public LegPaymentScheduleWeight(double data) {
    super(40397, BigDecimal.valueOf(data));
  }
}
