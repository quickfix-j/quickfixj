/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCurrentCostBasis extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1759;

  public LegCurrentCostBasis() {
    super(1759);
  }

  public LegCurrentCostBasis(BigDecimal data) {
    super(1759, data);
  }

  public LegCurrentCostBasis(double data) {
    super(1759, BigDecimal.valueOf(data));
  }
}
