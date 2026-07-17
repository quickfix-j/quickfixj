/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliveryScheduleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41040;

  public DeliveryScheduleNotional() {
    super(41040);
  }

  public DeliveryScheduleNotional(BigDecimal data) {
    super(41040, data);
  }

  public DeliveryScheduleNotional(double data) {
    super(41040, BigDecimal.valueOf(data));
  }
}
