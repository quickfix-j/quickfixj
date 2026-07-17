/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlPriceSecondaryIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1831;

  public SettlPriceSecondaryIncrement() {
    super(1831);
  }

  public SettlPriceSecondaryIncrement(BigDecimal data) {
    super(1831, data);
  }

  public SettlPriceSecondaryIncrement(double data) {
    super(1831, BigDecimal.valueOf(data));
  }
}
