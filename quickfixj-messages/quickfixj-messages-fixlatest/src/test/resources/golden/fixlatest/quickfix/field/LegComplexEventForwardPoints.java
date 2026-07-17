/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2410;

  public LegComplexEventForwardPoints() {
    super(2410);
  }

  public LegComplexEventForwardPoints(BigDecimal data) {
    super(2410, data);
  }

  public LegComplexEventForwardPoints(double data) {
    super(2410, BigDecimal.valueOf(data));
  }
}
