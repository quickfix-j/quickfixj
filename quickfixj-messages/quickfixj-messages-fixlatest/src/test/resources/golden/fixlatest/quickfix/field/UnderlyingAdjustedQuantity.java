/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAdjustedQuantity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1044;

  public UnderlyingAdjustedQuantity() {
    super(1044);
  }

  public UnderlyingAdjustedQuantity(BigDecimal data) {
    super(1044, data);
  }

  public UnderlyingAdjustedQuantity(double data) {
    super(1044, BigDecimal.valueOf(data));
  }
}
