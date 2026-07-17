/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DayOrderQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 424;

  public DayOrderQty() {
    super(424);
  }

  public DayOrderQty(BigDecimal data) {
    super(424, data);
  }

  public DayOrderQty(double data) {
    super(424, BigDecimal.valueOf(data));
  }
}
