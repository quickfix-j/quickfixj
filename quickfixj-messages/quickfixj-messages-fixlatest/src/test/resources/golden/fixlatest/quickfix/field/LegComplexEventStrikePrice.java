/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2239;

  public LegComplexEventStrikePrice() {
    super(2239);
  }

  public LegComplexEventStrikePrice(BigDecimal data) {
    super(2239, data);
  }

  public LegComplexEventStrikePrice(double data) {
    super(2239, BigDecimal.valueOf(data));
  }
}
