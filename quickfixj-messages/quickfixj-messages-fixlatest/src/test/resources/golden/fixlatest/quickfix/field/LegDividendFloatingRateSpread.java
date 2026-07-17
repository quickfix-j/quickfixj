/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDividendFloatingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42316;

  public LegDividendFloatingRateSpread() {
    super(42316);
  }

  public LegDividendFloatingRateSpread(BigDecimal data) {
    super(42316, data);
  }

  public LegDividendFloatingRateSpread(double data) {
    super(42316, BigDecimal.valueOf(data));
  }
}
