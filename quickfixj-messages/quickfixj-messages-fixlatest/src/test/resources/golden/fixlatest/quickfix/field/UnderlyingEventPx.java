/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingEventPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1987;

  public UnderlyingEventPx() {
    super(1987);
  }

  public UnderlyingEventPx(BigDecimal data) {
    super(1987, data);
  }

  public UnderlyingEventPx(double data) {
    super(1987, BigDecimal.valueOf(data));
  }
}
