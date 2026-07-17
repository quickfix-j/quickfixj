/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MarketDisruptionFallbackBasketDivisor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41105;

  public MarketDisruptionFallbackBasketDivisor() {
    super(41105);
  }

  public MarketDisruptionFallbackBasketDivisor(BigDecimal data) {
    super(41105, data);
  }

  public MarketDisruptionFallbackBasketDivisor(double data) {
    super(41105, BigDecimal.valueOf(data));
  }
}
