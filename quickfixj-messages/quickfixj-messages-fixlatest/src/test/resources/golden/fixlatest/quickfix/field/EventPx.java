/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EventPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 867;

  public EventPx() {
    super(867);
  }

  public EventPx(BigDecimal data) {
    super(867, data);
  }

  public EventPx(double data) {
    super(867, BigDecimal.valueOf(data));
  }
}
