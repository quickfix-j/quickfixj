/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AvgForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2794;

  public AvgForwardPoints() {
    super(2794);
  }

  public AvgForwardPoints(BigDecimal data) {
    super(2794, data);
  }

  public AvgForwardPoints(double data) {
    super(2794, BigDecimal.valueOf(data));
  }
}
