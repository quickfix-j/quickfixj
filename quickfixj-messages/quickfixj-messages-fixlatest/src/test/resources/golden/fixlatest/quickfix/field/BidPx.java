/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 132;

  public BidPx() {
    super(132);
  }

  public BidPx(BigDecimal data) {
    super(132, data);
  }

  public BidPx(double data) {
    super(132, BigDecimal.valueOf(data));
  }
}
