/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlPriceIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1830;

  public SettlPriceIncrement() {
    super(1830);
  }

  public SettlPriceIncrement(BigDecimal data) {
    super(1830, data);
  }

  public SettlPriceIncrement(double data) {
    super(1830, BigDecimal.valueOf(data));
  }
}
