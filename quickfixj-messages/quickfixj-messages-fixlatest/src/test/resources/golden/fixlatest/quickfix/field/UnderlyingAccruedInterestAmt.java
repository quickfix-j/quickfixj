/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAccruedInterestAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2885;

  public UnderlyingAccruedInterestAmt() {
    super(2885);
  }

  public UnderlyingAccruedInterestAmt(BigDecimal data) {
    super(2885, data);
  }

  public UnderlyingAccruedInterestAmt(double data) {
    super(2885, BigDecimal.valueOf(data));
  }
}
