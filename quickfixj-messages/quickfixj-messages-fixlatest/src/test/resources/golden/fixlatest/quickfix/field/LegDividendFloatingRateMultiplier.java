/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDividendFloatingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42315;

  public LegDividendFloatingRateMultiplier() {
    super(42315);
  }

  public LegDividendFloatingRateMultiplier(BigDecimal data) {
    super(42315, data);
  }

  public LegDividendFloatingRateMultiplier(double data) {
    super(42315, BigDecimal.valueOf(data));
  }
}
