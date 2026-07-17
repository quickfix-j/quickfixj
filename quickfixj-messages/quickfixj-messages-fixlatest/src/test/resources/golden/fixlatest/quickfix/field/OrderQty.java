/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 38;

  public OrderQty() {
    super(38);
  }

  public OrderQty(BigDecimal data) {
    super(38, data);
  }

  public OrderQty(double data) {
    super(38, BigDecimal.valueOf(data));
  }
}
