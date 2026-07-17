/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegLastMultipliedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2358;

  public LegLastMultipliedQty() {
    super(2358);
  }

  public LegLastMultipliedQty(BigDecimal data) {
    super(2358, data);
  }

  public LegLastMultipliedQty(double data) {
    super(2358, BigDecimal.valueOf(data));
  }
}
