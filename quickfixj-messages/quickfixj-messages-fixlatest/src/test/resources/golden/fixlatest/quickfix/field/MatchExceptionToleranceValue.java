/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MatchExceptionToleranceValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2778;

  public MatchExceptionToleranceValue() {
    super(2778);
  }

  public MatchExceptionToleranceValue(BigDecimal data) {
    super(2778, data);
  }

  public MatchExceptionToleranceValue(double data) {
    super(2778, BigDecimal.valueOf(data));
  }
}
