/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderBookingQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 800;

  public OrderBookingQty() {
    super(800);
  }

  public OrderBookingQty(BigDecimal data) {
    super(800, data);
  }

  public OrderBookingQty(double data) {
    super(800, BigDecimal.valueOf(data));
  }
}
