/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ExpQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 983;

  public ExpQty() {
    super(983);
  }

  public ExpQty(BigDecimal data) {
    super(983, data);
  }

  public ExpQty(double data) {
    super(983, BigDecimal.valueOf(data));
  }
}
