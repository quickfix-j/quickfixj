/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashSettlRecoveryFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40035;

  public CashSettlRecoveryFactor() {
    super(40035);
  }

  public CashSettlRecoveryFactor(BigDecimal data) {
    super(40035, data);
  }

  public CashSettlRecoveryFactor(double data) {
    super(40035, BigDecimal.valueOf(data));
  }
}
