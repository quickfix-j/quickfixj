/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CcyAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1157;

  public CcyAmt() {
    super(1157);
  }

  public CcyAmt(BigDecimal data) {
    super(1157, data);
  }

  public CcyAmt(double data) {
    super(1157, BigDecimal.valueOf(data));
  }
}
