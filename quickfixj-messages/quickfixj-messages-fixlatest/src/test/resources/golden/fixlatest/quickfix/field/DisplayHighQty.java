/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DisplayHighQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1086;

  public DisplayHighQty() {
    super(1086);
  }

  public DisplayHighQty(BigDecimal data) {
    super(1086, data);
  }

  public DisplayHighQty(double data) {
    super(1086, BigDecimal.valueOf(data));
  }
}
