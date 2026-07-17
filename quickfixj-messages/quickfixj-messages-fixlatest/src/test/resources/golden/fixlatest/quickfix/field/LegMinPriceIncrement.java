/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMinPriceIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2190;

  public LegMinPriceIncrement() {
    super(2190);
  }

  public LegMinPriceIncrement(BigDecimal data) {
    super(2190, data);
  }

  public LegMinPriceIncrement(double data) {
    super(2190, BigDecimal.valueOf(data));
  }
}
