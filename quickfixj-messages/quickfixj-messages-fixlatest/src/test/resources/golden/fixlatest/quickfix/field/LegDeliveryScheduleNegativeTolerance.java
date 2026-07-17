/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliveryScheduleNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41414;

  public LegDeliveryScheduleNegativeTolerance() {
    super(41414);
  }

  public LegDeliveryScheduleNegativeTolerance(BigDecimal data) {
    super(41414, data);
  }

  public LegDeliveryScheduleNegativeTolerance(double data) {
    super(41414, BigDecimal.valueOf(data));
  }
}
