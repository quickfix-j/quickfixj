/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCashAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 973;

  public UnderlyingCashAmount() {
    super(973);
  }

  public UnderlyingCashAmount(BigDecimal data) {
    super(973, data);
  }

  public UnderlyingCashAmount(double data) {
    super(973, BigDecimal.valueOf(data));
  }
}
