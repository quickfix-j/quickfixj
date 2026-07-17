/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AutomaticExerciseThresholdRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41110;

  public AutomaticExerciseThresholdRate() {
    super(41110);
  }

  public AutomaticExerciseThresholdRate(BigDecimal data) {
    super(41110, data);
  }

  public AutomaticExerciseThresholdRate(double data) {
    super(41110, BigDecimal.valueOf(data));
  }
}
