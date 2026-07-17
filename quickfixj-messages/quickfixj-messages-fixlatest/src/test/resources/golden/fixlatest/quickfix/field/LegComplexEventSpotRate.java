/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2409;

  public LegComplexEventSpotRate() {
    super(2409);
  }

  public LegComplexEventSpotRate(BigDecimal data) {
    super(2409, data);
  }

  public LegComplexEventSpotRate(double data) {
    super(2409, BigDecimal.valueOf(data));
  }
}
