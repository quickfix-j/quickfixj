/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ClearingPriceOffset extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2582;

  public ClearingPriceOffset() {
    super(2582);
  }

  public ClearingPriceOffset(BigDecimal data) {
    super(2582, data);
  }

  public ClearingPriceOffset(double data) {
    super(2582, BigDecimal.valueOf(data));
  }
}
