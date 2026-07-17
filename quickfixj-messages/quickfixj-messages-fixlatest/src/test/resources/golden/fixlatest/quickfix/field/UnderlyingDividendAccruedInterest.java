/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDividendAccruedInterest extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42859;

  public UnderlyingDividendAccruedInterest() {
    super(42859);
  }

  public UnderlyingDividendAccruedInterest(BigDecimal data) {
    super(42859, data);
  }

  public UnderlyingDividendAccruedInterest(double data) {
    super(42859, BigDecimal.valueOf(data));
  }
}
