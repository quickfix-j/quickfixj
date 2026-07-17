/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EndAccruedInterestAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 920;

  public EndAccruedInterestAmt() {
    super(920);
  }

  public EndAccruedInterestAmt(BigDecimal data) {
    super(920, data);
  }

  public EndAccruedInterestAmt(double data) {
    super(920, BigDecimal.valueOf(data));
  }
}
