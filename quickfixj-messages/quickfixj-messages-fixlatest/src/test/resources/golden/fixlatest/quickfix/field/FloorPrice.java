/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FloorPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1200;

  public FloorPrice() {
    super(1200);
  }

  public FloorPrice(BigDecimal data) {
    super(1200, data);
  }

  public FloorPrice(double data) {
    super(1200, BigDecimal.valueOf(data));
  }
}
