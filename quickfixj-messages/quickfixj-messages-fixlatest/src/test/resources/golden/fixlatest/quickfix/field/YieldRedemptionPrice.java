/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class YieldRedemptionPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 697;

  public YieldRedemptionPrice() {
    super(697);
  }

  public YieldRedemptionPrice(BigDecimal data) {
    super(697, data);
  }

  public YieldRedemptionPrice(double data) {
    super(697, BigDecimal.valueOf(data));
  }
}
