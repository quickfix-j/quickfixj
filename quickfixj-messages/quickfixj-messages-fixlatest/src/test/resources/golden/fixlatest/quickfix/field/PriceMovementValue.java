/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceMovementValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1921;

  public PriceMovementValue() {
    super(1921);
  }

  public PriceMovementValue(BigDecimal data) {
    super(1921, data);
  }

  public PriceMovementValue(double data) {
    super(1921, BigDecimal.valueOf(data));
  }
}
