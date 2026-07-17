/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AccumulatedReturnModifiedVariationMargin extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2591;

  public AccumulatedReturnModifiedVariationMargin() {
    super(2591);
  }

  public AccumulatedReturnModifiedVariationMargin(BigDecimal data) {
    super(2591, data);
  }

  public AccumulatedReturnModifiedVariationMargin(double data) {
    super(2591, BigDecimal.valueOf(data));
  }
}
