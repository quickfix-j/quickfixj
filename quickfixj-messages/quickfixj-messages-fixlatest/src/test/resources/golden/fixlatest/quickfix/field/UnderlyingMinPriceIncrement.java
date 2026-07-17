/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMinPriceIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2026;

  public UnderlyingMinPriceIncrement() {
    super(2026);
  }

  public UnderlyingMinPriceIncrement(BigDecimal data) {
    super(2026, data);
  }

  public UnderlyingMinPriceIncrement(double data) {
    super(2026, BigDecimal.valueOf(data));
  }
}
