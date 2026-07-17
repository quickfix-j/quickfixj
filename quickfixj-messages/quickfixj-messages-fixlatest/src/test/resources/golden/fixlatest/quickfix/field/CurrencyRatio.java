/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CurrencyRatio extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1382;

  public CurrencyRatio() {
    super(1382);
  }

  public CurrencyRatio(BigDecimal data) {
    super(1382, data);
  }

  public CurrencyRatio(double data) {
    super(1382, BigDecimal.valueOf(data));
  }
}
