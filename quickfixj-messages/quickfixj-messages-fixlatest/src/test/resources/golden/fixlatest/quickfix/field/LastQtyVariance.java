/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastQtyVariance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1828;

  public LastQtyVariance() {
    super(1828);
  }

  public LastQtyVariance(BigDecimal data) {
    super(1828, data);
  }

  public LastQtyVariance(double data) {
    super(1828, BigDecimal.valueOf(data));
  }
}
