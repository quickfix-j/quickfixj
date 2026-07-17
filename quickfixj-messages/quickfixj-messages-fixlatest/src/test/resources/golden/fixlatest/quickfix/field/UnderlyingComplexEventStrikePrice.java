/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2274;

  public UnderlyingComplexEventStrikePrice() {
    super(2274);
  }

  public UnderlyingComplexEventStrikePrice(BigDecimal data) {
    super(2274, data);
  }

  public UnderlyingComplexEventStrikePrice(double data) {
    super(2274, BigDecimal.valueOf(data));
  }
}
