/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendPayoutRatio extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42860;

  public UnderlyingDividendPayoutRatio() {
    super(42860);
  }

  public UnderlyingDividendPayoutRatio(BigDecimal data) {
    super(42860, data);
  }

  public UnderlyingDividendPayoutRatio(double data) {
    super(42860, BigDecimal.valueOf(data));
  }
}
