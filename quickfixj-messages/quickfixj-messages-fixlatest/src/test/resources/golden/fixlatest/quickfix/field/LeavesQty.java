/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LeavesQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 151;

  public LeavesQty() {
    super(151);
  }

  public LeavesQty(BigDecimal data) {
    super(151, data);
  }

  public LeavesQty(double data) {
    super(151, BigDecimal.valueOf(data));
  }
}
