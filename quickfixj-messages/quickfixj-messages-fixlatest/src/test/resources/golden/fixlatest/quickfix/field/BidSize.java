/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 134;

  public BidSize() {
    super(134);
  }

  public BidSize(BigDecimal data) {
    super(134, data);
  }

  public BidSize(double data) {
    super(134, BigDecimal.valueOf(data));
  }
}
