/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalAccruedInterestAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 540;

  public TotalAccruedInterestAmt() {
    super(540);
  }

  public TotalAccruedInterestAmt(BigDecimal data) {
    super(540, data);
  }

  public TotalAccruedInterestAmt(double data) {
    super(540, BigDecimal.valueOf(data));
  }
}
