/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingBasketDivisor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2630;

  public UnderlyingBasketDivisor() {
    super(2630);
  }

  public UnderlyingBasketDivisor(BigDecimal data) {
    super(2630, data);
  }

  public UnderlyingBasketDivisor(double data) {
    super(2630, BigDecimal.valueOf(data));
  }
}
