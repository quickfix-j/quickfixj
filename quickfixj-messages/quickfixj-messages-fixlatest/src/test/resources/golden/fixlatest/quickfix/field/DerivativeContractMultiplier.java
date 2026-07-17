/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeContractMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1266;

  public DerivativeContractMultiplier() {
    super(1266);
  }

  public DerivativeContractMultiplier(BigDecimal data) {
    super(1266, data);
  }

  public DerivativeContractMultiplier(double data) {
    super(1266, BigDecimal.valueOf(data));
  }
}
