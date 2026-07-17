/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MarginAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1645;

  public MarginAmt() {
    super(1645);
  }

  public MarginAmt(BigDecimal data) {
    super(1645, data);
  }

  public MarginAmt(double data) {
    super(1645, BigDecimal.valueOf(data));
  }
}
