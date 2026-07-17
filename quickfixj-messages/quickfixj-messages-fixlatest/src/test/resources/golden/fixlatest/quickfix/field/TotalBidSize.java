/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalBidSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1749;

  public TotalBidSize() {
    super(1749);
  }

  public TotalBidSize(BigDecimal data) {
    super(1749, data);
  }

  public TotalBidSize(double data) {
    super(1749, BigDecimal.valueOf(data));
  }
}
