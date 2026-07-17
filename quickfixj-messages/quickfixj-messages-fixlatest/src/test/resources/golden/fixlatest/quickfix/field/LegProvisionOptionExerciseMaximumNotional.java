/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegProvisionOptionExerciseMaximumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40462;

  public LegProvisionOptionExerciseMaximumNotional() {
    super(40462);
  }

  public LegProvisionOptionExerciseMaximumNotional(BigDecimal data) {
    super(40462, data);
  }

  public LegProvisionOptionExerciseMaximumNotional(double data) {
    super(40462, BigDecimal.valueOf(data));
  }
}
