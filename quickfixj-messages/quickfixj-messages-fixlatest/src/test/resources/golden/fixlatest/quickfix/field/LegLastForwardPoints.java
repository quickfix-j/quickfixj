/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegLastForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1073;

  public LegLastForwardPoints() {
    super(1073);
  }

  public LegLastForwardPoints(BigDecimal data) {
    super(1073, data);
  }

  public LegLastForwardPoints(double data) {
    super(1073, BigDecimal.valueOf(data));
  }
}
