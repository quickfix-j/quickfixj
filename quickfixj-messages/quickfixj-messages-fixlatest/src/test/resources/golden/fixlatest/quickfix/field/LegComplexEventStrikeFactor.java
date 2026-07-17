/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventStrikeFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2240;

  public LegComplexEventStrikeFactor() {
    super(2240);
  }

  public LegComplexEventStrikeFactor(BigDecimal data) {
    super(2240, data);
  }

  public LegComplexEventStrikeFactor(double data) {
    super(2240, BigDecimal.valueOf(data));
  }
}
