/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidSwapPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1065;

  public BidSwapPoints() {
    super(1065);
  }

  public BidSwapPoints(BigDecimal data) {
    super(1065, data);
  }

  public BidSwapPoints(double data) {
    super(1065, BigDecimal.valueOf(data));
  }
}
