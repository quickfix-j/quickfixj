/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastLimitAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1632;

  public LastLimitAmt() {
    super(1632);
  }

  public LastLimitAmt(BigDecimal data) {
    super(1632, data);
  }

  public LastLimitAmt(double data) {
    super(1632, BigDecimal.valueOf(data));
  }
}
