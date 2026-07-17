/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TickIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1208;

  public TickIncrement() {
    super(1208);
  }

  public TickIncrement(BigDecimal data) {
    super(1208, data);
  }

  public TickIncrement(double data) {
    super(1208, BigDecimal.valueOf(data));
  }
}
