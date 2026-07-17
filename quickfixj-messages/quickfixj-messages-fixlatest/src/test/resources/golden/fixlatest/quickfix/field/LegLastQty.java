/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegLastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1418;

  public LegLastQty() {
    super(1418);
  }

  public LegLastQty(BigDecimal data) {
    super(1418, data);
  }

  public LegLastQty(double data) {
    super(1418, BigDecimal.valueOf(data));
  }
}
