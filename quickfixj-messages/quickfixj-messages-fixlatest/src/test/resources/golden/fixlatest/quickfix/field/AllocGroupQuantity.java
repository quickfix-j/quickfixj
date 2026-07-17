/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocGroupQuantity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1736;

  public AllocGroupQuantity() {
    super(1736);
  }

  public AllocGroupQuantity(BigDecimal data) {
    super(1736, data);
  }

  public AllocGroupQuantity(double data) {
    super(1736, BigDecimal.valueOf(data));
  }
}
