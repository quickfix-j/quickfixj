/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegReturnRateFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42532;

  public LegReturnRateFXRate() {
    super(42532);
  }

  public LegReturnRateFXRate(BigDecimal data) {
    super(42532, data);
  }

  public LegReturnRateFXRate(double data) {
    super(42532, BigDecimal.valueOf(data));
  }
}
