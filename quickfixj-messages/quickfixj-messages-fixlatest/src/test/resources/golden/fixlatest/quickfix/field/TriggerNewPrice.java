/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TriggerNewPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1110;

  public TriggerNewPrice() {
    super(1110);
  }

  public TriggerNewPrice(BigDecimal data) {
    super(1110, data);
  }

  public TriggerNewPrice(double data) {
    super(1110, BigDecimal.valueOf(data));
  }
}
