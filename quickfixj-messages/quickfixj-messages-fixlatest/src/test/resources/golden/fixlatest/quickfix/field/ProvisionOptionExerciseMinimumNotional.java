/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ProvisionOptionExerciseMinimumNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40103;

  public ProvisionOptionExerciseMinimumNotional() {
    super(40103);
  }

  public ProvisionOptionExerciseMinimumNotional(BigDecimal data) {
    super(40103, data);
  }

  public ProvisionOptionExerciseMinimumNotional(double data) {
    super(40103, BigDecimal.valueOf(data));
  }
}
