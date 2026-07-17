/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendFloatingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42804;

  public UnderlyingDividendFloatingRateMultiplier() {
    super(42804);
  }

  public UnderlyingDividendFloatingRateMultiplier(BigDecimal data) {
    super(42804, data);
  }

  public UnderlyingDividendFloatingRateMultiplier(double data) {
    super(42804, BigDecimal.valueOf(data));
  }
}
