/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ProvisionOptionExerciseMultipleNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40102;

  public ProvisionOptionExerciseMultipleNotional() {
    super(40102);
  }

  public ProvisionOptionExerciseMultipleNotional(BigDecimal data) {
    super(40102, data);
  }

  public ProvisionOptionExerciseMultipleNotional(double data) {
    super(40102, BigDecimal.valueOf(data));
  }
}
