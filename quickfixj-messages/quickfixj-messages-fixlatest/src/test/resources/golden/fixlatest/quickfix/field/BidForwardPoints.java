/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 189;

  public BidForwardPoints() {
    super(189);
  }

  public BidForwardPoints(BigDecimal data) {
    super(189, data);
  }

  public BidForwardPoints(double data) {
    super(189, BigDecimal.valueOf(data));
  }
}
