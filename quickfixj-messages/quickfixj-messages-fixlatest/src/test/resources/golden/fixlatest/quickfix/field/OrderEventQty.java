/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderEventQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1800;

  public OrderEventQty() {
    super(1800);
  }

  public OrderEventQty(BigDecimal data) {
    super(1800, data);
  }

  public OrderEventQty(double data) {
    super(1800, BigDecimal.valueOf(data));
  }
}
