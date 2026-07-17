/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingProvisionOptionExerciseMaximumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42162;

  public UnderlyingProvisionOptionExerciseMaximumNotional() {
    super(42162);
  }

  public UnderlyingProvisionOptionExerciseMaximumNotional(BigDecimal data) {
    super(42162, data);
  }

  public UnderlyingProvisionOptionExerciseMaximumNotional(double data) {
    super(42162, BigDecimal.valueOf(data));
  }
}
