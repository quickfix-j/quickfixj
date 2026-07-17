/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegBidForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1067;

  public LegBidForwardPoints() {
    super(1067);
  }

  public LegBidForwardPoints(BigDecimal data) {
    super(1067, data);
  }

  public LegBidForwardPoints(double data) {
    super(1067, BigDecimal.valueOf(data));
  }
}
