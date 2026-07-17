/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliverySchedulePositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41415;

  public LegDeliverySchedulePositiveTolerance() {
    super(41415);
  }

  public LegDeliverySchedulePositiveTolerance(BigDecimal data) {
    super(41415, data);
  }

  public LegDeliverySchedulePositiveTolerance(double data) {
    super(41415, BigDecimal.valueOf(data));
  }
}
