/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMarketDisruptionFallbackBasketDivisor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41480;

  public LegMarketDisruptionFallbackBasketDivisor() {
    super(41480);
  }

  public LegMarketDisruptionFallbackBasketDivisor(BigDecimal data) {
    super(41480, data);
  }

  public LegMarketDisruptionFallbackBasketDivisor(double data) {
    super(41480, BigDecimal.valueOf(data));
  }
}
