/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FloatingRateIndexCurveSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2729;

  public FloatingRateIndexCurveSpread() {
    super(2729);
  }

  public FloatingRateIndexCurveSpread(BigDecimal data) {
    super(2729, data);
  }

  public FloatingRateIndexCurveSpread(double data) {
    super(2729, BigDecimal.valueOf(data));
  }
}
