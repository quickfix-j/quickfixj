/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexOptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2223;

  public LegComplexOptPayoutAmount() {
    super(2223);
  }

  public LegComplexOptPayoutAmount(BigDecimal data) {
    super(2223, data);
  }

  public LegComplexOptPayoutAmount(double data) {
    super(2223, BigDecimal.valueOf(data));
  }
}
