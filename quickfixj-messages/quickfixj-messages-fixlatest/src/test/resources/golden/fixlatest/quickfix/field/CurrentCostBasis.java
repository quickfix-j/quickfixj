/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CurrentCostBasis extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1755;

  public CurrentCostBasis() {
    super(1755);
  }

  public CurrentCostBasis(BigDecimal data) {
    super(1755, data);
  }

  public CurrentCostBasis(double data) {
    super(1755, BigDecimal.valueOf(data));
  }
}
