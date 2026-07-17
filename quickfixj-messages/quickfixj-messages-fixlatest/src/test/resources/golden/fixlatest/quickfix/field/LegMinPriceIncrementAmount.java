/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMinPriceIncrementAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2191;

  public LegMinPriceIncrementAmount() {
    super(2191);
  }

  public LegMinPriceIncrementAmount(BigDecimal data) {
    super(2191, data);
  }

  public LegMinPriceIncrementAmount(double data) {
    super(2191, BigDecimal.valueOf(data));
  }
}
