/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LimitAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2395;

  public LimitAmt() {
    super(2395);
  }

  public LimitAmt(BigDecimal data) {
    super(2395, data);
  }

  public LimitAmt(double data) {
    super(2395, BigDecimal.valueOf(data));
  }
}
