/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PreviousUnadjustedOpenInterest extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2573;

  public PreviousUnadjustedOpenInterest() {
    super(2573);
  }

  public PreviousUnadjustedOpenInterest(BigDecimal data) {
    super(2573, data);
  }

  public PreviousUnadjustedOpenInterest(double data) {
    super(2573, BigDecimal.valueOf(data));
  }
}
