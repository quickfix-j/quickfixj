/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCashSettlAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42054;

  public UnderlyingCashSettlAmount() {
    super(42054);
  }

  public UnderlyingCashSettlAmount(BigDecimal data) {
    super(42054, data);
  }

  public UnderlyingCashSettlAmount(double data) {
    super(42054, BigDecimal.valueOf(data));
  }
}
