/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegBidPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 681;

  public LegBidPx() {
    super(681);
  }

  public LegBidPx(BigDecimal data) {
    super(681, data);
  }

  public LegBidPx(double data) {
    super(681, BigDecimal.valueOf(data));
  }
}
