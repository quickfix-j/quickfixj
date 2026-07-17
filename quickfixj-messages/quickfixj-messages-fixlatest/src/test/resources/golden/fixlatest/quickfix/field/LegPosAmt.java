/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPosAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1587;

  public LegPosAmt() {
    super(1587);
  }

  public LegPosAmt(BigDecimal data) {
    super(1587, data);
  }

  public LegPosAmt(double data) {
    super(1587, BigDecimal.valueOf(data));
  }
}
