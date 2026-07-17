/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PosAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 708;

  public PosAmt() {
    super(708);
  }

  public PosAmt(BigDecimal data) {
    super(708, data);
  }

  public PosAmt(double data) {
    super(708, BigDecimal.valueOf(data));
  }
}
