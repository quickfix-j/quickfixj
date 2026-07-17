/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ProvisionOptionExerciseMaximumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40104;

  public ProvisionOptionExerciseMaximumNotional() {
    super(40104);
  }

  public ProvisionOptionExerciseMaximumNotional(BigDecimal data) {
    super(40104, data);
  }

  public ProvisionOptionExerciseMaximumNotional(double data) {
    super(40104, BigDecimal.valueOf(data));
  }
}
