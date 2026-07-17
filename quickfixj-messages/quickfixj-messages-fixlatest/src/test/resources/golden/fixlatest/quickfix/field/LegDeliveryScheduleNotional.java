/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliveryScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41411;

  public LegDeliveryScheduleNotional() {
    super(41411);
  }

  public LegDeliveryScheduleNotional(BigDecimal data) {
    super(41411, data);
  }

  public LegDeliveryScheduleNotional(double data) {
    super(41411, BigDecimal.valueOf(data));
  }
}
