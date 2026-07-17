/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMarketDisruptionFallbackOpenUnits extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41875;

  public UnderlyingMarketDisruptionFallbackOpenUnits() {
    super(41875);
  }

  public UnderlyingMarketDisruptionFallbackOpenUnits(BigDecimal data) {
    super(41875, data);
  }

  public UnderlyingMarketDisruptionFallbackOpenUnits(double data) {
    super(41875, BigDecimal.valueOf(data));
  }
}
