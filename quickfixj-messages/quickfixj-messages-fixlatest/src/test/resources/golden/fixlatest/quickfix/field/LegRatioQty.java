/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegRatioQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 623;

  public LegRatioQty() {
    super(623);
  }

  public LegRatioQty(BigDecimal data) {
    super(623, data);
  }

  public LegRatioQty(double data) {
    super(623, BigDecimal.valueOf(data));
  }
}
