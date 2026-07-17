/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliverySchedulePositiveTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41044;

  public DeliverySchedulePositiveTolerance() {
    super(41044);
  }

  public DeliverySchedulePositiveTolerance(BigDecimal data) {
    super(41044, data);
  }

  public DeliverySchedulePositiveTolerance(double data) {
    super(41044, BigDecimal.valueOf(data));
  }
}
