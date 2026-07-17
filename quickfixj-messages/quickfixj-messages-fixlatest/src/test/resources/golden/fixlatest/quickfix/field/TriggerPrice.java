/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TriggerPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1102;

  public TriggerPrice() {
    super(1102);
  }

  public TriggerPrice(BigDecimal data) {
    super(1102, data);
  }

  public TriggerPrice(double data) {
    super(1102, BigDecimal.valueOf(data));
  }
}
