/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 566;

  public LegPrice() {
    super(566);
  }

  public LegPrice(BigDecimal data) {
    super(566, data);
  }

  public LegPrice(double data) {
    super(566, BigDecimal.valueOf(data));
  }
}
