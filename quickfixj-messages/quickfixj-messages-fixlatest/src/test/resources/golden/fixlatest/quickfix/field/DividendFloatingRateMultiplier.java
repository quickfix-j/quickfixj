/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DividendFloatingRateMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42221;

  public DividendFloatingRateMultiplier() {
    super(42221);
  }

  public DividendFloatingRateMultiplier(BigDecimal data) {
    super(42221, data);
  }

  public DividendFloatingRateMultiplier(double data) {
    super(42221, BigDecimal.valueOf(data));
  }
}
