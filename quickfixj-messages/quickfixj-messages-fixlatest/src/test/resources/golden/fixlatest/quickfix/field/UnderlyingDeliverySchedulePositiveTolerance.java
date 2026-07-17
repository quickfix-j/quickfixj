/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliverySchedulePositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41763;

  public UnderlyingDeliverySchedulePositiveTolerance() {
    super(41763);
  }

  public UnderlyingDeliverySchedulePositiveTolerance(BigDecimal data) {
    super(41763, data);
  }

  public UnderlyingDeliverySchedulePositiveTolerance(double data) {
    super(41763, BigDecimal.valueOf(data));
  }
}
