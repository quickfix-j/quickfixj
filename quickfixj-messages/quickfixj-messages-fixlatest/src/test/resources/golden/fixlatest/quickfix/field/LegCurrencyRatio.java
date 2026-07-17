/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCurrencyRatio extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1383;

  public LegCurrencyRatio() {
    super(1383);
  }

  public LegCurrencyRatio(BigDecimal data) {
    super(1383, data);
  }

  public LegCurrencyRatio(double data) {
    super(1383, BigDecimal.valueOf(data));
  }
}
