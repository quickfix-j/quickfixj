/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LimitUtilizationAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2394;

  public LimitUtilizationAmt() {
    super(2394);
  }

  public LimitUtilizationAmt(BigDecimal data) {
    super(2394, data);
  }

  public LimitUtilizationAmt(double data) {
    super(2394, BigDecimal.valueOf(data));
  }
}
