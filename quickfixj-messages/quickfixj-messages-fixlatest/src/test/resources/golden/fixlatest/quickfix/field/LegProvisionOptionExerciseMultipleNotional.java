/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegProvisionOptionExerciseMultipleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40460;

  public LegProvisionOptionExerciseMultipleNotional() {
    super(40460);
  }

  public LegProvisionOptionExerciseMultipleNotional(BigDecimal data) {
    super(40460, data);
  }

  public LegProvisionOptionExerciseMultipleNotional(double data) {
    super(40460, BigDecimal.valueOf(data));
  }
}
