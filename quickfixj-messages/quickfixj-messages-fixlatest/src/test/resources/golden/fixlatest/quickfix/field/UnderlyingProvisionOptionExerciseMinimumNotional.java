/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingProvisionOptionExerciseMinimumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42161;

  public UnderlyingProvisionOptionExerciseMinimumNotional() {
    super(42161);
  }

  public UnderlyingProvisionOptionExerciseMinimumNotional(BigDecimal data) {
    super(42161, data);
  }

  public UnderlyingProvisionOptionExerciseMinimumNotional(double data) {
    super(42161, BigDecimal.valueOf(data));
  }
}
