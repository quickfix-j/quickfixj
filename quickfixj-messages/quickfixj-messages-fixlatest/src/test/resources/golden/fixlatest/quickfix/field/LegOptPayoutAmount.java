/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegOptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2194;

  public LegOptPayoutAmount() {
    super(2194);
  }

  public LegOptPayoutAmount(BigDecimal data) {
    super(2194, data);
  }

  public LegOptPayoutAmount(double data) {
    super(2194, BigDecimal.valueOf(data));
  }
}
