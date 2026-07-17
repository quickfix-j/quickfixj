/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryScheduleNegativeTolerance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41762;

  public UnderlyingDeliveryScheduleNegativeTolerance() {
    super(41762);
  }

  public UnderlyingDeliveryScheduleNegativeTolerance(BigDecimal data) {
    super(41762, data);
  }

  public UnderlyingDeliveryScheduleNegativeTolerance(double data) {
    super(41762, BigDecimal.valueOf(data));
  }
}
