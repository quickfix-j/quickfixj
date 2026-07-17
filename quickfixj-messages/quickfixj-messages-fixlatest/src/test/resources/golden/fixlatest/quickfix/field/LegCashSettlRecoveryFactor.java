/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCashSettlRecoveryFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41358;

  public LegCashSettlRecoveryFactor() {
    super(41358);
  }

  public LegCashSettlRecoveryFactor(BigDecimal data) {
    super(41358, data);
  }

  public LegCashSettlRecoveryFactor(double data) {
    super(41358, BigDecimal.valueOf(data));
  }
}
