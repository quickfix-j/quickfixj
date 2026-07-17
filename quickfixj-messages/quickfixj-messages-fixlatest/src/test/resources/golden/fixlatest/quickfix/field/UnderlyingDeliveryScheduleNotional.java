/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41759;

  public UnderlyingDeliveryScheduleNotional() {
    super(41759);
  }

  public UnderlyingDeliveryScheduleNotional(BigDecimal data) {
    super(41759, data);
  }

  public UnderlyingDeliveryScheduleNotional(double data) {
    super(41759, BigDecimal.valueOf(data));
  }
}
