/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PreviousAdjustedOpenInterest extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2572;

  public PreviousAdjustedOpenInterest() {
    super(2572);
  }

  public PreviousAdjustedOpenInterest(BigDecimal data) {
    super(2572, data);
  }

  public PreviousAdjustedOpenInterest(double data) {
    super(2572, BigDecimal.valueOf(data));
  }
}
