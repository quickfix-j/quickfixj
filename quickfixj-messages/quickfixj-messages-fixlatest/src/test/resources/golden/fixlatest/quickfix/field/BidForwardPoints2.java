/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidForwardPoints2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 642;

  public BidForwardPoints2() {
    super(642);
  }

  public BidForwardPoints2(BigDecimal data) {
    super(642, data);
  }

  public BidForwardPoints2(double data) {
    super(642, BigDecimal.valueOf(data));
  }
}
