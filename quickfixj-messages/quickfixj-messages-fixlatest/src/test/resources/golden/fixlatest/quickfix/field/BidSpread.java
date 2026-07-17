/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2533;

  public BidSpread() {
    super(2533);
  }

  public BidSpread(BigDecimal data) {
    super(2533, data);
  }

  public BidSpread(double data) {
    super(2533, BigDecimal.valueOf(data));
  }
}
