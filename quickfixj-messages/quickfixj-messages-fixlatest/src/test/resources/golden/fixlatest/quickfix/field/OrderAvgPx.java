/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrderAvgPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 799;

  public OrderAvgPx() {
    super(799);
  }

  public OrderAvgPx(BigDecimal data) {
    super(799, data);
  }

  public OrderAvgPx(double data) {
    super(799, BigDecimal.valueOf(data));
  }
}
