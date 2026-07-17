/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendFloatingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42805;

  public UnderlyingDividendFloatingRateSpread() {
    super(42805);
  }

  public UnderlyingDividendFloatingRateSpread(BigDecimal data) {
    super(42805, data);
  }

  public UnderlyingDividendFloatingRateSpread(double data) {
    super(42805, BigDecimal.valueOf(data));
  }
}
