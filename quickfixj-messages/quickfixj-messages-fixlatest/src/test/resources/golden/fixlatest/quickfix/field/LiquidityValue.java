/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LiquidityValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 404;

  public LiquidityValue() {
    super(404);
  }

  public LiquidityValue(BigDecimal data) {
    super(404, data);
  }

  public LiquidityValue(double data) {
    super(404, BigDecimal.valueOf(data));
  }
}
