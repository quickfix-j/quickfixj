/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 32;

  public LastQty() {
    super(32);
  }

  public LastQty(BigDecimal data) {
    super(32, data);
  }

  public LastQty(double data) {
    super(32, BigDecimal.valueOf(data));
  }
}
