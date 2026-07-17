/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingOpenUnits extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2629;

  public UnderlyingOpenUnits() {
    super(2629);
  }

  public UnderlyingOpenUnits(BigDecimal data) {
    super(2629, data);
  }

  public UnderlyingOpenUnits(double data) {
    super(2629, BigDecimal.valueOf(data));
  }
}
