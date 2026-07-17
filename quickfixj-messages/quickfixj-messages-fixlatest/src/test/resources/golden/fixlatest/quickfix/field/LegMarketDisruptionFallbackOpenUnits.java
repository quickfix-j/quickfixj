/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMarketDisruptionFallbackOpenUnits extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41478;

  public LegMarketDisruptionFallbackOpenUnits() {
    super(41478);
  }

  public LegMarketDisruptionFallbackOpenUnits(BigDecimal data) {
    super(41478, data);
  }

  public LegMarketDisruptionFallbackOpenUnits(double data) {
    super(41478, BigDecimal.valueOf(data));
  }
}
