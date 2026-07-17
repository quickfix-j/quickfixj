/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAutomaticExerciseThresholdRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41814;

  public UnderlyingAutomaticExerciseThresholdRate() {
    super(41814);
  }

  public UnderlyingAutomaticExerciseThresholdRate(BigDecimal data) {
    super(41814, data);
  }

  public UnderlyingAutomaticExerciseThresholdRate(double data) {
    super(41814, BigDecimal.valueOf(data));
  }
}
