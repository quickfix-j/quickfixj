/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderEventPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1799;

  public OrderEventPx() {
    super(1799);
  }

  public OrderEventPx(BigDecimal data) {
    super(1799, data);
  }

  public OrderEventPx(double data) {
    super(1799, BigDecimal.valueOf(data));
  }
}
