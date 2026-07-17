/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliveryScheduleNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41043;

  public DeliveryScheduleNegativeTolerance() {
    super(41043);
  }

  public DeliveryScheduleNegativeTolerance(BigDecimal data) {
    super(41043, data);
  }

  public DeliveryScheduleNegativeTolerance(double data) {
    super(41043, BigDecimal.valueOf(data));
  }
}
