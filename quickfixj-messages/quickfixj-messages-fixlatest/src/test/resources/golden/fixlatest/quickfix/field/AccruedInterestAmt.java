/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AccruedInterestAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 159;

  public AccruedInterestAmt() {
    super(159);
  }

  public AccruedInterestAmt(BigDecimal data) {
    super(159, data);
  }

  public AccruedInterestAmt(double data) {
    super(159, BigDecimal.valueOf(data));
  }
}
