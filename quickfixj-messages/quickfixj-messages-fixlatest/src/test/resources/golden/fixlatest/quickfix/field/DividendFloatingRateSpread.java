/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DividendFloatingRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42222;

  public DividendFloatingRateSpread() {
    super(42222);
  }

  public DividendFloatingRateSpread(BigDecimal data) {
    super(42222, data);
  }

  public DividendFloatingRateSpread(double data) {
    super(42222, BigDecimal.valueOf(data));
  }
}
