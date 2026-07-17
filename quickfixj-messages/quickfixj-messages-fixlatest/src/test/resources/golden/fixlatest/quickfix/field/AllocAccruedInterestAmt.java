/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocAccruedInterestAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 742;

  public AllocAccruedInterestAmt() {
    super(742);
  }

  public AllocAccruedInterestAmt(BigDecimal data) {
    super(742, data);
  }

  public AllocAccruedInterestAmt(double data) {
    super(742, BigDecimal.valueOf(data));
  }
}
