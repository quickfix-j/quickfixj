/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMarketDisruptionFallbackBasketDivisor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41877;

  public UnderlyingMarketDisruptionFallbackBasketDivisor() {
    super(41877);
  }

  public UnderlyingMarketDisruptionFallbackBasketDivisor(BigDecimal data) {
    super(41877, data);
  }

  public UnderlyingMarketDisruptionFallbackBasketDivisor(double data) {
    super(41877, BigDecimal.valueOf(data));
  }
}
