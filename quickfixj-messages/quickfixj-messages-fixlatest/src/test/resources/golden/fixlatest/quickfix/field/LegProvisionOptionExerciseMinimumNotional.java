/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegProvisionOptionExerciseMinimumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40461;

  public LegProvisionOptionExerciseMinimumNotional() {
    super(40461);
  }

  public LegProvisionOptionExerciseMinimumNotional(BigDecimal data) {
    super(40461, data);
  }

  public LegProvisionOptionExerciseMinimumNotional(double data) {
    super(40461, BigDecimal.valueOf(data));
  }
}
