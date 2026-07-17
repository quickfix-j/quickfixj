/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeMinPriceIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1267;

  public DerivativeMinPriceIncrement() {
    super(1267);
  }

  public DerivativeMinPriceIncrement(BigDecimal data) {
    super(1267, data);
  }

  public DerivativeMinPriceIncrement(double data) {
    super(1267, BigDecimal.valueOf(data));
  }
}
