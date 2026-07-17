/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DisplayLowQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1085;

  public DisplayLowQty() {
    super(1085);
  }

  public DisplayLowQty(BigDecimal data) {
    super(1085, data);
  }

  public DisplayLowQty(double data) {
    super(1085, BigDecimal.valueOf(data));
  }
}
