/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeMinPriceIncrementAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1268;

  public DerivativeMinPriceIncrementAmount() {
    super(1268);
  }

  public DerivativeMinPriceIncrementAmount(BigDecimal data) {
    super(1268, data);
  }

  public DerivativeMinPriceIncrementAmount(double data) {
    super(1268, BigDecimal.valueOf(data));
  }
}
