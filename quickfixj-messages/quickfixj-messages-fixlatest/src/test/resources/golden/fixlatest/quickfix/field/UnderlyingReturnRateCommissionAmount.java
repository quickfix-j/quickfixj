/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingReturnRateCommissionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43037;

  public UnderlyingReturnRateCommissionAmount() {
    super(43037);
  }

  public UnderlyingReturnRateCommissionAmount(BigDecimal data) {
    super(43037, data);
  }

  public UnderlyingReturnRateCommissionAmount(double data) {
    super(43037, BigDecimal.valueOf(data));
  }
}
