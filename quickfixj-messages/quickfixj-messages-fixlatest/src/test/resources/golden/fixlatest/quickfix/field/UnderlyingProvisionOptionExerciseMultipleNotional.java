/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingProvisionOptionExerciseMultipleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42160;

  public UnderlyingProvisionOptionExerciseMultipleNotional() {
    super(42160);
  }

  public UnderlyingProvisionOptionExerciseMultipleNotional(BigDecimal data) {
    super(42160, data);
  }

  public UnderlyingProvisionOptionExerciseMultipleNotional(double data) {
    super(42160, BigDecimal.valueOf(data));
  }
}
