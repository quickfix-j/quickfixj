/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingLastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 652;

  public UnderlyingLastQty() {
    super(652);
  }

  public UnderlyingLastQty(BigDecimal data) {
    super(652, data);
  }

  public UnderlyingLastQty(double data) {
    super(652, BigDecimal.valueOf(data));
  }
}
