/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderCapacityQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 863;

  public OrderCapacityQty() {
    super(863);
  }

  public OrderCapacityQty(BigDecimal data) {
    super(863, data);
  }

  public OrderCapacityQty(double data) {
    super(863, BigDecimal.valueOf(data));
  }
}
