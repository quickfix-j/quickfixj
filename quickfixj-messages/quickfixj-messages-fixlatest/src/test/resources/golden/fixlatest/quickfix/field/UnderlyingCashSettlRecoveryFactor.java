/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCashSettlRecoveryFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42055;

  public UnderlyingCashSettlRecoveryFactor() {
    super(42055);
  }

  public UnderlyingCashSettlRecoveryFactor(BigDecimal data) {
    super(42055, data);
  }

  public UnderlyingCashSettlRecoveryFactor(double data) {
    super(42055, BigDecimal.valueOf(data));
  }
}
