/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MarketDisruptionFallbackOpenUnits extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41103;

  public MarketDisruptionFallbackOpenUnits() {
    super(41103);
  }

  public MarketDisruptionFallbackOpenUnits(BigDecimal data) {
    super(41103, data);
  }

  public MarketDisruptionFallbackOpenUnits(double data) {
    super(41103, BigDecimal.valueOf(data));
  }
}
