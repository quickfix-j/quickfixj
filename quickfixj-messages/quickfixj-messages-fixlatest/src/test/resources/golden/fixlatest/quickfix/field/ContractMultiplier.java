/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ContractMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 231;

  public ContractMultiplier() {
    super(231);
  }

  public ContractMultiplier(BigDecimal data) {
    super(231, data);
  }

  public ContractMultiplier(double data) {
    super(231, BigDecimal.valueOf(data));
  }
}
