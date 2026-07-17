/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegReturnRateCommissionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42537;

  public LegReturnRateCommissionAmount() {
    super(42537);
  }

  public LegReturnRateCommissionAmount(BigDecimal data) {
    super(42537, data);
  }

  public LegReturnRateCommissionAmount(double data) {
    super(42537, BigDecimal.valueOf(data));
  }
}
