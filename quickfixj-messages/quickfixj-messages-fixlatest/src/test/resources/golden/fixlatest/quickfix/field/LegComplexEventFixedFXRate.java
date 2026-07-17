/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventFixedFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2236;

  public LegComplexEventFixedFXRate() {
    super(2236);
  }

  public LegComplexEventFixedFXRate(BigDecimal data) {
    super(2236, data);
  }

  public LegComplexEventFixedFXRate(double data) {
    super(2236, BigDecimal.valueOf(data));
  }
}
