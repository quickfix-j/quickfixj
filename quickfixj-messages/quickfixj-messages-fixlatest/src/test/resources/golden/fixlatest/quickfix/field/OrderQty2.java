/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderQty2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 192;

  public OrderQty2() {
    super(192);
  }

  public OrderQty2(BigDecimal data) {
    super(192, data);
  }

  public OrderQty2(double data) {
    super(192, BigDecimal.valueOf(data));
  }
}
