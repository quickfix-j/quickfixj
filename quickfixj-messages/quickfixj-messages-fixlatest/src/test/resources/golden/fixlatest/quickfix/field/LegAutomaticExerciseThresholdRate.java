/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegAutomaticExerciseThresholdRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41485;

  public LegAutomaticExerciseThresholdRate() {
    super(41485);
  }

  public LegAutomaticExerciseThresholdRate(BigDecimal data) {
    super(41485, data);
  }

  public LegAutomaticExerciseThresholdRate(double data) {
    super(41485, BigDecimal.valueOf(data));
  }
}
